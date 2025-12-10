package org.apache.http.impl;

import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpConnectionMetrics;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.impl.entity.EntityDeserializer;
import org.apache.http.impl.entity.EntitySerializer;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.p029io.DefaultHttpResponseParser;
import org.apache.http.impl.p029io.HttpRequestWriter;
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
public abstract class AbstractHttpClientConnection implements HttpClientConnection {

    /* renamed from: c */
    public SessionInputBuffer f73965c = null;

    /* renamed from: d */
    public SessionOutputBuffer f73966d = null;

    /* renamed from: e */
    public EofSensor f73967e = null;

    /* renamed from: f */
    public HttpMessageParser f73968f = null;

    /* renamed from: g */
    public HttpMessageWriter f73969g = null;

    /* renamed from: h */
    public HttpConnectionMetricsImpl f73970h = null;

    /* renamed from: a */
    public final EntitySerializer f73963a = createEntitySerializer();

    /* renamed from: b */
    public final EntityDeserializer f73964b = createEntityDeserializer();

    public abstract void assertOpen() throws IllegalStateException;

    public HttpConnectionMetricsImpl createConnectionMetrics(HttpTransportMetrics httpTransportMetrics, HttpTransportMetrics httpTransportMetrics2) {
        return new HttpConnectionMetricsImpl(httpTransportMetrics, httpTransportMetrics2);
    }

    public EntityDeserializer createEntityDeserializer() {
        return new EntityDeserializer(new LaxContentLengthStrategy());
    }

    public EntitySerializer createEntitySerializer() {
        return new EntitySerializer(new StrictContentLengthStrategy());
    }

    public HttpResponseFactory createHttpResponseFactory() {
        return DefaultHttpResponseFactory.INSTANCE;
    }

    public HttpMessageWriter<HttpRequest> createRequestWriter(SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        return new HttpRequestWriter(sessionOutputBuffer, null, httpParams);
    }

    public HttpMessageParser<HttpResponse> createResponseParser(SessionInputBuffer sessionInputBuffer, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        return new DefaultHttpResponseParser(sessionInputBuffer, (LineParser) null, httpResponseFactory, httpParams);
    }

    public void doFlush() throws IOException {
        this.f73966d.flush();
    }

    @Override // org.apache.http.HttpClientConnection
    public void flush() throws IOException {
        assertOpen();
        doFlush();
    }

    @Override // org.apache.http.HttpConnection
    public HttpConnectionMetrics getMetrics() {
        return this.f73970h;
    }

    public void init(SessionInputBuffer sessionInputBuffer, SessionOutputBuffer sessionOutputBuffer, HttpParams httpParams) {
        this.f73965c = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Input session buffer");
        this.f73966d = (SessionOutputBuffer) Args.notNull(sessionOutputBuffer, "Output session buffer");
        if (sessionInputBuffer instanceof EofSensor) {
            this.f73967e = (EofSensor) sessionInputBuffer;
        }
        this.f73968f = createResponseParser(sessionInputBuffer, createHttpResponseFactory(), httpParams);
        this.f73969g = createRequestWriter(sessionOutputBuffer, httpParams);
        this.f73970h = createConnectionMetrics(sessionInputBuffer.getMetrics(), sessionOutputBuffer.getMetrics());
    }

    public boolean isEof() {
        EofSensor eofSensor = this.f73967e;
        if (eofSensor != null && eofSensor.isEof()) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.HttpClientConnection
    public boolean isResponseAvailable(int i) throws IOException {
        assertOpen();
        try {
            return this.f73965c.isDataAvailable(i);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // org.apache.http.HttpConnection
    public boolean isStale() {
        if (!isOpen() || isEof()) {
            return true;
        }
        try {
            this.f73965c.isDataAvailable(1);
            return isEof();
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    @Override // org.apache.http.HttpClientConnection
    public void receiveResponseEntity(HttpResponse httpResponse) throws HttpException, IOException {
        Args.notNull(httpResponse, "HTTP response");
        assertOpen();
        httpResponse.setEntity(this.f73964b.deserialize(this.f73965c, httpResponse));
    }

    @Override // org.apache.http.HttpClientConnection
    public HttpResponse receiveResponseHeader() throws HttpException, IOException {
        assertOpen();
        HttpResponse httpResponse = (HttpResponse) this.f73968f.parse();
        if (httpResponse.getStatusLine().getStatusCode() >= 200) {
            this.f73970h.incrementResponseCount();
        }
        return httpResponse;
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws HttpException, IOException {
        Args.notNull(httpEntityEnclosingRequest, "HTTP request");
        assertOpen();
        if (httpEntityEnclosingRequest.getEntity() == null) {
            return;
        }
        this.f73963a.serialize(this.f73966d, httpEntityEnclosingRequest, httpEntityEnclosingRequest.getEntity());
    }

    @Override // org.apache.http.HttpClientConnection
    public void sendRequestHeader(HttpRequest httpRequest) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        assertOpen();
        this.f73969g.write(httpRequest);
        this.f73970h.incrementRequestCount();
    }
}