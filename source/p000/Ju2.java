package p000;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.measurement.zzgz;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhi;

/* renamed from: Ju2 */
/* loaded from: classes3.dex */
public final class Ju2 implements InterfaceC22011ru2 {

    /* renamed from: c */
    public static Ju2 f3058c;

    /* renamed from: a */
    public final Context f3059a;

    /* renamed from: b */
    public final ContentObserver f3060b;

    public Ju2() {
        this.f3059a = null;
        this.f3060b = null;
    }

    /* renamed from: a */
    public static Ju2 m67670a(Context context) {
        Ju2 ju2;
        Ju2 ju22;
        synchronized (Ju2.class) {
            try {
                if (f3058c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        ju22 = new Ju2(context);
                    } else {
                        ju22 = new Ju2();
                    }
                    f3058c = ju22;
                }
                ju2 = f3058c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ju2;
    }

    /* renamed from: d */
    public static synchronized void m67667d() {
        Context context;
        synchronized (Ju2.class) {
            try {
                Ju2 ju2 = f3058c;
                if (ju2 != null && (context = ju2.f3059a) != null && ju2.f3060b != null) {
                    context.getContentResolver().unregisterContentObserver(f3058c.f3060b);
                }
                f3058c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC22011ru2
    /* renamed from: b */
    public final String zzb(final String str) {
        Context context = this.f3059a;
        if (context != null && !zzha.zza(context)) {
            try {
                return (String) zzhh.zza(new zzhi() { // from class: com.google.android.gms.internal.measurement.zzhk
                    {
                        Ju2.this = this;
                    }

                    @Override // com.google.android.gms.internal.measurement.zzhi
                    public final Object zza() {
                        return Ju2.this.m67668c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ String m67668c(String str) {
        return zzgz.zza(this.f3059a.getContentResolver(), str, null);
    }

    public Ju2(Context context) {
        this.f3059a = context;
        Du2 du2 = new Du2(this, null);
        this.f3060b = du2;
        context.getContentResolver().registerContentObserver(zzgz.zza, true, du2);
    }
}
