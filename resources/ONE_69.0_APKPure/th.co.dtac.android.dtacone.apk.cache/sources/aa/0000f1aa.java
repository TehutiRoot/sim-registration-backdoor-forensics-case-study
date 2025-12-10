package org.apache.http.impl;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.HttpConnectionFactory;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.p030io.HttpMessageParserFactory;
import org.apache.http.p030io.HttpMessageWriterFactory;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class DefaultBHttpClientConnectionFactory implements HttpConnectionFactory<DefaultBHttpClientConnection> {
    public static final DefaultBHttpClientConnectionFactory INSTANCE = new DefaultBHttpClientConnectionFactory();

    /* renamed from: a */
    public final ConnectionConfig f73988a;

    /* renamed from: b */
    public final ContentLengthStrategy f73989b;

    /* renamed from: c */
    public final ContentLengthStrategy f73990c;

    /* renamed from: d */
    public final HttpMessageWriterFactory f73991d;

    /* renamed from: e */
    public final HttpMessageParserFactory f73992e;

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this.f73988a = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.f73989b = contentLengthStrategy;
        this.f73990c = contentLengthStrategy2;
        this.f73991d = httpMessageWriterFactory;
        this.f73992e = httpMessageParserFactory;
    }

    @Override // org.apache.http.HttpConnectionFactory
    public DefaultBHttpClientConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpClientConnection defaultBHttpClientConnection = new DefaultBHttpClientConnection(this.f73988a.getBufferSize(), this.f73988a.getFragmentSizeHint(), ConnSupport.createDecoder(this.f73988a), ConnSupport.createEncoder(this.f73988a), this.f73988a.getMessageConstraints(), this.f73989b, this.f73990c, this.f73991d, this.f73992e);
        defaultBHttpClientConnection.bind(socket);
        return defaultBHttpClientConnection;
    }

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this(connectionConfig, null, null, httpMessageWriterFactory, httpMessageParserFactory);
    }

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig) {
        this(connectionConfig, null, null, null, null);
    }

    public DefaultBHttpClientConnectionFactory() {
        this(null, null, null, null, null);
    }
}