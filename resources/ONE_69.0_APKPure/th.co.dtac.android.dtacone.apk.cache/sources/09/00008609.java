package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.p011io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class TextBuffer {

    /* renamed from: l */
    public static final char[] f43265l = new char[0];

    /* renamed from: a */
    public final BufferRecycler f43266a;

    /* renamed from: b */
    public char[] f43267b;

    /* renamed from: c */
    public int f43268c;

    /* renamed from: d */
    public int f43269d;

    /* renamed from: e */
    public ArrayList f43270e;

    /* renamed from: f */
    public boolean f43271f;

    /* renamed from: g */
    public int f43272g;

    /* renamed from: h */
    public char[] f43273h;

    /* renamed from: i */
    public int f43274i;

    /* renamed from: j */
    public String f43275j;

    /* renamed from: k */
    public char[] f43276k;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this.f43266a = bufferRecycler;
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    /* renamed from: a */
    public final char[] m49496a(int i) {
        BufferRecycler bufferRecycler = this.f43266a;
        if (bufferRecycler != null) {
            return bufferRecycler.allocCharBuffer(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    public void append(char c) {
        if (this.f43268c >= 0) {
            m49491f(16);
        }
        this.f43275j = null;
        this.f43276k = null;
        char[] cArr = this.f43273h;
        if (this.f43274i >= cArr.length) {
            m49493d(1);
            cArr = this.f43273h;
        }
        int i = this.f43274i;
        this.f43274i = i + 1;
        cArr[i] = c;
    }

    /* renamed from: b */
    public final char[] m49495b(int i) {
        return new char[i];
    }

    /* renamed from: c */
    public final void m49494c() {
        this.f43271f = false;
        this.f43270e.clear();
        this.f43272g = 0;
        this.f43274i = 0;
    }

    public char[] contentsAsArray() {
        char[] cArr = this.f43276k;
        if (cArr == null) {
            char[] m49492e = m49492e();
            this.f43276k = m49492e;
            return m49492e;
        }
        return cArr;
    }

    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f43276k;
        if (cArr3 != null) {
            return NumberInput.parseBigDecimal(cArr3);
        }
        int i = this.f43268c;
        if (i >= 0 && (cArr2 = this.f43267b) != null) {
            return NumberInput.parseBigDecimal(cArr2, i, this.f43269d);
        }
        if (this.f43272g == 0 && (cArr = this.f43273h) != null) {
            return NumberInput.parseBigDecimal(cArr, 0, this.f43274i);
        }
        return NumberInput.parseBigDecimal(contentsAsArray());
    }

    public double contentsAsDouble() throws NumberFormatException {
        return NumberInput.parseDouble(contentsAsString());
    }

    public int contentsAsInt(boolean z) {
        char[] cArr;
        int i = this.f43268c;
        if (i >= 0 && (cArr = this.f43267b) != null) {
            if (z) {
                return -NumberInput.parseInt(cArr, i + 1, this.f43269d - 1);
            }
            return NumberInput.parseInt(cArr, i, this.f43269d);
        } else if (z) {
            return -NumberInput.parseInt(this.f43273h, 1, this.f43274i - 1);
        } else {
            return NumberInput.parseInt(this.f43273h, 0, this.f43274i);
        }
    }

    public long contentsAsLong(boolean z) {
        char[] cArr;
        int i = this.f43268c;
        if (i >= 0 && (cArr = this.f43267b) != null) {
            if (z) {
                return -NumberInput.parseLong(cArr, i + 1, this.f43269d - 1);
            }
            return NumberInput.parseLong(cArr, i, this.f43269d);
        } else if (z) {
            return -NumberInput.parseLong(this.f43273h, 1, this.f43274i - 1);
        } else {
            return NumberInput.parseLong(this.f43273h, 0, this.f43274i);
        }
    }

    public String contentsAsString() {
        if (this.f43275j == null) {
            char[] cArr = this.f43276k;
            if (cArr != null) {
                this.f43275j = new String(cArr);
            } else {
                int i = this.f43268c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.f43269d;
                    if (i2 < 1) {
                        this.f43275j = "";
                        return "";
                    }
                    this.f43275j = new String(this.f43267b, i, i2);
                } else {
                    int i3 = this.f43272g;
                    int i4 = this.f43274i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.f43273h, 0, i4);
                        }
                        this.f43275j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.f43270e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.f43270e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f43273h, 0, this.f43274i);
                        this.f43275j = sb.toString();
                    }
                }
            }
        }
        return this.f43275j;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i;
        char[] cArr = this.f43276k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f43276k.length;
        }
        String str = this.f43275j;
        if (str != null) {
            writer.write(str);
            return this.f43275j.length();
        }
        int i2 = this.f43268c;
        if (i2 >= 0) {
            int i3 = this.f43269d;
            if (i3 > 0) {
                writer.write(this.f43267b, i2, i3);
            }
            return i3;
        }
        ArrayList arrayList = this.f43270e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr2 = (char[]) this.f43270e.get(i4);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i += length;
            }
        } else {
            i = 0;
        }
        int i5 = this.f43274i;
        if (i5 > 0) {
            writer.write(this.f43273h, 0, i5);
            return i + i5;
        }
        return i;
    }

    /* renamed from: d */
    public final void m49493d(int i) {
        if (this.f43270e == null) {
            this.f43270e = new ArrayList();
        }
        char[] cArr = this.f43273h;
        this.f43271f = true;
        this.f43270e.add(cArr);
        this.f43272g += cArr.length;
        this.f43274i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.f43273h = m49495b(i2);
    }

    /* renamed from: e */
    public final char[] m49492e() {
        int i;
        String str = this.f43275j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f43268c;
        if (i2 >= 0) {
            int i3 = this.f43269d;
            if (i3 < 1) {
                return f43265l;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.f43267b, i3);
            }
            return Arrays.copyOfRange(this.f43267b, i2, i3 + i2);
        }
        int size = size();
        if (size < 1) {
            return f43265l;
        }
        char[] m49495b = m49495b(size);
        ArrayList arrayList = this.f43270e;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                char[] cArr = (char[]) this.f43270e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, m49495b, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f43273h, 0, m49495b, i, this.f43274i);
        return m49495b;
    }

    public char[] emptyAndGetCurrentSegment() {
        this.f43268c = -1;
        this.f43274i = 0;
        this.f43269d = 0;
        this.f43267b = null;
        this.f43275j = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        }
        char[] cArr = this.f43273h;
        if (cArr == null) {
            char[] m49496a = m49496a(0);
            this.f43273h = m49496a;
            return m49496a;
        }
        return cArr;
    }

    public void ensureNotShared() {
        if (this.f43268c >= 0) {
            m49491f(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this.f43273h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f43273h = copyOf;
        return copyOf;
    }

    /* renamed from: f */
    public final void m49491f(int i) {
        int i2 = this.f43269d;
        this.f43269d = 0;
        char[] cArr = this.f43267b;
        this.f43267b = null;
        int i3 = this.f43268c;
        this.f43268c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f43273h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f43273h = m49496a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f43273h, 0, i2);
        }
        this.f43272g = 0;
        this.f43274i = i2;
    }

    public char[] finishCurrentSegment() {
        if (this.f43270e == null) {
            this.f43270e = new ArrayList();
        }
        this.f43271f = true;
        this.f43270e.add(this.f43273h);
        int length = this.f43273h.length;
        this.f43272g += length;
        this.f43274i = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] m49495b = m49495b(i);
        this.f43273h = m49495b;
        return m49495b;
    }

    public char[] getBufferWithoutReset() {
        return this.f43273h;
    }

    public char[] getCurrentSegment() {
        if (this.f43268c >= 0) {
            m49491f(1);
        } else {
            char[] cArr = this.f43273h;
            if (cArr == null) {
                this.f43273h = m49496a(0);
            } else if (this.f43274i >= cArr.length) {
                m49493d(1);
            }
        }
        return this.f43273h;
    }

    public int getCurrentSegmentSize() {
        return this.f43274i;
    }

    public char[] getTextBuffer() {
        if (this.f43268c >= 0) {
            return this.f43267b;
        }
        char[] cArr = this.f43276k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f43275j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f43276k = charArray;
            return charArray;
        } else if (!this.f43271f) {
            char[] cArr2 = this.f43273h;
            if (cArr2 == null) {
                return f43265l;
            }
            return cArr2;
        } else {
            return contentsAsArray();
        }
    }

    public int getTextOffset() {
        int i = this.f43268c;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public boolean hasTextAsCharacters() {
        if (this.f43268c >= 0 || this.f43276k != null || this.f43275j == null) {
            return true;
        }
        return false;
    }

    public void releaseBuffers() {
        char[] cArr;
        this.f43268c = -1;
        this.f43274i = 0;
        this.f43269d = 0;
        this.f43267b = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        }
        BufferRecycler bufferRecycler = this.f43266a;
        if (bufferRecycler != null && (cArr = this.f43273h) != null) {
            this.f43273h = null;
            bufferRecycler.releaseCharBuffer(2, cArr);
        }
    }

    public void resetWith(char c) {
        this.f43268c = -1;
        this.f43269d = 0;
        this.f43275j = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        } else if (this.f43273h == null) {
            this.f43273h = m49496a(1);
        }
        this.f43273h[0] = c;
        this.f43272g = 1;
        this.f43274i = 1;
    }

    public void resetWithCopy(char[] cArr, int i, int i2) {
        this.f43267b = null;
        this.f43268c = -1;
        this.f43269d = 0;
        this.f43275j = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        } else if (this.f43273h == null) {
            this.f43273h = m49496a(i2);
        }
        this.f43272g = 0;
        this.f43274i = 0;
        append(cArr, i, i2);
    }

    public void resetWithEmpty() {
        this.f43268c = -1;
        this.f43274i = 0;
        this.f43269d = 0;
        this.f43267b = null;
        this.f43275j = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        }
    }

    public void resetWithShared(char[] cArr, int i, int i2) {
        this.f43275j = null;
        this.f43276k = null;
        this.f43267b = cArr;
        this.f43268c = i;
        this.f43269d = i2;
        if (this.f43271f) {
            m49494c();
        }
    }

    public void resetWithString(String str) {
        this.f43267b = null;
        this.f43268c = -1;
        this.f43269d = 0;
        this.f43275j = str;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        }
        this.f43274i = 0;
    }

    public String setCurrentAndReturn(int i) {
        String str;
        this.f43274i = i;
        if (this.f43272g > 0) {
            return contentsAsString();
        }
        if (i == 0) {
            str = "";
        } else {
            str = new String(this.f43273h, 0, i);
        }
        this.f43275j = str;
        return str;
    }

    public void setCurrentLength(int i) {
        this.f43274i = i;
    }

    public int size() {
        if (this.f43268c >= 0) {
            return this.f43269d;
        }
        char[] cArr = this.f43276k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f43275j;
        if (str != null) {
            return str.length();
        }
        return this.f43272g + this.f43274i;
    }

    public String toString() {
        return contentsAsString();
    }

    public TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this.f43266a = bufferRecycler;
        this.f43273h = cArr;
        this.f43274i = cArr.length;
        this.f43268c = -1;
    }

    public char[] expandCurrentSegment(int i) {
        char[] cArr = this.f43273h;
        if (cArr.length >= i) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f43273h = copyOf;
        return copyOf;
    }

    public void append(char[] cArr, int i, int i2) {
        if (this.f43268c >= 0) {
            m49491f(i2);
        }
        this.f43275j = null;
        this.f43276k = null;
        char[] cArr2 = this.f43273h;
        int length = cArr2.length;
        int i3 = this.f43274i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f43274i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            m49493d(i2);
            int min = Math.min(this.f43273h.length, i2);
            System.arraycopy(cArr, i, this.f43273h, 0, min);
            this.f43274i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public void resetWithCopy(String str, int i, int i2) {
        this.f43267b = null;
        this.f43268c = -1;
        this.f43269d = 0;
        this.f43275j = null;
        this.f43276k = null;
        if (this.f43271f) {
            m49494c();
        } else if (this.f43273h == null) {
            this.f43273h = m49496a(i2);
        }
        this.f43272g = 0;
        this.f43274i = 0;
        append(str, i, i2);
    }

    public void append(String str, int i, int i2) {
        if (this.f43268c >= 0) {
            m49491f(i2);
        }
        this.f43275j = null;
        this.f43276k = null;
        char[] cArr = this.f43273h;
        int length = cArr.length;
        int i3 = this.f43274i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f43274i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            m49493d(i2);
            int min = Math.min(this.f43273h.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.f43273h, 0);
            this.f43274i += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            }
            i = i6;
        }
    }
}