package p000;

import com.facebook.stetho.dumpapp.Framer;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: l */
/* loaded from: classes5.dex */
public final class C12187l extends FilterOutputStream {

    /* renamed from: a */
    public int f71505a;

    /* renamed from: b */
    public int f71506b;

    /* renamed from: c */
    public byte[] f71507c;

    /* renamed from: d */
    public byte[] f71508d;

    /* renamed from: e */
    public int f71509e;

    /* renamed from: f */
    public boolean f71510f;

    /* renamed from: g */
    public char f71511g;

    public C12187l(OutputStream outputStream) {
        super(outputStream);
        this.f71505a = 72;
        this.f71509e = 72;
        this.f71506b = 0;
        this.f71507c = new byte[4];
        this.f71508d = new byte[5];
        this.f71510f = true;
        this.f71511g = '~';
    }

    /* renamed from: b */
    public final void m26573b() {
        byte[] bArr = this.f71507c;
        long j = ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8)) & BodyPartID.bodyIdMax;
        if (j == 0) {
            byte[] bArr2 = this.f71508d;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        long j2 = j / 52200625;
        byte[] bArr3 = this.f71508d;
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
            this.f71508d = null;
            this.f71507c = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        if (this.f71510f) {
            return;
        }
        int i = this.f71506b;
        if (i > 0) {
            while (i < 4) {
                this.f71507c[i] = 0;
                i++;
            }
            m26573b();
            if (this.f71508d[0] == 122) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f71508d[i2] = Framer.ENTER_FRAME_PREFIX;
                }
            }
            for (int i3 = 0; i3 < this.f71506b + 1; i3++) {
                ((FilterOutputStream) this).out.write(this.f71508d[i3]);
                int i4 = this.f71505a - 1;
                this.f71505a = i4;
                if (i4 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f71505a = this.f71509e;
                }
            }
        }
        int i5 = this.f71505a - 1;
        this.f71505a = i5;
        if (i5 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.f71511g);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.f71506b = 0;
        this.f71505a = this.f71509e;
        this.f71510f = true;
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        byte b;
        this.f71510f = false;
        byte[] bArr = this.f71507c;
        int i2 = this.f71506b;
        int i3 = i2 + 1;
        this.f71506b = i3;
        bArr[i2] = (byte) i;
        if (i3 < 4) {
            return;
        }
        m26573b();
        for (int i4 = 0; i4 < 5 && (b = this.f71508d[i4]) != 0; i4++) {
            ((FilterOutputStream) this).out.write(b);
            int i5 = this.f71505a - 1;
            this.f71505a = i5;
            if (i5 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.f71505a = this.f71509e;
            }
        }
        this.f71506b = 0;
    }
}
