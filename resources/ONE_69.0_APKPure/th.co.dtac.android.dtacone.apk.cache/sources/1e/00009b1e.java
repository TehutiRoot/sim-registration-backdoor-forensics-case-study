package com.google.android.gms.internal.phenotype;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public class zza implements IInterface {

    /* renamed from: a */
    public final IBinder f47472a;

    /* renamed from: b */
    public final String f47473b;

    public zza(IBinder iBinder, String str) {
        this.f47472a = iBinder;
        this.f47473b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f47472a;
    }
}