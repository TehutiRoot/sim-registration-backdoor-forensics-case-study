package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* renamed from: Ff2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17598Ff2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f1661a;

    /* renamed from: b */
    public final /* synthetic */ String f1662b;

    /* renamed from: c */
    public final /* synthetic */ zzd f1663c;

    public RunnableC17598Ff2(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f1663c = zzdVar;
        this.f1661a = lifecycleCallback;
        this.f1662b = str;
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
        zzd zzdVar = this.f1663c;
        i = zzdVar.f44962b;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f1661a;
            bundle = zzdVar.f44963c;
            if (bundle != null) {
                String str = this.f1662b;
                bundle3 = zzdVar.f44963c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.f1663c.f44962b;
        if (i2 >= 2) {
            this.f1661a.onStart();
        }
        i3 = this.f1663c.f44962b;
        if (i3 >= 3) {
            this.f1661a.onResume();
        }
        i4 = this.f1663c.f44962b;
        if (i4 >= 4) {
            this.f1661a.onStop();
        }
        i5 = this.f1663c.f44962b;
        if (i5 >= 5) {
            this.f1661a.onDestroy();
        }
    }
}
