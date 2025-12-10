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
    public final ByteBuffer f11997a;

    /* renamed from: b */
    public final MediaCodec.BufferInfo f11998b;

    /* renamed from: c */
    public final ListenableFuture f11999c;

    /* renamed from: d */
    public final CallbackToFutureAdapter.Completer f12000d;

    public BufferCopiedEncodedData(@NonNull EncodedData encodedData) {
        this.f11998b = m62056g(encodedData);
        this.f11997a = m62057d(encodedData);
        final AtomicReference atomicReference = new AtomicReference();
        this.f11999c = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: Lc
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return BufferCopiedEncodedData.m62058b(atomicReference, completer);
            }
        });
        this.f12000d = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
    }

    /* renamed from: b */
    public static /* synthetic */ Object m62058b(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) {
        return atomicReference.set(completer);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData, java.lang.AutoCloseable
    public void close() {
        this.f12000d.set(null);
    }

    /* renamed from: d */
    public final ByteBuffer m62057d(EncodedData encodedData) {
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
    public final MediaCodec.BufferInfo m62056g(EncodedData encodedData) {
        MediaCodec.BufferInfo bufferInfo = encodedData.getBufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        return bufferInfo2;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public MediaCodec.BufferInfo getBufferInfo() {
        return this.f11998b;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ByteBuffer getByteBuffer() {
        return this.f11997a;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    @NonNull
    public ListenableFuture<Void> getClosedFuture() {
        return Futures.nonCancellationPropagating(this.f11999c);
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long getPresentationTimeUs() {
        return this.f11998b.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public boolean isKeyFrame() {
        if ((this.f11998b.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public long size() {
        return this.f11998b.size;
    }
}
