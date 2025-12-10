package org.apache.http.impl.auth;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* loaded from: classes6.dex */
public abstract class GGSSchemeBase extends AuthSchemeBase {

    /* renamed from: a */
    public final Log f74018a;

    /* renamed from: b */
    public final Base64 f74019b;

    /* renamed from: c */
    public final boolean f74020c;

    /* renamed from: d */
    public final boolean f74021d;

    /* renamed from: e */
    public State f74022e;

    /* renamed from: f */
    public byte[] f74023f;

    /* loaded from: classes6.dex */
    public enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    /* renamed from: org.apache.http.impl.auth.GGSSchemeBase$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12573a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74024a;

        static {
            int[] iArr = new int[State.values().length];
            f74024a = iArr;
            try {
                iArr[State.UNINITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74024a[State.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74024a[State.CHALLENGE_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74024a[State.TOKEN_GENERATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public GGSSchemeBase(boolean z, boolean z2) {
        this.f74018a = LogFactory.getLog(getClass());
        this.f74019b = new Base64(0);
        this.f74020c = z;
        this.f74021d = z2;
        this.f74022e = State.UNINITIATED;
    }

    /* renamed from: a */
    public GSSContext m24953a(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) {
        GSSContext createContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        createContext.requestMutualAuth(true);
        return createContext;
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        return authenticate(credentials, httpRequest, null);
    }

    /* renamed from: b */
    public final String m24952b(String str) {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        if (byName.getHostAddress().contentEquals(canonicalHostName)) {
            return str;
        }
        return canonicalHostName;
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str) throws GSSException {
        return generateGSSToken(bArr, oid, str, null);
    }

    @Deprecated
    public byte[] generateToken(byte[] bArr, String str) throws GSSException {
        return null;
    }

    public GSSManager getManager() {
        return GSSManager.getInstance();
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        State state = this.f74022e;
        if (state != State.TOKEN_GENERATED && state != State.FAILED) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    public void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) throws MalformedChallengeException {
        String substringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        if (this.f74018a.isDebugEnabled()) {
            Log log = this.f74018a;
            log.debug("Received challenge '" + substringTrimmed + "' from the auth server");
        }
        if (this.f74022e == State.UNINITIATED) {
            this.f74023f = Base64.decodeBase64(substringTrimmed.getBytes());
            this.f74022e = State.CHALLENGE_RECEIVED;
            return;
        }
        this.f74018a.debug("Authentication already attempted");
        this.f74022e = State.FAILED;
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) throws AuthenticationException {
        HttpHost targetHost;
        Args.notNull(httpRequest, "HTTP request");
        int i = C12573a.f74024a[this.f74022e.ordinal()];
        if (i == 1) {
            throw new AuthenticationException(getSchemeName() + " authentication has not been initiated");
        } else if (i != 2) {
            if (i == 3) {
                try {
                    HttpRoute httpRoute = (HttpRoute) httpContext.getAttribute("http.route");
                    if (httpRoute != null) {
                        if (isProxy()) {
                            targetHost = httpRoute.getProxyHost();
                            if (targetHost == null) {
                                targetHost = httpRoute.getTargetHost();
                            }
                        } else {
                            targetHost = httpRoute.getTargetHost();
                        }
                        String hostName = targetHost.getHostName();
                        if (this.f74021d) {
                            try {
                                hostName = m24952b(hostName);
                            } catch (UnknownHostException unused) {
                            }
                        }
                        if (!this.f74020c) {
                            hostName = hostName + ":" + targetHost.getPort();
                        }
                        if (this.f74018a.isDebugEnabled()) {
                            this.f74018a.debug("init " + hostName);
                        }
                        this.f74023f = generateToken(this.f74023f, hostName, credentials);
                        this.f74022e = State.TOKEN_GENERATED;
                    } else {
                        throw new AuthenticationException("Connection route is not available");
                    }
                } catch (GSSException e) {
                    this.f74022e = State.FAILED;
                    if (e.getMajor() != 9 && e.getMajor() != 8) {
                        if (e.getMajor() != 13) {
                            if (e.getMajor() != 10 && e.getMajor() != 19 && e.getMajor() != 20) {
                                throw new AuthenticationException(e.getMessage());
                            }
                            throw new AuthenticationException(e.getMessage(), e);
                        }
                        throw new InvalidCredentialsException(e.getMessage(), e);
                    }
                    throw new InvalidCredentialsException(e.getMessage(), e);
                }
            } else if (i != 4) {
                throw new IllegalStateException("Illegal state: " + this.f74022e);
            }
            String str = new String(this.f74019b.encode(this.f74023f));
            if (this.f74018a.isDebugEnabled()) {
                this.f74018a.debug("Sending response '" + str + "' back to the auth server");
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
            if (isProxy()) {
                charArrayBuffer.append("Proxy-Authorization");
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": Negotiate ");
            charArrayBuffer.append(str);
            return new BufferedHeader(charArrayBuffer);
        } else {
            throw new AuthenticationException(getSchemeName() + " authentication has failed");
        }
    }

    public byte[] generateGSSToken(byte[] bArr, Oid oid, String str, Credentials credentials) throws GSSException {
        GSSManager manager = getManager();
        GSSContext m24953a = m24953a(manager, oid, manager.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE), credentials instanceof KerberosCredentials ? ((KerberosCredentials) credentials).getGSSCredential() : null);
        return bArr != null ? m24953a.initSecContext(bArr, 0, bArr.length) : m24953a.initSecContext(new byte[0], 0, 0);
    }

    public byte[] generateToken(byte[] bArr, String str, Credentials credentials) throws GSSException {
        return generateToken(bArr, str);
    }

    public GGSSchemeBase(boolean z) {
        this(z, true);
    }

    public GGSSchemeBase() {
        this(true, true);
    }
}