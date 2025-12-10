package org.apache.http.impl.p029io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* renamed from: org.apache.http.impl.io.HttpResponseParser */
/* loaded from: classes6.dex */
public class HttpResponseParser extends AbstractMessageParser<HttpMessage> {

    /* renamed from: f */
    public final HttpResponseFactory f74497f;

    /* renamed from: g */
    public final CharArrayBuffer f74498g;

    public HttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f74497f = (HttpResponseFactory) Args.notNull(httpResponseFactory, "Response factory");
        this.f74498g = new CharArrayBuffer(128);
    }

    @Override // org.apache.http.impl.p029io.AbstractMessageParser
    public HttpMessage parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.f74498g.clear();
        if (sessionInputBuffer.readLine(this.f74498g) != -1) {
            return this.f74497f.newHttpResponse(this.lineParser.parseStatusLine(this.f74498g, new ParserCursor(0, this.f74498g.length())), null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
