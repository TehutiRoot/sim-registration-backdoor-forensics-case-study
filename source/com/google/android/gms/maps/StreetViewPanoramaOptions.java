package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzaq();

    /* renamed from: a */
    public StreetViewPanoramaCamera f47865a;

    /* renamed from: b */
    public String f47866b;

    /* renamed from: c */
    public LatLng f47867c;

    /* renamed from: d */
    public Integer f47868d;

    /* renamed from: e */
    public Boolean f47869e;

    /* renamed from: f */
    public Boolean f47870f;

    /* renamed from: g */
    public Boolean f47871g;

    /* renamed from: h */
    public Boolean f47872h;

    /* renamed from: i */
    public Boolean f47873i;

    /* renamed from: j */
    public StreetViewSource f47874j;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f47869e = bool;
        this.f47870f = bool;
        this.f47871g = bool;
        this.f47872h = bool;
        this.f47874j = StreetViewSource.DEFAULT;
    }

    @Nullable
    public Boolean getPanningGesturesEnabled() {
        return this.f47871g;
    }

    @Nullable
    public String getPanoramaId() {
        return this.f47866b;
    }

    @Nullable
    public LatLng getPosition() {
        return this.f47867c;
    }

    @Nullable
    public Integer getRadius() {
        return this.f47868d;
    }

    @NonNull
    public StreetViewSource getSource() {
        return this.f47874j;
    }

    @Nullable
    public Boolean getStreetNamesEnabled() {
        return this.f47872h;
    }

    @Nullable
    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.f47865a;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.f47873i;
    }

    @Nullable
    public Boolean getUserNavigationEnabled() {
        return this.f47869e;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.f47870f;
    }

    @NonNull
    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.f47871g = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaCamera(@Nullable StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f47865a = streetViewPanoramaCamera;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaId(@Nullable String str) {
        this.f47866b = str;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng) {
        this.f47867c = latLng;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.f47872h = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.f47866b).add("Position", this.f47867c).add("Radius", this.f47868d).add("Source", this.f47874j).add("StreetViewPanoramaCamera", this.f47865a).add("UserNavigationEnabled", this.f47869e).add("ZoomGesturesEnabled", this.f47870f).add("PanningGesturesEnabled", this.f47871g).add("StreetNamesEnabled", this.f47872h).add("UseViewLifecycleInFragment", this.f47873i).toString();
    }

    @NonNull
    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.f47873i = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.f47869e = Boolean.valueOf(z);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i, false);
        SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        SafeParcelWriter.writeByte(parcel, 6, zza.zza(this.f47869e));
        SafeParcelWriter.writeByte(parcel, 7, zza.zza(this.f47870f));
        SafeParcelWriter.writeByte(parcel, 8, zza.zza(this.f47871g));
        SafeParcelWriter.writeByte(parcel, 9, zza.zza(this.f47872h));
        SafeParcelWriter.writeByte(parcel, 10, zza.zza(this.f47873i));
        SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.f47870f = Boolean.valueOf(z);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @NonNull StreetViewSource streetViewSource) {
        this.f47867c = latLng;
        this.f47874j = streetViewSource;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @Nullable Integer num) {
        this.f47867c = latLng;
        this.f47868d = num;
        return this;
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.f47869e = bool;
        this.f47870f = bool;
        this.f47871g = bool;
        this.f47872h = bool;
        this.f47874j = StreetViewSource.DEFAULT;
        this.f47865a = streetViewPanoramaCamera;
        this.f47867c = latLng;
        this.f47868d = num;
        this.f47866b = str;
        this.f47869e = zza.zzb(b);
        this.f47870f = zza.zzb(b2);
        this.f47871g = zza.zzb(b3);
        this.f47872h = zza.zzb(b4);
        this.f47873i = zza.zzb(b5);
        this.f47874j = streetViewSource;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @Nullable Integer num, @NonNull StreetViewSource streetViewSource) {
        this.f47867c = latLng;
        this.f47868d = num;
        this.f47874j = streetViewSource;
        return this;
    }
}
