package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzev;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: Lm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18037Lm2 implements zzev {

    /* renamed from: b */
    public static final zzev f3687b = new C18037Lm2(null);

    /* renamed from: c */
    public static final Logger f3688c = Logger.getLogger(C18037Lm2.class.getName());

    /* renamed from: a */
    public final Object f3689a;

    public C18037Lm2(Object obj) {
        this.f3689a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3689a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f3689a);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f3689a;
    }
}