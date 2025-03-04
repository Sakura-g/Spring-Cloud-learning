package com.test.springcloud.demo.util.response;

import lombok.Data;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@ResponseBody
public @interface AjaxResponseBody {

}