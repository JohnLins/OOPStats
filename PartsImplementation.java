
public class PartsImplementation implements Parts
{
    
    private double[] list;
    private double min;
    private double max;
    
    public PartsImplementation(double[] l)
    {
        list = l;
        
        min = list[0];
        max = list[0];
    }


    public void initMinMax()
    {
        
        for(int i = 0; i < list.length; i++){
            if(list[i] < min){
             min = list[i];   
            }
            if(list[i] > max){
             max = list[i];   
            }
        }
        
    }
    
    
    public double getMin(){
        return min;
    }
    
    public double getMax(){
        return max;
    }
    
    public double[] selectionSort(){
        double[] sorted = new double[list.length];
        double minValue = list[0];
        for(int i = 0; i < list.length; i++){
            minValue = list[i];
            for(int j = i; j < list.length; j++){
                if(list[j] < minValue){
                    minValue = list[j];
                }
                sorted[i] = minValue;
                
            }
        }
        
        return sorted;
    }
}
