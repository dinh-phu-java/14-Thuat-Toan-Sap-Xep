import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] insertionArr= generateArr(100000);
        int[] bubbleArr= generateArr(100000);
        int[] selectionArr= generateArr(100000);

        int startInsertionTime= (int) System.currentTimeMillis();
        insertionSort(insertionArr);
        int endInsertionTime= (int) System.currentTimeMillis();
        System.out.println("Time to sort by insertionSort "+(endInsertionTime-startInsertionTime));

        int startSelectionTime= (int) System.currentTimeMillis();
        selectionSort(selectionArr);
        int endSelectionTime= (int) System.currentTimeMillis();
        System.out.println("Time to sort by selection "+(endSelectionTime-startSelectionTime));

        int startBubbleTime= (int) System.currentTimeMillis();
        bubbleSort(bubbleArr);
        int endBubbleTime= (int) System.currentTimeMillis();
        System.out.println("Time to sort by bubble "+(endBubbleTime-startBubbleTime));

//        System.out.println("Bubble Sort: ");
//        System.out.println(Arrays.toString(bubbleArr));
//
//        System.out.println("Selection Sort: ");
//        System.out.println(Arrays.toString(selectionArr));
//
//        System.out.println("Insertion Sort: ");
//        System.out.println(Arrays.toString(insertionArr));
    }
    public static int[] generateArr(int length){
        int[] myArr=new int[length];
        for (int i=0;i<myArr.length;i++){
            myArr[i]= (int)Math.floor (Math.random()*length);
        }
        return myArr;
    }
    public static void bubbleSort(int[] myArr){
        for (int i=0;i<myArr.length;i++){
            for (int j=i; j<myArr.length;j++){
                if (myArr[i] > myArr[j])
                    swap(myArr,i,j);
            }
        }
    }
    public static void selectionSort(int[] myArr){
        for (int i=0;i<myArr.length;i++){
            int minValueIndex=i;
            for (int j=i+1;j<myArr.length;j++){
                if (myArr[minValueIndex] > myArr[j]){
                    minValueIndex=j;
                }
            }
            swap(myArr,minValueIndex,i);
        }
    }
    public static void insertionSort(int[] myArr){
        for (int i=0;i<myArr.length;i++){
            int key = myArr[i];
            int j=i-1;
            while(j>=0 && myArr[j] > key ){
                myArr[j+1]=myArr[j];
                j--;
            }
            myArr[j+1]=key;
        }
    }
    public static void swap(int[] myArr,int a,int b){
        int temp = myArr[a];
        myArr[a]=myArr[b];
        myArr[b]=temp;
    }
}
