package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* renamed from: com.google.firebase.crashlytics.internal.model.C */
/* loaded from: classes4.dex */
public final class C8397C extends StaticSessionData.DeviceData {

    /* renamed from: a */
    public final int f55106a;

    /* renamed from: b */
    public final String f55107b;

    /* renamed from: c */
    public final int f55108c;

    /* renamed from: d */
    public final long f55109d;

    /* renamed from: e */
    public final long f55110e;

    /* renamed from: f */
    public final boolean f55111f;

    /* renamed from: g */
    public final int f55112g;

    /* renamed from: h */
    public final String f55113h;

    /* renamed from: i */
    public final String f55114i;

    public C8397C(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f55106a = i;
        if (str != null) {
            this.f55107b = str;
            this.f55108c = i2;
            this.f55109d = j;
            this.f55110e = j2;
            this.f55111f = z;
            this.f55112g = i3;
            if (str2 != null) {
                this.f55113h = str2;
                if (str3 != null) {
                    this.f55114i = str3;
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
        return this.f55106a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int availableProcessors() {
        return this.f55108c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long diskSpace() {
        return this.f55110e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        if (this.f55106a == deviceData.arch() && this.f55107b.equals(deviceData.model()) && this.f55108c == deviceData.availableProcessors() && this.f55109d == deviceData.totalRam() && this.f55110e == deviceData.diskSpace() && this.f55111f == deviceData.isEmulator() && this.f55112g == deviceData.state() && this.f55113h.equals(deviceData.manufacturer()) && this.f55114i.equals(deviceData.modelClass())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        long j = this.f55109d;
        long j2 = this.f55110e;
        int hashCode = (((((((((this.f55106a ^ 1000003) * 1000003) ^ this.f55107b.hashCode()) * 1000003) ^ this.f55108c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f55111f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((hashCode ^ i) * 1000003) ^ this.f55112g) * 1000003) ^ this.f55113h.hashCode()) * 1000003) ^ this.f55114i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public boolean isEmulator() {
        return this.f55111f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String manufacturer() {
        return this.f55113h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String model() {
        return this.f55107b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public String modelClass() {
        return this.f55114i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public int state() {
        return this.f55112g;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f55106a + ", model=" + this.f55107b + ", availableProcessors=" + this.f55108c + ", totalRam=" + this.f55109d + ", diskSpace=" + this.f55110e + ", isEmulator=" + this.f55111f + ", state=" + this.f55112g + ", manufacturer=" + this.f55113h + ", modelClass=" + this.f55114i + "}";
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public long totalRam() {
        return this.f55109d;
    }
}