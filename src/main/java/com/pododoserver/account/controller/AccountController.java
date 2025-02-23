package com.pododoserver.account.controller;

import com.pododoserver.account.service.AccountService;
import com.pododoserver.common.BaseController;
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
@RequestMapping("/api/v1/account")
public class AccountController extends BaseController {

    private final AccountService accountService;

    @GetMapping("/test")
    public ResponseEntity<?> getAccount(HttpSession session,
                                        WebRequest webReq) {

        accountService.getAccountInfoById();
        return getResOK(webReq, null);
    }
}
