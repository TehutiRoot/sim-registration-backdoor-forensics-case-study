package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LabelValueCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class LabelValue extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LabelValue> CREATOR = new zzd();

    /* renamed from: a */
    public String f48881a;

    /* renamed from: b */
    public String f48882b;

    @SafeParcelable.Constructor
    public LabelValue(@NonNull @SafeParcelable.Param(m48388id = 2) String str, @NonNull @SafeParcelable.Param(m48388id = 3) String str2) {
        this.f48881a = str;
        this.f48882b = str2;
    }

    @NonNull
    public String getLabel() {
        return this.f48881a;
    }

    @NonNull
    public String getValue() {
        return this.f48882b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48881a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48882b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
