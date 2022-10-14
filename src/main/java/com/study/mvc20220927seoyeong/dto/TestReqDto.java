package com.study.mvc20220927seoyeong.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TestReqDto {
    private String strData;
    private String name;
    private int number;
}
