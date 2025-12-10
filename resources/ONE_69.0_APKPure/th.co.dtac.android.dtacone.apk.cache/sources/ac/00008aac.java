package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes3.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new zzv();

    /* renamed from: a */
    public final int f44474a;

    /* renamed from: b */
    public boolean f44475b;

    /* renamed from: c */
    public long f44476c;

    /* renamed from: d */
    public final boolean f44477d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f44474a = i;
        this.f44475b = z;
        this.f44476c = j;
        this.f44477d = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.f44476c;
    }

    public boolean isChallengeAllowed() {
        return this.f44477d;
    }

    public boolean isLockScreenSolved() {
        return this.f44475b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44474a);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}