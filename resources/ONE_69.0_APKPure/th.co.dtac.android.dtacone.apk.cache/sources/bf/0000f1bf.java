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
    public final Log f74025a;

    /* renamed from: org.apache.http.impl.auth.HttpAuthenticator$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12574a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74026a;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            f74026a = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74026a[AuthProtocolState.HANDSHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74026a[AuthProtocolState.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74026a[AuthProtocolState.FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74026a[AuthProtocolState.UNCHALLENGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public HttpAuthenticator(Log log) {
        this.f74025a = log == null ? LogFactory.getLog(getClass()) : log;
    }

    /* renamed from: a */
    public final Header m24951a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        if (authScheme instanceof ContextAwareAuthScheme) {
            return ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext);
        }
        return authScheme.authenticate(credentials, httpRequest);
    }

    /* renamed from: b */
    public final void m24950b(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    public void generateAuthResponse(HttpRequest httpRequest, AuthState authState, HttpContext httpContext) throws HttpException, IOException {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C12574a.f74026a[authState.getState().ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    return;
                }
            } else {
                m24950b(authScheme);
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
                    if (this.f74025a.isDebugEnabled()) {
                        Log log = this.f74025a;
                        log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                    }
                    try {
                        httpRequest.addHeader(m24951a(authScheme2, credentials2, httpRequest, httpContext));
                        return;
                    } catch (AuthenticationException e) {
                        if (this.f74025a.isWarnEnabled()) {
                            Log log2 = this.f74025a;
                            log2.warn(authScheme2 + " authentication error: " + e.getMessage());
                        }
                    }
                }
                return;
            }
            m24950b(authScheme);
        }
        if (authScheme != null) {
            try {
                httpRequest.addHeader(m24951a(authScheme, credentials, httpRequest, httpContext));
            } catch (AuthenticationException e2) {
                if (this.f74025a.isErrorEnabled()) {
                    Log log3 = this.f74025a;
                    log3.error(authScheme + " authentication error: " + e2.getMessage());
                }
            }
        }
    }

    public boolean handleAuthChallenge(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        Queue<AuthOption> select;
        try {
            if (this.f74025a.isDebugEnabled()) {
                Log log = this.f74025a;
                log.debug(httpHost.toHostString() + " requested authentication");
            }
            Map<String, Header> challenges = authenticationStrategy.getChallenges(httpHost, httpResponse, httpContext);
            if (challenges.isEmpty()) {
                this.f74025a.debug("Response contains no authentication challenges");
                return false;
            }
            AuthScheme authScheme = authState.getAuthScheme();
            int i = C12574a.f74026a[authState.getState().ordinal()];
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
                if (this.f74025a.isDebugEnabled()) {
                    Log log2 = this.f74025a;
                    log2.debug("Selected authentication options: " + select);
                }
                authState.setState(AuthProtocolState.CHALLENGED);
                authState.update(select);
                return true;
            } else if (authScheme == null) {
                this.f74025a.debug("Auth scheme is null");
                authenticationStrategy.authFailed(httpHost, null, httpContext);
                authState.reset();
                authState.setState(AuthProtocolState.FAILURE);
                return false;
            }
            if (authScheme != null) {
                Header header = challenges.get(authScheme.getSchemeName().toLowerCase(Locale.ROOT));
                if (header != null) {
                    this.f74025a.debug("Authorization challenge processed");
                    authScheme.processChallenge(header);
                    if (authScheme.isComplete()) {
                        this.f74025a.debug("Authentication failed");
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
            if (this.f74025a.isWarnEnabled()) {
                Log log3 = this.f74025a;
                log3.warn("Malformed challenge: " + e.getMessage());
            }
            authState.reset();
            return false;
        }
    }

    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, AuthenticationStrategy authenticationStrategy, AuthState authState, HttpContext httpContext) {
        if (authenticationStrategy.isAuthenticationRequested(httpHost, httpResponse, httpContext)) {
            this.f74025a.debug("Authentication required");
            if (authState.getState() == AuthProtocolState.SUCCESS) {
                authenticationStrategy.authFailed(httpHost, authState.getAuthScheme(), httpContext);
            }
            return true;
        }
        int i = C12574a.f74026a[authState.getState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                authState.setState(AuthProtocolState.UNCHALLENGED);
                return false;
            }
            return false;
        }
        this.f74025a.debug("Authentication succeeded");
        authState.setState(AuthProtocolState.SUCCESS);
        authenticationStrategy.authSucceeded(httpHost, authState.getAuthScheme(), httpContext);
        return false;
    }

    public HttpAuthenticator() {
        this(null);
    }
}