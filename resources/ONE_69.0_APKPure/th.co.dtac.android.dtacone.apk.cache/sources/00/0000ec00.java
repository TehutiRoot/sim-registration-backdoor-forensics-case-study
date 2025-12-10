package p000;

import com.tom_roush.fontbox.ttf.BufferedRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: ns1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C21376ns1 extends AbstractC22342tR1 {

    /* renamed from: a */
    public RandomAccessFile f72605a;

    /* renamed from: b */
    public File f72606b;

    public C21376ns1(File file, String str) {
        this.f72605a = null;
        this.f72606b = null;
        this.f72605a = new BufferedRandomAccessFile(file, str, 16384);
        this.f72606b = file;
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: b */
    public long mo22693b() {
        return this.f72605a.getFilePointer();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.f72605a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.f72605a = null;
        }
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: d */
    public InputStream mo22692d() {
        return new FileInputStream(this.f72606b);
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: g */
    public long mo22691g() {
        return this.f72606b.length();
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: m */
    public short mo22686m() {
        return this.f72605a.readShort();
    }

    @Override // p000.AbstractC22342tR1
    public int read() {
        return this.f72605a.read();
    }

    @Override // p000.AbstractC22342tR1
    public long readLong() {
        return this.f72605a.readLong();
    }

    @Override // p000.AbstractC22342tR1
    public void seek(long j) {
        this.f72605a.seek(j);
    }

    @Override // p000.AbstractC22342tR1
    /* renamed from: t */
    public int mo22679t() {
        return this.f72605a.readUnsignedShort();
    }

    @Override // p000.AbstractC22342tR1
    public int read(byte[] bArr, int i, int i2) {
        return this.f72605a.read(bArr, i, i2);
    }
}