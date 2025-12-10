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
    public static volatile AbstractC17561Ef2 f47581h;

    /* renamed from: a */
    public final zzbo f47585a;

    /* renamed from: b */
    public final String f47586b;

    /* renamed from: c */
    public final Object f47587c;

    /* renamed from: d */
    public volatile int f47588d;

    /* renamed from: e */
    public volatile Object f47589e;

    /* renamed from: f */
    public final boolean f47590f;

    /* renamed from: g */
    public static final Object f47580g = new Object();

    /* renamed from: i */
    public static final AtomicReference f47582i = new AtomicReference();

    /* renamed from: j */
    public static zzbs f47583j = new zzbs(C21857qf2.f77263a);

    /* renamed from: k */
    public static final AtomicInteger f47584k = new AtomicInteger();

    public zzbi(zzbo zzboVar, String str, Object obj, boolean z) {
        this.f47588d = -1;
        String str2 = zzboVar.f47592a;
        if (str2 == null && zzboVar.f47593b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzboVar.f47593b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f47585a = zzboVar;
        this.f47586b = str;
        this.f47587c = obj;
        this.f47590f = z;
    }

    /* renamed from: e */
    public static void m46541e() {
        f47584k.incrementAndGet();
    }

    /* renamed from: f */
    public static zzbi m46540f(zzbo zzboVar, String str, Object obj, zzbp zzbpVar, boolean z) {
        return new C22722vf2(zzboVar, str, obj, true, zzbpVar);
    }

    /* renamed from: h */
    public static final /* synthetic */ zzcy m46538h(Context context) {
        new zzbh();
        return zzbh.zza(context);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m46537i() {
        return true;
    }

    @Deprecated
    public static void zza(final Context context) {
        synchronized (f47580g) {
            try {
                AbstractC17561Ef2 abstractC17561Ef2 = f47581h;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (abstractC17561Ef2 != null) {
                    if (abstractC17561Ef2.mo67360a() != context) {
                    }
                }
                zzau.m46552a();
                zzbq.m46535b();
                C18793Xe2.m65595b();
                f47581h = new C18075Md2(context, zzdi.zza(new zzdf(context) { // from class: tf2

                    /* renamed from: a */
                    public final Context f80262a;

                    {
                        this.f80262a = context;
                    }

                    @Override // com.google.android.gms.internal.vision.zzdf
                    public final Object zza() {
                        return zzbi.m46538h(this.f80262a);
                    }
                }));
                f47584k.incrementAndGet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void zzb(Context context) {
        if (f47581h != null) {
            return;
        }
        synchronized (f47580g) {
            try {
                if (f47581h == null) {
                    zza(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public abstract Object mo881b(Object obj);

    /* renamed from: c */
    public final Object m46543c(AbstractC17561Ef2 abstractC17561Ef2) {
        InterfaceC19605de2 m46536a;
        Object zza;
        String str;
        if (!this.f47585a.f47598g && (str = (String) C18793Xe2.m65596a(abstractC17561Ef2.mo67360a()).zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) != null && zzaq.zzb.matcher(str).matches()) {
            if (Log.isLoggable("PhenotypeFlag", 3)) {
                String valueOf = String.valueOf(zzb());
                if (valueOf.length() != 0) {
                    "Bypass reading Phenotype values for flag: ".concat(valueOf);
                }
            }
        } else {
            if (this.f47585a.f47593b != null) {
                if (zzbg.zza(abstractC17561Ef2.mo67360a(), this.f47585a.f47593b)) {
                    if (this.f47585a.f47599h) {
                        ContentResolver contentResolver = abstractC17561Ef2.mo67360a().getContentResolver();
                        String lastPathSegment = this.f47585a.f47593b.getLastPathSegment();
                        String packageName = abstractC17561Ef2.mo67360a().getPackageName();
                        StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                        sb.append(lastPathSegment);
                        sb.append("#");
                        sb.append(packageName);
                        m46536a = zzau.zza(contentResolver, zzbj.zza(sb.toString()));
                    } else {
                        m46536a = zzau.zza(abstractC17561Ef2.mo67360a().getContentResolver(), this.f47585a.f47593b);
                    }
                } else {
                    m46536a = null;
                }
            } else {
                m46536a = zzbq.m46536a(abstractC17561Ef2.mo67360a(), this.f47585a.f47592a);
            }
            if (m46536a != null && (zza = m46536a.zza(zzb())) != null) {
                return mo881b(zza);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final String m46542d(String str) {
        if (str != null && str.isEmpty()) {
            return this.f47586b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f47586b);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    /* renamed from: g */
    public final Object m46539g(AbstractC17561Ef2 abstractC17561Ef2) {
        zzcw zzcwVar;
        String m46542d;
        zzbo zzboVar = this.f47585a;
        if (!zzboVar.f47596e && ((zzcwVar = zzboVar.f47600i) == null || ((Boolean) zzcwVar.zza(abstractC17561Ef2.mo67360a())).booleanValue())) {
            C18793Xe2 m65596a = C18793Xe2.m65596a(abstractC17561Ef2.mo67360a());
            zzbo zzboVar2 = this.f47585a;
            if (zzboVar2.f47596e) {
                m46542d = null;
            } else {
                m46542d = m46542d(zzboVar2.f47594c);
            }
            Object zza = m65596a.zza(m46542d);
            if (zza != null) {
                return mo881b(zza);
            }
        }
        return null;
    }

    public final T zzc() {
        boolean z;
        Object m46543c;
        if (!this.f47590f) {
            zzde.zzb(f47583j.zza(this.f47586b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = f47584k.get();
        if (this.f47588d < i) {
            synchronized (this) {
                try {
                    if (this.f47588d < i) {
                        AbstractC17561Ef2 abstractC17561Ef2 = f47581h;
                        if (abstractC17561Ef2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zzde.zzb(z, "Must call PhenotypeFlag.init() first");
                        if (!this.f47585a.f47597f ? (m46543c = m46543c(abstractC17561Ef2)) == null && (m46543c = m46539g(abstractC17561Ef2)) == null : (m46543c = m46539g(abstractC17561Ef2)) == null && (m46543c = m46543c(abstractC17561Ef2)) == null) {
                            m46543c = this.f47587c;
                        }
                        zzcy zzcyVar = (zzcy) abstractC17561Ef2.mo67359b().zza();
                        if (zzcyVar.zza()) {
                            zzbo zzboVar = this.f47585a;
                            String zza = ((zzbe) zzcyVar.zzb()).zza(zzboVar.f47593b, zzboVar.f47592a, zzboVar.f47595d, this.f47586b);
                            if (zza == null) {
                                m46543c = this.f47587c;
                            } else {
                                m46543c = mo881b(zza);
                            }
                        }
                        this.f47589e = m46543c;
                        this.f47588d = i;
                    }
                } finally {
                }
            }
        }
        return (T) this.f47589e;
    }

    public final String zzb() {
        return m46542d(this.f47585a.f47595d);
    }

    public /* synthetic */ zzbi(zzbo zzboVar, String str, Object obj, boolean z, AbstractC23068xf2 abstractC23068xf2) {
        this(zzboVar, str, obj, z);
    }
}