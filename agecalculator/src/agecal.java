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

public class agecal {
    
    private int year, month,day;
    private int pyear, pmonth, pday;
    private int a,b,c;
    public agecal(int y,int m,int d,int y1,int m1,int d1)
    {
        year=((y>0 && y<y1)? y :0);
        month=((m>0)? m :0);
        day=((d>0)? d :0);
        pyear=((y1>0)? y1 :0);
        pmonth=((m1>0)? m1 :0);
        pday=((d1>0)? d1 :0);
    }
    
    private void daycal()
    {
        if(pday>day)
        {
            a=pday-day;
        }
        else
        {
            pday+=30;
            a=pday-day;
            pmonth-=1;
        }
    }
    
    private void monthcal()
    {
        if(pmonth>month)
        {
            b=pmonth-month;
        }
        else
        {
            pmonth+=12;
            b=pmonth-month;
            pyear-=1;
        }
    }
    
    private void yearcal()
    {
        c=pyear-year;
    }
    
    public void ageecal()
    {
        daycal();
        monthcal();
        yearcal();
        JOptionPane.showMessageDialog(null,"The age is "+c+" years "+b+" months "+a+" days .","Age Calculator Panel",JOptionPane.PLAIN_MESSAGE);
    }
}
