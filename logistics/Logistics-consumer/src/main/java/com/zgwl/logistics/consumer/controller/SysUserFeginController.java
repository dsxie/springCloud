package com.zgwl.logistics.consumer.controller;

import com.zgwl.logistics.common.http.HttpResult;
import com.zgwl.logistics.common.page.PageRequest;
import com.zgwl.logistics.consumer.service.SysUserFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class SysUserFeginController {

    @Autowired
    private SysUserFeginService userService;


    @PostMapping  (value = "/findPage")
    public HttpResult findPage(PageRequest pageRequest) {
        return userService.findPage(pageRequest);
    }


}
