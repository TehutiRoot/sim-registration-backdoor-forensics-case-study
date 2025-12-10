package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "PolylineOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzu();

    /* renamed from: a */
    public final List f48001a;

    /* renamed from: b */
    public float f48002b;

    /* renamed from: c */
    public int f48003c;

    /* renamed from: d */
    public float f48004d;

    /* renamed from: e */
    public boolean f48005e;

    /* renamed from: f */
    public boolean f48006f;

    /* renamed from: g */
    public boolean f48007g;

    /* renamed from: h */
    public Cap f48008h;

    /* renamed from: i */
    public Cap f48009i;

    /* renamed from: j */
    public int f48010j;

    /* renamed from: k */
    public List f48011k;

    /* renamed from: l */
    public List f48012l;

    public PolylineOptions() {
        this.f48002b = 10.0f;
        this.f48003c = -16777216;
        this.f48004d = 0.0f;
        this.f48005e = true;
        this.f48006f = false;
        this.f48007g = false;
        this.f48008h = new ButtCap();
        this.f48009i = new ButtCap();
        this.f48010j = 0;
        this.f48011k = null;
        this.f48012l = new ArrayList();
        this.f48001a = new ArrayList();
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(this.f48001a, "point must not be null.");
        this.f48001a.add(latLng);
        return this;
    }

    @NonNull
    public PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Preconditions.checkNotNull(iterable, "points must not be null.");
        for (LatLng latLng : iterable) {
            this.f48001a.add(latLng);
        }
        return this;
    }

    @NonNull
    public PolylineOptions addAllSpans(@NonNull Iterable<StyleSpan> iterable) {
        for (StyleSpan styleSpan : iterable) {
            addSpan(styleSpan);
        }
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan styleSpan) {
        this.f48012l.add(styleSpan);
        return this;
    }

    @NonNull
    public PolylineOptions clickable(boolean z) {
        this.f48007g = z;
        return this;
    }

    @NonNull
    public PolylineOptions color(int i) {
        this.f48003c = i;
        return this;
    }

    @NonNull
    public PolylineOptions endCap(@NonNull Cap cap) {
        this.f48009i = (Cap) Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions geodesic(boolean z) {
        this.f48006f = z;
        return this;
    }

    public int getColor() {
        return this.f48003c;
    }

    @NonNull
    public Cap getEndCap() {
        return this.f48009i.m46396b();
    }

    public int getJointType() {
        return this.f48010j;
    }

    @Nullable
    public List<PatternItem> getPattern() {
        return this.f48011k;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.f48001a;
    }

    @NonNull
    public Cap getStartCap() {
        return this.f48008h.m46396b();
    }

    public float getWidth() {
        return this.f48002b;
    }

    public float getZIndex() {
        return this.f48004d;
    }

    public boolean isClickable() {
        return this.f48007g;
    }

    public boolean isGeodesic() {
        return this.f48006f;
    }

    public boolean isVisible() {
        return this.f48005e;
    }

    @NonNull
    public PolylineOptions jointType(int i) {
        this.f48010j = i;
        return this;
    }

    @NonNull
    public PolylineOptions pattern(@Nullable List<PatternItem> list) {
        this.f48011k = list;
        return this;
    }

    @NonNull
    public PolylineOptions startCap(@NonNull Cap cap) {
        this.f48008h = (Cap) Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @NonNull
    public PolylineOptions visible(boolean z) {
        this.f48005e = z;
        return this;
    }

    @NonNull
    public PolylineOptions width(float f) {
        this.f48002b = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getColor());
        SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        SafeParcelWriter.writeInt(parcel, 11, getJointType());
        SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        ArrayList arrayList = new ArrayList(this.f48012l.size());
        for (StyleSpan styleSpan : this.f48012l) {
            StrokeStyle.Builder builder = new StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.f48002b);
            builder.zzc(this.f48005e);
            arrayList.add(new StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public PolylineOptions zIndex(float f) {
        this.f48004d = f;
        return this;
    }

    @NonNull
    public PolylineOptions addSpan(@NonNull StyleSpan... styleSpanArr) {
        for (StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng... latLngArr) {
        Preconditions.checkNotNull(latLngArr, "points must not be null.");
        Collections.addAll(this.f48001a, latLngArr);
        return this;
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.f48002b = 10.0f;
        this.f48003c = -16777216;
        this.f48004d = 0.0f;
        this.f48005e = true;
        this.f48006f = false;
        this.f48007g = false;
        this.f48008h = new ButtCap();
        this.f48009i = new ButtCap();
        this.f48010j = 0;
        this.f48011k = null;
        this.f48012l = new ArrayList();
        this.f48001a = list;
        this.f48002b = f;
        this.f48003c = i;
        this.f48004d = f2;
        this.f48005e = z;
        this.f48006f = z2;
        this.f48007g = z3;
        if (cap != null) {
            this.f48008h = cap;
        }
        if (cap2 != null) {
            this.f48009i = cap2;
        }
        this.f48010j = i2;
        this.f48011k = list2;
        if (list3 != null) {
            this.f48012l = list3;
        }
    }
}
