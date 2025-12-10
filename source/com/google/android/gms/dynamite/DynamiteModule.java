package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
/* loaded from: classes3.dex */
public final class DynamiteModule {
    @KeepForSdk
    public static final int LOCAL = -1;
    @KeepForSdk
    public static final int NONE = 0;
    @KeepForSdk
    public static final int NO_SELECTION = 0;
    @KeepForSdk
    public static final int REMOTE = 1;

    /* renamed from: b */
    public static Boolean f45368b = null;

    /* renamed from: c */
    public static String f45369c = null;

    /* renamed from: d */
    public static boolean f45370d = false;

    /* renamed from: e */
    public static int f45371e = -1;

    /* renamed from: f */
    public static Boolean f45372f;

    /* renamed from: j */
    public static zzq f45376j;

    /* renamed from: k */
    public static zzr f45377k;

    /* renamed from: a */
    public final Context f45378a;

    /* renamed from: g */
    public static final ThreadLocal f45373g = new ThreadLocal();

    /* renamed from: h */
    public static final ThreadLocal f45374h = new C23176yh2();

    /* renamed from: i */
    public static final VersionPolicy.IVersions f45375i = new C6370a();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new C6371b();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new C6372c();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new C6373d();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new C6374e();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new C6375f();
    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new C6376g();
    @NonNull
    public static final VersionPolicy zza = new C6377h();

