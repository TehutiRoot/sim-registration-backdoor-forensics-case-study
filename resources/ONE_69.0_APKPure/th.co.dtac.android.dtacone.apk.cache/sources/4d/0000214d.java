package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.EncodedDataImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public class EncodedDataImpl implements EncodedData {

    /* renamed from: a */
    public final MediaCodec f12089a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f12090b;

    /* renamed from: c */
    public final int f12091c;

    /* renamed from: d */
    public final ByteBuffer f12092d;

    /* renamed from: e */
    public final ListenableFuture f12093e;

    /* renamed from: f */
    public final CallbackToFutureAdapter.Completer f12094f;

    /* renamed from: g */
    public final AtomicBoolean f12095g = new AtomicBoolean(false);

    public EncodedDataImpl(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f12089a = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.f12091c = i;
        this.f12092d = mediaCodec.getOutputBuffer(i);
        this.f12090b = (MediaCodec.BufferInfo) Preconditions.checkNotNull(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f12093e = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: zR
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return EncodedDataImpl.m62002b(atomicReference, completer);
            }
        });
        this.f12094f = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62002b(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        if (this.f12095g.getAndSet(true)) {
            return;
        }
        try {
            this.f12089a.releaseOutputBuffer(this.f12091c, false);
            this.f12094f.set(null);
        } catch (IllegalStateException e) {
            this.f12094f.setException(e);
        }
    }

    /* renamed from: g */
    public final void m62000g() {
        if (!this.f12095g.get()) {
            return;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public MediaCodec.BufferInfo getBufferInfo() {
        return this.f12090b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ByteBuffer getByteBuffer() {
        m62000g();
        this.f12092d.position(this.f12090b.offset);
        ByteBuffer byteBuffer = this.f12092d;
        MediaCodec.BufferInfo bufferInfo = this.f12090b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f12092d;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ListenableFuture<Void> getClosedFuture() {
        return Futures.nonCancellationPropagating(this.f12093e);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.f12090b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        if ((this.f12090b.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.f12090b.size;
    }
}