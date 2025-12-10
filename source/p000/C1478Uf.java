package p000;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: Uf */
/* loaded from: classes.dex */
public class C1478Uf extends FilterOutputStream {

    /* renamed from: a */
    public final OutputStream f6391a;

    /* renamed from: b */
    public ByteOrder f6392b;

    public C1478Uf(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f6391a = outputStream;
        this.f6392b = byteOrder;
    }

    /* renamed from: b */
    public void m65995b(ByteOrder byteOrder) {
        this.f6392b = byteOrder;
    }

    /* renamed from: d */
    public void m65994d(int i) {
        ByteOrder byteOrder = this.f6392b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6391a.write(i & 255);
            this.f6391a.write((i >>> 8) & 255);
            this.f6391a.write((i >>> 16) & 255);
            this.f6391a.write((i >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6391a.write((i >>> 24) & 255);
            this.f6391a.write((i >>> 16) & 255);
            this.f6391a.write((i >>> 8) & 255);
            this.f6391a.write(i & 255);
        }
    }

    /* renamed from: g */
    public void m65993g(short s) {
        ByteOrder byteOrder = this.f6392b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f6391a.write(s & 255);
            this.f6391a.write((s >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f6391a.write((s >>> 8) & 255);
            this.f6391a.write(s & 255);
        }
    }

    /* renamed from: i */
    public void m65992i(long j) {
        m65994d((int) j);
    }

    /* renamed from: j */
    public void m65991j(int i) {
        m65993g((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f6391a.write(bArr);
    }

    public void writeByte(int i) {
        this.f6391a.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f6391a.write(bArr, i, i2);
    }
}
