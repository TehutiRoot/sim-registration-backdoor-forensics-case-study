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
    public final Map f42213a;

    /* renamed from: b */
    public volatile Map f42214b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: d */
        public static final String f42215d;

        /* renamed from: e */
        public static final Map f42216e;

        /* renamed from: a */
        public boolean f42217a = true;

        /* renamed from: b */
        public Map f42218b = f42216e;

        /* renamed from: c */
        public boolean f42219c = true;

        static {
            String m50284d = m50284d();
            f42215d = m50284d;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m50284d)) {
                hashMap.put("User-Agent", Collections.singletonList(new C5833a(m50284d)));
            }
            f42216e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        public static String m50284d() {
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
        public final Map m50287a() {
            HashMap hashMap = new HashMap(this.f42218b.size());
            for (Map.Entry entry : this.f42218b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        public Builder addHeader(@NonNull String str, @NonNull String str2) {
            return addHeader(str, new C5833a(str2));
        }

        /* renamed from: b */
        public final void m50286b() {
            if (this.f42217a) {
                this.f42217a = false;
                this.f42218b = m50287a();
            }
        }

        public LazyHeaders build() {
            this.f42217a = true;
            return new LazyHeaders(this.f42218b);
        }

        /* renamed from: c */
        public final List m50285c(String str) {
            List list = (List) this.f42218b.get(str);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f42218b.put(str, arrayList);
                return arrayList;
            }
            return list;
        }

        public Builder setHeader(@NonNull String str, @Nullable String str2) {
            return setHeader(str, str2 == null ? null : new C5833a(str2));
        }

        public Builder addHeader(@NonNull String str, @NonNull LazyHeaderFactory lazyHeaderFactory) {
            if (this.f42219c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, lazyHeaderFactory);
            }
            m50286b();
            m50285c(str).add(lazyHeaderFactory);
            return this;
        }

        public Builder setHeader(@NonNull String str, @Nullable LazyHeaderFactory lazyHeaderFactory) {
            m50286b();
            if (lazyHeaderFactory == null) {
                this.f42218b.remove(str);
            } else {
                List m50285c = m50285c(str);
                m50285c.clear();
                m50285c.add(lazyHeaderFactory);
            }
            if (this.f42219c && "User-Agent".equalsIgnoreCase(str)) {
                this.f42219c = false;
            }
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.model.LazyHeaders$a */
    /* loaded from: classes3.dex */
    public static final class C5833a implements LazyHeaderFactory {

        /* renamed from: a */
        public final String f42220a;

        public C5833a(String str) {
            this.f42220a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public String buildHeader() {
            return this.f42220a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C5833a) {
                return this.f42220a.equals(((C5833a) obj).f42220a);
            }
            return false;
        }

        public int hashCode() {
            return this.f42220a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f42220a + CoreConstants.SINGLE_QUOTE_CHAR + '}';
        }
    }

    public LazyHeaders(Map map) {
        this.f42213a = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final String m50289a(List list) {
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
    public final Map m50288b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f42213a.entrySet()) {
            String m50289a = m50289a((List) entry.getValue());
            if (!TextUtils.isEmpty(m50289a)) {
                hashMap.put(entry.getKey(), m50289a);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f42213a.equals(((LazyHeaders) obj).f42213a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        if (this.f42214b == null) {
            synchronized (this) {
                try {
                    if (this.f42214b == null) {
                        this.f42214b = Collections.unmodifiableMap(m50288b());
                    }
                } finally {
                }
            }
        }
        return this.f42214b;
    }

    public int hashCode() {
        return this.f42213a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f42213a + '}';
    }
}