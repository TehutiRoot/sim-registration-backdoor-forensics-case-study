package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetSaveInstrumentDetailsResponseCreator")
/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* renamed from: a */
    public String[] f47702a;

    /* renamed from: b */
    public int[] f47703b;

    /* renamed from: c */
    public RemoteViews f47704c;

    /* renamed from: d */
    public byte[] f47705d;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m48385id = 1) String[] strArr, @SafeParcelable.Param(m48385id = 2) int[] iArr, @SafeParcelable.Param(m48385id = 3) RemoteViews remoteViews, @SafeParcelable.Param(m48385id = 4) byte[] bArr) {
        this.f47702a = strArr;
        this.f47703b = iArr;
        this.f47704c = remoteViews;
        this.f47705d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f47702a, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.f47703b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f47704c, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f47705d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}