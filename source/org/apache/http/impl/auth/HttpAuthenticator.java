package org.apache.http.impl.auth;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

/* loaded from: classes6.dex */
public class HttpAuthenticator {

    /* renamed from: a */
    public final Log f73941a;

    /* renamed from: org.apache.http.impl.auth.HttpAuthenticator$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12574a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73942a;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            f73942a = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73942a[AuthProtocolState.HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73942a[AuthProtocolState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f73942a[AuthProtocolState.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f73942a[AuthProtocolState.UNCHALLENGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HttpAuthenticator(Log log) {
        this.f73941a = log == null ? LogFactory.getLog(getClass()) : log;
    }

    /* renamed from: a */
    public final Header m24761a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        if (authScheme instanceof ContextAwareAuthScheme) {
            return ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext);
        }
        return authScheme.authenticate(credentials, httpRequest);
    }

    /* renamed from: b */
    public final void m24760b(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) throws HttpException, IOException {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C12574a.f73942a[authState.getState().ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    return;
                }
            } else {
                m24760b(authScheme);
                if (authScheme.isConnectionBased()) {
                    return;
                }
            }
        } else {
            Queue<AuthOption> authOptions = authState.getAuthOptions();
            if (authOptions != null) {
                while (!authOptions.isEmpty()) {
                    AuthOption remove = authOptions.remove();
                    AuthScheme authScheme2 = remove.getAuthScheme();
                    Credentials credentials2 = remove.getCredentials();
                    authState.update(authScheme2, credentials2);
                    if (this.f73941a.isDebugEnabled()) {
                        Log log = this.f73941a;
                        log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                    }
                    try {
                        httpRequest.addHeader(m24761a(authScheme2, credentials2, httpRequest, httpContext));
                        return;
                    } catch (AuthenticationException e) {
                        if (this.f73941a.isWarnEnabled()) {
                            Log log2 = this.f73941a;
                            log2.warn(authScheme2 + " authentication error: " + e.getMessage());
                        }
                    }
                }
                return;
            }
            m24760b(authScheme);
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(m24761a(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException e2) {
                if (this.f73941a.isErrorEnabled()) {
                    Log log3 = this.f73941a;
                    log3.error(authScheme + " authentication error: " + e2.getMessage());
                }
            }
        }
    }

    public boolean handleAuthChallenge(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        Queue<AuthOption> select;
        try {
            if (this.f73941a.isDebugEnabled()) {
                Log log = this.f73941a;
                log.debug(httpHost.toHostString() + " requested authentication");
            }
            Map<String, Header> challenges = authenticationStrategy.getChallenges(httpHost, httpResponse, httpContext);
            if (challenges.isEmpty()) {
                this.f73941a.debug("Response contains no authentication challenges");
                return false;
            }
            AuthScheme authScheme = authState.getAuthScheme();
            int i = C12574a.f73942a[authState.getState().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return false;
                    }
                    if (i != 5) {
                    }
                } else {
                    authState.reset();
                }
                select = authenticationStrategy.select(challenges, httpHost, httpResponse, httpContext);
                if (select != null || select.isEmpty()) {
                    return false;
                }
                if (this.f73941a.isDebugEnabled()) {
                    Log log2 = this.f73941a;
                    log2.debug("Selected authentication options: " + select);
                }
                authState.setState(AuthProtocolState.CHALLENGED);
                authState.update(select);
                return true;
            } else if (authScheme == null) {
                this.f73941a.debug("Auth scheme is null");
                authenticationStrategy.authFailed(httpHost, null, httpContext);
                authState.reset();
                authState.setState(AuthProtocolState.FAILURE);
                return false;
            }
            if (authScheme != null) {
                Header header = challenges.get(authScheme.getSchemeName().toLowerCase(Locale.ROOT));
                if (header != null) {
                    this.f73941a.debug("Authorization challenge processed");
                    authScheme.processChallenge(header);
                    if (authScheme.isComplete()) {
                        this.f73941a.debug("Authentication failed");
                        authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
                        authState.reset();
                        authState.setState(AuthProtocolState.FAILURE);
                        return false;
                    }
                    authState.setState(AuthProtocolState.HANDSHAKE);
                    return true;
                }
                authState.reset();
            }
            select = authenticationStrategy.select(challenges, httpHost, httpResponse, httpContext);
            if (select != null) {
            }
            return false;
        } catch (MalformedChallengeException e) {
            if (this.f73941a.isWarnEnabled()) {
                Log log3 = this.f73941a;
                log3.warn("Malformed challenge: " + e.getMessage());
            }
            authState.reset();
            return false;
        }
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext)) {
            this.f73941a.debug("Authentication required");
            if (authState.getState() == AuthProtocolState.SUCCESS) {
                authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
            }
            return true;
        }
        int i = C12574a.f73942a[authState.getState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                authState.setState(AuthProtocolState.UNCHALLENGED);
                return false;
            }
            return false;
        }
        this.f73941a.debug("Authentication succeeded");
        authState.setState(AuthProtocolState.SUCCESS);
        authenticationStrategy.authSucceeded(httpHost, authState.getAuthScheme(), httpContext);
        return false;
    }

    public HttpAuthenticator() {
        this(null);
    }
}
