package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: W80 */
/* loaded from: classes6.dex */
public class W80 extends OutputStream {

    /* renamed from: a */
    public final MessageDigest f7136a;

    /* renamed from: b */
    public boolean f7137b;

    /* renamed from: c */
    public byte[] f7138c;

    public W80(MessageDigest messageDigest) {
        this.f7136a = messageDigest;
        messageDigest.reset();
    }

    /* renamed from: b */
    public byte[] m65657b() {
        return this.f7138c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f7137b) {
            return;
        }
        this.f7137b = true;
        this.f7138c = this.f7136a.digest();
        super.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.f7137b) {
            this.f7136a.update((byte) i);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f7137b) {
            this.f7136a.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }
}
