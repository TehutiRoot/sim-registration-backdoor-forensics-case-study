package org.apache.http.auth;

import java.util.Queue;
import org.apache.http.util.Args;

/* loaded from: classes6.dex */
public class AuthState {

    /* renamed from: a */
    public AuthProtocolState f73639a = AuthProtocolState.UNCHALLENGED;

    /* renamed from: b */
    public AuthScheme f73640b;

    /* renamed from: c */
    public AuthScope f73641c;

    /* renamed from: d */
    public Credentials f73642d;

    /* renamed from: e */
    public Queue f73643e;

    public Queue<AuthOption> getAuthOptions() {
        return this.f73643e;
    }

    public AuthScheme getAuthScheme() {
        return this.f73640b;
    }

    @Deprecated
    public AuthScope getAuthScope() {
        return this.f73641c;
    }

    public Credentials getCredentials() {
        return this.f73642d;
    }

    public AuthProtocolState getState() {
        return this.f73639a;
    }

    public boolean hasAuthOptions() {
        Queue queue = this.f73643e;
        if (queue != null && !queue.isEmpty()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void invalidate() {
        reset();
    }

    public boolean isConnectionBased() {
        AuthScheme authScheme = this.f73640b;
        if (authScheme != null && authScheme.isConnectionBased()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean isValid() {
        if (this.f73640b != null) {
            return true;
        }
        return false;
    }

    public void reset() {
        this.f73639a = AuthProtocolState.UNCHALLENGED;
        this.f73643e = null;
        this.f73640b = null;
        this.f73641c = null;
        this.f73642d = null;
    }

    @Deprecated
    public void setAuthScheme(AuthScheme authScheme) {
        if (authScheme == null) {
            reset();
        } else {
            this.f73640b = authScheme;
        }
    }

    @Deprecated
    public void setAuthScope(AuthScope authScope) {
        this.f73641c = authScope;
    }

    @Deprecated
    public void setCredentials(Credentials credentials) {
        this.f73642d = credentials;
    }

    public void setState(AuthProtocolState authProtocolState) {
        if (authProtocolState == null) {
            authProtocolState = AuthProtocolState.UNCHALLENGED;
        }
        this.f73639a = authProtocolState;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("state:");
        sb.append(this.f73639a);
        sb.append(";");
        if (this.f73640b != null) {
            sb.append("auth scheme:");
            sb.append(this.f73640b.getSchemeName());
            sb.append(";");
        }
        if (this.f73642d != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }

    public void update(AuthScheme authScheme, Credentials credentials) {
        Args.notNull(authScheme, "Auth scheme");
        Args.notNull(credentials, "Credentials");
        this.f73640b = authScheme;
        this.f73642d = credentials;
        this.f73643e = null;
    }

    public void update(Queue<AuthOption> queue) {
        Args.notEmpty(queue, "Queue of auth options");
        this.f73643e = queue;
        this.f73640b = null;
        this.f73642d = null;
    }
}
