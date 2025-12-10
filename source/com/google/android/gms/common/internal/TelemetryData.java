package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
/* loaded from: classes3.dex */
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();

    /* renamed from: a */
    public final int f45126a;

    /* renamed from: b */
    public List f45127b;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) @Nullable List list) {
        this.f45126a = i;
        this.f45127b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45126a);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f45127b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zaa() {
        return this.f45126a;
    }

    @androidx.annotation.Nullable
    public final List zab() {
        return this.f45127b;
    }

    public final void zac(@NonNull MethodInvocation methodInvocation) {
        if (this.f45127b == null) {
            this.f45127b = new ArrayList();
        }
        this.f45127b.add(methodInvocation);
    }
}
