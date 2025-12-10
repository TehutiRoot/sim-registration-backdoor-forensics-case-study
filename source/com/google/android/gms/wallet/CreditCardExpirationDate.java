package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CreditCardExpirationDateCreator")
/* loaded from: classes4.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();

    /* renamed from: a */
    public int f48733a;

    /* renamed from: b */
    public int f48734b;

    public CreditCardExpirationDate(int i, int i2) {
        this.f48733a = i;
        this.f48734b = i2;
    }

    public int getMonth() {
        return this.f48733a;
    }

    public int getYear() {
        return this.f48734b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48733a);
        SafeParcelWriter.writeInt(parcel, 2, this.f48734b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
