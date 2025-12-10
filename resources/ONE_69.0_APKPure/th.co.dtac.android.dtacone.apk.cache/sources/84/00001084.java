package p000;

import android.util.Log;

/* renamed from: RL2 */
/* loaded from: classes3.dex */
public class RL2 {

    /* renamed from: e */
    public static final RL2 f5486e = new RL2(true, 3, 1, null, null);

    /* renamed from: a */
    public final boolean f5487a;

    /* renamed from: b */
    public final String f5488b;

    /* renamed from: c */
    public final Throwable f5489c;

    /* renamed from: d */
    public final int f5490d;

    public RL2(boolean z, int i, int i2, String str, Throwable th2) {
        this.f5487a = z;
        this.f5490d = i;
        this.f5488b = str;
        this.f5489c = th2;
    }

    /* renamed from: b */
    public static RL2 m66665b() {
        return f5486e;
    }

    /* renamed from: c */
    public static RL2 m66664c(String str) {
        return new RL2(false, 1, 5, str, null);
    }

    /* renamed from: d */
    public static RL2 m66663d(String str, Throwable th2) {
        return new RL2(false, 1, 5, str, th2);
    }

    /* renamed from: f */
    public static RL2 m66661f(int i) {
        return new RL2(true, i, 1, null, null);
    }

    /* renamed from: g */
    public static RL2 m66660g(int i, int i2, String str, Throwable th2) {
        return new RL2(false, i, i2, str, th2);
    }

    /* renamed from: a */
    public String mo31711a() {
        return this.f5488b;
    }

    /* renamed from: e */
    public final void m66662e() {
        if (!this.f5487a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f5489c != null) {
                mo31711a();
            } else {
                mo31711a();
            }
        }
    }
}