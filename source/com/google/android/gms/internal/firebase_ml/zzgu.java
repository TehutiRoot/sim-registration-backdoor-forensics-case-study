package com.google.android.gms.internal.firebase_ml;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class zzgu extends zzjf {

    /* renamed from: i */
    public static final zzjz f45785i = new zzjy("=&-_.!~*'()@:$,;/?:", false);

    /* renamed from: c */
    public String f45786c;

    /* renamed from: d */
    public String f45787d;

    /* renamed from: e */
    public String f45788e;

    /* renamed from: f */
    public int f45789f;

    /* renamed from: g */
    public List f45790g;

    /* renamed from: h */
    public String f45791h;

    public zzgu() {
        this.f45789f = -1;
    }

    /* renamed from: a */
    public static void m47921a(Set set, StringBuilder sb) {
        Iterator it = set.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value != null) {
                String zzav = zzjw.zzav((String) entry.getKey());
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        z = m47920b(z, sb, zzav, obj);
                    }
                } else {
                    z = m47920b(z, sb, zzav, value);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m47920b(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            sb.append('?');
            z = false;
        } else {
            sb.append(Typography.amp);
        }
        sb.append(str);
        String zzav = zzjw.zzav(obj.toString());
        if (zzav.length() != 0) {
            sb.append('=');
            sb.append(zzav);
        }
        return z;
    }

    /* renamed from: c */
    public static List m47919c(String str) {
        boolean z;
        String substring;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = new ArrayList();
            boolean z2 = true;
            int i = 0;
            while (z2) {
                int indexOf = str.indexOf(47, i);
                if (indexOf != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    substring = str.substring(i, indexOf);
                } else {
                    substring = str.substring(i);
                }
                arrayList.add(zzjw.zzar(substring));
                i = indexOf + 1;
                z2 = z;
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: e */
    public static URL m47918e(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf, java.util.AbstractMap
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgu zzguVar = (zzgu) super.clone();
        if (this.f45790g != null) {
            zzguVar.f45790g = new ArrayList(this.f45790g);
        }
        return zzguVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof zzgu)) {
            return zzfz().equals(((zzgu) obj).zzfz());
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return zzfz().hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return zzfz();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzb(String str, Object obj) {
        return (zzgu) super.zzb(str, obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    public final /* synthetic */ zzjf zzfj() {
        return (zzgu) clone();
    }

    public final String zzfz() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) zzml.checkNotNull(this.f45786c));
        sb.append("://");
        String str = this.f45788e;
        if (str != null) {
            sb.append(zzjw.zzau(str));
            sb.append('@');
        }
        sb.append((String) zzml.checkNotNull(this.f45787d));
        int i = this.f45789f;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List list = this.f45790g;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = (String) this.f45790g.get(i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (str2.length() != 0) {
                    sb2.append(zzjw.zzas(str2));
                }
            }
        }
        m47921a(entrySet(), sb2);
        String str3 = this.f45791h;
        if (str3 != null) {
            sb2.append('#');
            sb2.append(f45785i.zzaw(str3));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public final URL zzt(String str) {
        try {
            return new URL(m47918e(zzfz()), str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void zzu(String str) {
        this.f45790g = m47919c(null);
    }

    public zzgu(String str) {
        this(m47918e(str));
    }

    public zzgu(URL url) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    public zzgu(String str, String str2, int i, String str3, String str4, String str5, String str6) {
        this.f45789f = -1;
        this.f45786c = str.toLowerCase(Locale.US);
        this.f45787d = str2;
        this.f45789f = i;
        this.f45790g = m47919c(str3);
        this.f45791h = str4 != null ? zzjw.zzar(str4) : null;
        if (str5 != null) {
            zzhn.zze(str5, this);
        }
        this.f45788e = str6 != null ? zzjw.zzar(str6) : null;
    }
}
