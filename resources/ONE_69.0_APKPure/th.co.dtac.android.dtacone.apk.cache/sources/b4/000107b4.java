package p000;

import com.google.common.base.Preconditions;
import com.google.common.p014io.CharSource;
import java.io.Reader;
import java.util.Iterator;

/* renamed from: rG0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21966rG0 extends Reader {

    /* renamed from: a */
    public final Iterator f77469a;

    /* renamed from: b */
    public Reader f77470b;

    public C21966rG0(Iterator it) {
        this.f77469a = it;
        m23531b();
    }

    /* renamed from: b */
    public final void m23531b() {
        close();
        if (this.f77469a.hasNext()) {
            this.f77470b = ((CharSource) this.f77469a.next()).openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Reader reader = this.f77470b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f77470b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.f77470b;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read == -1) {
            m23531b();
            return read(cArr, i, i2);
        }
        return read;
    }

    @Override // java.io.Reader
    public boolean ready() {
        Reader reader = this.f77470b;
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
                Reader reader = this.f77470b;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                m23531b();
            }
        }
        return 0L;
    }
}