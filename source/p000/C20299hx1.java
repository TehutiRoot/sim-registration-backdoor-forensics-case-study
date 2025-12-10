package p000;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* renamed from: hx1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20299hx1 {

    /* renamed from: d */
    public static final long f62663d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f62664e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final Utils f62665a = Utils.getInstance();

    /* renamed from: b */
    public long f62666b;

    /* renamed from: c */
    public int f62667c;

    /* renamed from: c */
    public static boolean m30700c(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m30699d(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized long m30702a(int i) {
        if (!m30700c(i)) {
            return f62663d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f62667c) + this.f62665a.getRandomDelayForSyncPrevention(), f62664e);
    }

    /* renamed from: b */
    public synchronized boolean m30701b() {
        boolean z;
        if (this.f62667c != 0) {
            if (this.f62665a.currentTimeInMillis() <= this.f62666b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: e */
    public final synchronized void m30698e() {
        this.f62667c = 0;
    }

    /* renamed from: f */
    public synchronized void m30697f(int i) {
        if (m30699d(i)) {
            m30698e();
            return;
        }
        this.f62667c++;
        this.f62666b = this.f62665a.currentTimeInMillis() + m30702a(i);
    }
}
