/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi.array;

/**
 *
 * @author Sam
 */
public class BMI
{
    public String n;
    public double w;
    public double h;
    public double bmi ()
    {
        double b = (w*703/(h*h));
        return b;
    }
}
