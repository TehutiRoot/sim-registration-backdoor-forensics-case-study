package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Base64;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class HttpHeaders extends GenericData {

    /* renamed from: A */
    public List f52050A;

    /* renamed from: B */
    public List f52051B;

    /* renamed from: C */
    public List f52052C;

    /* renamed from: c */
    public List f52053c;

    /* renamed from: d */
    public List f52054d;

    /* renamed from: e */
    public List f52055e;

    /* renamed from: f */
    public List f52056f;

    /* renamed from: g */
    public List f52057g;

    /* renamed from: h */
    public List f52058h;

    /* renamed from: i */
    public List f52059i;

    /* renamed from: j */
    public List f52060j;

    /* renamed from: k */
    public List f52061k;

    /* renamed from: l */
    public List f52062l;

    /* renamed from: m */
    public List f52063m;

    /* renamed from: n */
    public List f52064n;

    /* renamed from: o */
    public List f52065o;

    /* renamed from: p */
    public List f52066p;

    /* renamed from: q */
    public List f52067q;

    /* renamed from: r */
    public List f52068r;

    /* renamed from: s */
    public List f52069s;

    /* renamed from: t */
    public List f52070t;

    /* renamed from: u */
    public List f52071u;

    /* renamed from: v */
    public List f52072v;

    /* renamed from: w */
    public List f52073w;

    /* renamed from: x */
    public List f52074x;

    /* renamed from: y */
    public List f52075y;

    /* renamed from: z */
    public List f52076z;

    /* renamed from: com.google.api.client.http.HttpHeaders$a */
    /* loaded from: classes4.dex */
    public static class C7295a extends LowLevelHttpRequest {

        /* renamed from: e */
        public final HttpHeaders f52077e;

        /* renamed from: f */
        public final C7296b f52078f;

        public C7295a(HttpHeaders httpHeaders, C7296b c7296b) {
            this.f52077e = httpHeaders;
            this.f52078f = c7296b;
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public void addHeader(String str, String str2) {
            this.f52077e.m41763e(str, str2, this.f52078f);
        }

        @Override // com.google.api.client.http.LowLevelHttpRequest
        public LowLevelHttpResponse execute() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.api.client.http.HttpHeaders$b */
    /* loaded from: classes4.dex */
    public static final class C7296b {

        /* renamed from: a */
        public final ArrayValueMap f52079a;

        /* renamed from: b */
        public final StringBuilder f52080b;

        /* renamed from: c */
        public final ClassInfo f52081c;

        /* renamed from: d */
        public final List f52082d;

        public C7296b(HttpHeaders httpHeaders, StringBuilder sb) {
            Class<?> cls = httpHeaders.getClass();
            this.f52082d = Arrays.asList(cls);
            this.f52081c = ClassInfo.m41708of(cls, true);
            this.f52080b = sb;
            this.f52079a = new ArrayValueMap(httpHeaders);
        }

        /* renamed from: a */
        public void m41758a() {
            this.f52079a.setValues();
        }
    }

    public HttpHeaders() {
        super(EnumSet.of(GenericData.Flags.IGNORE_CASE));
        this.f52054d = new ArrayList(Collections.singleton("gzip"));
    }

    /* renamed from: a */
    public static void m41766a(Logger logger, StringBuilder sb, StringBuilder sb2, LowLevelHttpRequest lowLevelHttpRequest, String str, Object obj, Writer writer) {
        String str2;
        if (obj != null && !Data.isNull(obj)) {
            String m41759i = m41759i(obj);
            if ((!"Authorization".equalsIgnoreCase(str) && !"Cookie".equalsIgnoreCase(str)) || (logger != null && logger.isLoggable(Level.ALL))) {
                str2 = m41759i;
            } else {
                str2 = "<Not Logged>";
            }
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(StringUtils.LINE_SEPARATOR);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append(OperatorName.SHOW_TEXT_LINE);
            }
            if (lowLevelHttpRequest != null) {
                lowLevelHttpRequest.addHeader(str, m41759i);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(": ");
                writer.write(m41759i);
                writer.write("\r\n");
            }
        }
    }

    /* renamed from: f */
    public static Object m41762f(Type type, List list, String str) {
        return Data.parsePrimitiveValue(Data.resolveWildcardTypeOrTypeVariable(list, type), str);
    }

    /* renamed from: g */
    public static void m41761g(HttpHeaders httpHeaders, StringBuilder sb, StringBuilder sb2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest) {
        m41760h(httpHeaders, sb, sb2, logger, lowLevelHttpRequest, null);
    }

    /* renamed from: h */
    public static void m41760h(HttpHeaders httpHeaders, StringBuilder sb, StringBuilder sb2, Logger logger, LowLevelHttpRequest lowLevelHttpRequest, Writer writer) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : httpHeaders.entrySet()) {
            String key = entry.getKey();
            Preconditions.checkArgument(hashSet.add(key), "multiple headers of the same name (headers are case insensitive): %s", key);
            Object value = entry.getValue();
            if (value != null) {
                FieldInfo fieldInfo = httpHeaders.getClassInfo().getFieldInfo(key);
                if (fieldInfo != null) {
                    key = fieldInfo.getName();
                }
                String str = key;
                Class<?> cls = value.getClass();
                if (!(value instanceof Iterable) && !cls.isArray()) {
                    m41766a(logger, sb, sb2, lowLevelHttpRequest, str, value, writer);
                } else {
                    for (Object obj : Types.iterableOf(value)) {
                        m41766a(logger, sb, sb2, lowLevelHttpRequest, str, obj, writer);
                    }
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    /* renamed from: i */
    public static String m41759i(Object obj) {
        if (obj instanceof Enum) {
            return FieldInfo.m41701of((Enum) obj).getName();
        }
        return obj.toString();
    }

    public static void serializeHeadersForMultipartRequests(HttpHeaders httpHeaders, StringBuilder sb, Logger logger, Writer writer) throws IOException {
        m41760h(httpHeaders, sb, null, logger, null, writer);
    }

    public HttpHeaders addWarning(String str) {
        if (str == null) {
            return this;
        }
        List list = this.f52050A;
        if (list == null) {
            this.f52050A = m41765b(str);
        } else {
            list.add(str);
        }
        return this;
    }

    /* renamed from: b */
    public final List m41765b(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: c */
    public final Object m41764c(List list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: e */
    public void m41763e(String str, String str2, C7296b c7296b) {
        Type iterableParameter;
        List list = c7296b.f52082d;
        ClassInfo classInfo = c7296b.f52081c;
        ArrayValueMap arrayValueMap = c7296b.f52079a;
        StringBuilder sb = c7296b.f52080b;
        if (sb != null) {
            sb.append(str + ": " + str2);
            sb.append(StringUtils.LINE_SEPARATOR);
        }
        FieldInfo fieldInfo = classInfo.getFieldInfo(str);
        if (fieldInfo != null) {
            Type resolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(list, fieldInfo.getGenericType());
            if (Types.isArray(resolveWildcardTypeOrTypeVariable)) {
                Class<?> rawArrayComponentType = Types.getRawArrayComponentType(list, Types.getArrayComponentType(resolveWildcardTypeOrTypeVariable));
                arrayValueMap.put(fieldInfo.getField(), rawArrayComponentType, m41762f(rawArrayComponentType, list, str2));
                return;
            } else if (Types.isAssignableToOrFrom(Types.getRawArrayComponentType(list, resolveWildcardTypeOrTypeVariable), Iterable.class)) {
                Collection<Object> collection = (Collection) fieldInfo.getValue(this);
                if (collection == null) {
                    collection = Data.newCollectionInstance(resolveWildcardTypeOrTypeVariable);
                    fieldInfo.setValue(this, collection);
                }
                if (resolveWildcardTypeOrTypeVariable == Object.class) {
                    iterableParameter = null;
                } else {
                    iterableParameter = Types.getIterableParameter(resolveWildcardTypeOrTypeVariable);
                }
                collection.add(m41762f(iterableParameter, list, str2));
                return;
            } else {
                fieldInfo.setValue(this, m41762f(resolveWildcardTypeOrTypeVariable, list, str2));
                return;
            }
        }
        ArrayList arrayList = (ArrayList) get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            set(str, (Object) arrayList);
        }
        arrayList.add(str2);
    }

    public final void fromHttpHeaders(HttpHeaders httpHeaders) {
        try {
            C7296b c7296b = new C7296b(this, null);
            m41761g(httpHeaders, null, null, null, new C7295a(this, c7296b));
            c7296b.m41758a();
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    public final void fromHttpResponse(LowLevelHttpResponse lowLevelHttpResponse, StringBuilder sb) throws IOException {
        clear();
        C7296b c7296b = new C7296b(this, sb);
        int headerCount = lowLevelHttpResponse.getHeaderCount();
        for (int i = 0; i < headerCount; i++) {
            m41763e(lowLevelHttpResponse.getHeaderName(i), lowLevelHttpResponse.getHeaderValue(i), c7296b);
        }
        c7296b.m41758a();
    }

    public final String getAccept() {
        return (String) m41764c(this.f52053c);
    }

    public final String getAcceptEncoding() {
        return (String) m41764c(this.f52054d);
    }

    public final Long getAge() {
        return (Long) m41764c(this.f52052C);
    }

    public final String getAuthenticate() {
        return (String) m41764c(this.f52051B);
    }

    public final List<String> getAuthenticateAsList() {
        return this.f52051B;
    }

    public final String getAuthorization() {
        return (String) m41764c(this.f52055e);
    }

    public final List<String> getAuthorizationAsList() {
        return this.f52055e;
    }

    public final String getCacheControl() {
        return (String) m41764c(this.f52056f);
    }

    public final String getContentEncoding() {
        return (String) m41764c(this.f52057g);
    }

    public final Long getContentLength() {
        return (Long) m41764c(this.f52058h);
    }

    public final String getContentMD5() {
        return (String) m41764c(this.f52059i);
    }

    public final String getContentRange() {
        return (String) m41764c(this.f52060j);
    }

    public final String getContentType() {
        return (String) m41764c(this.f52061k);
    }

    public final String getCookie() {
        return (String) m41764c(this.f52062l);
    }

    public final String getDate() {
        return (String) m41764c(this.f52063m);
    }

    public final String getETag() {
        return (String) m41764c(this.f52064n);
    }

    public final String getExpires() {
        return (String) m41764c(this.f52065o);
    }

    public String getFirstHeaderStringValue(String str) {
        Object obj = get(str.toLowerCase(Locale.US));
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if ((obj instanceof Iterable) || cls.isArray()) {
            Iterator it = Types.iterableOf(obj).iterator();
            if (it.hasNext()) {
                return m41759i(it.next());
            }
        }
        return m41759i(obj);
    }

    public List<String> getHeaderStringValues(String str) {
        Object obj = get(str.toLowerCase(Locale.US));
        if (obj == null) {
            return Collections.emptyList();
        }
        Class<?> cls = obj.getClass();
        if (!(obj instanceof Iterable) && !cls.isArray()) {
            return Collections.singletonList(m41759i(obj));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : Types.iterableOf(obj)) {
            arrayList.add(m41759i(obj2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String getIfMatch() {
        return (String) m41764c(this.f52067q);
    }

    public final String getIfModifiedSince() {
        return (String) m41764c(this.f52066p);
    }

    public final String getIfNoneMatch() {
        return (String) m41764c(this.f52068r);
    }

    public final String getIfRange() {
        return (String) m41764c(this.f52070t);
    }

    public final String getIfUnmodifiedSince() {
        return (String) m41764c(this.f52069s);
    }

    public final String getLastModified() {
        return (String) m41764c(this.f52071u);
    }

    public final String getLocation() {
        return (String) m41764c(this.f52072v);
    }

    public final String getMimeVersion() {
        return (String) m41764c(this.f52073w);
    }

    public final String getRange() {
        return (String) m41764c(this.f52074x);
    }

    public final String getRetryAfter() {
        return (String) m41764c(this.f52075y);
    }

    public final String getUserAgent() {
        return (String) m41764c(this.f52076z);
    }

    public final List<String> getWarning() {
        if (this.f52050A == null) {
            return null;
        }
        return new ArrayList(this.f52050A);
    }

    public HttpHeaders setAccept(String str) {
        this.f52053c = m41765b(str);
        return this;
    }

    public HttpHeaders setAcceptEncoding(String str) {
        this.f52054d = m41765b(str);
        return this;
    }

    public HttpHeaders setAge(Long l) {
        this.f52052C = m41765b(l);
        return this;
    }

    public HttpHeaders setAuthenticate(String str) {
        this.f52051B = m41765b(str);
        return this;
    }

    public HttpHeaders setAuthorization(String str) {
        return setAuthorization(m41765b(str));
    }

    public HttpHeaders setBasicAuthentication(String str, String str2) {
        String encodeBase64String = Base64.encodeBase64String(StringUtils.getBytesUtf8(((String) Preconditions.checkNotNull(str)) + ":" + ((String) Preconditions.checkNotNull(str2))));
        return setAuthorization("Basic " + encodeBase64String);
    }

    public HttpHeaders setCacheControl(String str) {
        this.f52056f = m41765b(str);
        return this;
    }

    public HttpHeaders setContentEncoding(String str) {
        this.f52057g = m41765b(str);
        return this;
    }

    public HttpHeaders setContentLength(Long l) {
        this.f52058h = m41765b(l);
        return this;
    }

    public HttpHeaders setContentMD5(String str) {
        this.f52059i = m41765b(str);
        return this;
    }

    public HttpHeaders setContentRange(String str) {
        this.f52060j = m41765b(str);
        return this;
    }

    public HttpHeaders setContentType(String str) {
        this.f52061k = m41765b(str);
        return this;
    }

    public HttpHeaders setCookie(String str) {
        this.f52062l = m41765b(str);
        return this;
    }

    public HttpHeaders setDate(String str) {
        this.f52063m = m41765b(str);
        return this;
    }

    public HttpHeaders setETag(String str) {
        this.f52064n = m41765b(str);
        return this;
    }

    public HttpHeaders setExpires(String str) {
        this.f52065o = m41765b(str);
        return this;
    }

    public HttpHeaders setIfMatch(String str) {
        this.f52067q = m41765b(str);
        return this;
    }

    public HttpHeaders setIfModifiedSince(String str) {
        this.f52066p = m41765b(str);
        return this;
    }

    public HttpHeaders setIfNoneMatch(String str) {
        this.f52068r = m41765b(str);
        return this;
    }

    public HttpHeaders setIfRange(String str) {
        this.f52070t = m41765b(str);
        return this;
    }

    public HttpHeaders setIfUnmodifiedSince(String str) {
        this.f52069s = m41765b(str);
        return this;
    }

    public HttpHeaders setLastModified(String str) {
        this.f52071u = m41765b(str);
        return this;
    }

    public HttpHeaders setLocation(String str) {
        this.f52072v = m41765b(str);
        return this;
    }

    public HttpHeaders setMimeVersion(String str) {
        this.f52073w = m41765b(str);
        return this;
    }

    public HttpHeaders setRange(String str) {
        this.f52074x = m41765b(str);
        return this;
    }

    public HttpHeaders setRetryAfter(String str) {
        this.f52075y = m41765b(str);
        return this;
    }

    public HttpHeaders setUserAgent(String str) {
        this.f52076z = m41765b(str);
        return this;
    }

    @Override // com.google.api.client.util.GenericData
    public HttpHeaders set(String str, Object obj) {
        return (HttpHeaders) super.set(str, obj);
    }

    public HttpHeaders setAuthorization(List<String> list) {
        this.f52055e = list;
        return this;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public HttpHeaders clone() {
        return (HttpHeaders) super.clone();
    }
}
