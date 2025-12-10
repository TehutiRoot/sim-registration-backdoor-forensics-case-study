package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.B */
/* loaded from: classes4.dex */
public final class C8396B extends StaticSessionData.AppData {

    /* renamed from: a */
    public final String f55100a;

    /* renamed from: b */
    public final String f55101b;

    /* renamed from: c */
    public final String f55102c;

    /* renamed from: d */
    public final String f55103d;

    /* renamed from: e */
    public final int f55104e;

    /* renamed from: f */
    public final DevelopmentPlatformProvider f55105f;

    public C8396B(String str, String str2, String str3, String str4, int i, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str != null) {
            this.f55100a = str;
            if (str2 != null) {
                this.f55101b = str2;
                if (str3 != null) {
                    this.f55102c = str3;
                    if (str4 != null) {
                        this.f55103d = str4;
                        this.f55104e = i;
                        if (developmentPlatformProvider != null) {
                            this.f55105f = developmentPlatformProvider;
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
        return this.f55100a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.f55104e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.f55105f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        if (this.f55100a.equals(appData.appIdentifier()) && this.f55101b.equals(appData.versionCode()) && this.f55102c.equals(appData.versionName()) && this.f55103d.equals(appData.installUuid()) && this.f55104e == appData.deliveryMechanism() && this.f55105f.equals(appData.developmentPlatformProvider())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f55100a.hashCode() ^ 1000003) * 1000003) ^ this.f55101b.hashCode()) * 1000003) ^ this.f55102c.hashCode()) * 1000003) ^ this.f55103d.hashCode()) * 1000003) ^ this.f55104e) * 1000003) ^ this.f55105f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.f55103d;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f55100a + ", versionCode=" + this.f55101b + ", versionName=" + this.f55102c + ", installUuid=" + this.f55103d + ", deliveryMechanism=" + this.f55104e + ", developmentPlatformProvider=" + this.f55105f + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.f55101b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.f55102c;
    }
}