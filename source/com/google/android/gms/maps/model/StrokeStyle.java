package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StrokeStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new zzad();

    /* renamed from: a */
    public final float f48016a;

    /* renamed from: b */
    public final int f48017b;

    /* renamed from: c */
    public final int f48018c;

    /* renamed from: d */
    public final boolean f48019d;

    /* renamed from: e */
    public final StampStyle f48020e;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public float f48021a;

        /* renamed from: b */
        public int f48022b;

        /* renamed from: c */
        public int f48023c;

        /* renamed from: d */
        public boolean f48024d;

        /* renamed from: e */
        public StampStyle f48025e;

        public /* synthetic */ Builder(zzac zzacVar) {
        }

        @NonNull
        public StrokeStyle build() {
            return new StrokeStyle(this.f48021a, this.f48022b, this.f48023c, this.f48024d, this.f48025e);
        }

        @NonNull
        public Builder stamp(@NonNull StampStyle stampStyle) {
            this.f48025e = stampStyle;
            return this;
        }

        @NonNull
        public final Builder zza(int i) {
            this.f48022b = i;
            this.f48023c = i;
            return this;
        }

        @NonNull
        public final Builder zzb(int i, int i2) {
            this.f48022b = i;
            this.f48023c = i2;
            return this;
        }

        @NonNull
        public final Builder zzc(boolean z) {
            this.f48024d = z;
            return this;
        }

        @NonNull
        public final Builder zzd(float f) {
            this.f48021a = f;
            return this;
        }

        public Builder(@NonNull StrokeStyle strokeStyle) {
            this.f48021a = strokeStyle.zza();
            Pair zzb = strokeStyle.zzb();
            this.f48022b = ((Integer) zzb.first).intValue();
            this.f48023c = ((Integer) zzb.second).intValue();
            this.f48024d = strokeStyle.isVisible();
            this.f48025e = strokeStyle.getStamp();
        }
    }

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.f48016a = f;
        this.f48017b = i;
        this.f48018c = i2;
        this.f48019d = z;
        this.f48020e = stampStyle;
    }

    @NonNull
    public static Builder colorBuilder(int i) {
        Builder builder = new Builder((zzac) null);
        builder.zza(i);
        return builder;
    }

    @NonNull
    public static Builder gradientBuilder(int i, int i2) {
        Builder builder = new Builder((zzac) null);
        builder.zzb(i, i2);
        return builder;
    }

    @NonNull
    public static Builder transparentColorBuilder() {
        Builder builder = new Builder((zzac) null);
        builder.zza(0);
        return builder;
    }

    @Nullable
    public StampStyle getStamp() {
        return this.f48020e;
    }

    public boolean isVisible() {
        return this.f48019d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f48016a);
        SafeParcelWriter.writeInt(parcel, 3, this.f48017b);
        SafeParcelWriter.writeInt(parcel, 4, this.f48018c);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f48016a;
    }

    @NonNull
    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.f48017b), Integer.valueOf(this.f48018c));
    }
}
