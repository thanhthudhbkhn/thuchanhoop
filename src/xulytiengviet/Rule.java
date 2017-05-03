package xulytiengviet;

import java.util.Arrays;

public class Rule {
	public final int SL_NGUYEN_AM_MAX = 3;
	public final int SL_NGUYEN_AM_MIN = 1;
	public final int SL_PHU_AM_MAX = 5;
	public final int SL_PHU_AM_MIN = 0;
	public final static String[] phuAmCuoi={"c", "ng", "nh", "ch", "m", "n", "p", "t",""};
    public final static String[] notPhuAmCuoi = { "b", "d", "đ","g","h", "k", "l", "q",
    												"r", "s","v", "x","gh","gi","kh","ph","q",
    												"th","tr","ngh","c", "ng", "nh", "ch", "m",
    												"n", "p", "t","gi",""};
    public final static String[] nguyenAm = {
            "a", "à", "á", "ả", "ã", "ạ",
            "ai","ài","ái","ải","ãi","ại",
            "ao","ào","áo","ảo","ão","ạo",
            "au","àu","áu","ảu","ạu",
            "ay","ày","áy","ảy","ãy","ạy",
            "ă", "ằ", "ắ", "ẳ", "ẵ", "ặ",
            "â", "ầ", "ấ", "ẩ", "ẫ", "ậ",
            "âu","ầu","ấu","ẩu","ẫu","ậu",
            "ây","ầy","ấy","ẩy","ẫy","ậy",
            "e", "è", "é", "ẻ", "ẽ", "ẹ",
            "eo","èo","éo","ẻo","ẽo","ẹo",
            "ê", "ề", "ế", "ể", "ễ", "ệ",
            "êu","ều","ếu","ểu","ễu","ệu",
            "i", "ì", "í", "ỉ", "ĩ", "ị",
            "ia","ìa","ía","ỉa","ĩa","ịa", "ià", "iá", "iả", "iã", "iạ",
            "iê","iề","iế","iể","iễ","iệ",
            "iu","ìu","íu","ỉu","ĩu","ịu",
            "iêu", "iều", "iếu", "iểu", "iễu", "iệu",
            "o", "ò", "ó", "ỏ", "õ", "ọ",
            "oa","oà","oá","oả","oã","oạ","óa","òa","ỏa","õa","ọa",
            "oai", "oài", "oái", "oải", "oãi", "oại",
            "oay", "oày", "oáy", "oảy", "oãy", "oạy",
            "oă","oằ","oắ","oẳ","oẵ","oặ",
            "oe","òe","óe","ỏe","õe","ọe",
            "oi","òi","ói","ỏi","õi","ọi",
            "oo","oò","oó",
            "ô", "ồ", "ố", "ổ", "ỗ", "ộ",
            "ôi","ồi","ối","ổi","ỗi","ội",
            "ơ", "ờ", "ớ", "ở", "ỡ", "ợ",
            "ơi","ời","ới","ởi","ỡi","ợi",
            "u", "ù", "ú", "ủ", "ũ", "ụ",
            "ua","ùa","úa","ủa","ũa","ụa","uà","uá","uả","uã","uạ",
            "uài","uái","uải","uãi","uại",
            "uay","uày","uáy","uảy","uãy","uạy",
            "uâ","uầ","uấ","uẩ","uẫ","uậ",
            "uây", "uầy", "uấy", "uẩy", "uẫy", "uậy",
            "ui", "ùi", "úi", "ủi", "ũi", "ụi",
            "uê", "uề", "uế", "uể", "uễ", "uệ",
            "uô", "uồ", "uố", "uổ", "uỗ", "uộ",
            "uôi", "uồi", "uối", "uổi", "uỗi", "uội",
            "uơ", "uớ", "uở",
            "uy", "ùy", "úy", "ủy", "ũy", "ụy",
            "uya",
            "uyê", "uyề", "uyế", "uyể", "uyễ", "uyệ",
            "uỷu",
            "ư", "ứ", "ừ", "ử", "ữ", "ự",
            "ưa", "ừa", "ứa", "ửa", "ữa", "ựa",
            "ưi", "ừi", "ứi",
            "ươ", "ườ", "ướ", "ưở", "ưỡ", "ượ",
            "ươi", "ười", "ưới", "ưởi", "ưỡi", "ượi",
            "ươu", "ườu", "ượu",
            "ưu", "ừu", "ứu", "ửu", "ữu", "ựu",
            "y", "ỳ", "ý", "ỷ", "ỹ", "ỵ",
            "yê", "yề", "yế", "yể", "yễ", "yệ",
            "yêu", "yều", "yểu"
        };
    public final static char[] nguyenAmDacBiet={'e', 'è', 'é', 'ẻ', 'ẽ', 'ẹ','ê', 'ề', 'ế', 'ể', 'ễ', 'ệ','i', 'ì', 'í', 'ỉ', 'ĩ', 'ị'};
    public final static String[] nguyenAmDauSacvaNang={
        "á","ạ","ắ","ặ","ấ","ậ",
        "é","ẹ","ế","ệ",
        "í","ị","iế","iệ",
        "ó","ọ","oá","oạ","oắ","oặ",
        "óe","ọe","oó","ố","ộ",
        "ớ","ợ",
        "ú","ụ","uấ","uậ","uế","uệ","uố","uộ","uớ",
        "uyế", "uyể", "uyễ", "uyệ",
        "ứ","ự","ướ","ượ",
        "yế","yệ"
    };
    
