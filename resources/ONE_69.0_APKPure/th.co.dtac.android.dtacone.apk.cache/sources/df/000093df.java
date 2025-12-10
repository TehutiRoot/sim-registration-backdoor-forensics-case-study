package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzib implements InterfaceC21559ov2 {

    /* renamed from: b */
    public static final Map f46331b = new ArrayMap();

    /* renamed from: a */
    public final SharedPreferences f46332a;

    /* renamed from: a */
    public static zzib m47173a(Context context, String str, Runnable runnable) {
        zzib zzibVar;
        if (!zzha.zzb()) {
            synchronized (zzib.class) {
                try {
                    zzibVar = (zzib) f46331b.get(null);
                    if (zzibVar == null) {
                        StrictMode.allowThreadDiskReads();
                        throw null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzibVar;
        }
        throw null;
    }

    /* renamed from: b */
    public static synchronized void m47172b() {
        synchronized (zzib.class) {
            Map map = f46331b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((zzib) it.next()).f46332a;
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC21559ov2
    @Nullable
    public final Object zzb(String str) {
        throw null;
    }
}