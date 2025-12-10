package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CollectForDebugParcelableCreator")
/* loaded from: classes3.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* renamed from: a */
    public final boolean f44589a;

    /* renamed from: b */
    public final long f44590b;

    /* renamed from: c */
    public final long f44591c;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m48388id = 1) boolean z, @SafeParcelable.Param(m48388id = 3) long j, @SafeParcelable.Param(m48388id = 2) long j2) {
        this.f44589a = z;
        this.f44590b = j;
        this.f44591c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzcVar = (zzc) obj;
            if (this.f44589a == zzcVar.f44589a && this.f44590b == zzcVar.f44590b && this.f44591c == zzcVar.f44591c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f44589a), Long.valueOf(this.f44590b), Long.valueOf(this.f44591c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f44589a + ",collectForDebugStartTimeMillis: " + this.f44590b + ",collectForDebugExpiryTimeMillis: " + this.f44591c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f44589a);
        SafeParcelWriter.writeLong(parcel, 2, this.f44591c);
        SafeParcelWriter.writeLong(parcel, 3, this.f44590b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
