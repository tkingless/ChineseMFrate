package com.tkk.ChineseMFrate;

import java.io.IOException;
import java.util.Iterator;
import java.util.*;

public class ChineseMFrateMain {

	public static void main(String[] args) throws IOException {

		System.out.println("hihi");

		Random ran = new Random();

		FileManager filewriter = new FileManager("result.dat");

		for(int i = 0; i < 100000; i++){
			//filewriter.Append(Integer.toString(ran.nextInt(42)+1));
			//filewriter.Append(",");

			//generating [1,42]
			filewriter.AppendOnNewLine(Integer.toString(ran.nextInt(42)+1),false);
		}

		filewriter.Close();

		System.out.println("byebye");

	}
}
