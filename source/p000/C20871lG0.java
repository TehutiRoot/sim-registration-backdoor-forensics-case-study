package p000;

import com.google.common.base.Preconditions;
import com.google.common.p014io.CharSource;
import java.io.Reader;
import java.util.Iterator;

/* renamed from: lG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20871lG0 extends Reader {

    /* renamed from: a */
    public final Iterator f71575a;

    /* renamed from: b */
    public Reader f71576b;

    public C20871lG0(Iterator it) {
        this.f71575a = it;
        m26535b();
    }

    /* renamed from: b */
    public final void m26535b() {
        close();
        if (this.f71575a.hasNext()) {
            this.f71576b = ((CharSource) this.f71575a.next()).openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Reader reader = this.f71576b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f71576b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.f71576b;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read == -1) {
            m26535b();
            return read(cArr, i, i2);
        }
        return read;
    }

    @Override // java.io.Reader
    public boolean ready() {
        Reader reader = this.f71576b;
        if (reader != null && reader.ready()) {
            return true;
        }
        return false;
    }

    @Override // java.io.Reader
    public long skip(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "n is negative");
        if (i > 0) {
            while (true) {
                Reader reader = this.f71576b;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                m26535b();
            }
        }
        return 0L;
    }
}
