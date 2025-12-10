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
    public static final Scope[] f45074o = new Scope[0];

    /* renamed from: p */
    public static final Feature[] f45075p = new Feature[0];

    /* renamed from: a */
    public final int f45076a;

    /* renamed from: b */
    public final int f45077b;

    /* renamed from: c */
    public final int f45078c;

    /* renamed from: d */
    public String f45079d;

    /* renamed from: e */
    public IBinder f45080e;

    /* renamed from: f */
    public Scope[] f45081f;

    /* renamed from: g */
    public Bundle f45082g;

    /* renamed from: h */
    public Account f45083h;

    /* renamed from: i */
    public Feature[] f45084i;

    /* renamed from: j */
    public Feature[] f45085j;

    /* renamed from: k */
    public final boolean f45086k;

    /* renamed from: l */
    public final int f45087l;

    /* renamed from: m */
    public boolean f45088m;

    /* renamed from: n */
    public final String f45089n;

    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f45074o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f45075p : featureArr;
        featureArr2 = featureArr2 == null ? f45075p : featureArr2;
        this.f45076a = i;
        this.f45077b = i2;
        this.f45078c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f45079d = "com.google.android.gms";
        } else {
            this.f45079d = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
            } else {
                account2 = null;
            }
            this.f45083h = account2;
        } else {
            this.f45080e = iBinder;
            this.f45083h = account;
        }
        this.f45081f = scopeArr;
        this.f45082g = bundle;
        this.f45084i = featureArr;
        this.f45085j = featureArr2;
        this.f45086k = z;
        this.f45087l = i4;
        this.f45088m = z2;
        this.f45089n = str2;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.f45082g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzn.m48380a(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f45089n;
    }
}
