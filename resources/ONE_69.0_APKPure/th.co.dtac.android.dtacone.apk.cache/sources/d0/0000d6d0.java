package p000;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: j6 */
/* loaded from: classes4.dex */
public class C11497j6 extends Writer {

    /* renamed from: a */
    public final Appendable f67214a;

    /* renamed from: b */
    public boolean f67215b;

    public C11497j6(Appendable appendable) {
        this.f67214a = (Appendable) Preconditions.checkNotNull(appendable);
    }

    /* renamed from: b */
    public final void m29622b() {
        if (!this.f67215b) {
            return;
        }
        throw new IOException("Cannot write to a closed writer.");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f67215b = true;
        Appendable appendable = this.f67214a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m29622b();
        Appendable appendable = this.f67214a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        m29622b();
        this.f67214a.append(new String(cArr, i, i2));
    }

    @Override // java.io.Writer
    public void write(int i) {
        m29622b();
        this.f67214a.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        m29622b();
        this.f67214a.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        Preconditions.checkNotNull(str);
        m29622b();
        this.f67214a.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        m29622b();
        this.f67214a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        m29622b();
        this.f67214a.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        Preconditions.checkNotNull(str);
        m29622b();
        this.f67214a.append(str, i, i2 + i);
    }
}