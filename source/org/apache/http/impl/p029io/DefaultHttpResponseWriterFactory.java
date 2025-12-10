package org.apache.http.impl.p029io;

import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.p030io.HttpMessageWriter;
import org.apache.http.p030io.HttpMessageWriterFactory;
import org.apache.http.p030io.SessionOutputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* renamed from: org.apache.http.impl.io.DefaultHttpResponseWriterFactory */
/* loaded from: classes6.dex */
public class DefaultHttpResponseWriterFactory implements HttpMessageWriterFactory<HttpResponse> {
    public static final DefaultHttpResponseWriterFactory INSTANCE = new DefaultHttpResponseWriterFactory();

    /* renamed from: a */
    public final LineFormatter f74494a;

    public DefaultHttpResponseWriterFactory(LineFormatter lineFormatter) {
        this.f74494a = lineFormatter == null ? BasicLineFormatter.INSTANCE : lineFormatter;
    }

    @Override // org.apache.http.p030io.HttpMessageWriterFactory
    public HttpMessageWriter<HttpResponse> create(SessionOutputBuffer sessionOutputBuffer) {
        return new DefaultHttpResponseWriter(sessionOutputBuffer, this.f74494a);
    }

    public DefaultHttpResponseWriterFactory() {
        this(null);
    }
}
