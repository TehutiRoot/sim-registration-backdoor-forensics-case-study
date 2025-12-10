package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
/* loaded from: classes3.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();

    /* renamed from: a */
    public boolean f47819a;

    /* renamed from: b */
    public long f47820b;

    /* renamed from: c */
    public float f47821c;

    /* renamed from: d */
    public long f47822d;

    /* renamed from: e */
    public int f47823e;

    public zzw() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzw)) {
            return false;
        }
        zzw zzwVar = (zzw) obj;
        if (this.f47819a == zzwVar.f47819a && this.f47820b == zzwVar.f47820b && Float.compare(this.f47821c, zzwVar.f47821c) == 0 && this.f47822d == zzwVar.f47822d && this.f47823e == zzwVar.f47823e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f47819a), Long.valueOf(this.f47820b), Float.valueOf(this.f47821c), Long.valueOf(this.f47822d), Integer.valueOf(this.f47823e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f47819a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f47820b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f47821c);
        long j = this.f47822d;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f47823e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f47823e);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f47819a);
        SafeParcelWriter.writeLong(parcel, 2, this.f47820b);
        SafeParcelWriter.writeFloat(parcel, 3, this.f47821c);
        SafeParcelWriter.writeLong(parcel, 4, this.f47822d);
        SafeParcelWriter.writeInt(parcel, 5, this.f47823e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzw(boolean z, long j, float f, long j2, int i) {
        this.f47819a = z;
        this.f47820b = j;
        this.f47821c = f;
        this.f47822d = j2;
        this.f47823e = i;
    }
}
