package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BitMatrix implements Cloneable {

    /* renamed from: a */
    public final int f57739a;

    /* renamed from: b */
    public final int f57740b;

    /* renamed from: c */
    public final int f57741c;

    /* renamed from: d */
    public final int[] f57742d;

    public BitMatrix(int i) {
        this(i, i);
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            int i5 = 0;
            while (i < str.length()) {
                if (str.charAt(i) != '\n' && str.charAt(i) != '\r') {
                    if (str.substring(i, str2.length() + i).equals(str2)) {
                        i += str2.length();
                        zArr[i2] = true;
                    } else if (str.substring(i, str3.length() + i).equals(str3)) {
                        i += str3.length();
                        zArr[i2] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i));
                    }
                    i2++;
                } else {
                    if (i2 > i3) {
                        if (i4 == -1) {
                            i4 = i2 - i3;
                        } else if (i2 - i3 != i4) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i5++;
                        i3 = i2;
                    }
                    i++;
                }
            }
            if (i2 > i3) {
                if (i4 == -1) {
                    i4 = i2 - i3;
                } else if (i2 - i3 != i4) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i5++;
            }
            BitMatrix bitMatrix = new BitMatrix(i4, i5);
            for (int i6 = 0; i6 < i2; i6++) {
                if (zArr[i6]) {
                    bitMatrix.set(i6 % i4, i6 / i4);
                }
            }
            return bitMatrix;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final String m34161a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder(this.f57740b * (this.f57739a + 1));
        for (int i = 0; i < this.f57740b; i++) {
            for (int i2 = 0; i2 < this.f57739a; i2++) {
                if (get(i2, i)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb.append(str4);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void clear() {
        int length = this.f57742d.length;
        for (int i = 0; i < length; i++) {
            this.f57742d[i] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        if (this.f57739a != bitMatrix.f57739a || this.f57740b != bitMatrix.f57740b || this.f57741c != bitMatrix.f57741c || !Arrays.equals(this.f57742d, bitMatrix.f57742d)) {
            return false;
        }
        return true;
    }

    public void flip(int i, int i2) {
        int i3 = (i2 * this.f57741c) + (i / 32);
        int[] iArr = this.f57742d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean get(int i, int i2) {
        if (((this.f57742d[(i2 * this.f57741c) + (i / 32)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int[] getBottomRightOnBit() {
        int length = this.f57742d.length - 1;
        while (length >= 0 && this.f57742d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f57741c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f57742d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int[] getEnclosingRectangle() {
        int i = this.f57739a;
        int i2 = this.f57740b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f57740b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.f57741c;
                if (i6 < i7) {
                    int i8 = this.f57742d[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 >= i && i4 >= i2) {
            return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
        }
        return null;
    }

    public int getHeight() {
        return this.f57740b;
    }

    public BitArray getRow(int i, BitArray bitArray) {
        if (bitArray != null && bitArray.getSize() >= this.f57739a) {
            bitArray.clear();
        } else {
            bitArray = new BitArray(this.f57739a);
        }
        int i2 = i * this.f57741c;
        for (int i3 = 0; i3 < this.f57741c; i3++) {
            bitArray.setBulk(i3 << 5, this.f57742d[i2 + i3]);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.f57741c;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f57742d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.f57741c;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public int getWidth() {
        return this.f57739a;
    }

    public int hashCode() {
        int i = this.f57739a;
        return (((((((i * 31) + i) * 31) + this.f57740b) * 31) + this.f57741c) * 31) + Arrays.hashCode(this.f57742d);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        BitArray bitArray = new BitArray(width);
        BitArray bitArray2 = new BitArray(width);
        for (int i = 0; i < (height + 1) / 2; i++) {
            bitArray = getRow(i, bitArray);
            int i2 = (height - 1) - i;
            bitArray2 = getRow(i2, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i, bitArray2);
            setRow(i2, bitArray);
        }
    }

    public void set(int i, int i2) {
        int i3 = (i2 * this.f57741c) + (i / 32);
        int[] iArr = this.f57742d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void setRegion(int i, int i2, int i3, int i4) {
        if (i2 >= 0 && i >= 0) {
            if (i4 > 0 && i3 > 0) {
                int i5 = i3 + i;
                int i6 = i4 + i2;
                if (i6 <= this.f57740b && i5 <= this.f57739a) {
                    while (i2 < i6) {
                        int i7 = this.f57741c * i2;
                        for (int i8 = i; i8 < i5; i8++) {
                            int[] iArr = this.f57742d;
                            int i9 = (i8 / 32) + i7;
                            iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                        }
                        i2++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public void setRow(int i, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.f57742d;
        int i2 = this.f57741c;
        System.arraycopy(bitArray2, 0, iArr, i * i2, i2);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i, int i2) {
        int i3 = (i2 * this.f57741c) + (i / 32);
        int[] iArr = this.f57742d;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public void xor(BitMatrix bitMatrix) {
        if (this.f57739a == bitMatrix.getWidth() && this.f57740b == bitMatrix.getHeight() && this.f57741c == bitMatrix.getRowSize()) {
            BitArray bitArray = new BitArray((this.f57739a / 32) + 1);
            for (int i = 0; i < this.f57740b; i++) {
                int i2 = this.f57741c * i;
                int[] bitArray2 = bitMatrix.getRow(i, bitArray).getBitArray();
                for (int i3 = 0; i3 < this.f57741c; i3++) {
                    int[] iArr = this.f57742d;
                    int i4 = i2 + i3;
                    iArr[i4] = iArr[i4] ^ bitArray2[i3];
                }
            }
            return;
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public BitMatrix(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f57739a = i;
            this.f57740b = i2;
            int i3 = (i + 31) / 32;
            this.f57741c = i3;
            this.f57742d = new int[i3 * i2];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    /* renamed from: clone */
    public BitMatrix m74058clone() {
        return new BitMatrix(this.f57739a, this.f57740b, this.f57741c, (int[]) this.f57742d.clone());
    }

    public String toString(String str, String str2) {
        return m34161a(str, str2, "\n");
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return m34161a(str, str2, str3);
    }

    public BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.f57739a = i;
        this.f57740b = i2;
        this.f57741c = i3;
        this.f57742d = iArr;
    }
}
