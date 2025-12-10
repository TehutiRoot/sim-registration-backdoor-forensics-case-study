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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzo();

    /* renamed from: a */
    public final int f47701a;

    /* renamed from: b */
    public final int f47702b;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public int f47703a = -1;

        /* renamed from: b */
        public int f47704b = -1;

        @NonNull
        public ActivityTransition build() {
            boolean z;
            boolean z2 = false;
            if (this.f47703a != -1) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "Activity type not set.");
            if (this.f47704b != -1) {
                z2 = true;
            }
            Preconditions.checkState(z2, "Activity transition type not set.");
            return new ActivityTransition(this.f47703a, this.f47704b);
        }

        @NonNull
        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.f47704b = i;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i) {
            this.f47703a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SupportedActivityTransition {
    }

    public ActivityTransition(int i, int i2) {
        this.f47701a = i;
        this.f47702b = i2;
    }

    public static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.checkArgument(z, sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.f47701a == activityTransition.f47701a && this.f47702b == activityTransition.f47702b) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.f47701a;
    }

    public int getTransitionType() {
        return this.f47702b;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47701a), Integer.valueOf(this.f47702b));
    }

    @NonNull
    public String toString() {
        int i = this.f47701a;
        int i2 = this.f47702b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
