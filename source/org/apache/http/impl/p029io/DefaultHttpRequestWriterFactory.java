package org.apache.http.impl.p029io;

import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p030io.HttpMessageWriter;
import org.apache.http.p030io.HttpMessageWriterFactory;
import org.apache.http.p030io.SessionOutputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* renamed from: org.apache.http.impl.io.DefaultHttpRequestWriterFactory */
/* loaded from: classes6.dex */
public class DefaultHttpRequestWriterFactory implements HttpMessageWriterFactory<HttpRequest> {
    public static final DefaultHttpRequestWriterFactory INSTANCE = new DefaultHttpRequestWriterFactory();

    /* renamed from: a */
    public final LineFormatter f74489a;

    public DefaultHttpRequestWriterFactory(LineFormatter lineFormatter) {
        this.f74489a = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
    }

    @Override // org.apache.http.p030io.HttpMessageWriterFactory
    public HttpMessageWriter<HttpRequest> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpRequestWriter(sessionOutputBuffer, this.f74489a);
    }

    public DefaultHttpRequestWriterFactory() {
        this(null);
    }
}
