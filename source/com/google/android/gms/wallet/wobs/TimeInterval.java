package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TimeIntervalCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzl();

    /* renamed from: a */
    public long f48900a;

    /* renamed from: b */
    public long f48901b;

    @SafeParcelable.Constructor
    public TimeInterval(@SafeParcelable.Param(m48388id = 2) long j, @SafeParcelable.Param(m48388id = 3) long j2) {
        this.f48900a = j;
        this.f48901b = j2;
    }

    public long getEndTimestamp() {
        return this.f48901b;
    }

    public long getStartTimestamp() {
        return this.f48900a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 2, this.f48900a);
        SafeParcelWriter.writeLong(parcel, 3, this.f48901b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
