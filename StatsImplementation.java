
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
        return 0;
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
    
    
    
    
    public static void main(String[] args){
        int[] myList = {5, 3, 6, 3};
        StatsImplementation mine = new StatsImplementation(myList);
        
        System.out.println(mine.mean());
        System.out.println(mine.range());
        
    }
}
