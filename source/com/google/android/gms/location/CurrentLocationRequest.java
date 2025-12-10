package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
/* loaded from: classes3.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzt();

    /* renamed from: a */
    public final long f47714a;

    /* renamed from: b */
    public final int f47715b;

    /* renamed from: c */
    public final int f47716c;

    /* renamed from: d */
    public final long f47717d;

    /* renamed from: e */
    public final boolean f47718e;

    /* renamed from: f */
    public final WorkSource f47719f;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public long f47720a;

        /* renamed from: b */
        public int f47721b;

        /* renamed from: c */
        public int f47722c;

        /* renamed from: d */
        public long f47723d;

        /* renamed from: e */
        public boolean f47724e;

        /* renamed from: f */
        public WorkSource f47725f;

        public Builder() {
            this.f47720a = 60000L;
            this.f47721b = 0;
            this.f47722c = 102;
            this.f47723d = Long.MAX_VALUE;
            this.f47724e = false;
            this.f47725f = null;
        }

        @NonNull
        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.f47720a, this.f47721b, this.f47722c, this.f47723d, this.f47724e, new WorkSource(this.f47725f));
        }

        @NonNull
        public Builder setDurationMillis(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "durationMillis must be greater than 0");
            this.f47723d = j;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzbc.zza(i);
            this.f47721b = i;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f47720a = j;
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            int i2;
            boolean z;
            if (i != 100 && i != 102 && i != 104) {
                i2 = 105;
                if (i == 105) {
                    i = 105;
                } else {
                    i2 = i;
                    z = false;
                    Preconditions.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constants", Integer.valueOf(i));
                    this.f47722c = i2;
                    return this;
                }
            } else {
                i2 = i;
            }
            z = true;
            Preconditions.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constants", Integer.valueOf(i));
            this.f47722c = i2;
            return this;
        }

        @NonNull
        public final Builder zza(boolean z) {
            this.f47724e = z;
            return this;
        }

        @NonNull
        public final Builder zzb(@Nullable WorkSource workSource) {
            this.f47725f = workSource;
            return this;
        }

        public Builder(@NonNull CurrentLocationRequest currentLocationRequest) {
            this.f47720a = currentLocationRequest.getMaxUpdateAgeMillis();
            this.f47721b = currentLocationRequest.getGranularity();
            this.f47722c = currentLocationRequest.getPriority();
            this.f47723d = currentLocationRequest.getDurationMillis();
            this.f47724e = currentLocationRequest.zzb();
            this.f47725f = new WorkSource(currentLocationRequest.zza());
        }
    }

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, WorkSource workSource) {
        this.f47714a = j;
        this.f47715b = i;
        this.f47716c = i2;
        this.f47717d = j2;
        this.f47718e = z;
        this.f47719f = workSource;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.f47714a != currentLocationRequest.f47714a || this.f47715b != currentLocationRequest.f47715b || this.f47716c != currentLocationRequest.f47716c || this.f47717d != currentLocationRequest.f47717d || this.f47718e != currentLocationRequest.f47718e || !Objects.equal(this.f47719f, currentLocationRequest.f47719f)) {
            return false;
        }
        return true;
    }

    public long getDurationMillis() {
        return this.f47717d;
    }

    public int getGranularity() {
        return this.f47715b;
    }

    public long getMaxUpdateAgeMillis() {
        return this.f47714a;
    }

    public int getPriority() {
        return this.f47716c;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47714a), Integer.valueOf(this.f47715b), Integer.valueOf(this.f47716c), Long.valueOf(this.f47717d));
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        int i = this.f47716c;
        if (i != 100) {
            if (i != 102) {
                if (i != 104) {
                    if (i == 105) {
                        str = "PASSIVE";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "LOW_POWER";
                }
            } else {
                str = "BALANCED_POWER_ACCURACY";
            }
        } else {
            str = "HIGH_ACCURACY";
        }
        sb.append(str);
        if (this.f47714a != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.f47714a, sb);
        }
        if (this.f47717d != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.f47717d);
            sb.append("ms");
        }
        if (this.f47715b != 0) {
            sb.append(", ");
            sb.append(zzbc.zzb(this.f47715b));
        }
        if (this.f47718e) {
            sb.append(", bypass");
        }
        if (!WorkSourceUtil.isEmpty(this.f47719f)) {
            sb.append(", workSource=");
            sb.append(this.f47719f);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.f47718e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f47719f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final WorkSource zza() {
        return this.f47719f;
    }

    public final boolean zzb() {
        return this.f47718e;
    }
}
