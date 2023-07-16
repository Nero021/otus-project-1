package ru.otus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.dto.BaseResponse;

@RestController
public class BaseController {

    @GetMapping("/health")
    public ResponseEntity<BaseResponse> health() {
        return ResponseEntity.ok(new BaseResponse());
    }

}
