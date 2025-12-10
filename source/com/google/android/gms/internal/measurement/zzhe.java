package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhe implements InterfaceC22011ru2 {

    /* renamed from: h */
    public static final Map f46286h = new ArrayMap();
    public static final String[] zza = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f46287a;

    /* renamed from: b */
    public final Uri f46288b;

    /* renamed from: c */
    public final Runnable f46289c;

    /* renamed from: d */
    public final ContentObserver f46290d;

    /* renamed from: e */
    public final Object f46291e;

    /* renamed from: f */
    public volatile Map f46292f;

    /* renamed from: g */
    public final List f46293g;

    public zzhe(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        Ht2 ht2 = new Ht2(this, null);
        this.f46290d = ht2;
        this.f46291e = new Object();
        this.f46293g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f46287a = contentResolver;
        this.f46288b = uri;
        this.f46289c = runnable;
        contentResolver.registerContentObserver(uri, false, ht2);
    }

    /* renamed from: b */
    public static synchronized void m47165b() {
        synchronized (zzhe.class) {
            try {
                for (zzhe zzheVar : f46286h.values()) {
                    zzheVar.f46287a.unregisterContentObserver(zzheVar.f46290d);
                }
                f46286h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static zzhe zza(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzhe zzheVar;
        synchronized (zzhe.class) {
            Map map = f46286h;
            zzheVar = (zzhe) map.get(uri);
            if (zzheVar == null) {
                try {
                    zzhe zzheVar2 = new zzhe(contentResolver, uri, runnable);
                    try {
                        map.put(uri, zzheVar2);
                    } catch (SecurityException unused) {
                    }
                    zzheVar = zzheVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzheVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Map m47166a() {
        Map hashMap;
        Cursor query = this.f46287a.query(this.f46288b, zza, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    @Override // p000.InterfaceC22011ru2
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzc().get(str);
    }

    public final Map zzc() {
        Map map;
        Map map2 = this.f46292f;
        if (map2 == null) {
            synchronized (this.f46291e) {
                try {
                    map2 = this.f46292f;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            map = (Map) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhc
                                {
                                    zzhe.this = this;
                                }

                                @Override // com.google.android.gms.internal.measurement.zzhi
                                public final Object zza() {
                                    return zzhe.this.m47166a();
                                }
                            });
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th2;
                        }
                        this.f46292f = map;
                        map2 = map;
                    }
                } finally {
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    public final void zzf() {
        synchronized (this.f46291e) {
            this.f46292f = null;
            this.f46289c.run();
        }
        synchronized (this) {
            try {
                for (zzhf zzhfVar : this.f46293g) {
                    zzhfVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
