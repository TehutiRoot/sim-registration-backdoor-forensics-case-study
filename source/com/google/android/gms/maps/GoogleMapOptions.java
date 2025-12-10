package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();

    /* renamed from: u */
    public static final Integer f47837u = Integer.valueOf(Color.argb(255, 236, 233, 225));

    /* renamed from: a */
    public Boolean f47838a;

    /* renamed from: b */
    public Boolean f47839b;

    /* renamed from: c */
    public int f47840c;

    /* renamed from: d */
    public CameraPosition f47841d;

    /* renamed from: e */
    public Boolean f47842e;

    /* renamed from: f */
    public Boolean f47843f;

    /* renamed from: g */
    public Boolean f47844g;

    /* renamed from: h */
    public Boolean f47845h;

    /* renamed from: i */
    public Boolean f47846i;

    /* renamed from: j */
    public Boolean f47847j;

    /* renamed from: k */
    public Boolean f47848k;

    /* renamed from: l */
    public Boolean f47849l;

    /* renamed from: m */
    public Boolean f47850m;

    /* renamed from: n */
    public Float f47851n;

    /* renamed from: o */
    public Float f47852o;

    /* renamed from: p */
    public LatLngBounds f47853p;

    /* renamed from: q */
    public Boolean f47854q;

    /* renamed from: r */
    public Integer f47855r;

    /* renamed from: s */
    public String f47856s;

    /* renamed from: t */
    public int f47857t;

    public GoogleMapOptions() {
        this.f47840c = -1;
        this.f47851n = null;
        this.f47852o = null;
        this.f47853p = null;
        this.f47855r = null;
        this.f47856s = null;
    }

    @Nullable
    public static GoogleMapOptions createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        String string;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
            GoogleMapOptions googleMapOptions = new GoogleMapOptions();
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_mapType)) {
                googleMapOptions.mapType(obtainAttributes.getInt(R.styleable.MapAttrs_mapType, -1));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_zOrderOnTop)) {
                googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_useViewLifecycle)) {
                googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, false));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiCompass)) {
                googleMapOptions.compassEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
                googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
                googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
                googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
                googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
                googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiZoomControls)) {
                googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_liteMode)) {
                googleMapOptions.liteMode(obtainAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_uiMapToolbar)) {
                googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, true));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_ambientEnabled)) {
                googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.minZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraMinZoomPreference)) {
                googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_backgroundColor)) {
                googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes.getColor(R.styleable.MapAttrs_backgroundColor, f47837u.intValue())));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_mapId) && (string = obtainAttributes.getString(R.styleable.MapAttrs_mapId)) != null && !string.isEmpty()) {
                googleMapOptions.mapId(string);
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_mapColorScheme)) {
                googleMapOptions.mapColorScheme(obtainAttributes.getInt(R.styleable.MapAttrs_mapColorScheme, 0));
            }
            googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
            googleMapOptions.camera(zza(context, attributeSet));
            obtainAttributes.recycle();
            return googleMapOptions;
        }
        return null;
    }

    @Nullable
    public static CameraPosition zza(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        float f;
        float f2;
        if (context != null && attributeSet != null) {
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLat)) {
                f = obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0f);
            } else {
                f = 0.0f;
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng)) {
                f2 = obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0f);
            } else {
                f2 = 0.0f;
            }
            LatLng latLng = new LatLng(f, f2);
            CameraPosition.Builder builder = CameraPosition.builder();
            builder.target(latLng);
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraZoom)) {
                builder.zoom(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0f));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraBearing)) {
                builder.bearing(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0f));
            }
            if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTilt)) {
                builder.tilt(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0f));
            }
            obtainAttributes.recycle();
            return builder.build();
        }
        return null;
    }

    @Nullable
    public static LatLngBounds zzb(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude)) {
            f = Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f));
        } else {
            f = null;
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude)) {
            f2 = Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f));
        } else {
            f2 = null;
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude)) {
            f3 = Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f));
        } else {
            f3 = null;
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude)) {
            f4 = Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes.recycle();
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
    }

    @NonNull
    public GoogleMapOptions ambientEnabled(boolean z) {
        this.f47850m = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions backgroundColor(@Nullable @ColorInt Integer num) {
        this.f47855r = num;
        return this;
    }

    @NonNull
    public GoogleMapOptions camera(@Nullable CameraPosition cameraPosition) {
        this.f47841d = cameraPosition;
        return this;
    }

    @NonNull
    public GoogleMapOptions compassEnabled(boolean z) {
        this.f47843f = Boolean.valueOf(z);
        return this;
    }

    @Nullable
    public Boolean getAmbientEnabled() {
        return this.f47850m;
    }

    @Nullable
    @ColorInt
    public Integer getBackgroundColor() {
        return this.f47855r;
    }

    @Nullable
    public CameraPosition getCamera() {
        return this.f47841d;
    }

    @Nullable
    public Boolean getCompassEnabled() {
        return this.f47843f;
    }

    @Nullable
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.f47853p;
    }

    @Nullable
    public Boolean getLiteMode() {
        return this.f47848k;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.f47857t;
    }

    @Nullable
    public String getMapId() {
        return this.f47856s;
    }

    @Nullable
    public Boolean getMapToolbarEnabled() {
        return this.f47849l;
    }

    public int getMapType() {
        return this.f47840c;
    }

    @Nullable
    public Float getMaxZoomPreference() {
        return this.f47852o;
    }

    @Nullable
    public Float getMinZoomPreference() {
        return this.f47851n;
    }

    @Nullable
    public Boolean getRotateGesturesEnabled() {
        return this.f47847j;
    }

    @Nullable
    public Boolean getScrollGesturesEnabled() {
        return this.f47844g;
    }

    @Nullable
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.f47854q;
    }

    @Nullable
    public Boolean getTiltGesturesEnabled() {
        return this.f47846i;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.f47839b;
    }

    @Nullable
    public Boolean getZOrderOnTop() {
        return this.f47838a;
    }

    @Nullable
    public Boolean getZoomControlsEnabled() {
        return this.f47842e;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.f47845h;
    }

    @NonNull
    public GoogleMapOptions latLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds) {
        this.f47853p = latLngBounds;
        return this;
    }

    @NonNull
    public GoogleMapOptions liteMode(boolean z) {
        this.f47848k = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapColorScheme(@MapColorScheme int i) {
        this.f47857t = i;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapId(@NonNull String str) {
        this.f47856s = str;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.f47849l = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapType(int i) {
        this.f47840c = i;
        return this;
    }

    @NonNull
    public GoogleMapOptions maxZoomPreference(float f) {
        this.f47852o = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions minZoomPreference(float f) {
        this.f47851n = Float.valueOf(f);
        return this;
    }

    @NonNull
    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.f47847j = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.f47844g = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.f47854q = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.f47846i = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.f47840c)).add("LiteMode", this.f47848k).add("Camera", this.f47841d).add("CompassEnabled", this.f47843f).add("ZoomControlsEnabled", this.f47842e).add("ScrollGesturesEnabled", this.f47844g).add("ZoomGesturesEnabled", this.f47845h).add("TiltGesturesEnabled", this.f47846i).add("RotateGesturesEnabled", this.f47847j).add("ScrollGesturesEnabledDuringRotateOrZoom", this.f47854q).add("MapToolbarEnabled", this.f47849l).add("AmbientEnabled", this.f47850m).add("MinZoomPreference", this.f47851n).add("MaxZoomPreference", this.f47852o).add("BackgroundColor", this.f47855r).add("LatLngBoundsForCameraTarget", this.f47853p).add("ZOrderOnTop", this.f47838a).add("UseViewLifecycleInFragment", this.f47839b).add("mapColorScheme", Integer.valueOf(this.f47857t)).toString();
    }

    @NonNull
    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.f47839b = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, zza.zza(this.f47838a));
        SafeParcelWriter.writeByte(parcel, 3, zza.zza(this.f47839b));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, zza.zza(this.f47842e));
        SafeParcelWriter.writeByte(parcel, 7, zza.zza(this.f47843f));
        SafeParcelWriter.writeByte(parcel, 8, zza.zza(this.f47844g));
        SafeParcelWriter.writeByte(parcel, 9, zza.zza(this.f47845h));
        SafeParcelWriter.writeByte(parcel, 10, zza.zza(this.f47846i));
        SafeParcelWriter.writeByte(parcel, 11, zza.zza(this.f47847j));
        SafeParcelWriter.writeByte(parcel, 12, zza.zza(this.f47848k));
        SafeParcelWriter.writeByte(parcel, 14, zza.zza(this.f47849l));
        SafeParcelWriter.writeByte(parcel, 15, zza.zza(this.f47850m));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, zza.zza(this.f47854q));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.writeInt(parcel, 23, getMapColorScheme());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.f47838a = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.f47842e = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.f47845h = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i2) {
        this.f47840c = -1;
        this.f47851n = null;
        this.f47852o = null;
        this.f47853p = null;
        this.f47855r = null;
        this.f47856s = null;
        this.f47838a = zza.zzb(b);
        this.f47839b = zza.zzb(b2);
        this.f47840c = i;
        this.f47841d = cameraPosition;
        this.f47842e = zza.zzb(b3);
        this.f47843f = zza.zzb(b4);
        this.f47844g = zza.zzb(b5);
        this.f47845h = zza.zzb(b6);
        this.f47846i = zza.zzb(b7);
        this.f47847j = zza.zzb(b8);
        this.f47848k = zza.zzb(b9);
        this.f47849l = zza.zzb(b10);
        this.f47850m = zza.zzb(b11);
        this.f47851n = f;
        this.f47852o = f2;
        this.f47853p = latLngBounds;
        this.f47854q = zza.zzb(b12);
        this.f47855r = num;
        this.f47856s = str;
        this.f47857t = i2;
    }
}