	public static boolean checkValid(Xau x){
		if (checkDoDai(x)==false) 		return false;	//kiem tra do dai phai <=7
		if (checkCauTruc(x)==false) 	return false;	//kiem tra cau truc p-n-p hop ly khong
		if (checkPhuAmDacBiet(x)==false)return false;	//kiem tra nguyen am di kem voi gh,ngh va g,ng,c
		if (checkPhuAmQ(x)==false) 		return false;	//kiem tra sau q phai la u
		if (checkPhuAmK(x)==false) 		return false;	//kiem tra sau k phai la nguyen am dac biet hoac y
		if (checkNguyenAmDai(x)==false) return false;	//nguyen am dai 3 (trừ "uyê") hoac nguyen am dai 2 duoi i,o,u,y (trừ uy,oo) khong duoc co phu am cuoi
		if (checkNguyenAmNgan(x)==false)return false;	// nguyen am ă va â phai co phu am cuoi
		if (checkPhuAmNgat(x)==false) 	return false;	//kiem tra nguyen am khi phu am la c, ch, p, t
		return true;
	}
	
	public static boolean checkCauTruc(Xau x){
		return x.tachXau();
	}	
	
	public static boolean checkDoDai(Xau x){
		if (x.xau.length()>7) return false;
		return true;
	}	
	
	public static boolean checkPhuAmDacBiet(Xau x){
		if((x.phu_am_dau.compareTo("gh")==0)||(x.phu_am_dau.compareTo("ngh")==0)){
			char tmp= x.xau.charAt(x.phu_am_dau.length());
			return (x.isNguyenAmDacBiet(tmp));
		}
		if((x.phu_am_dau.compareTo("g")==0)||(x.phu_am_dau.compareTo("ng")==0)||(x.phu_am_dau.compareTo("c")==0)){
			char tmp= x.xau.charAt(x.phu_am_dau.length());
			if(x.phu_am_dau.compareTo("g")==0){ //rieng g co the dung truoc i
				if((tmp=='i')||(tmp=='ì')||(tmp=='ỉ')) return true;
			}
			return (!x.isNguyenAmDacBiet(tmp));
		}
		return true;
	}
	
	public static boolean checkPhuAmK(Xau x){
		if (x.phu_am_dau.compareTo("k")==0) {
			char tmp= x.xau.charAt(1);
			if( (x.isNguyenAmDacBiet(tmp)==false)&&(tmp!='y')&&(tmp!='ỳ')&&(tmp!='ý')&&(tmp!='ỷ')&&(tmp!='ỹ')&&(tmp!='ỵ') )
				return false;
		}
		return true;
	}
	
