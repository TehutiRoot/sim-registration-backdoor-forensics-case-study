package com.tom_roush.fontbox.cff;

import com.tom_roush.fontbox.util.Charsets;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
public class DataInput {

    /* renamed from: a */
    public final byte[] f59322a;

    /* renamed from: b */
    public int f59323b = 0;

    public DataInput(byte[] bArr) {
        this.f59322a = bArr;
    }

    /* renamed from: a */
    public final int m33016a(int i) {
        try {
            return this.f59322a[this.f59323b + i] & 255;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public final int m33015b() {
        try {
            byte[] bArr = this.f59322a;
            int i = this.f59323b;
            int i2 = bArr[i] & 255;
            this.f59323b = i + 1;
            return i2;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int getPosition() {
        return this.f59323b;
    }

    public String getString() throws IOException {
        return new String(this.f59322a, Charsets.ISO_8859_1);
    }

    public boolean hasRemaining() {
        if (this.f59323b < this.f59322a.length) {
            return true;
        }
        return false;
    }

    public int length() {
        return this.f59322a.length;
    }

    public int peekUnsignedByte(int i) throws IOException {
        int m33016a = m33016a(i);
        if (m33016a >= 0) {
            return m33016a;
        }
        throw new EOFException();
    }

    public byte readByte() throws IOException {
        try {
            byte[] bArr = this.f59322a;
            int i = this.f59323b;
            byte b = bArr[i];
            this.f59323b = i + 1;
            return b;
        } catch (RuntimeException unused) {
            return (byte) -1;
        }
    }

    public byte[] readBytes(int i) throws IOException {
        if (i >= 0) {
            byte[] bArr = this.f59322a;
            int length = bArr.length;
            int i2 = this.f59323b;
            if (length - i2 >= i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, i2, bArr2, 0, i);
                this.f59323b += i;
                return bArr2;
            }
            throw new EOFException();
        }
        throw new IOException("length is negative");
    }

    public int readInt() throws IOException {
        int m33015b = m33015b();
        int m33015b2 = m33015b();
        int m33015b3 = m33015b();
        int m33015b4 = m33015b();
        if ((m33015b | m33015b2 | m33015b3 | m33015b4) >= 0) {
            return (m33015b << 24) | (m33015b2 << 16) | (m33015b3 << 8) | m33015b4;
        }
        throw new EOFException();
    }

    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    public int readUnsignedByte() throws IOException {
        int m33015b = m33015b();
        if (m33015b >= 0) {
            return m33015b;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() throws IOException {
        int m33015b = m33015b();
        int m33015b2 = m33015b();
        if ((m33015b | m33015b2) >= 0) {
            return (m33015b << 8) | m33015b2;
        }
        throw new EOFException();
    }

    public void setPosition(int i) {
        this.f59323b = i;
    }
}