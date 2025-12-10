package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* renamed from: ZJ2 */
/* loaded from: classes4.dex */
public final class ZJ2 implements Executor {

    /* renamed from: a */
    public final Handler f8014a = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8014a.post(runnable);
    }
}
