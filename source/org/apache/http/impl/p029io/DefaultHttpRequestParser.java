package org.apache.http.impl.p029io;

import java.io.IOException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestFactory;
import org.apache.http.ParseException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpRequestFactory;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.DefaultHttpRequestParser */
/* loaded from: classes6.dex */
public class DefaultHttpRequestParser extends AbstractMessageParser<HttpRequest> {

    /* renamed from: f */
    public final HttpRequestFactory f74485f;

    /* renamed from: g */
    public final CharArrayBuffer f74486g;

    @Deprecated
    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f74485f = (HttpRequestFactory) Args.notNull(httpRequestFactory, "Request factory");
        this.f74486g = new CharArrayBuffer(128);
    }

    @Override // org.apache.http.impl.p029io.AbstractMessageParser
    public HttpRequest parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.f74486g.clear();
        if (sessionInputBuffer.readLine(this.f74486g) != -1) {
            return this.f74485f.newHttpRequest(this.lineParser.parseRequestLine(this.f74486g, new ParserCursor(0, this.f74486g.length())));
        }
        throw new ConnectionClosedException("Client closed connection");
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.f74485f = httpRequestFactory == null ? DefaultHttpRequestFactory.INSTANCE : httpRequestFactory;
        this.f74486g = new CharArrayBuffer(128);
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, messageConstraints);
    }

    public DefaultHttpRequestParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpRequestFactory) null, MessageConstraints.DEFAULT);
    }
}
