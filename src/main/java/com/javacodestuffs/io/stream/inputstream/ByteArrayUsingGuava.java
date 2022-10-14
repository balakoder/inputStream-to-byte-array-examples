package com.javacodestuffs.io.stream.inputstream;

import com.google.common.io.ByteStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayUsingGuava {
	public static byte[] toByteArray(InputStream in) throws IOException {

		byte[] bytes = ByteStreams.toByteArray(in);
		return bytes;
	}

	public static void main(String[] args) throws IOException {
		InputStream in = new ByteArrayInputStream(
				"Hello World!!! Welcome to java programming !!!".getBytes(StandardCharsets.UTF_8));

		byte[] bytes = toByteArray(in);
		System.out.println("the converted bytes are: ");
		System.out.println(new String(bytes));
	}
}