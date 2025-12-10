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
    public static final ConcurrentHashMap f45504h = new ConcurrentHashMap();

    /* renamed from: i */
    public static final String[] f45505i = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f45506a;

    /* renamed from: b */
    public final Uri f45507b;

    /* renamed from: e */
    public volatile Map f45510e;

    /* renamed from: d */
    public final Object f45509d = new Object();

    /* renamed from: f */
    public final Object f45511f = new Object();

    /* renamed from: g */
    public final List f45512g = new ArrayList();

    /* renamed from: c */
    public final ContentObserver f45508c = new C19025ab2(this, null);

    public zzab(ContentResolver contentResolver, Uri uri) {
        this.f45506a = contentResolver;
        this.f45507b = uri;
    }

    public static zzab zza(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f45504h;
        zzab zzabVar = (zzab) concurrentHashMap.get(uri);
        if (zzabVar == null) {
            zzab zzabVar2 = new zzab(contentResolver, uri);
            zzab zzabVar3 = (zzab) concurrentHashMap.putIfAbsent(uri, zzabVar2);
            if (zzabVar3 == null) {
                zzabVar2.f45506a.registerContentObserver(zzabVar2.f45507b, false, zzabVar2.f45508c);
                return zzabVar2;
            }
            return zzabVar3;
        }
        return zzabVar;
    }

    /* renamed from: b */
    public final Map m48204b() {
        try {
            HashMap hashMap = new HashMap();
            Cursor query = this.f45506a.query(this.f45507b, f45505i, null, null, null);
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
    public final void m48203c() {
        synchronized (this.f45511f) {
            try {
                for (zzad zzadVar : this.f45512g) {
                    zzadVar.zzk();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> zzg() {
        Map<String, String> m48204b = zzae.m48198e("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m48204b() : this.f45510e;
        if (m48204b == null) {
            synchronized (this.f45509d) {
                try {
                    m48204b = this.f45510e;
                    if (m48204b == null) {
                        m48204b = m48204b();
                        this.f45510e = m48204b;
                    }
                } finally {
                }
            }
        }
        return m48204b != null ? m48204b : Collections.emptyMap();
    }

    public final void zzh() {
        synchronized (this.f45509d) {
            this.f45510e = null;
        }
    }
}
