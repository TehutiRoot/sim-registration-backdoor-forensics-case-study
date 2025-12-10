package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
/* loaded from: classes3.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();

    /* renamed from: a */
    public final int f45423a;

    /* renamed from: b */
    public final String f45424b;

    /* renamed from: c */
    public final int f45425c;

    public zzab(String str, int i) {
        this(1, str, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45423a);
        SafeParcelWriter.writeString(parcel, 2, this.f45424b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f45425c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzab(int i, String str, int i2) {
        this.f45423a = 1;
        this.f45424b = (String) Preconditions.checkNotNull(str);
        this.f45425c = i2;
    }
}
