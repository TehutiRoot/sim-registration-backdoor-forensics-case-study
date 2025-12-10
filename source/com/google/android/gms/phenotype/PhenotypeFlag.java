package com.google.android.gms.phenotype;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.phenotype.zzf;
import com.google.android.gms.phenotype.PhenotypeFlag;
import com.google.android.gms.phenotype.zza;

@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public abstract class PhenotypeFlag<T> {

    /* renamed from: f */
    public static final Object f48508f = new Object();

    /* renamed from: g */
    public static Context f48509g = null;

    /* renamed from: h */
    public static boolean f48510h = false;

    /* renamed from: i */
    public static Boolean f48511i;

    /* renamed from: a */
    public final Factory f48512a;

    /* renamed from: b */
    public final String f48513b;

    /* renamed from: c */
    public final String f48514c;

    /* renamed from: d */
    public final Object f48515d;

    /* renamed from: e */
    public Object f48516e;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class Factory {

        /* renamed from: a */
        public final String f48517a;

        /* renamed from: b */
        public final Uri f48518b;

        /* renamed from: c */
        public final String f48519c;

        /* renamed from: d */
        public final String f48520d;

        /* renamed from: e */
        public final boolean f48521e;

        /* renamed from: f */
        public final boolean f48522f;

        @KeepForSdk
        public Factory(Uri uri) {
            this(null, uri, "", "", false, false);
        }

        @KeepForSdk
        public PhenotypeFlag<String> createFlag(String str, String str2) {
            return PhenotypeFlag.m46077a(this, str, str2);
        }

        @KeepForSdk
        public Factory withGservicePrefix(String str) {
            boolean z = this.f48521e;
            if (z) {
                throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new Factory(this.f48517a, this.f48518b, str, this.f48520d, z, this.f48522f);
        }

        @KeepForSdk
        public Factory withPhenotypePrefix(String str) {
            return new Factory(this.f48517a, this.f48518b, this.f48519c, str, this.f48521e, this.f48522f);
        }

        public Factory(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
            this.f48517a = str;
            this.f48518b = uri;
            this.f48519c = str2;
            this.f48520d = str3;
            this.f48521e = z;
            this.f48522f = z2;
        }
    }

    /* renamed from: com.google.android.gms.phenotype.PhenotypeFlag$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6761a {
        Object zzh();
    }

    public PhenotypeFlag(Factory factory, String str, Object obj) {
        this.f48516e = null;
        if (factory.f48517a == null && factory.f48518b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (factory.f48517a != null && factory.f48518b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f48512a = factory;
        String valueOf = String.valueOf(factory.f48519c);
        String valueOf2 = String.valueOf(str);
        this.f48514c = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        String valueOf3 = String.valueOf(factory.f48520d);
        String valueOf4 = String.valueOf(str);
        this.f48513b = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        this.f48515d = obj;
    }

    /* renamed from: a */
    public static PhenotypeFlag m46077a(Factory factory, String str, String str2) {
        return new C6768f(factory, str, str2);
    }

    /* renamed from: b */
    public static Object m46076b(InterfaceC6761a interfaceC6761a) {
        try {
            return interfaceC6761a.zzh();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC6761a.zzh();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: c */
    public static boolean m46075c(String str, boolean z) {
        if (m46070h()) {
            return ((Boolean) m46076b(new InterfaceC6761a(str, false) { // from class: PI2

                /* renamed from: a */
                public final String f4713a;

                /* renamed from: b */
                public final boolean f4714b = false;

                {
                    this.f4713a = str;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.InterfaceC6761a
                public final Object zzh() {
                    Boolean valueOf;
                    valueOf = Boolean.valueOf(zzf.zza(PhenotypeFlag.f48509g.getContentResolver(), this.f4713a, this.f4714b));
                    return valueOf;
                }
            })).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m46070h() {
        if (f48511i == null) {
            Context context = f48509g;
            if (context == null) {
                return false;
            }
            f48511i = Boolean.valueOf(PermissionChecker.checkCallingOrSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f48511i.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0028 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:64:0x000d, B:66:0x0013, B:75:0x0024, B:77:0x0028, B:78:0x002b, B:79:0x002d, B:71:0x001c), top: B:84:0x000d }] */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void maybeInit(android.content.Context r3) {
        /*
            com.google.android.gms.internal.phenotype.zzh.maybeInit(r3)
            android.content.Context r0 = com.google.android.gms.phenotype.PhenotypeFlag.f48509g
            if (r0 != 0) goto L34
            com.google.android.gms.internal.phenotype.zzh.init(r3)
            java.lang.Object r0 = com.google.android.gms.phenotype.PhenotypeFlag.f48508f
            monitor-enter(r0)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1a
            r2 = 24
            if (r1 < r2) goto L1c
            boolean r1 = p000.AbstractC21359o62.m25962a(r3)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            goto L24
        L1a:
            r3 = move-exception
            goto L32
        L1c:
            android.content.Context r1 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L23
            goto L24
        L23:
            r3 = r1
        L24:
            android.content.Context r1 = com.google.android.gms.phenotype.PhenotypeFlag.f48509g     // Catch: java.lang.Throwable -> L1a
            if (r1 == r3) goto L2b
            r1 = 0
            com.google.android.gms.phenotype.PhenotypeFlag.f48511i = r1     // Catch: java.lang.Throwable -> L1a
        L2b:
            com.google.android.gms.phenotype.PhenotypeFlag.f48509g = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            com.google.android.gms.phenotype.PhenotypeFlag.f48510h = r3
            goto L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.PhenotypeFlag.maybeInit(android.content.Context):void");
    }

    /* renamed from: f */
    public final Object m46072f() {
        boolean isDeviceProtectedStorage;
        Object systemService;
        boolean isUserUnlocked;
        if (m46075c("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String valueOf = String.valueOf(this.f48513b);
            Log.w("PhenotypeFlag", valueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(valueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f48512a.f48518b != null) {
            String str = (String) m46076b(new InterfaceC6761a(this, zza.zza(f48509g.getContentResolver(), this.f48512a.f48518b)) { // from class: nI2

                /* renamed from: a */
                public final PhenotypeFlag f72187a;

                /* renamed from: b */
                public final zza f72188b;

                {
                    this.f72187a = this;
                    this.f72188b = r2;
                }

                @Override // com.google.android.gms.phenotype.PhenotypeFlag.InterfaceC6761a
                public final Object zzh() {
                    return this.f72188b.zza().get(this.f72187a.f48513b);
                }
            });
            if (str != null) {
                return zza(str);
            }
        } else if (this.f48512a.f48517a != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                isDeviceProtectedStorage = f48509g.isDeviceProtectedStorage();
                if (!isDeviceProtectedStorage) {
                    systemService = f48509g.getSystemService(UserManager.class);
                    isUserUnlocked = ((UserManager) systemService).isUserUnlocked();
                    if (!isUserUnlocked) {
                        return null;
                    }
                }
            }
            SharedPreferences sharedPreferences = f48509g.getSharedPreferences(this.f48512a.f48517a, 0);
            if (sharedPreferences.contains(this.f48513b)) {
                return zza(sharedPreferences);
            }
        }
        return null;
    }

    /* renamed from: g */
    public final Object m46071g() {
        String str;
        if (this.f48512a.f48521e || !m46070h() || (str = (String) m46076b(new InterfaceC6761a(this) { // from class: EI2

            /* renamed from: a */
            public final PhenotypeFlag f1269a;

            {
                this.f1269a = this;
            }

            @Override // com.google.android.gms.phenotype.PhenotypeFlag.InterfaceC6761a
            public final Object zzh() {
                return this.f1269a.m46069i();
            }
        })) == null) {
            return null;
        }
        return zza(str);
    }

    @KeepForSdk
    public T get() {
        if (f48509g != null) {
            if (this.f48512a.f48522f) {
                T t = (T) m46071g();
                if (t != null) {
                    return t;
                }
                T t2 = (T) m46072f();
                if (t2 != null) {
                    return t2;
                }
            } else {
                T t3 = (T) m46072f();
                if (t3 != null) {
                    return t3;
                }
                T t4 = (T) m46071g();
                if (t4 != null) {
                    return t4;
                }
            }
            return (T) this.f48515d;
        }
        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    }

    /* renamed from: i */
    public final /* synthetic */ String m46069i() {
        return zzf.zza(f48509g.getContentResolver(), this.f48514c, (String) null);
    }

    public abstract T zza(SharedPreferences sharedPreferences);

    public abstract T zza(String str);

    public /* synthetic */ PhenotypeFlag(Factory factory, String str, Object obj, AbstractC6767e abstractC6767e) {
        this(factory, str, obj);
    }
}
