package p000;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: Ax */
/* loaded from: classes4.dex */
public final class C0066Ax extends AbstractHttpEntity {

    /* renamed from: a */
    public final long f264a;

    /* renamed from: b */
    public final StreamingContent f265b;

    public C0066Ax(long j, StreamingContent streamingContent) {
        this.f264a = j;
        this.f265b = (StreamingContent) Preconditions.checkNotNull(streamingContent);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f264a;
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
        if (this.f264a != 0) {
            this.f265b.writeTo(outputStream);
        }
    }
}