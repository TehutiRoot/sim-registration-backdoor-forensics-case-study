package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzbu();

    /* renamed from: a */
    public final boolean f47780a;

    /* renamed from: b */
    public final boolean f47781b;

    /* renamed from: c */
    public final boolean f47782c;

    /* renamed from: d */
    public final boolean f47783d;

    /* renamed from: e */
    public final boolean f47784e;

    /* renamed from: f */
    public final boolean f47785f;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(m48388id = 1) boolean z, @SafeParcelable.Param(m48388id = 2) boolean z2, @SafeParcelable.Param(m48388id = 3) boolean z3, @SafeParcelable.Param(m48388id = 4) boolean z4, @SafeParcelable.Param(m48388id = 5) boolean z5, @SafeParcelable.Param(m48388id = 6) boolean z6) {
        this.f47780a = z;
        this.f47781b = z2;
        this.f47782c = z3;
        this.f47783d = z4;
        this.f47784e = z5;
        this.f47785f = z6;
    }

    @Nullable
    public static LocationSettingsStates fromIntent(@NonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.f47785f;
    }

    public boolean isBleUsable() {
        return this.f47782c;
    }

    public boolean isGpsPresent() {
        return this.f47783d;
    }

    public boolean isGpsUsable() {
        return this.f47780a;
    }

    public boolean isLocationPresent() {
        return this.f47783d || this.f47784e;
    }

    public boolean isLocationUsable() {
        return this.f47780a || this.f47781b;
    }

    public boolean isNetworkLocationPresent() {
        return this.f47784e;
    }

    public boolean isNetworkLocationUsable() {
        return this.f47781b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
