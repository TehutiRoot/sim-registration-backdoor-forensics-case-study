package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import javax.annotation.Nullable;

@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes3.dex */
public class GoogleSignatureVerifier {

    /* renamed from: c */
    public static GoogleSignatureVerifier f44680c;

    /* renamed from: a */
    public final Context f44681a;

    /* renamed from: b */
    public volatile String f44682b;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f44681a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static final AbstractBinderC20220hA2 m48627a(PackageInfo packageInfo, AbstractBinderC20220hA2... abstractBinderC20220hA2Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            IC2 ic2 = new IC2(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC20220hA2Arr.length; i++) {
                if (abstractBinderC20220hA2Arr[i].equals(ic2)) {
                    return abstractBinderC20220hA2Arr[i];
                }
            }
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (f44680c == null) {
                    FI2.m68437e(context);
                    f44680c = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f44680c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzb(@androidx.annotation.NonNull android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            hA2[] r4 = p000.PG2.f4742a
            hA2 r4 = m48627a(r2, r4)
            goto L45
        L39:
            hA2[] r4 = p000.PG2.f4742a
            r4 = r4[r1]
            hA2[] r5 = new p000.AbstractBinderC20220hA2[r0]
            r5[r1] = r4
            hA2 r4 = m48627a(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* renamed from: b */
    public final RL2 m48626b(String str, boolean z, boolean z2) {
        RL2 m66664c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return RL2.m66664c("null pkg");
        }
        if (!str.equals(this.f44682b)) {
            if (FI2.m68435g()) {
                m66664c = FI2.m68440b(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44681a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f44681a.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44681a);
                    if (packageInfo == null) {
                        m66664c = RL2.m66664c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            IC2 ic2 = new IC2(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            RL2 m68441a = FI2.m68441a(str2, ic2, honorsDebugCertificates, false);
                            if (m68441a.f5487a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && FI2.m68441a(str2, ic2, false, true).f5487a) {
                                m66664c = RL2.m66664c("debuggable release cert app rejected");
                            } else {
                                m66664c = m68441a;
                            }
                        } else {
                            m66664c = RL2.m66664c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return RL2.m66663d("no pkg ".concat(str), e);
                }
            }
            if (m66664c.f5487a) {
                this.f44682b = str;
            }
            return m66664c;
        }
        return RL2.m66665b();
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44681a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@Nullable String str) {
        RL2 m48626b = m48626b(str, false, false);
        m48626b.m66662e();
        return m48626b.f5487a;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        RL2 m66664c;
        int length;
        String[] packagesForUid = this.f44681a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m66664c = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    m66664c = m48626b(packagesForUid[i2], false, false);
                    if (m66664c.f5487a) {
                        break;
                    }
                    i2++;
                } else {
                    Preconditions.checkNotNull(m66664c);
                    break;
                }
            }
        } else {
            m66664c = RL2.m66664c("no pkgs");
        }
        m66664c.m66662e();
        return m66664c.f5487a;
    }
}