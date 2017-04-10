package com.huang.support;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public abstract class AbstractEmployeeDao {
    public abstract int save(Employee employee);

    public Employee update(Employee employee) {
        System.out.println("update-abstractEmployeeDao");
        return employee;
    }
}
