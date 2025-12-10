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
    public final ConnectionConfig f73911a;

    /* renamed from: b */
    public final ContentLengthStrategy f73912b;

    /* renamed from: c */
    public final ContentLengthStrategy f73913c;

    /* renamed from: d */
    public final HttpMessageParserFactory f73914d;

    /* renamed from: e */
    public final HttpMessageWriterFactory f73915e;

    public DefaultBHttpServerConnectionFactory(ConnectionConfig connectionConfig, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageParserFactory<HttpRequest> httpMessageParserFactory, HttpMessageWriterFactory<HttpResponse> httpMessageWriterFactory) {
        this.f73911a = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.f73912b = contentLengthStrategy;
        this.f73913c = contentLengthStrategy2;
        this.f73914d = httpMessageParserFactory;
        this.f73915e = httpMessageWriterFactory;
    }

    @Override // org.apache.http.HttpConnectionFactory
    public DefaultBHttpServerConnection createConnection(Socket socket) throws IOException {
        DefaultBHttpServerConnection defaultBHttpServerConnection = new DefaultBHttpServerConnection(this.f73911a.getBufferSize(), this.f73911a.getFragmentSizeHint(), ConnSupport.createDecoder(this.f73911a), ConnSupport.createEncoder(this.f73911a), this.f73911a.getMessageConstraints(), this.f73912b, this.f73913c, this.f73914d, this.f73915e);
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
