package p000;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

/* renamed from: ft1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19995ft1 extends InputStream {

    /* renamed from: a */
    public final Reader f61979a;

    /* renamed from: b */
    public final CharsetEncoder f61980b;

    /* renamed from: c */
    public final byte[] f61981c;

    /* renamed from: d */
    public CharBuffer f61982d;

    /* renamed from: e */
    public ByteBuffer f61983e;

    /* renamed from: f */
    public boolean f61984f;

    /* renamed from: g */
    public boolean f61985g;

    /* renamed from: h */
    public boolean f61986h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19995ft1(java.io.Reader r2, java.nio.charset.Charset r3, int r4) {
        /*
            r1 = this;
            java.nio.charset.CharsetEncoder r3 = r3.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r3 = r3.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r3 = r3.onUnmappableCharacter(r0)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19995ft1.<init>(java.io.Reader, java.nio.charset.Charset, int):void");
    }

    /* renamed from: b */
    public static int m31464b(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    /* renamed from: g */
    public static CharBuffer m31462g(CharBuffer charBuffer) {
        CharBuffer wrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        AbstractC18017Lg0.m67529d(wrap, charBuffer.position());
        AbstractC18017Lg0.m67530c(wrap, charBuffer.limit());
        return wrap;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f61979a.close();
    }

    /* renamed from: d */
    public final int m31463d(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f61983e.remaining());
        this.f61983e.get(bArr, i, min);
        return min;
    }

    /* renamed from: i */
    public final void m31461i() {
        if (m31464b(this.f61982d) == 0) {
            if (this.f61982d.position() > 0) {
                AbstractC18017Lg0.m67531b(this.f61982d.compact());
            } else {
                this.f61982d = m31462g(this.f61982d);
            }
        }
        int limit = this.f61982d.limit();
        int read = this.f61979a.read(this.f61982d.array(), limit, m31464b(this.f61982d));
        if (read == -1) {
            this.f61984f = true;
        } else {
            AbstractC18017Lg0.m67530c(this.f61982d, limit + read);
        }
    }

    /* renamed from: j */
    public final void m31460j(boolean z) {
        AbstractC18017Lg0.m67531b(this.f61983e);
        if (z && this.f61983e.remaining() == 0) {
            this.f61983e = ByteBuffer.allocate(this.f61983e.capacity() * 2);
        } else {
            this.f61985g = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f61981c) == 1) {
            return UnsignedBytes.toInt(this.f61981c[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        return r2;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f61984f
            r2 = 0
        Ld:
            boolean r3 = r7.f61985g
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.m31463d(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f61986h
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f61985g = r0
            java.nio.ByteBuffer r3 = r7.f61983e
            p000.AbstractC18017Lg0.m67532a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = -1
        L2d:
            return r2
        L2e:
            boolean r3 = r7.f61986h
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f61980b
            java.nio.ByteBuffer r4 = r7.f61983e
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f61980b
            java.nio.CharBuffer r4 = r7.f61982d
            java.nio.ByteBuffer r5 = r7.f61983e
            boolean r6 = r7.f61984f
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.m31460j(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f61986h = r5
            r7.m31460j(r0)
            goto Ld
        L65:
            boolean r3 = r7.f61984f
            if (r3 == 0) goto L6b
            r1 = 1
            goto L2e
        L6b:
            r7.m31461i()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19995ft1.read(byte[], int, int):int");
    }

    public C19995ft1(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.f61981c = new byte[1];
        this.f61979a = (Reader) Preconditions.checkNotNull(reader);
        this.f61980b = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer allocate = CharBuffer.allocate(i);
        this.f61982d = allocate;
        AbstractC18017Lg0.m67531b(allocate);
        this.f61983e = ByteBuffer.allocate(i);
    }
}