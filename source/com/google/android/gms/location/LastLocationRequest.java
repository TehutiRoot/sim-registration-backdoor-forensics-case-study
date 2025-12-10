package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "LastLocationRequestCreator")
/* loaded from: classes3.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzbm();

    /* renamed from: a */
    public final long f47748a;

    /* renamed from: b */
    public final int f47749b;

    /* renamed from: c */
    public final boolean f47750c;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public long f47751a;

        /* renamed from: b */
        public int f47752b;

        /* renamed from: c */
        public boolean f47753c;

        public Builder() {
            this.f47751a = Long.MAX_VALUE;
            this.f47752b = 0;
            this.f47753c = false;
        }

        @NonNull
        public LastLocationRequest build() {
            return new LastLocationRequest(this.f47751a, this.f47752b, this.f47753c);
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzbc.zza(i);
            this.f47752b = i;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than 0");
            this.f47751a = j;
            return this;
        }

        public Builder(@NonNull LastLocationRequest lastLocationRequest) {
            this.f47751a = lastLocationRequest.getMaxUpdateAgeMillis();
            this.f47752b = lastLocationRequest.getGranularity();
            this.f47753c = lastLocationRequest.zza();
        }
    }

    public LastLocationRequest(long j, int i, boolean z) {
        this.f47748a = j;
        this.f47749b = i;
        this.f47750c = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.f47748a != lastLocationRequest.f47748a || this.f47749b != lastLocationRequest.f47749b || this.f47750c != lastLocationRequest.f47750c) {
            return false;
        }
        return true;
    }

    public int getGranularity() {
        return this.f47749b;
    }

    public long getMaxUpdateAgeMillis() {
        return this.f47748a;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47748a), Integer.valueOf(this.f47749b), Boolean.valueOf(this.f47750c));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f47748a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            com.google.android.gms.internal.location.zzbo.zza(this.f47748a, sb);
        }
        if (this.f47749b != 0) {
            sb.append(", ");
            sb.append(zzbc.zzb(this.f47749b));
        }
        if (this.f47750c) {
            sb.append(", bypass");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.f47750c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza() {
        return this.f47750c;
    }
}
