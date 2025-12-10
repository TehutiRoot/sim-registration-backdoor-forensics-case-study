package p000;

import android.content.Context;
import android.database.ContentObserver;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.internal.vision.zzaq;
import com.google.android.gms.internal.vision.zzba;
import com.google.android.gms.internal.vision.zzbb;

/* renamed from: Xe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18793Xe2 implements InterfaceC19605de2 {

    /* renamed from: c */
    public static C18793Xe2 f7605c;

    /* renamed from: a */
    public final Context f7606a;

    /* renamed from: b */
    public final ContentObserver f7607b;

    public C18793Xe2(Context context) {
        this.f7606a = context;
        C20127gf2 c20127gf2 = new C20127gf2(this, null);
        this.f7607b = c20127gf2;
        context.getContentResolver().registerContentObserver(zzaq.zza, true, c20127gf2);
    }

    /* renamed from: a */
    public static C18793Xe2 m65596a(Context context) {
        C18793Xe2 c18793Xe2;
        C18793Xe2 c18793Xe22;
        synchronized (C18793Xe2.class) {
            try {
                if (f7605c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        c18793Xe22 = new C18793Xe2(context);
                    } else {
                        c18793Xe22 = new C18793Xe2();
                    }
                    f7605c = c18793Xe22;
                }
                c18793Xe2 = f7605c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c18793Xe2;
    }

    /* renamed from: b */
    public static synchronized void m65595b() {
        Context context;
        synchronized (C18793Xe2.class) {
            try {
                C18793Xe2 c18793Xe2 = f7605c;
                if (c18793Xe2 != null && (context = c18793Xe2.f7606a) != null && c18793Xe2.f7607b != null) {
                    context.getContentResolver().unregisterContentObserver(f7605c.f7607b);
                }
                f7605c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ String m65594c(String str) {
        return zzaq.zza(this.f7606a.getContentResolver(), str, null);
    }

    @Override // p000.InterfaceC19605de2
    /* renamed from: d */
    public final String zza(String str) {
        if (this.f7606a == null) {
            return null;
        }
        try {
            return (String) zzbb.zza(new zzba(this, str) { // from class: Re2

                /* renamed from: a */
                public final C18793Xe2 f5583a;

                /* renamed from: b */
                public final String f5584b;

                {
                    this.f5583a = this;
                    this.f5584b = str;
                }

                @Override // com.google.android.gms.internal.vision.zzba
                public final Object zza() {
                    return this.f5583a.m65594c(this.f5584b);
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

    public C18793Xe2() {
        this.f7606a = null;
        this.f7607b = null;
    }
}