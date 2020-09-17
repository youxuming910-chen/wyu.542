package ibm.com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStream {

	private static Scanner scan;

	public FileInputStream(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		// 创建文件
		createFile();

		FileInputStream fis = new FileInputStream("myfile.txt");
		FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
		int len = -1;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		System.out.println("复制成功！！！");

		fis.close();
		fos.close();
		scan.close();
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static FileOutputStream createFile() throws IOException {
		FileOutputStream fos = new FileOutputStream("myfile.txt", true);
		System.out.println("请输入文件内容：");
		String str = scan.nextLine();
		byte[] bytes = str.getBytes();
		fos.write(bytes);
		System.out.println("写入成功");
		fos.close();
		return fos;
	}
}
