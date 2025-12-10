package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzbl;

@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    /* renamed from: a */
    public final int f46160a;

    /* renamed from: b */
    public final zzbf f46161b;

    /* renamed from: c */
    public final zzbl f46162c;

    /* renamed from: d */
    public final com.google.android.gms.location.zzbi f46163d;

    /* renamed from: e */
    public final PendingIntent f46164e;

    /* renamed from: f */
    public final zzai f46165f;

    /* renamed from: g */
    public final String f46166g;

    public zzbh(int i, zzbf zzbfVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        zzbl zzblVar;
        com.google.android.gms.location.zzbi zzbiVar;
        this.f46160a = i;
        this.f46161b = zzbfVar;
        zzai zzaiVar = null;
        if (iBinder != null) {
            zzblVar = com.google.android.gms.location.zzbk.zzb(iBinder);
        } else {
            zzblVar = null;
        }
        this.f46162c = zzblVar;
        this.f46164e = pendingIntent;
        if (iBinder2 != null) {
            zzbiVar = com.google.android.gms.location.zzbh.zzb(iBinder2);
        } else {
            zzbiVar = null;
        }
        this.f46163d = zzbiVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface;
            } else {
                zzaiVar = new zzag(iBinder3);
            }
        }
        this.f46165f = zzaiVar;
        this.f46166g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.location.zzbi, android.os.IBinder] */
    public static zzbh zza(com.google.android.gms.location.zzbi zzbiVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbh(2, null, null, zzbiVar, null, zzaiVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.location.zzbl, android.os.IBinder] */
    public static zzbh zzb(zzbl zzblVar, @Nullable zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbh(2, null, zzblVar, null, null, zzaiVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        IBinder asBinder2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46160a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f46161b, i, false);
        zzbl zzblVar = this.f46162c;
        IBinder iBinder = null;
        if (zzblVar == null) {
            asBinder = null;
        } else {
            asBinder = zzblVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f46164e, i, false);
        com.google.android.gms.location.zzbi zzbiVar = this.f46163d;
        if (zzbiVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = zzbiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 5, asBinder2, false);
        zzai zzaiVar = this.f46165f;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 6, iBinder, false);
        SafeParcelWriter.writeString(parcel, 8, this.f46166g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
