package com.study.mvc20220927seoyeong.controller.api;

import com.study.mvc20220927seoyeong.dto.UserReqDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class UserTestApi {

    @ResponseBody
    @PostMapping("/api/test/user/dto")
    public String addUserDto(UserReqDto userReqDto) {
//        Map<String, String> map = new HashMap<String, String>();
//
//        map.put("username", userReqDto.getUsername());
//        map.put("password", userReqDto.getPassword());
//        map.put("name", userReqDto.getName());
//        map.put("email", userReqDto.getEmail());
//
//        System.out.println("map: " + map.toString());

        return userReqDto.toString();
    }

    @ResponseBody
    @PostMapping("/api/test/user/json")
    public Object addUserJson(@RequestBody UserReqDto userReqDto) {
        List<Map<Integer, UserReqDto>> list = new ArrayList<Map<Integer, UserReqDto>>();

        Map<Integer, UserReqDto> map = null;

        for(int i = 0; i < 100; i++) {
            if(i == 0 || i % 10 == 0) {
                map = new TreeMap<Integer, UserReqDto>();
            }
            map.put(i + 1, userReqDto);

            if((i - 9) % 10 == 0) {
                list.add(map);
            }
        }
        return list;
    }


}
