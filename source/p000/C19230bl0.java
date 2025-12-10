package p000;

import java.io.Writer;

/* renamed from: bl0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C19230bl0 extends Writer {

    /* renamed from: a */
    public final String f39200a;

    /* renamed from: b */
    public StringBuilder f39201b = new StringBuilder(128);

    public C19230bl0(String str) {
        this.f39200a = str;
    }

    /* renamed from: b */
    public final void m51816b() {
        if (this.f39201b.length() > 0) {
            this.f39201b.toString();
            StringBuilder sb = this.f39201b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m51816b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m51816b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m51816b();
            } else {
                this.f39201b.append(c);
            }
        }
    }
}
