package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.BitSet;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class NetscapeDraftHeaderParser {
    public static final NetscapeDraftHeaderParser DEFAULT = new NetscapeDraftHeaderParser();

    /* renamed from: b */
    public static final BitSet f74358b = TokenParser.INIT_BITSET(61, 59);

    /* renamed from: c */
    public static final BitSet f74359c = TokenParser.INIT_BITSET(59);

    /* renamed from: a */
    public final TokenParser f74360a = TokenParser.INSTANCE;

    /* renamed from: a */
    public final NameValuePair m24607a(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        String parseToken = this.f74360a.parseToken(charArrayBuffer, parserCursor, f74358b);
        if (parserCursor.atEnd()) {
            return new BasicNameValuePair(parseToken, null);
        }
        char charAt = charArrayBuffer.charAt(parserCursor.getPos());
        parserCursor.updatePos(parserCursor.getPos() + 1);
        if (charAt != '=') {
            return new BasicNameValuePair(parseToken, null);
        }
        String parseToken2 = this.f74360a.parseToken(charArrayBuffer, parserCursor, f74359c);
        if (!parserCursor.atEnd()) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        return new BasicNameValuePair(parseToken, parseToken2);
    }

    public HeaderElement parseHeader(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        Args.notNull(parserCursor, "Parser cursor");
        NameValuePair m24607a = m24607a(charArrayBuffer, parserCursor);
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            arrayList.add(m24607a(charArrayBuffer, parserCursor));
        }
        return new BasicHeaderElement(m24607a.getName(), m24607a.getValue(), (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]));
    }
}
