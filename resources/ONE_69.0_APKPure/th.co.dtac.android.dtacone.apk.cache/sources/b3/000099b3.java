package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LandmarkParcelCreator")
/* loaded from: classes3.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();

    /* renamed from: a */
    public final int f47270a;

    /* renamed from: b */
    public final PointF f47271b;

    @SafeParcelable.Constructor
    public zzpc(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) PointF pointF) {
        this.f47270a = i;
        this.f47271b = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47270a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47271b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f47270a;
    }

    public final PointF zzb() {
        return this.f47271b;
    }
}