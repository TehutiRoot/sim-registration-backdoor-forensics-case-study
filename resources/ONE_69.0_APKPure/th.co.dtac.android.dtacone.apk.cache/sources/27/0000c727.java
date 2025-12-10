package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: fs0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19991fs0 extends AbstractC22342tR1 {

    /* renamed from: a */
    public byte[] f61973a;

    /* renamed from: b */
    public int f61974b = 0;

    public C19991fs0(InputStream inputStream) {
        this.f61973a = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    this.f61973a = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: b */
    public long mo22693b() {
        return this.f61974b;
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: d */
    public InputStream mo22692d() {
        return new ByteArrayInputStream(this.f61973a);
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: g */
    public long mo22691g() {
        return this.f61973a.length;
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: m */
    public short mo22686m() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    @Override // p000.AbstractC22342tR1
    public int read() {
        int i = this.f61974b;
        byte[] bArr = this.f61973a;
        if (i >= bArr.length) {
            return -1;
        }
        byte b = bArr[i];
        this.f61974b = i + 1;
        return (b + 256) % 256;
    }

    @Override // p000.AbstractC22342tR1
    public long readLong() {
        return (m31466v() << 32) + (m31466v() & BodyPartID.bodyIdMax);
    }

    @Override // p000.AbstractC22342tR1
    public void seek(long j) {
        if (j >= 0 && j <= 2147483647L) {
            this.f61974b = (int) j;
            return;
        }
        throw new IOException("Illegal seek position: " + j);
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: t */
    public int mo22679t() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new EOFException();
    }

    /* renamed from: v */
    public int m31466v() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    @Override // p000.AbstractC22342tR1
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f61974b;
        byte[] bArr2 = this.f61973a;
        if (i3 < bArr2.length) {
            int min = Math.min(i2, bArr2.length - i3);
            System.arraycopy(this.f61973a, this.f61974b, bArr, i, min);
            this.f61974b += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}