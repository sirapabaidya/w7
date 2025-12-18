package w7;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    int e_marks;
    int n_marks;
    int m_marks;
    
    public result(int e_marks, int n_marks, int m_marks){
    this.e_marks=e_marks;
    this.n_marks=n_marks;
    this.m_marks=m_marks;
    
    }
    
    void total(){
    int total=this.e_marks+this.n_marks+this.m_marks;
    System.out.println("he total is: " + total);
    double per = total/3;
    System.out.println("he percentage is: " + (per));
    }
}