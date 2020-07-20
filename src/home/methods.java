package home;

import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class methods {
	
	 public static float win = 0 , lose = 0 ;
	 public static	  	float total = 0;
	 public static	float winavg =0;
	 public static	 float loseavg = 0;
public static void run(float f){
	win = 0 ; lose = 0 ;
	  winavg =0;
loseavg = 0;
total =0;
	int x;
	Random rn = new Random();
	//Random rb = new Random();
	//int x = rn.nextInt(2);
	//int x = rn.nextInt(3);
	//int x = rn.nextInt(2);
	 for (int k = 0; k < f; k++) {  
	{
	int[] ob = new int[3];
	for (int i = 0; i < 1;) {
x = rn.nextInt(3);
ob[i] = x;
x = rn.nextInt(3);
ob[i+1] = x;
x = rn.nextInt(3);
ob[i+2] = x;
if(ob[0]==ob[1] || ob[0] == ob[2] || ob[1] == ob[2]){
i =0 ;
}		else{i =1 ;}	
	}int selected = rn.nextInt(3);
int op = 5 ,ch=5;
	//talking about [] 
	if (selected == 0){op = 1;}else if (selected == 1){op = 0;}else if (selected == 2){op = rn.nextInt(2);}
	//open the door that asinght into the [op] 
if (op ==1 && selected==0) {ch = 2; }
		else if (op ==1 && selected==2){ch = 0 ;}
		else if (op ==0 && selected==1){ch = 2 ;}
		else if (op ==0 && selected==2){ch = 1 ;}
		else if (op ==2 && selected==1){ch = 0 ;}
		else if (op ==2 && selected==0){ch = 1 ;}
//if (ob[ch] == ob[2]){win++;}else{lose++;}
	if (ob[selected] == ob[2]){win++;}else{lose++;}
total ++;
	}}
	 winavg =  ((win/total)*100);
	 loseavg = (lose/total)*100;
	
//	System.out.print(winavg);
//	System.out.print("\n");

	//System.out.print(loseavg);

	//System.out.print(win);

}
}
