package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "GroundOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzk();
    public static final float NO_DIMENSION = -1.0f;

    /* renamed from: a */
    public BitmapDescriptor f47935a;

    /* renamed from: b */
    public LatLng f47936b;

    /* renamed from: c */
    public float f47937c;

    /* renamed from: d */
    public float f47938d;

    /* renamed from: e */
    public LatLngBounds f47939e;

    /* renamed from: f */
    public float f47940f;

    /* renamed from: g */
    public float f47941g;

    /* renamed from: h */
    public boolean f47942h;

    /* renamed from: i */
    public float f47943i;

    /* renamed from: j */
    public float f47944j;

    /* renamed from: k */
    public float f47945k;

    /* renamed from: l */
    public boolean f47946l;

    public GroundOverlayOptions() {
        this.f47942h = true;
        this.f47943i = 0.0f;
        this.f47944j = 0.5f;
        this.f47945k = 0.5f;
        this.f47946l = false;
    }

    @NonNull
    public GroundOverlayOptions anchor(float f, float f2) {
        this.f47944j = f;
        this.f47945k = f2;
        return this;
    }

    /* renamed from: b */
    public final GroundOverlayOptions m46387b(LatLng latLng, float f, float f2) {
        this.f47936b = latLng;
        this.f47937c = f;
        this.f47938d = f2;
        return this;
    }

    @NonNull
    public GroundOverlayOptions bearing(float f) {
        this.f47940f = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions clickable(boolean z) {
        this.f47946l = z;
        return this;
    }

    public float getAnchorU() {
        return this.f47944j;
    }

    public float getAnchorV() {
        return this.f47945k;
    }

    public float getBearing() {
        return this.f47940f;
    }

    @Nullable
    public LatLngBounds getBounds() {
        return this.f47939e;
    }

    public float getHeight() {
        return this.f47938d;
    }

    @NonNull
    public BitmapDescriptor getImage() {
        return this.f47935a;
    }

    @Nullable
    public LatLng getLocation() {
        return this.f47936b;
    }

    public float getTransparency() {
        return this.f47943i;
    }

    public float getWidth() {
        return this.f47937c;
    }

    public float getZIndex() {
        return this.f47941g;
    }

    @NonNull
    public GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        this.f47935a = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.f47946l;
    }

    public boolean isVisible() {
        return this.f47942h;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f) {
        Preconditions.checkState(this.f47939e == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        m46387b(latLng, f, -1.0f);
        return this;
    }

    @NonNull
    public GroundOverlayOptions positionFromBounds(@NonNull LatLngBounds latLngBounds) {
        boolean z;
        LatLng latLng = this.f47936b;
        String valueOf = String.valueOf(latLng);
        if (latLng == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Position has already been set using position: ".concat(valueOf));
        this.f47939e = latLngBounds;
        return this;
    }

    @NonNull
    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f47943i = f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions visible(boolean z) {
        this.f47942h = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f47935a.zza().asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getLocation(), i, false);
        SafeParcelWriter.writeFloat(parcel, 4, getWidth());
        SafeParcelWriter.writeFloat(parcel, 5, getHeight());
        SafeParcelWriter.writeParcelable(parcel, 6, getBounds(), i, false);
        SafeParcelWriter.writeFloat(parcel, 7, getBearing());
        SafeParcelWriter.writeFloat(parcel, 8, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeFloat(parcel, 10, getTransparency());
        SafeParcelWriter.writeFloat(parcel, 11, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 12, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 13, isClickable());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public GroundOverlayOptions zIndex(float f) {
        this.f47941g = f;
        return this;
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f47942h = true;
        this.f47943i = 0.0f;
        this.f47944j = 0.5f;
        this.f47945k = 0.5f;
        this.f47946l = false;
        this.f47935a = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        this.f47936b = latLng;
        this.f47937c = f;
        this.f47938d = f2;
        this.f47939e = latLngBounds;
        this.f47940f = f3;
        this.f47941g = f4;
        this.f47942h = z;
        this.f47943i = f5;
        this.f47944j = f6;
        this.f47945k = f7;
        this.f47946l = z2;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f, float f2) {
        Preconditions.checkState(this.f47939e == null, "Position has already been set using positionFromBounds");
        Preconditions.checkArgument(latLng != null, "Location must be specified");
        Preconditions.checkArgument(f >= 0.0f, "Width must be non-negative");
        Preconditions.checkArgument(f2 >= 0.0f, "Height must be non-negative");
        m46387b(latLng, f, f2);
        return this;
    }
}
