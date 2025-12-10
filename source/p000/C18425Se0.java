package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: Se0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18425Se0 implements KF1 {

    /* renamed from: a */
    public final PushbackInputStream f5665a;

    /* renamed from: b */
    public int f5666b = 0;

    public C18425Se0(InputStream inputStream) {
        this.f5665a = new PushbackInputStream(inputStream, 32767);
    }

    @Override // p000.KF1
    /* renamed from: a */
    public void mo66316a(int i) {
        this.f5665a.unread(i);
        this.f5666b--;
    }

    @Override // p000.KF1
    /* renamed from: c */
    public void mo66315c(byte[] bArr) {
        this.f5665a.unread(bArr);
        this.f5666b -= bArr.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5665a.close();
    }

    @Override // p000.KF1
    /* renamed from: f */
    public void mo66314f(byte[] bArr, int i, int i2) {
        this.f5665a.unread(bArr, i, i2);
        this.f5666b -= i2;
    }

    @Override // p000.KF1
    public long getPosition() {
        return this.f5666b;
    }

    @Override // p000.KF1
    public boolean isEOF() {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // p000.KF1
    public int peek() {
        int read = this.f5665a.read();
        if (read != -1) {
            this.f5665a.unread(read);
        }
        return read;
    }

    @Override // p000.KF1
    public int read() {
        int read = this.f5665a.read();
        this.f5666b++;
        return read;
    }

    @Override // p000.KF1
    public byte[] readFully(int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            int read = read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        } while (i2 < i);
        return bArr;
    }

    @Override // p000.KF1
    public int read(byte[] bArr) {
        int read = this.f5665a.read(bArr);
        if (read > 0) {
            this.f5666b += read;
            return read;
        }
        return -1;
    }

    @Override // p000.KF1
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f5665a.read(bArr, i, i2);
        if (read > 0) {
            this.f5666b += read;
            return read;
        }
        return -1;
    }
}
