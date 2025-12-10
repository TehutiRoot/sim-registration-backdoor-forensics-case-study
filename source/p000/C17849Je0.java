package p000;

import android.media.MediaCodec;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Je0 */
/* loaded from: classes.dex */
public class C17849Je0 implements InputBuffer {

    /* renamed from: a */
    public final MediaCodec f2855a;

    /* renamed from: b */
    public final int f2856b;

    /* renamed from: c */
    public final ByteBuffer f2857c;

    /* renamed from: d */
    public final ListenableFuture f2858d;

    /* renamed from: e */
    public final CallbackToFutureAdapter.Completer f2859e;

    /* renamed from: f */
    public final AtomicBoolean f2860f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f2861g = 0;

    /* renamed from: h */
    public boolean f2862h = false;

    public C17849Je0(MediaCodec mediaCodec, int i) {
        this.f2855a = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.f2856b = Preconditions.checkArgumentNonnegative(i);
        this.f2857c = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f2858d = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Ie0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C17849Je0.m67729a(atomicReference, completer);
            }
        });
        this.f2859e = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m67729a(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: c */
    public final void m67727c() {
        if (!this.f2860f.get()) {
            return;
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() {
        if (this.f2860f.getAndSet(true)) {
            return false;
        }
        try {
            this.f2855a.queueInputBuffer(this.f2856b, 0, 0, 0L, 0);
            this.f2859e.set(null);
        } catch (IllegalStateException e) {
            this.f2859e.setException(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ByteBuffer getByteBuffer() {
        m67727c();
        return this.f2857c;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ListenableFuture getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.f2858d);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z) {
        m67727c();
        this.f2862h = z;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j) {
        boolean z;
        m67727c();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f2861g = j;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() {
        int i;
        if (this.f2860f.getAndSet(true)) {
            return false;
        }
        try {
            MediaCodec mediaCodec = this.f2855a;
            int i2 = this.f2856b;
            int position = this.f2857c.position();
            int limit = this.f2857c.limit();
            long j = this.f2861g;
            if (this.f2862h) {
                i = 4;
            } else {
                i = 0;
            }
            mediaCodec.queueInputBuffer(i2, position, limit, j, i);
            this.f2859e.set(null);
            return true;
        } catch (IllegalStateException e) {
            this.f2859e.setException(e);
            return false;
        }
    }
}
