package section04;

public class conditional05 {
	public static void main(String[] args) {
		String rtCd = "02";
		switch(rtCd) {
		case "01" : 
		case "02" : 
		case "04" :
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드 : " + rtCd);
		}
		if(rtCd == "01" || rtCd == "02" || rtCd == "04") {
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드 : " + rtCd);
		}
	}
}
