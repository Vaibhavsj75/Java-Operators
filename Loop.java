package operators;

public class Loop 
{

    public static void main(String[] args)
    {
    // {
    //     for(int i=0 ; i<5 ; i++);
    //     {
    //         System.out.println("*");
    //     }
    
        
    // }
    int i=0;
    while(i<5);

    {
        System.out.println("Hello All");
        i++;
    }

    int j=0;
    do
    {
        System.out.println("Hello");
        j++;
    }while(j<5);
    
}

    @Override
    public String toString()
    {
        return "Loop []";
    }
}