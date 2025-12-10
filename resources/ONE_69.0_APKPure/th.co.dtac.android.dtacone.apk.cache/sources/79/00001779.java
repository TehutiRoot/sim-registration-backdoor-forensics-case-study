package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: Ye0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C18856Ye0 implements HG1 {

    /* renamed from: a */
    public final PushbackInputStream f7907a;

    /* renamed from: b */
    public int f7908b = 0;

    public C18856Ye0(InputStream inputStream) {
        this.f7907a = new PushbackInputStream(inputStream, 32767);
    }

    @Override // p000.HG1
    /* renamed from: a */
    public void mo65439a(int i) {
        this.f7907a.unread(i);
        this.f7908b--;
    }

    @Override // p000.HG1
    /* renamed from: c */
    public void mo65438c(byte[] bArr) {
        this.f7907a.unread(bArr);
        this.f7908b -= bArr.length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7907a.close();
    }

    @Override // p000.HG1
    /* renamed from: f */
    public void mo65437f(byte[] bArr, int i, int i2) {
        this.f7907a.unread(bArr, i, i2);
        this.f7908b -= i2;
    }

    @Override // p000.HG1
    public long getPosition() {
        return this.f7908b;
    }

    @Override // p000.HG1
    public boolean isEOF() {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // p000.HG1
    public int peek() {
        int read = this.f7907a.read();
        if (read != -1) {
            this.f7907a.unread(read);
        }
        return read;
    }

    @Override // p000.HG1
    public int read() {
        int read = this.f7907a.read();
        this.f7908b++;
        return read;
    }

    @Override // p000.HG1
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

    @Override // p000.HG1
    public int read(byte[] bArr) {
        int read = this.f7907a.read(bArr);
        if (read > 0) {
            this.f7908b += read;
            return read;
        }
        return -1;
    }

    @Override // p000.HG1
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f7907a.read(bArr, i, i2);
        if (read > 0) {
            this.f7908b += read;
            return read;
        }
        return -1;
    }
}