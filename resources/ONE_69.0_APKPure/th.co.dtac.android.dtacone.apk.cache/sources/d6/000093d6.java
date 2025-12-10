package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzho {

    /* renamed from: a */
    public static volatile zzif f46308a = zzif.zzc();

    /* renamed from: b */
    public static final Object f46309b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:33|(1:35)(1:41)|36|(2:38|(1:40))|27|28|29|30)|21|22|23|24|(1:26)|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.concat(r6)
            return r1
        L17:
            com.google.android.gms.internal.measurement.zzif r6 = com.google.android.gms.internal.measurement.zzho.f46308a
            boolean r6 = r6.zzb()
            if (r6 == 0) goto L2c
            com.google.android.gms.internal.measurement.zzif r5 = com.google.android.gms.internal.measurement.zzho.f46308a
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L2c:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzho.f46309b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.zzif r0 = com.google.android.gms.internal.measurement.zzho.f46308a     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            com.google.android.gms.internal.measurement.zzif r5 = com.google.android.gms.internal.measurement.zzho.f46308a     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.zza()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L45
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            return r5
        L45:
            r5 = move-exception
            goto L9e
        L47:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L54
            goto L75
        L54:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r4 = 29
            if (r3 >= r4) goto L62
            r3 = 0
            goto L64
        L62:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L64:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L86
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L45
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L75
            goto L86
        L75:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L45 android.content.pm.PackageManager.NameNotFoundException -> L86
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L45
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L86
            r1 = 1
        L86:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.measurement.zzif r5 = com.google.android.gms.internal.measurement.zzif.zzd(r5)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.measurement.zzho.f46308a = r5     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.measurement.zzif r5 = com.google.android.gms.internal.measurement.zzho.f46308a
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L9e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzho.zza(android.content.Context, android.net.Uri):boolean");
    }
}