public class RecursiveMultiply{

	public static int minProduct(int a, int b){
		int smaller = a < b ? a : b;
		int bigger = a < b ? b : a;
		return minProductHelper(smaller, bigger);
	}

	private static int minProductHelper(int smaller, int bigger){
		if (smaller == 0){
			return smaller;
		} else if (smaller == 1){
			return bigger;
		}
		int s = smaller >> 1;
		int halfProd = minProductHelper(s, bigger);
		if (smaller % 2 == 0){
			return halfProd + halfProd;
		} else {
			return halfProd + halfProd + bigger;
		}
	}

	public static void main(String...ar){
		long startTime = System.currentTimeMillis();
		System.out.println(minProduct(3,2));
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		//Elapsed time before memoization = 2 ms.
		// Elaped time after memoization = 3 ms.
		//Here memoization is increasing time as recursive call is there only once.
		System.out.println("Elapsed time: " + elapsedTime);
	}
}