package p000;

import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: pd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC21616pd2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f76637a;

    public CallableC21616pd2(FirebaseAnalytics firebaseAnalytics) {
        this.f76637a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzee zzeeVar;
        zzeeVar = this.f76637a.f54543a;
        return zzeeVar.zzk();
    }
}
