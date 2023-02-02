
public class CateringBill {
	private int plateCount;
	private int ratePerplate;


	public int getPlateCount() {
		return plateCount;
	}
	public void setPlateCount(int plateCount) {
		this.plateCount = plateCount;
	}
	public int getRateperplate() {
		return ratePerplate;
	}
	public void setRateperplate(int rateperplate) {
		this.ratePerplate = rateperplate;
	}
	public int generateBill()
	{
		int bill= plateCount*ratePerplate;
		return bill;
	}
	public int generateBill(int discountPercent) {
		int bill=generateBill();
		int discountamount=(bill*discountPercent)/100;
		int amountafterdiscount=generateBill()-discountamount;
		return amountafterdiscount;
		
	}
		
		
	


}
