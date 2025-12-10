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
    public static final ConcurrentHashMap f48523f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final String[] f48524g = {Action.KEY_ATTRIBUTE, "value"};

    /* renamed from: a */
    public final ContentResolver f48525a;

    /* renamed from: b */
    public final Uri f48526b;

    /* renamed from: e */
    public volatile Map f48529e;

    /* renamed from: d */
    public final Object f48528d = new Object();

    /* renamed from: c */
    public final ContentObserver f48527c = new C17592Fd2(this, null);

    public zza(ContentResolver contentResolver, Uri uri) {
        this.f48525a = contentResolver;
        this.f48526b = uri;
    }

    public static zza zza(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap concurrentHashMap = f48523f;
        zza zzaVar = (zza) concurrentHashMap.get(uri);
        if (zzaVar == null) {
            zza zzaVar2 = new zza(contentResolver, uri);
            zza zzaVar3 = (zza) concurrentHashMap.putIfAbsent(uri, zzaVar2);
            if (zzaVar3 == null) {
                zzaVar2.f48525a.registerContentObserver(zzaVar2.f48526b, false, zzaVar2.f48527c);
                return zzaVar2;
            }
            return zzaVar3;
        }
        return zzaVar;
    }

    /* renamed from: a */
    public final Map m46061a() {
        HashMap hashMap = new HashMap();
        Cursor query = this.f48525a.query(this.f48526b, f48524g, null, null, null);
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
        synchronized (this.f48528d) {
            this.f48529e = null;
        }
    }

    public final Map<String, String> zza() {
        Map<String, String> m46061a = PhenotypeFlag.m46075c("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m46061a() : this.f48529e;
        if (m46061a == null) {
            synchronized (this.f48528d) {
                try {
                    m46061a = this.f48529e;
                    if (m46061a == null) {
                        m46061a = m46061a();
                        this.f48529e = m46061a;
                    }
                } finally {
                }
            }
        }
        return m46061a;
    }
}
