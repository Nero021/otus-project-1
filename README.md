## Описание

Простой проект, который демонстрирует работу Docker

Сервис состоит из одного endpoint `/health` и запускается на порту `8000`

```
http://localhost:8000/health
```

## Локальная сборка и запуск приложения
```
./gradlew clean build
./gradlew bootRun
```

## Сборка Docker
```
docker build --platform linux/amd64 -t otus-project-1 .
```

## Запуск Docker
```
docker run -d --name project-1 -p 8000:8000 otus-project-1
```
