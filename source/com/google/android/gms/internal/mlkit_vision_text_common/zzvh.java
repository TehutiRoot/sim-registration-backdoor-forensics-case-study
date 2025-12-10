package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TextRecognizerOptionsCreator")
/* loaded from: classes3.dex */
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();

    /* renamed from: a */
    public final String f47448a;

    /* renamed from: b */
    public final String f47449b;

    /* renamed from: c */
    public final String f47450c;

    /* renamed from: d */
    public final boolean f47451d;

    /* renamed from: e */
    public final int f47452e;

    /* renamed from: f */
    public final String f47453f;

    /* renamed from: g */
    public final boolean f47454g;

    @SafeParcelable.Constructor
    public zzvh(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) String str2, @Nullable @SafeParcelable.Param(m48388id = 3) String str3, @SafeParcelable.Param(m48388id = 4) boolean z, @SafeParcelable.Param(m48388id = 5) int i, @SafeParcelable.Param(m48388id = 6) String str4, @SafeParcelable.Param(m48388id = 7) boolean z2) {
        this.f47448a = str;
        this.f47449b = str2;
        this.f47450c = str3;
        this.f47453f = str4;
        this.f47452e = i;
        this.f47451d = z;
        this.f47454g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47448a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f47449b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f47450c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47451d);
        SafeParcelWriter.writeInt(parcel, 5, this.f47452e);
        SafeParcelWriter.writeString(parcel, 6, this.f47453f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f47454g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
