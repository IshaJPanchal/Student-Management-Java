import java.util.*;
class Student{
protected String name,address;
protected int id,yr;
protected float fees,t,mks,p,c,m;
protected long phone_no;

Student(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter name:");
name=sc.nextLine();
name=name.toUpperCase();
System.out.println("Name of Student:"+name);
System.out.print("Enter recidental Address:");
address=sc.nextLine();
System.out.print("Enter ID:");
id=sc.nextInt();
System.out.print("Enter contact number:");
phone_no=sc.nextLong();
System.out.print("Enter the persuing year:");
yr=sc.nextInt();
System.out.print("Enter fees:");
fees=sc.nextFloat();}

public void enter_marks(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks in Physics, Chemistry and Maths:");
p=sc.nextFloat();
c=sc.nextFloat();
m=sc.nextFloat();
mks=p+c+m;
System.out.println("Total marks ="+mks);}

public void view_fees(){
System.out.println("Fees Paid= "+fees);}

public void student_details(){
System.out.println("Name ="+name+"\tID ="+id+"\nYear ="+yr+"\tContact number ="+phone_no+"\nAddress ="+address);}
	
public void view_marks() {
System.out.println("Physics ="+p+"\tChemistry "+c+"\tMaths ="+m+"\nTotal marks ="+mks);}

public void fees() {
Scanner sc=new Scanner(System.in);
System.out.print("Enter fees to be payed:");
t=sc.nextFloat();
fees=fees+t;
System.out.println("Fees paied successfully!!");}
}

public class StudentManagementSystem{
public static void main(String args[]) {
int n,i=0,j,choice,srno,copy=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of students to be entered:");
n=sc.nextInt();
Student s[]=new Student[n];
do{
System.out.print("1.Enter a new Student\n2.View student details\n3.View Fees status\n4.Enter marks of the student\n5.View marks of the student\n6.Edit fees status\n7.Delet student\n8.View Student List\n9.Exit\nEnter your choice:");
choice=sc.nextInt();
switch(choice) {
case 1: if(i<100) {
	s[i]=new Student();
	srno=i;
	System.out.println("Sr.No.="+srno);
	i++;
	copy=i;}
	else System.out.println("Request exceeds the specified number of students!!");
	break;
case 2: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].student_details();
	break;
case 3: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].view_fees();
	break;
case 4: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].enter_marks();
	break;
case 5: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].view_marks();
	break;
case 6: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	s[srno].fees();
	break;
case 7: System.out.print("Enter Sr.No.:");
	srno=sc.nextInt();
	for(i=0;i<=copy;i++) {
	if(srno==i) {
	for(j=i;j<copy;j++) {
	s[j]=s[j+1];}
	}
	}
	i--;
	copy--;
case 8: System.out.println("SrNo.\t\tName");
	for(i=0;i<copy;i++) {
	System.out.println(i+"\t\t"+s[i].name);
	}
	break;
case 9: break;
default:System.out.println("Invalid choice!");
	break;
}
}while(choice!=9);
}
}