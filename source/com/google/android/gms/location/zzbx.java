package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();

    /* renamed from: a */
    public final List f47802a;

    /* renamed from: b */
    public final PendingIntent f47803b;

    /* renamed from: c */
    public final String f47804c;

    public zzbx(List list, PendingIntent pendingIntent, String str) {
        com.google.android.gms.internal.location.zzbx zzj;
        if (list == null) {
            zzj = com.google.android.gms.internal.location.zzbx.zzk();
        } else {
            zzj = com.google.android.gms.internal.location.zzbx.zzj(list);
        }
        this.f47802a = zzj;
        this.f47803b = pendingIntent;
        this.f47804c = str;
    }

    public static zzbx zza(List list) {
        Preconditions.checkNotNull(list, "geofence can't be null.");
        Preconditions.checkArgument(!list.isEmpty(), "Geofences must contains at least one id.");
        return new zzbx(list, null, "");
    }

    public static zzbx zzb(PendingIntent pendingIntent) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent can not be null.");
        return new zzbx(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.f47802a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f47803b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f47804c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
