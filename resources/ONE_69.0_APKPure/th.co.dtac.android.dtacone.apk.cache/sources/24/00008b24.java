package com.google.android.gms.common;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes3.dex */
public class PackageSignatureVerifier {

    /* renamed from: a */
    public static C21156mc2 f44683a;

    /* renamed from: b */
    public static volatile C19253bc2 f44684b;

    /* renamed from: a */
    public static C21156mc2 m48625a(Context context) {
        C21156mc2 c21156mc2;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (f44683a == null) {
                    f44683a = new C21156mc2(context);
                }
                c21156mc2 = f44683a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21156mc2;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        String str2;
        PackageVerificationResult packageVerificationResult;
        String str3;
        PackageVerificationResult packageVerificationResult2;
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        m48625a(context);
        if (FI2.m68436f()) {
            if (true != honorsDebugCertificates) {
                str2 = "-0";
            } else {
                str2 = "-1";
            }
            String concat = String.valueOf(str).concat(str2);
            if (f44684b != null) {
                str3 = f44684b.f39138a;
                if (str3.equals(concat)) {
                    packageVerificationResult2 = f44684b.f39139b;
                    return packageVerificationResult2;
                }
            }
            m48625a(context);
            RL2 m68439c = FI2.m68439c(str, honorsDebugCertificates, false, false);
            if (m68439c.f5487a) {
                f44684b = new C19253bc2(concat, PackageVerificationResult.zzd(str, m68439c.f5490d));
                packageVerificationResult = f44684b.f39139b;
                return packageVerificationResult;
            }
            Preconditions.checkNotNull(m68439c.f5488b);
            return PackageVerificationResult.zza(str, m68439c.f5488b, m68439c.f5489c);
        }
        throw new zzae();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzb();
            return queryPackageSignatureVerified;
        } catch (SecurityException unused) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (queryPackageSignatureVerified2.zzc()) {
            }
            return queryPackageSignatureVerified2;
        }
    }
}