package p000;

import com.tom_roush.fontbox.ttf.BufferedRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: qr1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21829qr1 extends AbstractC22790wQ1 {

    /* renamed from: a */
    public RandomAccessFile f77090a;

    /* renamed from: b */
    public File f77091b;

    public C21829qr1(File file, String str) {
        this.f77090a = null;
        this.f77091b = null;
        this.f77090a = new BufferedRandomAccessFile(file, str, 16384);
        this.f77091b = file;
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: b */
    public long mo858b() {
        return this.f77090a.getFilePointer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.f77090a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f77090a = null;
        }
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: d */
    public InputStream mo857d() {
        return new FileInputStream(this.f77091b);
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: g */
    public long mo856g() {
        return this.f77091b.length();
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: m */
    public short mo851m() {
        return this.f77090a.readShort();
    }

    @Override // p000.AbstractC22790wQ1
    public int read() {
        return this.f77090a.read();
    }

    @Override // p000.AbstractC22790wQ1
    public long readLong() {
        return this.f77090a.readLong();
    }

    @Override // p000.AbstractC22790wQ1
    public void seek(long j) {
        this.f77090a.seek(j);
    }

    @Override // p000.AbstractC22790wQ1
    /* renamed from: t */
    public int mo844t() {
        return this.f77090a.readUnsignedShort();
    }

    @Override // p000.AbstractC22790wQ1
    public int read(byte[] bArr, int i, int i2) {
        return this.f77090a.read(bArr, i, i2);
    }
}
