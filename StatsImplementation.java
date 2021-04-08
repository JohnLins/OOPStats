import java.util.ArrayList;
import java.lang.Math;
public class StatsImplementation implements Stats 
{
   private double[] list;
   
   
    public StatsImplementation(double[] l)
    {
        list = l;
    }

    public double mean(){
         int total = 0;
         for(int i = 0; i < list.length; i++){
             total += list[i];
            }
            
            return total/list.length;
     }
    
    public double median(){
        PartsImplementation here = new PartsImplementation(list);
        double[] sorted = here.selectionSort();
        if(sorted.length % 2 == 0){
            return (sorted[sorted.length/2] + sorted[sorted.length/2 + 1]) / 2;
        } 
        return sorted[sorted.length/2];
    }
    
    private static int contains(double[] Ilist, double value){
     for(int i = 0; i < Ilist.length; i++){
         if(Ilist[i] == value){
             return i;
            }
        }
        return -1;
    }
    
    public double mode(){
        
     
        double[][] rank = new double[list.length][list.length]; 
        int pointer = 0;
        
        for(int i = 0; i < list.length; i++){
            int check = contains(rank[0], list[i]);
            if(check == -1){
                rank[0][pointer] = list[i];
                rank[1][pointer] = 1;
                pointer++;
            } else {
                rank[1][check] ++;
            }
        }
        
        double max = rank[1][0];
        int maxIndex = 0;
        for(int i = 0; i < rank[1].length; i++){
            if(rank[1][i] > max){
                max = rank[1][i];
                maxIndex = i;
            }
        }
        
        return rank[0][maxIndex];
    }
    
    public double standardDeviation(){
        double mean = mean();
        double[] sd = new double[list.length];
        for(int i = 0; i < list.length; i++){
             sd[i] = (list[i] - mean) * (list[i] - mean);
        }
        
        StatsImplementation step = new StatsImplementation(sd);
        
        return Math.sqrt(step.mean());
    }
    
    public double range(){
     PartsImplementation here = new PartsImplementation(list);
     here.initMinMax();
     System.out.println("Min: " + here.getMin()); 
     System.out.println("Min: " + here.getMax()); 
     return here.getMax() - here.getMin();   
    }
    

     public static double meanList(ArrayList<Integer> list){
        int total = 0;
         for(int i = 0; i < list.size(); i++){
             total += list.get(i);
            }
            
            return total/list.size();
    }
    
    public static double medianList(ArrayList<Integer> list){
        return 0;
    }
    
    public static double modeList(ArrayList<Integer> list){
        return 0;
    }
    
    public static double standardDeviationList(ArrayList<Integer> list){
        return 0;
    }
    
    
    
    public static void main(String[] args){
        double[] myList = {5, 3, 6, 3, 8.9, 2.2};
        StatsImplementation mine = new StatsImplementation(myList);
        
        System.out.println("Mean: " + mine.mean());
        System.out.println("Range: " + mine.range());
        System.out.println("median: " + mine.median());
        System.out.println("Standard Deviation: " + mine.standardDeviation());
        System.out.println("Mode: " + mine.mode());
        
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        myArrList.add(7);
        myArrList.add(1);
        myArrList.add(9);
        myArrList.add(3);
        System.out.println("Mean of Arr List: " + StatsImplementation.meanList(myArrList));
    }
}
