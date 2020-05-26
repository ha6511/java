package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//	1. 바이트 스트림 : 모든 처리를 1 byte 씩 처리 
//			대상 : byte로 이루어진 모든 파일( 영문자, 숫자, 그림, 소리, 동영상)
//			최상위 클래스 : InputStream(입력), OutputStream(출력)


//	FileOutputStream 주요메소드 
//		write(int b) : 	int b => 아스키코드(숫자) 하나 쓸 수 있다. => 한글자 쓰기
//						int b 대신 char 하나를 사용할 수 있다.
//						(영문자 대소문자, 숫자, 일부 특수문자) 쓰기 가능 
//						영어를 뺀 나머지 글자는 사용 불가 
//		write(byte[] b) : byte 배열을 사용할 수 있다.
//		flush() : write 후 반드시 사용
//		close()	: 스트림을 닫기 : ( finally 로 처리 )

public class Ex02_FileOutputStream {

	public static void main(String[] args) {
		
		String pathname = "C:"+ File.separator + "study" + File.separator +"util" + File.separator + "io01.txt";
		
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		
		try {
			
			//	해당 파일이 없으면 만들어 지고 
			//	있으면 만들지 않고 덮어 쓴다.
			//	fos = new FileOutputStream(file);
			
			//	이어쓰시 
			fos = new FileOutputStream(file, true);
			
			fos.write(97); //	a를 write
			fos.write(65); //	A를 write
			fos.write(97); //	a를 write
			fos.write('\n');
			
			//	숫자 대신에 char 사용
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			//	줄바꾸기 13, 10
			fos.write(13);
			fos.write(10);
			
			//	배열을 이용하자
			byte[] b = {'b','o','y','s', 13,10,'g','i','r','I','s', 13,10};
			fos.write(b);
			
			//	String을 이용히자  => 비영어도 사용가능 
			String	str	=	"Hello\n안녕\\n\\123\\n\\大韓\nWorld";
			//	내용을 byte[]에 넣었다.
			byte[] b2 = str.getBytes();
			fos.write(b2);

			fos.flush();	//	write()  후에는 반드시 flush() 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)  fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
