public class ComplexNumber
{
double real,img;
ComplexNumber(double r,double i){
this.real=r;
this.img=i;
}
public static ComplexNumber sum(ComplexNumber e1,ComplexNumber e2)
{
ComplexNumber temp=new ComplexNumber(0,0);
temp.real=e1.real+e2.real;
temp.img=e1.img+e2.img;

return temp;
}
public static void main(String args[]){
ComplexNumber e1=new ComplexNumber(5.5,4);
ComplexNumber e2=new ComplexNumber(1.2,3.5);
ComplexNumber temp=sum(e1,e2);
System.out.printf("sum_is:_"+temp.real+"_+_"+temp.img+"i");
}
}