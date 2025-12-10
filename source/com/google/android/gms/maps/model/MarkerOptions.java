package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;

@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzp();

    /* renamed from: a */
    public LatLng f47955a;

    /* renamed from: b */
    public String f47956b;

    /* renamed from: c */
    public String f47957c;

    /* renamed from: d */
    public BitmapDescriptor f47958d;

    /* renamed from: e */
    public float f47959e;

    /* renamed from: f */
    public float f47960f;

    /* renamed from: g */
    public boolean f47961g;

    /* renamed from: h */
    public boolean f47962h;

    /* renamed from: i */
    public boolean f47963i;

    /* renamed from: j */
    public float f47964j;

    /* renamed from: k */
    public float f47965k;

    /* renamed from: l */
    public float f47966l;

    /* renamed from: m */
    public float f47967m;

    /* renamed from: n */
    public float f47968n;

    /* renamed from: o */
    public int f47969o;

    /* renamed from: p */
    public View f47970p;

    /* renamed from: q */
    public int f47971q;

    /* renamed from: r */
    public String f47972r;

    /* renamed from: s */
    public float f47973s;

    public MarkerOptions() {
        this.f47959e = 0.5f;
        this.f47960f = 1.0f;
        this.f47962h = true;
        this.f47963i = false;
        this.f47964j = 0.0f;
        this.f47965k = 0.5f;
        this.f47966l = 0.0f;
        this.f47967m = 1.0f;
        this.f47969o = 0;
    }

    @NonNull
    public MarkerOptions alpha(float f) {
        this.f47967m = f;
        return this;
    }

    @NonNull
    public MarkerOptions anchor(float f, float f2) {
        this.f47959e = f;
        this.f47960f = f2;
        return this;
    }

    @NonNull
    public MarkerOptions contentDescription(@Nullable String str) {
        this.f47972r = str;
        return this;
    }

    @NonNull
    public MarkerOptions draggable(boolean z) {
        this.f47961g = z;
        return this;
    }

    @NonNull
    public MarkerOptions flat(boolean z) {
        this.f47963i = z;
        return this;
    }

    public float getAlpha() {
        return this.f47967m;
    }

    public float getAnchorU() {
        return this.f47959e;
    }

    public float getAnchorV() {
        return this.f47960f;
    }

    @Nullable
    public BitmapDescriptor getIcon() {
        return this.f47958d;
    }

    public float getInfoWindowAnchorU() {
        return this.f47965k;
    }

    public float getInfoWindowAnchorV() {
        return this.f47966l;
    }

    @NonNull
    public LatLng getPosition() {
        return this.f47955a;
    }

    public float getRotation() {
        return this.f47964j;
    }

    @Nullable
    public String getSnippet() {
        return this.f47957c;
    }

    @Nullable
    public String getTitle() {
        return this.f47956b;
    }

    public float getZIndex() {
        return this.f47968n;
    }

    @NonNull
    public MarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.f47958d = bitmapDescriptor;
        return this;
    }

    @NonNull
    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.f47965k = f;
        this.f47966l = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.f47961g;
    }

    public boolean isFlat() {
        return this.f47963i;
    }

    public boolean isVisible() {
        return this.f47962h;
    }

    @NonNull
    public MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng != null) {
            this.f47955a = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @NonNull
    public MarkerOptions rotation(float f) {
        this.f47964j = f;
        return this;
    }

    @NonNull
    public MarkerOptions snippet(@Nullable String str) {
        this.f47957c = str;
        return this;
    }

    @NonNull
    public MarkerOptions title(@Nullable String str) {
        this.f47956b = str;
        return this;
    }

    @NonNull
    public MarkerOptions visible(boolean z) {
        this.f47962h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.f47958d;
        if (bitmapDescriptor == null) {
            asBinder = null;
        } else {
            asBinder = bitmapDescriptor.zza().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, asBinder, false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.writeInt(parcel, 17, this.f47969o);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.f47970p).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 19, this.f47971q);
        SafeParcelWriter.writeString(parcel, 20, this.f47972r, false);
        SafeParcelWriter.writeFloat(parcel, 21, this.f47973s);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public MarkerOptions zIndex(float f) {
        this.f47968n = f;
        return this;
    }

    public final int zza() {
        return this.f47969o;
    }

    public final int zzb() {
        return this.f47971q;
    }

    @Nullable
    public final View zzc() {
        return this.f47970p;
    }

    @NonNull
    public final MarkerOptions zzd(@AdvancedMarkerOptions.CollisionBehavior int i) {
        this.f47969o = i;
        return this;
    }

    @NonNull
    public final MarkerOptions zze(@Nullable View view) {
        this.f47970p = view;
        return this;
    }

    @NonNull
    public final MarkerOptions zzf(int i) {
        this.f47971q = 1;
        return this;
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        this.f47959e = 0.5f;
        this.f47960f = 1.0f;
        this.f47962h = true;
        this.f47963i = false;
        this.f47964j = 0.0f;
        this.f47965k = 0.5f;
        this.f47966l = 0.0f;
        this.f47967m = 1.0f;
        this.f47969o = 0;
        this.f47955a = latLng;
        this.f47956b = str;
        this.f47957c = str2;
        if (iBinder == null) {
            this.f47958d = null;
        } else {
            this.f47958d = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.f47959e = f;
        this.f47960f = f2;
        this.f47961g = z;
        this.f47962h = z2;
        this.f47963i = z3;
        this.f47964j = f3;
        this.f47965k = f4;
        this.f47966l = f5;
        this.f47967m = f6;
        this.f47968n = f7;
        this.f47971q = i2;
        this.f47969o = i;
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.f47970p = asInterface != null ? (View) ObjectWrapper.unwrap(asInterface) : null;
        this.f47972r = str3;
        this.f47973s = f8;
    }
}
