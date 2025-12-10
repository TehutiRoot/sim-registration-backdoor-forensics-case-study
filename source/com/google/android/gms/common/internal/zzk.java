package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* loaded from: classes3.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    /* renamed from: a */
    public Bundle f45185a;

    /* renamed from: b */
    public Feature[] f45186b;

    /* renamed from: c */
    public int f45187c;

    /* renamed from: d */
    public ConnectionTelemetryConfiguration f45188d;

    public zzk(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f45185a = bundle;
        this.f45186b = featureArr;
        this.f45187c = i;
        this.f45188d = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f45185a, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f45186b, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45187c);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45188d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk() {
    }
}
