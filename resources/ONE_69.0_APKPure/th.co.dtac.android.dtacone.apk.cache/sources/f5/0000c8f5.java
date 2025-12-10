package p000;

import java.io.Writer;

/* renamed from: hl0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C20316hl0 extends Writer {

    /* renamed from: a */
    public final String f62630a;

    /* renamed from: b */
    public StringBuilder f62631b = new StringBuilder(128);

    public C20316hl0(String str) {
        this.f62630a = str;
    }

    /* renamed from: b */
    public final void m31099b() {
        if (this.f62631b.length() > 0) {
            this.f62631b.toString();
            StringBuilder sb = this.f62631b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m31099b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m31099b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m31099b();
            } else {
                this.f62631b.append(c);
            }
        }
    }
}