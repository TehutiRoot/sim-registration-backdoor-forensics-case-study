package org.apache.http.impl;

import java.io.IOException;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.HttpResponse;
import org.apache.http.HttpServerConnection;
import org.apache.http.impl.entity.DisallowIdentityContentLengthStrategy;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p029io.DefaultHttpRequestParser;
import org.apache.http.impl.p029io.HttpResponseWriter;
import org.apache.http.message.LineParser;
import org.apache.http.p030io.EofSensor;
import org.apache.http.p030io.HttpMessageParser;
import org.apache.http.p030io.HttpMessageWriter;
import org.apache.http.p030io.HttpTransportMetrics;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.p030io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public abstract class AbstractHttpServerConnection implements HttpServerConnection {

    /* renamed from: c */
    public SessionInputBuffer f73973c = null;

    /* renamed from: d */
    public SessionOutputBuffer f73974d = null;

    /* renamed from: e */
    public EofSensor f73975e = null;

    /* renamed from: f */
    public HttpMessageParser f73976f = null;

    /* renamed from: g */
    public HttpMessageWriter f73977g = null;

    /* renamed from: h */
    public HttpConnectionMetricsImpl f73978h = null;

    /* renamed from: a */
    public final EntitySerializer f73971a = createEntitySerializer();

    /* renamed from: b */
    public final EntityDeserializer f73972b = createEntityDeserializer();

    public abstract void assertOpen() throws IllegalStateException;

    public HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics httpTransportMetrics, HttpTransportMetrics httpTransportMetrics2) {
        return new HttpConnectionMetricsImpl(httpTransportMetrics, httpTransportMetrics2);
    }

    public EntityDeserializer createEntityDeserializer() {
        return new EntityDeserializer(new DisallowIdentityContentLengthStrategy(new LaxContentLengthStrategy(0)));
    }

    public EntitySerializer createEntitySerializer() {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    public HttpRequestFactory createHttpRequestFactory() {
        return DefaultHttpRequestFactory.INSTANCE;
    }

    public HttpMessageParser<HttpRequest> createRequestParser(SessionInputBuffer sessionInputBuffer, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        return new DefaultHttpRequestParser(sessionInputBuffer, (LineParser) null, httpRequestFactory, httpParams);
    }

    public HttpMessageWriter<HttpResponse> createResponseWriter(SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        return new HttpResponseWriter(sessionOutputBuffer, null, httpParams);
    }

    public void doFlush() throws IOException {
        this.f73974d.flush();
    }

    @Override // org.apache.http.HttpServerConnection
    public void flush() throws IOException {
        assertOpen();
        doFlush();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.f73978h;
    }

    public void init(SessionInputBuffer sessionInputBuffer, SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        this.f73973c = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Input session buffer");
        this.f73974d = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Output session buffer");
        if (sessionInputBuffer instanceof EofSensor) {
            this.f73975e = (EofSensor) sessionInputBuffer;
        }
        this.f73976f = createRequestParser(sessionInputBuffer, createHttpRequestFactory(), httpParams);
        this.f73977g = createResponseWriter(sessionOutputBuffer, httpParams);
        this.f73978h = createConnectionMetrics(sessionInputBuffer.getMetrics(), sessionOutputBuffer.getMetrics());
    }

    public boolean isEof() {
        EofSensor eofSensor = this.f73975e;
        if (eofSensor != null && eofSensor.isEof()) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        if (!isOpen() || isEof()) {
            return true;
        }
        try {
            this.f73973c.isDataAvailable(1);
            return isEof();
        } catch (IOException unused) {
            return true;
        }
    }

    @Override // org.apache.http.HttpServerConnection
    public void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        assertOpen();
        httpEntityEnclosingRequest.setEntity(this.f73972b.deserialize(this.f73973c, httpEntityEnclosingRequest));
    }

    @Override // org.apache.http.HttpServerConnection
    public HttpRequest receiveRequestHeader() throws HttpException, IOException {
        assertOpen();
        HttpRequest httpRequest = (HttpRequest) this.f73976f.parse();
        this.f73978h.incrementRequestCount();
        return httpRequest;
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        if (httpResponse.getEntity() == null) {
            return;
        }
        this.f73971a.serialize(this.f73974d, httpResponse, httpResponse.getEntity());
    }

    @Override // org.apache.http.HttpServerConnection
    public void sendResponseHeader(HttpResponse httpResponse) throws HttpException, IOException {
        Args.notNull(httpResponse, "HTTP response");
        assertOpen();
        this.f73977g.write(httpResponse);
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            this.f73978h.incrementResponseCount();
        }
    }
}