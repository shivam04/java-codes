import java.io.*;
public class Test{
public static void main(String args[])throws IOException{
DataInputStream d = new DataInputStream(new FileInputStream(new File("input.txt")));
DataOutputStream out = new DataOutputStream(new FileOutputStream("output2.txt"));
String count;
while((count = d.readLine()) != null){
String u = count.toUpperCase();
System.out.println(u);
out.writeBytes(u + " ,");
}
d.close();
out.close();
}
}