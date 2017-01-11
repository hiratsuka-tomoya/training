package sample;

import java.io.FileReader;

public class HelloWorld {

	public static void main(String[] args){

		FileReader fr = null;


		try {

			System.out.println("hoge try");
			for (int i = 1; i < 10 ; i++) {
				if (i < 5) {

				}else {
					return;
				}
			}
			fr = new FileReader("");
		} catch (Exception e) {
			System.out.println("hoge catch");
		} finally {
			try {
//				fr.close();
			} catch (Exception e) {

			}
			System.out.println("hoge finally");
		}

	}
}
