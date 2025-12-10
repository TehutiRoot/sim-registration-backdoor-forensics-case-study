package org.apache.http.impl.p029io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.message.LineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.DefaultHttpResponseParser */
/* loaded from: classes6.dex */
public class DefaultHttpResponseParser extends AbstractMessageParser<HttpResponse> {

    /* renamed from: f */
    public final HttpResponseFactory f74490f;

    /* renamed from: g */
    public final CharArrayBuffer f74491g;

    @Deprecated
    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, HttpParams httpParams) {
        super(sessionInputBuffer, lineParser, httpParams);
        this.f74490f = (HttpResponseFactory) Args.notNull(httpResponseFactory, "Response factory");
        this.f74491g = new CharArrayBuffer(128);
    }

    @Override // org.apache.http.impl.p029io.AbstractMessageParser
    public HttpResponse parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException {
        this.f74491g.clear();
        if (sessionInputBuffer.readLine(this.f74491g) != -1) {
            return this.f74490f.newHttpResponse(this.lineParser.parseStatusLine(this.f74491g, new ParserCursor(0, this.f74491g.length())), null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpResponseFactory httpResponseFactory, MessageConstraints messageConstraints) {
        super(sessionInputBuffer, lineParser, messageConstraints);
        this.f74490f = httpResponseFactory == null ? DefaultHttpResponseFactory.INSTANCE : httpResponseFactory;
        this.f74491g = new CharArrayBuffer(128);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer, MessageConstraints messageConstraints) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, messageConstraints);
    }

    public DefaultHttpResponseParser(SessionInputBuffer sessionInputBuffer) {
        this(sessionInputBuffer, (LineParser) null, (HttpResponseFactory) null, MessageConstraints.DEFAULT);
    }
}
