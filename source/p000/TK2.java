package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.mlkit.common.sdkinternal.zzw;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: TK2 */
/* loaded from: classes4.dex */
public final class TK2 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ TaskQueue f5993a;

    public /* synthetic */ TK2(TaskQueue taskQueue, zzw zzwVar) {
        AtomicReference atomicReference;
        boolean z;
        this.f5993a = taskQueue;
        atomicReference = taskQueue.f56933d;
        if (((Thread) atomicReference.getAndSet(Thread.currentThread())) == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f5993a.f56933d;
        atomicReference.set(null);
        this.f5993a.m37230c();
    }
}
