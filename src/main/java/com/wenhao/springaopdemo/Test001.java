package com.wenhao.springaopdemo;

import com.wenhao.springaopdemo.execution.impl.DefaultMethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;
import com.wenhao.springaopdemo.interceptor.impl.AfterMethodInterceptor;
import com.wenhao.springaopdemo.interceptor.impl.AroundMethodInterceptor;
import com.wenhao.springaopdemo.interceptor.impl.BeforeMethodInterceptor;
import com.wenhao.springaopdemo.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test001 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<MethodInterceptor> list = new ArrayList<>();
        list.add(new BeforeMethodInterceptor());
        list.add(new AfterMethodInterceptor());
        list.add(new AroundMethodInterceptor());
        UserService userService = new UserService();
        Method login = userService.getClass().getMethod("login");
        DefaultMethodInvocation methodExecution = new DefaultMethodInvocation(list, userService, login, null);
        methodExecution.process();
    }
}
