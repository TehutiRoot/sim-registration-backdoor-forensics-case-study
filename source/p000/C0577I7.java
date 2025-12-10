package p000;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthOption;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* renamed from: I7 */
/* loaded from: classes6.dex */
public class C0577I7 implements AuthenticationStrategy {

    /* renamed from: a */
    public final Log f2412a = LogFactory.getLog(getClass());

    /* renamed from: b */
    public final AuthenticationHandler f2413b;

    public C0577I7(AuthenticationHandler authenticationHandler) {
        this.f2413b = authenticationHandler;
    }

    /* renamed from: b */
    private boolean m67996b(AuthScheme authScheme) {
        if (authScheme != null && authScheme.isComplete()) {
            return authScheme.getSchemeName().equalsIgnoreCase("Basic");
        }
        return false;
    }

    /* renamed from: a */
    public AuthenticationHandler m67997a() {
        return this.f2413b;
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authFailed(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        if (authCache == null) {
            return;
        }
        if (this.f2412a.isDebugEnabled()) {
            Log log = this.f2412a;
            log.debug("Removing from cache '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public void authSucceeded(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        if (m67996b(authScheme)) {
            if (authCache == null) {
                authCache = new BasicAuthCache();
                httpContext.setAttribute("http.auth.auth-cache", authCache);
            }
            if (this.f2412a.isDebugEnabled()) {
                Log log = this.f2412a;
                log.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
            }
            authCache.put(httpHost, authScheme);
        }
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public Map getChallenges(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        return this.f2413b.getChallenges(httpResponse, httpContext);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        return this.f2413b.isAuthenticationRequested(httpResponse, httpContext);
    }

    @Override // org.apache.http.client.AuthenticationStrategy
    public Queue select(Map map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(map, "Map of auth challenges");
        Args.notNull(httpHost, "Host");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        LinkedList linkedList = new LinkedList();
        CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute("http.auth.credentials-provider");
        if (credentialsProvider == null) {
            this.f2412a.debug("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            AuthScheme selectScheme = this.f2413b.selectScheme(map, httpResponse, httpContext);
            selectScheme.processChallenge((Header) map.get(selectScheme.getSchemeName().toLowerCase(Locale.ROOT)));
            Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort(), selectScheme.getRealm(), selectScheme.getSchemeName()));
            if (credentials != null) {
                linkedList.add(new AuthOption(selectScheme, credentials));
            }
            return linkedList;
        } catch (AuthenticationException e) {
            if (this.f2412a.isWarnEnabled()) {
                this.f2412a.warn(e.getMessage(), e);
            }
            return linkedList;
        }
    }
}
