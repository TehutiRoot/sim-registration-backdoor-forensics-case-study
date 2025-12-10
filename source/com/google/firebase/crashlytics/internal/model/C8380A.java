package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.A */
/* loaded from: classes4.dex */
public final class C8380A extends StaticSessionData {

    /* renamed from: a */
    public final StaticSessionData.AppData f54939a;

    /* renamed from: b */
    public final StaticSessionData.OsData f54940b;

    /* renamed from: c */
    public final StaticSessionData.DeviceData f54941c;

    public C8380A(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData != null) {
            this.f54939a = appData;
            if (osData != null) {
                this.f54940b = osData;
                if (deviceData != null) {
                    this.f54941c = deviceData;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.AppData appData() {
        return this.f54939a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.f54941c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        if (this.f54939a.equals(staticSessionData.appData()) && this.f54940b.equals(staticSessionData.osData()) && this.f54941c.equals(staticSessionData.deviceData())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f54939a.hashCode() ^ 1000003) * 1000003) ^ this.f54940b.hashCode()) * 1000003) ^ this.f54941c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.f54940b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f54939a + ", osData=" + this.f54940b + ", deviceData=" + this.f54941c + "}";
    }
}
