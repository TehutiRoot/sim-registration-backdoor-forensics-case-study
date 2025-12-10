package com.google.android.gms.internal.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.zzbi;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class zzbi<T> {

    /* renamed from: h */
    public static volatile AbstractC17723He2 f47569h;

    /* renamed from: a */
    public final zzbo f47573a;

    /* renamed from: b */
    public final String f47574b;

    /* renamed from: c */
    public final Object f47575c;

    /* renamed from: d */
    public volatile int f47576d;

    /* renamed from: e */
    public volatile Object f47577e;

    /* renamed from: f */
    public final boolean f47578f;

    /* renamed from: g */
    public static final Object f47568g = new Object();

    /* renamed from: i */
    public static final AtomicReference f47570i = new AtomicReference();

    /* renamed from: j */
    public static zzbs f47571j = new zzbs(C22307te2.f80176a);

    /* renamed from: k */
    public static final AtomicInteger f47572k = new AtomicInteger();

    public zzbi(zzbo zzboVar, String str, Object obj, boolean z) {
        this.f47576d = -1;
        String str2 = zzboVar.f47580a;
        if (str2 == null && zzboVar.f47581b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzboVar.f47581b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f47573a = zzboVar;
        this.f47574b = str;
        this.f47575c = obj;
        this.f47578f = z;
    }

    /* renamed from: e */
    public static void m46555e() {
        f47572k.incrementAndGet();
    }

    /* renamed from: f */
    public static zzbi m46554f(zzbo zzboVar, String str, Object obj, zzbp zzbpVar, boolean z) {
        return new C23167ye2(zzboVar, str, obj, true, zzbpVar);
    }

    /* renamed from: h */
    public static final /* synthetic */ zzcy m46552h(Context context) {
        new zzbh();
        return zzbh.zza(context);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m46551i() {
        return true;
    }

    @Deprecated
    public static void zza(Context context) {
        synchronized (f47568g) {
            try {
                AbstractC17723He2 abstractC17723He2 = f47569h;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (abstractC17723He2 != null) {
                    if (abstractC17723He2.mo66785a() != context) {
                    }
                }
                zzau.m46566a();
                zzbq.m46549b();
                C19034ae2.m65078b();
                f47569h = new C18229Pc2(context, zzdi.zza(new zzdf(context) { // from class: we2

                    /* renamed from: a */
                    public final Context f108074a;

                    {
                        this.f108074a = context;
                    }

                    @Override // com.google.android.gms.internal.vision.zzdf
                    public final Object zza() {
                        return zzbi.m46552h(this.f108074a);
                    }
                }));
                f47572k.incrementAndGet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zzb(Context context) {
        if (f47569h != null) {
            return;
        }
        synchronized (f47568g) {
            try {
                if (f47569h == null) {
                    zza(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public abstract Object mo230b(Object obj);

    /* renamed from: c */
    public final Object m46557c(AbstractC17723He2 abstractC17723He2) {
        InterfaceC20068gd2 m46550a;
        Object zza;
        String str;
        if (!this.f47573a.f47586g && (str = (String) C19034ae2.m65079a(abstractC17723He2.mo66785a()).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) != null && zzaq.zzb.matcher(str).matches()) {
            if (Log.isLoggable("PhenotypeFlag", 3)) {
                String valueOf = String.valueOf(zzb());
                if (valueOf.length() != 0) {
                    "Bypass reading Phenotype values for flag: ".concat(valueOf);
                }
            }
        } else {
            if (this.f47573a.f47581b != null) {
                if (zzbg.zza(abstractC17723He2.mo66785a(), this.f47573a.f47581b)) {
                    if (this.f47573a.f47587h) {
                        ContentResolver contentResolver = abstractC17723He2.mo66785a().getContentResolver();
                        String lastPathSegment = this.f47573a.f47581b.getLastPathSegment();
                        String packageName = abstractC17723He2.mo66785a().getPackageName();
                        StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                        sb.append(lastPathSegment);
                        sb.append("#");
                        sb.append(packageName);
                        m46550a = zzau.zza(contentResolver, zzbj.zza(sb.toString()));
                    } else {
                        m46550a = zzau.zza(abstractC17723He2.mo66785a().getContentResolver(), this.f47573a.f47581b);
                    }
                } else {
                    m46550a = null;
                }
            } else {
                m46550a = zzbq.m46550a(abstractC17723He2.mo66785a(), this.f47573a.f47580a);
            }
            if (m46550a != null && (zza = m46550a.zza(zzb())) != null) {
                return mo230b(zza);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final String m46556d(String str) {
        if (str != null && str.isEmpty()) {
            return this.f47574b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f47574b);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    /* renamed from: g */
    public final Object m46553g(AbstractC17723He2 abstractC17723He2) {
        zzcw zzcwVar;
        String m46556d;
        zzbo zzboVar = this.f47573a;
        if (!zzboVar.f47584e && ((zzcwVar = zzboVar.f47588i) == null || ((Boolean) zzcwVar.zza(abstractC17723He2.mo66785a())).booleanValue())) {
            C19034ae2 m65079a = C19034ae2.m65079a(abstractC17723He2.mo66785a());
            zzbo zzboVar2 = this.f47573a;
            if (zzboVar2.f47584e) {
                m46556d = null;
            } else {
                m46556d = m46556d(zzboVar2.f47582c);
            }
            Object zza = m65079a.zza(m46556d);
            if (zza != null) {
                return mo230b(zza);
            }
        }
        return null;
    }

    public final T zzc() {
        boolean z;
        Object m46557c;
        if (!this.f47578f) {
            zzde.zzb(f47571j.zza(this.f47574b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f47572k.get();
        if (this.f47576d < i) {
            synchronized (this) {
                try {
                    if (this.f47576d < i) {
                        AbstractC17723He2 abstractC17723He2 = f47569h;
                        if (abstractC17723He2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzde.zzb(z, "Must call PhenotypeFlag.init() first");
                        if (!this.f47573a.f47585f ? (m46557c = m46557c(abstractC17723He2)) == null && (m46557c = m46553g(abstractC17723He2)) == null : (m46557c = m46553g(abstractC17723He2)) == null && (m46557c = m46557c(abstractC17723He2)) == null) {
                            m46557c = this.f47575c;
                        }
                        zzcy zzcyVar = (zzcy) abstractC17723He2.mo66784b().zza();
                        if (zzcyVar.zza()) {
                            zzbo zzboVar = this.f47573a;
                            String zza = ((zzbe) zzcyVar.zzb()).zza(zzboVar.f47581b, zzboVar.f47580a, zzboVar.f47583d, this.f47574b);
                            if (zza == null) {
                                m46557c = this.f47575c;
                            } else {
                                m46557c = mo230b(zza);
                            }
                        }
                        this.f47577e = m46557c;
                        this.f47576d = i;
                    }
                } finally {
                }
            }
        }
        return (T) this.f47577e;
    }

    public final String zzb() {
        return m46556d(this.f47573a.f47583d);
    }

    public /* synthetic */ zzbi(zzbo zzboVar, String str, Object obj, boolean z, AbstractC17275Ae2 abstractC17275Ae2) {
        this(zzboVar, str, obj, z);
    }
}
