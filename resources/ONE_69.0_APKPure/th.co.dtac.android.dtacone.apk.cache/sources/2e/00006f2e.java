package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class ByteBufferReadWriteBuf implements InterfaceC18829Xs1 {

    /* renamed from: a */
    public final ByteBuffer f35305a;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.f35305a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // p000.InterfaceC18699Vs1
    public byte[] data() {
        return this.f35305a.array();
    }

    @Override // p000.InterfaceC18699Vs1
    public byte get(int i) {
        return this.f35305a.get(i);
    }

    public boolean getBoolean(int i) {
        if (get(i) != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18699Vs1
    public double getDouble(int i) {
        return this.f35305a.getDouble(i);
    }

    @Override // p000.InterfaceC18699Vs1
    public float getFloat(int i) {
        return this.f35305a.getFloat(i);
    }

    @Override // p000.InterfaceC18699Vs1
    public int getInt(int i) {
        return this.f35305a.getInt(i);
    }

    @Override // p000.InterfaceC18699Vs1
    public long getLong(int i) {
        return this.f35305a.getLong(i);
    }

    @Override // p000.InterfaceC18699Vs1
    public short getShort(int i) {
        return this.f35305a.getShort(i);
    }

    @Override // p000.InterfaceC18699Vs1
    public String getString(int i, int i2) {
        return Utf8Safe.decodeUtf8Buffer(this.f35305a, i, i2);
    }

    @Override // p000.InterfaceC18699Vs1
    public int limit() {
        return this.f35305a.limit();
    }

    @Override // p000.InterfaceC18829Xs1
    public void put(byte[] bArr, int i, int i2) {
        this.f35305a.put(bArr, i, i2);
    }

    public void putBoolean(boolean z) {
        this.f35305a.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.InterfaceC18829Xs1
    public void putDouble(double d) {
        this.f35305a.putDouble(d);
    }

    @Override // p000.InterfaceC18829Xs1
    public void putFloat(float f) {
        this.f35305a.putFloat(f);
    }

    @Override // p000.InterfaceC18829Xs1
    public void putInt(int i) {
        this.f35305a.putInt(i);
    }

    @Override // p000.InterfaceC18829Xs1
    public void putLong(long j) {
        this.f35305a.putLong(j);
    }

    @Override // p000.InterfaceC18829Xs1
    public void putShort(short s) {
        this.f35305a.putShort(s);
    }

    public boolean requestCapacity(int i) {
        if (i <= this.f35305a.limit()) {
            return true;
        }
        return false;
    }

    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f35305a.put(i, b);
    }

    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.f35305a.putDouble(i, d);
    }

    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.f35305a.putFloat(i, f);
    }

    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.f35305a.putInt(i, i2);
    }

    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.f35305a.putLong(i, j);
    }

    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.f35305a.putShort(i, s);
    }

    @Override // p000.InterfaceC18829Xs1
    public int writePosition() {
        return this.f35305a.position();
    }

    @Override // p000.InterfaceC18829Xs1
    public void put(byte b) {
        this.f35305a.put(b);
    }

    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int position = this.f35305a.position();
        this.f35305a.position(i);
        this.f35305a.put(bArr, i2, i3);
        this.f35305a.position(position);
    }
}