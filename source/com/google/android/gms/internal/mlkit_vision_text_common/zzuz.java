package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TextBlockParcelCreator")
/* loaded from: classes3.dex */
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new zzva();

    /* renamed from: a */
    public final String f47426a;

    /* renamed from: b */
    public final Rect f47427b;

    /* renamed from: c */
    public final List f47428c;

    /* renamed from: d */
    public final String f47429d;

    /* renamed from: e */
    public final List f47430e;

    @SafeParcelable.Constructor
    public zzuz(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 2) Rect rect, @SafeParcelable.Param(m48388id = 3) List list, @SafeParcelable.Param(m48388id = 4) String str2, @SafeParcelable.Param(m48388id = 5) List list2) {
        this.f47426a = str;
        this.f47427b = rect;
        this.f47428c = list;
        this.f47429d = str2;
        this.f47430e = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47426a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47427b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47428c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47429d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f47430e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Rect zza() {
        return this.f47427b;
    }

    public final String zzb() {
        return this.f47429d;
    }

    public final String zzc() {
        return this.f47426a;
    }

    public final List zzd() {
        return this.f47428c;
    }

    public final List zze() {
        return this.f47430e;
    }
}
