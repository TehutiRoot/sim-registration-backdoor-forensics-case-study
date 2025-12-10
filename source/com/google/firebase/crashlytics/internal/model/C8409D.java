package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.D */
/* loaded from: classes4.dex */
public final class C8409D extends StaticSessionData.OsData {

    /* renamed from: a */
    public final String f55104a;

    /* renamed from: b */
    public final String f55105b;

    /* renamed from: c */
    public final boolean f55106c;

    public C8409D(String str, String str2, boolean z) {
        if (str != null) {
            this.f55104a = str;
            if (str2 != null) {
                this.f55105b = str2;
                this.f55106c = z;
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
        if (this.f55104a.equals(osData.osRelease()) && this.f55105b.equals(osData.osCodeName()) && this.f55106c == osData.isRooted()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((this.f55104a.hashCode() ^ 1000003) * 1000003) ^ this.f55105b.hashCode()) * 1000003;
        if (this.f55106c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public boolean isRooted() {
        return this.f55106c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osCodeName() {
        return this.f55105b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public String osRelease() {
        return this.f55104a;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f55104a + ", osCodeName=" + this.f55105b + ", isRooted=" + this.f55106c + "}";
    }
}
