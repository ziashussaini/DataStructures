// The linked list based implementation for the NumberStack ADT
// Your name here

public class LinkedNumberStack implements NumberStack
{
    // instance variable
    private LNode m_top;

    // check whether the stack is empty
    public boolean isEmpty()
    {       
        if (m_top == null)
            return true;
        else
            return false;
    }

    // check whether the stack is full
    public boolean isFull()
    {
        return false;
    }
    
    // return the element at the top of the stack
    public int top()
    { 
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_top.getInfo();
    }

    // push a value onto the stack
    public void push(int v)
    {
        // TODO: implement this method
      if(isFull())
         throw new RuntimeException("push attempted on a full stack");
      else 
      {
      LNode newNode = new LNode(v);
      newNode.setLink(m_top);
      m_top = newNode;
      }
    }

    // remove and return the value at the top of the stack
    public int pop()
    { 
        int amount = 0;
        LNode test = null;
      if(isEmpty())
         throw new RuntimeException("pop attempted on an empty stack");
      else
      {
         amount = m_top.getInfo();
         test = m_top.getLink();
         m_top = test;
         
         
      }
		
        return amount; 
    }

    // return the size of the stack
    public int size()
    {       
      int counter = 0;
      LNode current = m_top;
      while(current != null)
      {
        current = current.getLink();
        counter++;     
      }
        return counter; 
    }

    // return a string representation of the stack
    @Override    
    public String toString()
    {
        String stackContent = "";
        LNode current = m_top;

        while (current != null)
        {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;    
    }
}