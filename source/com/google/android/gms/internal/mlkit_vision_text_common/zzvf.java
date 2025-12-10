package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextParcelCreator")
/* loaded from: classes3.dex */
public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzvg();

    /* renamed from: a */
    public final String f47446a;

    /* renamed from: b */
    public final List f47447b;

    @SafeParcelable.Constructor
    public zzvf(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) List list) {
        this.f47446a = str;
        this.f47447b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47446a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f47447b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.f47446a;
    }

    public final List zzb() {
        return this.f47447b;
    }
}
