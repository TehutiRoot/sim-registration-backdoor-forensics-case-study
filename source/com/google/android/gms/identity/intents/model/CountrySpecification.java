package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CountrySpecificationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new zza();

    /* renamed from: a */
    public String f45401a;

    @SafeParcelable.Constructor
    public CountrySpecification(@NonNull @SafeParcelable.Param(m48388id = 2) String str) {
        this.f45401a = str;
    }

    @NonNull
    public String getCountryCode() {
        return this.f45401a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f45401a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
