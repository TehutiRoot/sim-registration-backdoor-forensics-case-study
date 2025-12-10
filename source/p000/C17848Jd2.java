package p000;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: Jd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17848Jd2 extends Thread {

    /* renamed from: a */
    public final WeakReference f2848a;

    /* renamed from: b */
    public final long f2849b;

    /* renamed from: c */
    public final CountDownLatch f2850c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f2851d = false;

    public C17848Jd2(AdvertisingIdClient advertisingIdClient, long j) {
        this.f2848a = new WeakReference(advertisingIdClient);
        this.f2849b = j;
        start();
    }

    /* renamed from: a */
    public final void m67730a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f2848a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f2851d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f2850c.await(this.f2849b, TimeUnit.MILLISECONDS)) {
                m67730a();
            }
        } catch (InterruptedException unused) {
            m67730a();
        }
    }
}
