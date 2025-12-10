package p000;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: Ge2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17688Ge2 extends Thread {

    /* renamed from: a */
    public final WeakReference f2028a;

    /* renamed from: b */
    public final long f2029b;

    /* renamed from: c */
    public final CountDownLatch f2030c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f2031d = false;

    public C17688Ge2(AdvertisingIdClient advertisingIdClient, long j) {
        this.f2028a = new WeakReference(advertisingIdClient);
        this.f2029b = j;
        start();
    }

    /* renamed from: a */
    public final void m68262a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f2028a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f2031d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f2030c.await(this.f2029b, TimeUnit.MILLISECONDS)) {
                m68262a();
            }
        } catch (InterruptedException unused) {
            m68262a();
        }
    }
}