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

/* renamed from: Pe0 */
/* loaded from: classes.dex */
public class C18271Pe0 implements InputBuffer {

    /* renamed from: a */
    public final MediaCodec f4840a;

    /* renamed from: b */
    public final int f4841b;

    /* renamed from: c */
    public final ByteBuffer f4842c;

    /* renamed from: d */
    public final ListenableFuture f4843d;

    /* renamed from: e */
    public final CallbackToFutureAdapter.Completer f4844e;

    /* renamed from: f */
    public final AtomicBoolean f4845f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f4846g = 0;

    /* renamed from: h */
    public boolean f4847h = false;

    public C18271Pe0(MediaCodec mediaCodec, int i) {
        this.f4840a = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.f4841b = Preconditions.checkArgumentNonnegative(i);
        this.f4842c = mediaCodec.getInputBuffer(i);
        final AtomicReference atomicReference = new AtomicReference();
        this.f4843d = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Oe0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C18271Pe0.m66951a(atomicReference, completer);
            }
        });
        this.f4844e = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: a */
    public static /* synthetic */ Object m66951a(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    /* renamed from: c */
    public final void m66949c() {
        if (!this.f4845f.get()) {
            return;
        }
        throw new IllegalStateException("The buffer is submitted or canceled.");
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean cancel() {
        if (this.f4845f.getAndSet(true)) {
            return false;
        }
        try {
            this.f4840a.queueInputBuffer(this.f4841b, 0, 0, 0L, 0);
            this.f4844e.set(null);
        } catch (IllegalStateException e) {
            this.f4844e.setException(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ByteBuffer getByteBuffer() {
        m66949c();
        return this.f4842c;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public ListenableFuture getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.f4843d);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setEndOfStream(boolean z) {
        m66949c();
        this.f4847h = z;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public void setPresentationTimeUs(long j) {
        boolean z;
        m66949c();
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f4846g = j;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public boolean submit() {
        int i;
        if (this.f4845f.getAndSet(true)) {
            return false;
        }
        try {
            MediaCodec mediaCodec = this.f4840a;
            int i2 = this.f4841b;
            int position = this.f4842c.position();
            int limit = this.f4842c.limit();
            long j = this.f4846g;
            if (this.f4847h) {
                i = 4;
            } else {
                i = 0;
            }
            mediaCodec.queueInputBuffer(i2, position, limit, j, i);
            this.f4844e.set(null);
            return true;
        } catch (IllegalStateException e) {
            this.f4844e.setException(e);
            return false;
        }
    }
}