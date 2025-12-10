package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzt();

    /* renamed from: a */
    public String f48789a;

    /* renamed from: b */
    public String f48790b;

    /* renamed from: c */
    public String[] f48791c;

    /* renamed from: d */
    public String f48792d;

    /* renamed from: e */
    public zza f48793e;

    /* renamed from: f */
    public zza f48794f;

    /* renamed from: g */
    public LoyaltyWalletObject[] f48795g;

    /* renamed from: h */
    public OfferWalletObject[] f48796h;

    /* renamed from: i */
    public UserAddress f48797i;

    /* renamed from: j */
    public UserAddress f48798j;

    /* renamed from: k */
    public InstrumentInfo[] f48799k;

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zzaVar, zza zzaVar2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f48789a = str;
        this.f48790b = str2;
        this.f48791c = strArr;
        this.f48792d = str3;
        this.f48793e = zzaVar;
        this.f48794f = zzaVar2;
        this.f48795g = loyaltyWalletObjectArr;
        this.f48796h = offerWalletObjectArr;
        this.f48797i = userAddress;
        this.f48798j = userAddress2;
        this.f48799k = instrumentInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48789a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48790b, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f48791c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48792d, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48793e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48794f, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f48795g, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f48796h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f48797i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f48798j, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.f48799k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
