package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StyleSpanCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<StyleSpan> CREATOR = new zzae();

    /* renamed from: a */
    public final StrokeStyle f48026a;

    /* renamed from: b */
    public final double f48027b;

    public StyleSpan(int i) {
        this.f48026a = StrokeStyle.colorBuilder(i).build();
        this.f48027b = 1.0d;
    }

    public double getSegments() {
        return this.f48027b;
    }

    @NonNull
    public StrokeStyle getStyle() {
        return this.f48026a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStyle(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getSegments());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StyleSpan(int i, double d) {
        if (d > 0.0d) {
            this.f48026a = StrokeStyle.colorBuilder(i).build();
            this.f48027b = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public StyleSpan(@NonNull StrokeStyle strokeStyle) {
        this.f48026a = strokeStyle;
        this.f48027b = 1.0d;
    }

    @SafeParcelable.Constructor
    public StyleSpan(@NonNull @SafeParcelable.Param(m48388id = 2) StrokeStyle strokeStyle, @SafeParcelable.Param(m48388id = 3) double d) {
        if (d > 0.0d) {
            this.f48026a = strokeStyle;
            this.f48027b = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }
}
