package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* loaded from: classes3.dex */
public class PackageVerificationResult {

    /* renamed from: a */
    public final String f44685a;

    /* renamed from: b */
    public final boolean f44686b;

    /* renamed from: c */
    public final String f44687c;

    /* renamed from: d */
    public final Throwable f44688d;

    public PackageVerificationResult(String str, int i, boolean z, String str2, Throwable th2) {
        this.f44685a = str;
        this.f44686b = z;
        this.f44687c = str2;
        this.f44688d = th2;
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
        if (!this.f44686b) {
            String str = this.f44687c;
            Throwable th2 = this.f44688d;
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(str));
            if (th2 != null) {
                throw new SecurityException(concat, th2);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.f44686b;
    }
}