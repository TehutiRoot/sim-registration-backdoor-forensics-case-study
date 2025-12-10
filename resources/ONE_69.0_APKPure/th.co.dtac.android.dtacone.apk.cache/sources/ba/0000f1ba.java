package org.apache.http.impl.auth;

import androidx.autofill.HintConstants;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ChallengeState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

/* loaded from: classes6.dex */
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private static final long serialVersionUID = 3883908186234566916L;

    /* renamed from: a1 */
    private String f74015a1;

    /* renamed from: a2 */
    private String f74016a2;
    private String cnonce;
    private boolean complete;
    private String lastNonce;
    private long nounceCount;

    public DigestScheme(Charset charset) {
        super(charset);
        this.complete = false;
    }

    public static String createCnonce() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return encode(bArr);
    }

    private Header createDigestHeader(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        String str;
        String str2;
        char c;
        String str3;
        String str4;
        String str5;
        String str6;
        String sb;
        String str7;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter6 == null) {
            parameter6 = MessageDigestAlgorithms.MD5;
        }
        HashSet hashSet = new HashSet(8);
        String str8 = MessageDigestAlgorithms.MD5;
        String parameter7 = getParameter("qop");
        if (parameter7 != null) {
            str2 = "algorithm";
            str = "qop";
            for (StringTokenizer stringTokenizer = new StringTokenizer(parameter7, ","); stringTokenizer.hasMoreTokens(); stringTokenizer = stringTokenizer) {
                hashSet.add(stringTokenizer.nextToken().trim().toLowerCase(Locale.ROOT));
            }
            if ((httpRequest instanceof HttpEntityEnclosingRequest) && hashSet.contains("auth-int")) {
                c = 1;
            } else {
                c = hashSet.contains("auth") ? (char) 2 : (char) 65535;
            }
        } else {
            str = "qop";
            str2 = "algorithm";
            c = 0;
        }
        if (c != 65535) {
            String parameter8 = getParameter("charset");
            if (parameter8 == null) {
                parameter8 = "ISO-8859-1";
            }
            if (parameter6.equalsIgnoreCase("MD5-sess")) {
                str3 = "auth-int";
            } else {
                str3 = "auth-int";
                str8 = parameter6;
            }
            try {
                MessageDigest createMessageDigest = createMessageDigest(str8);
                String name = credentials.getUserPrincipal().getName();
                String password = credentials.getPassword();
                if (parameter3.equals(this.lastNonce)) {
                    str4 = parameter;
                    this.nounceCount++;
                } else {
                    str4 = parameter;
                    this.nounceCount = 1L;
                    this.cnonce = null;
                    this.lastNonce = parameter3;
                }
                StringBuilder sb2 = new StringBuilder(256);
                Formatter formatter = new Formatter(sb2, Locale.US);
                formatter.format("%08x", Long.valueOf(this.nounceCount));
                formatter.close();
                String sb3 = sb2.toString();
                if (this.cnonce == null) {
                    this.cnonce = createCnonce();
                }
                this.f74015a1 = null;
                this.f74016a2 = null;
                if (parameter6.equalsIgnoreCase("MD5-sess")) {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(parameter2);
                    sb2.append(':');
                    sb2.append(password);
                    String encode = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2.toString(), parameter8)));
                    sb2.setLength(0);
                    sb2.append(encode);
                    sb2.append(':');
                    sb2.append(parameter3);
                    sb2.append(':');
                    sb2.append(this.cnonce);
                    this.f74015a1 = sb2.toString();
                } else {
                    sb2.setLength(0);
                    sb2.append(name);
                    sb2.append(':');
                    sb2.append(parameter2);
                    sb2.append(':');
                    sb2.append(password);
                    this.f74015a1 = sb2.toString();
                }
                String encode2 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f74015a1, parameter8)));
                if (c == 2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(parameter5);
                    sb4.append(':');
                    str5 = str4;
                    sb4.append(str5);
                    this.f74016a2 = sb4.toString();
                    str6 = "auth";
                } else {
                    str5 = str4;
                    if (c == 1) {
                        HttpEntity entity = httpRequest instanceof HttpEntityEnclosingRequest ? ((HttpEntityEnclosingRequest) httpRequest).getEntity() : null;
                        if (entity != null && !entity.isRepeatable()) {
                            str6 = "auth";
                            if (!hashSet.contains(str6)) {
                                throw new AuthenticationException("Qop auth-int cannot be used with a non-repeatable entity");
                            }
                            this.f74016a2 = parameter5 + ':' + str5;
                            c = 2;
                        } else {
                            str6 = "auth";
                            C19350c90 c19350c90 = new C19350c90(createMessageDigest);
                            if (entity != null) {
                                try {
                                    entity.writeTo(c19350c90);
                                } catch (IOException e) {
                                    throw new AuthenticationException("I/O error reading entity content", e);
                                }
                            }
                            c19350c90.close();
                            this.f74016a2 = parameter5 + ':' + str5 + ':' + encode(c19350c90.m51721b());
                        }
                    } else {
                        str6 = "auth";
                        this.f74016a2 = parameter5 + ':' + str5;
                    }
                }
                String encode3 = encode(createMessageDigest.digest(EncodingUtils.getBytes(this.f74016a2, parameter8)));
                if (c == 0) {
                    sb2.setLength(0);
                    sb2.append(encode2);
                    sb2.append(':');
                    sb2.append(parameter3);
                    sb2.append(':');
                    sb2.append(encode3);
                    sb = sb2.toString();
                } else {
                    sb2.setLength(0);
                    sb2.append(encode2);
                    sb2.append(':');
                    sb2.append(parameter3);
                    sb2.append(':');
                    sb2.append(sb3);
                    sb2.append(':');
                    sb2.append(this.cnonce);
                    sb2.append(':');
                    sb2.append(c == 1 ? str3 : str6);
                    sb2.append(':');
                    sb2.append(encode3);
                    sb = sb2.toString();
                }
                String encode4 = encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(sb)));
                CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
                if (isProxy()) {
                    charArrayBuffer.append("Proxy-Authorization");
                } else {
                    charArrayBuffer.append("Authorization");
                }
                charArrayBuffer.append(": Digest ");
                ArrayList arrayList = new ArrayList(20);
                arrayList.add(new BasicNameValuePair(HintConstants.AUTOFILL_HINT_USERNAME, name));
                arrayList.add(new BasicNameValuePair("realm", parameter2));
                arrayList.add(new BasicNameValuePair("nonce", parameter3));
                arrayList.add(new BasicNameValuePair("uri", str5));
                arrayList.add(new BasicNameValuePair("response", encode4));
                if (c != 0) {
                    String str9 = c == 1 ? str3 : str6;
                    str7 = str;
                    arrayList.add(new BasicNameValuePair(str7, str9));
                    arrayList.add(new BasicNameValuePair("nc", sb3));
                    arrayList.add(new BasicNameValuePair("cnonce", this.cnonce));
                } else {
                    str7 = str;
                }
                String str10 = str2;
                arrayList.add(new BasicNameValuePair(str10, parameter6));
                if (parameter4 != null) {
                    arrayList.add(new BasicNameValuePair("opaque", parameter4));
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i);
                    if (i > 0) {
                        charArrayBuffer.append(", ");
                    }
                    String name2 = basicNameValuePair.getName();
                    BasicHeaderValueFormatter.INSTANCE.formatNameValuePair(charArrayBuffer, basicNameValuePair, !("nc".equals(name2) || str7.equals(name2) || str10.equals(name2)));
                }
                return new BufferedHeader(charArrayBuffer);
            } catch (UnsupportedDigestAlgorithmException unused) {
                throw new AuthenticationException("Unsuppported digest algorithm: " + str8);
            }
        }
        throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
    }

    private static MessageDigest createMessageDigest(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        return authenticate(credentials, httpRequest, new BasicHttpContext());
    }

    public String getA1() {
        return this.f74015a1;
    }

    public String getA2() {
        return this.f74016a2;
    }

    public String getCnonce() {
        return this.cnonce;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "digest";
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return false;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.AuthScheme
    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        this.complete = true;
        if (!getParameters().isEmpty()) {
            return;
        }
        throw new MalformedChallengeException("Authentication challenge is empty");
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public String toString() {
        return "DIGEST [complete=" + this.complete + ", nonce=" + this.lastNonce + ", nc=" + this.nounceCount + "]";
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) throws AuthenticationException {
        Args.notNull(credentials, "Credentials");
        Args.notNull(httpRequest, "HTTP request");
        if (getParameter("realm") != null) {
            if (getParameter("nonce") != null) {
                getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
                getParameters().put("uri", httpRequest.getRequestLine().getUri());
                if (getParameter("charset") == null) {
                    getParameters().put("charset", getCredentialsCharset(httpRequest));
                }
                return createDigestHeader(credentials, httpRequest);
            }
            throw new AuthenticationException("missing nonce in challenge");
        }
        throw new AuthenticationException("missing realm in challenge");
    }

    @Deprecated
    public DigestScheme(ChallengeState challengeState) {
        super(challengeState);
    }

    public DigestScheme() {
        this(Consts.ASCII);
    }
}