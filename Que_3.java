//3. Write a program which generates the series 1,4,27,16,125,36.

class Que_3
{
    public static void main(String [] args)
    {
        int i,j,sum=0,avg=0;
                
        for(i=1;i<=6;i++)
        {
            if(i%2==0)
                System.out.print(i*i+", ");
            else
                System.out.print(i*i*i+", ");
        }
        System.out.println();
    }
}



