package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class zzaq {

    /* renamed from: d */
    public static HashMap f47544d;

    /* renamed from: i */
    public static Object f47549i;

    /* renamed from: j */
    public static boolean f47550j;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: a */
    public static final Uri f47541a = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: b */
    public static final Pattern f47542b = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: c */
    public static final AtomicBoolean f47543c = new AtomicBoolean();

    /* renamed from: e */
    public static final HashMap f47545e = new HashMap();

    /* renamed from: f */
    public static final HashMap f47546f = new HashMap();

    /* renamed from: g */
    public static final HashMap f47547g = new HashMap();

    /* renamed from: h */
    public static final HashMap f47548h = new HashMap();

    /* renamed from: k */
    public static String[] f47551k = new String[0];

    /* renamed from: a */
    public static Map m46571a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f47541a, null, null, strArr, null);
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
    public static void m46569c(Object obj, String str, String str2) {
        synchronized (zzaq.class) {
            try {
                if (obj == f47549i) {
                    f47544d.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzaq.class) {
            try {
                String str3 = null;
                if (f47544d == null) {
                    f47543c.set(false);
                    f47544d = new HashMap();
                    f47549i = new Object();
                    f47550j = false;
                    contentResolver.registerContentObserver(zza, true, new C17397Cc2(null));
                } else if (f47543c.getAndSet(false)) {
                    f47544d.clear();
                    f47545e.clear();
                    f47546f.clear();
                    f47547g.clear();
                    f47548h.clear();
                    f47549i = new Object();
                    f47550j = false;
                }
                Object obj = f47549i;
                if (f47544d.containsKey(str)) {
                    String str4 = (String) f47544d.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                for (String str5 : f47551k) {
                    if (str.startsWith(str5)) {
                        if (!f47550j || f47544d.isEmpty()) {
                            f47544d.putAll(m46571a(contentResolver, f47551k));
                            f47550j = true;
                            if (f47544d.containsKey(str)) {
                                String str6 = (String) f47544d.get(str);
                                if (str6 != null) {
                                    str3 = str6;
                                }
                                return str3;
                            }
                        }
                        return null;
                    }
                }
                Cursor query = contentResolver.query(zza, null, null, new String[]{str}, null);
                if (query == null) {
                    if (query != null) {
                    }
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        m46569c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m46569c(obj, str, string);
                    if (string != null) {
                        str3 = string;
                    }
                    return str3;
                } finally {
                    query.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
