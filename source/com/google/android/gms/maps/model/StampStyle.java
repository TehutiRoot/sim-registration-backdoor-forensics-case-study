package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "StampStyleCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StampStyle extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<StampStyle> CREATOR = new zzw();
    @NonNull
    @SafeParcelable.Field(getter = "getWrappedStampBinder", m48389id = 2, type = "android.os.IBinder")
    protected final BitmapDescriptor zza;

    /* renamed from: com.google.android.gms.maps.model.StampStyle$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6676a {

        /* renamed from: a */
        public BitmapDescriptor f48013a;

        public abstract AbstractC6676a self();

        public AbstractC6676a stamp(BitmapDescriptor bitmapDescriptor) {
            this.f48013a = bitmapDescriptor;
            return self();
        }
    }

    public StampStyle(IBinder iBinder) {
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
    }

    @NonNull
    public BitmapDescriptor getStamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        BitmapDescriptor bitmapDescriptor = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public StampStyle(@NonNull BitmapDescriptor bitmapDescriptor) {
        this.zza = bitmapDescriptor;
    }
}
