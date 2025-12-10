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
    public final int f47258a;

    /* renamed from: b */
    public final PointF f47259b;

    @SafeParcelable.Constructor
    public zzpc(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) PointF pointF) {
        this.f47258a = i;
        this.f47259b = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47258a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47259b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f47258a;
    }

    public final PointF zzb() {
        return this.f47259b;
    }
}
