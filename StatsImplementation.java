import java.util.ArrayList;

public class StatsImplementation implements Stats 
{
   private int[] list;
   
   
    public StatsImplementation(int[] l)
    {
        list = l;
    }

    public int mean(){
         int total = 0;
         for(int i = 0; i < list.length; i++){
             total += list[i];
            }
            
            return total/list.length;
     }
    
    public int median(){
        PartsImplementation here = new PartsImplementation(list);
        int[] sorted = here.selectionSort();
        if(sorted.length % 2 == 0){
            return (sorted[sorted.length/2] + sorted[sorted.length/2 + 1]) / 2;
        } 
        return sorted[sorted.length/2];
    }
    
    public int mode(){
        return 0;
    }
    
    public int standardDeviation(){
        return 0;
    }
    
    public int range(){
     PartsImplementation here = new PartsImplementation(list);
     here.initMinMax();
     System.out.println("Min: " + here.getMin()); 
     System.out.println("Min: " + here.getMax()); 
     return here.getMax() - here.getMin();   
    }
    

     public static int meanList(ArrayList<Integer> list){
        int total = 0;
         for(int i = 0; i < list.size(); i++){
             total += list.get(i);
            }
            
            return total/list.size();
    }
    
    public static int medianList(ArrayList<Integer> list){
        return 0;
    }
    
    public static int modeList(ArrayList<Integer> list){
        return 0;
    }
    
    public static int standardDeviationList(ArrayList<Integer> list){
        return 0;
    }
    
    
    
    public static void main(String[] args){
        int[] myList = {5, 3, 6, 3};
        StatsImplementation mine = new StatsImplementation(myList);
        
        System.out.println("Mean: " + mine.mean());
        System.out.println("Range: " + mine.range());
        System.out.println("median: " + mine.median());
        
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(9);
        myArrList.add(3);
        System.out.println("Mean of Arr List: " + StatsImplementation.meanList(myArrList));
    }
}
