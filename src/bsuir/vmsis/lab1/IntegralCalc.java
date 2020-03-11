package bsuir.vmsis.lab1;


public class IntegralCalc {
	public static double calculateIntegral(double begin, double end, int precision) {
		if(Math.abs(end-begin)>=2*Math.PI) {
			begin%=2*Math.PI;
			end%=2*Math.PI;
		}
		double sum=0, x= begin, step=(end-begin)/precision;
		for(int i= precision-1;i>0;i--) {
			x+=step;
			sum+=Math.sin(x);
		}
		sum*=2;
		sum+=Math.sin(begin)+Math.sin(end);
		sum*=step/2;
		return sum;
	}
}

