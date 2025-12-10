package com.google.android.gms.maps;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class MapsInitializer {

    /* renamed from: a */
    public static boolean f47860a = false;

    /* renamed from: b */
    public static Renderer f47861b = Renderer.LEGACY;

    /* loaded from: classes3.dex */
    public enum Renderer {
        LEGACY,
        LATEST
    }

    public static synchronized int initialize(@NonNull Context context) {
        int initialize;
        synchronized (MapsInitializer.class) {
            initialize = initialize(context, null, null);
        }
        return initialize;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:13|14|15|16|(8:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29))|32|22|23|(0)|26|27|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049 A[Catch: all -> 0x001e, RemoteException -> 0x0054, TryCatch #2 {RemoteException -> 0x0054, blocks: (B:21:0x0043, B:23:0x0049, B:24:0x004d), top: B:44:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:7:0x0018, B:11:0x0020, B:12:0x0024, B:14:0x0033, B:16:0x0038, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:25:0x0054, B:27:0x0061, B:31:0x0069, B:32:0x006e, B:34:0x0070), top: B:46:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int initialize(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.Nullable com.google.android.gms.maps.MapsInitializer.Renderer r6, @androidx.annotation.Nullable com.google.android.gms.maps.OnMapsSdkInitializedCallback r7) {
        /*
            java.lang.Class<com.google.android.gms.maps.MapsInitializer> r0 = com.google.android.gms.maps.MapsInitializer.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r1 = com.google.android.gms.maps.MapsInitializer.f47860a     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L20
            if (r7 == 0) goto L66
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.f47861b     // Catch: java.lang.Throwable -> L1e
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L1e
            goto L66
        L1e:
            r5 = move-exception
            goto L74
        L20:
            com.google.android.gms.maps.internal.zzf r1 = com.google.android.gms.maps.internal.zzcc.zza(r5, r6)     // Catch: java.lang.Throwable -> L1e com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L6f
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = r1.zze()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L68
            com.google.android.gms.maps.CameraUpdateFactory.zza(r3)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L68
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L68
            com.google.android.gms.maps.model.BitmapDescriptorFactory.zza(r3)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L68
            r3 = 1
            com.google.android.gms.maps.MapsInitializer.f47860a = r3     // Catch: java.lang.Throwable -> L1e
            r4 = 2
            if (r6 == 0) goto L40
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L43
            if (r6 == r3) goto L42
        L40:
            r3 = 0
            goto L43
        L42:
            r3 = 2
        L43:
            int r6 = r1.zzd()     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L54
            if (r6 != r4) goto L4d
            com.google.android.gms.maps.MapsInitializer$Renderer r6 = com.google.android.gms.maps.MapsInitializer.Renderer.LATEST     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L54
            com.google.android.gms.maps.MapsInitializer.f47861b = r6     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L54
        L4d:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L54
            r1.zzl(r5, r3)     // Catch: java.lang.Throwable -> L1e android.os.RemoteException -> L54
        L54:
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.f47861b     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = "loadedRenderer: "
            r6.concat(r5)     // Catch: java.lang.Throwable -> L1e
            if (r7 == 0) goto L66
            com.google.android.gms.maps.MapsInitializer$Renderer r5 = com.google.android.gms.maps.MapsInitializer.f47861b     // Catch: java.lang.Throwable -> L1e
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L1e
        L66:
            monitor-exit(r0)
            return r2
        L68:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L1e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1e
            throw r6     // Catch: java.lang.Throwable -> L1e
        L6f:
            r5 = move-exception
            int r5 = r5.errorCode     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r5
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer, com.google.android.gms.maps.OnMapsSdkInitializedCallback):int");
    }
}
