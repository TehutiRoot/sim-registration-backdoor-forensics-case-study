package p000;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: Wq2 */
/* loaded from: classes3.dex */
public final class Wq2 {

    /* renamed from: b */
    public static final Wq2 f7311b = new Wq2();

    /* renamed from: a */
    public final String f7312a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Wq2() {
        /*
            r4 = this;
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "9"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L11
            java.lang.String r0 = "9.0.0"
            goto L15
        L11:
            java.lang.String r0 = m65551e(r0)
        L15:
            com.google.android.gms.internal.firebase_ml.zzmq r1 = com.google.android.gms.internal.firebase_ml.zzmq.OS_NAME
            java.lang.String r1 = r1.value()
            com.google.android.gms.internal.firebase_ml.zzmq r2 = com.google.android.gms.internal.firebase_ml.zzmq.OS_VERSION
            java.lang.String r2 = r2.value()
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzgc.VERSION
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Wq2.<init>():void");
    }

    /* renamed from: a */
    public static Wq2 m65555a() {
        return f7311b;
    }

    /* renamed from: d */
    public static String m65552d(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* renamed from: e */
    public static String m65551e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return str;
    }

    /* renamed from: c */
    public final String m65553c(String str) {
        return String.format(this.f7312a, m65552d(str));
    }

    public Wq2(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(m65551e(str));
        sb.append(" http-google-%s/");
        sb.append(m65551e(str4));
        if (str2 != null && str3 != null) {
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(m65552d(str2));
            sb.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb.append(m65551e(str3));
        }
        this.f7312a = sb.toString();
    }
}
