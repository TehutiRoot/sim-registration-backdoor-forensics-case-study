package p000;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Qh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18306Qh0 {

    /* renamed from: a */
    public final Map f5128a = new HashMap();

    /* renamed from: b */
    public final int f5129b;

    /* renamed from: c */
    public final int f5130c;

    public C18306Qh0(int i, int i2) {
        this.f5129b = i;
        this.f5130c = i2;
    }

    /* renamed from: c */
    public static String m66539c(String str, int i) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i) {
                return trim.substring(0, i);
            }
            return trim;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized Map m66541a() {
        return Collections.unmodifiableMap(new HashMap(this.f5128a));
    }

    /* renamed from: b */
    public final String m66540b(String str) {
        if (str != null) {
            return m66539c(str, this.f5130c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean m66538d(String str, String str2) {
        String m66540b = m66540b(str);
        if (this.f5128a.size() >= this.f5129b && !this.f5128a.containsKey(m66540b)) {
            Logger logger = Logger.getLogger();
            logger.m39132w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f5129b);
            return false;
        }
        String m66539c = m66539c(str2, this.f5130c);
        if (CommonUtils.nullSafeEquals((String) this.f5128a.get(m66540b), m66539c)) {
            return false;
        }
        Map map = this.f5128a;
        if (str2 == null) {
            m66539c = "";
        }
        map.put(m66540b, m66539c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m66537e(Map map) {
        String m66539c;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String m66540b = m66540b((String) entry.getKey());
                if (this.f5128a.size() >= this.f5129b && !this.f5128a.containsKey(m66540b)) {
                    i++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f5128a;
                if (str == null) {
                    m66539c = "";
                } else {
                    m66539c = m66539c(str, this.f5130c);
                }
                map2.put(m66540b, m66539c);
            }
            if (i > 0) {
                Logger logger = Logger.getLogger();
                logger.m39132w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f5129b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
