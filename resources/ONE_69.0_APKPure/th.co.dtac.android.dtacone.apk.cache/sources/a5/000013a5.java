package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: Uf */
/* loaded from: classes.dex */
public class C1458Uf extends FilterOutputStream {

    /* renamed from: a */
    public final OutputStream f6680a;

    /* renamed from: b */
    public ByteOrder f6681b;

    public C1458Uf(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f6680a = outputStream;
        this.f6681b = byteOrder;
    }

    /* renamed from: b */
    public void m66125b(ByteOrder byteOrder) {
        this.f6681b = byteOrder;
    }

    /* renamed from: d */
    public void m66124d(int i) {
        ByteOrder byteOrder = this.f6681b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6680a.write(i & 255);
            this.f6680a.write((i >>> 8) & 255);
            this.f6680a.write((i >>> 16) & 255);
            this.f6680a.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6680a.write((i >>> 24) & 255);
            this.f6680a.write((i >>> 16) & 255);
            this.f6680a.write((i >>> 8) & 255);
            this.f6680a.write(i & 255);
        }
    }

    /* renamed from: g */
    public void m66123g(short s) {
        ByteOrder byteOrder = this.f6681b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6680a.write(s & 255);
            this.f6680a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6680a.write((s >>> 8) & 255);
            this.f6680a.write(s & 255);
        }
    }

    /* renamed from: i */
    public void m66122i(long j) {
        m66124d((int) j);
    }

    /* renamed from: j */
    public void m66121j(int i) {
        m66123g((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f6680a.write(bArr);
    }

    public void writeByte(int i) {
        this.f6680a.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f6680a.write(bArr, i, i2);
    }
}