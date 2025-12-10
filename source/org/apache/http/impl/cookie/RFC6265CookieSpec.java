package org.apache.http.impl.cookie;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePriorityComparator;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class RFC6265CookieSpec implements CookieSpec {

    /* renamed from: d */
    public static final BitSet f74383d = TokenParser.INIT_BITSET(61, 59);

    /* renamed from: e */
    public static final BitSet f74384e = TokenParser.INIT_BITSET(59);

    /* renamed from: f */
    public static final BitSet f74385f = TokenParser.INIT_BITSET(32, 34, 44, 59, 92);

    /* renamed from: a */
    public final CookieAttributeHandler[] f74386a;

    /* renamed from: b */
    public final Map f74387b;

    /* renamed from: c */
    public final TokenParser f74388c;

    public RFC6265CookieSpec(CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        this.f74386a = (CookieAttributeHandler[]) commonCookieAttributeHandlerArr.clone();
        this.f74387b = new ConcurrentHashMap(commonCookieAttributeHandlerArr.length);
        for (CommonCookieAttributeHandler commonCookieAttributeHandler : commonCookieAttributeHandlerArr) {
            this.f74387b.put(commonCookieAttributeHandler.getAttributeName().toLowerCase(Locale.ROOT), commonCookieAttributeHandler);
        }
        this.f74388c = TokenParser.INSTANCE;
    }

    /* renamed from: c */
    public static String m24596c(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    /* renamed from: d */
    public static String m24595d(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf >= 0) {
            if (lastIndexOf == 0) {
                lastIndexOf = 1;
            }
            return path.substring(0, lastIndexOf);
        }
        return path;
    }

    /* renamed from: a */
    public boolean m24598a(CharSequence charSequence, BitSet bitSet) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (bitSet.get(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m24597b(CharSequence charSequence) {
        return m24598a(charSequence, f74385f);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> list) {
        Args.notEmpty(list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, CookiePriorityComparator.INSTANCE);
            list = arrayList;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append("Cookie");
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            Cookie cookie = list.get(i);
            if (i > 0) {
                charArrayBuffer.append(';');
                charArrayBuffer.append(TokenParser.f74560SP);
            }
            charArrayBuffer.append(cookie.getName());
            String value = cookie.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                if (m24597b(value)) {
                    charArrayBuffer.append('\"');
                    for (int i2 = 0; i2 < value.length(); i2++) {
                        char charAt = value.charAt(i2);
                        if (charAt == '\"' || charAt == '\\') {
                            charArrayBuffer.append('\\');
                        }
                        charArrayBuffer.append(charAt);
                    }
                    charArrayBuffer.append('\"');
                } else {
                    charArrayBuffer.append(value);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(new BufferedHeader(charArrayBuffer));
        return arrayList2;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final int getVersion() {
        return 0;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final Header getVersionHeader() {
        return null;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : this.f74386a) {
            if (!cookieAttributeHandler.match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException {
        CharArrayBuffer charArrayBuffer;
        ParserCursor parserCursor;
        String str;
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie")) {
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                parserCursor = new ParserCursor(formattedHeader.getValuePos(), charArrayBuffer.length());
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    parserCursor = new ParserCursor(0, charArrayBuffer.length());
                } else {
                    throw new MalformedCookieException("Header value is null");
                }
            }
            String parseToken = this.f74388c.parseToken(charArrayBuffer, parserCursor, f74383d);
            if (parseToken.isEmpty()) {
                return Collections.emptyList();
            }
            if (parserCursor.atEnd()) {
                return Collections.emptyList();
            }
            char charAt = charArrayBuffer.charAt(parserCursor.getPos());
            parserCursor.updatePos(parserCursor.getPos() + 1);
            if (charAt == '=') {
                String parseValue = this.f74388c.parseValue(charArrayBuffer, parserCursor, f74384e);
                if (!parserCursor.atEnd()) {
                    parserCursor.updatePos(parserCursor.getPos() + 1);
                }
                BasicClientCookie basicClientCookie = new BasicClientCookie(parseToken, parseValue);
                basicClientCookie.setPath(m24595d(cookieOrigin));
                basicClientCookie.setDomain(m24596c(cookieOrigin));
                basicClientCookie.setCreationDate(new Date());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (!parserCursor.atEnd()) {
                    String lowerCase = this.f74388c.parseToken(charArrayBuffer, parserCursor, f74383d).toLowerCase(Locale.ROOT);
                    if (!parserCursor.atEnd()) {
                        char charAt2 = charArrayBuffer.charAt(parserCursor.getPos());
                        parserCursor.updatePos(parserCursor.getPos() + 1);
                        if (charAt2 == '=') {
                            str = this.f74388c.parseToken(charArrayBuffer, parserCursor, f74384e);
                            if (!parserCursor.atEnd()) {
                                parserCursor.updatePos(parserCursor.getPos() + 1);
                            }
                            basicClientCookie.setAttribute(lowerCase, str);
                            linkedHashMap.put(lowerCase, str);
                        }
                    }
                    str = null;
                    basicClientCookie.setAttribute(lowerCase, str);
                    linkedHashMap.put(lowerCase, str);
                }
                if (linkedHashMap.containsKey(ClientCookie.MAX_AGE_ATTR)) {
                    linkedHashMap.remove(ClientCookie.EXPIRES_ATTR);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getValue();
                    CookieAttributeHandler cookieAttributeHandler = (CookieAttributeHandler) this.f74387b.get((String) entry.getKey());
                    if (cookieAttributeHandler != null) {
                        cookieAttributeHandler.parse(basicClientCookie, str2);
                    }
                }
                return Collections.singletonList(basicClientCookie);
            }
            throw new MalformedCookieException("Cookie value is invalid: '" + header.toString() + OperatorName.SHOW_TEXT_LINE);
        }
        throw new MalformedCookieException("Unrecognized cookie header: '" + header.toString() + OperatorName.SHOW_TEXT_LINE);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public final void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(cookieOrigin, "Cookie origin");
        for (CookieAttributeHandler cookieAttributeHandler : this.f74386a) {
            cookieAttributeHandler.validate(cookie, cookieOrigin);
        }
    }
}
