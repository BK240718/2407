package com.BK.BootMybatisTest240709_3.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmpDaoImpl implements EmpDao {

    // Mybatis DB 연동
    private final SqlSession session;

    @Override
    public int totalEmp() {
        int totEmpCount = 0;
        System.out.println("EmpDaoImpl Start total");

        try {
            totEmpCount = session.selectOne("empTotal");
            System.out.println("EmpDaoImpl totalEmp totEmpCount -> " +totEmpCount);
        } catch (Exception e) {
            System.out.println("EmpDaoImpl totalEmp Exception -> " +e.getMessage());
        }
        return totEmpCount;
    }

}
