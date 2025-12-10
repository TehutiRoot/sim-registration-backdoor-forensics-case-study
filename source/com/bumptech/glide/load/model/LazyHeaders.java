package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LazyHeaders implements Headers {

    /* renamed from: a */
    public final Map f42201a;

    /* renamed from: b */
    public volatile Map f42202b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: d */
        public static final String f42203d;

        /* renamed from: e */
        public static final Map f42204e;

        /* renamed from: a */
        public boolean f42205a = true;

        /* renamed from: b */
        public Map f42206b = f42204e;

        /* renamed from: c */
        public boolean f42207c = true;

        static {
            String m50287d = m50287d();
            f42203d = m50287d;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m50287d)) {
                hashMap.put("User-Agent", Collections.singletonList(new C5844a(m50287d)));
            }
            f42204e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        public static String m50287d() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public final Map m50290a() {
            HashMap hashMap = new HashMap(this.f42206b.size());
            for (Map.Entry entry : this.f42206b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        public Builder addHeader(@NonNull String str, @NonNull String str2) {
            return addHeader(str, new C5844a(str2));
        }

        /* renamed from: b */
        public final void m50289b() {
            if (this.f42205a) {
                this.f42205a = false;
                this.f42206b = m50290a();
            }
        }

        public LazyHeaders build() {
            this.f42205a = true;
            return new LazyHeaders(this.f42206b);
        }

        /* renamed from: c */
        public final List m50288c(String str) {
            List list = (List) this.f42206b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f42206b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        public Builder setHeader(@NonNull String str, @Nullable String str2) {
            return setHeader(str, str2 == null ? null : new C5844a(str2));
        }

        public Builder addHeader(@NonNull String str, @NonNull LazyHeaderFactory lazyHeaderFactory) {
            if (this.f42207c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, lazyHeaderFactory);
            }
            m50289b();
            m50288c(str).add(lazyHeaderFactory);
            return this;
        }

        public Builder setHeader(@NonNull String str, @Nullable LazyHeaderFactory lazyHeaderFactory) {
            m50289b();
            if (lazyHeaderFactory == null) {
                this.f42206b.remove(str);
            } else {
                List m50288c = m50288c(str);
                m50288c.clear();
                m50288c.add(lazyHeaderFactory);
            }
            if (this.f42207c && "User-Agent".equalsIgnoreCase(str)) {
                this.f42207c = false;
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.LazyHeaders$a */
    /* loaded from: classes3.dex */
    public static final class C5844a implements LazyHeaderFactory {

        /* renamed from: a */
        public final String f42208a;

        public C5844a(String str) {
            this.f42208a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public String buildHeader() {
            return this.f42208a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5844a) {
                return this.f42208a.equals(((C5844a) obj).f42208a);
            }
            return false;
        }

        public int hashCode() {
            return this.f42208a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f42208a + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        }
    }

    public LazyHeaders(Map map) {
        this.f42201a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final String m50292a(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String buildHeader = ((LazyHeaderFactory) list.get(i)).buildHeader();
            if (!TextUtils.isEmpty(buildHeader)) {
                sb.append(buildHeader);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map m50291b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f42201a.entrySet()) {
            String m50292a = m50292a((List) entry.getValue());
            if (!TextUtils.isEmpty(m50292a)) {
                hashMap.put(entry.getKey(), m50292a);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f42201a.equals(((LazyHeaders) obj).f42201a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        if (this.f42202b == null) {
            synchronized (this) {
                try {
                    if (this.f42202b == null) {
                        this.f42202b = Collections.unmodifiableMap(m50291b());
                    }
                } finally {
                }
            }
        }
        return this.f42202b;
    }

    public int hashCode() {
        return this.f42201a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f42201a + '}';
    }
}
