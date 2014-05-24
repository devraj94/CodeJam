import java.io.*;
import java.util.*;

public class lawnmower {
	public static void main(String[] args) throws IOException{
		lawnmower l=new lawnmower();
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
				 String f[]=new String[2];
				 f=br.readLine().split(" ");
				
				 int e[]=new int [2];
				 e[0]=Integer.parseInt(f[0]);
				 e[1]=Integer.parseInt(f[1]);
				 int x[][]=new int[e[0]][e[1]];
				 int y[][]=new int[e[0]][e[1]];
				 int z[][]=new int[e[0]][e[1]];
				 int z1[][]=new int[e[0]][e[1]];
				 int z2[][]=new int[e[0]][e[1]];
				 for(int d=0;d<e[0];d++){
					 for(int n=0;n<e[1];n++){
						 y[d][n]=100;
						 z[d][n]=100;
						 z1[d][n]=100;
						 z2[d][n]=100;
					 }
				 }
				
				 for(int q=0;q<e[0];q++){
					
					String j[]=new String[e[1]];
					j=br.readLine().split(" ");
					 
					for(int u=0;u<e[1];u++){
						x[q][u]=Integer.parseInt(j[u]);
					}
				 }
				
				 l.cnr(y,x,e[0],e[1]);
				 l.rnc(z,x,e[0],e[1]);
				 l.c(z1,x,e[0],e[1]);
				 l.r(z2, x,e[0],e[1]);
				
				
				  
				 int cnr=0;
				 int rnc=0;
				 int oc=0;
				 int or=0;
				 for(int d=0;d<e[0];d++){
					 for(int n=0;n<e[1];n++){
						 if(x[d][n]!=y[d][n]){
							 
							 cnr++;
						 }
					 }
				 }
				 for(int d=0;d<e[0];d++){
					 for(int n=0;n<e[1];n++){
						 if(x[d][n]!=z[d][n]){
							 
							 rnc++;
						 }
					 }
				 }
				 for(int d=0;d<e[0];d++){
					 for(int n=0;n<e[1];n++){
						 if(x[d][n]!=z1[d][n]){
							 
							or++;
						 }
					 }
				 }
				 for(int d=0;d<e[0];d++){
					 for(int n=0;n<e[1];n++){
						 if(x[d][n]!=z2[d][n]){
							 
							 oc++;
						 }
					 }
				 }
				
				 if(rnc==0||cnr==0||or==0||oc==0){
				
					 bw.write("Case #"+(i+1)+": YES");
					bw.flush();
				 }
				 else{
					
					 bw.write("Case #"+(i+1)+": NO");
					bw.flush();
				 }
				 bw.newLine();
				 
			 }bw.close();
			 br.close();
	}

	void rnc(int y[][],int x[][],int row,int col){
		for(int i=0;i<row;i++){
			int s1=x[i][0];
			for(int s=0;s<col;s++){
				if(y[i][s]>s1){
					y[i][s]=s1;
				}
			}
		}
		for(int s=0;s<col;s++){
			int s1=x[0][s];
			for(int i=0;i<row;i++){
				if(y[i][s]>s1){
					y[i][s]=s1;
				}
			}
		}
	}
	void cnr(int z[][],int x[][],int row,int col){
		for(int s=0;s<col;s++){
			int s1=x[0][s];
			for(int i=0;i<row;i++){
				if(z[i][s]>s1){
					z[i][s]=s1;
				}
			}
		}
		for(int i=0;i<row;i++){
			int s1=x[i][0];
			for(int s=0;s<col;s++){
				if(z[i][s]>s1){
					z[i][s]=s1;
				}
			}
		}
	}
	void r(int z1[][],int x[][],int row,int col){
		for(int i=0;i<row;i++){
			int s1=x[i][0];
			for(int s=0;s<col;s++){
				if(z1[i][s]>s1){
					z1[i][s]=s1;
				}
			}
		}
	}
	void c(int z2[][],int x[][],int row,int col){
		for(int s=0;s<col;s++){
			int s1=x[0][s];
			for(int i=0;i<row;i++){
				if(z2[i][s]>s1){
					z2[i][s]=s1;
				}
			}
		}
	}
	
}
