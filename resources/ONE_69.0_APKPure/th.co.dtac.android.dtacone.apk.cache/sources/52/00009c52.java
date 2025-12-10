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
    public final boolean f47792a;

    /* renamed from: b */
    public final boolean f47793b;

    /* renamed from: c */
    public final boolean f47794c;

    /* renamed from: d */
    public final boolean f47795d;

    /* renamed from: e */
    public final boolean f47796e;

    /* renamed from: f */
    public final boolean f47797f;

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(m48385id = 1) boolean z, @SafeParcelable.Param(m48385id = 2) boolean z2, @SafeParcelable.Param(m48385id = 3) boolean z3, @SafeParcelable.Param(m48385id = 4) boolean z4, @SafeParcelable.Param(m48385id = 5) boolean z5, @SafeParcelable.Param(m48385id = 6) boolean z6) {
        this.f47792a = z;
        this.f47793b = z2;
        this.f47794c = z3;
        this.f47795d = z4;
        this.f47796e = z5;
        this.f47797f = z6;
    }

    @Nullable
    public static LocationSettingsStates fromIntent(@NonNull Intent intent) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.f47797f;
    }

    public boolean isBleUsable() {
        return this.f47794c;
    }

    public boolean isGpsPresent() {
        return this.f47795d;
    }

    public boolean isGpsUsable() {
        return this.f47792a;
    }

    public boolean isLocationPresent() {
        return this.f47795d || this.f47796e;
    }

    public boolean isLocationUsable() {
        return this.f47792a || this.f47793b;
    }

    public boolean isNetworkLocationPresent() {
        return this.f47796e;
    }

    public boolean isNetworkLocationUsable() {
        return this.f47793b;
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