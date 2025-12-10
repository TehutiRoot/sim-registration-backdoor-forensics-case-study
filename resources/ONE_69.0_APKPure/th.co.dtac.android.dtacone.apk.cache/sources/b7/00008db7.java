package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzab {

    /* renamed from: h */
    public static final ConcurrentHashMap f45516h = new ConcurrentHashMap();

    /* renamed from: i */
    public static final String[] f45517i = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f45518a;

    /* renamed from: b */
    public final Uri f45519b;

    /* renamed from: e */
    public volatile Map f45522e;

    /* renamed from: d */
    public final Object f45521d = new Object();

    /* renamed from: f */
    public final Object f45523f = new Object();

    /* renamed from: g */
    public final List f45524g = new ArrayList();

    /* renamed from: c */
    public final ContentObserver f45520c = new C18784Xb2(this, null);

    public zzab(ContentResolver contentResolver, Uri uri) {
        this.f45518a = contentResolver;
        this.f45519b = uri;
    }

    public static zzab zza(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f45516h;
        zzab zzabVar = (zzab) concurrentHashMap.get(uri);
        if (zzabVar == null) {
            zzab zzabVar2 = new zzab(contentResolver, uri);
            zzab zzabVar3 = (zzab) concurrentHashMap.putIfAbsent(uri, zzabVar2);
            if (zzabVar3 == null) {
                zzabVar2.f45518a.registerContentObserver(zzabVar2.f45519b, false, zzabVar2.f45520c);
                return zzabVar2;
            }
            return zzabVar3;
        }
        return zzabVar;
    }

    /* renamed from: b */
    public final Map m48201b() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.f45518a.query(this.f45519b, f45517i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void m48200c() {
        synchronized (this.f45523f) {
            try {
                for (zzad zzadVar : this.f45524g) {
                    zzadVar.zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> zzg() {
        Map<String, String> m48201b = zzae.m48195e("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m48201b() : this.f45522e;
        if (m48201b == null) {
            synchronized (this.f45521d) {
                try {
                    m48201b = this.f45522e;
                    if (m48201b == null) {
                        m48201b = m48201b();
                        this.f45522e = m48201b;
                    }
                } finally {
                }
            }
        }
        return m48201b != null ? m48201b : Collections.emptyMap();
    }

    public final void zzh() {
        synchronized (this.f45521d) {
            this.f45522e = null;
        }
    }
}