package timkiemxau;

import java.util.ArrayList;

public class Search {

    public static void main(String[] args) {
        String content = "con    mèo hôm nay đi dạo. Lọ đường. Rồi đi chơi. Bác đang dạy các con học bài";
        String keywords = "mèo đang học";
        System.out.println( search(content,keywords) );
    }

    private static  boolean search(String content, String keywords) {
        ArrayList<String> listKeyword = splitKeywords(keywords);
        ArrayList<String> listContentWords = splitContent(content);
        int begin=0;
        for (int k = 0; k < listKeyword.size(); k++) {
            int check=0;
            for (int c = begin; c < listContentWords.size(); c++) {
            	String tmpContentWords = listContentWords.get(c).trim().toLowerCase();
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
            	if (listKeyword.get(k).equals(tmpContentWords)) {
                	check=1; 
                	begin=c+1;
                    break;
                }
            }
            if(check==0) return false;
        }
        return true;
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