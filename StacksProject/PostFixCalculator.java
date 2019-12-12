// The PostFixCalculator class that implements a postfix expression calculator
// Your name here

import java.util.Scanner;

public class PostFixCalculator 
{
    // instance variable
    String m_postfix;
    
    // constructor
    public PostFixCalculator()
    {
        m_postfix = "";
    }
    
    // mutator
    public void setPostfix(String postfix)
    {
        m_postfix = postfix;
    }
    
    // evaluate the postfix expression saved in m_postfix
    public int calculate()
    {
        Scanner tokenizer; 
        int result = -1; // This is only an initial value. You will need to update it to the correct value.
        int operand1, operand2, value;
        String operator;
        NumberStack myStack = new ArrayNumberStack(100);

        tokenizer = new Scanner(m_postfix);

        while(tokenizer.hasNext()){
           if(tokenizer.hasNextInt())
           {
              value = tokenizer.nextInt();
              if(myStack.isFull())
               throw new RuntimeException("Too many Operands");
               
              myStack.push(value);
           }
           else
           {
              operator = tokenizer.next();
              
              if(myStack.isEmpty())
                 throw new RuntimeException("Not enough Operands");
                 
              operand2 = myStack.top();
              myStack.pop();
              
              if(myStack.isEmpty())
                 throw new RuntimeException("Not enough Operands");
                 
              operand1 = myStack.top();
              myStack.pop();
           
              if(operator.equals("/"))
                 result = operand1 / operand2;
              else
              if(operator.equals("*"))
                 result = operand1 * operand2;
              else
              if(operator.equals("+"))
                 result = operand1 + operand2;
              else
              if(operator.equals("-"))
                 result = operand1 - operand2;
              else
                 throw new RuntimeException("Unrecognized operator: " + operator);
                 
              myStack.push(result);
           
           }
        }
        
        if(myStack.isEmpty())
            throw new RuntimeException("Not enought Operands");
        result = myStack.top();
        myStack.pop();
        
        if(!myStack.isEmpty())
            throw new RuntimeException("Too many Operands");

        return result;        
    }    

}