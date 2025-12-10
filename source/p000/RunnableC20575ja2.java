package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzb;

/* renamed from: ja2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC20575ja2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f67305a;

    /* renamed from: b */
    public final /* synthetic */ String f67306b;

    /* renamed from: c */
    public final /* synthetic */ zzb f67307c;

    public RunnableC20575ja2(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f67307c = zzbVar;
        this.f67305a = lifecycleCallback;
        this.f67306b = str;
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
        zzb zzbVar = this.f67307c;
        i = zzbVar.f44958b;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f67305a;
            bundle = zzbVar.f44959c;
            if (bundle != null) {
                String str = this.f67306b;
                bundle3 = zzbVar.f44959c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.f67307c.f44958b;
        if (i2 >= 2) {
            this.f67305a.onStart();
        }
        i3 = this.f67307c.f44958b;
        if (i3 >= 3) {
            this.f67305a.onResume();
        }
        i4 = this.f67307c.f44958b;
        if (i4 >= 4) {
            this.f67305a.onStop();
        }
        i5 = this.f67307c.f44958b;
        if (i5 >= 5) {
            this.f67305a.onDestroy();
        }
    }
}
