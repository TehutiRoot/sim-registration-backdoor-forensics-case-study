package p000;

import java.io.Closeable;

/* renamed from: HG1 */
/* loaded from: classes5.dex */
public interface HG1 extends Closeable {
    /* renamed from: a */
    void mo65439a(int i);

    /* renamed from: c */
    void mo65438c(byte[] bArr);

    /* renamed from: f */
    void mo65437f(byte[] bArr, int i, int i2);

    long getPosition();

    boolean isEOF();

    int peek();

    int read();

    int read(byte[] bArr);

    int read(byte[] bArr, int i, int i2);

    byte[] readFully(int i);
}