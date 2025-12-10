package ch.qos.logback.core.helpers;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Transform {

    /* renamed from: a */
    public static final int f39752a = 3;

    /* renamed from: b */
    public static final Pattern f39753b = Pattern.compile("[\u0000-\b\u000b\f\u000e-\u001f<>&'\"]");

    public static void appendEscapingCDATA(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf("]]>");
        if (indexOf < 0) {
            sb.append(str);
            return;
        }
        int i = 0;
        while (indexOf > -1) {
            sb.append(str.substring(i, indexOf));
            sb.append("]]>]]&gt;<![CDATA[");
            i = f39752a + indexOf;
            if (i >= str.length()) {
                return;
            }
            indexOf = str.indexOf("]]>", i);
        }
        sb.append(str.substring(i));
    }

    public static String escapeTags(String str) {
        return (str == null || str.length() == 0 || !f39753b.matcher(str).find()) ? str : escapeTags(new StringBuffer(str));
    }

    public static String escapeTags(StringBuffer stringBuffer) {
        int i;
        String str;
        for (int i2 = 0; i2 < stringBuffer.length(); i2++) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r') {
                if (charAt == '\"') {
                    i = i2 + 1;
                    str = "&quot;";
                } else if (charAt == '<') {
                    i = i2 + 1;
                    str = "&lt;";
                } else if (charAt == '>') {
                    i = i2 + 1;
                    str = "&gt;";
                } else if (charAt == '&') {
                    i = i2 + 1;
                    str = "&amp;";
                } else if (charAt == '\'') {
                    i = i2 + 1;
                    str = "&#39;";
                } else if (charAt < ' ') {
                    i = i2 + 1;
                    str = "�";
                }
                stringBuffer.replace(i2, i, str);
            }
        }
        return stringBuffer.toString();
    }
}