package p000;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* renamed from: Wo */
/* loaded from: classes4.dex */
public final class C1626Wo extends Reader {

    /* renamed from: a */
    public CharSequence f7386a;

    /* renamed from: b */
    public int f7387b;

    /* renamed from: c */
    public int f7388c;

    public C1626Wo(CharSequence charSequence) {
        this.f7386a = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    /* renamed from: b */
    public final void m65657b() {
        if (this.f7386a != null) {
            return;
        }
        throw new IOException("reader closed");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f7386a = null;
    }

    /* renamed from: d */
    public final int m65656d() {
        Objects.requireNonNull(this.f7386a);
        return this.f7386a.length() - this.f7387b;
    }

    public final boolean hasRemaining() {
        if (m65656d() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "readAheadLimit (%s) may not be negative", i);
        m65657b();
        this.f7388c = this.f7387b;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) {
        Preconditions.checkNotNull(charBuffer);
        m65657b();
        Objects.requireNonNull(this.f7386a);
        if (hasRemaining()) {
            int min = Math.min(charBuffer.remaining(), m65656d());
            for (int i = 0; i < min; i++) {
                CharSequence charSequence = this.f7386a;
                int i2 = this.f7387b;
                this.f7387b = i2 + 1;
                charBuffer.put(charSequence.charAt(i2));
            }
            return min;
        }
        return -1;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() {
        m65657b();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() {
        m65657b();
        this.f7387b = this.f7388c;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j) {
        boolean z;
        int min;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "n (%s) may not be negative", j);
        m65657b();
        min = (int) Math.min(m65656d(), j);
        this.f7387b += min;
        return min;
    }

    @Override // java.io.Reader
    public synchronized int read() {
        char c;
        m65657b();
        Objects.requireNonNull(this.f7386a);
        if (hasRemaining()) {
            CharSequence charSequence = this.f7386a;
            int i = this.f7387b;
            this.f7387b = i + 1;
            c = charSequence.charAt(i);
        } else {
            c = 65535;
        }
        return c;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, cArr.length);
        m65657b();
        Objects.requireNonNull(this.f7386a);
        if (hasRemaining()) {
            int min = Math.min(i2, m65656d());
            for (int i3 = 0; i3 < min; i3++) {
                CharSequence charSequence = this.f7386a;
                int i4 = this.f7387b;
                this.f7387b = i4 + 1;
                cArr[i + i3] = charSequence.charAt(i4);
            }
            return min;
        }
        return -1;
    }
}