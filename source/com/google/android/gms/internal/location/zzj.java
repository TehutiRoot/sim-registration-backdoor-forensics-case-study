package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* renamed from: a */
    public final int f46185a;

    /* renamed from: b */
    public final zzh f46186b;

    /* renamed from: c */
    public final com.google.android.gms.location.zzbf f46187c;

    /* renamed from: d */
    public final zzai f46188d;

    public zzj(int i, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        com.google.android.gms.location.zzbf zzb;
        this.f46185a = i;
        this.f46186b = zzhVar;
        zzai zzaiVar = null;
        if (iBinder == null) {
            zzb = null;
        } else {
            zzb = com.google.android.gms.location.zzbe.zzb(iBinder);
        }
        this.f46187c = zzb;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzaiVar = (zzai) queryLocalInterface;
            } else {
                zzaiVar = new zzag(iBinder2);
            }
        }
        this.f46188d = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f46185a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f46186b, i, false);
        com.google.android.gms.location.zzbf zzbfVar = this.f46187c;
        IBinder iBinder = null;
        if (zzbfVar == null) {
            asBinder = null;
        } else {
            asBinder = zzbfVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        zzai zzaiVar = this.f46188d;
        if (zzaiVar != null) {
            iBinder = zzaiVar.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 4, iBinder, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
