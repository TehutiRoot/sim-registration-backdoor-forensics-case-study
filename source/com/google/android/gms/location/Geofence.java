package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* loaded from: classes3.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: e */
        public double f47732e;

        /* renamed from: f */
        public double f47733f;

        /* renamed from: g */
        public float f47734g;

        /* renamed from: a */
        public String f47728a = null;

        /* renamed from: b */
        public int f47729b = 0;

        /* renamed from: c */
        public long f47730c = Long.MIN_VALUE;

        /* renamed from: d */
        public short f47731d = -1;

        /* renamed from: h */
        public int f47735h = 0;

        /* renamed from: i */
        public int f47736i = -1;

        @NonNull
        public Geofence build() {
            if (this.f47728a != null) {
                int i = this.f47729b;
                if (i != 0) {
                    if ((i & 4) != 0 && this.f47736i < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                    }
                    if (this.f47730c != Long.MIN_VALUE) {
                        if (this.f47731d != -1) {
                            if (this.f47735h >= 0) {
                                return new com.google.android.gms.internal.location.zzbj(this.f47728a, this.f47729b, (short) 1, this.f47732e, this.f47733f, this.f47734g, this.f47730c, this.f47735h, this.f47736i);
                            }
                            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        }
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                    throw new IllegalArgumentException("Expiration not set.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, m64743to = 90.0d) double d, @FloatRange(from = -180.0d, m64743to = 180.0d) double d2, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (d >= -90.0d && d <= 90.0d) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            Preconditions.checkArgument(z, sb.toString());
            if (d2 >= -180.0d && d2 <= 180.0d) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            Preconditions.checkArgument(z2, sb2.toString());
            if (f > 0.0f) {
                z3 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            Preconditions.checkArgument(z3, sb3.toString());
            this.f47731d = (short) 1;
            this.f47732e = d;
            this.f47733f = d2;
            this.f47734g = f;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.f47730c = -1L;
            } else {
                this.f47730c = DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i) {
            this.f47736i = i;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i) {
            this.f47735h = i;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.f47728a = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.f47729b = i;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public @interface GeofenceTransition {
    }

    /* loaded from: classes3.dex */
    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
