package p000;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;

/* renamed from: fx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19955fx1 implements HttpEntity {

    /* renamed from: a */
    public final HttpEntity f61997a;

    /* renamed from: b */
    public boolean f61998b = false;

    public C19955fx1(HttpEntity httpEntity) {
        this.f61997a = httpEntity;
    }

    /* renamed from: a */
    public static void m31250a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null && !entity.isRepeatable() && !m31248c(entity)) {
            httpEntityEnclosingRequest.setEntity(new C19955fx1(entity));
        }
    }

    /* renamed from: c */
    public static boolean m31248c(HttpEntity httpEntity) {
        return httpEntity instanceof C19955fx1;
    }

    /* renamed from: d */
    public static boolean m31247d(HttpRequest httpRequest) {
        HttpEntity entity;
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) == null) {
            return true;
        }
        if (m31248c(entity) && !((C19955fx1) entity).m31249b()) {
            return true;
        }
        return entity.isRepeatable();
    }

    /* renamed from: b */
    public boolean m31249b() {
        return this.f61998b;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
        this.f61998b = true;
        this.f61997a.consumeContent();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return this.f61997a.getContent();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.f61997a.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f61997a.getContentLength();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.f61997a.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.f61997a.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.f61997a.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.f61997a.isStreaming();
    }

    public String toString() {
        return "RequestEntityProxy{" + this.f61997a + '}';
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        this.f61998b = true;
        this.f61997a.writeTo(outputStream);
    }
}
