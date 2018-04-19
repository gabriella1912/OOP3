import java.util.Random;

public class RandomArray {

	public RandomArray() {
		
	}
	public static void main(String[] args) {
		
		Random random= new Random();
		
		
		int [] randomArray= new int[10];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i]=random.nextInt(50)+1;
			
		}
		
		int [] randomArray2= new int[10];
		for (int i = 0; i < randomArray2.length; i++) {
			randomArray2[i]=(int)(Math.random()*50)+1;
			
		}
		
		for (int i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
		System.out.println("\n \n");
		for (int i : randomArray2) {
			System.out.println(i);
		}
		System.out.println("\n \n");
		for (int i = randomArray.length-1; i >= 0; i--) {
			System.out.println(randomArray[i]);
			
		}
		
		searchMaxEvenNumber(randomArray, randomArray2);
		
	}
	private static void searchMaxEvenNumber(int[] randomArray, int[] randomArray2) {
	 double max=0;
	 
	 System.out.println(max);
		for (int i : randomArray) {
			if ((i%2==0) && (i>max)) {
				max=i;
			}
		}
		System.out.println(max);
		max=0;
		for (int i = 0; i < randomArray2.length; i++) {
			if (randomArray2[i]%2 ==0 && randomArray2[i]>max) {
				max=randomArray2[i];
			}
		}
		System.out.println(max);
		
	}

}
