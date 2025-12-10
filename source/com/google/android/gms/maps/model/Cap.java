package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class Cap extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    /* renamed from: d */
    public static final String f47901d = "Cap";

    /* renamed from: a */
    public final int f47902a;

    /* renamed from: b */
    public final BitmapDescriptor f47903b;

    /* renamed from: c */
    public final Float f47904c;

    public Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    /* renamed from: b */
    public final Cap m46396b() {
        boolean z;
        int i = this.f47902a;
        if (i != 0) {
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        String str = f47901d;
                        Log.w(str, "Unknown Cap type: " + i);
                        return this;
                    }
                    if (this.f47903b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Preconditions.checkState(z, "bitmapDescriptor must not be null");
                    if (this.f47904c == null) {
                        z2 = false;
                    }
                    Preconditions.checkState(z2, "bitmapRefWidth must not be null");
                    return new CustomCap(this.f47903b, this.f47904c.floatValue());
                }
                return new RoundCap();
            }
            return new SquareCap();
        }
        return new ButtCap();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.f47902a == cap.f47902a && Objects.equal(this.f47903b, cap.f47903b) && Objects.equal(this.f47904c, cap.f47904c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47902a), this.f47903b, this.f47904c);
    }

    @NonNull
    public String toString() {
        return "[Cap: type=" + this.f47902a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder asBinder;
        int i2 = this.f47902a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        BitmapDescriptor bitmapDescriptor = this.f47903b;
        if (bitmapDescriptor == null) {
            asBinder = null;
        } else {
            asBinder = bitmapDescriptor.zza().asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 3, asBinder, false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.f47904c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    public Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        boolean z;
        boolean z2 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            if (bitmapDescriptor == null || !z2) {
                i = 3;
                z = false;
                Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
                this.f47902a = i;
                this.f47903b = bitmapDescriptor;
                this.f47904c = f;
            }
            i = 3;
        }
        z = true;
        Preconditions.checkArgument(z, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i), bitmapDescriptor, f));
        this.f47902a = i;
        this.f47903b = bitmapDescriptor;
        this.f47904c = f;
    }

    public Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }
}
