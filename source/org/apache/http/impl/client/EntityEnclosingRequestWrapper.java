package org.apache.http.impl.client;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolException;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HTTP;

@Deprecated
/* loaded from: classes6.dex */
public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {

    /* renamed from: f */
    public HttpEntity f74081f;

    /* renamed from: g */
    public boolean f74082g;

    /* renamed from: org.apache.http.impl.client.EntityEnclosingRequestWrapper$a */
    /* loaded from: classes6.dex */
    public class C12581a extends HttpEntityWrapper {
        public C12581a(HttpEntity httpEntity) {
            super(httpEntity);
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public void consumeContent() {
            EntityEnclosingRequestWrapper.this.f74082g = true;
            super.consumeContent();
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public InputStream getContent() {
            EntityEnclosingRequestWrapper.this.f74082g = true;
            return super.getContent();
        }

        @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
        public void writeTo(OutputStream outputStream) {
            EntityEnclosingRequestWrapper.this.f74082g = true;
            super.writeTo(outputStream);
        }
    }

    public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws ProtocolException {
        super(httpEntityEnclosingRequest);
        setEntity(httpEntityEnclosingRequest.getEntity());
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public boolean expectContinue() {
        Header firstHeader = getFirstHeader("Expect");
        if (firstHeader != null && HTTP.EXPECT_CONTINUE.equalsIgnoreCase(firstHeader.getValue())) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public HttpEntity getEntity() {
        return this.f74081f;
    }

    @Override // org.apache.http.impl.client.RequestWrapper
    public boolean isRepeatable() {
        HttpEntity httpEntity = this.f74081f;
        if (httpEntity != null && !httpEntity.isRepeatable() && this.f74082g) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.HttpEntityEnclosingRequest
    public void setEntity(HttpEntity httpEntity) {
        C12581a c12581a;
        if (httpEntity != null) {
            c12581a = new C12581a(httpEntity);
        } else {
            c12581a = null;
        }
        this.f74081f = c12581a;
        this.f74082g = false;
    }
}
