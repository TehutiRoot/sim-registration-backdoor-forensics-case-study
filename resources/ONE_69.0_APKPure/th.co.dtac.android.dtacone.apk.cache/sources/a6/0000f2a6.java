package org.apache.http.impl.p029io;

import java.io.IOException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequestFactory;
import org.apache.http.ParseException;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* renamed from: org.apache.http.impl.io.HttpRequestParser */
/* loaded from: classes6.dex */
public class HttpRequestParser extends AbstractMessageParser<HttpMessage> {

    /* renamed from: f */
    public final HttpRequestFactory f74579f;

    /* renamed from: g */
    public final CharArrayBuffer f74580g;

    public HttpRequestParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpRequestFactory httpRequestFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f74579f = (HttpRequestFactory) Args.notNull(httpRequestFactory, "Request factory");
        this.f74580g = new CharArrayBuffer(128);
    }

    @Override // org.apache.http.impl.p029io.AbstractMessageParser
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.f74580g.clear();
        if (sessionInputBuffer.readLine(this.f74580g) != -1) {
            return this.f74579f.newHttpRequest(this.lineParser.parseRequestLine(this.f74580g, new ParserCursor(0, this.f74580g.length())));
        }
        throw new ConnectionClosedException("Client closed connection");
    }
}