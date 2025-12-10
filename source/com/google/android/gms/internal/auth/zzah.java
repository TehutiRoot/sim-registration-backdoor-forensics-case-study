package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
/* loaded from: classes3.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    /* renamed from: a */
    public final int f45431a;

    /* renamed from: b */
    public final String f45432b;

    /* renamed from: c */
    public final PendingIntent f45433c;

    public zzah(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45431a);
        SafeParcelWriter.writeString(parcel, 2, this.f45432b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45433c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzah(int i, String str, PendingIntent pendingIntent) {
        this.f45431a = 1;
        this.f45432b = (String) Preconditions.checkNotNull(str);
        this.f45433c = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }
}
