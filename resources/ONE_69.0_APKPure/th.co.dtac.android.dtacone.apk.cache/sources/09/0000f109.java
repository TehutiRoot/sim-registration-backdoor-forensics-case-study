package org.apache.http.client.protocol;

import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public class ClientContextConfigurer implements ClientContext {

    /* renamed from: a */
    public final HttpContext f73804a;

    public ClientContextConfigurer(HttpContext httpContext) {
        Args.notNull(httpContext, "HTTP context");
        this.f73804a = httpContext;
    }

    public void setAuthSchemeRegistry(AuthSchemeRegistry authSchemeRegistry) {
        this.f73804a.setAttribute("http.authscheme-registry", authSchemeRegistry);
    }

    public void setCookieSpecRegistry(CookieSpecRegistry cookieSpecRegistry) {
        this.f73804a.setAttribute("http.cookiespec-registry", cookieSpecRegistry);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.f73804a.setAttribute("http.cookie-store", cookieStore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.f73804a.setAttribute("http.auth.credentials-provider", credentialsProvider);
    }
}