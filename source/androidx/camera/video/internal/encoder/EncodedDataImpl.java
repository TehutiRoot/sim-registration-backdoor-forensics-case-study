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
    public final MediaCodec f12001a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f12002b;

    /* renamed from: c */
    public final int f12003c;

    /* renamed from: d */
    public final ByteBuffer f12004d;

    /* renamed from: e */
    public final ListenableFuture f12005e;

    /* renamed from: f */
    public final CallbackToFutureAdapter.Completer f12006f;

    /* renamed from: g */
    public final AtomicBoolean f12007g = new AtomicBoolean(false);

    public EncodedDataImpl(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.f12001a = (MediaCodec) Preconditions.checkNotNull(mediaCodec);
        this.f12003c = i;
        this.f12004d = mediaCodec.getOutputBuffer(i);
        this.f12002b = (MediaCodec.BufferInfo) Preconditions.checkNotNull(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f12005e = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: vR
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return EncodedDataImpl.m62054b(atomicReference, completer);
            }
        });
        this.f12006f = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62054b(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        if (this.f12007g.getAndSet(true)) {
            return;
        }
        try {
            this.f12001a.releaseOutputBuffer(this.f12003c, false);
            this.f12006f.set(null);
        } catch (IllegalStateException e) {
            this.f12006f.setException(e);
        }
    }

    /* renamed from: g */
    public final void m62052g() {
        if (!this.f12007g.get()) {
            return;
        }
        throw new IllegalStateException("encoded data is closed.");
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public MediaCodec.BufferInfo getBufferInfo() {
        return this.f12002b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ByteBuffer getByteBuffer() {
        m62052g();
        this.f12004d.position(this.f12002b.offset);
        ByteBuffer byteBuffer = this.f12004d;
        MediaCodec.BufferInfo bufferInfo = this.f12002b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f12004d;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ListenableFuture<Void> getClosedFuture() {
        return Futures.nonCancellationPropagating(this.f12005e);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.f12002b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        if ((this.f12002b.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.f12002b.size;
    }
}
