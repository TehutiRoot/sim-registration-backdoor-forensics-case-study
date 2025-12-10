package androidx.emoji2.text.flatbuffer;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class ArrayReadWriteBuf implements InterfaceC19080as1 {

    /* renamed from: a */
    public byte[] f35211a;

    /* renamed from: b */
    public int f35212b;

    public ArrayReadWriteBuf() {
        this(10);
    }

    @Override // p000.InterfaceC18844Yr1
    public byte[] data() {
        return this.f35211a;
    }

    @Override // p000.InterfaceC18844Yr1
    public byte get(int i) {
        return this.f35211a[i];
    }

    public boolean getBoolean(int i) {
        if (this.f35211a[i] != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC18844Yr1
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // p000.InterfaceC18844Yr1
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // p000.InterfaceC18844Yr1
    public int getInt(int i) {
        byte[] bArr = this.f35211a;
        return (bArr[i] & 255) | (bArr[i + 3] << Ascii.CAN) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // p000.InterfaceC18844Yr1
    public long getLong(int i) {
        byte[] bArr = this.f35211a;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | (bArr[i + 7] << 56);
    }

    @Override // p000.InterfaceC18844Yr1
    public short getShort(int i) {
        byte[] bArr = this.f35211a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // p000.InterfaceC18844Yr1
    public String getString(int i, int i2) {
        return Utf8Safe.decodeUtf8Array(this.f35211a, i, i2);
    }

    @Override // p000.InterfaceC18844Yr1
    public int limit() {
        return this.f35212b;
    }

    @Override // p000.InterfaceC19080as1
    public void put(byte[] bArr, int i, int i2) {
        set(this.f35212b, bArr, i, i2);
        this.f35212b += i2;
    }

    public void putBoolean(boolean z) {
        setBoolean(this.f35212b, z);
        this.f35212b++;
    }

    @Override // p000.InterfaceC19080as1
    public void putDouble(double d) {
        setDouble(this.f35212b, d);
        this.f35212b += 8;
    }

    @Override // p000.InterfaceC19080as1
    public void putFloat(float f) {
        setFloat(this.f35212b, f);
        this.f35212b += 4;
    }

    @Override // p000.InterfaceC19080as1
    public void putInt(int i) {
        setInt(this.f35212b, i);
        this.f35212b += 4;
    }

    @Override // p000.InterfaceC19080as1
    public void putLong(long j) {
        setLong(this.f35212b, j);
        this.f35212b += 8;
    }

    @Override // p000.InterfaceC19080as1
    public void putShort(short s) {
        setShort(this.f35212b, s);
        this.f35212b += 2;
    }

    public boolean requestCapacity(int i) {
        byte[] bArr = this.f35211a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.f35211a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.f35211a[i] = b;
    }

    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.f35211a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (doubleToRawLongBits >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.f35211a;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        byte[] bArr = this.f35211a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.f35211a;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (j >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        byte[] bArr = this.f35211a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // p000.InterfaceC19080as1
    public int writePosition() {
        return this.f35212b;
    }

    public ArrayReadWriteBuf(int i) {
        this(new byte[i]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.f35211a = bArr;
        this.f35212b = 0;
    }

    @Override // p000.InterfaceC19080as1
    public void put(byte b) {
        set(this.f35212b, b);
        this.f35212b++;
    }

    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.f35211a, i, i3);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i) {
        this.f35211a = bArr;
        this.f35212b = i;
    }
}
