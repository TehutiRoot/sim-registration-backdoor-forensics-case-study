package p000;

import java.io.Closeable;

/* renamed from: KF1 */
/* loaded from: classes5.dex */
public interface KF1 extends Closeable {
    /* renamed from: a */
    void mo66316a(int i);

    /* renamed from: c */
    void mo66315c(byte[] bArr);

    /* renamed from: f */
    void mo66314f(byte[] bArr, int i, int i2);

    long getPosition();

    boolean isEOF();

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    byte[] readFully(int i);
}
