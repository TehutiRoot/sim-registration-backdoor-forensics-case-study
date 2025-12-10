package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes2.dex */
public class LogWriter extends Writer {

    /* renamed from: a */
    public final String f34090a;

    /* renamed from: b */
    public StringBuilder f34091b = new StringBuilder(128);

    public LogWriter(String str) {
        this.f34090a = str;
    }

    /* renamed from: b */
    public final void m57061b() {
        if (this.f34091b.length() > 0) {
            this.f34091b.toString();
            StringBuilder sb = this.f34091b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m57061b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m57061b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m57061b();
            } else {
                this.f34091b.append(c);
            }
        }
    }
}
