package com.javacodestuffs.io.stream.inputstream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ByteArrayUsingJava8 {
	public static void main(String[] args) throws IOException {
		InputStream in = new ByteArrayInputStream(
				"Hello World!!! Welcome to java programming !!!".getBytes(StandardCharsets.UTF_8));
		byte[] bytes = getBytes(in);
		System.out.println("the converted bytes are: ");
		System.out.println(new String(bytes));
	}

	private static byte[] getBytes(InputStream inputStream) throws IOException {
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream))) {
			return buffer.lines().collect(Collectors.joining("\n")).getBytes(StandardCharsets.UTF_8);
		}
	}

}