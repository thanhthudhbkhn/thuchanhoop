package xulytiengviet;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Arrays.sort(Charcode.nguyenAm);
		Arrays.sort(Charcode.phuAmCuoi);
		Arrays.sort(Charcode.notPhuAmCuoi);
		Arrays.sort(Charcode.nguyenAmDacBiet);
		
		String paragraph = " ???á.hà  huỳnh! an[1]"; //test 1 doan van
		String [] mang;
		mang = paragraph.split(" ");
		for(int i=0;i<mang.length;i++)
			if(mang[i].compareTo("")!=0){
				String tmp=mang[i].trim();
				if(tmp.length()!=0){
					Xau key = new Xau (tmp);
					if( Rule.checkValidToken(key)==false) System.out.println(mang[i]);
				}
			}
	}

}
