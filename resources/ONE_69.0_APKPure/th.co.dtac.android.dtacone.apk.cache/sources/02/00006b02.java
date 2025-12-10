package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes2.dex */
public class LogWriter extends Writer {

    /* renamed from: a */
    public final String f34178a;

    /* renamed from: b */
    public StringBuilder f34179b = new StringBuilder(128);

    public LogWriter(String str) {
        this.f34178a = str;
    }

    /* renamed from: b */
    public final void m57011b() {
        if (this.f34179b.length() > 0) {
            this.f34179b.toString();
            StringBuilder sb = this.f34179b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m57011b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m57011b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m57011b();
            } else {
                this.f34179b.append(c);
            }
        }
    }
}