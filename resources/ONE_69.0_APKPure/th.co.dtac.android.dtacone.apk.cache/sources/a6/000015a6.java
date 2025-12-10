package p000;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Wh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18735Wh0 {

    /* renamed from: a */
    public final Map f7350a = new HashMap();

    /* renamed from: b */
    public final int f7351b;

    /* renamed from: c */
    public final int f7352c;

    public C18735Wh0(int i, int i2) {
        this.f7351b = i;
        this.f7352c = i2;
    }

    /* renamed from: c */
    public static String m65679c(String str, int i) {
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
    public synchronized Map m65681a() {
        return Collections.unmodifiableMap(new HashMap(this.f7350a));
    }

    /* renamed from: b */
    public final String m65680b(String str) {
        if (str != null) {
            return m65679c(str, this.f7352c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean m65678d(String str, String str2) {
        String m65680b = m65680b(str);
        if (this.f7350a.size() >= this.f7351b && !this.f7350a.containsKey(m65680b)) {
            Logger logger = Logger.getLogger();
            logger.m39124w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f7351b);
            return false;
        }
        String m65679c = m65679c(str2, this.f7352c);
        if (CommonUtils.nullSafeEquals((String) this.f7350a.get(m65680b), m65679c)) {
            return false;
        }
        Map map = this.f7350a;
        if (str2 == null) {
            m65679c = "";
        }
        map.put(m65680b, m65679c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m65677e(Map map) {
        String m65679c;
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String m65680b = m65680b((String) entry.getKey());
                if (this.f7350a.size() >= this.f7351b && !this.f7350a.containsKey(m65680b)) {
                    i++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f7350a;
                if (str == null) {
                    m65679c = "";
                } else {
                    m65679c = m65679c(str, this.f7352c);
                }
                map2.put(m65680b, m65679c);
            }
            if (i > 0) {
                Logger logger = Logger.getLogger();
                logger.m39124w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f7351b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}