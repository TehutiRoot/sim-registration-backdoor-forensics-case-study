package p000;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* renamed from: Ax */
/* loaded from: classes4.dex */
public final class C0064Ax extends AbstractHttpEntity {

    /* renamed from: a */
    public final long f245a;

    /* renamed from: b */
    public final StreamingContent f246b;

    public C0064Ax(long j, StreamingContent streamingContent) {
        this.f245a = j;
        this.f246b = (StreamingContent) Preconditions.checkNotNull(streamingContent);
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f245a;
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
        if (this.f245a != 0) {
            this.f246b.writeTo(outputStream);
        }
    }
}
