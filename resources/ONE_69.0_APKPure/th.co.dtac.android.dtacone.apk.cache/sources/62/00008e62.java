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
    public static HashMap f45665d;

    /* renamed from: i */
    public static Object f45670i;

    /* renamed from: j */
    public static boolean f45671j;

    /* renamed from: a */
    public static final Uri f45662a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f45663b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzcr = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzcs = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: c */
    public static final AtomicBoolean f45664c = new AtomicBoolean();

    /* renamed from: e */
    public static final HashMap f45666e = new HashMap();

    /* renamed from: f */
    public static final HashMap f45667f = new HashMap();

    /* renamed from: g */
    public static final HashMap f45668g = new HashMap();

    /* renamed from: h */
    public static final HashMap f45669h = new HashMap();

    /* renamed from: k */
    public static String[] f45672k = new String[0];

    /* renamed from: a */
    public static Object m48084a(HashMap hashMap, String str, Object obj) {
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
    public static Map m48083b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f45663b, null, null, strArr, null);
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
    public static void m48082c(ContentResolver contentResolver) {
        if (f45665d == null) {
            f45664c.set(false);
            f45665d = new HashMap();
            f45670i = new Object();
            f45671j = false;
            contentResolver.registerContentObserver(f45662a, true, new C22678vM2(null));
        } else if (f45664c.getAndSet(false)) {
            f45665d.clear();
            f45666e.clear();
            f45667f.clear();
            f45668g.clear();
            f45669h.clear();
            f45670i = new Object();
            f45671j = false;
        }
    }

    /* renamed from: d */
    public static void m48081d(Object obj, String str, String str2) {
        synchronized (zzy.class) {
            try {
                if (obj == f45670i) {
                    f45665d.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static void m48080e(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (zzy.class) {
            try {
                if (obj == f45670i) {
                    hashMap.put(str, obj2);
                    f45665d.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static Object m48079f(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzy.class) {
            m48082c(contentResolver);
            obj = f45670i;
        }
        return obj;
    }

    public static long getLong(ContentResolver contentResolver, String str, long j) {
        Object m48079f = m48079f(contentResolver);
        long j2 = 0;
        Long l = (Long) m48084a(f45668g, str, 0L);
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
        m48080e(m48079f, f45668g, str, l);
        return j2;
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzy.class) {
            try {
                m48082c(contentResolver);
                Object obj = f45670i;
                if (f45665d.containsKey(str)) {
                    String str3 = (String) f45665d.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f45672k) {
                    if (str.startsWith(str4)) {
                        if (!f45671j || f45665d.isEmpty()) {
                            f45665d.putAll(m48083b(contentResolver, f45672k));
                            f45671j = true;
                            if (f45665d.containsKey(str)) {
                                String str5 = (String) f45665d.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f45662a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            m48081d(obj, str, string);
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
                m48081d(obj, str, null);
                if (query != null) {
                    query.close();
                }
                return null;
            } finally {
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object m48079f = m48079f(contentResolver);
        HashMap hashMap = f45666e;
        Boolean bool = (Boolean) m48084a(hashMap, str, Boolean.valueOf(z));
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
        m48080e(m48079f, hashMap, str, bool);
        return z;
    }
}