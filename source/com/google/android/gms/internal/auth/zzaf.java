package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendDataRequestCreator")
/* loaded from: classes3.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    /* renamed from: a */
    public final int f45428a;

    /* renamed from: b */
    public final String f45429b;

    /* renamed from: c */
    public final byte[] f45430c;

    public zzaf(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45428a);
        SafeParcelWriter.writeString(parcel, 2, this.f45429b, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45430c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzaf(int i, String str, byte[] bArr) {
        this.f45428a = 1;
        this.f45429b = (String) Preconditions.checkNotNull(str);
        this.f45430c = (byte[]) Preconditions.checkNotNull(bArr);
    }
}
