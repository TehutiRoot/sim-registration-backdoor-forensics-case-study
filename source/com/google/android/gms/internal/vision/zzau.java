package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.vision.zzau;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzau implements InterfaceC20068gd2 {

    /* renamed from: g */
    public static final Map f47555g = new ArrayMap();

    /* renamed from: h */
    public static final String[] f47556h = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f47557a;

    /* renamed from: b */
    public final Uri f47558b;

    /* renamed from: c */
    public final ContentObserver f47559c;

    /* renamed from: d */
    public final Object f47560d;

    /* renamed from: e */
    public volatile Map f47561e;

    /* renamed from: f */
    public final List f47562f;

    public zzau(ContentResolver contentResolver, Uri uri) {
        C18613Vc2 c18613Vc2 = new C18613Vc2(this, null);
        this.f47559c = c18613Vc2;
        this.f47560d = new Object();
        this.f47562f = new ArrayList();
        zzde.zza(contentResolver);
        zzde.zza(uri);
        this.f47557a = contentResolver;
        this.f47558b = uri;
        contentResolver.registerContentObserver(uri, false, c18613Vc2);
    }

    /* renamed from: a */
    public static synchronized void m46566a() {
        synchronized (zzau.class) {
            try {
                for (zzau zzauVar : f47555g.values()) {
                    zzauVar.f47557a.unregisterContentObserver(zzauVar.f47559c);
                }
                f47555g.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static zzau zza(ContentResolver contentResolver, Uri uri) {
        zzau zzauVar;
        synchronized (zzau.class) {
            Map map = f47555g;
            zzauVar = (zzau) map.get(uri);
            if (zzauVar == null) {
                try {
                    zzau zzauVar2 = new zzau(contentResolver, uri);
                    try {
                        map.put(uri, zzauVar2);
                    } catch (SecurityException unused) {
                    }
                    zzauVar = zzauVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzauVar;
    }

    /* renamed from: b */
    public final /* synthetic */ Map m46565b() {
        Map hashMap;
        Cursor query = this.f47557a.query(this.f47558b, f47556h, null, null, null);
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

    /* renamed from: c */
    public final Map m46564c() {
        Map map = this.f47561e;
        if (map == null) {
            synchronized (this.f47560d) {
                try {
                    map = this.f47561e;
                    if (map == null) {
                        map = m46563d();
                        this.f47561e = map;
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public final Map m46563d() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map map = (Map) zzbb.zza(new zzba(this) { // from class: bd2

                /* renamed from: a */
                public final zzau f39066a;

                {
                    this.f39066a = this;
                }

                @Override // com.google.android.gms.internal.vision.zzba
                public final Object zza() {
                    return this.f39066a.m46565b();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    public final void zza() {
        synchronized (this.f47560d) {
            this.f47561e = null;
            zzbi.m46555e();
        }
        synchronized (this) {
            try {
                for (zzaz zzazVar : this.f47562f) {
                    zzazVar.zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC20068gd2
    public final /* synthetic */ Object zza(String str) {
        return (String) m46564c().get(str);
    }
}
