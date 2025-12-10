package th.p047co.dtac.android.dtacone.util.string;

/* renamed from: th.co.dtac.android.dtacone.util.string.StringEscapeUtils */
/* loaded from: classes8.dex */
public class StringEscapeUtils {
    public static String escapeString(String str) {
        char[] charArray;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= ' ' && c <= '~') {
                sb.append(c);
            } else {
                sb.append(String.format("\\u%04X", Integer.valueOf(c)));
            }
        }
        return sb.toString();
    }
}