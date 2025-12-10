package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMapPairCreator")
/* loaded from: classes3.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* renamed from: a */
    public final int f45274a;

    /* renamed from: b */
    public final String f45275b;

    /* renamed from: c */
    public final FastJsonResponse.Field f45276c;

    public zam(int i, String str, FastJsonResponse.Field field) {
        this.f45274a = i;
        this.f45275b = str;
        this.f45276c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45274a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.f45275b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45276c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f45274a = 1;
        this.f45275b = str;
        this.f45276c = field;
    }
}
