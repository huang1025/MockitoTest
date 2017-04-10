package com.huang.support;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public interface EmployeeDao {
    int save(Employee employee);

    Employee update(Employee employee);
}
