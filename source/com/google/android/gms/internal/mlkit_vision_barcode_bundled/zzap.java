package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
/* loaded from: classes3.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbe();

    /* renamed from: a */
    public final int f46876a;

    /* renamed from: b */
    public final int f46877b;

    /* renamed from: c */
    public final int f46878c;

    /* renamed from: d */
    public final int f46879d;

    /* renamed from: e */
    public final int f46880e;

    /* renamed from: f */
    public final int f46881f;

    /* renamed from: g */
    public final boolean f46882g;

    /* renamed from: h */
    public final String f46883h;

    @SafeParcelable.Constructor
    public zzap(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) int i5, @SafeParcelable.Param(m48388id = 6) int i6, @SafeParcelable.Param(m48388id = 7) boolean z, @Nullable @SafeParcelable.Param(m48388id = 8) String str) {
        this.f46876a = i;
        this.f46877b = i2;
        this.f46878c = i3;
        this.f46879d = i4;
        this.f46880e = i5;
        this.f46881f = i6;
        this.f46882g = z;
        this.f46883h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46876a);
        SafeParcelWriter.writeInt(parcel, 2, this.f46877b);
        SafeParcelWriter.writeInt(parcel, 3, this.f46878c);
        SafeParcelWriter.writeInt(parcel, 4, this.f46879d);
        SafeParcelWriter.writeInt(parcel, 5, this.f46880e);
        SafeParcelWriter.writeInt(parcel, 6, this.f46881f);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f46882g);
        SafeParcelWriter.writeString(parcel, 8, this.f46883h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
