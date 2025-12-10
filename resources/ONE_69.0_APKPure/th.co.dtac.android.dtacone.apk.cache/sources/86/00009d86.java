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
    public final float f48028a;

    /* renamed from: b */
    public final int f48029b;

    /* renamed from: c */
    public final int f48030c;

    /* renamed from: d */
    public final boolean f48031d;

    /* renamed from: e */
    public final StampStyle f48032e;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public float f48033a;

        /* renamed from: b */
        public int f48034b;

        /* renamed from: c */
        public int f48035c;

        /* renamed from: d */
        public boolean f48036d;

        /* renamed from: e */
        public StampStyle f48037e;

        public /* synthetic */ Builder(zzac zzacVar) {
        }

        @NonNull
        public StrokeStyle build() {
            return new StrokeStyle(this.f48033a, this.f48034b, this.f48035c, this.f48036d, this.f48037e);
        }

        @NonNull
        public Builder stamp(@NonNull StampStyle stampStyle) {
            this.f48037e = stampStyle;
            return this;
        }

        @NonNull
        public final Builder zza(int i) {
            this.f48034b = i;
            this.f48035c = i;
            return this;
        }

        @NonNull
        public final Builder zzb(int i, int i2) {
            this.f48034b = i;
            this.f48035c = i2;
            return this;
        }

        @NonNull
        public final Builder zzc(boolean z) {
            this.f48036d = z;
            return this;
        }

        @NonNull
        public final Builder zzd(float f) {
            this.f48033a = f;
            return this;
        }

        public Builder(@NonNull StrokeStyle strokeStyle) {
            this.f48033a = strokeStyle.zza();
            Pair zzb = strokeStyle.zzb();
            this.f48034b = ((Integer) zzb.first).intValue();
            this.f48035c = ((Integer) zzb.second).intValue();
            this.f48036d = strokeStyle.isVisible();
            this.f48037e = strokeStyle.getStamp();
        }
    }

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.f48028a = f;
        this.f48029b = i;
        this.f48030c = i2;
        this.f48031d = z;
        this.f48032e = stampStyle;
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
        return this.f48032e;
    }

    public boolean isVisible() {
        return this.f48031d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f48028a);
        SafeParcelWriter.writeInt(parcel, 3, this.f48029b);
        SafeParcelWriter.writeInt(parcel, 4, this.f48030c);
        SafeParcelWriter.writeBoolean(parcel, 5, isVisible());
        SafeParcelWriter.writeParcelable(parcel, 6, getStamp(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.f48028a;
    }

    @NonNull
    public final Pair zzb() {
        return new Pair(Integer.valueOf(this.f48029b), Integer.valueOf(this.f48030c));
    }
}