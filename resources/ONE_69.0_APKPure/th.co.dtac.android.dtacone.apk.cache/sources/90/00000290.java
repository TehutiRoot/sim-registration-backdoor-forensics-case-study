package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

/* renamed from: Cg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC17434Cg2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LifecycleCallback f811a;

    /* renamed from: b */
    public final /* synthetic */ String f812b;

    /* renamed from: c */
    public final /* synthetic */ zzd f813c;

    public RunnableC17434Cg2(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.f813c = zzdVar;
        this.f811a = lifecycleCallback;
        this.f812b = str;
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
        zzd zzdVar = this.f813c;
        i = zzdVar.f44974b;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f811a;
            bundle = zzdVar.f44975c;
            if (bundle != null) {
                String str = this.f812b;
                bundle3 = zzdVar.f44975c;
                bundle2 = bundle3.getBundle(str);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i2 = this.f813c.f44974b;
        if (i2 >= 2) {
            this.f811a.onStart();
        }
        i3 = this.f813c.f44974b;
        if (i3 >= 3) {
            this.f811a.onResume();
        }
        i4 = this.f813c.f44974b;
        if (i4 >= 4) {
            this.f811a.onStop();
        }
        i5 = this.f813c.f44974b;
        if (i5 >= 5) {
            this.f811a.onDestroy();
        }
    }
}