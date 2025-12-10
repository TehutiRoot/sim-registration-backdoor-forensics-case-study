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

/* renamed from: IH2 */
/* loaded from: classes3.dex */
public abstract class IH2 {

    /* renamed from: e */
    public static volatile zzag f2474e;

    /* renamed from: g */
    public static Context f2476g;

    /* renamed from: a */
    public static final LD2 f2470a = new Wm2(AbstractBinderC20822kz2.m26575a("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    public static final LD2 f2471b = new Wp2(AbstractBinderC20822kz2.m26575a("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    public static final LD2 f2472c = new Ws2(AbstractBinderC20822kz2.m26575a("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    public static final LD2 f2473d = new BinderC20297hw2(AbstractBinderC20822kz2.m26575a("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    public static final Object f2475f = new Object();

    /* renamed from: a */
    public static UK2 m67929a(String str, AbstractBinderC20822kz2 abstractBinderC20822kz2, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m67922h(str, abstractBinderC20822kz2, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    public static UK2 m67928b(String str, boolean z, boolean z2, boolean z3) {
        return m67921i(str, z, false, false, true);
    }

    /* renamed from: c */
    public static UK2 m67927c(String str, boolean z, boolean z2, boolean z3) {
        return m67921i(str, z, false, false, false);
    }

    /* renamed from: d */
    public static /* synthetic */ String m67926d(boolean z, String str, AbstractBinderC20822kz2 abstractBinderC20822kz2) {
        String str2;
        if (!z && m67922h(str, abstractBinderC20822kz2, true, false).f6286a) {
            str2 = "debug cert rejected";
        } else {
            str2 = "not allowed";
        }
        MessageDigest zza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(zza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(zza.digest(abstractBinderC20822kz2.mo26574b())), Boolean.valueOf(z), "12451000.false");
    }

    /* renamed from: e */
    public static synchronized void m67925e(Context context) {
        synchronized (IH2.class) {
            if (f2476g == null) {
                if (context != null) {
                    f2476g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* renamed from: f */
    public static boolean m67924f() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m67920j();
            z = f2474e.zzg();
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
    public static boolean m67923g() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m67920j();
            z = f2474e.zzi();
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
    public static UK2 m67922h(final String str, final AbstractBinderC20822kz2 abstractBinderC20822kz2, final boolean z, boolean z2) {
        try {
            m67920j();
            Preconditions.checkNotNull(f2476g);
            try {
                if (f2474e.zzh(new zzs(str, abstractBinderC20822kz2, z, z2), ObjectWrapper.wrap(f2476g.getPackageManager()))) {
                    return UK2.m66070b();
                }
                return new C20197hK2(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return IH2.m67926d(z, str, abstractBinderC20822kz2);
                    }
                }, null);
            } catch (RemoteException e) {
                return UK2.m66068d("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return UK2.m66068d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    /* renamed from: i */
    public static UK2 m67921i(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        UK2 m66068d;
        zzq zzf;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f2476g);
            try {
                m67920j();
                zzo zzoVar = new zzo(str, z, false, ObjectWrapper.wrap(f2476g), false, true);
                try {
                    if (z4) {
                        zzf = f2474e.zze(zzoVar);
                    } else {
                        zzf = f2474e.zzf(zzoVar);
                    }
                    if (zzf.zzb()) {
                        m66068d = UK2.m66066f(zzf.zzc());
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
                        m66068d = UK2.m66065g(zzf.zzc(), zzf.zzd(), zza, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    m66068d = UK2.m66068d("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                m66068d = UK2.m66068d("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return m66068d;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* renamed from: j */
    public static void m67920j() {
        if (f2474e != null) {
            return;
        }
        Preconditions.checkNotNull(f2476g);
        synchronized (f2475f) {
            try {
                if (f2474e == null) {
                    f2474e = zzaf.zzb(DynamiteModule.load(f2476g, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