	public static boolean checkPhuAmQ(Xau x){
		if(x.phu_am_dau.compareTo("q")==0){
			char tmp = x.xau.charAt(1);
			if ((tmp!='u')&&(tmp!='ù')&&(tmp!='ú')&&(tmp!='ủ')&&(tmp!='ũ')&&(tmp!='ụ'))
				return false;
			if (x.xau.length()==2) return false;
			if (x.isPhuAm (String.valueOf(x.xau.charAt(2)) )==true) return false;
		}
		return true;
	}
	
	public static boolean checkNguyenAmDai(Xau x){
		if(x.so_nguyen_am==3){
			if((x.nguyen_am.compareTo("uyê")!=0)&&(x.nguyen_am.compareTo("uyề")!=0)&&
					(x.nguyen_am.compareTo("uyế")!=0)&&(x.nguyen_am.compareTo("uyể")!=0)&&
					(x.nguyen_am.compareTo("uyễ")!=0)&&(x.nguyen_am.compareTo("uyệ")!=0)){
				if (x.phu_am_cuoi.compareTo("")!=0) return false;
			}
		}
		if(x.so_nguyen_am==2){
			if ((x.nguyen_am.charAt(1)=='i')||(x.nguyen_am.charAt(1)=='o')||(x.nguyen_am.charAt(1)=='y')||(x.nguyen_am.charAt(1)=='u'))
				if((x.nguyen_am.compareTo("uy")!=0)&&(x.nguyen_am.compareTo("ùy")!=0)&&
						(x.nguyen_am.compareTo("úy")!=0)&&(x.nguyen_am.compareTo("ủy")!=0)&&
						(x.nguyen_am.compareTo("ũy")!=0)&&(x.nguyen_am.compareTo("ụy")!=0)&&(x.nguyen_am.compareTo("oo")!=0))
			if (x.phu_am_cuoi.compareTo("")!=0) return false;
		}
		return true;
	}
	
	public static boolean checkNguyenAmNgan(Xau x){
		if(x.nguyen_am.length()==1){
			if("ăắằẳẵặâấầẩẫậ".contains(x.nguyen_am)==true){
				if(x.phu_am_cuoi.compareTo("")==0) return false;
			}
		}
		return true;
	}
	
	public static boolean checkPhuAmNgat(Xau x){
		if((x.phu_am_cuoi.compareTo("c")==0)||(x.phu_am_cuoi.compareTo("ch")==0)||(x.phu_am_cuoi.compareTo("p")==0)||(x.phu_am_cuoi.compareTo("t")==0)){
			for(int i=0;i<nguyenAmDauSacvaNang.length;i++){
				if (x.nguyen_am.compareTo(nguyenAmDauSacvaNang[i])==0){
					return true;
				}
			}
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Arrays.sort(Rule.nguyenAm);
		Arrays.sort(Rule.phuAmCuoi);
		Arrays.sort(Rule.notPhuAmCuoi);
		Arrays.sort(Rule.nguyenAmDacBiet);
		/*		
		Xau key = new Xau("thanh"); //test 1 từ
		System.out.println(checkValid(key));
		*/
		
		String paragraph = "Cái đạo lý đó, người vốn dĩ tin tưởng hoàn toàn vào kinh điển, không dám thay đổi biến hóa như Giác Viễn không sao hiểu được. Có điều lý lẽ không có gì để chứng minh, Trương Quân Bảo lúc đó tuổi còn nhỏ, cũng không biết chắc là suy định của mình có đúng hay không."; //test 1 đoạn văn
		int i=0,j=0;
		for (i=0;i<paragraph.length();i++){
			if ((i!=0)&&(paragraph.charAt(i)==' ')){
				Xau key = new Xau (paragraph.substring(j, i));
				System.out.println(checkValid(key));
				j=i;
			}
		}
		Xau key = new Xau (paragraph.substring(j, paragraph.length()));
		System.out.println(checkValid(key));
		
	}
}
