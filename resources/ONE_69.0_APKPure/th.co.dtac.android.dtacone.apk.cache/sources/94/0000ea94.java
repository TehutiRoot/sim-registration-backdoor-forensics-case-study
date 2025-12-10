package p000;

import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* renamed from: me2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC21162me2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAnalytics f72081a;

    public CallableC21162me2(FirebaseAnalytics firebaseAnalytics) {
        this.f72081a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzee zzeeVar;
        zzeeVar = this.f72081a.f54555a;
        return zzeeVar.zzk();
    }
}