package com.BK.BootMybatisTest240709_3.service;

import com.BK.BootMybatisTest240709_3.dao.EmpDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService {

    private final EmpDao ed;

    @Override
    public int totalEmp() {
        System.out.println("EmpServiceImpl Start total");
        int totEmpCnt = ed.totalEmp();
        System.out.println("EmpDaoImpl totalEmp totEmpCnt -> " +totEmpCnt);
        return totEmpCnt;
    }
}
