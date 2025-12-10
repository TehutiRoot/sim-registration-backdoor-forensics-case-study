package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SafeParcelable.Class(creator = "PolygonOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzt();

    /* renamed from: a */
    public final List f47989a;

    /* renamed from: b */
    public final List f47990b;

    /* renamed from: c */
    public float f47991c;

    /* renamed from: d */
    public int f47992d;

    /* renamed from: e */
    public int f47993e;

    /* renamed from: f */
    public float f47994f;

    /* renamed from: g */
    public boolean f47995g;

    /* renamed from: h */
    public boolean f47996h;

    /* renamed from: i */
    public boolean f47997i;

    /* renamed from: j */
    public int f47998j;

    /* renamed from: k */
    public List f47999k;

    public PolygonOptions() {
        this.f47991c = 10.0f;
        this.f47992d = -16777216;
        this.f47993e = 0;
        this.f47994f = 0.0f;
        this.f47995g = true;
        this.f47996h = false;
        this.f47997i = false;
        this.f47998j = 0;
        this.f47999k = null;
        this.f47989a = new ArrayList();
        this.f47990b = new ArrayList();
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "point must not be null.");
        this.f47989a.add(latLng);
        return this;
    }

    @NonNull
    public PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.f47989a.add(latLng);
        }
        return this;
    }

    @NonNull
    public PolygonOptions addHole(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.f47990b.add(arrayList);
        return this;
    }

    @NonNull
    public PolygonOptions clickable(boolean z) {
        this.f47997i = z;
        return this;
    }

    @NonNull
    public PolygonOptions fillColor(int i) {
        this.f47993e = i;
        return this;
    }

    @NonNull
    public PolygonOptions geodesic(boolean z) {
        this.f47996h = z;
        return this;
    }

    public int getFillColor() {
        return this.f47993e;
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        return this.f47990b;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.f47989a;
    }

    public int getStrokeColor() {
        return this.f47992d;
    }

    public int getStrokeJointType() {
        return this.f47998j;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.f47999k;
    }

    public float getStrokeWidth() {
        return this.f47991c;
    }

    public float getZIndex() {
        return this.f47994f;
    }

    public boolean isClickable() {
        return this.f47997i;
    }

    public boolean isGeodesic() {
        return this.f47996h;
    }

    public boolean isVisible() {
        return this.f47995g;
    }

    @NonNull
    public PolygonOptions strokeColor(int i) {
        this.f47992d = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokeJointType(int i) {
        this.f47998j = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokePattern(@Nullable List<PatternItem> list) {
        this.f47999k = list;
        return this;
    }

    @NonNull
    public PolygonOptions strokeWidth(float f) {
        this.f47991c = f;
        return this;
    }

    @NonNull
    public PolygonOptions visible(boolean z) {
        this.f47995g = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeList(parcel, 3, this.f47990b, false);
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public PolygonOptions zIndex(float f) {
        this.f47994f = f;
        return this;
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.f47989a.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.f47989a = list;
        this.f47990b = list2;
        this.f47991c = f;
        this.f47992d = i;
        this.f47993e = i2;
        this.f47994f = f2;
        this.f47995g = z;
        this.f47996h = z2;
        this.f47997i = z3;
        this.f47998j = i3;
        this.f47999k = list3;
    }
}
