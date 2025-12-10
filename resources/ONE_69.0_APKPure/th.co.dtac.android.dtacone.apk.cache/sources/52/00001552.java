package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.tasks.zza;
import java.util.concurrent.Executor;

/* renamed from: WK2 */
/* loaded from: classes4.dex */
public final class WK2 implements Executor {

    /* renamed from: a */
    public final Handler f7260a = new zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7260a.post(runnable);
    }
}