package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class zzbj extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();

    /* renamed from: a */
    public final String f46167a;

    /* renamed from: b */
    public final long f46168b;

    /* renamed from: c */
    public final short f46169c;

    /* renamed from: d */
    public final double f46170d;

    /* renamed from: e */
    public final double f46171e;

    /* renamed from: f */
    public final float f46172f;

    /* renamed from: g */
    public final int f46173g;

    /* renamed from: h */
    public final int f46174h;

    /* renamed from: i */
    public final int f46175i;

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(m48388id = 1) String str, @SafeParcelable.Param(m48388id = 7) int i, @SafeParcelable.Param(m48388id = 3) short s, @SafeParcelable.Param(m48388id = 4) double d, @SafeParcelable.Param(m48388id = 5) double d2, @SafeParcelable.Param(m48388id = 6) float f, @SafeParcelable.Param(m48388id = 2) long j, @SafeParcelable.Param(m48388id = 8) int i2, @SafeParcelable.Param(m48388id = 9) int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.f46169c = s;
                            this.f46167a = str;
                            this.f46170d = d;
                            this.f46171e = d2;
                            this.f46172f = f;
                            this.f46168b = j;
                            this.f46173g = i4;
                            this.f46174h = i2;
                            this.f46175i = i3;
                            return;
                        }
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("No supported transition specified: ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("invalid longitude: ");
                    sb2.append(d2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(42);
                sb3.append("invalid latitude: ");
                sb3.append(d);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(31);
            sb4.append("invalid radius: ");
            sb4.append(f);
            throw new IllegalArgumentException(sb4.toString());
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "requestId is null or too long: ".concat(valueOf);
        } else {
            str2 = new String("requestId is null or too long: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbjVar = (zzbj) obj;
            if (this.f46172f == zzbjVar.f46172f && this.f46170d == zzbjVar.f46170d && this.f46171e == zzbjVar.f46171e && this.f46169c == zzbjVar.f46169c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.f46168b;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.f46170d;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.f46175i;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.f46171e;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.f46174h;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.f46172f;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.f46167a;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.f46173g;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46170d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46171e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f46172f)) * 31) + this.f46169c) * 31) + this.f46173g;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.f46169c;
        if (s != -1) {
            if (s != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.f46167a.replaceAll("\\p{C}", CallerData.f39639NA), Integer.valueOf(this.f46173g), Double.valueOf(this.f46170d), Double.valueOf(this.f46171e), Float.valueOf(this.f46172f), Integer.valueOf(this.f46174h / 1000), Integer.valueOf(this.f46175i), Long.valueOf(this.f46168b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46167a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f46168b);
        SafeParcelWriter.writeShort(parcel, 3, this.f46169c);
        SafeParcelWriter.writeDouble(parcel, 4, this.f46170d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f46171e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f46172f);
        SafeParcelWriter.writeInt(parcel, 7, this.f46173g);
        SafeParcelWriter.writeInt(parcel, 8, this.f46174h);
        SafeParcelWriter.writeInt(parcel, 9, this.f46175i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
