
public class CateringBillExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CateringBill bil = new CateringBill();
		bil.setPlateCount(5);
		bil.setRateperplate(30);
		System.out.println("Generate bill amount without discount: " +bil.generateBill());
		System.out.println("Generate bill amount with discount: " +bil.generateBill(25));
		

	}

}
