
package as;
import java.util.Scanner;
public class XC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:" );
		int n1 = sc.nextInt();
		for (int i = 0 ; i<= 2; i++) {

			System.out.print("請再輸入一次密碼:" );
			int n2 = sc.nextInt();
			if  (n1 == n2) {
				System.out.print("密碼正確");
				break;
			}
			if (n1 != n2)
				System.out.println("與第一次輸入不同");
			}
			throw  new  RuntimeException("輸入三次錯誤！程式停止！");
			
			
		
	

}
}
