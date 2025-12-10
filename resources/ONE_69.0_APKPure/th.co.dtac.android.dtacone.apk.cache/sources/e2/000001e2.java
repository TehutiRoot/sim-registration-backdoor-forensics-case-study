package p000;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: Bx */
/* loaded from: classes4.dex */
public final class C0145Bx extends AbstractHttpEntity {

    /* renamed from: a */
    public final long f593a;

    /* renamed from: b */
    public final StreamingContent f594b;

    public C0145Bx(long j, StreamingContent streamingContent) {
        this.f593a = j;
        this.f594b = (StreamingContent) Preconditions.checkNotNull(streamingContent);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f593a;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        if (this.f593a != 0) {
            this.f594b.writeTo(outputStream);
        }
    }
}