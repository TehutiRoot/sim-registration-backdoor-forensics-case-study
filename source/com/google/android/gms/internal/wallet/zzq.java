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
    public String[] f47690a;

    /* renamed from: b */
    public int[] f47691b;

    /* renamed from: c */
    public RemoteViews f47692c;

    /* renamed from: d */
    public byte[] f47693d;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(m48388id = 1) String[] strArr, @SafeParcelable.Param(m48388id = 2) int[] iArr, @SafeParcelable.Param(m48388id = 3) RemoteViews remoteViews, @SafeParcelable.Param(m48388id = 4) byte[] bArr) {
        this.f47690a = strArr;
        this.f47691b = iArr;
        this.f47692c = remoteViews;
        this.f47693d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f47690a, false);
        SafeParcelWriter.writeIntArray(parcel, 2, this.f47691b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f47692c, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f47693d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
