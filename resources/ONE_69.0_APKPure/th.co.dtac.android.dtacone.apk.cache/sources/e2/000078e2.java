package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: c90  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19350c90 extends OutputStream {

    /* renamed from: a */
    public final MessageDigest f39349a;

    /* renamed from: b */
    public boolean f39350b;

    /* renamed from: c */
    public byte[] f39351c;

    public C19350c90(MessageDigest messageDigest) {
        this.f39349a = messageDigest;
        messageDigest.reset();
    }

    /* renamed from: b */
    public byte[] m51721b() {
        return this.f39351c;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f39350b) {
            return;
        }
        this.f39350b = true;
        this.f39351c = this.f39349a.digest();
        super.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        if (!this.f39350b) {
            this.f39349a.update((byte) i);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f39350b) {
            this.f39349a.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }
}