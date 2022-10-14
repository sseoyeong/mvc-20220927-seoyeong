package com.study.mvc20220927seoyeong.controller;

import com.study.mvc20220927seoyeong.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @GetMapping("/test")
    public String test1(Model model) {
        model.addAttribute("name", "이서영");
        return "test_page1";
    }

    @GetMapping("/test2")
   public ModelAndView test2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("test1data", "이서영");
        modelAndView.setViewName("test/test_page2");

        return modelAndView;
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data", strData);
        model.addAttribute("name", name);

        return "test/test_page3";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("data", testReqDto.getName());
        model.addAttribute("data", testReqDto.getNumber());

        return "test/test_page4";
    }
}
