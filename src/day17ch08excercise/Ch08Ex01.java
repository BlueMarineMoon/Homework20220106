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
         System.out.println("��ȭ ��ȣ �Է� ���α׷��Դϴ�.(�׸� �Է��� ����)");
         while(true) {
            System.out.print("�̸� ��ȭ��ȣ >> ");
            String line = scan.nextLine();
            if("�׸�".equals(line)) break;
            sb.append(line);
            sb.append('\n');
         }
         writer.write(sb.toString());
         System.out.println(file.getPath() +"�� �����Ͽ����ϴ�.");
         // ������ ������ �о ����ϱ� - FileReader ���.
         reader = new FileReader(file);
         br = new BufferedReader(reader);
         String data = null;
         StringBuffer lines = new StringBuffer();
         while((data = br.readLine()) != null) {
            lines.append(data);
         }
         System.out.println(lines.toString());
      } catch(FileNotFoundException e) {
         System.out.println("������ ������ �����ϴ�.");
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