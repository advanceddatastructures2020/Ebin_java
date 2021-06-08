public class StringManipulation
{
public static void main(String args[])
{
String greeting="Hello";
System.out.println(greeting);
String txt2="abcdefghijklmn";
System.out.println("the length of the txt string is:"+ txt2.length());
String txt="Hello world";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
String txt1="please locate where 'locate' occurs!";
System.out.println(txt1.indexOf("locate"));
String firstname="John";
String lastname="Deo";
System.out.println(firstname.concat(lastname));
String x="18";
String y="28";
String z=x+y;
System.out.print(z);
String a="RockStar";
System.out.println(a.charAt(3));
System.out.println(a.compareTo("RockStar"));
System.out.println(a.compareToIgnoreCase("ROCKSTAR"));
System.out.println(a.replace("Rock","New"));
}
}
