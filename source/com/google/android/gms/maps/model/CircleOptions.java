package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    /* renamed from: a */
    public LatLng f47906a;

    /* renamed from: b */
    public double f47907b;

    /* renamed from: c */
    public float f47908c;

    /* renamed from: d */
    public int f47909d;

    /* renamed from: e */
    public int f47910e;

    /* renamed from: f */
    public float f47911f;

    /* renamed from: g */
    public boolean f47912g;

    /* renamed from: h */
    public boolean f47913h;

    /* renamed from: i */
    public List f47914i;

    public CircleOptions() {
        this.f47906a = null;
        this.f47907b = 0.0d;
        this.f47908c = 10.0f;
        this.f47909d = -16777216;
        this.f47910e = 0;
        this.f47911f = 0.0f;
        this.f47912g = true;
        this.f47913h = false;
        this.f47914i = null;
    }

    @NonNull
    public CircleOptions center(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.f47906a = latLng;
        return this;
    }

    @NonNull
    public CircleOptions clickable(boolean z) {
        this.f47913h = z;
        return this;
    }

    @NonNull
    public CircleOptions fillColor(int i) {
        this.f47910e = i;
        return this;
    }

    @Nullable
    public LatLng getCenter() {
        return this.f47906a;
    }

    public int getFillColor() {
        return this.f47910e;
    }

    public double getRadius() {
        return this.f47907b;
    }

    public int getStrokeColor() {
        return this.f47909d;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.f47914i;
    }

    public float getStrokeWidth() {
        return this.f47908c;
    }

    public float getZIndex() {
        return this.f47911f;
    }

    public boolean isClickable() {
        return this.f47913h;
    }

    public boolean isVisible() {
        return this.f47912g;
    }

    @NonNull
    public CircleOptions radius(double d) {
        this.f47907b = d;
        return this;
    }

    @NonNull
    public CircleOptions strokeColor(int i) {
        this.f47909d = i;
        return this;
    }

    @NonNull
    public CircleOptions strokePattern(@Nullable List<PatternItem> list) {
        this.f47914i = list;
        return this;
    }

    @NonNull
    public CircleOptions strokeWidth(float f) {
        this.f47908c = f;
        return this;
    }

    @NonNull
    public CircleOptions visible(boolean z) {
        this.f47912g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public CircleOptions zIndex(float f) {
        this.f47911f = f;
        return this;
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.f47906a = latLng;
        this.f47907b = d;
        this.f47908c = f;
        this.f47909d = i;
        this.f47910e = i2;
        this.f47911f = f2;
        this.f47912g = z;
        this.f47913h = z2;
        this.f47914i = list;
    }
}
