package org.apache.commons.p028io.input;

import java.io.Reader;
import java.io.Serializable;
import java.util.Objects;

/* renamed from: org.apache.commons.io.input.CharSequenceReader */
/* loaded from: classes6.dex */
public class CharSequenceReader extends Reader implements Serializable {
    private static final long serialVersionUID = 3724187752191401220L;
    private final CharSequence charSequence;
    private final Integer end;
    private int idx;
    private int mark;
    private final int start;

    public CharSequenceReader(CharSequence charSequence) {
        this(charSequence, 0);
    }

    private int end() {
        int intValue;
        int length = this.charSequence.length();
        Integer num = this.end;
        if (num == null) {
            intValue = Integer.MAX_VALUE;
        } else {
            intValue = num.intValue();
        }
        return Math.min(length, intValue);
    }

    private int start() {
        return Math.min(this.charSequence.length(), this.start);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i = this.start;
        this.idx = i;
        this.mark = i;
    }

    @Override // java.io.Reader
    public void mark(int i) {
        this.mark = this.idx;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.idx >= end()) {
            return -1;
        }
        CharSequence charSequence = this.charSequence;
        int i = this.idx;
        this.idx = i + 1;
        return charSequence.charAt(i);
    }

    @Override // java.io.Reader
    public boolean ready() {
        if (this.idx < end()) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public void reset() {
        this.idx = this.mark;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        if (j >= 0) {
            if (this.idx >= end()) {
                return 0L;
            }
            int min = (int) Math.min(end(), this.idx + j);
            this.idx = min;
            return min - this.idx;
        }
        throw new IllegalArgumentException("Number of characters to skip is less than zero: " + j);
    }

    public String toString() {
        return this.charSequence.subSequence(start(), end()).toString();
    }

    public CharSequenceReader(CharSequence charSequence, int i) {
        this(charSequence, i, Integer.MAX_VALUE);
    }

    public CharSequenceReader(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index is less than zero: " + i);
        } else if (i2 >= i) {
            this.charSequence = str == null ? "" : str;
            this.start = i;
            this.end = Integer.valueOf(i2);
            this.idx = i;
            this.mark = i;
        } else {
            throw new IllegalArgumentException("End index is less than start " + i + ": " + i2);
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        if (this.idx >= end()) {
            return -1;
        }
        Objects.requireNonNull(cArr, "array");
        if (i2 >= 0 && i >= 0 && i + i2 <= cArr.length) {
            CharSequence charSequence = this.charSequence;
            if (charSequence instanceof String) {
                int min = Math.min(i2, end() - this.idx);
                int i3 = this.idx;
                ((String) this.charSequence).getChars(i3, i3 + min, cArr, i);
                this.idx += min;
                return min;
            } else if (charSequence instanceof StringBuilder) {
                int min2 = Math.min(i2, end() - this.idx);
                int i4 = this.idx;
                ((StringBuilder) this.charSequence).getChars(i4, i4 + min2, cArr, i);
                this.idx += min2;
                return min2;
            } else if (charSequence instanceof StringBuffer) {
                int min3 = Math.min(i2, end() - this.idx);
                int i5 = this.idx;
                ((StringBuffer) this.charSequence).getChars(i5, i5 + min3, cArr, i);
                this.idx += min3;
                return min3;
            } else {
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int read = read();
                    if (read == -1) {
                        return i6;
                    }
                    cArr[i + i7] = (char) read;
                    i6++;
                }
                return i6;
            }
        }
        throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
    }
}