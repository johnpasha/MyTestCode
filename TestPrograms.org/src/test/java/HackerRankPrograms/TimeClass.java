package HackerRankPrograms;

public class TimeClass {

	public static void main(String[] args) {
			System.out.println(timeConversion("07:05:45AM"));
		}
	
	static String timeConversion(String s) {
		int hr = Integer.parseInt(s.substring(0,s.indexOf(":")));

		if(hr==12 && s.indexOf("PM") != -1) {
			return s.replace("PM", "");
		}
		else if(hr==12 && s.indexOf("AM") != -1) {
			return "00"+s.substring(2).replace("AM", "");
		}else if(hr!=12 && s.indexOf("PM") != -1) {
			hr+=12;
			return hr+s.substring(2).replace("PM", "");
		}else if(hr!=12 && s.indexOf("AM") != -1) {
			s=hr+s.substring(2).replace("AM", "");
			if(s.length()<8) {
				s="0"+s;
			}
			return s;
		}
		else return s;

    }

}
