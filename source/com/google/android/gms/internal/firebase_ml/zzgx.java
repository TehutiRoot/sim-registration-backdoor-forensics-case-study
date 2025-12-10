package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzjf;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzgx extends zzjf {
    @zzjg("Accept")
    private List<String> accept;
    @zzjg("Accept-Encoding")
    private List<String> acceptEncoding;
    @zzjg("Age")
    private List<Long> age;
    @zzjg("WWW-Authenticate")
    private List<String> authenticate;
    @zzjg("Authorization")
    private List<String> authorization;
    @zzjg("Cache-Control")
    private List<String> cacheControl;
    @zzjg("Content-Encoding")
    private List<String> contentEncoding;
    @zzjg("Content-Length")
    private List<Long> contentLength;
    @zzjg("Content-MD5")
    private List<String> contentMD5;
    @zzjg("Content-Range")
    private List<String> contentRange;
    @zzjg("Content-Type")
    private List<String> contentType;
    @zzjg("Cookie")
    private List<String> cookie;
    @zzjg("Date")
    private List<String> date;
    @zzjg("ETag")
    private List<String> etag;
    @zzjg("Expires")
    private List<String> expires;
    @zzjg("If-Match")
    private List<String> ifMatch;
    @zzjg("If-Modified-Since")
    private List<String> ifModifiedSince;
    @zzjg("If-None-Match")
    private List<String> ifNoneMatch;
    @zzjg("If-Range")
    private List<String> ifRange;
    @zzjg("If-Unmodified-Since")
    private List<String> ifUnmodifiedSince;
    @zzjg("Last-Modified")
    private List<String> lastModified;
    @zzjg("Location")
    private List<String> location;
    @zzjg("MIME-Version")
    private List<String> mimeVersion;
    @zzjg("Range")
    private List<String> range;
    @zzjg("Retry-After")
    private List<String> retryAfter;
    @zzjg("User-Agent")
    private List<String> userAgent;

    public zzgx() {
        super(EnumSet.of(zzjf.zzb.IGNORE_CASE));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    /* renamed from: a */
    public static Object m47917a(Type type, List list, String str) {
        return zzix.zza(zzix.zza((List<Type>) list, type), str);
    }

    /* renamed from: b */
    public static Object m47916b(List list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: c */
    public static List m47915c(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: e */
    public static void m47914e(zzgx zzgxVar, StringBuilder sb, StringBuilder sb2, Logger logger, zzhk zzhkVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : zzgxVar.entrySet()) {
            String key = entry.getKey();
            Object[] objArr = {key};
            if (hashSet.add(key)) {
                Object value = entry.getValue();
                if (value != null) {
                    zzjd zzao = zzgxVar.zzik().zzao(key);
                    if (zzao != null) {
                        key = zzao.getName();
                    }
                    String str = key;
                    Class<?> cls = value.getClass();
                    if (!(value instanceof Iterable) && !cls.isArray()) {
                        m47913f(logger, sb, sb2, zzhkVar, str, value, null);
                    } else {
                        for (Object obj : zzjs.zzi(value)) {
                            m47913f(logger, sb, sb2, zzhkVar, str, obj, null);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(zzmt.zzb("multiple headers of the same name (headers are case insensitive): %s", objArr));
            }
        }
    }

    /* renamed from: f */
    public static void m47913f(Logger logger, StringBuilder sb, StringBuilder sb2, zzhk zzhkVar, String str, Object obj, Writer writer) {
        String obj2;
        String str2;
        if (obj != null && !zzix.isNull(obj)) {
            if (obj instanceof Enum) {
                obj2 = zzjd.zza((Enum) obj).getName();
            } else {
                obj2 = obj.toString();
            }
            if ((!"Authorization".equalsIgnoreCase(str) && !"Cookie".equalsIgnoreCase(str)) || (logger != null && logger.isLoggable(Level.ALL))) {
                str2 = obj2;
            } else {
                str2 = "<Not Logged>";
            }
            if (sb != null) {
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(zzjt.zzajh);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sb2.append(OperatorName.SHOW_TEXT_LINE);
            }
            if (zzhkVar != null) {
                zzhkVar.addHeader(str, obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf, java.util.AbstractMap
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (zzgx) super.clone();
    }

    public final String getContentType() {
        return (String) m47916b(this.contentType);
    }

    public final String getLocation() {
        return (String) m47916b(this.location);
    }

    public final String getUserAgent() {
        return (String) m47916b(this.userAgent);
    }

    public final void zza(zzhj zzhjVar, StringBuilder sb) throws IOException {
        Type zze;
        clear();
        C20976lt2 c20976lt2 = new C20976lt2(this, sb);
        int zzgq = zzhjVar.zzgq();
        for (int i = 0; i < zzgq; i++) {
            String zzag = zzhjVar.zzag(i);
            String zzah = zzhjVar.zzah(i);
            List list = c20976lt2.f71756d;
            zziv zzivVar = c20976lt2.f71755c;
            zzis zzisVar = c20976lt2.f71753a;
            StringBuilder sb2 = c20976lt2.f71754b;
            if (sb2 != null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzag).length() + 2 + String.valueOf(zzah).length());
                sb3.append(zzag);
                sb3.append(": ");
                sb3.append(zzah);
                sb2.append(sb3.toString());
                sb2.append(zzjt.zzajh);
            }
            zzjd zzao = zzivVar.zzao(zzag);
            if (zzao != null) {
                Type zza = zzix.zza((List<Type>) list, zzao.getGenericType());
                if (zzjs.zzc(zza)) {
                    Class<?> zzb = zzjs.zzb(list, zzjs.zzd(zza));
                    zzisVar.zza(zzao.zzig(), zzb, m47917a(zzb, list, zzah));
                } else if (zzjs.zza(zzjs.zzb(list, zza), Iterable.class)) {
                    Collection<Object> collection = (Collection) zzao.zzh(this);
                    if (collection == null) {
                        collection = zzix.zzb(zza);
                        zzao.zzb(this, collection);
                    }
                    if (zza == Object.class) {
                        zze = null;
                    } else {
                        zze = zzjs.zze(zza);
                    }
                    collection.add(m47917a(zze, list, zzah));
                } else {
                    zzao.zzb(this, m47917a(zza, list, zzah));
                }
            } else {
                ArrayList arrayList = (ArrayList) get(zzag);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    zzgx zzgxVar = (zzgx) zzb(zzag, arrayList);
                }
                arrayList.add(zzah);
            }
        }
        c20976lt2.f71753a.zzic();
    }

    public final zzgx zzaa(String str) {
        this.ifNoneMatch = m47915c(null);
        return this;
    }

    public final zzgx zzab(String str) {
        this.ifUnmodifiedSince = m47915c(null);
        return this;
    }

    public final zzgx zzac(String str) {
        this.ifRange = m47915c(null);
        return this;
    }

    public final zzgx zzad(String str) {
        this.userAgent = m47915c(str);
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzb(String str, Object obj) {
        return (zzgx) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzfj() {
        return (zzgx) clone();
    }

    public final zzgx zzx(String str) {
        this.authorization = m47915c(null);
        return this;
    }

    public final zzgx zzy(String str) {
        this.ifModifiedSince = m47915c(null);
        return this;
    }

    public final zzgx zzz(String str) {
        this.ifMatch = m47915c(null);
        return this;
    }
}
