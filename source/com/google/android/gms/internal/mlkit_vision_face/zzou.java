package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
/* loaded from: classes3.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();

    /* renamed from: a */
    public final int f47241a;

    /* renamed from: b */
    public final int f47242b;

    /* renamed from: c */
    public final int f47243c;

    /* renamed from: d */
    public final int f47244d;

    /* renamed from: e */
    public final boolean f47245e;

    /* renamed from: f */
    public final float f47246f;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) boolean z, @SafeParcelable.Param(m48388id = 6) float f) {
        this.f47241a = i;
        this.f47242b = i2;
        this.f47243c = i3;
        this.f47244d = i4;
        this.f47245e = z;
        this.f47246f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47241a);
        SafeParcelWriter.writeInt(parcel, 2, this.f47242b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47243c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47244d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f47245e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47246f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
