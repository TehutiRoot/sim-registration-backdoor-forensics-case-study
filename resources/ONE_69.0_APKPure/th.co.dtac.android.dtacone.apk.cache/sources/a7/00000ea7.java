package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: PN1 */
/* loaded from: classes3.dex */
public class PN1 implements Closeable {

    /* renamed from: a */
    public final InputStream f4785a;

    /* renamed from: b */
    public final Charset f4786b;

    /* renamed from: c */
    public byte[] f4787c;

    /* renamed from: d */
    public int f4788d;

    /* renamed from: e */
    public int f4789e;

    /* renamed from: PN1$a */
    /* loaded from: classes3.dex */
    public class C1086a extends ByteArrayOutputStream {
        public C1086a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, PN1.this.f4786b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public PN1(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4785a) {
            try {
                if (this.f4787c != null) {
                    this.f4787c = null;
                    this.f4785a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m66969d() {
        InputStream inputStream = this.f4785a;
        byte[] bArr = this.f4787c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f4788d = 0;
            this.f4789e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: g */
    public boolean m66968g() {
        if (this.f4789e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public String m66967i() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f4785a) {
            try {
                if (this.f4787c != null) {
                    if (this.f4788d >= this.f4789e) {
                        m66969d();
                    }
                    for (int i3 = this.f4788d; i3 != this.f4789e; i3++) {
                        byte[] bArr2 = this.f4787c;
                        if (bArr2[i3] == 10) {
                            int i4 = this.f4788d;
                            if (i3 != i4) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i4, i2 - i4, this.f4786b.name());
                                    this.f4788d = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i4, i2 - i4, this.f4786b.name());
                            this.f4788d = i3 + 1;
                            return str2;
                        }
                    }
                    C1086a c1086a = new C1086a((this.f4789e - this.f4788d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f4787c;
                        int i5 = this.f4788d;
                        c1086a.write(bArr3, i5, this.f4789e - i5);
                        this.f4789e = -1;
                        m66969d();
                        i = this.f4788d;
                        while (i != this.f4789e) {
                            bArr = this.f4787c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    int i6 = this.f4788d;
                    if (i != i6) {
                        c1086a.write(bArr, i6, i - i6);
                    }
                    this.f4788d = i + 1;
                    return c1086a.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public PN1(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(B12.f296a)) {
                this.f4785a = inputStream;
                this.f4786b = charset;
                this.f4787c = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}