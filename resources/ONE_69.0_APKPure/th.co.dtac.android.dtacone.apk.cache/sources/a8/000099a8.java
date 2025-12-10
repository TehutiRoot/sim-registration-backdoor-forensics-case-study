package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "ContourParcelCreator")
/* loaded from: classes3.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();

    /* renamed from: a */
    public final int f47251a;

    /* renamed from: b */
    public final List f47252b;

    @SafeParcelable.Constructor
    public zzos(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) List list) {
        this.f47251a = i;
        this.f47252b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47251a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f47252b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f47251a;
    }

    public final List zzb() {
        return this.f47252b;
    }
}