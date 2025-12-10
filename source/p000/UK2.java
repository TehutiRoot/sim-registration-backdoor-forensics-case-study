package p000;

import android.util.Log;

/* renamed from: UK2 */
/* loaded from: classes3.dex */
public class UK2 {

    /* renamed from: e */
    public static final UK2 f6285e = new UK2(true, 3, 1, null, null);

    /* renamed from: a */
    public final boolean f6286a;

    /* renamed from: b */
    public final String f6287b;

    /* renamed from: c */
    public final Throwable f6288c;

    /* renamed from: d */
    public final int f6289d;

    public UK2(boolean z, int i, int i2, String str, Throwable th2) {
        this.f6286a = z;
        this.f6289d = i;
        this.f6287b = str;
        this.f6288c = th2;
    }

    /* renamed from: b */
    public static UK2 m66070b() {
        return f6285e;
    }

    /* renamed from: c */
    public static UK2 m66069c(String str) {
        return new UK2(false, 1, 5, str, null);
    }

    /* renamed from: d */
    public static UK2 m66068d(String str, Throwable th2) {
        return new UK2(false, 1, 5, str, th2);
    }

    /* renamed from: f */
    public static UK2 m66066f(int i) {
        return new UK2(true, i, 1, null, null);
    }

    /* renamed from: g */
    public static UK2 m66065g(int i, int i2, String str, Throwable th2) {
        return new UK2(false, i, i2, str, th2);
    }

    /* renamed from: a */
    public String mo30885a() {
        return this.f6287b;
    }

    /* renamed from: e */
    public final void m66067e() {
        if (!this.f6286a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f6288c != null) {
                mo30885a();
            } else {
                mo30885a();
            }
        }
    }
}
