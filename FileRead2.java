import java.io.*;
class FileRead2{
public static void main(String args[]) throws Exception{
FileReader fr=new FileReader("D:\\santhosh\\bestfrnd.txt");      
BufferedReader br=new BufferedReader(fr);
int i;
int countDigits=0;
while((i=br.read())!=-1){
while(((char)i>='0')&&((char)i<='9'))
countDigits++;
}
System.out.println(countVowel);
br.close();
fr.close();
}
}

