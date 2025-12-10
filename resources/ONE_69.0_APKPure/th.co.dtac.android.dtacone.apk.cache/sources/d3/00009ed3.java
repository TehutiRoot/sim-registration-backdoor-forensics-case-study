package com.google.android.gms.phenotype;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zza {

    /* renamed from: f */
    public static final ConcurrentHashMap f48535f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final String[] f48536g = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f48537a;

    /* renamed from: b */
    public final Uri f48538b;

    /* renamed from: e */
    public volatile Map f48541e;

    /* renamed from: d */
    public final Object f48540d = new Object();

    /* renamed from: c */
    public final ContentObserver f48539c = new C17428Ce2(this, null);

    public zza(ContentResolver contentResolver, Uri uri) {
        this.f48537a = contentResolver;
        this.f48538b = uri;
    }

    public static zza zza(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f48535f;
        zza zzaVar = (zza) concurrentHashMap.get(uri);
        if (zzaVar == null) {
            zza zzaVar2 = new zza(contentResolver, uri);
            zza zzaVar3 = (zza) concurrentHashMap.putIfAbsent(uri, zzaVar2);
            if (zzaVar3 == null) {
                zzaVar2.f48537a.registerContentObserver(zzaVar2.f48538b, false, zzaVar2.f48539c);
                return zzaVar2;
            }
            return zzaVar3;
        }
        return zzaVar;
    }

    /* renamed from: a */
    public final Map m46046a() {
        HashMap hashMap = new HashMap();
        Cursor query = this.f48537a.query(this.f48538b, f48536g, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return hashMap;
    }

    public final void zzb() {
        synchronized (this.f48540d) {
            this.f48541e = null;
        }
    }

    public final Map<String, String> zza() {
        Map<String, String> m46046a = PhenotypeFlag.m46060c("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m46046a() : this.f48541e;
        if (m46046a == null) {
            synchronized (this.f48540d) {
                try {
                    m46046a = this.f48541e;
                    if (m46046a == null) {
                        m46046a = m46046a();
                        this.f48541e = m46046a;
                    }
                } finally {
                }
            }
        }
        return m46046a;
    }
}