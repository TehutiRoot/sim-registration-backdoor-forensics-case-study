package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* renamed from: com.google.firebase.crashlytics.internal.common.a */
/* loaded from: classes4.dex */
public final class C8348a extends InstallIdProvider.InstallIds {

    /* renamed from: a */
    public final String f54853a;

    /* renamed from: b */
    public final String f54854b;

    /* renamed from: c */
    public final String f54855c;

    public C8348a(String str, String str2, String str3) {
        if (str != null) {
            this.f54853a = str;
            this.f54854b = str2;
            this.f54855c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (this.f54853a.equals(installIds.getCrashlyticsInstallId()) && ((str = this.f54854b) != null ? str.equals(installIds.getFirebaseInstallationId()) : installIds.getFirebaseInstallationId() == null)) {
            String str2 = this.f54855c;
            if (str2 == null) {
                if (installIds.getFirebaseAuthenticationToken() == null) {
                    return true;
                }
            } else if (str2.equals(installIds.getFirebaseAuthenticationToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getCrashlyticsInstallId() {
        return this.f54853a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseAuthenticationToken() {
        return this.f54855c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public String getFirebaseInstallationId() {
        return this.f54854b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f54853a.hashCode() ^ 1000003) * 1000003;
        String str = this.f54854b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f54855c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f54853a + ", firebaseInstallationId=" + this.f54854b + ", firebaseAuthenticationToken=" + this.f54855c + "}";
    }
}