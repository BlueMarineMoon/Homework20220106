package day17ch08excercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch08Ex01 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      File file = new File("C:\\Temp\\phone.txt");
      FileWriter writer = null;
      FileReader reader = null;
      BufferedReader br = null;
      try {
         writer = new FileWriter(file);
         StringBuffer sb = new StringBuffer();
         System.out.println("전화 번호 입력 프로그램입니다.(그만 입력은 종료)");
         while(true) {
            System.out.print("이름 전화번호 >> ");
            String line = scan.nextLine();
            if("그만".equals(line)) break;
            sb.append(line);
            sb.append('\n');
         }
         writer.write(sb.toString());
         System.out.println(file.getPath() +"에 저장하였습니다.");
         // 파일의 내용을 읽어서 출력하기 - FileReader 사용.
         reader = new FileReader(file);
         br = new BufferedReader(reader);
         String data = null;
         StringBuffer lines = new StringBuffer();
         while((data = br.readLine()) != null) {
            lines.append(data);
         }
         System.out.println(lines.toString());
      } catch(FileNotFoundException e) {
         System.out.println("지정한 파일이 없습니다.");
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if(writer!=null) {
            try {
               writer.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }
      
      
      
   }

}