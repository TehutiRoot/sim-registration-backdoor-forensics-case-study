package p000;

import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Asserts;

/* renamed from: Yx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC18903Yx1 implements HttpRequestInterceptor {

    /* renamed from: a */
    public final Log f8064a = LogFactory.getLog(getClass());

    /* renamed from: Yx1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C1771a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8065a;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            f8065a = iArr;
            try {
                iArr[AuthProtocolState.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8065a[AuthProtocolState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8065a[AuthProtocolState.CHALLENGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public final Header m65274a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Asserts.notNull(authScheme, "Auth scheme");
        if (authScheme instanceof ContextAwareAuthScheme) {
            return ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext);
        }
        return authScheme.authenticate(credentials, httpRequest);
    }

    /* renamed from: b */
    public final void m65273b(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    /* renamed from: c */
    public void m65272c(AuthState authState, HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C1771a.f8065a[authState.getState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Queue<AuthOption> authOptions = authState.getAuthOptions();
                    if (authOptions != null) {
                        while (!authOptions.isEmpty()) {
                            AuthOption remove = authOptions.remove();
                            AuthScheme authScheme2 = remove.getAuthScheme();
                            Credentials credentials2 = remove.getCredentials();
                            authState.update(authScheme2, credentials2);
                            if (this.f8064a.isDebugEnabled()) {
                                Log log = this.f8064a;
                                log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                            }
                            try {
                                httpRequest.addHeader(m65274a(authScheme2, credentials2, httpRequest, httpContext));
                                return;
                            } catch (AuthenticationException e) {
                                if (this.f8064a.isWarnEnabled()) {
                                    Log log2 = this.f8064a;
                                    log2.warn(authScheme2 + " authentication error: " + e.getMessage());
                                }
                            }
                        }
                        return;
                    }
                    m65273b(authScheme);
                }
            } else {
                m65273b(authScheme);
                if (authScheme.isConnectionBased()) {
                    return;
                }
            }
            if (authScheme != null) {
                try {
                    httpRequest.addHeader(m65274a(authScheme, credentials, httpRequest, httpContext));
                } catch (AuthenticationException e2) {
                    if (this.f8064a.isErrorEnabled()) {
                        Log log3 = this.f8064a;
                        log3.error(authScheme + " authentication error: " + e2.getMessage());
                    }
                }
            }
        }
    }
}