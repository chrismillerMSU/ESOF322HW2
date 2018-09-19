package HW2;

public class Client {
    public static void main(String[] args){
        MathSoftware mathematica = new Mathematica();
        MathSoftware mTool = new MTool();
        MathSoftware myMath = new MyMath();
        mathematica.performSort();
        mTool.performSort();
        myMath.performSort();
        myMath.setSortStrategy(new MergeSort());
        myMath.performSort();
    }
}
