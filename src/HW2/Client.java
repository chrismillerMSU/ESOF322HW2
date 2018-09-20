package HW2;

public class Client {
    public static void main(String[] args){
        MathSoftware mathematica = new Mathematica();
        MathSoftware mTool = new MTool();
        MathSoftware myMath = new MyMath();
        int[] array = new int[]{7,4,9,2,0,12,15};
        mathematica.performSort(array);
        printArray(array);
       // mTool.performSort();
       // myMath.performSort();
       // myMath.setSortStrategy(new MergeSort());
       // myMath.performSort();
    }
    public static void printArray(int[] array){
        for(int i: array){
            System.out.println(i);
        }
    }
}
