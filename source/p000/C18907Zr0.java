package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: Zr0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C18907Zr0 extends AbstractC22790wQ1 {

    /* renamed from: a */
    public byte[] f8157a;

    /* renamed from: b */
    public int f8158b = 0;

    public C18907Zr0(InputStream inputStream) {
        this.f8157a = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    this.f8157a = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: b */
    public long mo858b() {
        return this.f8158b;
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: d */
    public InputStream mo857d() {
        return new ByteArrayInputStream(this.f8157a);
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: g */
    public long mo856g() {
        return this.f8157a.length;
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: m */
    public short mo851m() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    @Override // p000.AbstractC22790wQ1
    public int read() {
        int i = this.f8158b;
        byte[] bArr = this.f8157a;
        if (i >= bArr.length) {
            return -1;
        }
        byte b = bArr[i];
        this.f8158b = i + 1;
        return (b + 256) % 256;
    }

    @Override // p000.AbstractC22790wQ1
    public long readLong() {
        return (m65143v() << 32) + (m65143v() & BodyPartID.bodyIdMax);
    }

    @Override // p000.AbstractC22790wQ1
    public void seek(long j) {
        if (j >= 0 && j <= 2147483647L) {
            this.f8158b = (int) j;
            return;
        }
        throw new IOException("Illegal seek position: " + j);
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: t */
    public int mo844t() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new EOFException();
    }

    /* renamed from: v */
    public int m65143v() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    @Override // p000.AbstractC22790wQ1
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f8158b;
        byte[] bArr2 = this.f8157a;
        if (i3 < bArr2.length) {
            int min = Math.min(i2, bArr2.length - i3);
            System.arraycopy(this.f8157a, this.f8158b, bArr, i, min);
            this.f8158b += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
