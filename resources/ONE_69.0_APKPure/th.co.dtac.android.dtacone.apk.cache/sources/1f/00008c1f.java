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
    public final int f45131a;

    /* renamed from: b */
    public final boolean f45132b;

    /* renamed from: c */
    public final boolean f45133c;

    /* renamed from: d */
    public final int f45134d;

    /* renamed from: e */
    public final int f45135e;

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) boolean z, @SafeParcelable.Param(m48385id = 3) boolean z2, @SafeParcelable.Param(m48385id = 4) int i2, @SafeParcelable.Param(m48385id = 5) int i3) {
        this.f45131a = i;
        this.f45132b = z;
        this.f45133c = z2;
        this.f45134d = i2;
        this.f45135e = i3;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.f45134d;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.f45135e;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.f45132b;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.f45133c;
    }

    @KeepForSdk
    public int getVersion() {
        return this.f45131a;
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