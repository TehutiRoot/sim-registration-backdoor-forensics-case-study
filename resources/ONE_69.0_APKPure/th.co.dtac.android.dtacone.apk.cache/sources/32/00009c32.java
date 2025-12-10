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
import org.apache.commons.cli.HelpFormatter;

@SafeParcelable.Class(creator = "ActivityTransitionEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzp();

    /* renamed from: a */
    public final int f47717a;

    /* renamed from: b */
    public final int f47718b;

    /* renamed from: c */
    public final long f47719c;

    @SafeParcelable.Constructor
    public ActivityTransitionEvent(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) long j) {
        ActivityTransition.zza(i2);
        this.f47717a = i;
        this.f47718b = i2;
        this.f47719c = j;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.f47717a == activityTransitionEvent.f47717a && this.f47718b == activityTransitionEvent.f47718b && this.f47719c == activityTransitionEvent.f47719c) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.f47717a;
    }

    public long getElapsedRealTimeNanos() {
        return this.f47719c;
    }

    public int getTransitionType() {
        return this.f47718b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47717a), Integer.valueOf(this.f47718b), Long.valueOf(this.f47719c));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f47717a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        int i2 = this.f47718b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
        long j = this.f47719c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.writeLong(parcel, 3, getElapsedRealTimeNanos());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}