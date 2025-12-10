package org.apache.http.impl.p029io;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpRequestFactory;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.p030io.HttpMessageParser;
import org.apache.http.p030io.HttpMessageParserFactory;
import org.apache.http.p030io.SessionInputBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* renamed from: org.apache.http.impl.io.DefaultHttpRequestParserFactory */
/* loaded from: classes6.dex */
public class DefaultHttpRequestParserFactory implements HttpMessageParserFactory<HttpRequest> {
    public static final DefaultHttpRequestParserFactory INSTANCE = new DefaultHttpRequestParserFactory();

    /* renamed from: a */
    public final LineParser f74487a;

    /* renamed from: b */
    public final HttpRequestFactory f74488b;

    public DefaultHttpRequestParserFactory(LineParser lineParser, HttpRequestFactory httpRequestFactory) {
        this.f74487a = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.f74488b = httpRequestFactory == null ? DefaultHttpRequestFactory.INSTANCE : httpRequestFactory;
    }

    @Override // org.apache.http.p030io.HttpMessageParserFactory
    public HttpMessageParser<HttpRequest> create(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        return new DefaultHttpRequestParser(sessionInputBuffer, this.f74487a, this.f74488b, messageConstraints);
    }

    public DefaultHttpRequestParserFactory() {
        this(null, null);
    }
}
