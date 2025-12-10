package org.apache.commons.p028io.input;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.input.UnsynchronizedByteArrayInputStream */
/* loaded from: classes6.dex */
public class UnsynchronizedByteArrayInputStream extends InputStream {
    public static final int END_OF_STREAM = -1;

    /* renamed from: a */
    public final byte[] f73495a;

    /* renamed from: b */
    public final int f73496b;

    /* renamed from: c */
    public int f73497c;

    /* renamed from: d */
    public int f73498d;

    /* renamed from: org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UnsynchronizedByteArrayInputStream, Builder> {

        /* renamed from: k */
        public int f73499k;

        /* renamed from: l */
        public int f73500l;

        public Builder setLength(int i) {
            if (i >= 0) {
                this.f73500l = i;
                return this;
            }
            throw new IllegalArgumentException("length cannot be negative");
        }

        public Builder setOffset(int i) {
            if (i >= 0) {
                this.f73499k = i;
                return this;
            }
            throw new IllegalArgumentException("offset cannot be negative");
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UnsynchronizedByteArrayInputStream get() throws IOException {
            return new UnsynchronizedByteArrayInputStream(checkOrigin().getByteArray(), this.f73499k, this.f73500l);
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public Builder setByteArray(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.f73500l = bArr.length;
            return (Builder) super.setByteArray(bArr);
        }
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    /* renamed from: b */
    public static int m24982b(byte[] bArr, int i) {
        int i2;
        m24981d(i, "defaultValue");
        if (bArr.length > 0) {
            i2 = bArr.length;
        } else {
            i2 = i;
        }
        return Math.min(i, i2);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static int m24981d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.f73497c;
        int i2 = this.f73496b;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f73498d = this.f73497c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.f73497c;
        if (i < this.f73496b) {
            byte[] bArr = this.f73495a;
            this.f73497c = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f73497c = this.f73498d;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j >= 0) {
            int i = this.f73496b;
            int i2 = this.f73497c;
            long j2 = i - i2;
            if (j < j2) {
                j2 = j;
            }
            this.f73497c = AbstractC23322zY1.m74a(i2, AbstractC12188l0.m26572a(j));
            return j2;
        }
        throw new IllegalArgumentException("Skipping backward is not supported");
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i) {
        this(bArr, bArr.length, Math.min(m24981d(i, TypedValues.CycleType.S_WAVE_OFFSET), m24982b(bArr, i)), m24982b(bArr, i));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i, int i2) {
        m24981d(i, TypedValues.CycleType.S_WAVE_OFFSET);
        m24981d(i2, "length");
        Objects.requireNonNull(bArr, "data");
        this.f73495a = bArr;
        this.f73496b = Math.min(m24982b(bArr, i) + i2, bArr.length);
        this.f73497c = m24982b(bArr, i);
        this.f73498d = m24982b(bArr, i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "dest");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int i3 = this.f73497c;
            int i4 = this.f73496b;
            if (i3 >= i4) {
                return -1;
            }
            int i5 = i4 - i3;
            if (i2 >= i5) {
                i2 = i5;
            }
            if (i2 <= 0) {
                return 0;
            }
            System.arraycopy(this.f73495a, i3, bArr, i, i2);
            this.f73497c += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException();
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i, int i2, int i3) {
        Objects.requireNonNull(bArr, "data");
        this.f73495a = bArr;
        this.f73496b = i;
        this.f73497c = i2;
        this.f73498d = i3;
    }
}
