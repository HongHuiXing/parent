package cn.china.feign.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface MyInterface {
    @RequestMapping("/hello")
    public String hello();


    @RequestMapping(value = "selectById",produces = "application/json;charset=utf-8")
    public String selectById(@RequestParam("id") Integer id);

}
