package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes3.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: a */
    public final String f45345a;

    /* renamed from: b */
    public final boolean f45346b;

    /* renamed from: c */
    public final boolean f45347c;

    /* renamed from: d */
    public final Context f45348d;

    /* renamed from: e */
    public final boolean f45349e;

    /* renamed from: f */
    public final boolean f45350f;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.f45345a = str;
        this.f45346b = z;
        this.f45347c = z2;
        this.f45348d = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.f45349e = z3;
        this.f45350f = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45345a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45346b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f45347c);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.f45348d), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f45349e);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f45350f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
