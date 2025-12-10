package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: zS */
/* loaded from: classes5.dex */
public class C17215zS extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f109379a;

    /* renamed from: b */
    public boolean f109380b;

    /* renamed from: c */
    public int f109381c;

    /* renamed from: d */
    public boolean f109382d;

    public C17215zS(OutputStream outputStream) {
        super(outputStream);
        this.f109379a = false;
        this.f109380b = false;
        this.f109381c = 0;
        this.f109382d = true;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        try {
            if (this.f109379a && !this.f109380b) {
                super.write(13);
                this.f109381c++;
            }
            this.f109379a = false;
            this.f109380b = false;
            super.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (this.f109381c == 0 && i2 > 10) {
                this.f109382d = false;
                for (int i3 = 0; i3 < 10; i3++) {
                    byte b = bArr[i3];
                    if (b >= 9 && (b <= 10 || b >= 32 || b == 13)) {
                    }
                    this.f109382d = true;
                    break;
                }
            }
            if (this.f109382d) {
                if (this.f109379a) {
                    this.f109379a = false;
                    if (!this.f109380b && i2 == 1 && bArr[i] == 10) {
                        return;
                    }
                    super.write(13);
                }
                if (this.f109380b) {
                    super.write(10);
                    this.f109380b = false;
                }
                if (i2 > 0) {
                    byte b2 = bArr[(i + i2) - 1];
                    if (b2 == 13) {
                        this.f109379a = true;
                        i2--;
                    } else if (b2 == 10) {
                        this.f109380b = true;
                        int i4 = i2 - 1;
                        if (i4 > 0 && bArr[(i + i4) - 1] == 13) {
                            this.f109379a = true;
                            i2 -= 2;
                        } else {
                            i2 = i4;
                        }
                    }
                }
            }
            super.write(bArr, i, i2);
            this.f109381c += i2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}