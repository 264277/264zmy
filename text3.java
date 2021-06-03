package week3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.Delayed;

public class Bank {
public static void main(String[]ar) throws InterruptedException{
int choose=menu();
double grade[]=null;
grade=new double[5];
double average,highest,lowest;
while(choose!=6){
	 switch(choose){
	 case 1:enterStudentResults(grade);break;
	 case 2:average=classAverage(grade);	 
	 Thread.currentThread().sleep(500);break;
	 case 3:highest=highestGrade(grade);	
	  Thread.currentThread().sleep(500);break;
	 case 4:lowest=lowestGrade(grade);
	  Thread.currentThread().sleep(500);break;
	 case 5:sort(grade);
	 Thread.currentThread().sleep(500);break;
	 default:System.out.println("输入无效请重新选择");
	 }
	 choose=menu();
}
System.out.println("已退出");
}
public static int menu() throws InterruptedException{
	int choice=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("student");
	System.out.println("1.Enter Student Results");
	System.out.println("2.Class Average");
	System.out.println("3.Highest Grade");
	System.out.println("4.Lowest Grade");
	System.out.println("5.sort");
	System.out.println("6.exit");
	System.out.print("please choose(1-6):");
	choice=scan.nextInt();
return choice;
	
}

public static void enterStudentResults(double grade[]){
	Scanner scan=new Scanner(System.in);
	int i=0;
	System.out.println("请输入成绩(0-100)");
	for(i=0;i<grade.length;i++){
	grade[i]=scan.nextDouble();
	if(grade[i]>100||grade[i]<0){
		i--;
		System.out.println("输入错误，请重新输入");
	}}
	
}
public static double classAverage(double grade[]){
	double sum=0;
	if(grade==null){
		System.out.println("请先输入学生成绩");
		return 0;
	}else{
	for(int i=0;i<grade.length;i++)
		sum=sum+grade[i];
	System.out.println("average="+sum/5);
	return sum/5;	 
	}
}
public static double highestGrade(double grade[]){
	double max=0;
	if(grade==null){
		System.out.println("请先输入学生成绩");
		return 0;
	}else{
	for(int i=0;i<grade.length;i++){
		if(max<grade[i])
			max=grade[i];
	}System.out.println("higer Grade="+max);return max;}
	
}public static double lowestGrade(double grade[]){
	double lowest=100;
	if(grade==null){
		System.out.println("请先输入学生成绩");
		return 0;
	}else{
	for(int i=0;i<grade.length;i++){
		if(lowest>grade[i])
			lowest=grade[i];}
	System.out.println("lowest Grade="+lowest);
	return lowest;
}
}
public static void sort(double grade[]) {
	Arrays.sort(grade);
	for(int i=0;i<grade.length;i++)
	System.out.println(grade[i]);
	
}
}