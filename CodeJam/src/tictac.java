import java.io.*;
import java.util.*;
public class tictac {
	static ArrayList<Integer> list;
	 public static void main(String[] args) throws IOException{
		 tictac s=new tictac();
		 list=new ArrayList<Integer>();
		   InputStreamReader in=new InputStreamReader(System.in);
		   BufferedReader br=new BufferedReader(in);
		   int a=Integer.parseInt(br.readLine());
		   File file=new File("output.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter fr=new FileWriter("output.txt");
			 BufferedWriter bw=new BufferedWriter(fr);
			 for(int i=0;i<a;i++){
				 String d[][]=new String[4][4];
				 
				   String f[]=new String[5];
				   for(int y=0;y<4;y++){
					   f=br.readLine().split("");
					   for(int u=1;u<5;u++){
						   
						   d[y][u-1]=f[u];
					   }
				   }
				  int z= s.rows(d);
				   int y=s.columns(d);
				   int x=s.LtoR(d);
				   int w=s.RtoL(d);
				   int dot=0;
				   for(int j=0;j<4;j++){
					   for(int q=0;q<4;q++){
						   if(d[j][q].compareTo(".")==0){
							   dot++;
						   }
					   }
				   }
				
				   if(w==1 ){ 
					   bw.flush();
					   String p="Case #"+(i+1)+": X won";
					   bw.write(p);
					   bw.newLine();
					  
				   }
				   else if(x==1){ 
					   bw.flush();
					   String p="Case #"+(i+1)+": X won";
					   bw.write(p);
					   bw.newLine();
					   
				   }
				   else if(y==1){ 
					   bw.flush();
					   String p="Case #"+(i+1)+": X won";
					   bw.write(p);
					   bw.newLine();
					  
				   }
				   else if(z==1){ 
					   bw.flush();
					   String p="Case #"+(i+1)+": X won";
					   bw.write(p);
					   bw.newLine();
					
				   }
				   else if(w==2){
					   bw.flush();
					   String p="Case #"+(i+1)+": O won";
					   bw.write(p);
					   bw.newLine();
					  
				   }
				   else if(x==2){
					   bw.flush();
					   String p="Case #"+(i+1)+": O won";
					   bw.write(p);
					   bw.newLine();
					 
				   }
				   else if(y==2){
					   bw.flush();
					   String p="Case #"+(i+1)+": O won";
					   bw.write(p);
					   bw.newLine();
					
				   }
				   else if(z==2){
					   bw.flush();
					   String p="Case #"+(i+1)+": O won";
					   bw.write(p);
					   bw.newLine();
					  
				   }
				   else if(dot==0){
					   bw.flush();
					   String p="Case #"+(i+1)+": Draw";
					   bw.write(p);
					 bw.newLine();
					 
				   }
				   else{
					   bw.flush();
					   String p="Case #"+(i+1)+": Game has not completed";
					   bw.write(p);
					   bw.newLine();
					 
				   }
				   
			bw.flush();
			br.readLine();}
	}
	 
	 
int rows(String d[][]){
	int a=0;
	int b=0;
	int c=0;
	int e=0;
	for(int i=0;i<4;i++){
		a=0;
		b=0;
		c=0;
		e=0;
		for(int u=0;u<4;u++){
			if((d[i][u].compareTo("X")==0)){
				a++;
			}
			if((d[i][u].compareTo("T")==0)){
				b++;
			}
			if((d[i][u].compareTo("O")==0)){
				c++;
			}
			if((d[i][u].compareTo(".")==0)){
				e++;
			}
		}
		if((a==3&&b==1)||(a==4)){
			return 1;
		}
		if((c==3&&b==1)||(c==4)){
			return 2;
		}
	}
	return 0;
}


int columns(String d[][]){
	int a=0;
	int b=0;
	int c=0;
	int e=0;
	for(int u=0;u<4;u++){
		a=0;
		b=0;
		c=0;
		e=0;
		for(int i=0;i<4;i++){
			if((d[i][u].compareTo("X")==0)){
				a++;
			}
			if((d[i][u].compareTo("T")==0)){
				b++;
			}
			if((d[i][u].compareTo("O")==0)){
				c++;
			}
			if((d[i][u].compareTo(".")==0)){
				e++;
			}
		}
		if((a==3&&b==1)||(a==4)){
			return 1;
		}
		if((c==3&&b==1)||(c==4)){
			return 2;
		}
	}
	return 0;
}


int LtoR(String d[][]){
	int a=0;
	int b=0;
	int c=0;
	int e=0;
	int g=0;
	for(int i=0;i<4;i++){
		
		if(d[i][g].compareTo("X")==0){
			a++;
		}
		if((d[i][g].compareTo("T")==0)){
			b++;
		}
		if((d[i][g].compareTo("O")==0)){
			c++;
		}
		if((d[i][g].compareTo(".")==0)){
			e++;
		}
		g++;
	}
	if((a==3&&b==1)||(a==4)){
		return 1;
	}
	if((c==3&&b==1)||(c==4)){
		return 2;
	}
	return 0;
}

int RtoL(String d[][]){
	int a=0;
	int b=0;
	int c=0;
	int e=0;
	int g=0;
	int i=0;
	for( g=3;g>=0;g--){
		
		if(d[i][g].compareTo("X")==0){
			a++;
		}
		if((d[i][g].compareTo("T")==0)){
			b++;
		}
		if((d[i][g].compareTo("O")==0)){
			c++;
		}
		if((d[i][g].compareTo(".")==0)){
			e++;
		}
		i++;
	}
	if((a==3&&b==1)||(a==4)){
		return 1;
	}
	if((c==3&&b==1)||(c==4)){
		return 2;
	}
	return 0;
}
}
