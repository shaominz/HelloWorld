package com.shaominz;

public class HelloWorld {
	public static void main(String[] args) {
		final String msg = "Hello world!";
		System.out.println(msg);
		msg.chars().forEach(System.out::println);
	}
}
