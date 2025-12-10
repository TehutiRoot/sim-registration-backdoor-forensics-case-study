package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class LocationCompat {
    public static final String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final String EXTRA_IS_MOCK = "mockLocation";
    public static final String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    /* renamed from: a */
    public static Method f33892a;

    /* renamed from: androidx.core.location.LocationCompat$a */
    /* loaded from: classes2.dex */
    public static class C4012a {
        @DoNotInline
        /* renamed from: a */
        public static long m57280a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    /* renamed from: androidx.core.location.LocationCompat$b */
    /* loaded from: classes2.dex */
    public static class C4013b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57279a(Location location) {
            return location.isFromMockProvider();
        }
    }

    /* renamed from: androidx.core.location.LocationCompat$c */
    /* loaded from: classes2.dex */
    public static class C4014c {
        @DoNotInline
        /* renamed from: a */
        public static float m57278a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @DoNotInline
        /* renamed from: b */
        public static float m57277b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @DoNotInline
        /* renamed from: c */
        public static float m57276c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m57275d(Location location) {
            return location.hasBearingAccuracy();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m57274e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m57273f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @DoNotInline
        /* renamed from: g */
        public static void m57272g(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m57271h(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m57270i(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    /* renamed from: a */
    public static boolean m57284a(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Bundle m57283b(Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            return location.getExtras();
        }
        return extras;
    }

    /* renamed from: c */
    public static Method m57282c() {
        if (f33892a == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f33892a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f33892a;
    }

    /* renamed from: d */
    public static void m57281d(Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static float getBearingAccuracyDegrees(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57278a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static long getElapsedRealtimeMillis(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(C4012a.m57280a(location));
    }

    public static long getElapsedRealtimeNanos(@NonNull Location location) {
        return C4012a.m57280a(location);
    }

    @FloatRange(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@NonNull Location location) {
        Preconditions.checkState(hasMslAltitudeAccuracy(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return m57283b(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static double getMslAltitudeMeters(@NonNull Location location) {
        Preconditions.checkState(hasMslAltitude(location), "The Mean Sea Level altitude of the location is not set.");
        return m57283b(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static float getSpeedAccuracyMetersPerSecond(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57277b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static float getVerticalAccuracyMeters(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57276c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean hasBearingAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57275d(location);
        }
        return m57284a(location, EXTRA_BEARING_ACCURACY);
    }

    public static boolean hasMslAltitude(@NonNull Location location) {
        return m57284a(location, EXTRA_MSL_ALTITUDE);
    }

    public static boolean hasMslAltitudeAccuracy(@NonNull Location location) {
        return m57284a(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static boolean hasSpeedAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57274e(location);
        }
        return m57284a(location, EXTRA_SPEED_ACCURACY);
    }

    public static boolean hasVerticalAccuracy(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4014c.m57273f(location);
        }
        return m57284a(location, "verticalAccuracy");
    }

    public static boolean isMock(@NonNull Location location) {
        return C4013b.m57279a(location);
    }

    public static void removeMslAltitude(@NonNull Location location) {
        m57281d(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitudeAccuracy(@NonNull Location location) {
        m57281d(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setBearingAccuracyDegrees(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4014c.m57272g(location, f);
        } else {
            m57283b(location).putFloat(EXTRA_BEARING_ACCURACY, f);
        }
    }

    public static void setMock(@NonNull Location location, boolean z) {
        try {
            m57282c().invoke(location, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchMethodException e2) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void setMslAltitudeAccuracyMeters(@NonNull Location location, @FloatRange(from = 0.0d) float f) {
        m57283b(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f);
    }

    public static void setMslAltitudeMeters(@NonNull Location location, double d) {
        m57283b(location).putDouble(EXTRA_MSL_ALTITUDE, d);
    }

    public static void setSpeedAccuracyMetersPerSecond(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4014c.m57271h(location, f);
        } else {
            m57283b(location).putFloat(EXTRA_SPEED_ACCURACY, f);
        }
    }

    public static void setVerticalAccuracyMeters(@NonNull Location location, float f) {
        if (Build.VERSION.SDK_INT >= 26) {
            C4014c.m57270i(location, f);
        } else {
            m57283b(location).putFloat("verticalAccuracy", f);
        }
    }
}
