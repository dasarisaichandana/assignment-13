package com.files;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestFileTest {

	@Test
	void testFiles() throws IOException {
		TestFile t=new TestFile();
		String s="sasu";
		String s2=s+".txt";
		t.files(s);
		String s1="";
		FileInputStream fis=new FileInputStream(s2);
		int i=0;
		while((i=fis.read())!=-1) 
			{
			s1=s1+(char)i;
			}
		assertEquals(s,s1);
	}

}
