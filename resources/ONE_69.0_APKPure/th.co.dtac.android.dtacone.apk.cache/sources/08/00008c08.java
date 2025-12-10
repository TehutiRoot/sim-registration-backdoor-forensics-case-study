package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
/* loaded from: classes3.dex */
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();

    /* renamed from: o */
    public static final Scope[] f45086o = new Scope[0];

    /* renamed from: p */
    public static final Feature[] f45087p = new Feature[0];

    /* renamed from: a */
    public final int f45088a;

    /* renamed from: b */
    public final int f45089b;

    /* renamed from: c */
    public final int f45090c;

    /* renamed from: d */
    public String f45091d;

    /* renamed from: e */
    public IBinder f45092e;

    /* renamed from: f */
    public Scope[] f45093f;

    /* renamed from: g */
    public Bundle f45094g;

    /* renamed from: h */
    public Account f45095h;

    /* renamed from: i */
    public Feature[] f45096i;

    /* renamed from: j */
    public Feature[] f45097j;

    /* renamed from: k */
    public final boolean f45098k;

    /* renamed from: l */
    public final int f45099l;

    /* renamed from: m */
    public boolean f45100m;

    /* renamed from: n */
    public final String f45101n;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f45086o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f45087p : featureArr;
        featureArr2 = featureArr2 == null ? f45087p : featureArr2;
        this.f45088a = i;
        this.f45089b = i2;
        this.f45090c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f45091d = "com.google.android.gms";
        } else {
            this.f45091d = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
            } else {
                account2 = null;
            }
            this.f45095h = account2;
        } else {
            this.f45092e = iBinder;
            this.f45095h = account;
        }
        this.f45093f = scopeArr;
        this.f45094g = bundle;
        this.f45096i = featureArr;
        this.f45097j = featureArr2;
        this.f45098k = z;
        this.f45099l = i4;
        this.f45100m = z2;
        this.f45101n = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f45094g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzn.m48377a(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f45101n;
    }
}