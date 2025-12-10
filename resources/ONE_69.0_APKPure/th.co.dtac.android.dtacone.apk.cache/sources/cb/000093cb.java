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
    public static HashMap f46288b;

    /* renamed from: g */
    public static Object f46293g;

    /* renamed from: h */
    public static boolean f46294h;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: a */
    public static final AtomicBoolean f46287a = new AtomicBoolean();

    /* renamed from: c */
    public static final HashMap f46289c = new HashMap();

    /* renamed from: d */
    public static final HashMap f46290d = new HashMap();

    /* renamed from: e */
    public static final HashMap f46291e = new HashMap();

    /* renamed from: f */
    public static final HashMap f46292f = new HashMap();

    /* renamed from: i */
    public static final String[] f46295i = new String[0];

    /* renamed from: b */
    public static void m47176b(Object obj, String str, String str2) {
        synchronized (zzgz.class) {
            try {
                if (obj == f46293g) {
                    f46288b.put(str, str2);
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
                if (f46288b == null) {
                    f46287a.set(false);
                    f46288b = new HashMap();
                    f46293g = new Object();
                    f46294h = false;
                    contentResolver.registerContentObserver(zza, true, new Lt2(null));
                } else if (f46287a.getAndSet(false)) {
                    f46288b.clear();
                    f46289c.clear();
                    f46290d.clear();
                    f46291e.clear();
                    f46292f.clear();
                    f46293g = new Object();
                    f46294h = false;
                }
                Object obj = f46293g;
                if (f46288b.containsKey(str)) {
                    String str4 = (String) f46288b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                int length = f46295i.length;
                Cursor query = contentResolver.query(zza, null, null, new String[]{str}, null);
                if (query == null) {
                    return null;
                }
                try {
                    if (!query.moveToFirst()) {
                        m47176b(obj, str, null);
                        return null;
                    }
                    String string = query.getString(1);
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    m47176b(obj, str, string);
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