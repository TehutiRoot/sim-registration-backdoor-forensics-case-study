package p000;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: A12 */
/* loaded from: classes6.dex */
public abstract class A12 {

    /* renamed from: a */
    public static final String[] f4a = new String[0];

    /* renamed from: a */
    public static boolean m69336a(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m69335b(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m69334c(String str) {
        if (m69336a(str)) {
            return str;
        }
        int length = str.length();
        if (length > 1 && str.startsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE) && str.endsWith(OperatorName.SHOW_TEXT_LINE_AND_SPACE)) {
            int i = length - 1;
            if (str.substring(1, i).indexOf(34) == -1) {
                return str.substring(1, i);
            }
            return str;
        }
        return str;
    }

    /* renamed from: d */
    public static String m69333d(String str) {
        if (m69336a(str)) {
            return str;
        }
        if (str.startsWith(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
            return str.substring(2);
        }
        if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            return str.substring(1);
        }
        return str;
    }
}