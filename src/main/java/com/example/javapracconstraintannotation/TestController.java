package com.example.javapracconstraintannotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class TestController {

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void sendDummy(@RequestBody @Valid DummyRequest dummyRequest) {
        log.info("호출 성공");
        log.info(dummyRequest.toString());
    }
}
