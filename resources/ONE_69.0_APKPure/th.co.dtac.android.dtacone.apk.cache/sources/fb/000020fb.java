package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class SharedByteBuffer implements Closeable {

    /* renamed from: a */
    public final ByteBuffer f11954a;

    /* renamed from: b */
    public final int f11955b;

    /* renamed from: c */
    public final Object f11956c;

    /* renamed from: d */
    public final Pair f11957d;

    /* renamed from: e */
    public final AtomicInteger f11958e;

    /* renamed from: f */
    public boolean f11959f;

    /* renamed from: b */
    public final void m62153b(String str) {
        if (!this.f11959f) {
            return;
        }
        throw new IllegalStateException("Cannot call " + str + " on a closed SharedByteBuffer.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m62152d();
    }

    /* renamed from: d */
    public final boolean m62152d() {
        synchronized (this.f11956c) {
            try {
                if (this.f11959f) {
                    return false;
                }
                this.f11959f = true;
                int decrementAndGet = this.f11958e.decrementAndGet();
                if (Logger.isDebugEnabled("SharedByteBuffer")) {
                    if (decrementAndGet >= 0) {
                        Logger.m63178d("SharedByteBuffer", String.format(Locale.US, "Ref count decremented: %d [%s]", Integer.valueOf(decrementAndGet), toString()));
                    } else {
                        throw new AssertionError("Invalid ref count. close() should never produce a ref count below 0");
                    }
                }
                if (decrementAndGet == 0) {
                    if (Logger.isDebugEnabled("SharedByteBuffer")) {
                        Logger.m63178d("SharedByteBuffer", String.format(Locale.US, "Final reference released. Running final close action. [%s]", toString()));
                    }
                    try {
                        ((Executor) Preconditions.checkNotNull((Executor) this.f11957d.first)).execute((Runnable) Preconditions.checkNotNull((Runnable) this.f11957d.second));
                    } catch (RejectedExecutionException e) {
                        Logger.m63175e("SharedByteBuffer", String.format(Locale.US, "Unable to execute final close action. [%s]", toString()), e);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            if (m62152d()) {
                Logger.m63171w("SharedByteBuffer", String.format(Locale.US, "SharedByteBuffer closed by finalizer, but should have been closed manually with SharedByteBuffer.close() [%s]", toString()));
            }
        } finally {
            super.finalize();
        }
    }

    @NonNull
    public ByteBuffer get() {
        ByteBuffer byteBuffer;
        synchronized (this.f11956c) {
            m62153b("get()");
            byteBuffer = this.f11954a;
        }
        return byteBuffer;
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]", this.f11954a, Integer.valueOf(this.f11955b), Integer.valueOf(System.identityHashCode(this)));
    }
}