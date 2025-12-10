package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({2, 3, 4, 1000})
/* loaded from: classes3.dex */
public final class zzbf extends AbstractSafeParcelable {

    /* renamed from: a */
    public final LocationRequest f46149a;

    /* renamed from: b */
    public final List f46150b;

    /* renamed from: c */
    public final String f46151c;

    /* renamed from: d */
    public final boolean f46152d;

    /* renamed from: e */
    public final boolean f46153e;

    /* renamed from: f */
    public final boolean f46154f;

    /* renamed from: g */
    public final String f46155g;

    /* renamed from: h */
    public final boolean f46156h;

    /* renamed from: i */
    public boolean f46157i;

    /* renamed from: j */
    public final String f46158j;

    /* renamed from: k */
    public long f46159k;

    /* renamed from: l */
    public static final List f46148l = Collections.emptyList();
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();

    public zzbf(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f46149a = locationRequest;
        this.f46150b = list;
        this.f46151c = str;
        this.f46152d = z;
        this.f46153e = z2;
        this.f46154f = z3;
        this.f46155g = str2;
        this.f46156h = z4;
        this.f46157i = z5;
        this.f46158j = str3;
        this.f46159k = j;
    }

    public static zzbf zzc(@Nullable String str, LocationRequest locationRequest) {
        return new zzbf(locationRequest, zzbx.zzk(), null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzbf) {
            zzbf zzbfVar = (zzbf) obj;
            if (Objects.equal(this.f46149a, zzbfVar.f46149a) && Objects.equal(this.f46150b, zzbfVar.f46150b) && Objects.equal(this.f46151c, zzbfVar.f46151c) && this.f46152d == zzbfVar.f46152d && this.f46153e == zzbfVar.f46153e && this.f46154f == zzbfVar.f46154f && Objects.equal(this.f46155g, zzbfVar.f46155g) && this.f46156h == zzbfVar.f46156h && this.f46157i == zzbfVar.f46157i && Objects.equal(this.f46158j, zzbfVar.f46158j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46149a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46149a);
        if (this.f46151c != null) {
            sb.append(" tag=");
            sb.append(this.f46151c);
        }
        if (this.f46155g != null) {
            sb.append(" moduleId=");
            sb.append(this.f46155g);
        }
        if (this.f46158j != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.f46158j);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f46152d);
        sb.append(" clients=");
        sb.append(this.f46150b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f46153e);
        if (this.f46154f) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.f46156h) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.f46157i) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46149a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f46150b, false);
        SafeParcelWriter.writeString(parcel, 6, this.f46151c, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f46152d);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f46153e);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f46154f);
        SafeParcelWriter.writeString(parcel, 10, this.f46155g, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f46156h);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f46157i);
        SafeParcelWriter.writeString(parcel, 13, this.f46158j, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f46159k);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.f46159k;
    }

    public final LocationRequest zzb() {
        return this.f46149a;
    }

    @Deprecated
    public final zzbf zzd(boolean z) {
        this.f46157i = true;
        return this;
    }

    public final zzbf zze(long j) {
        if (this.f46149a.getMaxWaitTime() <= this.f46149a.getInterval()) {
            this.f46159k = j;
            return this;
        }
        long interval = this.f46149a.getInterval();
        long maxWaitTime = this.f46149a.getMaxWaitTime();
        StringBuilder sb = new StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new IllegalArgumentException(sb.toString());
    }

    public final List zzf() {
        return this.f46150b;
    }

    public final boolean zzg() {
        return this.f46156h;
    }
}
