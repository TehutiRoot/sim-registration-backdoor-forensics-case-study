package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.C */
/* loaded from: classes4.dex */
public final class C8408C extends StaticSessionData.DeviceData {

    /* renamed from: a */
    public final int f55094a;

    /* renamed from: b */
    public final String f55095b;

    /* renamed from: c */
    public final int f55096c;

    /* renamed from: d */
    public final long f55097d;

    /* renamed from: e */
    public final long f55098e;

    /* renamed from: f */
    public final boolean f55099f;

    /* renamed from: g */
    public final int f55100g;

    /* renamed from: h */
    public final String f55101h;

    /* renamed from: i */
    public final String f55102i;

    public C8408C(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f55094a = i;
        if (str != null) {
            this.f55095b = str;
            this.f55096c = i2;
            this.f55097d = j;
            this.f55098e = j2;
            this.f55099f = z;
            this.f55100g = i3;
            if (str2 != null) {
                this.f55101h = str2;
                if (str3 != null) {
                    this.f55102i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int arch() {
        return this.f55094a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.f55096c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.f55098e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        if (this.f55094a == deviceData.arch() && this.f55095b.equals(deviceData.model()) && this.f55096c == deviceData.availableProcessors() && this.f55097d == deviceData.totalRam() && this.f55098e == deviceData.diskSpace() && this.f55099f == deviceData.isEmulator() && this.f55100g == deviceData.state() && this.f55101h.equals(deviceData.manufacturer()) && this.f55102i.equals(deviceData.modelClass())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f55097d;
        long j2 = this.f55098e;
        int hashCode = (((((((((this.f55094a ^ 1000003) * 1000003) ^ this.f55095b.hashCode()) * 1000003) ^ this.f55096c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f55099f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f55100g) * 1000003) ^ this.f55101h.hashCode()) * 1000003) ^ this.f55102i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.f55099f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.f55101h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.f55095b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.f55102i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.f55100g;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f55094a + ", model=" + this.f55095b + ", availableProcessors=" + this.f55096c + ", totalRam=" + this.f55097d + ", diskSpace=" + this.f55098e + ", isEmulator=" + this.f55099f + ", state=" + this.f55100g + ", manufacturer=" + this.f55101h + ", modelClass=" + this.f55102i + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.f55097d;
    }
}
