package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "FullWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();

    /* renamed from: a */
    public String f48735a;

    /* renamed from: b */
    public String f48736b;

    /* renamed from: c */
    public zzaj f48737c;

    /* renamed from: d */
    public String f48738d;

    /* renamed from: e */
    public zza f48739e;

    /* renamed from: f */
    public zza f48740f;

    /* renamed from: g */
    public String[] f48741g;

    /* renamed from: h */
    public UserAddress f48742h;

    /* renamed from: i */
    public UserAddress f48743i;

    /* renamed from: j */
    public InstrumentInfo[] f48744j;

    /* renamed from: k */
    public PaymentMethodToken f48745k;

    public FullWallet(String str, String str2, zzaj zzajVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.f48735a = str;
        this.f48736b = str2;
        this.f48737c = zzajVar;
        this.f48738d = str3;
        this.f48739e = zzaVar;
        this.f48740f = zzaVar2;
        this.f48741g = strArr;
        this.f48742h = userAddress;
        this.f48743i = userAddress2;
        this.f48744j = instrumentInfoArr;
        this.f48745k = paymentMethodToken;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48735a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48736b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48737c, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48738d, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48739e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48740f, i, false);
        SafeParcelWriter.writeStringArray(parcel, 8, this.f48741g, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48742h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f48743i, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, this.f48744j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f48745k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
