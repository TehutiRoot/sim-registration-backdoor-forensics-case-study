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
    public final ConnectionConfig f73904a;

    /* renamed from: b */
    public final ContentLengthStrategy f73905b;

    /* renamed from: c */
    public final ContentLengthStrategy f73906c;

    /* renamed from: d */
    public final HttpMessageWriterFactory f73907d;

    /* renamed from: e */
    public final HttpMessageParserFactory f73908e;

    public DefaultBHttpClientConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this.f73904a = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.f73905b = contentLengthStrategy;
        this.f73906c = contentLengthStrategy2;
        this.f73907d = httpMessageWriterFactory;
        this.f73908e = httpMessageParserFactory;
    }

    @Override // org.apache.http.HttpConnectionFactory
    public DefaultBHttpClientConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpClientConnection defaultBHttpClientConnection = new DefaultBHttpClientConnection(this.f73904a.getBufferSize(), this.f73904a.getFragmentSizeHint(), ConnSupport.createDecoder(this.f73904a), ConnSupport.createEncoder(this.f73904a), this.f73904a.getMessageConstraints(), this.f73905b, this.f73906c, this.f73907d, this.f73908e);
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
