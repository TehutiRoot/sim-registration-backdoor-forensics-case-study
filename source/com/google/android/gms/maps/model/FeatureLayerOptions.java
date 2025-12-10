package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzbm;

@SafeParcelable.Class(creator = "FeatureLayerOptionsCreator")
/* loaded from: classes3.dex */
public final class FeatureLayerOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<FeatureLayerOptions> CREATOR = new zzg();

    /* renamed from: c */
    public static final zzbm f47921c = zzbm.zzi(FeatureType.ADMINISTRATIVE_AREA_LEVEL_1, FeatureType.ADMINISTRATIVE_AREA_LEVEL_2, FeatureType.COUNTRY, FeatureType.LOCALITY, FeatureType.POSTAL_CODE, FeatureType.SCHOOL_DISTRICT, FeatureType.DATASET);

    /* renamed from: a */
    public final String f47922a;

    /* renamed from: b */
    public final String f47923b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f47924a;

        /* renamed from: b */
        public String f47925b;

        @NonNull
        public FeatureLayerOptions build() {
            String str = this.f47924a;
            if (str != null) {
                if (str.equals(FeatureType.DATASET) && this.f47925b == null) {
                    throw new IllegalArgumentException("A datasetId must be specified for DATASET feature layers.");
                }
                return new FeatureLayerOptions(this, (zzf) null);
            }
            throw new IllegalArgumentException("FeatureType must be specified.");
        }

        @NonNull
        public Builder datasetId(@NonNull String str) {
            this.f47925b = str;
            return this;
        }

        @NonNull
        public Builder featureType(@NonNull @FeatureType String str) {
            Preconditions.checkArgument(FeatureLayerOptions.f47921c.contains(str), "Invalid FeatureType value");
            this.f47924a = str;
            return this;
        }
    }

    public /* synthetic */ FeatureLayerOptions(Builder builder, zzf zzfVar) {
        this.f47922a = builder.f47924a;
        this.f47923b = builder.f47925b;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public String getDatasetId() {
        return this.f47923b;
    }

    @NonNull
    @FeatureType
    public String getFeatureType() {
        return this.f47922a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getFeatureType(), false);
        SafeParcelWriter.writeString(parcel, 2, getDatasetId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public FeatureLayerOptions(String str, String str2) {
        this.f47922a = str;
        this.f47923b = str2;
    }
}
