package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public final class LocationRequestCompat {
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;

    /* renamed from: a */
    public final int f33919a;

    /* renamed from: b */
    public final long f33920b;

    /* renamed from: c */
    public final long f33921c;

    /* renamed from: d */
    public final long f33922d;

    /* renamed from: e */
    public final int f33923e;

    /* renamed from: f */
    public final float f33924f;

    /* renamed from: g */
    public final long f33925g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface Quality {
    }

    /* renamed from: androidx.core.location.LocationRequestCompat$a */
    /* loaded from: classes2.dex */
    public static class C4028a {

        /* renamed from: a */
        public static Class f33933a;

        /* renamed from: b */
        public static Method f33934b;

        /* renamed from: c */
        public static Method f33935c;

        /* renamed from: d */
        public static Method f33936d;

        /* renamed from: e */
        public static Method f33937e;

        /* renamed from: f */
        public static Method f33938f;

        /* renamed from: a */
        public static Object m57206a(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (f33933a == null) {
                    f33933a = Class.forName("android.location.LocationRequest");
                }
                if (f33934b == null) {
                    Method declaredMethod = f33933a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f33934b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f33934b.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f33935c == null) {
                    Method declaredMethod2 = f33933a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f33935c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f33935c.invoke(invoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (f33936d == null) {
                    Method declaredMethod3 = f33933a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f33936d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f33936d.invoke(invoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (f33937e == null) {
                        Method declaredMethod4 = f33933a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f33937e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f33937e.invoke(invoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (f33938f == null) {
                        Method declaredMethod5 = f33933a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f33938f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f33938f.invoke(invoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.core.location.LocationRequestCompat$b */
    /* loaded from: classes2.dex */
    public static class C4029b {
        @DoNotInline
        /* renamed from: a */
        public static LocationRequest m57205a(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    public LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f33920b = j;
        this.f33919a = i;
        this.f33921c = j3;
        this.f33922d = j2;
        this.f33923e = i2;
        this.f33924f = f;
        this.f33925g = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        if (this.f33919a == locationRequestCompat.f33919a && this.f33920b == locationRequestCompat.f33920b && this.f33921c == locationRequestCompat.f33921c && this.f33922d == locationRequestCompat.f33922d && this.f33923e == locationRequestCompat.f33923e && Float.compare(locationRequestCompat.f33924f, this.f33924f) == 0 && this.f33925g == locationRequestCompat.f33925g) {
            return true;
        }
        return false;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.f33922d;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.f33920b;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.f33925g;
    }

    @IntRange(from = 1, m64742to = 2147483647L)
    public int getMaxUpdates() {
        return this.f33923e;
    }

    @FloatRange(from = 0.0d, m64743to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.f33924f;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j = this.f33921c;
        if (j == -1) {
            return this.f33920b;
        }
        return j;
    }

    public int getQuality() {
        return this.f33919a;
    }

    public int hashCode() {
        long j = this.f33920b;
        long j2 = this.f33921c;
        return (((this.f33919a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return C4029b.m57205a(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f33920b != Long.MAX_VALUE) {
            sb.append("@");
            TimeUtils.formatDuration(this.f33920b, sb);
            int i = this.f33919a;
            if (i != 100) {
                if (i != 102) {
                    if (i == 104) {
                        sb.append(" LOW_POWER");
                    }
                } else {
                    sb.append(" BALANCED");
                }
            } else {
                sb.append(" HIGH_ACCURACY");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f33922d != Long.MAX_VALUE) {
            sb.append(", duration=");
            TimeUtils.formatDuration(this.f33922d, sb);
        }
        if (this.f33923e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f33923e);
        }
        long j = this.f33921c;
        if (j != -1 && j < this.f33920b) {
            sb.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.f33921c, sb);
        }
        if (this.f33924f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f33924f);
        }
        if (this.f33925g / 2 > this.f33920b) {
            sb.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.f33925g, sb);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Nullable
    @RequiresApi(19)
    @SuppressLint({"NewApi"})
    public LocationRequest toLocationRequest(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        return AbstractC17419Ck0.m68743a(C4028a.m57206a(this, str));
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f33926a;

        /* renamed from: b */
        public int f33927b;

        /* renamed from: c */
        public long f33928c;

        /* renamed from: d */
        public int f33929d;

        /* renamed from: e */
        public long f33930e;

        /* renamed from: f */
        public float f33931f;

        /* renamed from: g */
        public long f33932g;

        public Builder(long j) {
            setIntervalMillis(j);
            this.f33927b = 102;
            this.f33928c = Long.MAX_VALUE;
            this.f33929d = Integer.MAX_VALUE;
            this.f33930e = -1L;
            this.f33931f = 0.0f;
            this.f33932g = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            boolean z;
            if (this.f33926a == Long.MAX_VALUE && this.f33930e == -1) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "passive location requests must have an explicit minimum update interval");
            long j = this.f33926a;
            return new LocationRequestCompat(j, this.f33927b, this.f33928c, this.f33929d, Math.min(this.f33930e, j), this.f33931f, this.f33932g);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.f33930e = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j) {
            this.f33928c = Preconditions.checkArgumentInRange(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j) {
            this.f33926a = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j) {
            this.f33932g = j;
            this.f33932g = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, m64742to = 2147483647L) int i) {
            this.f33929d = Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, m64743to = 3.4028234663852886E38d) float f) {
            this.f33931f = f;
            this.f33931f = Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j) {
            this.f33930e = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i) {
            boolean z;
            if (i != 104 && i != 102 && i != 100) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkArgument(z, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.f33927b = i;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.f33926a = locationRequestCompat.f33920b;
            this.f33927b = locationRequestCompat.f33919a;
            this.f33928c = locationRequestCompat.f33922d;
            this.f33929d = locationRequestCompat.f33923e;
            this.f33930e = locationRequestCompat.f33921c;
            this.f33931f = locationRequestCompat.f33924f;
            this.f33932g = locationRequestCompat.f33925g;
        }
    }
}
