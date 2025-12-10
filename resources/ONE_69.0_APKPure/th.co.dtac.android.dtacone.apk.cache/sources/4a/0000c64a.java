package p000;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* renamed from: ey1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19837ey1 {

    /* renamed from: d */
    public static final long f61736d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f61737e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final Utils f61738a = Utils.getInstance();

    /* renamed from: b */
    public long f61739b;

    /* renamed from: c */
    public int f61740c;

    /* renamed from: c */
    public static boolean m31574c(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m31573d(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized long m31576a(int i) {
        if (!m31574c(i)) {
            return f61736d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f61740c) + this.f61738a.getRandomDelayForSyncPrevention(), f61737e);
    }

    /* renamed from: b */
    public synchronized boolean m31575b() {
        boolean z;
        if (this.f61740c != 0) {
            if (this.f61738a.currentTimeInMillis() <= this.f61739b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: e */
    public final synchronized void m31572e() {
        this.f61740c = 0;
    }

    /* renamed from: f */
    public synchronized void m31571f(int i) {
        if (m31573d(i)) {
            m31572e();
            return;
        }
        this.f61740c++;
        this.f61739b = this.f61738a.currentTimeInMillis() + m31576a(i);
    }
}