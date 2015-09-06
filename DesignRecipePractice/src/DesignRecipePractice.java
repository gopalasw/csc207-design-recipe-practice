
public class DesignRecipePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a"};
		String[] newArr = intersperse(arr, "x");
		if(newArr == null)
			System.out.println("The array is null");
		else
			for(int i = 0; i < newArr.length; i++)	
				System.out.print(newArr[i] + " ");
	}

	public static String[] intersperse(String[] arr, String str) {
		if(arr==null)
			return null;
		if(arr.length == 0 || arr.length == 1)
			return arr;
		String[] newArr = new String[(arr.length)*2 - 1];
		newArr[0] = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			newArr[i*2] = arr[i];
			newArr[i*2 - 1] = str;
		}


		return newArr;
	}

}
