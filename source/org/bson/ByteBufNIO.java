package org.bson;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class ByteBufNIO implements ByteBuf {

    /* renamed from: a */
    public ByteBuffer f75782a;

    /* renamed from: b */
    public final AtomicInteger f75783b = new AtomicInteger(1);

    public ByteBufNIO(ByteBuffer byteBuffer) {
        this.f75782a = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.bson.ByteBuf
    public byte[] array() {
        return this.f75782a.array();
    }

    @Override // org.bson.ByteBuf
    public ByteBuffer asNIO() {
        return this.f75782a;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf asReadOnly() {
        return new ByteBufNIO(this.f75782a.asReadOnlyBuffer());
    }

    @Override // org.bson.ByteBuf
    public int capacity() {
        return this.f75782a.capacity();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf clear() {
        this.f75782a.clear();
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf duplicate() {
        return new ByteBufNIO(this.f75782a.duplicate());
    }

    @Override // org.bson.ByteBuf
    public ByteBuf flip() {
        this.f75782a.flip();
        return this;
    }

    @Override // org.bson.ByteBuf
    public byte get() {
        return this.f75782a.get();
    }

    @Override // org.bson.ByteBuf
    public double getDouble() {
        return this.f75782a.getDouble();
    }

    @Override // org.bson.ByteBuf
    public int getInt() {
        return this.f75782a.getInt();
    }

    @Override // org.bson.ByteBuf
    public long getLong() {
        return this.f75782a.getLong();
    }

    @Override // org.bson.ByteBuf
    public int getReferenceCount() {
        return this.f75783b.get();
    }

    @Override // org.bson.ByteBuf
    public boolean hasRemaining() {
        return this.f75782a.hasRemaining();
    }

    @Override // org.bson.ByteBuf
    public int limit() {
        return this.f75782a.limit();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf order(ByteOrder byteOrder) {
        this.f75782a.order(byteOrder);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf position(int i) {
        this.f75782a.position(i);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(int i, byte b) {
        this.f75782a.put(i, b);
        return this;
    }

    @Override // org.bson.ByteBuf
    public void release() {
        if (this.f75783b.decrementAndGet() >= 0) {
            if (this.f75783b.get() == 0) {
                this.f75782a = null;
                return;
            }
            return;
        }
        this.f75783b.incrementAndGet();
        throw new IllegalStateException("Attempted to decrement the reference count below 0");
    }

    @Override // org.bson.ByteBuf
    public int remaining() {
        return this.f75782a.remaining();
    }

    @Override // org.bson.ByteBuf
    public byte get(int i) {
        return this.f75782a.get(i);
    }

    @Override // org.bson.ByteBuf
    public double getDouble(int i) {
        return this.f75782a.getDouble(i);
    }

    @Override // org.bson.ByteBuf
    public int getInt(int i) {
        return this.f75782a.getInt(i);
    }

    @Override // org.bson.ByteBuf
    public long getLong(int i) {
        return this.f75782a.getLong(i);
    }

    @Override // org.bson.ByteBuf
    public ByteBuf limit(int i) {
        this.f75782a.limit(i);
        return this;
    }

    @Override // org.bson.ByteBuf
    public int position() {
        return this.f75782a.position();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(byte[] bArr, int i, int i2) {
        this.f75782a.put(bArr, i, i2);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBufNIO retain() {
        if (this.f75783b.incrementAndGet() != 1) {
            return this;
        }
        this.f75783b.decrementAndGet();
        throw new IllegalStateException("Attempted to increment the reference count when it is already 0");
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(byte[] bArr) {
        this.f75782a.get(bArr);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(byte b) {
        this.f75782a.put(b);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(int i, byte[] bArr) {
        return get(i, bArr, 0, bArr.length);
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(byte[] bArr, int i, int i2) {
        this.f75782a.get(bArr, i, i2);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = this.f75782a.get(i + i4);
        }
        return this;
    }
}
