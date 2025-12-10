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
public class DefaultBHttpServerConnectionFactory implements HttpConnectionFactory<DefaultBHttpServerConnection> {
    public static final DefaultBHttpServerConnectionFactory INSTANCE = new DefaultBHttpServerConnectionFactory();

    /* renamed from: a */
    public final ConnectionConfig f73995a;

    /* renamed from: b */
    public final ContentLengthStrategy f73996b;

    /* renamed from: c */
    public final ContentLengthStrategy f73997c;

    /* renamed from: d */
    public final HttpMessageParserFactory f73998d;

    /* renamed from: e */
    public final HttpMessageWriterFactory f73999e;

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        this.f73995a = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.f73996b = contentLengthStrategy;
        this.f73997c = contentLengthStrategy2;
        this.f73998d = httpMessageParserFactory;
        this.f73999e = httpMessageWriterFactory;
    }

    @Override // org.apache.http.HttpConnectionFactory
    public DefaultBHttpServerConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpServerConnection defaultBHttpServerConnection = new DefaultBHttpServerConnection(this.f73995a.getBufferSize(), this.f73995a.getFragmentSizeHint(), ConnSupport.createDecoder(this.f73995a), ConnSupport.createEncoder(this.f73995a), this.f73995a.getMessageConstraints(), this.f73996b, this.f73997c, this.f73998d, this.f73999e);
        defaultBHttpServerConnection.bind(socket);
        return defaultBHttpServerConnection;
    }

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        this(connectionConfig, null, null, httpMessageParserFactory, httpMessageWriterFactory);
    }

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig) {
        this(connectionConfig, null, null, null, null);
    }

    public DefaultBHttpServerConnectionFactory() {
        this(null, null, null, null, null);
    }
}