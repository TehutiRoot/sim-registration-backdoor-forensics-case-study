package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzy;

/* loaded from: classes3.dex */
public abstract class zzae<T> {

    /* renamed from: h */
    public static final Object f45513h = new Object();

    /* renamed from: i */
    public static Context f45514i = null;

    /* renamed from: j */
    public static boolean f45515j = false;

    /* renamed from: k */
    public static volatile Boolean f45516k;

    /* renamed from: l */
    public static volatile Boolean f45517l;

    /* renamed from: a */
    public final zzao f45518a;

    /* renamed from: b */
    public final String f45519b;

    /* renamed from: c */
    public final String f45520c;

    /* renamed from: d */
    public final Object f45521d;

    /* renamed from: e */
    public Object f45522e;

    /* renamed from: f */
    public volatile zzab f45523f;

    /* renamed from: g */
    public volatile SharedPreferences f45524g;

    public zzae(zzao zzaoVar, String str, Object obj) {
        String str2;
        String str3;
        String str4;
        String str5;
        Uri uri;
        Uri uri2;
        this.f45522e = null;
        this.f45523f = null;
        this.f45524g = null;
        str2 = zzaoVar.f45525a;
        if (str2 == null) {
            uri2 = zzaoVar.f45526b;
            if (uri2 == null) {
                throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
            }
        }
        str3 = zzaoVar.f45525a;
        if (str3 != null) {
            uri = zzaoVar.f45526b;
            if (uri != null) {
                throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
            }
        }
        this.f45518a = zzaoVar;
        str4 = zzaoVar.f45527c;
        String valueOf = String.valueOf(str4);
        String valueOf2 = String.valueOf(str);
        this.f45520c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        str5 = zzaoVar.f45528d;
        String valueOf3 = String.valueOf(str5);
        String valueOf4 = String.valueOf(str);
        this.f45519b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        this.f45521d = obj;
    }

    /* renamed from: a */
    public static zzae m48202a(zzao zzaoVar, String str, Object obj, zzan zzanVar) {
        return new C18738Xb2(zzaoVar, str, obj, zzanVar);
    }

    /* renamed from: b */
    public static zzae m48201b(zzao zzaoVar, String str, String str2) {
        return new C18610Vb2(zzaoVar, str, str2);
    }

    /* renamed from: c */
    public static zzae m48200c(zzao zzaoVar, String str, boolean z) {
        return new C18354Rb2(zzaoVar, str, Boolean.valueOf(z));
    }

