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
    public String f48893a;

    /* renamed from: b */
    public String f48894b;

    @SafeParcelable.Constructor
    public LabelValue(@NonNull @SafeParcelable.Param(m48385id = 2) String str, @NonNull @SafeParcelable.Param(m48385id = 3) String str2) {
        this.f48893a = str;
        this.f48894b = str2;
    }

    @NonNull
    public String getLabel() {
        return this.f48893a;
    }

    @NonNull
    public String getValue() {
        return this.f48894b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48893a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48894b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}