package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* loaded from: classes3.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();

    /* renamed from: a */
    public final int f45166a;

    /* renamed from: b */
    public final int f45167b;

    /* renamed from: c */
    public final int f45168c;

    /* renamed from: d */
    public final Scope[] f45169d;

    public zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.f45166a = i;
        this.f45167b = i2;
        this.f45168c = i3;
        this.f45169d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45166a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f45167b);
        SafeParcelWriter.writeInt(parcel, 3, this.f45168c);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f45169d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
