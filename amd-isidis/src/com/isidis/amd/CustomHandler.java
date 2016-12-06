package com.isidis.amd;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Random;

public class CustomHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Invocation");
		return new Random().nextInt();
	}

}
