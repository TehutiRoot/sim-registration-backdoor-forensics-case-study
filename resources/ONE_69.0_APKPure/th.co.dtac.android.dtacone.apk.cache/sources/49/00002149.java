package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.BufferCopiedEncodedData;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public class BufferCopiedEncodedData implements EncodedData {

    /* renamed from: a */
    public final ByteBuffer f12085a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f12086b;

    /* renamed from: c */
    public final ListenableFuture f12087c;

    /* renamed from: d */
    public final CallbackToFutureAdapter.Completer f12088d;

    public BufferCopiedEncodedData(@NonNull EncodedData encodedData) {
        this.f12086b = m62004g(encodedData);
        this.f12085a = m62005d(encodedData);
        final AtomicReference atomicReference = new AtomicReference();
        this.f12087c = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Lc
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return BufferCopiedEncodedData.m62006b(atomicReference, completer);
            }
        });
        this.f12088d = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62006b(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        this.f12088d.set(null);
    }

    /* renamed from: d */
    public final ByteBuffer m62005d(EncodedData encodedData) {
        ByteBuffer byteBuffer = encodedData.getByteBuffer();
        MediaCodec.BufferInfo bufferInfo = encodedData.getBufferInfo();
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo.size);
        allocate.order(byteBuffer.order());
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    /* renamed from: g */
    public final MediaCodec.BufferInfo m62004g(EncodedData encodedData) {
        MediaCodec.BufferInfo bufferInfo = encodedData.getBufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        return bufferInfo2;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public MediaCodec.BufferInfo getBufferInfo() {
        return this.f12086b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ByteBuffer getByteBuffer() {
        return this.f12085a;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ListenableFuture<Void> getClosedFuture() {
        return Futures.nonCancellationPropagating(this.f12087c);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.f12086b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        if ((this.f12086b.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.f12086b.size;
    }
}