/**
 * @author ZZB
 * @created 2013-7-2 PM 2:38:48
 */
class DateDemos{
	
	public static void main(String[] args) {
		
		/*2013-07-02*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(new Date()));
		
	}
}