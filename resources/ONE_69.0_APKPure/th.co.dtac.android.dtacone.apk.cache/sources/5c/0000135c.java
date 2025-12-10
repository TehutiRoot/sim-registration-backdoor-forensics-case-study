package p000;

import com.google.android.gms.internal.firebase_ml.zzrc;
import java.util.concurrent.Callable;

/* renamed from: UJ2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class UJ2 implements Callable {

    /* renamed from: a */
    public final zzrc f6608a;

    public UJ2(zzrc zzrcVar) {
        this.f6608a = zzrcVar;
    }

    /* renamed from: a */
    public static Callable m66212a(zzrc zzrcVar) {
        return new UJ2(zzrcVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f6608a.zzpd();
    }
}