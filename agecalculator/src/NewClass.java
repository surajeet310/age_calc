/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Surajeet Das
 */

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args)
    {
      String s1=JOptionPane.showInputDialog("Enter the birth year");
      String s2=JOptionPane.showInputDialog("Enter the birth month");
      String s3=JOptionPane.showInputDialog("Enter the birth day");
      String s4=JOptionPane.showInputDialog("Enter the present year");
      String s5=JOptionPane.showInputDialog("Enter the present month");
      String s6=JOptionPane.showInputDialog("Enter the present day");
      int i=Integer.parseInt(s1);
      int j=Integer.parseInt(s2);
      int k=Integer.parseInt(s3);
      int pi=Integer.parseInt(s4);
      int pj=Integer.parseInt(s5);
      int pk=Integer.parseInt(s6);
      agecal obj=new agecal(i,j,k,pi,pj,pk);
      obj.ageecal();
    }
}
