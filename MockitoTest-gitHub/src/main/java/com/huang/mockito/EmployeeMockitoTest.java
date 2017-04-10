package com.huang.mockito;

import com.huang.support.AbstractEmployeeDao;
import com.huang.support.Employee;
import com.huang.support.EmployeeDao;
import com.huang.support.EmployeeDaoImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

/**
 * Created by Administrator on 2017/4/10 0010.
 */
public class EmployeeMockitoTest {

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 有接口的 mock 测试；
     * 1,默认实现接口所有的方法，并给出默认返回；
     */
    @Test
    public void mockOfInterfaceTest() {
        EmployeeDao mockEmployeeDao = mock(EmployeeDao.class);

        //给出 int 的默认值 0 ；
        int save = mockEmployeeDao.save(new Employee());
        Assert.assertEquals(0, save);

        //返回值是对象 Employee ，给出对象的默认值 null ；
        Employee update = mockEmployeeDao.update(new Employee());
        Assert.assertNull(update);
    }

    /**
     * 直接 mock 一个实现类，而非接口；
     * 1,当 mock 对象是一个实现类，而非接口的时候，mockito框架还是直接重写所有的公有方法，返回默认值；
     */
    @Test
    public void mockOfImplementClass() {

        EmployeeDaoImpl mock = mock(EmployeeDaoImpl.class);

        int save = mock.save(new Employee());
        Assert.assertEquals(0, save);

        Employee update = mock.update(new Employee());
        Assert.assertNull(update);
    }

    /**
     * mock 一个抽象对象；
     * 1，抽象对象也是可以 mock 的，并且，里面的抽象方法，和以实现方法，都会被重写，并返回默认值；
     */
    @Test
    public void mockAbstractClass(){
        AbstractEmployeeDao mock = mock(AbstractEmployeeDao.class);

        int save = mock.save(new Employee());
        Assert.assertEquals(0, save);

        Employee update = mock.update(new Employee());
        Assert.assertNull(update);
    }
}
