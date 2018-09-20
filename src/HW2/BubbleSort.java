package HW2;

public class BubbleSort implements SortBehavior {
    @Override
    public int[] mathSort(int[] array) {
    	System.out.println("\nBubble Sort");
        int n = array.length;
        for(int x = 0; x < n-1; x++){
        	for(int y = 0; y < n-x-1; y++){
        		if(array[y] > array[y+1]){
        			int saved = array[y];
        			array[y] = array[y+1];
        			array[y+1] = saved;
        		}
        	}
        }
        return array;
    }
}
