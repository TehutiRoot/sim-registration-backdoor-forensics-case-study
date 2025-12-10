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
    public final byte[] f73579a;

    /* renamed from: b */
    public final int f73580b;

    /* renamed from: c */
    public int f73581c;

    /* renamed from: d */
    public int f73582d;

    /* renamed from: org.apache.commons.io.input.UnsynchronizedByteArrayInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UnsynchronizedByteArrayInputStream, Builder> {

        /* renamed from: k */
        public int f73583k;

        /* renamed from: l */
        public int f73584l;

        public Builder setLength(int i) {
            if (i >= 0) {
                this.f73584l = i;
                return this;
            }
            throw new IllegalArgumentException("length cannot be negative");
        }

        public Builder setOffset(int i) {
            if (i >= 0) {
                this.f73583k = i;
                return this;
            }
            throw new IllegalArgumentException("offset cannot be negative");
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public UnsynchronizedByteArrayInputStream get() throws IOException {
            return new UnsynchronizedByteArrayInputStream(checkOrigin().getByteArray(), this.f73583k, this.f73584l);
        }

        @Override // org.apache.commons.p028io.build.AbstractOriginSupplier
        public Builder setByteArray(byte[] bArr) {
            Objects.requireNonNull(bArr, "origin");
            this.f73584l = bArr.length;
            return (Builder) super.setByteArray(bArr);
        }
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr) {
        this(bArr, bArr.length, 0, 0);
    }

    /* renamed from: b */
    public static int m25172b(byte[] bArr, int i) {
        int i2;
        m25171d(i, "defaultValue");
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
    public static int m25171d(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    @Override // java.io.InputStream
    public int available() {
        int i = this.f73581c;
        int i2 = this.f73580b;
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f73582d = this.f73581c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        int i = this.f73581c;
        if (i < this.f73580b) {
            byte[] bArr = this.f73579a;
            this.f73581c = i + 1;
            return bArr[i] & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f73581c = this.f73582d;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j >= 0) {
            int i = this.f73580b;
            int i2 = this.f73581c;
            long j2 = i - i2;
            if (j < j2) {
                j2 = j;
            }
            this.f73581c = AbstractC22877wZ1.m696a(i2, AbstractC12165l0.m26876a(j));
            return j2;
        }
        throw new IllegalArgumentException("Skipping backward is not supported");
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i) {
        this(bArr, bArr.length, Math.min(m25171d(i, TypedValues.CycleType.S_WAVE_OFFSET), m25172b(bArr, i)), m25172b(bArr, i));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        Objects.requireNonNull(bArr, "dest");
        return read(bArr, 0, bArr.length);
    }

    @Deprecated
    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i, int i2) {
        m25171d(i, TypedValues.CycleType.S_WAVE_OFFSET);
        m25171d(i2, "length");
        Objects.requireNonNull(bArr, "data");
        this.f73579a = bArr;
        this.f73580b = Math.min(m25172b(bArr, i) + i2, bArr.length);
        this.f73581c = m25172b(bArr, i);
        this.f73582d = m25172b(bArr, i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "dest");
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int i3 = this.f73581c;
            int i4 = this.f73580b;
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
            System.arraycopy(this.f73579a, i3, bArr, i, i2);
            this.f73581c += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException();
    }

    public UnsynchronizedByteArrayInputStream(byte[] bArr, int i, int i2, int i3) {
        Objects.requireNonNull(bArr, "data");
        this.f73579a = bArr;
        this.f73580b = i;
        this.f73581c = i2;
        this.f73582d = i3;
    }
}