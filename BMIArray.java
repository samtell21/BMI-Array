
package bmi.array;


import java.util.Scanner;
public class BMIArray
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
        String[] n = new String[l];
        double[] h = new double[l];
        double[] w = new double[l];
        double[] b = new double[l];
        String[] s = new String[l];
        String[] bs = new String[l];
        for(int i = 0; i < l; i++)
        {
            System.out.print("Person "+ (i+1) + "\nName: ");
            n[i] = k.next();
            System.out.print("Height (inches): ");
            h[i] = k.nextDouble();
            System.out.print("Weight (pounds): ");
            w[i] = k.nextDouble();
            b[i] = bmi(h[i], w[i]);
        }
        int u = 0, a = 0, o = 0, o1 = 0, o2 = 0, o3 = 0;
        for(int i = 0; i < l; i++)
        {
            if(b[i] < 18.5)     {u+=1;  s[i] = "Under Weight";}
            else if (b[i] < 25) {a+=1;  s[i] = "Normal Range";}
            else if (b[i] < 30) {o+=1;  s[i] = "Over Weight";}
            else if (b[i] < 35) {o1+=1; s[i] = "Obese Class 1";}
            else if (b[i] < 40) {o2+=1; s[i] = "Obese Class 2";}
            else                {o3+=1; s[i] = "Obese Class 3";}
        }
        for(int i = 0; i < l; i++)
        {
            bs[i] = String.format("%1.2f", b[i]);
        }

        System.out.println("\n\n"+s1+s2+s3+s2);
        for(int i = 0; i < l; i++)
        {
            String t = "\t";
            System.out.println(n[i]+t+w[i]+t+h[i]+t+bs[i]+t+s[i]);
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
