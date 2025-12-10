package p000;

import com.google.android.gms.internal.mlkit_vision_barcode.zzev;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: Ol2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18192Ol2 implements zzev {

    /* renamed from: b */
    public static final zzev f4488b = new C18192Ol2(null);

    /* renamed from: c */
    public static final Logger f4489c = Logger.getLogger(C18192Ol2.class.getName());

    /* renamed from: a */
    public final Object f4490a;

    public C18192Ol2(Object obj) {
        this.f4490a = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4490a;
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
        String valueOf = String.valueOf(this.f4490a);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f4490a;
    }
}
