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
    public final int f44462a;

    /* renamed from: b */
    public boolean f44463b;

    /* renamed from: c */
    public long f44464c;

    /* renamed from: d */
    public final boolean f44465d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f44462a = i;
        this.f44463b = z;
        this.f44464c = j;
        this.f44465d = z2;
    }

    public long getMinAgeOfLockScreen() {
        return this.f44464c;
    }

    public boolean isChallengeAllowed() {
        return this.f44465d;
    }

    public boolean isLockScreenSolved() {
        return this.f44463b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44462a);
        SafeParcelWriter.writeBoolean(parcel, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(parcel, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(parcel, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
