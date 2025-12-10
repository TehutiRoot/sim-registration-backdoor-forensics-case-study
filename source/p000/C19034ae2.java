package p000;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.vision.zzaq;
import com.google.android.gms.internal.vision.zzba;
import com.google.android.gms.internal.vision.zzbb;

/* renamed from: ae2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19034ae2 implements InterfaceC20068gd2 {

    /* renamed from: c */
    public static C19034ae2 f8380c;

    /* renamed from: a */
    public final Context f8381a;

    /* renamed from: b */
    public final ContentObserver f8382b;

    public C19034ae2(Context context) {
        this.f8381a = context;
        C20587je2 c20587je2 = new C20587je2(this, null);
        this.f8382b = c20587je2;
        context.getContentResolver().registerContentObserver(zzaq.zza, true, c20587je2);
    }

    /* renamed from: a */
    public static C19034ae2 m65079a(Context context) {
        C19034ae2 c19034ae2;
        C19034ae2 c19034ae22;
        synchronized (C19034ae2.class) {
            try {
                if (f8380c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c19034ae22 = new C19034ae2(context);
                    } else {
                        c19034ae22 = new C19034ae2();
                    }
                    f8380c = c19034ae22;
                }
                c19034ae2 = f8380c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c19034ae2;
    }

    /* renamed from: b */
    public static synchronized void m65078b() {
        Context context;
        synchronized (C19034ae2.class) {
            try {
                C19034ae2 c19034ae2 = f8380c;
                if (c19034ae2 != null && (context = c19034ae2.f8381a) != null && c19034ae2.f8382b != null) {
                    context.getContentResolver().unregisterContentObserver(f8380c.f8382b);
                }
                f8380c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ String m65077c(String str) {
        return zzaq.zza(this.f8381a.getContentResolver(), str, null);
    }

    @Override // p000.InterfaceC20068gd2
    /* renamed from: d */
    public final String zza(String str) {
        if (this.f8381a == null) {
            return null;
        }
        try {
            return (String) zzbb.zza(new zzba(this, str) { // from class: Ud2

                /* renamed from: a */
                public final C19034ae2 f6385a;

                /* renamed from: b */
                public final String f6386b;

                {
                    this.f6385a = this;
                    this.f6386b = str;
                }

                @Override // com.google.android.gms.internal.vision.zzba
                public final Object zza() {
                    return this.f6385a.m65077c(this.f6386b);
                }
            });
        } catch (IllegalStateException | SecurityException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Unable to read GServices for: ".concat(valueOf);
            }
            return null;
        }
    }

    public C19034ae2() {
        this.f8381a = null;
        this.f8382b = null;
    }
}
