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
    public final int f34007a;

    /* renamed from: b */
    public final long f34008b;

    /* renamed from: c */
    public final long f34009c;

    /* renamed from: d */
    public final long f34010d;

    /* renamed from: e */
    public final int f34011e;

    /* renamed from: f */
    public final float f34012f;

    /* renamed from: g */
    public final long f34013g;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes2.dex */
    public @interface Quality {
    }

    /* renamed from: androidx.core.location.LocationRequestCompat$a */
    /* loaded from: classes2.dex */
    public static class C4010a {

        /* renamed from: a */
        public static Class f34021a;

        /* renamed from: b */
        public static Method f34022b;

        /* renamed from: c */
        public static Method f34023c;

        /* renamed from: d */
        public static Method f34024d;

        /* renamed from: e */
        public static Method f34025e;

        /* renamed from: f */
        public static Method f34026f;

        /* renamed from: a */
        public static Object m57156a(LocationRequestCompat locationRequestCompat, String str) {
            try {
                if (f34021a == null) {
                    f34021a = Class.forName("android.location.LocationRequest");
                }
                if (f34022b == null) {
                    Method declaredMethod = f34021a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f34022b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f34022b.invoke(null, str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f34023c == null) {
                    Method declaredMethod2 = f34021a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f34023c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f34023c.invoke(invoke, Integer.valueOf(locationRequestCompat.getQuality()));
                if (f34024d == null) {
                    Method declaredMethod3 = f34021a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f34024d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f34024d.invoke(invoke, Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (f34025e == null) {
                        Method declaredMethod4 = f34021a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f34025e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f34025e.invoke(invoke, Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (f34026f == null) {
                        Method declaredMethod5 = f34021a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f34026f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f34026f.invoke(invoke, Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.core.location.LocationRequestCompat$b */
    /* loaded from: classes2.dex */
    public static class C4011b {
        @DoNotInline
        /* renamed from: a */
        public static LocationRequest m57155a(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    public LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.f34008b = j;
        this.f34007a = i;
        this.f34009c = j3;
        this.f34010d = j2;
        this.f34011e = i2;
        this.f34012f = f;
        this.f34013g = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        if (this.f34007a == locationRequestCompat.f34007a && this.f34008b == locationRequestCompat.f34008b && this.f34009c == locationRequestCompat.f34009c && this.f34010d == locationRequestCompat.f34010d && this.f34011e == locationRequestCompat.f34011e && Float.compare(locationRequestCompat.f34012f, this.f34012f) == 0 && this.f34013g == locationRequestCompat.f34013g) {
            return true;
        }
        return false;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.f34010d;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.f34008b;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.f34013g;
    }

    @IntRange(from = 1, m64693to = 2147483647L)
    public int getMaxUpdates() {
        return this.f34011e;
    }

    @FloatRange(from = 0.0d, m64694to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.f34012f;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j = this.f34009c;
        if (j == -1) {
            return this.f34008b;
        }
        return j;
    }

    public int getQuality() {
        return this.f34007a;
    }

    public int hashCode() {
        long j = this.f34008b;
        long j2 = this.f34009c;
        return (((this.f34007a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NonNull
    @RequiresApi(31)
    public LocationRequest toLocationRequest() {
        return C4011b.m57155a(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f34008b != Long.MAX_VALUE) {
            sb.append("@");
            TimeUtils.formatDuration(this.f34008b, sb);
            int i = this.f34007a;
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
        if (this.f34010d != Long.MAX_VALUE) {
            sb.append(", duration=");
            TimeUtils.formatDuration(this.f34010d, sb);
        }
        if (this.f34011e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f34011e);
        }
        long j = this.f34009c;
        if (j != -1 && j < this.f34008b) {
            sb.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.f34009c, sb);
        }
        if (this.f34012f > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f34012f);
        }
        if (this.f34013g / 2 > this.f34008b) {
            sb.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.f34013g, sb);
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
        return AbstractC17834Ik0.m67993a(C4010a.m57156a(this, str));
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f34014a;

        /* renamed from: b */
        public int f34015b;

        /* renamed from: c */
        public long f34016c;

        /* renamed from: d */
        public int f34017d;

        /* renamed from: e */
        public long f34018e;

        /* renamed from: f */
        public float f34019f;

        /* renamed from: g */
        public long f34020g;

        public Builder(long j) {
            setIntervalMillis(j);
            this.f34015b = 102;
            this.f34016c = Long.MAX_VALUE;
            this.f34017d = Integer.MAX_VALUE;
            this.f34018e = -1L;
            this.f34019f = 0.0f;
            this.f34020g = 0L;
        }

        @NonNull
        public LocationRequestCompat build() {
            boolean z;
            if (this.f34014a == Long.MAX_VALUE && this.f34018e == -1) {
                z = false;
            } else {
                z = true;
            }
            Preconditions.checkState(z, "passive location requests must have an explicit minimum update interval");
            long j = this.f34014a;
            return new LocationRequestCompat(j, this.f34015b, this.f34016c, this.f34017d, Math.min(this.f34018e, j), this.f34019f, this.f34020g);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.f34018e = -1L;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j) {
            this.f34016c = Preconditions.checkArgumentInRange(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j) {
            this.f34014a = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j) {
            this.f34020g = j;
            this.f34020g = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, m64693to = 2147483647L) int i) {
            this.f34017d = Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, m64694to = 3.4028234663852886E38d) float f) {
            this.f34019f = f;
            this.f34019f = Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j) {
            this.f34018e = Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
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
            this.f34015b = i;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.f34014a = locationRequestCompat.f34008b;
            this.f34015b = locationRequestCompat.f34007a;
            this.f34016c = locationRequestCompat.f34010d;
            this.f34017d = locationRequestCompat.f34011e;
            this.f34018e = locationRequestCompat.f34009c;
            this.f34019f = locationRequestCompat.f34012f;
            this.f34020g = locationRequestCompat.f34013g;
        }
    }
}