package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationSettingsRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
/* loaded from: classes3.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzbs();

    /* renamed from: a */
    public final List f47772a;

    /* renamed from: b */
    public final boolean f47773b;

    /* renamed from: c */
    public final boolean f47774c;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final ArrayList f47775a = new ArrayList();

        /* renamed from: b */
        public boolean f47776b = false;

        /* renamed from: c */
        public boolean f47777c = false;

        @NonNull
        public Builder addAllLocationRequests(@NonNull Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.f47775a.add(locationRequest);
                }
            }
            return this;
        }

        @NonNull
        public Builder addLocationRequest(@NonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f47775a.add(locationRequest);
            }
            return this;
        }

        @NonNull
        public LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.f47775a, this.f47776b, this.f47777c);
        }

        @NonNull
        public Builder setAlwaysShow(boolean z) {
            this.f47776b = z;
            return this;
        }

        @NonNull
        public Builder setNeedBle(boolean z) {
            this.f47777c = z;
            return this;
        }
    }

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.f47772a = list;
        this.f47773b = z;
        this.f47774c = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.f47772a), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f47773b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f47774c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
