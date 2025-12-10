package com.google.android.gms.internal.clearcut;

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
public class zzy {

    /* renamed from: d */
    public static HashMap f45653d;

    /* renamed from: i */
    public static Object f45658i;

    /* renamed from: j */
    public static boolean f45659j;

    /* renamed from: a */
    public static final Uri f45650a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f45651b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzcr = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzcs = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: c */
    public static final AtomicBoolean f45652c = new AtomicBoolean();

    /* renamed from: e */
    public static final HashMap f45654e = new HashMap();

    /* renamed from: f */
    public static final HashMap f45655f = new HashMap();

    /* renamed from: g */
    public static final HashMap f45656g = new HashMap();

    /* renamed from: h */
    public static final HashMap f45657h = new HashMap();

    /* renamed from: k */
    public static String[] f45660k = new String[0];

    /* renamed from: a */
    public static Object m48087a(HashMap hashMap, String str, Object obj) {
        synchronized (zzy.class) {
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
    public static Map m48086b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f45651b, null, null, strArr, null);
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
    public static void m48085c(ContentResolver contentResolver) {
        if (f45653d == null) {
            f45652c.set(false);
            f45653d = new HashMap();
            f45658i = new Object();
            f45659j = false;
            contentResolver.registerContentObserver(f45650a, true, new C23124yL2(null));
        } else if (f45652c.getAndSet(false)) {
            f45653d.clear();
            f45654e.clear();
            f45655f.clear();
            f45656g.clear();
            f45657h.clear();
            f45658i = new Object();
            f45659j = false;
        }
    }

    /* renamed from: d */
    public static void m48084d(Object obj, String str, String str2) {
        synchronized (zzy.class) {
            try {
                if (obj == f45658i) {
                    f45653d.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static void m48083e(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (zzy.class) {
            try {
                if (obj == f45658i) {
                    hashMap.put(str, obj2);
                    f45653d.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static Object m48082f(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzy.class) {
            m48085c(contentResolver);
            obj = f45658i;
        }
        return obj;
    }

    public static long getLong(ContentResolver contentResolver, String str, long j) {
        Object m48082f = m48082f(contentResolver);
        long j2 = 0;
        Long l = (Long) m48087a(f45656g, str, 0L);
        if (l != null) {
            return l.longValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null) {
            try {
                long parseLong = Long.parseLong(zza);
                l = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m48083e(m48082f, f45656g, str, l);
        return j2;
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzy.class) {
            try {
                m48085c(contentResolver);
                Object obj = f45658i;
                if (f45653d.containsKey(str)) {
                    String str3 = (String) f45653d.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f45660k) {
                    if (str.startsWith(str4)) {
                        if (!f45659j || f45653d.isEmpty()) {
                            f45653d.putAll(m48086b(contentResolver, f45660k));
                            f45659j = true;
                            if (f45653d.containsKey(str)) {
                                String str5 = (String) f45653d.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f45650a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            m48084d(obj, str, string);
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
                m48084d(obj, str, null);
                if (query != null) {
                    query.close();
                }
                return null;
            } finally {
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object m48082f = m48082f(contentResolver);
        HashMap hashMap = f45654e;
        Boolean bool = (Boolean) m48087a(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (zzcr.matcher(zza).matches()) {
                bool = Boolean.TRUE;
                z = true;
            } else if (zzcs.matcher(zza).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + zza + "\") as boolean");
            }
        }
        m48083e(m48082f, hashMap, str, bool);
        return z;
    }
}
