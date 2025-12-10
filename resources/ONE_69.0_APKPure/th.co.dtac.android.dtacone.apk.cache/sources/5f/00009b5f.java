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
    public static HashMap f47556d;

    /* renamed from: i */
    public static Object f47561i;

    /* renamed from: j */
    public static boolean f47562j;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: a */
    public static final Uri f47553a = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzb = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: b */
    public static final Pattern f47554b = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: c */
    public static final AtomicBoolean f47555c = new AtomicBoolean();

    /* renamed from: e */
    public static final HashMap f47557e = new HashMap();

    /* renamed from: f */
    public static final HashMap f47558f = new HashMap();

    /* renamed from: g */
    public static final HashMap f47559g = new HashMap();

    /* renamed from: h */
    public static final HashMap f47560h = new HashMap();

    /* renamed from: k */
    public static String[] f47563k = new String[0];

    /* renamed from: a */
    public static Map m46557a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f47553a, null, null, strArr, null);
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
    public static void m46555c(Object obj, String str, String str2) {
        synchronized (zzaq.class) {
            try {
                if (obj == f47561i) {
                    f47556d.put(str, str2);
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
                if (f47556d == null) {
                    f47555c.set(false);
                    f47556d = new HashMap();
                    f47561i = new Object();
                    f47562j = false;
                    contentResolver.registerContentObserver(zza, true, new C23408zd2(null));
                } else if (f47555c.getAndSet(false)) {
                    f47556d.clear();
                    f47557e.clear();
                    f47558f.clear();
                    f47559g.clear();
                    f47560h.clear();
                    f47561i = new Object();
                    f47562j = false;
                }
                Object obj = f47561i;
                if (f47556d.containsKey(str)) {
                    String str4 = (String) f47556d.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                for (String str5 : f47563k) {
                    if (str.startsWith(str5)) {
                        if (!f47562j || f47556d.isEmpty()) {
                            f47556d.putAll(m46557a(contentResolver, f47563k));
                            f47562j = true;
                            if (f47556d.containsKey(str)) {
                                String str6 = (String) f47556d.get(str);
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
                        m46555c(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m46555c(obj, str, string);
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