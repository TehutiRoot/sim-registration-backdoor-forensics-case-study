package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.D */
/* loaded from: classes4.dex */
public final class C8398D extends StaticSessionData.OsData {

    /* renamed from: a */
    public final String f55116a;

    /* renamed from: b */
    public final String f55117b;

    /* renamed from: c */
    public final boolean f55118c;

    public C8398D(String str, String str2, boolean z) {
        if (str != null) {
            this.f55116a = str;
            if (str2 != null) {
                this.f55117b = str2;
                this.f55118c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        if (this.f55116a.equals(osData.osRelease()) && this.f55117b.equals(osData.osCodeName()) && this.f55118c == osData.isRooted()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f55116a.hashCode() ^ 1000003) * 1000003) ^ this.f55117b.hashCode()) * 1000003;
        if (this.f55118c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.f55118c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.f55117b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.f55116a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f55116a + ", osCodeName=" + this.f55117b + ", isRooted=" + this.f55118c + "}";
    }
}