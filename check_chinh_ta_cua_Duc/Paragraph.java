package com.kimdung.kimdungtronbo.models;

import android.util.Log;

import com.kimdung.kimdungtronbo.Rule.Xau;

import java.io.Serializable;

import static android.text.Html.FROM_HTML_MODE_COMPACT;
import static com.kimdung.kimdungtronbo.Rule.Rule.checkValid;

/**
 * Created by tmd on 02/05/2017.
 */

public class Paragraph implements Serializable {
    private String mContent;
    private static final String TAG = "Paragraph";

    public void clearContentParagraphs() {
        mContent = null;
    }

    public void checkValidParagraph() {
        String mTmpContent = removeHtmlTag();
        String[] mang;
        mang = mTmpContent.split(" ");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i].compareTo("") != 0) {
                String tmp = mang[i].trim();
                if (tmp.length() != 0) {
                    Xau key = new Xau(tmp);
                    boolean result = checkValid(key);
                    if (result == false) {
                        Log.d(TAG, "checkValidParagraph: mTmpContent: \"" + mContent + "\"");
                        Log.d(TAG, "checkValidParagraph: mTmpContent: \"" + mTmpContent + "\"");
                        Log.d(TAG, "checkValidParagraph: key.getXau(): \"" + key.getXau() + "\"");
                        Log.d(TAG, "-_-checkValidParagraph: result: " + result + "\n");
                    }
                }
            }
        }
    }

    private String removeHtmlTag() {
        String mTmpContent;
        // mContent k thay doi
//        Log.d("TAG", "checkValidParagraph: mContent_before: \"" + mContent + "\"");
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            mTmpContent = android.text.Html.fromHtml(mContent, FROM_HTML_MODE_COMPACT).toString();
        } else {
            mTmpContent = android.text.Html.fromHtml(mContent).toString();
        }
//        Log.d("TAG", "checkValidParagraph: mContent_after: \"" + mContent + "\"");
        return mTmpContent;
    }

    public String getContent() {
        return mContent;
    }

    @Override
    public String toString() {
        return mContent;
    }

    public Paragraph(String content) {
        mContent = content;
    }

    public Paragraph bigger() {
        mContent = "<big>" + mContent + "</big>";
        return this;
    }

    public Paragraph smaller() {
        mContent = "<small>" + mContent + "</small>";
        return this;
    }

    public Paragraph bold() {
        mContent = "<b>" + mContent + "</b>";
        return this;
    }

    public Paragraph italic() {
        mContent = "<i>" + mContent + "</i>";
        return this;
    }

    public Paragraph h1() {
        mContent = "<h1>" + mContent + "</h1>";
        return this;
    }

    public Paragraph h2() {
        mContent = "<h2>" + mContent + "</h2>";
        return this;
    }

    public Paragraph h3() {
        mContent = "<h3>" + mContent + "</h3>";
        return this;
    }

    public Paragraph h4() {
        mContent = "<h4>" + mContent + "</h4>";
        return this;
    }

    public Paragraph h5() {
        mContent = "<h5>" + mContent + "</h5>";
        return this;
    }

    public Paragraph h6() {
        mContent = "<h6>" + mContent + "</h6>";
        return this;
    }

    public Paragraph subscript() {
        mContent = "<sub>" + mContent + "</sub>";
        return this;
    }

    public Paragraph superscript() {
        mContent = "<sup>" + mContent + "</sup>";
        return this;
    }

    public Paragraph monospaced() {
        mContent = "<tt>" + mContent + "</tt>";
        return this;
    }

    public Paragraph underLine() {
        mContent = "<u>" + mContent + "</u>";
        return this;
    }
}
