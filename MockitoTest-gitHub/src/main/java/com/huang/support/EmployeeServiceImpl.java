package com.huang.support;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public int save(Employee employee) {
        System.out.println("save-employeeService");
        this.employeeDao.save(employee);
        return 1;
    }
}
