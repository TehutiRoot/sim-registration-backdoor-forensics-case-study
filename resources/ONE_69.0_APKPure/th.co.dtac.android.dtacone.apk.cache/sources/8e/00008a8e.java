package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventsRequestCreator")
/* loaded from: classes3.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();

    /* renamed from: a */
    public final int f44443a;

    /* renamed from: b */
    public int f44444b;

    /* renamed from: c */
    public String f44445c;

    /* renamed from: d */
    public Account f44446d;

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f44443a = i;
        this.f44444b = i2;
        this.f44445c = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.f44446d = new Account(str, "com.google");
        } else {
            this.f44446d = account;
        }
    }

    public Account getAccount() {
        return this.f44446d;
    }

    @Deprecated
    public String getAccountName() {
        return this.f44445c;
    }

    public int getEventIndex() {
        return this.f44444b;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
        this.f44446d = account;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String str) {
        this.f44445c = str;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i) {
        this.f44444b = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44443a);
        SafeParcelWriter.writeInt(parcel, 2, this.f44444b);
        SafeParcelWriter.writeString(parcel, 3, this.f44445c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f44446d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEventsRequest() {
        this.f44443a = 1;
    }
}