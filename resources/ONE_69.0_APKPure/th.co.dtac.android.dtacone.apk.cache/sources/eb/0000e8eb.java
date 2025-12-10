package p000;

import com.facebook.stetho.dumpapp.Framer;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: l */
/* loaded from: classes5.dex */
public final class C12164l extends FilterOutputStream {

    /* renamed from: a */
    public int f71560a;

    /* renamed from: b */
    public int f71561b;

    /* renamed from: c */
    public byte[] f71562c;

    /* renamed from: d */
    public byte[] f71563d;

    /* renamed from: e */
    public int f71564e;

    /* renamed from: f */
    public boolean f71565f;

    /* renamed from: g */
    public char f71566g;

    public C12164l(OutputStream outputStream) {
        super(outputStream);
        this.f71560a = 72;
        this.f71564e = 72;
        this.f71561b = 0;
        this.f71562c = new byte[4];
        this.f71563d = new byte[5];
        this.f71565f = true;
        this.f71566g = '~';
    }

    /* renamed from: b */
    public final void m26877b() {
        byte[] bArr = this.f71562c;
        long j = ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8)) & BodyPartID.bodyIdMax;
        if (j == 0) {
            byte[] bArr2 = this.f71563d;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        long j2 = j / 52200625;
        byte[] bArr3 = this.f71563d;
        bArr3[0] = (byte) (j2 + 33);
        long j3 = j - (j2 * 52200625);
        long j4 = j3 / 614125;
        bArr3[1] = (byte) (j4 + 33);
        long j5 = j3 - (j4 * 614125);
        long j6 = j5 / 7225;
        bArr3[2] = (byte) (j6 + 33);
        long j7 = j5 - (j6 * 7225);
        bArr3[3] = (byte) ((j7 / 85) + 33);
        bArr3[4] = (byte) ((j7 % 85) + 33);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            super.close();
        } finally {
            this.f71563d = null;
            this.f71562c = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.f71565f) {
            return;
        }
        int i = this.f71561b;
        if (i > 0) {
            while (i < 4) {
                this.f71562c[i] = 0;
                i++;
            }
            m26877b();
            if (this.f71563d[0] == 122) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f71563d[i2] = Framer.ENTER_FRAME_PREFIX;
                }
            }
            for (int i3 = 0; i3 < this.f71561b + 1; i3++) {
                ((FilterOutputStream) this).out.write(this.f71563d[i3]);
                int i4 = this.f71560a - 1;
                this.f71560a = i4;
                if (i4 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f71560a = this.f71564e;
                }
            }
        }
        int i5 = this.f71560a - 1;
        this.f71560a = i5;
        if (i5 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.f71566g);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.f71561b = 0;
        this.f71560a = this.f71564e;
        this.f71565f = true;
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        byte b;
        this.f71565f = false;
        byte[] bArr = this.f71562c;
        int i2 = this.f71561b;
        int i3 = i2 + 1;
        this.f71561b = i3;
        bArr[i2] = (byte) i;
        if (i3 < 4) {
            return;
        }
        m26877b();
        for (int i4 = 0; i4 < 5 && (b = this.f71563d[i4]) != 0; i4++) {
            ((FilterOutputStream) this).out.write(b);
            int i5 = this.f71560a - 1;
            this.f71560a = i5;
            if (i5 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.f71560a = this.f71564e;
            }
        }
        this.f71561b = 0;
    }
}