    @DynamiteApi
    /* loaded from: classes3.dex */
    public static class DynamiteLoaderClassLoader {
        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zzp zzpVar) {
            super(str, th2);
        }
    }

    /* loaded from: classes3.dex */
    public interface VersionPolicy {

        @KeepForSdk
        /* loaded from: classes3.dex */
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        /* loaded from: classes3.dex */
        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f45378a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m48314a(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m48314a(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: b */
    public static DynamiteModule m48313b(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    /* renamed from: c */
    public static void m48312c(ClassLoader classLoader) {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzrVar = (zzr) queryLocalInterface;
                } else {
                    zzrVar = new zzr(iBinder);
                }
            }
            f45377k = zzrVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: d */
    public static boolean m48311d(Cursor cursor) {
        JH2 jh2 = (JH2) f45373g.get();
        if (jh2 != null && jh2.f2757a == null) {
            jh2.f2757a = cursor;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m48310e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f45372f)) {
            return true;
        }
        boolean z = false;
        if (f45372f == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            f45372f = Boolean.valueOf(z);
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f45370d = true;
            }
        }
        return z;
    }

    /* renamed from: f */
    public static zzq m48309f(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f45376j;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzq) {
                        zzqVar = (zzq) queryLocalInterface;
                    } else {
                        zzqVar = new zzq(iBinder);
                    }
                }
                if (zzqVar != null) {
                    f45376j = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
            }
            return null;
        }
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!Objects.equal(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb = new StringBuilder();
                sb.append("Module descriptor id '");
                sb.append(valueOf);
                sb.append("' didn't match expected id '");
                sb.append(str);
                sb.append(OperatorName.SHOW_TEXT_LINE);
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        DynamiteModule m48313b;
        Boolean bool;
        IObjectWrapper zzh;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z;
        IObjectWrapper zze;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f45373g;
            JH2 jh2 = (JH2) threadLocal.get();
            JH2 jh22 = new JH2(null);
            threadLocal.set(jh22);
            ThreadLocal threadLocal2 = f45374h;
            Long l = (Long) threadLocal2.get();
            long longValue = l.longValue();
            try {
                threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
                VersionPolicy.SelectionResult selectModule = versionPolicy.selectModule(context, str, f45375i);
                int i = selectModule.localVersion;
                int i2 = selectModule.remoteVersion;
                StringBuilder sb = new StringBuilder();
                sb.append("Considering local module ");
                sb.append(str);
                sb.append(":");
                sb.append(i);
                sb.append(" and remote module ");
                sb.append(str);
                sb.append(":");
                sb.append(i2);
                int i3 = selectModule.selection;
                if (i3 != 0) {
                    if (i3 == -1) {
                        if (selectModule.localVersion != 0) {
                            i3 = -1;
                        }
                    }
                    if (i3 != 1 || selectModule.remoteVersion != 0) {
                        if (i3 == -1) {
                            m48313b = m48313b(applicationContext, str);
                        } else if (i3 == 1) {
                            try {
                                int i4 = selectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (m48310e(context)) {
                                            bool = f45368b;
                                        } else {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                    }
                                    if (bool != null) {
                                        if (bool.booleanValue()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Selected remote version of ");
                                            sb2.append(str);
                                            sb2.append(", version >= ");
                                            sb2.append(i4);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = f45377k;
                                            }
                                            if (zzrVar != null) {
                                                JH2 jh23 = (JH2) threadLocal.get();
                                                if (jh23 != null && jh23.f2757a != null) {
                                                    Context applicationContext2 = context.getApplicationContext();
                                                    Cursor cursor = jh23.f2757a;
                                                    ObjectWrapper.wrap(null);
                                                    synchronized (DynamiteModule.class) {
                                                        if (f45371e >= 2) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        zze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor));
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                        zze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor));
                                                    }
                                                    Context context2 = (Context) ObjectWrapper.unwrap(zze);
                                                    if (context2 != null) {
                                                        dynamiteModule = new DynamiteModule(context2);
                                                    } else {
                                                        throw new LoadingException("Failed to get module context", null);
                                                    }
                                                } else {
                                                    throw new LoadingException("No result cursor", null);
                                                }
                                            } else {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                        } else {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Selected remote version of ");
                                            sb3.append(str);
                                            sb3.append(", version >= ");
                                            sb3.append(i4);
                                            zzq m48309f = m48309f(context);
                                            if (m48309f != null) {
                                                int zze2 = m48309f.zze();
                                                if (zze2 >= 3) {
                                                    JH2 jh24 = (JH2) threadLocal.get();
                                                    if (jh24 != null) {
                                                        zzh = m48309f.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(jh24.f2757a));
                                                    } else {
                                                        throw new LoadingException("No cached result cursor holder", null);
                                                    }
                                                } else if (zze2 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    zzh = m48309f.zzj(ObjectWrapper.wrap(context), str, i4);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    zzh = m48309f.zzh(ObjectWrapper.wrap(context), str, i4);
                                                }
                                                Object unwrap = ObjectWrapper.unwrap(zzh);
                                                if (unwrap != null) {
                                                    dynamiteModule = new DynamiteModule((Context) unwrap);
                                                } else {
                                                    throw new LoadingException("Failed to load remote module.", null);
                                                }
                                            } else {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                        }
                                        m48313b = dynamiteModule;
                                    } else {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th2) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e3) {
                                String message = e3.getMessage();
                                Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                int i5 = selectModule.localVersion;
                                if (i5 != 0 && versionPolicy.selectModule(context, str, new C6378i(i5, 0)).selection == -1) {
                                    m48313b = m48313b(applicationContext, str);
                                } else {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                }
                            }
                        } else {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i3, null);
                        }
                        if (longValue == 0) {
                            f45374h.remove();
                        } else {
                            f45374h.set(l);
                        }
                        Cursor cursor2 = jh22.f2757a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        f45373g.set(jh2);
                        return m48313b;
                    }
                }
                int i6 = selectModule.localVersion;
                int i7 = selectModule.remoteVersion;
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + i6 + " and remote version is " + i7 + ".", null);
            } catch (Throwable th3) {
                if (longValue == 0) {
                    f45374h.remove();
                } else {
                    f45374h.set(l);
                }
                Cursor cursor3 = jh22.f2757a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f45373g.set(jh2);
                throw th3;
            }
        }
        throw new LoadingException("null application Context", null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bf -> B:130:0x01c4). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c1 -> B:130:0x01c4). Please submit an issue!!! */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Field declaredField;
        Throwable th2;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f45368b;
                Cursor cursor2 = null;
                int i = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String obj = e2.toString();
                        Log.w("DynamiteModule", "Failed to load module via V2: " + obj);
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                m48312c(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else if (!m48310e(context)) {
                            return 0;
                        } else {
                            if (!f45370d) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int m48314a = m48314a(context, str, z, true);
                                        String str2 = f45369c;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader zza2 = zzb.zza();
                                            if (zza2 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC0733KL.m67620a();
                                                    String str3 = f45369c;
                                                    Preconditions.checkNotNull(str3);
                                                    zza2 = AbstractC0665JL.m67764a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f45369c;
                                                    Preconditions.checkNotNull(str4);
                                                    zza2 = new C17790If2(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            m48312c(zza2);
                                            declaredField.set(null, zza2);
                                            f45368b = bool2;
                                            return m48314a;
                                        }
                                        return m48314a;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f45368b = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return m48314a(context, str, z, false);
                    } catch (LoadingException e3) {
                        String message = e3.getMessage();
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message);
                        return 0;
                    }
                }
                zzq m48309f = m48309f(context);
                try {
                    if (m48309f != null) {
                        try {
                            int zze = m48309f.zze();
                            if (zze >= 3) {
                                JH2 jh2 = (JH2) f45373g.get();
                                if (jh2 != null && (cursor = jh2.f2757a) != null) {
                                    i = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(m48309f.zzk(ObjectWrapper.wrap(context), str, z, ((Long) f45374h.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 <= 0 || !m48311d(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i = i2;
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            String message2 = e.getMessage();
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + message2);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (zze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i = m48309f.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i = m48309f.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return i;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.f45378a;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f45378a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
