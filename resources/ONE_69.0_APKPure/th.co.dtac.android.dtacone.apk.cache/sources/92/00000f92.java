package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.TaskQueue;
import com.google.mlkit.common.sdkinternal.zzw;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: QL2 */
/* loaded from: classes4.dex */
public final class QL2 implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ TaskQueue f5209a;

    public /* synthetic */ QL2(TaskQueue taskQueue, zzw zzwVar) {
        AtomicReference atomicReference;
        boolean z;
        this.f5209a = taskQueue;
        atomicReference = taskQueue.f56945d;
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
        atomicReference = this.f5209a.f56945d;
        atomicReference.set(null);
        this.f5209a.m37222c();
    }
}