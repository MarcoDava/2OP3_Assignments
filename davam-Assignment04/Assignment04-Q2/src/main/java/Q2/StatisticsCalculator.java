package Q2;


public class StatisticsCalculator {
    private int[] Values;
    StatisticsCalculator(int[] data){//constructor
        Values=new int[data.length];
        if (data.length==0||data==null){//checks if data input is empty
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty."); //raises exception if string is empty
        }
        for(int i=0;i<data.length;i++){//copies array from values to data
            Values[i]=data[i];
        }
            
    }
    public double calculateAverage(){
        int sum=0;
        double average=0;
        for(int i=0;i<Values.length;i++){//iterates through every array index and adds them. after, it diveds by the length to get the average
            sum+=Values[i];
        }
        average=sum/Values.length;
        return average;
    }
    public double calculateMedian(){
        double median = 0;//finds the middle of the array. if the array length is even, it gets the average of the two middle values. if length is odd, it will just take the middle value
        int middle=Values.length/2;
        if(Values.length%2==0){
            median = (Values[middle] + Values[middle-1])/2;
        }
        else{
            median = Values[middle];
        }
        return median;
    }
    public void updateArray(int[] data){
        Values=new int[data.length];//updates the values of the according to the parameter passed through
        if (data.length==0||data==null){//ensures the input is valid
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty."); 

        }
        for(int i=0;i<data.length;i++){//copies array to array
            Values[i]=data[i];
        }
            
    }
}
   