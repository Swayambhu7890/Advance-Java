package test;

public class Calculator 
{

    private int data = 60;
    
    public Calculator() 
    {
        // no-arg constructor 
    }

    // Getter
    public int getData() 
    {
        return data;
    }

    public int cube(int no) 
    {
        return no * no * no;
    }
}
