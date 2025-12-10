package org.apache.http.params;

import java.util.HashSet;
import java.util.Set;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: classes6.dex */
public final class DefaultedHttpParams extends AbstractHttpParams {

    /* renamed from: a */
    public final HttpParams f74645a;

    /* renamed from: b */
    public final HttpParams f74646b;

    public DefaultedHttpParams(HttpParams httpParams, HttpParams httpParams2) {
        this.f74645a = (HttpParams) Args.notNull(httpParams, "Local HTTP parameters");
        this.f74646b = httpParams2;
    }

    /* renamed from: a */
    public final Set m24755a(HttpParams httpParams) {
        if (httpParams instanceof HttpParamsNames) {
            return ((HttpParamsNames) httpParams).getNames();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        return new DefaultedHttpParams(this.f74645a.copy(), this.f74646b);
    }

    public Set<String> getDefaultNames() {
        return new HashSet(m24755a(this.f74646b));
    }

    public HttpParams getDefaults() {
        return this.f74646b;
    }

    public Set<String> getLocalNames() {
        return new HashSet(m24755a(this.f74645a));
    }

    @Override // org.apache.http.params.AbstractHttpParams, org.apache.http.params.HttpParamsNames
    public Set<String> getNames() {
        HashSet hashSet = new HashSet(m24755a(this.f74646b));
        hashSet.addAll(m24755a(this.f74645a));
        return hashSet;
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        HttpParams httpParams;
        Object parameter = this.f74645a.getParameter(str);
        if (parameter == null && (httpParams = this.f74646b) != null) {
            return httpParams.getParameter(str);
        }
        return parameter;
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        return this.f74645a.removeParameter(str);
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        return this.f74645a.setParameter(str, obj);
    }
}