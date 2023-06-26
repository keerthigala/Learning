import java.io.*;
public class TotalMarksAndPercentageUsingArray
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many Subjects");
        int n = Integer.parseInt(br.readLine());
        int [] marks = new int[n];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter marks");
            marks[i] = Integer.parseInt(br.readLine());
        }
        int tot = 0;
        for(int i=0;i<5;i++)
            tot = tot + marks[i];
        System.out.println("Total marks=" + tot);
        float percent = (float)tot/n;
        System.out.println("percentage=" + percent);


        }


}
