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
    public static C21610pb2 f44671a;

    /* renamed from: b */
    public static volatile C19718eb2 f44672b;

    /* renamed from: a */
    public static C21610pb2 m48628a(Context context) {
        C21610pb2 c21610pb2;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (f44671a == null) {
                    f44671a = new C21610pb2(context);
                }
                c21610pb2 = f44671a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c21610pb2;
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
        m48628a(context);
        if (IH2.m67924f()) {
            if (true != honorsDebugCertificates) {
                str2 = "-0";
            } else {
                str2 = "-1";
            }
            String concat = String.valueOf(str).concat(str2);
            if (f44672b != null) {
                str3 = f44672b.f61535a;
                if (str3.equals(concat)) {
                    packageVerificationResult2 = f44672b.f61536b;
                    return packageVerificationResult2;
                }
            }
            m48628a(context);
            UK2 m67927c = IH2.m67927c(str, honorsDebugCertificates, false, false);
            if (m67927c.f6286a) {
                f44672b = new C19718eb2(concat, PackageVerificationResult.zzd(str, m67927c.f6289d));
                packageVerificationResult = f44672b.f61536b;
                return packageVerificationResult;
            }
            Preconditions.checkNotNull(m67927c.f6287b);
            return PackageVerificationResult.zza(str, m67927c.f6287b, m67927c.f6288c);
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
