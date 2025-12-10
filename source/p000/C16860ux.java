package p000;

import com.google.common.p014io.ByteStreams;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: ux */
/* loaded from: classes4.dex */
public final class C16860ux extends FilterInputStream {

    /* renamed from: a */
    public boolean f107519a;

    public C16860ux(InputStream inputStream) {
        super(inputStream);
        this.f107519a = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f107519a && ((FilterInputStream) this).in != null) {
            try {
                ByteStreams.exhaust(this);
                ((FilterInputStream) this).in.close();
            } finally {
                this.f107519a = true;
            }
        }
    }
}
