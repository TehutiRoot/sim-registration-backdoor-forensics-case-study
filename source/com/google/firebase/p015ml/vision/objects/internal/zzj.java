package com.google.firebase.p015ml.vision.objects.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ObjectParcelCreator")
/* renamed from: com.google.firebase.ml.vision.objects.internal.zzj */
/* loaded from: classes4.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzi();

    /* renamed from: a */
    public final String f56023a;
    @SafeParcelable.Field(m48389id = 5)
    public final int category;
    @SafeParcelable.Field(m48389id = 3)
    public final Float confidence;
    @SafeParcelable.Field(m48389id = 2)
    public final Integer zzbww;
    @SafeParcelable.Field(m48389id = 1)
    public final int[] zzbxk;

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m48388id = 1) int[] iArr, @SafeParcelable.Param(m48388id = 2) Integer num, @SafeParcelable.Param(m48388id = 3) Float f, @SafeParcelable.Param(m48388id = 4) String str, @SafeParcelable.Param(m48388id = 5) int i) {
        this.zzbxk = iArr;
        this.zzbww = num;
        this.confidence = f;
        this.f56023a = str;
        this.category = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 1, this.zzbxk, false);
        SafeParcelWriter.writeIntegerObject(parcel, 2, this.zzbww, false);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.confidence, false);
        SafeParcelWriter.writeString(parcel, 4, this.f56023a, false);
        SafeParcelWriter.writeInt(parcel, 5, this.category);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
