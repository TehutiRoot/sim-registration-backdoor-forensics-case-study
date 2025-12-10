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
    public final String f47438a;

    /* renamed from: b */
    public final Rect f47439b;

    /* renamed from: c */
    public final List f47440c;

    /* renamed from: d */
    public final String f47441d;

    /* renamed from: e */
    public final List f47442e;

    @SafeParcelable.Constructor
    public zzuz(@SafeParcelable.Param(m48385id = 1) String str, @SafeParcelable.Param(m48385id = 2) Rect rect, @SafeParcelable.Param(m48385id = 3) List list, @SafeParcelable.Param(m48385id = 4) String str2, @SafeParcelable.Param(m48385id = 5) List list2) {
        this.f47438a = str;
        this.f47439b = rect;
        this.f47440c = list;
        this.f47441d = str2;
        this.f47442e = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f47438a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47439b, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f47440c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47441d, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f47442e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Rect zza() {
        return this.f47439b;
    }

    public final String zzb() {
        return this.f47441d;
    }

    public final String zzc() {
        return this.f47438a;
    }

    public final List zzd() {
        return this.f47440c;
    }

    public final List zze() {
        return this.f47442e;
    }
}