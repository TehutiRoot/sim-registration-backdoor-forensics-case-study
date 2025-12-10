package com.feitian.readerdk.Tool;

/* loaded from: classes3.dex */
public class Fifobytebuff {

    /* renamed from: a */
    public byte[] f43528a;

    /* renamed from: b */
    public int f43529b = 0;

    /* renamed from: c */
    public int f43530c = 0;

    /* renamed from: d */
    public boolean f43531d = true;

    public Fifobytebuff(int i) {
        this.f43528a = new byte[i];
    }

    /* renamed from: a */
    public final int m49356a(byte[] bArr, int i, int i2, boolean z) {
        int i3 = this.f43530c;
        boolean z2 = this.f43531d;
        if (i2 > getDataLen()) {
            i2 = getDataLen();
        }
        int i4 = this.f43530c;
        int i5 = i4 + i2;
        byte[] bArr2 = this.f43528a;
        if (i5 > bArr2.length) {
            int length = bArr2.length - i4;
            System.arraycopy(bArr2, i4, bArr, i, length);
            int i6 = i + length;
            int i7 = i2 - length;
            System.arraycopy(this.f43528a, 0, bArr, i6, i7);
            this.f43530c = i7;
            this.f43531d = true;
        } else if (i4 + i2 < bArr2.length) {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.f43530c += i2;
        } else {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.f43530c = 0;
            this.f43531d = true;
        }
        if (z) {
            this.f43530c = i3;
            this.f43531d = z2;
        }
        return i2;
    }

    public int addData(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > getFreeLength()) {
            i3 = getFreeLength();
        }
        int i4 = this.f43529b;
        int i5 = i3 + i4;
        byte[] bArr2 = this.f43528a;
        if (i5 > bArr2.length) {
            int length = bArr2.length - i4;
            System.arraycopy(bArr, i, bArr2, i4, length);
            int i6 = i3 - length;
            System.arraycopy(bArr, i + length, this.f43528a, 0, i6);
            this.f43529b = i6;
            this.f43531d = false;
        } else if (i3 + i4 < bArr2.length) {
            System.arraycopy(bArr, i, bArr2, i4, i3);
            this.f43529b += i3;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i3);
            this.f43529b = 0;
            this.f43531d = false;
        }
        return bArr.length;
    }

    /* renamed from: b */
    public boolean m49355b() {
        if (!this.f43531d && this.f43529b == this.f43530c) {
            return true;
        }
        return false;
    }

    public void clear() {
    }

    public byte[] dump() {
        int length = this.f43528a.length;
        byte[] bArr = new byte[length];
        m49356a(bArr, 0, length, true);
        return bArr;
    }

    public int getData(byte[] bArr, int i, int i2) {
        return m49356a(bArr, i, i2, false);
    }

    public int getDataLen() {
        if (this.f43531d) {
            return this.f43529b - this.f43530c;
        }
        return (this.f43529b - this.f43530c) + this.f43528a.length;
    }

    public int getFreeLength() {
        return this.f43528a.length - getDataLen();
    }

    public int getData(byte[] bArr, int i) {
        return m49356a(bArr, 0, i, false);
    }

    public byte[] getData(int i) {
        if (i > getDataLen()) {
            i = getDataLen();
        }
        byte[] bArr = new byte[i];
        getData(bArr, 0, i);
        return bArr;
    }

    public int addData(byte[] bArr, int i) {
        return addData(bArr, 0, i);
    }

    public int addData(byte[] bArr) {
        return addData(bArr, 0, bArr.length);
    }

    public int addData(byte b) {
        if (m49355b()) {
            return -1;
        }
        byte[] bArr = this.f43528a;
        int i = this.f43529b;
        int i2 = i + 1;
        this.f43529b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            this.f43529b = 0;
            this.f43531d = false;
            return 1;
        }
        return 1;
    }
}
