package com.huang.support;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class EmployeeDaoImpl implements EmployeeDao {
    public int save(Employee employee) {
        System.out.println("save-employeeDa0");
        return 1;
    }

    public Employee update(Employee employee) {
        System.out.println("update-employeeDao");
        return new Employee();
    }
}
