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
    public static GoogleSignatureVerifier f44668c;

    /* renamed from: a */
    public final Context f44669a;

    /* renamed from: b */
    public volatile String f44670b;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f44669a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static final AbstractBinderC20822kz2 m48630a(PackageInfo packageInfo, AbstractBinderC20822kz2... abstractBinderC20822kz2Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            LB2 lb2 = new LB2(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < abstractBinderC20822kz2Arr.length; i++) {
                if (abstractBinderC20822kz2Arr[i].equals(lb2)) {
                    return abstractBinderC20822kz2Arr[i];
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
                if (f44668c == null) {
                    IH2.m67925e(context);
                    f44668c = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f44668c;
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
            kz2[] r4 = p000.SF2.f5564a
            kz2 r4 = m48630a(r2, r4)
            goto L45
        L39:
            kz2[] r4 = p000.SF2.f5564a
            r4 = r4[r1]
            kz2[] r5 = new p000.AbstractBinderC20822kz2[r0]
            r5[r1] = r4
            kz2 r4 = m48630a(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzb(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* renamed from: b */
    public final UK2 m48629b(String str, boolean z, boolean z2) {
        UK2 m66069c;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return UK2.m66069c("null pkg");
        }
        if (!str.equals(this.f44670b)) {
            if (IH2.m67923g()) {
                m66069c = IH2.m67928b(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44669a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f44669a.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44669a);
                    if (packageInfo == null) {
                        m66069c = UK2.m66069c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            LB2 lb2 = new LB2(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            UK2 m67929a = IH2.m67929a(str2, lb2, honorsDebugCertificates, false);
                            if (m67929a.f6286a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && IH2.m67929a(str2, lb2, false, true).f6286a) {
                                m66069c = UK2.m66069c("debuggable release cert app rejected");
                            } else {
                                m66069c = m67929a;
                            }
                        } else {
                            m66069c = UK2.m66069c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    return UK2.m66068d("no pkg ".concat(str), e);
                }
            }
            if (m66069c.f6286a) {
                this.f44670b = str;
            }
            return m66069c;
        }
        return UK2.m66070b();
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
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f44669a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(@Nullable String str) {
        UK2 m48629b = m48629b(str, false, false);
        m48629b.m66067e();
        return m48629b.f6286a;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        UK2 m66069c;
        int length;
        String[] packagesForUid = this.f44669a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m66069c = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    m66069c = m48629b(packagesForUid[i2], false, false);
                    if (m66069c.f6286a) {
                        break;
                    }
                    i2++;
                } else {
                    Preconditions.checkNotNull(m66069c);
                    break;
                }
            }
        } else {
            m66069c = UK2.m66069c("no pkgs");
        }
        m66069c.m66067e();
        return m66069c.f6286a;
    }
}
