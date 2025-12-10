package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.B */
/* loaded from: classes4.dex */
public final class C8407B extends StaticSessionData.AppData {

    /* renamed from: a */
    public final String f55088a;

    /* renamed from: b */
    public final String f55089b;

    /* renamed from: c */
    public final String f55090c;

    /* renamed from: d */
    public final String f55091d;

    /* renamed from: e */
    public final int f55092e;

    /* renamed from: f */
    public final DevelopmentPlatformProvider f55093f;

    public C8407B(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str != null) {
            this.f55088a = str;
            if (str2 != null) {
                this.f55089b = str2;
                if (str3 != null) {
                    this.f55090c = str3;
                    if (str4 != null) {
                        this.f55091d = str4;
                        this.f55092e = i;
                        if (developmentPlatformProvider != null) {
                            this.f55093f = developmentPlatformProvider;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.f55088a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.f55092e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f55093f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        if (this.f55088a.equals(appData.appIdentifier()) && this.f55089b.equals(appData.versionCode()) && this.f55090c.equals(appData.versionName()) && this.f55091d.equals(appData.installUuid()) && this.f55092e == appData.deliveryMechanism() && this.f55093f.equals(appData.developmentPlatformProvider())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f55088a.hashCode() ^ 1000003) * 1000003) ^ this.f55089b.hashCode()) * 1000003) ^ this.f55090c.hashCode()) * 1000003) ^ this.f55091d.hashCode()) * 1000003) ^ this.f55092e) * 1000003) ^ this.f55093f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.f55091d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f55088a + ", versionCode=" + this.f55089b + ", versionName=" + this.f55090c + ", installUuid=" + this.f55091d + ", deliveryMechanism=" + this.f55092e + ", developmentPlatformProvider=" + this.f55093f + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.f55089b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.f55090c;
    }
}
