package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FeatureStyleCreator")
/* loaded from: classes3.dex */
public final class FeatureStyle extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<FeatureStyle> CREATOR = new zzi();

    /* renamed from: a */
    public final Integer f47926a;

    /* renamed from: b */
    public final Integer f47927b;

    /* renamed from: c */
    public final Float f47928c;

    /* renamed from: d */
    public final Float f47929d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public Integer f47930a;

        /* renamed from: b */
        public Integer f47931b;

        /* renamed from: c */
        public Float f47932c;

        /* renamed from: d */
        public Float f47933d;

        @NonNull
        public FeatureStyle build() {
            return new FeatureStyle(this, null);
        }

        @NonNull
        public Builder fillColor(int i) {
            this.f47930a = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder pointRadius(float f) {
            boolean z;
            boolean z2 = false;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Point radius cannot be negative.");
            if (f <= 128.0f) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "The max allowed pointRadius value is 128px.");
            this.f47933d = Float.valueOf(f);
            return this;
        }

        @NonNull
        public Builder strokeColor(int i) {
            this.f47931b = Integer.valueOf(i);
            return this;
        }

        @NonNull
        public Builder strokeWidth(float f) {
            boolean z;
            if (f >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Stroke width cannot be negative.");
            this.f47932c = Float.valueOf(f);
            return this;
        }
    }

    public /* synthetic */ FeatureStyle(Builder builder, zzh zzhVar) {
        this.f47926a = builder.f47930a;
        this.f47927b = builder.f47931b;
        this.f47928c = builder.f47932c;
        this.f47929d = builder.f47933d;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public Integer getFillColor() {
        return this.f47926a;
    }

    @Nullable
    public Float getPointRadius() {
        return this.f47929d;
    }

    @Nullable
    public Integer getStrokeColor() {
        return this.f47927b;
    }

    @Nullable
    public Float getStrokeWidth() {
        return this.f47928c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, getFillColor(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 2, getStrokeColor(), false);
        SafeParcelWriter.writeFloatObject(parcel, 3, getStrokeWidth(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, getPointRadius(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public FeatureStyle(Integer num, Integer num2, Float f, Float f2) {
        this.f47926a = num;
        this.f47927b = num2;
        this.f47928c = f;
        this.f47929d = f2;
    }
}
