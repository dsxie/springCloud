package com.zgwl.logistics.consumer.service;


import com.zgwl.logistics.common.http.HttpResult;
import com.zgwl.logistics.common.page.PageRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 服务调用示例
 */
@FeignClient(value = "Logistics-admin",url = "http://127.0.0.1:8001")
public interface SysUserFeginService {

    @RequestMapping(value = "/user/findPage",method = RequestMethod.POST)
    HttpResult findPage(@RequestBody PageRequest pageRequest);

}
