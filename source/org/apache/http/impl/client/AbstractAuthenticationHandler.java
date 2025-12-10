package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;
import org.apache.http.util.CharArrayBuffer;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public abstract class AbstractAuthenticationHandler implements AuthenticationHandler {

    /* renamed from: b */
    public static final List f74034b = Collections.unmodifiableList(Arrays.asList("Negotiate", "NTLM", "Digest", "Basic"));

    /* renamed from: a */
    public final Log f74035a = LogFactory.getLog(getClass());

    public List<String> getAuthPreferences() {
        return f74034b;
    }

    public Map<String, Header> parseChallenges(Header[] headerArr) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        int i;
        HashMap hashMap = new HashMap(headerArr.length);
        for (Header header : headerArr) {
            if (header instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) header;
                charArrayBuffer = formattedHeader.getBuffer();
                i = formattedHeader.getValuePos();
            } else {
                String value = header.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    i = 0;
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
                i2++;
            }
            hashMap.put(charArrayBuffer.substring(i, i2).toLowerCase(Locale.ROOT), header);
        }
        return hashMap;
    }

    @Override // org.apache.http.client.AuthenticationHandler
    public AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext) throws AuthenticationException {
        AuthScheme authScheme;
        AuthSchemeRegistry authSchemeRegistry = (AuthSchemeRegistry) httpContext.getAttribute("http.authscheme-registry");
        Asserts.notNull(authSchemeRegistry, "AuthScheme registry");
        List<String> authPreferences = getAuthPreferences(httpResponse, httpContext);
        if (authPreferences == null) {
            authPreferences = f74034b;
        }
        if (this.f74035a.isDebugEnabled()) {
            Log log = this.f74035a;
            log.debug("Authentication schemes in the order of preference: " + authPreferences);
        }
        Iterator<String> it = authPreferences.iterator();
        while (true) {
            if (it.hasNext()) {
                String next = it.next();
                if (map.get(next.toLowerCase(Locale.ENGLISH)) != null) {
                    if (this.f74035a.isDebugEnabled()) {
                        Log log2 = this.f74035a;
                        log2.debug(next + " authentication scheme selected");
                    }
                    try {
                        authScheme = authSchemeRegistry.getAuthScheme(next, httpResponse.getParams());
                        break;
                    } catch (IllegalStateException unused) {
                        if (this.f74035a.isWarnEnabled()) {
                            Log log3 = this.f74035a;
                            log3.warn("Authentication scheme " + next + " not supported");
                        }
                    }
                } else if (this.f74035a.isDebugEnabled()) {
                    Log log4 = this.f74035a;
                    log4.debug("Challenge for " + next + " authentication scheme not available");
                }
            } else {
                authScheme = null;
                break;
            }
        }
        if (authScheme != null) {
            return authScheme;
        }
        throw new AuthenticationException("Unable to respond to any of these challenges: " + map);
    }

    public List<String> getAuthPreferences(HttpResponse httpResponse, HttpContext httpContext) {
        return getAuthPreferences();
    }
}
