package HW2;

public abstract class MathSoftware {
    SortBehavior sortBehavior;
    public MathSoftware(){

    }
    public void performSort(){
        sortBehavior.mathSort();
    }
    public void setSortStrategy(SortBehavior sb){
        sortBehavior = sb;
    }
}
