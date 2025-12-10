package org.apache.http.impl.cookie;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.Obsolete;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.InterfaceC12572SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.SAFE)
@Obsolete
/* loaded from: classes6.dex */
public class RFC2965Spec extends RFC2109Spec {

    /* renamed from: org.apache.http.impl.cookie.RFC2965Spec$a */
    /* loaded from: classes6.dex */
    public class C12606a extends BasicPathHandler {
        @Override // org.apache.http.impl.cookie.BasicPathHandler, org.apache.http.cookie.CookieAttributeHandler
        public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
            if (match(cookie, cookieOrigin)) {
                return;
            }
            throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
    }

    public RFC2965Spec() {
        this((String[]) null, false);
    }

    /* renamed from: c */
    public static CookieOrigin m24600c(CookieOrigin cookieOrigin) {
        String host = cookieOrigin.getHost();
        for (int i = 0; i < host.length(); i++) {
            char charAt = host.charAt(i);
            if (charAt == '.' || charAt == ':') {
                return cookieOrigin;
            }
        }
        return new CookieOrigin(host + ".local", cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure());
    }

    /* renamed from: d */
    public final List m24599d(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name != null && !name.isEmpty()) {
                BasicClientCookie2 basicClientCookie2 = new BasicClientCookie2(name, value);
                basicClientCookie2.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
                basicClientCookie2.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
                basicClientCookie2.setPorts(new int[]{cookieOrigin.getPort()});
                NameValuePair[] parameters = headerElement.getParameters();
                HashMap hashMap = new HashMap(parameters.length);
                for (int length = parameters.length - 1; length >= 0; length--) {
                    NameValuePair nameValuePair = parameters[length];
                    hashMap.put(nameValuePair.getName().toLowerCase(Locale.ROOT), nameValuePair);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    NameValuePair nameValuePair2 = (NameValuePair) entry.getValue();
                    String lowerCase = nameValuePair2.getName().toLowerCase(Locale.ROOT);
                    basicClientCookie2.setAttribute(lowerCase, nameValuePair2.getValue());
                    CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
                    if (findAttribHandler != null) {
                        findAttribHandler.parse(basicClientCookie2, nameValuePair2.getValue());
                    }
                }
                arrayList.add(basicClientCookie2);
            } else {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
        }
        return arrayList;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec
    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        String attribute;
        int[] ports;
        super.formatCookieAsVer(charArrayBuffer, cookie, i);
        if ((cookie instanceof ClientCookie) && (attribute = ((ClientCookie) cookie).getAttribute(ClientCookie.PORT_ATTR)) != null) {
            charArrayBuffer.append("; $Port");
            charArrayBuffer.append("=\"");
            if (!attribute.trim().isEmpty() && (ports = cookie.getPorts()) != null) {
                int length = ports.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        charArrayBuffer.append(",");
                    }
                    charArrayBuffer.append(Integer.toString(ports[i2]));
                }
            }
            charArrayBuffer.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
        }
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 1;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append(InterfaceC12572SM.COOKIE2);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, "Cookie");
        Args.notNull(cookieOrigin, "Cookie origin");
        return super.match(cookie, m24600c(cookieOrigin));
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(header, "Header");
        Args.notNull(cookieOrigin, "Cookie origin");
        if (header.getName().equalsIgnoreCase("Set-Cookie2")) {
            return m24599d(header.getElements(), m24600c(cookieOrigin));
        }
        throw new MalformedCookieException("Unrecognized cookie header '" + header.toString() + OperatorName.SHOW_TEXT_LINE);
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec
    public String toString() {
        return CookiePolicy.RFC_2965;
    }

    @Override // org.apache.http.impl.cookie.RFC2109Spec, org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        Args.notNull(cookieOrigin, "Cookie origin");
        super.validate(cookie, m24600c(cookieOrigin));
    }

    public RFC2965Spec(String[] strArr, boolean z) {
        super(z, new RFC2965VersionAttributeHandler(), new C12606a(), new RFC2965DomainAttributeHandler(), new RFC2965PortAttributeHandler(), new BasicMaxAgeHandler(), new BasicSecureHandler(), new BasicCommentHandler(), new BasicExpiresHandler(strArr != null ? (String[]) strArr.clone() : RFC2109Spec.f74373c), new RFC2965CommentUrlAttributeHandler(), new RFC2965DiscardAttributeHandler());
    }

    public RFC2965Spec(boolean z, CommonCookieAttributeHandler... commonCookieAttributeHandlerArr) {
        super(z, commonCookieAttributeHandlerArr);
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase
    public List<Cookie> parse(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) throws MalformedCookieException {
        return m24599d(headerElementArr, m24600c(cookieOrigin));
    }
}
