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
import com.google.android.gms.internal.maps.zzaw;
import com.google.android.gms.internal.maps.zzax;

@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzak();

    /* renamed from: a */
    public zzax f48029a;

    /* renamed from: b */
    public TileProvider f48030b;

    /* renamed from: c */
    public boolean f48031c;

    /* renamed from: d */
    public float f48032d;

    /* renamed from: e */
    public boolean f48033e;

    /* renamed from: f */
    public float f48034f;

    public TileOverlayOptions() {
        this.f48031c = true;
        this.f48033e = true;
        this.f48034f = 0.0f;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z) {
        this.f48033e = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.f48033e;
    }

    @Nullable
    public TileProvider getTileProvider() {
        return this.f48030b;
    }

    public float getTransparency() {
        return this.f48034f;
    }

    public float getZIndex() {
        return this.f48032d;
    }

    public boolean isVisible() {
        return this.f48031c;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        this.f48030b = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.f48029a = new BinderC18226Pb2(this, tileProvider);
        return this;
    }

    @NonNull
    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.f48034f = f;
        return this;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z) {
        this.f48031c = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzax zzaxVar = this.f48029a;
        if (zzaxVar == null) {
            asBinder = null;
        } else {
            asBinder = zzaxVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, asBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public TileOverlayOptions zIndex(float f) {
        this.f48032d = f;
        return this;
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.f48031c = true;
        this.f48033e = true;
        this.f48034f = 0.0f;
        zzax zzc = zzaw.zzc(iBinder);
        this.f48029a = zzc;
        this.f48030b = zzc == null ? null : new C18098Nb2(this);
        this.f48031c = z;
        this.f48032d = f;
        this.f48033e = z2;
        this.f48034f = f2;
    }
}
