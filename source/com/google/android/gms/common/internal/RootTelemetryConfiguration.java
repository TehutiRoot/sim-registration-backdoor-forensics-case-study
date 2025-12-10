package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
/* loaded from: classes3.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzaj();

    /* renamed from: a */
    public final int f45119a;

    /* renamed from: b */
    public final boolean f45120b;

    /* renamed from: c */
    public final boolean f45121c;

    /* renamed from: d */
    public final int f45122d;

    /* renamed from: e */
    public final int f45123e;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) boolean z, @SafeParcelable.Param(m48388id = 3) boolean z2, @SafeParcelable.Param(m48388id = 4) int i2, @SafeParcelable.Param(m48388id = 5) int i3) {
        this.f45119a = i;
        this.f45120b = z;
        this.f45121c = z2;
        this.f45122d = i2;
        this.f45123e = i3;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.f45122d;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.f45123e;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.f45120b;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.f45121c;
    }

    @KeepForSdk
    public int getVersion() {
        return this.f45119a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
