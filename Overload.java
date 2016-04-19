
public class Overload {
	public static double getAverage(double first, double second){
		return (first+second)/2.0;
		
	} 
	public static double getAverage(double first, double second,double thired){
		return (first+second+thired)/3.0;
		
	} 
	public static double getAverage(double [] num){
		double sum=0.0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		return(sum/num.length);
	}
	public static double getRectangleArea(double width,double length){
		return width*length;
		
	}
	public static int getRectangleArea(int width,int length){
		return width*length;
		
	}
	public static int getFactorial(int num){
		int sum=1;
		while(num>1){
			sum*=num;
			num--;
		}
		return (sum);
	}
}
