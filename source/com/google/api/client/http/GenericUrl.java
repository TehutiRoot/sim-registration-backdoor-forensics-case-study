package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.escape.CharEscapers;
import com.google.api.client.util.escape.Escaper;
import com.google.api.client.util.escape.PercentEscaper;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public class GenericUrl extends GenericData {

    /* renamed from: j */
    public static final Escaper f52035j = new PercentEscaper("=&-_.!~*'()@:$,;/?:");

    /* renamed from: c */
    public String f52036c;

    /* renamed from: d */
    public String f52037d;

    /* renamed from: e */
    public String f52038e;

    /* renamed from: f */
    public int f52039f;

    /* renamed from: g */
    public List f52040g;

    /* renamed from: h */
    public String f52041h;

    /* renamed from: i */
    public boolean f52042i;

    public GenericUrl() {
        this.f52039f = -1;
    }

    /* renamed from: a */
    public static void m41771a(Set set, StringBuilder sb, boolean z) {
        String escapeUriQuery;
        Iterator it = set.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value != null) {
                if (z) {
                    escapeUriQuery = (String) entry.getKey();
                } else {
                    escapeUriQuery = CharEscapers.escapeUriQuery((String) entry.getKey());
                }
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        z2 = m41770b(z2, sb, escapeUriQuery, obj, z);
                    }
                } else {
                    z2 = m41770b(z2, sb, escapeUriQuery, value, z);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m41770b(boolean z, StringBuilder sb, String str, Object obj, boolean z2) {
        String escapeUriQuery;
        if (z) {
            sb.append('?');
            z = false;
        } else {
            sb.append(Typography.amp);
        }
        sb.append(str);
        if (z2) {
            escapeUriQuery = obj.toString();
        } else {
            escapeUriQuery = CharEscapers.escapeUriQuery(obj.toString());
        }
        if (escapeUriQuery.length() != 0) {
            sb.append('=');
            sb.append(escapeUriQuery);
        }
        return z;
    }

    /* renamed from: e */
    public static URL m41768e(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    public static URI m41767f(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static List<String> toPathParts(String str) {
        return toPathParts(str, false);
    }

    public void appendRawPath(String str) {
        if (str != null && str.length() != 0) {
            List<String> pathParts = toPathParts(str, this.f52042i);
            List list = this.f52040g;
            if (list != null && !list.isEmpty()) {
                int size = this.f52040g.size();
                List list2 = this.f52040g;
                int i = size - 1;
                list2.set(i, ((String) this.f52040g.get(i)) + pathParts.get(0));
                this.f52040g.addAll(pathParts.subList(1, pathParts.size()));
                return;
            }
            this.f52040g = pathParts;
        }
    }

    public final String build() {
        return buildAuthority() + buildRelativeUrl();
    }

    public final String buildAuthority() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) Preconditions.checkNotNull(this.f52036c));
        sb.append("://");
        String str = this.f52038e;
        if (str != null) {
            if (!this.f52042i) {
                str = CharEscapers.escapeUriUserInfo(str);
            }
            sb.append(str);
            sb.append('@');
        }
        sb.append((String) Preconditions.checkNotNull(this.f52037d));
        int i = this.f52039f;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        return sb.toString();
    }

    public final String buildRelativeUrl() {
        StringBuilder sb = new StringBuilder();
        if (this.f52040g != null) {
            m41769c(sb);
        }
        m41771a(entrySet(), sb, this.f52042i);
        String str = this.f52041h;
        if (str != null) {
            sb.append('#');
            if (!this.f52042i) {
                str = f52035j.escape(str);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final void m41769c(StringBuilder sb) {
        int size = this.f52040g.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f52040g.get(i);
            if (i != 0) {
                sb.append('/');
            }
            if (str.length() != 0) {
                if (!this.f52042i) {
                    str = CharEscapers.escapeUriPath(str);
                }
                sb.append(str);
            }
        }
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof GenericUrl)) {
            return build().equals(((GenericUrl) obj).build());
        }
        return false;
    }

    public Collection<Object> getAll(String str) {
        Object obj = get(str);
        if (obj == null) {
            return Collections.emptySet();
        }
        if (obj instanceof Collection) {
            return Collections.unmodifiableCollection((Collection) obj);
        }
        return Collections.singleton(obj);
    }

    public Object getFirst(String str) {
        Object obj = get(str);
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            if (it.hasNext()) {
                return it.next();
            }
            return null;
        }
        return obj;
    }

    public String getFragment() {
        return this.f52041h;
    }

    public String getHost() {
        return this.f52037d;
    }

    public List<String> getPathParts() {
        return this.f52040g;
    }

    public int getPort() {
        return this.f52039f;
    }

    public String getRawPath() {
        if (this.f52040g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m41769c(sb);
        return sb.toString();
    }

    public final String getScheme() {
        return this.f52036c;
    }

    public final String getUserInfo() {
        return this.f52038e;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return build().hashCode();
    }

    public final void setFragment(String str) {
        this.f52041h = str;
    }

    public final void setHost(String str) {
        this.f52037d = (String) Preconditions.checkNotNull(str);
    }

    public void setPathParts(List<String> list) {
        this.f52040g = list;
    }

    public final void setPort(int i) {
        boolean z;
        if (i >= -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "expected port >= -1");
        this.f52039f = i;
    }

    public void setRawPath(String str) {
        this.f52040g = toPathParts(str, this.f52042i);
    }

    public final void setScheme(String str) {
        this.f52036c = (String) Preconditions.checkNotNull(str);
    }

    public final void setUserInfo(String str) {
        this.f52038e = str;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public String toString() {
        return build();
    }

    public final URI toURI() {
        return m41767f(build());
    }

    public final URL toURL() {
        return m41768e(build());
    }

    public static List<String> toPathParts(String str, boolean z) {
        String substring;
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        int i = 0;
        while (z2) {
            int indexOf = str.indexOf(47, i);
            boolean z3 = indexOf != -1;
            if (z3) {
                substring = str.substring(i, indexOf);
            } else {
                substring = str.substring(i);
            }
            if (!z) {
                substring = CharEscapers.decodeUriPath(substring);
            }
            arrayList.add(substring);
            i = indexOf + 1;
            z2 = z3;
        }
        return arrayList;
    }

    @Override // com.google.api.client.util.GenericData
    public GenericUrl set(String str, Object obj) {
        return (GenericUrl) super.set(str, obj);
    }

    public final URL toURL(String str) {
        try {
            return new URL(toURL(), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public GenericUrl(String str) {
        this(str, false);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public GenericUrl clone() {
        GenericUrl genericUrl = (GenericUrl) super.clone();
        if (this.f52040g != null) {
            genericUrl.f52040g = new ArrayList(this.f52040g);
        }
        return genericUrl;
    }

    public GenericUrl(String str, boolean z) {
        this(m41768e(str), z);
    }

    public GenericUrl(URI uri) {
        this(uri, false);
    }

    public GenericUrl(URI uri, boolean z) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo(), z);
    }

    public GenericUrl(URL url) {
        this(url, false);
    }

    public GenericUrl(URL url, boolean z) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo(), z);
    }

    public GenericUrl(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z) {
        this.f52039f = -1;
        this.f52036c = str.toLowerCase(Locale.US);
        this.f52037d = str2;
        this.f52039f = i;
        this.f52040g = toPathParts(str3, z);
        this.f52042i = z;
        if (z) {
            this.f52041h = str4;
            if (str5 != null) {
                UrlEncodedParser.parse(str5, (Object) this, false);
            }
            this.f52038e = str6;
            return;
        }
        this.f52041h = str4 != null ? CharEscapers.decodeUri(str4) : null;
        if (str5 != null) {
            UrlEncodedParser.parse(str5, this);
        }
        this.f52038e = str6 != null ? CharEscapers.decodeUri(str6) : null;
    }
}
