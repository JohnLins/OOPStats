
public class PartsImplementation implements Parts
{
    
    private int[] list;
    private int min;
    private int max;
    
    public PartsImplementation(int[] l)
    {
        list = l;
        
        int min = list[0];
        int max = list[0];
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
    
    
    public int getMin(){
        return min;
    }
    
    public int getMax(){
        return max;
    }
}
