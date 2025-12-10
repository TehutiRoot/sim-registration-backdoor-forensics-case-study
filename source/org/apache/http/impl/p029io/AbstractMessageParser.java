package org.apache.http.impl.p029io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.message.TokenParser;
import org.apache.http.p030io.HttpMessageParser;
import org.apache.http.p030io.SessionInputBuffer;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* renamed from: org.apache.http.impl.io.AbstractMessageParser */
/* loaded from: classes6.dex */
public abstract class AbstractMessageParser<T extends HttpMessage> implements HttpMessageParser<T> {

    /* renamed from: a */
    public final SessionInputBuffer f74433a;

    /* renamed from: b */
    public final MessageConstraints f74434b;

    /* renamed from: c */
    public final List f74435c;

    /* renamed from: d */
    public int f74436d;

    /* renamed from: e */
    public HttpMessage f74437e;
    protected final LineParser lineParser;

    @Deprecated
    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(httpParams, "HTTP parameters");
        this.f74433a = sessionInputBuffer;
        this.f74434b = HttpParamConfig.getMessageConstraints(httpParams);
        this.lineParser = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.f74435c = new ArrayList();
        this.f74436d = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser) throws HttpException, IOException {
        ArrayList arrayList = new ArrayList();
        if (lineParser == null) {
            lineParser = BasicLineParser.INSTANCE;
        }
        return parseHeaders(sessionInputBuffer, i, i2, lineParser, arrayList);
    }

    @Override // org.apache.http.p030io.HttpMessageParser
    public T parse() throws IOException, HttpException {
        int i = this.f74436d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Inconsistent parser state");
            }
        } else {
            try {
                this.f74437e = parseHead(this.f74433a);
                this.f74436d = 1;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        }
        this.f74437e.setHeaders(parseHeaders(this.f74433a, this.f74434b.getMaxHeaderCount(), this.f74434b.getMaxLineLength(), this.lineParser, this.f74435c));
        T t = (T) this.f74437e;
        this.f74437e = null;
        this.f74435c.clear();
        this.f74436d = 0;
        return t;
    }

    public abstract T parseHead(SessionInputBuffer sessionInputBuffer) throws IOException, HttpException, ParseException;

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser, List<CharArrayBuffer> list) throws HttpException, IOException {
        int i3;
        char charAt;
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(lineParser, "Line parser");
        Args.notNull(list, "Header line list");
        CharArrayBuffer charArrayBuffer = null;
        CharArrayBuffer charArrayBuffer2 = null;
        while (true) {
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(64);
            } else {
                charArrayBuffer.clear();
            }
            i3 = 0;
            if (sessionInputBuffer.readLine(charArrayBuffer) == -1 || charArrayBuffer.length() < 1) {
                break;
            }
            if ((charArrayBuffer.charAt(0) == ' ' || charArrayBuffer.charAt(0) == '\t') && charArrayBuffer2 != null) {
                while (i3 < charArrayBuffer.length() && ((charAt = charArrayBuffer.charAt(i3)) == ' ' || charAt == '\t')) {
                    i3++;
                }
                if (i2 > 0 && ((charArrayBuffer2.length() + 1) + charArrayBuffer.length()) - i3 > i2) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
                charArrayBuffer2.append(TokenParser.f74560SP);
                charArrayBuffer2.append(charArrayBuffer, i3, charArrayBuffer.length() - i3);
            } else {
                list.add(charArrayBuffer);
                charArrayBuffer2 = charArrayBuffer;
                charArrayBuffer = null;
            }
            if (i > 0 && list.size() >= i) {
                throw new MessageConstraintException("Maximum header count exceeded");
            }
        }
        Header[] headerArr = new Header[list.size()];
        while (i3 < list.size()) {
            try {
                headerArr[i3] = lineParser.parseHeader(list.get(i3));
                i3++;
            } catch (ParseException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        return headerArr;
    }

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, MessageConstraints messageConstraints) {
        this.f74433a = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.lineParser = lineParser == null ? BasicLineParser.INSTANCE : lineParser;
        this.f74434b = messageConstraints == null ? MessageConstraints.DEFAULT : messageConstraints;
        this.f74435c = new ArrayList();
        this.f74436d = 0;
    }
}
