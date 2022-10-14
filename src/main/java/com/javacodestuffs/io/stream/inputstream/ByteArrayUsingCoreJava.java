package com.javacodestuffs.io.stream.inputstream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayUsingCoreJava {
	public static byte[] toByteArray(InputStream in) throws IOException {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		byte[] buffer = new byte[1024];
		int len;

		while ((len = in.read(buffer)) != -1) {
			outputStream.write(buffer, 0, len);
		}

		return outputStream.toByteArray();
	}

	public static void main(String[] args) throws IOException {

		InputStream inputStream = new ByteArrayInputStream(
				"Hello World!!! Welcome to java programming !!!".getBytes(StandardCharsets.UTF_8));

		byte[] bytes = toByteArray(inputStream);
		System.out.println("the converted bytes are: ");
		System.out.println(new String(bytes));
	}
}