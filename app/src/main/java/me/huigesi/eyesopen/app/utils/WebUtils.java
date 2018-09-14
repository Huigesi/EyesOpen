package me.huigesi.eyesopen.app.utils;

import android.content.Context;
import android.content.res.Resources;

import me.huigesi.eyesopen.R;

public class WebUtils {
    public static String getClearAdDivJs(Context context) {
        String js = "javascript:";
        Resources res = context.getResources();
        String[] adDivs = res.getStringArray(R.array.adBlockDiv);
        for (int i = 0; i < adDivs.length; i++) {
            js += "var elements = document.getElementsByClassName('" + adDivs[i] + "');\n" +
                    "while(elements.length > 0){\n" +
                    "elements[0].parentNode.removeChild(elements[0]);\n" +
                    "}";
        }
        return js;
    }
}
