package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.A */
/* loaded from: classes4.dex */
public final class C8369A extends StaticSessionData {

    /* renamed from: a */
    public final StaticSessionData.AppData f54951a;

    /* renamed from: b */
    public final StaticSessionData.OsData f54952b;

    /* renamed from: c */
    public final StaticSessionData.DeviceData f54953c;

    public C8369A(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        if (appData != null) {
            this.f54951a = appData;
            if (osData != null) {
                this.f54952b = osData;
                if (deviceData != null) {
                    this.f54953c = deviceData;
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
        return this.f54951a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.DeviceData deviceData() {
        return this.f54953c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        if (this.f54951a.equals(staticSessionData.appData()) && this.f54952b.equals(staticSessionData.osData()) && this.f54953c.equals(staticSessionData.deviceData())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f54951a.hashCode() ^ 1000003) * 1000003) ^ this.f54952b.hashCode()) * 1000003) ^ this.f54953c.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public StaticSessionData.OsData osData() {
        return this.f54952b;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f54951a + ", osData=" + this.f54952b + ", deviceData=" + this.f54953c + "}";
    }
}