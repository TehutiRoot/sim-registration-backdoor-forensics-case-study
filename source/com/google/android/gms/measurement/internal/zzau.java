package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();

    /* renamed from: a */
    public final Bundle f48267a;

    public zzau(Bundle bundle) {
        this.f48267a = bundle;
    }

    /* renamed from: d */
    public final Double m46344d(String str) {
        return Double.valueOf(this.f48267a.getDouble("value"));
    }

    /* renamed from: g */
    public final Long m46343g(String str) {
        return Long.valueOf(this.f48267a.getLong("value"));
    }

    /* renamed from: i */
    public final Object m46342i(String str) {
        return this.f48267a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new C17589Fc2(this);
    }

    /* renamed from: j */
    public final String m46341j(String str) {
        return this.f48267a.getString(str);
    }

    public final String toString() {
        return this.f48267a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f48267a.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.f48267a);
    }
}
