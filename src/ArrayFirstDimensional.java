class ArrayFirstDimensional
{
    public static void main(String args[])
    {
        float x[][] = {{1.1f,1.2f,1.3f,1.4f},
                {2.1f,2.2f,2.3f,2.4f},
                {3.1f,3.2f,3.3f,3.4f},
                {4.1f,4.2f,4.3f,4.4f}};
        System.out.println("In Matrix form");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}