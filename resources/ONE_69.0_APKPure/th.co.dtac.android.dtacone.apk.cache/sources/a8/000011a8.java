package p000;

import android.content.SharedPreferences;
import com.google.android.gms.internal.clearcut.zzae;
import com.google.android.gms.internal.clearcut.zzao;

/* renamed from: Sc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18462Sc2 extends zzae {
    public C18462Sc2(zzao zzaoVar, String str, String str2) {
        super(zzaoVar, str, str2, null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    /* renamed from: n */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f45531b, null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f45531b);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    public final /* synthetic */ Object zzb(String str) {
        return str;
    }
}