package org.apache.commons.p028io.input.buffer;

import java.util.Objects;
import org.apache.commons.p028io.IOUtils;

/* renamed from: org.apache.commons.io.input.buffer.CircularByteBuffer */
/* loaded from: classes6.dex */
public class CircularByteBuffer {

    /* renamed from: a */
    public final byte[] f73524a;

    /* renamed from: b */
    public int f73525b;

    /* renamed from: c */
    public int f73526c;

    /* renamed from: d */
    public int f73527d;

    public CircularByteBuffer() {
        this(8192);
    }

    public void add(byte b) {
        int i = this.f73527d;
        byte[] bArr = this.f73524a;
        if (i < bArr.length) {
            int i2 = this.f73526c;
            bArr[i2] = b;
            this.f73527d = i + 1;
            int i3 = i2 + 1;
            this.f73526c = i3;
            if (i3 == bArr.length) {
                this.f73526c = 0;
                return;
            }
            return;
        }
        throw new IllegalStateException("No space available");
    }

    public void clear() {
        this.f73525b = 0;
        this.f73526c = 0;
        this.f73527d = 0;
    }

    public int getCurrentNumberOfBytes() {
        return this.f73527d;
    }

    public int getSpace() {
        return this.f73524a.length - this.f73527d;
    }

    public boolean hasBytes() {
        if (this.f73527d > 0) {
            return true;
        }
        return false;
    }

    public boolean hasSpace() {
        return this.f73527d < this.f73524a.length;
    }

    public boolean peek(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i >= 0 && i < bArr.length) {
            if (i2 >= 0 && i2 <= this.f73524a.length) {
                if (i2 < this.f73527d) {
                    return false;
                }
                int i3 = this.f73525b;
                for (int i4 = 0; i4 < i2; i4++) {
                    byte[] bArr2 = this.f73524a;
                    if (bArr2[i3] != bArr[i4 + i]) {
                        return false;
                    }
                    i3++;
                    if (i3 == bArr2.length) {
                        i3 = 0;
                    }
                }
                return true;
            }
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
        throw new IllegalArgumentException("Illegal offset: " + i);
    }

    public byte read() {
        int i = this.f73527d;
        if (i > 0) {
            byte[] bArr = this.f73524a;
            int i2 = this.f73525b;
            byte b = bArr[i2];
            this.f73527d = i - 1;
            int i3 = i2 + 1;
            this.f73525b = i3;
            if (i3 == bArr.length) {
                this.f73525b = 0;
            }
            return b;
        }
        throw new IllegalStateException("No bytes available.");
    }

    public CircularByteBuffer(int i) {
        this.f73524a = IOUtils.byteArray(i);
        this.f73525b = 0;
        this.f73526c = 0;
        this.f73527d = 0;
    }

    public boolean hasSpace(int i) {
        return this.f73527d + i <= this.f73524a.length;
    }

    public void add(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i < 0 || i >= bArr.length) {
            throw new IllegalArgumentException("Illegal offset: " + i);
        } else if (i2 >= 0) {
            if (this.f73527d + i2 <= this.f73524a.length) {
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr2 = this.f73524a;
                    int i4 = this.f73526c;
                    bArr2[i4] = bArr[i + i3];
                    int i5 = i4 + 1;
                    this.f73526c = i5;
                    if (i5 == bArr2.length) {
                        this.f73526c = 0;
                    }
                }
                this.f73527d += i2;
                return;
            }
            throw new IllegalStateException("No space available");
        } else {
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
    }

    public void read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "targetBuffer");
        if (i >= 0 && i < bArr.length) {
            if (i2 >= 0 && i2 <= this.f73524a.length) {
                int i3 = i + i2;
                if (i3 <= bArr.length) {
                    if (this.f73527d < i2) {
                        throw new IllegalStateException("Currently, there are only " + this.f73527d + "in the buffer, not " + i2);
                    }
                    int i4 = 0;
                    while (i4 < i2) {
                        int i5 = i + 1;
                        byte[] bArr2 = this.f73524a;
                        int i6 = this.f73525b;
                        bArr[i] = bArr2[i6];
                        this.f73527d--;
                        int i7 = i6 + 1;
                        this.f73525b = i7;
                        if (i7 == bArr2.length) {
                            this.f73525b = 0;
                        }
                        i4++;
                        i = i5;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("The supplied byte array contains only ");
                sb.append(bArr.length);
                sb.append(" bytes, but offset, and length would require ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException("Illegal length: " + i2);
        }
        throw new IllegalArgumentException("Illegal offset: " + i);
    }
}
