package org.bson;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class ByteBufNIO implements ByteBuf {

    /* renamed from: a */
    public ByteBuffer f75866a;

    /* renamed from: b */
    public final AtomicInteger f75867b = new AtomicInteger(1);

    public ByteBufNIO(ByteBuffer byteBuffer) {
        this.f75866a = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.bson.ByteBuf
    public byte[] array() {
        return this.f75866a.array();
    }

    @Override // org.bson.ByteBuf
    public ByteBuffer asNIO() {
        return this.f75866a;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf asReadOnly() {
        return new ByteBufNIO(this.f75866a.asReadOnlyBuffer());
    }

    @Override // org.bson.ByteBuf
    public int capacity() {
        return this.f75866a.capacity();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf clear() {
        this.f75866a.clear();
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf duplicate() {
        return new ByteBufNIO(this.f75866a.duplicate());
    }

    @Override // org.bson.ByteBuf
    public ByteBuf flip() {
        this.f75866a.flip();
        return this;
    }

    @Override // org.bson.ByteBuf
    public byte get() {
        return this.f75866a.get();
    }

    @Override // org.bson.ByteBuf
    public double getDouble() {
        return this.f75866a.getDouble();
    }

    @Override // org.bson.ByteBuf
    public int getInt() {
        return this.f75866a.getInt();
    }

    @Override // org.bson.ByteBuf
    public long getLong() {
        return this.f75866a.getLong();
    }

    @Override // org.bson.ByteBuf
    public int getReferenceCount() {
        return this.f75867b.get();
    }

    @Override // org.bson.ByteBuf
    public boolean hasRemaining() {
        return this.f75866a.hasRemaining();
    }

    @Override // org.bson.ByteBuf
    public int limit() {
        return this.f75866a.limit();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf order(ByteOrder byteOrder) {
        this.f75866a.order(byteOrder);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf position(int i) {
        this.f75866a.position(i);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(int i, byte b) {
        this.f75866a.put(i, b);
        return this;
    }

    @Override // org.bson.ByteBuf
    public void release() {
        if (this.f75867b.decrementAndGet() >= 0) {
            if (this.f75867b.get() == 0) {
                this.f75866a = null;
                return;
            }
            return;
        }
        this.f75867b.incrementAndGet();
        throw new IllegalStateException("Attempted to decrement the reference count below 0");
    }

    @Override // org.bson.ByteBuf
    public int remaining() {
        return this.f75866a.remaining();
    }

    @Override // org.bson.ByteBuf
    public byte get(int i) {
        return this.f75866a.get(i);
    }

    @Override // org.bson.ByteBuf
    public double getDouble(int i) {
        return this.f75866a.getDouble(i);
    }

    @Override // org.bson.ByteBuf
    public int getInt(int i) {
        return this.f75866a.getInt(i);
    }

    @Override // org.bson.ByteBuf
    public long getLong(int i) {
        return this.f75866a.getLong(i);
    }

    @Override // org.bson.ByteBuf
    public ByteBuf limit(int i) {
        this.f75866a.limit(i);
        return this;
    }

    @Override // org.bson.ByteBuf
    public int position() {
        return this.f75866a.position();
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(byte[] bArr, int i, int i2) {
        this.f75866a.put(bArr, i, i2);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBufNIO retain() {
        if (this.f75867b.incrementAndGet() != 1) {
            return this;
        }
        this.f75867b.decrementAndGet();
        throw new IllegalStateException("Attempted to increment the reference count when it is already 0");
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(byte[] bArr) {
        this.f75866a.get(bArr);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf put(byte b) {
        this.f75866a.put(b);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(int i, byte[] bArr) {
        return get(i, bArr, 0, bArr.length);
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(byte[] bArr, int i, int i2) {
        this.f75866a.get(bArr, i, i2);
        return this;
    }

    @Override // org.bson.ByteBuf
    public ByteBuf get(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = this.f75866a.get(i + i4);
        }
        return this;
    }
}