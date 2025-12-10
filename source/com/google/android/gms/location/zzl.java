package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* renamed from: a */
    public final long f47810a;

    /* renamed from: b */
    public final boolean f47811b;

    /* renamed from: c */
    public final WorkSource f47812c;

    /* renamed from: d */
    public final String f47813d;

    /* renamed from: e */
    public final int[] f47814e;

    /* renamed from: f */
    public final boolean f47815f;

    /* renamed from: g */
    public final String f47816g;

    /* renamed from: h */
    public final long f47817h;

    /* renamed from: i */
    public String f47818i;

    public zzl(long j, boolean z, WorkSource workSource, String str, int[] iArr, boolean z2, String str2, long j2, String str3) {
        this.f47810a = j;
        this.f47811b = z;
        this.f47812c = workSource;
        this.f47813d = str;
        this.f47814e = iArr;
        this.f47815f = z2;
        this.f47816g = str2;
        this.f47817h = j2;
        this.f47818i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f47810a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f47811b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f47812c, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47813d, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.f47814e, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f47815f);
        SafeParcelWriter.writeString(parcel, 7, this.f47816g, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f47817h);
        SafeParcelWriter.writeString(parcel, 9, this.f47818i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzl zza(@Nullable String str) {
        this.f47818i = str;
        return this;
    }
}
