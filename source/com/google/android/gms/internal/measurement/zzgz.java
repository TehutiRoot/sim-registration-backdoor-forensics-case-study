package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzgz {

    /* renamed from: b */
    public static HashMap f46276b;

    /* renamed from: g */
    public static Object f46281g;

    /* renamed from: h */
    public static boolean f46282h;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: a */
    public static final AtomicBoolean f46275a = new AtomicBoolean();

    /* renamed from: c */
    public static final HashMap f46277c = new HashMap();

    /* renamed from: d */
    public static final HashMap f46278d = new HashMap();

    /* renamed from: e */
    public static final HashMap f46279e = new HashMap();

    /* renamed from: f */
    public static final HashMap f46280f = new HashMap();

    /* renamed from: i */
    public static final String[] f46283i = new String[0];

    /* renamed from: b */
    public static void m47167b(Object obj, String str, String str2) {
        synchronized (zzgz.class) {
            try {
                if (obj == f46281g) {
                    f46276b.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzgz.class) {
            try {
                String str3 = null;
                if (f46276b == null) {
                    f46275a.set(false);
                    f46276b = new HashMap();
                    f46281g = new Object();
                    f46282h = false;
                    contentResolver.registerContentObserver(zza, true, new Os2(null));
                } else if (f46275a.getAndSet(false)) {
                    f46276b.clear();
                    f46277c.clear();
                    f46278d.clear();
                    f46279e.clear();
                    f46280f.clear();
                    f46281g = new Object();
                    f46282h = false;
                }
                Object obj = f46281g;
                if (f46276b.containsKey(str)) {
                    String str4 = (String) f46276b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f46283i.length;
                Cursor query = contentResolver.query(zza, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        m47167b(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m47167b(obj, str, string);
                    if (string != null) {
                        str3 = string;
                    }
                    return str3;
                } finally {
                    query.close();
                }
            } finally {
            }
        }
    }
}
