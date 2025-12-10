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
    public static HashMap f47479f;

    /* renamed from: k */
    public static Object f47484k;

    /* renamed from: l */
    public static boolean f47485l;

    /* renamed from: a */
    public static final Uri f47474a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f47475b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f47476c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f47477d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f47478e = new AtomicBoolean();

    /* renamed from: g */
    public static final HashMap f47480g = new HashMap();

    /* renamed from: h */
    public static final HashMap f47481h = new HashMap();

    /* renamed from: i */
    public static final HashMap f47482i = new HashMap();

    /* renamed from: j */
    public static final HashMap f47483j = new HashMap();

    /* renamed from: m */
    public static String[] f47486m = new String[0];

    /* renamed from: a */
    public static Object m46649a(HashMap hashMap, String str, Object obj) {
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
    public static Map m46648b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f47475b, null, null, strArr, null);
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
    public static void m46647c(ContentResolver contentResolver) {
        if (f47479f == null) {
            f47478e.set(false);
            f47479f = new HashMap();
            f47484k = new Object();
            f47485l = false;
            contentResolver.registerContentObserver(f47474a, true, new Zq2(null));
        } else if (f47478e.getAndSet(false)) {
            f47479f.clear();
            f47480g.clear();
            f47481h.clear();
            f47482i.clear();
            f47483j.clear();
            f47484k = new Object();
            f47485l = false;
        }
    }

    /* renamed from: d */
    public static void m46646d(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            try {
                if (obj == f47484k) {
                    f47479f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static Object m46645e(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            m46647c(contentResolver);
            obj = f47484k;
        }
        return obj;
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzf.class) {
            try {
                m46647c(contentResolver);
                Object obj = f47484k;
                if (f47479f.containsKey(str)) {
                    String str3 = (String) f47479f.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : f47486m) {
                    if (str.startsWith(str4)) {
                        if (!f47485l || f47479f.isEmpty()) {
                            f47479f.putAll(m46648b(contentResolver, f47486m));
                            f47485l = true;
                            if (f47479f.containsKey(str)) {
                                String str5 = (String) f47479f.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(f47474a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(1);
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            m46646d(obj, str, string);
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
                m46646d(obj, str, null);
                if (query != null) {
                    query.close();
                }
                return null;
            } finally {
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object m46645e = m46645e(contentResolver);
        HashMap hashMap = f47480g;
        Boolean bool = (Boolean) m46649a(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (f47476c.matcher(zza).matches()) {
                bool = Boolean.TRUE;
                z = true;
            } else if (f47477d.matcher(zza).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + zza + "\") as boolean");
            }
        }
        synchronized (zzf.class) {
            try {
                if (m46645e == f47484k) {
                    hashMap.put(str, bool);
                    f47479f.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }
}