package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
/* loaded from: classes3.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* renamed from: a */
    public final String f45355a;

    /* renamed from: b */
    public final AbstractBinderC20822kz2 f45356b;

    /* renamed from: c */
    public final boolean f45357c;

    /* renamed from: d */
    public final boolean f45358d;

    public zzs(String str, AbstractBinderC20822kz2 abstractBinderC20822kz2, boolean z, boolean z2) {
        this.f45355a = str;
        this.f45356b = abstractBinderC20822kz2;
        this.f45357c = z;
        this.f45358d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45355a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        AbstractBinderC20822kz2 abstractBinderC20822kz2 = this.f45356b;
        if (abstractBinderC20822kz2 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC20822kz2 = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, abstractBinderC20822kz2, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f45357c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45358d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f45355a = str;
        LB2 lb2 = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd = zzz.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) ObjectWrapper.unwrap(zzd);
                if (bArr != null) {
                    lb2 = new LB2(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f45356b = lb2;
        this.f45357c = z;
        this.f45358d = z2;
    }
}
