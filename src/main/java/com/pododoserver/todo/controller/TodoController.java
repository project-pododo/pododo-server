package com.pododoserver.todo.controller;

import com.pododoserver.common.BaseController;
import com.pododoserver.common.constant.BaseMsg;
import com.pododoserver.todo.dto.TestDTO;
import com.pododoserver.todo.service.TodoService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/todo")
public class TodoController extends BaseController {

    private final TodoService todoService;

    // todo swagger
    @GetMapping("/test")
    public ResponseEntity<?> getItemListBySeller(HttpSession session,
                                                 WebRequest webReq) {
        log.info("test");
        return getResOK(webReq, BaseMsg.SUCCESS_OK,
                TestDTO.builder()
                .id(0L)
                .name("test").build());
    }

}
