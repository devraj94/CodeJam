import java.io.*;
import java.util.*;

public class reverse {
   public static void main (String[] args) throws IOException{
	   InputStreamReader in=new InputStreamReader(System.in);
	   BufferedReader br=new BufferedReader(in);
	   int h=Integer.parseInt(br.readLine());
	   String a[]=new String[h];
	   for(int i=0;i<h;i++){
		   String g[]=br.readLine().split(" ");
		   String m="";
		   for(int y=g.length-1;y>=0;y--){
			   m=m.concat(g[y]);
			   m=m.concat(" ");
		   }
		   a[i]=m;
	   }
	   File file=new File("output.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileWriter fr=new FileWriter("output.txt");
		 BufferedWriter bw=new BufferedWriter(fr);
	   for(int i=0;i<h;i++){
		   bw.flush();
		   String f="Case #"+(i+1)+": "+a[i];
		   bw.write(f);
		   bw.newLine();
		   System.out.println("Case #"+(i+1)+": "+a[i]);
	   }bw.close();
   }
}
