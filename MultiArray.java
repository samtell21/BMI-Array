package bmi.array;

import java.util.Scanner;
public class MultiArray
{
    static String s1 = "Statistical Report on the General Public BMI Ranges";
    static String s2 = "\n===================================================\n";
    static String s3 = "Name\tWeight\tHeight\tBMI\tStatus";
    static String t1 = "Total: ";
    static String t2 = "\nUnder Weight:  ";
    static String t3 = "\nNormal Range:  ";
    static String t4 = "\nOver Weight:   ";
    static String t5 = "\nObese Class 1: ";
    static String t6 = "\nObese Class 2: ";
    static String t7 = "\nObese Class 3: ";

    
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.print("How many people? ");
        int l = k.nextInt();
        String[][] s = new String[3][l];
        double[][] d = new double[3][l];
        for(int i = 0; i < l; i++)
        {
            System.out.print("Person "+ (i+1) + "\nName: ");
            s[0][i] = k.next();
            System.out.print("Height (inches): ");
            d[0][i] = k.nextDouble();
            System.out.print("Weight (pounds): ");
            d[1][i] = k.nextDouble();
            d[2][i] = bmi(d[0][i], d[1][i]);
        }
        int u = 0, a = 0, o = 0, o1 = 0, o2 = 0, o3 = 0;
        for(int i = 0; i < l; i++)
        {
            if(d[2][i] < 18.5)     {u+=1;  s[1][i] = "Under Weight";}
            else if (d[2][i] < 25) {a+=1;  s[1][i] = "Normal Range";}
            else if (d[2][i] < 30) {o+=1;  s[1][i] = "Over Weight";}
            else if (d[2][i] < 35) {o1+=1; s[1][i] = "Obese Class 1";}
            else if (d[2][i] < 40) {o2+=1; s[1][i] = "Obese Class 2";}
            else                {o3+=1; s[1][i] = "Obese Class 3";}
        }
        for(int i = 0; i < l; i++)
        {
            s[2][i] = String.format("%1.2f", d[2][i]);
        }

        System.out.println("\n\n"+s1+s2+s3+s2);
        for(int i = 0; i < l; i++)
        {
            String t = "\t";
            System.out.println(s[0][i]+t+d[1][i]+t+d[0][i]+t+s[2][i]+t+s[1][i]);
        }
        System.out.println(s2);
        System.out.println(t1+l+t2+u+t3+a+t4+o+t5+o1+t6+o2+t7+o3);
        
        
    }
    
    static double bmi(double h, double w)
    {
        double b = (w*703)/(h*h);
        return b;
    }
    
}
