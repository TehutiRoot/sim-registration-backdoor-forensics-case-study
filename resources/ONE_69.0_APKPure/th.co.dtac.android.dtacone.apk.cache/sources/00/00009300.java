package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzw;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "DeviceOrientationRequestInternalCreator")
/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {

    /* renamed from: a */
    public final zzw f46194a;

    /* renamed from: b */
    public final List f46195b;

    /* renamed from: c */
    public final String f46196c;

    /* renamed from: d */
    public static final List f46192d = Collections.emptyList();

    /* renamed from: e */
    public static final zzw f46193e = new zzw();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    public zzh(zzw zzwVar, List list, String str) {
        this.f46194a = zzwVar;
        this.f46195b = list;
        this.f46196c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!Objects.equal(this.f46194a, zzhVar.f46194a) || !Objects.equal(this.f46195b, zzhVar.f46195b) || !Objects.equal(this.f46196c, zzhVar.f46196c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f46194a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46194a);
        String valueOf2 = String.valueOf(this.f46195b);
        String str = this.f46196c;
        int length = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 77 + valueOf2.length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46194a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f46195b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46196c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}