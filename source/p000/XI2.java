package p000;

import com.google.android.gms.internal.firebase_ml.zzrc;
import java.util.concurrent.Callable;

/* renamed from: XI2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class XI2 implements Callable {

    /* renamed from: a */
    public final zzrc f7450a;

    public XI2(zzrc zzrcVar) {
        this.f7450a = zzrcVar;
    }

    /* renamed from: a */
    public static Callable m65525a(zzrc zzrcVar) {
        return new XI2(zzrcVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f7450a.zzpd();
    }
}
