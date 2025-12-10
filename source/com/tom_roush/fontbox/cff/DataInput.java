package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.util.Charsets;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
public class DataInput {

    /* renamed from: a */
    public final byte[] f59310a;

    /* renamed from: b */
    public int f59311b = 0;

    public DataInput(byte[] bArr) {
        this.f59310a = bArr;
    }

    /* renamed from: a */
    public final int m33024a(int i) {
        try {
            return this.f59310a[this.f59311b + i] & 255;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final int m33023b() {
        try {
            byte[] bArr = this.f59310a;
            int i = this.f59311b;
            int i2 = bArr[i] & 255;
            this.f59311b = i + 1;
            return i2;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int getPosition() {
        return this.f59311b;
    }

    public String getString() throws IOException {
        return new String(this.f59310a, Charsets.ISO_8859_1);
    }

    public boolean hasRemaining() {
        if (this.f59311b < this.f59310a.length) {
            return true;
        }
        return false;
    }

    public int length() {
        return this.f59310a.length;
    }

    public int peekUnsignedByte(int i) throws IOException {
        int m33024a = m33024a(i);
        if (m33024a >= 0) {
            return m33024a;
        }
        throw new EOFException();
    }

    public byte readByte() throws IOException {
        try {
            byte[] bArr = this.f59310a;
            int i = this.f59311b;
            byte b = bArr[i];
            this.f59311b = i + 1;
            return b;
        } catch (RuntimeException unused) {
            return (byte) -1;
        }
    }

    public byte[] readBytes(int i) throws IOException {
        if (i >= 0) {
            byte[] bArr = this.f59310a;
            int length = bArr.length;
            int i2 = this.f59311b;
            if (length - i2 >= i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i2, bArr2, 0, i);
                this.f59311b += i;
                return bArr2;
            }
            throw new EOFException();
        }
        throw new IOException("length is negative");
    }

    public int readInt() throws IOException {
        int m33023b = m33023b();
        int m33023b2 = m33023b();
        int m33023b3 = m33023b();
        int m33023b4 = m33023b();
        if ((m33023b | m33023b2 | m33023b3 | m33023b4) >= 0) {
            return (m33023b << 24) | (m33023b2 << 16) | (m33023b3 << 8) | m33023b4;
        }
        throw new EOFException();
    }

    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    public int readUnsignedByte() throws IOException {
        int m33023b = m33023b();
        if (m33023b >= 0) {
            return m33023b;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() throws IOException {
        int m33023b = m33023b();
        int m33023b2 = m33023b();
        if ((m33023b | m33023b2) >= 0) {
            return (m33023b << 8) | m33023b2;
        }
        throw new EOFException();
    }

    public void setPosition(int i) {
        this.f59311b = i;
    }
}
