package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbo();
    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;
    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    /* renamed from: a */
    public int f47759a;

    /* renamed from: b */
    public long f47760b;

    /* renamed from: c */
    public long f47761c;

    /* renamed from: d */
    public boolean f47762d;

    /* renamed from: e */
    public long f47763e;

    /* renamed from: f */
    public int f47764f;

    /* renamed from: g */
    public float f47765g;

    /* renamed from: h */
    public long f47766h;

    /* renamed from: i */
    public boolean f47767i;

    @Deprecated
    public LocationRequest() {
        this(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, false);
    }

    @NonNull
    public static LocationRequest create() {
        return new LocationRequest(102, CoreConstants.MILLIS_IN_ONE_HOUR, 600000L, false, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, 0L, true);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f47759a == locationRequest.f47759a && this.f47760b == locationRequest.f47760b && this.f47761c == locationRequest.f47761c && this.f47762d == locationRequest.f47762d && this.f47763e == locationRequest.f47763e && this.f47764f == locationRequest.f47764f && this.f47765g == locationRequest.f47765g && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.f47767i == locationRequest.f47767i) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.f47763e;
    }

    public long getFastestInterval() {
        return this.f47761c;
    }

    public long getInterval() {
        return this.f47760b;
    }

    public long getMaxWaitTime() {
        long j = this.f47766h;
        long j2 = this.f47760b;
        return j < j2 ? j2 : j;
    }

    public int getNumUpdates() {
        return this.f47764f;
    }

    public int getPriority() {
        return this.f47759a;
    }

    public float getSmallestDisplacement() {
        return this.f47765g;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47759a), Long.valueOf(this.f47760b), Float.valueOf(this.f47765g), Long.valueOf(this.f47766h));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.f47762d;
    }

    public boolean isWaitForAccurateLocation() {
        return this.f47767i;
    }

    @NonNull
    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = Long.MAX_VALUE;
        if (j <= Long.MAX_VALUE - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.f47763e = j2;
        if (j2 < 0) {
            this.f47763e = 0L;
        }
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.f47763e = j;
        if (j < 0) {
            this.f47763e = 0L;
        }
        return this;
    }

    @NonNull
    public LocationRequest setFastestInterval(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "illegal fastest interval: %d", Long.valueOf(j));
        this.f47762d = true;
        this.f47761c = j;
        return this;
    }

    @NonNull
    public LocationRequest setInterval(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "illegal interval: %d", Long.valueOf(j));
        this.f47760b = j;
        if (!this.f47762d) {
            this.f47761c = (long) (j / 6.0d);
        }
        return this;
    }

    @NonNull
    public LocationRequest setMaxWaitTime(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "illegal max wait time: %d", Long.valueOf(j));
        this.f47766h = j;
        return this;
    }

    @NonNull
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.f47764f = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    public LocationRequest setPriority(int i) {
        boolean z;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
                Preconditions.checkArgument(z, "illegal priority: %d", Integer.valueOf(i));
                this.f47759a = i;
                return this;
            }
        }
        z = true;
        Preconditions.checkArgument(z, "illegal priority: %d", Integer.valueOf(i));
        this.f47759a = i;
        return this;
    }

    @NonNull
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.f47765g = f;
            return this;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.f47767i = z;
        return this;
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f47759a;
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i != 105) {
                        str = "???";
                    } else {
                        str = "PRIORITY_NO_POWER";
                    }
                } else {
                    str = "PRIORITY_LOW_POWER";
                }
            } else {
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "PRIORITY_HIGH_ACCURACY";
        }
        sb.append(str);
        if (this.f47759a != 105) {
            sb.append(" requested=");
            sb.append(this.f47760b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f47761c);
        sb.append("ms");
        if (this.f47766h > this.f47760b) {
            sb.append(" maxWait=");
            sb.append(this.f47766h);
            sb.append("ms");
        }
        if (this.f47765g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f47765g);
            sb.append(OperatorName.MOVE_TO);
        }
        long j = this.f47763e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f47764f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f47764f);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47759a);
        SafeParcelWriter.writeLong(parcel, 2, this.f47760b);
        SafeParcelWriter.writeLong(parcel, 3, this.f47761c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47762d);
        SafeParcelWriter.writeLong(parcel, 5, this.f47763e);
        SafeParcelWriter.writeInt(parcel, 6, this.f47764f);
        SafeParcelWriter.writeFloat(parcel, 7, this.f47765g);
        SafeParcelWriter.writeLong(parcel, 8, this.f47766h);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f47767i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.f47759a = i;
        this.f47760b = j;
        this.f47761c = j2;
        this.f47762d = z;
        this.f47763e = j3;
        this.f47764f = i2;
        this.f47765g = f;
        this.f47766h = j4;
        this.f47767i = z2;
    }
}
