package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@SafeParcelable.Class(creator = "LocationAvailabilityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a */
    public final int f47754a;

    /* renamed from: b */
    public final int f47755b;

    /* renamed from: c */
    public final long f47756c;

    /* renamed from: d */
    public int f47757d;

    /* renamed from: e */
    public final zzbv[] f47758e;
    @NonNull
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);
    @NonNull
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);
    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzbn();

    public LocationAvailability(int i, int i2, int i3, long j, zzbv[] zzbvVarArr, boolean z) {
        this.f47757d = i < 1000 ? 0 : 1000;
        this.f47754a = i2;
        this.f47755b = i3;
        this.f47756c = j;
        this.f47758e = zzbvVarArr;
    }

    @Nullable
    public static LocationAvailability extractLocationAvailability(@NonNull Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean hasLocationAvailability(@Nullable Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY")) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f47754a == locationAvailability.f47754a && this.f47755b == locationAvailability.f47755b && this.f47756c == locationAvailability.f47756c && this.f47757d == locationAvailability.f47757d && Arrays.equals(this.f47758e, locationAvailability.f47758e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47757d));
    }

    public boolean isLocationAvailable() {
        return this.f47757d < 1000;
    }

    @NonNull
    public String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder sb = new StringBuilder(27);
        sb.append("LocationAvailability[");
        sb.append(isLocationAvailable);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47754a);
        SafeParcelWriter.writeInt(parcel, 2, this.f47755b);
        SafeParcelWriter.writeLong(parcel, 3, this.f47756c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47757d);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f47758e, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, isLocationAvailable());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
