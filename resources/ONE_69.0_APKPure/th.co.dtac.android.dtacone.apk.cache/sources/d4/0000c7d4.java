package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* renamed from: gb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20115gb2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f62212a;

    /* renamed from: b */
    public final /* synthetic */ String f62213b;

    /* renamed from: c */
    public final /* synthetic */ zzb f62214c;

    public RunnableC20115gb2(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f62214c = zzbVar;
        this.f62212a = lifecycleCallback;
        this.f62213b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.f62214c;
        i = zzbVar.f44970b;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f62212a;
            bundle = zzbVar.f44971c;
            if (bundle != null) {
                String str = this.f62213b;
                bundle3 = zzbVar.f44971c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.f62214c.f44970b;
        if (i2 >= 2) {
            this.f62212a.onStart();
        }
        i3 = this.f62214c.f44970b;
        if (i3 >= 3) {
            this.f62212a.onResume();
        }
        i4 = this.f62214c.f44970b;
        if (i4 >= 4) {
            this.f62212a.onStop();
        }
        i5 = this.f62214c.f44970b;
        if (i5 >= 5) {
            this.f62212a.onDestroy();
        }
    }
}