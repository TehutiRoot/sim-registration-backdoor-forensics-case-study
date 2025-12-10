package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes3.dex */
public class PackageVerificationResult {

    /* renamed from: a */
    public final String f44673a;

    /* renamed from: b */
    public final boolean f44674b;

    /* renamed from: c */
    public final String f44675c;

    /* renamed from: d */
    public final Throwable f44676d;

    public PackageVerificationResult(String str, int i, boolean z, String str2, Throwable th2) {
        this.f44673a = str;
        this.f44674b = z;
        this.f44675c = str2;
        this.f44676d = th2;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String str, @NonNull String str2, @Nullable Throwable th2) {
        return new PackageVerificationResult(str, 1, false, str2, th2);
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String str, int i) {
        return new PackageVerificationResult(str, i, true, null, null);
    }

    public final void zzb() {
        if (!this.f44674b) {
            String str = this.f44675c;
            Throwable th2 = this.f44676d;
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(str));
            if (th2 != null) {
                throw new SecurityException(concat, th2);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.f44674b;
    }
}
