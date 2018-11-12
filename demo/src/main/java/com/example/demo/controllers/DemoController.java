package com.example.demo.controllers;

import org.zoomdev.zoom.web.annotations.Controller;
import org.zoomdev.zoom.web.annotations.JsonResponse;
import org.zoomdev.zoom.web.annotations.Mapping;

@JsonResponse
@Controller(key = "/")
public class DemoController {


    @Mapping("")
    public String index(){
        return "Hello world!";
    }
}
