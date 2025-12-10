package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzcc {

    /* renamed from: a */
    public static final String f47888a = "zzcc";

    /* renamed from: b */
    public static Context f47889b;

    /* renamed from: c */
    public static zzf f47890c;

    /* renamed from: a */
    public static Context m46401a(Exception exc, Context context) {
        return GooglePlayServicesUtil.getRemoteContext(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|6|(6:8|(1:10)|13|14|15|16)|27|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        r0 = "com.google.android.gms.maps_core_dynamite";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r5 != com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r0.equals("com.google.android.gms.maps_dynamite") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        r4 = com.google.android.gms.dynamite.DynamiteModule.load(r4, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, "com.google.android.gms.maps_dynamite").getModuleContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        r4 = m46401a(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r4 = m46401a(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r5 != 1) goto L27;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context m46400b(android.content.Context r4, com.google.android.gms.maps.MapsInitializer.Renderer r5) {
        /*
            java.lang.String r0 = "com.google.android.gms.maps_legacy_dynamite"
            java.lang.String r1 = "com.google.android.gms.maps_core_dynamite"
            java.lang.String r2 = "com.google.android.gms.maps_dynamite"
            android.content.Context r3 = com.google.android.gms.maps.internal.zzcc.f47889b
            if (r3 != 0) goto L4e
            java.lang.String r3 = "com.google.android.gms.maps.internal.UseLegacyRendererAsDefault"
            java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1f
            if (r5 == 0) goto L1d
            int r5 = r5.ordinal()
            if (r5 == 0) goto L24
            r0 = 1
            if (r5 == r0) goto L1b
            goto L1d
        L1b:
            r0 = r1
            goto L24
        L1d:
            r0 = r2
            goto L24
        L1f:
            com.google.android.gms.maps.MapsInitializer$Renderer r3 = com.google.android.gms.maps.MapsInitializer.Renderer.LEGACY
            if (r5 != r3) goto L1b
        L24:
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L2f
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r4, r5, r0)     // Catch: java.lang.Exception -> L2f
            android.content.Context r4 = r5.getModuleContext()     // Catch: java.lang.Exception -> L2f
            goto L4b
        L2f:
            r5 = move-exception
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L47
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r5 = com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE     // Catch: java.lang.Exception -> L41
            com.google.android.gms.dynamite.DynamiteModule r5 = com.google.android.gms.dynamite.DynamiteModule.load(r4, r5, r2)     // Catch: java.lang.Exception -> L41
            android.content.Context r4 = r5.getModuleContext()     // Catch: java.lang.Exception -> L41
            goto L4b
        L41:
            r5 = move-exception
            android.content.Context r4 = m46401a(r5, r4)
            goto L4b
        L47:
            android.content.Context r4 = m46401a(r5, r4)
        L4b:
            com.google.android.gms.maps.internal.zzcc.f47889b = r4
            return r4
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzcc.m46400b(android.content.Context, com.google.android.gms.maps.MapsInitializer$Renderer):android.content.Context");
    }

    /* renamed from: c */
    public static zzf m46399c(Context context, MapsInitializer.Renderer renderer) {
        try {
            IBinder iBinder = (IBinder) m46398d(((ClassLoader) Preconditions.checkNotNull(m46400b(context, renderer).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (queryLocalInterface instanceof zzf) {
                return (zzf) queryLocalInterface;
            }
            return new zze(iBinder);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    /* renamed from: d */
    public static Object m46398d(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()), e2);
        }
    }

    public static zzf zza(Context context, @Nullable MapsInitializer.Renderer renderer) throws GooglePlayServicesNotAvailableException {
        Preconditions.checkNotNull(context);
        "preferredRenderer: ".concat(String.valueOf(renderer));
        zzf zzfVar = f47890c;
        if (zzfVar == null) {
            int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context, 13400000);
            if (isGooglePlayServicesAvailable == 0) {
                zzf m46399c = m46399c(context, renderer);
                f47890c = m46399c;
                try {
                    if (m46399c.zzd() == 2) {
                        try {
                            f47890c.zzm(ObjectWrapper.wrap(m46400b(context, renderer)));
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        } catch (UnsatisfiedLinkError unused) {
                            Log.w(f47888a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                            f47889b = null;
                            f47890c = m46399c(context, MapsInitializer.Renderer.LEGACY);
                        }
                    }
                    try {
                        zzf zzfVar2 = f47890c;
                        Context m46400b = m46400b(context, renderer);
                        Objects.requireNonNull(m46400b);
                        zzfVar2.zzk(ObjectWrapper.wrap(m46400b.getResources()), 19000000);
                        return f47890c;
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                } catch (RemoteException e3) {
                    throw new RuntimeRemoteException(e3);
                }
            }
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
        return zzfVar;
    }
}
