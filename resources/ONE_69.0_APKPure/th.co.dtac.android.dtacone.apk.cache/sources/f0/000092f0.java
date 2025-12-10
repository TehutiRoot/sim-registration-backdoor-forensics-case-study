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
    public final String f46179a;

    /* renamed from: b */
    public final long f46180b;

    /* renamed from: c */
    public final short f46181c;

    /* renamed from: d */
    public final double f46182d;

    /* renamed from: e */
    public final double f46183e;

    /* renamed from: f */
    public final float f46184f;

    /* renamed from: g */
    public final int f46185g;

    /* renamed from: h */
    public final int f46186h;

    /* renamed from: i */
    public final int f46187i;

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(m48385id = 1) String str, @SafeParcelable.Param(m48385id = 7) int i, @SafeParcelable.Param(m48385id = 3) short s, @SafeParcelable.Param(m48385id = 4) double d, @SafeParcelable.Param(m48385id = 5) double d2, @SafeParcelable.Param(m48385id = 6) float f, @SafeParcelable.Param(m48385id = 2) long j, @SafeParcelable.Param(m48385id = 8) int i2, @SafeParcelable.Param(m48385id = 9) int i3) {
        String str2;
        if (str != null && str.length() <= 100) {
            if (f > 0.0f) {
                if (d <= 90.0d && d >= -90.0d) {
                    if (d2 <= 180.0d && d2 >= -180.0d) {
                        int i4 = i & 7;
                        if (i4 != 0) {
                            this.f46181c = s;
                            this.f46179a = str;
                            this.f46182d = d;
                            this.f46183e = d2;
                            this.f46184f = f;
                            this.f46180b = j;
                            this.f46185g = i4;
                            this.f46186h = i2;
                            this.f46187i = i3;
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
            if (this.f46184f == zzbjVar.f46184f && this.f46182d == zzbjVar.f46182d && this.f46183e == zzbjVar.f46183e && this.f46181c == zzbjVar.f46181c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.f46180b;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.f46182d;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.f46187i;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.f46183e;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.f46186h;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.f46184f;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.f46179a;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.f46185g;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f46182d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f46183e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f46184f)) * 31) + this.f46181c) * 31) + this.f46185g;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.f46181c;
        if (s != -1) {
            if (s != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.f46179a.replaceAll("\\p{C}", CallerData.f39637NA), Integer.valueOf(this.f46185g), Double.valueOf(this.f46182d), Double.valueOf(this.f46183e), Float.valueOf(this.f46184f), Integer.valueOf(this.f46186h / 1000), Integer.valueOf(this.f46187i), Long.valueOf(this.f46180b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f46179a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f46180b);
        SafeParcelWriter.writeShort(parcel, 3, this.f46181c);
        SafeParcelWriter.writeDouble(parcel, 4, this.f46182d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f46183e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f46184f);
        SafeParcelWriter.writeInt(parcel, 7, this.f46185g);
        SafeParcelWriter.writeInt(parcel, 8, this.f46186h);
        SafeParcelWriter.writeInt(parcel, 9, this.f46187i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}