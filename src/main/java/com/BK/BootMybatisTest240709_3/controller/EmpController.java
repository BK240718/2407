package com.BK.BootMybatisTest240709_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BK.BootMybatisTest240709_3.model.Emp;
import com.BK.BootMybatisTest240709_3.service.EmpService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@Slf4j
public class EmpController {
    private final EmpService es;

    @RequestMapping(value = "listEmp")
    public String empList(Emp emp, @RequestParam(value = "currentPage", required = false) String currentPage, Model model) {
        System.out.println("EmpController Start listEmp");
        // Emp 전체 Cnt 14
        int totalEmp = es.totalEmp();

        model.addAttribute("totalEmp", totalEmp);

        return "list";
    }
}
