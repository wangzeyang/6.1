
public class OverloadDriver {

		public static void main(String [] args){
		//	double num1=10;
			double[] num= new double [100];
			//	num[0]-num[2]
			num[0]=10;
			num[1]=12;
			num[2]=13.4;
			int number=9;
			//	double num2=20;
		//	double num3=0;
		//	System.out.println(Overload.getAverage(num1, num2,num3));
			System.out.println(Overload.getAverage(num));
			System.out.println(Overload.getFactorial(number));
			System.out.println(Overload.getAverage(5.0, 3.0));
			System.out.println("Rectangle area is "+Overload.getRectangleArea(5.0, 3.0));
		}

}