    /* renamed from: d */
    public static Object m48199d(InterfaceC19205bc2 interfaceC19205bc2) {
        try {
            return interfaceC19205bc2.zzp();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC19205bc2.zzp();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: e */
    public static boolean m48198e(String str, boolean z) {
        if (m48191l()) {
            return ((Boolean) m48199d(new InterfaceC19205bc2(str, false) { // from class: Kb2

                /* renamed from: a */
                public final String f3226a;

                /* renamed from: b */
                public final boolean f3227b = false;

                {
                    this.f3226a = str;
                }

                @Override // p000.InterfaceC19205bc2
                public final Object zzp() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(zzy.zza(zzae.f45514i.getContentResolver(), this.f3226a, this.f3227b));
                    return valueOf;
                }
            })).booleanValue();
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m48191l() {
        if (f45516k == null) {
            Context context = f45514i;
            if (context == null) {
                return false;
            }
            f45516k = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f45516k.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0022 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:64:0x0007, B:66:0x000d, B:75:0x001e, B:77:0x0022, B:78:0x0025, B:79:0x0027, B:71:0x0016), top: B:84:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void maybeInit(android.content.Context r3) {
        /*
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.f45514i
            if (r0 != 0) goto L2e
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.zzae.f45513h
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            r2 = 24
            if (r1 < r2) goto L16
            boolean r1 = p000.AbstractC21359o62.m25962a(r3)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            goto L1e
        L14:
            r3 = move-exception
            goto L2c
        L16:
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1d
            goto L1e
        L1d:
            r3 = r1
        L1e:
            android.content.Context r1 = com.google.android.gms.internal.clearcut.zzae.f45514i     // Catch: java.lang.Throwable -> L14
            if (r1 == r3) goto L25
            r1 = 0
            com.google.android.gms.internal.clearcut.zzae.f45516k = r1     // Catch: java.lang.Throwable -> L14
        L25:
            com.google.android.gms.internal.clearcut.zzae.f45514i = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r3 = 0
            com.google.android.gms.internal.clearcut.zzae.f45515j = r3
            goto L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzae.maybeInit(android.content.Context):void");
    }

    public final T get() {
        boolean z;
        if (f45514i != null) {
            z = this.f45518a.f45530f;
            if (z) {
                T t = (T) m48192k();
                if (t != null) {
                    return t;
                }
                T t2 = (T) m48193j();
                if (t2 != null) {
                    return t2;
                }
            } else {
                T t3 = (T) m48193j();
                if (t3 != null) {
                    return t3;
                }
                T t4 = (T) m48192k();
                if (t4 != null) {
                    return t4;
                }
            }
            return (T) this.f45521d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007d  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m48193j() {
        /*
            r4 = this;
            java.lang.String r0 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            r1 = 0
            boolean r0 = m48198e(r0, r1)
            r2 = 0
            if (r0 != 0) goto L9e
            com.google.android.gms.internal.clearcut.zzao r0 = r4.f45518a
            android.net.Uri r0 = com.google.android.gms.internal.clearcut.zzao.m48188b(r0)
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.clearcut.zzab r0 = r4.f45523f
            if (r0 != 0) goto L28
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.f45514i
            android.content.ContentResolver r0 = r0.getContentResolver()
            com.google.android.gms.internal.clearcut.zzao r1 = r4.f45518a
            android.net.Uri r1 = com.google.android.gms.internal.clearcut.zzao.m48188b(r1)
            com.google.android.gms.internal.clearcut.zzab r0 = com.google.android.gms.internal.clearcut.zzab.zza(r0, r1)
            r4.f45523f = r0
        L28:
            com.google.android.gms.internal.clearcut.zzab r0 = r4.f45523f
            Cb2 r1 = new Cb2
            r1.<init>(r4, r0)
            java.lang.Object r0 = m48199d(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r4.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.clearcut.zzao r0 = r4.f45518a
            java.lang.String r0 = com.google.android.gms.internal.clearcut.zzao.m48189a(r0)
            if (r0 == 0) goto Lbb
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L79
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.f45514i
            boolean r0 = p000.AbstractC21359o62.m25962a(r0)
            if (r0 != 0) goto L79
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.f45517l
            if (r0 == 0) goto L5e
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.f45517l
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L72
        L5e:
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.f45514i
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r0 = p000.AbstractC1867a3.m65127a(r0, r3)
            android.os.UserManager r0 = (android.os.UserManager) r0
            boolean r0 = p000.AbstractC21951ra2.m23320a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.internal.clearcut.zzae.f45517l = r0
        L72:
            java.lang.Boolean r0 = com.google.android.gms.internal.clearcut.zzae.f45517l
            boolean r0 = r0.booleanValue()
            goto L7a
        L79:
            r0 = 1
        L7a:
            if (r0 != 0) goto L7d
            return r2
        L7d:
            android.content.SharedPreferences r0 = r4.f45524g
            if (r0 != 0) goto L8f
            android.content.Context r0 = com.google.android.gms.internal.clearcut.zzae.f45514i
            com.google.android.gms.internal.clearcut.zzao r3 = r4.f45518a
            java.lang.String r3 = com.google.android.gms.internal.clearcut.zzao.m48189a(r3)
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r1)
            r4.f45524g = r0
        L8f:
            android.content.SharedPreferences r0 = r4.f45524g
            java.lang.String r1 = r4.f45519b
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto Lbb
            java.lang.Object r0 = r4.zza(r0)
            return r0
        L9e:
            java.lang.String r0 = r4.f45519b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            if (r1 == 0) goto Lb1
            java.lang.String r0 = r3.concat(r0)
            goto Lb6
        Lb1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        Lb6:
            java.lang.String r1 = "PhenotypeFlag"
            android.util.Log.w(r1, r0)
        Lbb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzae.m48193j():java.lang.Object");
    }

    /* renamed from: k */
    public final Object m48192k() {
        boolean z;
        String str;
        z = this.f45518a.f45529e;
        if (z || !m48191l() || (str = (String) m48199d(new InterfaceC19205bc2(this) { // from class: Hb2

            /* renamed from: a */
            public final zzae f2258a;

            {
                this.f2258a = this;
            }

            @Override // p000.InterfaceC19205bc2
            public final Object zzp() {
                return this.f2258a.m48190m();
            }
        })) == null) {
            return null;
        }
        return zzb(str);
    }

    /* renamed from: m */
    public final /* synthetic */ String m48190m() {
        return zzy.zza(f45514i.getContentResolver(), this.f45520c, (String) null);
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zzb(String str);

    public /* synthetic */ zzae(zzao zzaoVar, String str, Object obj, AbstractC18162Ob2 abstractC18162Ob2) {
        this(zzaoVar, str, obj);
    }
}
