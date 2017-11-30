/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram;

/**
 *
 * @author madhavi
 */
public class FirstProgram {

  /**
   * @param args the command line arguments
   */
  
  
  public void printInstituteName()
  {
    String instituteName;
    instituteName = "Enosis Learning";
    System.out.println(instituteName);
  }
  
  public void printNumbers()
  {
    for(int i=1; i<1001; i++)
    {
      System.out.println(i);
    }
    
  }
  
  public String oddOrEven(int i)
  {
    int number = i%2;
    if(number == 0)
    {
        return "Even";
    }else{
        return "Odd";
    }
  }
  
  
  
  
  public static void main(String[] args) {
    
    FirstProgram fc1 = new  FirstProgram();
    fc1.printInstituteName();
    fc1.printNumbers();
    String result = fc1.oddOrEven(6);
    System.out.println(result);
      }
  
  
}
