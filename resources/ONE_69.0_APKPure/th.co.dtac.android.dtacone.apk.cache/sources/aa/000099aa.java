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
    public final int f47253a;

    /* renamed from: b */
    public final int f47254b;

    /* renamed from: c */
    public final int f47255c;

    /* renamed from: d */
    public final int f47256d;

    /* renamed from: e */
    public final boolean f47257e;

    /* renamed from: f */
    public final float f47258f;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) int i4, @SafeParcelable.Param(m48385id = 5) boolean z, @SafeParcelable.Param(m48385id = 6) float f) {
        this.f47253a = i;
        this.f47254b = i2;
        this.f47255c = i3;
        this.f47256d = i4;
        this.f47257e = z;
        this.f47258f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47253a);
        SafeParcelWriter.writeInt(parcel, 2, this.f47254b);
        SafeParcelWriter.writeInt(parcel, 3, this.f47255c);
        SafeParcelWriter.writeInt(parcel, 4, this.f47256d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f47257e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f47258f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}