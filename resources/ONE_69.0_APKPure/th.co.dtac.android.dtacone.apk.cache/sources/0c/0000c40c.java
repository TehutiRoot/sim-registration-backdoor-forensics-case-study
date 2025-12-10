package p000;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;

/* renamed from: cy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19491cy1 implements HttpEntity {

    /* renamed from: a */
    public final HttpEntity f61053a;

    /* renamed from: b */
    public boolean f61054b = false;

    public C19491cy1(HttpEntity httpEntity) {
        this.f61053a = httpEntity;
    }

    /* renamed from: a */
    public static void m31949a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        HttpEntity entity = httpEntityEnclosingRequest.getEntity();
        if (entity != null && !entity.isRepeatable() && !m31947c(entity)) {
            httpEntityEnclosingRequest.setEntity(new C19491cy1(entity));
        }
    }

    /* renamed from: c */
    public static boolean m31947c(HttpEntity httpEntity) {
        return httpEntity instanceof C19491cy1;
    }

    /* renamed from: d */
    public static boolean m31946d(HttpRequest httpRequest) {
        HttpEntity entity;
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) == null) {
            return true;
        }
        if (m31947c(entity) && !((C19491cy1) entity).m31948b()) {
            return true;
        }
        return entity.isRepeatable();
    }

    /* renamed from: b */
    public boolean m31948b() {
        return this.f61054b;
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() {
        this.f61054b = true;
        this.f61053a.consumeContent();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        return this.f61053a.getContent();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.f61053a.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.f61053a.getContentLength();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.f61053a.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.f61053a.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.f61053a.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.f61053a.isStreaming();
    }

    public String toString() {
        return "RequestEntityProxy{" + this.f61053a + '}';
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        this.f61054b = true;
        this.f61053a.writeTo(outputStream);
    }
}