package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* renamed from: FI2 */
/* loaded from: classes3.dex */
public abstract class FI2 {

    /* renamed from: e */
    public static volatile zzag f1651e;

    /* renamed from: g */
    public static Context f1653g;

    /* renamed from: a */
    public static final IE2 f1647a = new Tn2(AbstractBinderC20220hA2.m31273a("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final IE2 f1648b = new Tq2(AbstractBinderC20220hA2.m31273a("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final IE2 f1649c = new Tt2(AbstractBinderC20220hA2.m31273a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final IE2 f1650d = new BinderC19835ex2(AbstractBinderC20220hA2.m31273a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f1652f = new Object();

    /* renamed from: a */
    public static RL2 m68441a(String str, AbstractBinderC20220hA2 abstractBinderC20220hA2, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m68434h(str, abstractBinderC20220hA2, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static RL2 m68440b(String str, boolean z, boolean z2, boolean z3) {
        return m68433i(str, z, false, false, true);
    }

    /* renamed from: c */
    public static RL2 m68439c(String str, boolean z, boolean z2, boolean z3) {
        return m68433i(str, z, false, false, false);
    }

    /* renamed from: d */
    public static /* synthetic */ String m68438d(boolean z, String str, AbstractBinderC20220hA2 abstractBinderC20220hA2) {
        String str2;
        if (!z && m68434h(str, abstractBinderC20220hA2, true, false).f5487a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest zza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(zza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(zza.digest(abstractBinderC20220hA2.mo31272b())), Boolean.valueOf(z), "12451000.false");
    }

    /* renamed from: e */
    public static synchronized void m68437e(Context context) {
        synchronized (FI2.class) {
            if (f1653g == null) {
                if (context != null) {
                    f1653g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* renamed from: f */
    public static boolean m68436f() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m68432j();
            z = f1651e.zzg();
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            z = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z;
    }

    /* renamed from: g */
    public static boolean m68435g() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m68432j();
            z = f1651e.zzi();
        } catch (RemoteException | DynamiteModule.LoadingException unused) {
            z = false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return z;
    }

    /* renamed from: h */
    public static RL2 m68434h(final String str, final AbstractBinderC20220hA2 abstractBinderC20220hA2, final boolean z, boolean z2) {
        try {
            m68432j();
            Preconditions.checkNotNull(f1653g);
            try {
                if (f1651e.zzh(new zzs(str, abstractBinderC20220hA2, z, z2), ObjectWrapper.wrap(f1653g.getPackageManager()))) {
                    return RL2.m66665b();
                }
                return new C19734eL2(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return FI2.m68438d(z, str, abstractBinderC20220hA2);
                    }
                }, null);
            } catch (RemoteException e) {
                return RL2.m66663d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return RL2.m66663d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    /* renamed from: i */
    public static RL2 m68433i(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        RL2 m66663d;
        zzq zzf;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f1653g);
            try {
                m68432j();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.wrap(f1653g), false, true);
                try {
                    if (z4) {
                        zzf = f1651e.zze(zzoVar);
                    } else {
                        zzf = f1651e.zzf(zzoVar);
                    }
                    if (zzf.zzb()) {
                        m66663d = RL2.m66661f(zzf.zzc());
                    } else {
                        String zza = zzf.zza();
                        if (zzf.zzd() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (zza == null) {
                            zza = "error checking package certificate";
                        }
                        m66663d = RL2.m66660g(zzf.zzc(), zzf.zzd(), zza, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    m66663d = RL2.m66663d("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                m66663d = RL2.m66663d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return m66663d;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: j */
    public static void m68432j() {
        if (f1651e != null) {
            return;
        }
        Preconditions.checkNotNull(f1653g);
        synchronized (f1652f) {
            try {
                if (f1651e == null) {
                    f1651e = zzaf.zzb(DynamiteModule.load(f1653g, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}