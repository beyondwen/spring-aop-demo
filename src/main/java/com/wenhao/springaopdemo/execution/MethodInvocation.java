package com.wenhao.springaopdemo.execution;

import java.lang.reflect.InvocationTargetException;

public interface MethodInvocation {

    //执行方法
    void process() throws InvocationTargetException, IllegalAccessException;
}
