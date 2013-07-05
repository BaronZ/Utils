/**
 * @author ZZB
 * @created 2013-7-2 PM 2:38:48
 */
class DateDemos{
	
	public static void main(String[] args) {
		
		/*2013-07-02*/
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(new Date()));

		/*convert date to timemillis*/
		String date1 = "2013/7/5";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/M/d");
		//output:1372953600000
		System.out.println(sdf2.parse(date1).getTime());		
	}
}