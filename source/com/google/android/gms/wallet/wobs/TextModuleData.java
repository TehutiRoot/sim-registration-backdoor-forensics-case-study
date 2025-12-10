package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TextModuleDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class TextModuleData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TextModuleData> CREATOR = new zzk();

    /* renamed from: a */
    public String f48898a;

    /* renamed from: b */
    public String f48899b;

    @SafeParcelable.Constructor
    public TextModuleData(@NonNull @SafeParcelable.Param(m48388id = 2) String str, @NonNull @SafeParcelable.Param(m48388id = 3) String str2) {
        this.f48898a = str;
        this.f48899b = str2;
    }

    @NonNull
    public String getBody() {
        return this.f48899b;
    }

    @NonNull
    public String getHeader() {
        return this.f48898a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48898a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48899b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
