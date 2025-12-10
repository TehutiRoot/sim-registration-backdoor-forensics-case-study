package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.logging.Log;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.config.MessageConstraints;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.conn.DefaultManagedHttpClientConnection;
import org.apache.http.impl.conn.Wire;
import org.apache.http.p030io.HttpMessageParserFactory;
import org.apache.http.p030io.HttpMessageWriterFactory;

/* renamed from: dl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C19574dl0 extends DefaultManagedHttpClientConnection {

    /* renamed from: m */
    public final Log f61273m;

    /* renamed from: n */
    public final Log f61274n;

    /* renamed from: o */
    public final Wire f61275o;

    public C19574dl0(String str, Log log, Log log2, Log log3, int i, int i2, CharsetDecoder charsetDecoder, CharsetEncoder charsetEncoder, MessageConstraints messageConstraints, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2, HttpMessageWriterFactory httpMessageWriterFactory, HttpMessageParserFactory httpMessageParserFactory) {
        super(str, i, i2, charsetDecoder, charsetEncoder, messageConstraints, contentLengthStrategy, contentLengthStrategy2, httpMessageWriterFactory, httpMessageParserFactory);
        this.f61273m = log;
        this.f61274n = log2;
        this.f61275o = new Wire(log3, str);
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (super.isOpen()) {
            if (this.f61273m.isDebugEnabled()) {
                Log log = this.f61273m;
                log.debug(getId() + ": Close connection");
            }
            super.close();
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public InputStream getSocketInputStream(Socket socket) {
        InputStream socketInputStream = super.getSocketInputStream(socket);
        if (this.f61275o.enabled()) {
            return new C19402cl0(socketInputStream, this.f61275o);
        }
        return socketInputStream;
    }

    @Override // org.apache.http.impl.BHttpConnectionBase
    public OutputStream getSocketOutputStream(Socket socket) {
        OutputStream socketOutputStream = super.getSocketOutputStream(socket);
        if (this.f61275o.enabled()) {
            return new C19746el0(socketOutputStream, this.f61275o);
        }
        return socketOutputStream;
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onRequestSubmitted(HttpRequest httpRequest) {
        Header[] allHeaders;
        if (httpRequest != null && this.f61274n.isDebugEnabled()) {
            this.f61274n.debug(getId() + " >> " + httpRequest.getRequestLine().toString());
            for (Header header : httpRequest.getAllHeaders()) {
                this.f61274n.debug(getId() + " >> " + header.toString());
            }
        }
    }

    @Override // org.apache.http.impl.DefaultBHttpClientConnection
    public void onResponseReceived(HttpResponse httpResponse) {
        Header[] allHeaders;
        if (httpResponse != null && this.f61274n.isDebugEnabled()) {
            this.f61274n.debug(getId() + " << " + httpResponse.getStatusLine().toString());
            for (Header header : httpResponse.getAllHeaders()) {
                this.f61274n.debug(getId() + " << " + header.toString());
            }
        }
    }

    @Override // org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void setSocketTimeout(int i) {
        if (this.f61273m.isDebugEnabled()) {
            Log log = this.f61273m;
            log.debug(getId() + ": set socket timeout to " + i);
        }
        super.setSocketTimeout(i);
    }

    @Override // org.apache.http.impl.conn.DefaultManagedHttpClientConnection, org.apache.http.impl.BHttpConnectionBase, org.apache.http.HttpConnection
    public void shutdown() {
        if (this.f61273m.isDebugEnabled()) {
            Log log = this.f61273m;
            log.debug(getId() + ": Shutdown connection");
        }
        super.shutdown();
    }
}
