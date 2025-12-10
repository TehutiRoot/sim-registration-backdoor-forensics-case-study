package p000;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: Tr2 */
/* loaded from: classes3.dex */
public final class Tr2 {

    /* renamed from: b */
    public static final Tr2 f6437b = new Tr2();

    /* renamed from: a */
    public final String f6438a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Tr2() {
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
            java.lang.String r0 = m66294e(r0)
        L15:
            com.google.android.gms.internal.firebase_ml.zzmq r1 = com.google.android.gms.internal.firebase_ml.zzmq.OS_NAME
            java.lang.String r1 = r1.value()
            com.google.android.gms.internal.firebase_ml.zzmq r2 = com.google.android.gms.internal.firebase_ml.zzmq.OS_VERSION
            java.lang.String r2 = r2.value()
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzgc.VERSION
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Tr2.<init>():void");
    }

    /* renamed from: a */
    public static Tr2 m66298a() {
        return f6437b;
    }

    /* renamed from: d */
    public static String m66295d(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", HelpFormatter.DEFAULT_OPT_PREFIX);
    }

    /* renamed from: e */
    public static String m66294e(String str) {
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
    public final String m66296c(String str) {
        return String.format(this.f6438a, m66295d(str));
    }

    public Tr2(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(m66294e(str));
        sb.append(" http-google-%s/");
        sb.append(m66294e(str4));
        if (str2 != null && str3 != null) {
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            sb.append(m66295d(str2));
            sb.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb.append(m66294e(str3));
        }
        this.f6438a = sb.toString();
    }
}