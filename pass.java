public class pass {
    void arraycal(int [] array1)
    {
        int i;
        for (i=0;i<array1.length;i++) {
            array1[i]=array1[i]+1;
            System.out.println(+array1[i]);

        }
    }
    public static void main(String[] args) {
        pass on = new pass();
        int[] arr={1,2,3,4};
        on.arraycal(arr);

    }

}
