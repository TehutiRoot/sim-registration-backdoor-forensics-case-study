package p000;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Eg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17564Eg2 {

    /* renamed from: a */
    public static final Pattern f1417a = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    /* renamed from: a */
    public static String m68614a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f1417a.matcher(str);
            StringBuilder sb = null;
            int i = 0;
            while (matcher.find()) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int start = matcher.start();
                int i2 = start;
                while (i2 >= 0 && str.charAt(i2) == '\\') {
                    i2--;
                }
                if ((start - i2) % 2 != 0) {
                    int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                    sb.append((CharSequence) str, i, matcher.start());
                    if (parseInt == 92) {
                        sb.append("\\\\");
                    } else {
                        sb.append(Character.toChars(parseInt));
                    }
                    i = matcher.end();
                }
            }
            if (sb != null) {
                if (i < matcher.regionEnd()) {
                    sb.append((CharSequence) str, i, matcher.regionEnd());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}