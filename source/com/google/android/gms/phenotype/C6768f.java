package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.PhenotypeFlag;

/* renamed from: com.google.android.gms.phenotype.f */
/* loaded from: classes3.dex */
public final class C6768f extends PhenotypeFlag {
    public C6768f(PhenotypeFlag.Factory factory, String str, String str2) {
        super(factory, str, str2, null);
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    /* renamed from: j */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f48513b, null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.f48513b);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            }
            return null;
        }
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    public final /* synthetic */ Object zza(String str) {
        return str;
    }
}
