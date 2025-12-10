package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: SM1 */
/* loaded from: classes3.dex */
public class SM1 implements Closeable {

    /* renamed from: a */
    public final InputStream f5605a;

    /* renamed from: b */
    public final Charset f5606b;

    /* renamed from: c */
    public byte[] f5607c;

    /* renamed from: d */
    public int f5608d;

    /* renamed from: e */
    public int f5609e;

    /* renamed from: SM1$a */
    /* loaded from: classes3.dex */
    public class C1308a extends ByteArrayOutputStream {
        public C1308a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, SM1.this.f5606b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public SM1(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f5605a) {
            try {
                if (this.f5607c != null) {
                    this.f5607c = null;
                    this.f5605a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m66333d() {
        InputStream inputStream = this.f5605a;
        byte[] bArr = this.f5607c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f5608d = 0;
            this.f5609e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: g */
    public boolean m66332g() {
        if (this.f5609e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public String m66331i() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f5605a) {
            try {
                if (this.f5607c != null) {
                    if (this.f5608d >= this.f5609e) {
                        m66333d();
                    }
                    for (int i3 = this.f5608d; i3 != this.f5609e; i3++) {
                        byte[] bArr2 = this.f5607c;
                        if (bArr2[i3] == 10) {
                            int i4 = this.f5608d;
                            if (i3 != i4) {
                                i2 = i3 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i4, i2 - i4, this.f5606b.name());
                                    this.f5608d = i3 + 1;
                                    return str;
                                }
                            }
                            i2 = i3;
                            String str2 = new String(bArr2, i4, i2 - i4, this.f5606b.name());
                            this.f5608d = i3 + 1;
                            return str2;
                        }
                    }
                    C1308a c1308a = new C1308a((this.f5609e - this.f5608d) + 80);
                    loop1: while (true) {
                        byte[] bArr3 = this.f5607c;
                        int i5 = this.f5608d;
                        c1308a.write(bArr3, i5, this.f5609e - i5);
                        this.f5609e = -1;
                        m66333d();
                        i = this.f5608d;
                        while (i != this.f5609e) {
                            bArr = this.f5607c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                    int i6 = this.f5608d;
                    if (i != i6) {
                        c1308a.write(bArr, i6, i - i6);
                    }
                    this.f5608d = i + 1;
                    return c1308a.toString();
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SM1(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(E02.f1181a)) {
                this.f5605a = inputStream;
                this.f5606b = charset;
                this.f5607c = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
