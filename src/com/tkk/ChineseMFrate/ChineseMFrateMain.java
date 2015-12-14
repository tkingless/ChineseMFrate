package com.tkk.ChineseMFrate;

import java.io.IOException;
import java.util.Iterator;
import java.util.*;

public class ChineseMFrateMain {

	public static void main(String[] args) throws IOException {

		System.out.println("hihi");

		int No_Boy = 0;
		int No_Girl = 0;

		Random ran = new Random();

		FileManager filewriter = new FileManager("result.dat");

		for(int i = 0; i < 10000; i++){
			//filewriter.Append(Integer.toString(ran.nextInt(42)+1));
			//filewriter.Append(",");

			//generating [1,42]
			//filewriter.AppendOnNewLine(Integer.toString(ran.nextInt(42)+1),false);

			while(true) {
				int randomNo = ran.nextInt(41)+1;

				filewriter.AppendOnNewLine(Integer.toString(randomNo));
				if((randomNo % 2) == 0){
					No_Girl ++;	
					//System.out.println("Girl plus: " + randomNo);
				}
				else {
					No_Boy ++;
					//System.out.println("Boy plus: " + randomNo);
					break;
				}

			}
		}

		filewriter.Close();

		System.out.println("byebye");
		if(No_Girl != 0){
			System.out.println("M/F: " + (float) No_Boy/No_Girl);
			System.out.println("Boy: " + No_Boy);
			System.out.println("Girl: " + No_Girl);
		}

	}
}
