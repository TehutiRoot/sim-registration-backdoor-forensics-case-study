package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UriDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class UriData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<UriData> CREATOR = new zzm();

    /* renamed from: a */
    public String f48902a;

    /* renamed from: b */
    public String f48903b;

    @SafeParcelable.Constructor
    public UriData(@NonNull @SafeParcelable.Param(m48388id = 2) String str, @NonNull @SafeParcelable.Param(m48388id = 3) String str2) {
        this.f48902a = str;
        this.f48903b = str2;
    }

    @NonNull
    public String getDescription() {
        return this.f48903b;
    }

    @NonNull
    public String getUri() {
        return this.f48902a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48902a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48903b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
