package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class zzia {

    /* renamed from: h */
    public static volatile Zv2 f46309h;
    public static final /* synthetic */ int zzc = 0;

    /* renamed from: a */
    public final zzhx f46313a;

    /* renamed from: b */
    public final String f46314b;

    /* renamed from: c */
    public final Object f46315c;

    /* renamed from: d */
    public volatile int f46316d = -1;

    /* renamed from: e */
    public volatile Object f46317e;

    /* renamed from: f */
    public final boolean f46318f;

    /* renamed from: g */
    public static final Object f46308g = new Object();

    /* renamed from: i */
    public static final AtomicReference f46310i = new AtomicReference();

    /* renamed from: j */
    public static final zzic f46311j = new zzic(zzhs.zza, null);

    /* renamed from: k */
    public static final AtomicInteger f46312k = new AtomicInteger();

    public /* synthetic */ zzia(zzhx zzhxVar, String str, Object obj, boolean z, zzhz zzhzVar) {
        if (zzhxVar.f46300b != null) {
            this.f46313a = zzhxVar;
            this.f46314b = str;
            this.f46315c = obj;
            this.f46318f = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzd() {
        f46312k.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (f46309h == null) {
            Object obj = f46308g;
            synchronized (obj) {
                try {
                    if (f46309h == null) {
                        synchronized (obj) {
                            Zv2 zv2 = f46309h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zv2 != null) {
                                if (zv2.mo1356a() != context) {
                                }
                            }
                            zzhe.m47165b();
                            zzib.m47163b();
                            Ju2.m67667d();
                            f46309h = new C22352tt2(context, zzil.zza(new zzih() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // com.google.android.gms.internal.measurement.zzih
                                public final Object zza() {
                                    Context context2 = context;
                                    Object obj2 = zzia.f46308g;
                                    return zzhn.zza(context2);
                                }
                            }));
                            f46312k.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo361a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:26:0x0069, B:28:0x0073, B:44:0x00a4, B:46:0x00b4, B:48:0x00c8, B:49:0x00cb, B:50:0x00cf, B:32:0x007c, B:34:0x0082, B:38:0x0094, B:40:0x009a, B:43:0x00a2, B:37:0x0092, B:24:0x0059, B:51:0x00d4, B:52:0x00d9, B:53:0x00da), top: B:59:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzia.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.f46313a.f46302d;
        return this.f46314b;
    }
}
