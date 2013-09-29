/**
 * @author ZZB
 * @created 2013-7-2 PM 2:38:48
 */
class DateDemos{
	
	
	/**
	 * Description:根据毫秒数获取月份 
	 * @created 2013-9-29 下午12:03:30 
	 * @author ZZB
	 */
	public static int getMonth(long millis){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.get(Calendar.MONTH) + 1;
	}
	/**
	 * Description:根据毫秒数获取年份 
	 * @created 2013-9-29 下午12:15:47 
	 * @author ZZB
	 */
	public static int getYear(long millis){
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.get(Calendar.YEAR);
	}
	public static void main(String[] args) {
		
		/*2013-07-02*/
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(new Date()));

		/*convert date to timemillis*/
		String date1 = "2013/7/5";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/M/d");
		//output:1372953600000
		System.out.println(sdf2.parse(date1).getTime());

		/*获取每天零时毫秒数 2013-07-12 --> 1373558400000*/
		Date date = new Date();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf3.parse(sdf.format(date)).getTime());
		
		/*转换毫秒为时分秒*/
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm:ss");
		sdf4.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
		String hms = sdf4.format(ms);
		System.out.println(hms);  
	}
}