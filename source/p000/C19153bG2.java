package p000;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: bG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19153bG2 extends FutureTask {

    /* renamed from: a */
    public final /* synthetic */ RH2 f38992a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19153bG2(RH2 rh2, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f38992a = rh2;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        uncaughtExceptionHandler = this.f38992a.f5316a.f44424f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        } else if (Log.isLoggable("GAv4", 6)) {
            "MeasurementExecutor: job failed with ".concat(String.valueOf(th2));
        }
        super.setException(th2);
    }
}
