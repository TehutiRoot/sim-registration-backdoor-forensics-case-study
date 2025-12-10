package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class zzf {

    /* renamed from: f */
    public static HashMap f47467f;

    /* renamed from: k */
    public static Object f47472k;

    /* renamed from: l */
    public static boolean f47473l;

    /* renamed from: a */
    public static final Uri f47462a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f47463b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f47464c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f47465d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f47466e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap f47468g = new HashMap();

    /* renamed from: h */
    public static final HashMap f47469h = new HashMap();

    /* renamed from: i */
    public static final HashMap f47470i = new HashMap();

    /* renamed from: j */
    public static final HashMap f47471j = new HashMap();

    /* renamed from: m */
    public static String[] f47474m = new String[0];

    /* renamed from: a */
    public static Object m46658a(HashMap hashMap, String str, Object obj) {
        synchronized (zzf.class) {
            try {
                if (hashMap.containsKey(str)) {
                    Object obj2 = hashMap.get(str);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    return obj;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static Map m46657b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f47463b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: c */
    public static void m46656c(ContentResolver contentResolver) {
        if (f47467f == null) {
            f47466e.set(false);
            f47467f = new HashMap();
            f47472k = new Object();
            f47473l = false;
            contentResolver.registerContentObserver(f47462a, true, new C19419cq2(null));
        } else if (f47466e.getAndSet(false)) {
            f47467f.clear();
            f47468g.clear();
            f47469h.clear();
            f47470i.clear();
            f47471j.clear();
            f47472k = new Object();
            f47473l = false;
        }
    }

    /* renamed from: d */
    public static void m46655d(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            try {
                if (obj == f47472k) {
                    f47467f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static Object m46654e(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            m46656c(contentResolver);
            obj = f47472k;
        }
        return obj;
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzf.class) {
            try {
                m46656c(contentResolver);
                Object obj = f47472k;
                if (f47467f.containsKey(str)) {
                    String str3 = (String) f47467f.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f47474m) {
                    if (str.startsWith(str4)) {
                        if (!f47473l || f47467f.isEmpty()) {
                            f47467f.putAll(m46657b(contentResolver, f47474m));
                            f47473l = true;
                            if (f47467f.containsKey(str)) {
                                String str5 = (String) f47467f.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f47462a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            m46655d(obj, str, string);
                            String str6 = string != null ? string : null;
                            query.close();
                            return str6;
                        }
                    } finally {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                m46655d(obj, str, null);
                if (query != null) {
                    query.close();
                }
                return null;
            } finally {
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object m46654e = m46654e(contentResolver);
        HashMap hashMap = f47468g;
        Boolean bool = (Boolean) m46658a(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (f47464c.matcher(zza).matches()) {
                bool = Boolean.TRUE;
                z = true;
            } else if (f47465d.matcher(zza).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + zza + "\") as boolean");
            }
        }
        synchronized (zzf.class) {
            try {
                if (m46654e == f47472k) {
                    hashMap.put(str, bool);
                    f47467f.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }
}
