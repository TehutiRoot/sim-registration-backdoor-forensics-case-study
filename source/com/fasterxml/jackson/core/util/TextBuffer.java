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
    public static final char[] f43253l = new char[0];

    /* renamed from: a */
    public final BufferRecycler f43254a;

    /* renamed from: b */
    public char[] f43255b;

    /* renamed from: c */
    public int f43256c;

    /* renamed from: d */
    public int f43257d;

    /* renamed from: e */
    public ArrayList f43258e;

    /* renamed from: f */
    public boolean f43259f;

    /* renamed from: g */
    public int f43260g;

    /* renamed from: h */
    public char[] f43261h;

    /* renamed from: i */
    public int f43262i;

    /* renamed from: j */
    public String f43263j;

    /* renamed from: k */
    public char[] f43264k;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this.f43254a = bufferRecycler;
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    /* renamed from: a */
    public final char[] m49499a(int i) {
        BufferRecycler bufferRecycler = this.f43254a;
        if (bufferRecycler != null) {
            return bufferRecycler.allocCharBuffer(2, i);
        }
        return new char[Math.max(i, 500)];
    }

    public void append(char c) {
        if (this.f43256c >= 0) {
            m49494f(16);
        }
        this.f43263j = null;
        this.f43264k = null;
        char[] cArr = this.f43261h;
        if (this.f43262i >= cArr.length) {
            m49496d(1);
            cArr = this.f43261h;
        }
        int i = this.f43262i;
        this.f43262i = i + 1;
        cArr[i] = c;
    }

    /* renamed from: b */
    public final char[] m49498b(int i) {
        return new char[i];
    }

    /* renamed from: c */
    public final void m49497c() {
        this.f43259f = false;
        this.f43258e.clear();
        this.f43260g = 0;
        this.f43262i = 0;
    }

    public char[] contentsAsArray() {
        char[] cArr = this.f43264k;
        if (cArr == null) {
            char[] m49495e = m49495e();
            this.f43264k = m49495e;
            return m49495e;
        }
        return cArr;
    }

    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.f43264k;
        if (cArr3 != null) {
            return NumberInput.parseBigDecimal(cArr3);
        }
        int i = this.f43256c;
        if (i >= 0 && (cArr2 = this.f43255b) != null) {
            return NumberInput.parseBigDecimal(cArr2, i, this.f43257d);
        }
        if (this.f43260g == 0 && (cArr = this.f43261h) != null) {
            return NumberInput.parseBigDecimal(cArr, 0, this.f43262i);
        }
        return NumberInput.parseBigDecimal(contentsAsArray());
    }

    public double contentsAsDouble() throws NumberFormatException {
        return NumberInput.parseDouble(contentsAsString());
    }

    public int contentsAsInt(boolean z) {
        char[] cArr;
        int i = this.f43256c;
        if (i >= 0 && (cArr = this.f43255b) != null) {
            if (z) {
                return -NumberInput.parseInt(cArr, i + 1, this.f43257d - 1);
            }
            return NumberInput.parseInt(cArr, i, this.f43257d);
        } else if (z) {
            return -NumberInput.parseInt(this.f43261h, 1, this.f43262i - 1);
        } else {
            return NumberInput.parseInt(this.f43261h, 0, this.f43262i);
        }
    }

    public long contentsAsLong(boolean z) {
        char[] cArr;
        int i = this.f43256c;
        if (i >= 0 && (cArr = this.f43255b) != null) {
            if (z) {
                return -NumberInput.parseLong(cArr, i + 1, this.f43257d - 1);
            }
            return NumberInput.parseLong(cArr, i, this.f43257d);
        } else if (z) {
            return -NumberInput.parseLong(this.f43261h, 1, this.f43262i - 1);
        } else {
            return NumberInput.parseLong(this.f43261h, 0, this.f43262i);
        }
    }

    public String contentsAsString() {
        if (this.f43263j == null) {
            char[] cArr = this.f43264k;
            if (cArr != null) {
                this.f43263j = new String(cArr);
            } else {
                int i = this.f43256c;
                String str = "";
                if (i >= 0) {
                    int i2 = this.f43257d;
                    if (i2 < 1) {
                        this.f43263j = "";
                        return "";
                    }
                    this.f43263j = new String(this.f43255b, i, i2);
                } else {
                    int i3 = this.f43260g;
                    int i4 = this.f43262i;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.f43261h, 0, i4);
                        }
                        this.f43263j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.f43258e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.f43258e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.f43261h, 0, this.f43262i);
                        this.f43263j = sb.toString();
                    }
                }
            }
        }
        return this.f43263j;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i;
        char[] cArr = this.f43264k;
        if (cArr != null) {
            writer.write(cArr);
            return this.f43264k.length;
        }
        String str = this.f43263j;
        if (str != null) {
            writer.write(str);
            return this.f43263j.length();
        }
        int i2 = this.f43256c;
        if (i2 >= 0) {
            int i3 = this.f43257d;
            if (i3 > 0) {
                writer.write(this.f43255b, i2, i3);
            }
            return i3;
        }
        ArrayList arrayList = this.f43258e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr2 = (char[]) this.f43258e.get(i4);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i += length;
            }
        } else {
            i = 0;
        }
        int i5 = this.f43262i;
        if (i5 > 0) {
            writer.write(this.f43261h, 0, i5);
            return i + i5;
        }
        return i;
    }

    /* renamed from: d */
    public final void m49496d(int i) {
        if (this.f43258e == null) {
            this.f43258e = new ArrayList();
        }
        char[] cArr = this.f43261h;
        this.f43259f = true;
        this.f43258e.add(cArr);
        this.f43260g += cArr.length;
        this.f43262i = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.f43261h = m49498b(i2);
    }

    /* renamed from: e */
    public final char[] m49495e() {
        int i;
        String str = this.f43263j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f43256c;
        if (i2 >= 0) {
            int i3 = this.f43257d;
            if (i3 < 1) {
                return f43253l;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.f43255b, i3);
            }
            return Arrays.copyOfRange(this.f43255b, i2, i3 + i2);
        }
        int size = size();
        if (size < 1) {
            return f43253l;
        }
        char[] m49498b = m49498b(size);
        ArrayList arrayList = this.f43258e;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                char[] cArr = (char[]) this.f43258e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, m49498b, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f43261h, 0, m49498b, i, this.f43262i);
        return m49498b;
    }

    public char[] emptyAndGetCurrentSegment() {
        this.f43256c = -1;
        this.f43262i = 0;
        this.f43257d = 0;
        this.f43255b = null;
        this.f43263j = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        }
        char[] cArr = this.f43261h;
        if (cArr == null) {
            char[] m49499a = m49499a(0);
            this.f43261h = m49499a;
            return m49499a;
        }
        return cArr;
    }

    public void ensureNotShared() {
        if (this.f43256c >= 0) {
            m49494f(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this.f43261h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f43261h = copyOf;
        return copyOf;
    }

    /* renamed from: f */
    public final void m49494f(int i) {
        int i2 = this.f43257d;
        this.f43257d = 0;
        char[] cArr = this.f43255b;
        this.f43255b = null;
        int i3 = this.f43256c;
        this.f43256c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.f43261h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.f43261h = m49499a(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.f43261h, 0, i2);
        }
        this.f43260g = 0;
        this.f43262i = i2;
    }

    public char[] finishCurrentSegment() {
        if (this.f43258e == null) {
            this.f43258e = new ArrayList();
        }
        this.f43259f = true;
        this.f43258e.add(this.f43261h);
        int length = this.f43261h.length;
        this.f43260g += length;
        this.f43262i = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] m49498b = m49498b(i);
        this.f43261h = m49498b;
        return m49498b;
    }

    public char[] getBufferWithoutReset() {
        return this.f43261h;
    }

    public char[] getCurrentSegment() {
        if (this.f43256c >= 0) {
            m49494f(1);
        } else {
            char[] cArr = this.f43261h;
            if (cArr == null) {
                this.f43261h = m49499a(0);
            } else if (this.f43262i >= cArr.length) {
                m49496d(1);
            }
        }
        return this.f43261h;
    }

    public int getCurrentSegmentSize() {
        return this.f43262i;
    }

    public char[] getTextBuffer() {
        if (this.f43256c >= 0) {
            return this.f43255b;
        }
        char[] cArr = this.f43264k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.f43263j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.f43264k = charArray;
            return charArray;
        } else if (!this.f43259f) {
            char[] cArr2 = this.f43261h;
            if (cArr2 == null) {
                return f43253l;
            }
            return cArr2;
        } else {
            return contentsAsArray();
        }
    }

    public int getTextOffset() {
        int i = this.f43256c;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public boolean hasTextAsCharacters() {
        if (this.f43256c >= 0 || this.f43264k != null || this.f43263j == null) {
            return true;
        }
        return false;
    }

    public void releaseBuffers() {
        char[] cArr;
        this.f43256c = -1;
        this.f43262i = 0;
        this.f43257d = 0;
        this.f43255b = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        }
        BufferRecycler bufferRecycler = this.f43254a;
        if (bufferRecycler != null && (cArr = this.f43261h) != null) {
            this.f43261h = null;
            bufferRecycler.releaseCharBuffer(2, cArr);
        }
    }

    public void resetWith(char c) {
        this.f43256c = -1;
        this.f43257d = 0;
        this.f43263j = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        } else if (this.f43261h == null) {
            this.f43261h = m49499a(1);
        }
        this.f43261h[0] = c;
        this.f43260g = 1;
        this.f43262i = 1;
    }

    public void resetWithCopy(char[] cArr, int i, int i2) {
        this.f43255b = null;
        this.f43256c = -1;
        this.f43257d = 0;
        this.f43263j = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        } else if (this.f43261h == null) {
            this.f43261h = m49499a(i2);
        }
        this.f43260g = 0;
        this.f43262i = 0;
        append(cArr, i, i2);
    }

    public void resetWithEmpty() {
        this.f43256c = -1;
        this.f43262i = 0;
        this.f43257d = 0;
        this.f43255b = null;
        this.f43263j = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        }
    }

    public void resetWithShared(char[] cArr, int i, int i2) {
        this.f43263j = null;
        this.f43264k = null;
        this.f43255b = cArr;
        this.f43256c = i;
        this.f43257d = i2;
        if (this.f43259f) {
            m49497c();
        }
    }

    public void resetWithString(String str) {
        this.f43255b = null;
        this.f43256c = -1;
        this.f43257d = 0;
        this.f43263j = str;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        }
        this.f43262i = 0;
    }

    public String setCurrentAndReturn(int i) {
        String str;
        this.f43262i = i;
        if (this.f43260g > 0) {
            return contentsAsString();
        }
        if (i == 0) {
            str = "";
        } else {
            str = new String(this.f43261h, 0, i);
        }
        this.f43263j = str;
        return str;
    }

    public void setCurrentLength(int i) {
        this.f43262i = i;
    }

    public int size() {
        if (this.f43256c >= 0) {
            return this.f43257d;
        }
        char[] cArr = this.f43264k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f43263j;
        if (str != null) {
            return str.length();
        }
        return this.f43260g + this.f43262i;
    }

    public String toString() {
        return contentsAsString();
    }

    public TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this.f43254a = bufferRecycler;
        this.f43261h = cArr;
        this.f43262i = cArr.length;
        this.f43256c = -1;
    }

    public char[] expandCurrentSegment(int i) {
        char[] cArr = this.f43261h;
        if (cArr.length >= i) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this.f43261h = copyOf;
        return copyOf;
    }

    public void append(char[] cArr, int i, int i2) {
        if (this.f43256c >= 0) {
            m49494f(i2);
        }
        this.f43263j = null;
        this.f43264k = null;
        char[] cArr2 = this.f43261h;
        int length = cArr2.length;
        int i3 = this.f43262i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.f43262i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            m49496d(i2);
            int min = Math.min(this.f43261h.length, i2);
            System.arraycopy(cArr, i, this.f43261h, 0, min);
            this.f43262i += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public void resetWithCopy(String str, int i, int i2) {
        this.f43255b = null;
        this.f43256c = -1;
        this.f43257d = 0;
        this.f43263j = null;
        this.f43264k = null;
        if (this.f43259f) {
            m49497c();
        } else if (this.f43261h == null) {
            this.f43261h = m49499a(i2);
        }
        this.f43260g = 0;
        this.f43262i = 0;
        append(str, i, i2);
    }

    public void append(String str, int i, int i2) {
        if (this.f43256c >= 0) {
            m49494f(i2);
        }
        this.f43263j = null;
        this.f43264k = null;
        char[] cArr = this.f43261h;
        int length = cArr.length;
        int i3 = this.f43262i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.f43262i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            m49496d(i2);
            int min = Math.min(this.f43261h.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this.f43261h, 0);
            this.f43262i += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            }
            i = i6;
        }
    }
}
