import java.util.Scanner;

class a13 {
    public static void main(String a[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int i,j,t;
            int b[] = new int [5];

            for (i=0; i<5; i++)
            {
                System.out.println("Enter value for " + i);
                b[i] = sc.nextInt();
            }
            for (i=0;i<5;i++)
            {
                for (j=i+1;j<5;j++)
                {
                    if(b[i]>b[j])
                    {
                        t=b[i];
                        b[j]=b[i];
                        b[j]=t;
                    }
                }
            }
            for (i=0;i<5;i++)
            {
                for (j=i+1;j<5;j++)
                {
                    if(b[i]<b[j])
                    {
                        t=b[i];
                        b[j]=b[i];
                        b[j]=t;
                    }
                }
            }
        }
    }
}