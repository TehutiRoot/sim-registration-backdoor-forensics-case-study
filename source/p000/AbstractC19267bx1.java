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

/* renamed from: bx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC19267bx1 implements HttpRequestInterceptor {

    /* renamed from: a */
    public final Log f39290a = LogFactory.getLog(getClass());

    /* renamed from: bx1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5412a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39291a;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            f39291a = iArr;
            try {
                iArr[AuthProtocolState.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39291a[AuthProtocolState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39291a[AuthProtocolState.CHALLENGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public final Header m51736a(AuthScheme authScheme, Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        Asserts.notNull(authScheme, "Auth scheme");
        if (authScheme instanceof ContextAwareAuthScheme) {
            return ((ContextAwareAuthScheme) authScheme).authenticate(credentials, httpRequest, httpContext);
        }
        return authScheme.authenticate(credentials, httpRequest);
    }

    /* renamed from: b */
    public final void m51735b(AuthScheme authScheme) {
        Asserts.notNull(authScheme, "Auth scheme");
    }

    /* renamed from: c */
    public void m51734c(AuthState authState, HttpRequest httpRequest, HttpContext httpContext) {
        AuthScheme authScheme = authState.getAuthScheme();
        Credentials credentials = authState.getCredentials();
        int i = C5412a.f39291a[authState.getState().ordinal()];
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
                            if (this.f39290a.isDebugEnabled()) {
                                Log log = this.f39290a;
                                log.debug("Generating response to an authentication challenge using " + authScheme2.getSchemeName() + " scheme");
                            }
                            try {
                                httpRequest.addHeader(m51736a(authScheme2, credentials2, httpRequest, httpContext));
                                return;
                            } catch (AuthenticationException e) {
                                if (this.f39290a.isWarnEnabled()) {
                                    Log log2 = this.f39290a;
                                    log2.warn(authScheme2 + " authentication error: " + e.getMessage());
                                }
                            }
                        }
                        return;
                    }
                    m51735b(authScheme);
                }
            } else {
                m51735b(authScheme);
                if (authScheme.isConnectionBased()) {
                    return;
                }
            }
            if (authScheme != null) {
                try {
                    httpRequest.addHeader(m51736a(authScheme, credentials, httpRequest, httpContext));
                } catch (AuthenticationException e2) {
                    if (this.f39290a.isErrorEnabled()) {
                        Log log3 = this.f39290a;
                        log3.error(authScheme + " authentication error: " + e2.getMessage());
                    }
                }
            }
        }
    }
}
