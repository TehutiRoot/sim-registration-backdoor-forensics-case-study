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
    public final zzw f46182a;

    /* renamed from: b */
    public final List f46183b;

    /* renamed from: c */
    public final String f46184c;

    /* renamed from: d */
    public static final List f46180d = Collections.emptyList();

    /* renamed from: e */
    public static final zzw f46181e = new zzw();
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    public zzh(zzw zzwVar, List list, String str) {
        this.f46182a = zzwVar;
        this.f46183b = list;
        this.f46184c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!Objects.equal(this.f46182a, zzhVar.f46182a) || !Objects.equal(this.f46183b, zzhVar.f46183b) || !Objects.equal(this.f46184c, zzhVar.f46184c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f46182a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46182a);
        String valueOf2 = String.valueOf(this.f46183b);
        String str = this.f46184c;
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
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46182a, i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f46183b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46184c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
