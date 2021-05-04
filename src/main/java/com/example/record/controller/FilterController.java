package com.example.record.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rui.zhou
 * @date 2021/05/03 20:03
 */
@RestController
@RequestMapping("/filter")
public class FilterController {

    @RequestMapping("test")
    public String test(){

        return "this is filter test!";
    }
}
