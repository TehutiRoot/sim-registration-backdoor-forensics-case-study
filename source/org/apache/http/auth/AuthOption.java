package org.apache.http.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class AuthOption {

    /* renamed from: a */
    public final AuthScheme f73629a;

    /* renamed from: b */
    public final Credentials f73630b;

    public AuthOption(AuthScheme authScheme, Credentials credentials) {
        Args.notNull(authScheme, "Auth scheme");
        Args.notNull(credentials, "User credentials");
        this.f73629a = authScheme;
        this.f73630b = credentials;
    }

    public AuthScheme getAuthScheme() {
        return this.f73629a;
    }

    public Credentials getCredentials() {
        return this.f73630b;
    }

    public String toString() {
        return this.f73629a.toString();
    }
}
