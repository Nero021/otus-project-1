package ru.otus.dto;

import ru.otus.enums.Status;

public record BaseResponse(Status status) {
    public BaseResponse() {
        this(Status.OK);
    }
}
