package com.javacodestuffs.io.stream.inputstream;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayUsingApacheIO {
	public static void main(String[] args) throws IOException {
		InputStream in = new ByteArrayInputStream(
				"Hello World!!! Welcome to java programming !!!".getBytes(StandardCharsets.UTF_8));
		byte[] bytes = IOUtils.toByteArray(in);
		System.out.println("the converted bytes are: ");
		System.out.println(new String(bytes));
	}
}