package timkiemxau;

import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {
        String content = "con mèo hôm nay đi dạo. Lọ đường. Rồi đi chơi. Bác đang dạy các con học bài";
        String keywords = "con đang học";
        ArrayList<String> result = new ArrayList<>();
        //xâu keyword có thuộc content không? nếu có in ra result theo y/c của thầy
        if(content.contains(keywords)==true) result = splitKeywords(keywords);
        else result = search(content, keywords);
        
        if (result!=null){
	        for (int i=0;i<result.size();i++) {
	            if (!result.get(i).equals("")) {
	                if (i%2==0) System.out.print(result.get(i)+" ");
	                else {
	                	System.out.print(result.get(i));
	                	 if(i<result.size()-1) System.out.print(" ... ");
	                }
	            }
	        }
        }
    }

    private static  ArrayList<String> search(String content, String keywords) {
        ArrayList<String> listKeyword = splitKeywords(keywords);
        ArrayList<String> listContentWords = splitContent(content);
        ArrayList<String> result = new ArrayList<>();
        int begin=0;
        for (int k = 0; k < listKeyword.size(); k++) {
            int check=0;
            for (int c = begin; c < listContentWords.size(); c++) {
            	String tmpContentWords = listContentWords.get(c).trim();
            	int i=tmpContentWords.length()-1;
        		//loai bo cac dau cau
            	if(i>=0){
        			while( (tmpContentWords.charAt(i)=='.')||(tmpContentWords.charAt(i)==',')||(tmpContentWords.charAt(i)=='!')||(tmpContentWords.charAt(i)==':')
        					||(tmpContentWords.charAt(i)=='?')||(tmpContentWords.charAt(i)==';')||(tmpContentWords.charAt(i)=='"')||(tmpContentWords.charAt(i)==')')){
        				tmpContentWords = tmpContentWords.substring(0, i);
        				i--;
        				if(i==-1) break;
        			}
        		}
                //System.out.print(tmpContentWords);
            	if (listKeyword.get(k).equals(tmpContentWords)) {
                	check=1; 
                	//System.out.println("listKeyword.get(k): "+listKeyword.get(k)+" listContentWords.get(c):"+listContentWords.get(c)+" check=1"+" c="+c);
                    int match = c;
                    if (match - 1 >= 0) {
                        result.add(listContentWords.get(match-1));
                        result.add(listContentWords.get(match));
                    } else if (match + 1 < listContentWords.size()) {
                        result.add(listContentWords.get(match));
                        result.add(listContentWords.get(match+1));
                    }
                    begin=c;
                    break;
                }
            }
            if(check==0) {System.out.println("khong tim thay :( "); return null;}
        }
        return result;
    }

    private static ArrayList<String> splitKeywords(String keywords) {
        String[] str;
        ArrayList<String> listKeyword = new ArrayList<>();
        str = keywords.split(" ");
        for (String s : str) {
            if (!s.equals("")) {
                listKeyword.add(s);
            }
        }
        return listKeyword;
    }

    private static ArrayList<String> splitContent(String content) {
        String[] str;
        ArrayList<String> words = new ArrayList<>();
        str = content.split(" ");
        for (String s : str) {
            if (!s.equals("")) {
                words.add(s);
            }
        }
        return words;
    }
}