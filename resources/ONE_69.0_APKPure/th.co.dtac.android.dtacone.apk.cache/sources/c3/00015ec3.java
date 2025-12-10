package p000;

import com.google.common.p014io.ByteStreams;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: ux */
/* loaded from: classes4.dex */
public final class C16873ux extends FilterInputStream {

    /* renamed from: a */
    public boolean f107945a;

    public C16873ux(InputStream inputStream) {
        super(inputStream);
        this.f107945a = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f107945a && ((FilterInputStream) this).in != null) {
            try {
                ByteStreams.exhaust(this);
                ((FilterInputStream) this).in.close();
            } finally {
                this.f107945a = true;
            }
        }
    }
}