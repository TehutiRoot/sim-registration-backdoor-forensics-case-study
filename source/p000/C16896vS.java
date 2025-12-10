package p000;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: vS */
/* loaded from: classes5.dex */
public class C16896vS extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f107683a;

    /* renamed from: b */
    public boolean f107684b;

    /* renamed from: c */
    public int f107685c;

    /* renamed from: d */
    public boolean f107686d;

    public C16896vS(OutputStream outputStream) {
        super(outputStream);
        this.f107683a = false;
        this.f107684b = false;
        this.f107685c = 0;
        this.f107686d = true;
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() {
        try {
            if (this.f107683a && !this.f107684b) {
                super.write(13);
                this.f107685c++;
            }
            this.f107683a = false;
            this.f107684b = false;
            super.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (this.f107685c == 0 && i2 > 10) {
                this.f107686d = false;
                for (int i3 = 0; i3 < 10; i3++) {
                    byte b = bArr[i3];
                    if (b >= 9 && (b <= 10 || b >= 32 || b == 13)) {
                    }
                    this.f107686d = true;
                    break;
                }
            }
            if (this.f107686d) {
                if (this.f107683a) {
                    this.f107683a = false;
                    if (!this.f107684b && i2 == 1 && bArr[i] == 10) {
                        return;
                    }
                    super.write(13);
                }
                if (this.f107684b) {
                    super.write(10);
                    this.f107684b = false;
                }
                if (i2 > 0) {
                    byte b2 = bArr[(i + i2) - 1];
                    if (b2 == 13) {
                        this.f107683a = true;
                        i2--;
                    } else if (b2 == 10) {
                        this.f107684b = true;
                        int i4 = i2 - 1;
                        if (i4 > 0 && bArr[(i + i4) - 1] == 13) {
                            this.f107683a = true;
                            i2 -= 2;
                        } else {
                            i2 = i4;
                        }
                    }
                }
            }
            super.write(bArr, i, i2);
            this.f107685c += i2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
