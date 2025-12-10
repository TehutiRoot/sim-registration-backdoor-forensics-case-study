package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.p005os.CancellationSignal;
import androidx.core.p005os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class LocationManagerCompat {

    /* renamed from: a */
    public static Class f33981a;

    /* renamed from: b */
    public static Method f33982b;

    /* renamed from: c */
    public static Method f33983c;

    /* renamed from: d */
    public static final WeakHashMap f33984d = new WeakHashMap();

    /* renamed from: androidx.core.location.LocationManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C3997a {

        /* renamed from: a */
        public static Class f33985a;

        /* renamed from: b */
        public static Method f33986b;

        @DoNotInline
        /* renamed from: a */
        public static boolean m57212a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f33985a == null) {
                    f33985a = Class.forName("android.location.LocationRequest");
                }
                if (f33986b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33985a, LocationListener.class, Looper.class);
                    f33986b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    f33986b.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57211b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, C4008l c4008l) {
            try {
                if (f33985a == null) {
                    f33985a = Class.forName("android.location.LocationRequest");
                }
                if (f33986b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33985a, LocationListener.class, Looper.class);
                    f33986b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (LocationManagerCompat.f33984d) {
                        f33986b.invoke(locationManager, locationRequest, c4008l, Looper.getMainLooper());
                        LocationManagerCompat.m57213g(locationManager, c4008l);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$b */
    /* loaded from: classes2.dex */
    public static class C3998b {
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        /* renamed from: a */
        public static boolean m57210a(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57209b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            boolean z;
            if (handler != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            SimpleArrayMap simpleArrayMap = C4003g.f33995a;
            synchronized (simpleArrayMap) {
                try {
                    C4009m c4009m = (C4009m) simpleArrayMap.get(callback);
                    if (c4009m == null) {
                        c4009m = new C4009m(callback);
                    } else {
                        c4009m.m57157j();
                    }
                    c4009m.m57158i(executor);
                    if (!locationManager.registerGnssStatusCallback(c4009m, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, c4009m);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57208c(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57207d(LocationManager locationManager, Object obj) {
            if (obj instanceof C4009m) {
                ((C4009m) obj).m57157j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C3999c {
        @DoNotInline
        /* renamed from: a */
        public static String m57206a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57205b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57204c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$d */
    /* loaded from: classes2.dex */
    public static class C4000d {

        /* renamed from: a */
        public static Class f33987a;

        /* renamed from: b */
        public static Method f33988b;

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: a */
        public static void m57203a(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
            android.os.CancellationSignal cancellationSignal2;
            if (cancellationSignal != null) {
                cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
            } else {
                cancellationSignal2 = null;
            }
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new java.util.function.Consumer() { // from class: rk0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Consumer.this.accept((Location) obj);
                }
            });
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57202b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap simpleArrayMap = C4003g.f33995a;
            synchronized (simpleArrayMap) {
                try {
                    C4004h c4004h = (C4004h) simpleArrayMap.get(callback);
                    if (c4004h == null) {
                        c4004h = new C4004h(callback);
                    }
                    if (locationManager.registerGnssStatusCallback(executor, c4004h)) {
                        simpleArrayMap.put(callback, c4004h);
                        return true;
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57201c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f33987a == null) {
                        f33987a = Class.forName("android.location.LocationRequest");
                    }
                    if (f33988b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33987a, Executor.class, LocationListener.class);
                        f33988b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        f33988b.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$e */
    /* loaded from: classes2.dex */
    public static class C4001e {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57200a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        /* renamed from: b */
        public static boolean m57199b(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: c */
        public static void m57198c(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$f */
    /* loaded from: classes2.dex */
    public static final class C4002f implements LocationListener {

        /* renamed from: a */
        public final LocationManager f33989a;

        /* renamed from: b */
        public final Executor f33990b;

        /* renamed from: c */
        public final Handler f33991c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public Consumer f33992d;

        /* renamed from: e */
        public boolean f33993e;

        /* renamed from: f */
        public Runnable f33994f;

        public C4002f(LocationManager locationManager, Executor executor, Consumer consumer) {
            this.f33989a = locationManager;
            this.f33990b = executor;
            this.f33992d = consumer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57197a(C4002f c4002f) {
            c4002f.m57192f();
        }

        /* renamed from: b */
        public static /* synthetic */ void m57196b(Consumer consumer, Location location) {
            consumer.accept(location);
        }

        /* renamed from: c */
        public void m57195c() {
            synchronized (this) {
                try {
                    if (this.f33993e) {
                        return;
                    }
                    this.f33993e = true;
                    m57194d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public final void m57194d() {
            this.f33992d = null;
            this.f33989a.removeUpdates(this);
            Runnable runnable = this.f33994f;
            if (runnable != null) {
                this.f33991c.removeCallbacks(runnable);
                this.f33994f = null;
            }
        }

        /* renamed from: f */
        public final /* synthetic */ void m57192f() {
            this.f33994f = null;
            onLocationChanged((Location) null);
        }

        /* renamed from: g */
        public void m57191g(long j) {
            synchronized (this) {
                try {
                    if (this.f33993e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: sk0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.C4002f.m57197a(LocationManagerCompat.C4002f.this);
                        }
                    };
                    this.f33994f = runnable;
                    this.f33991c.postDelayed(runnable, j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            synchronized (this) {
                try {
                    if (this.f33993e) {
                        return;
                    }
                    this.f33993e = true;
                    final Consumer consumer = this.f33992d;
                    this.f33990b.execute(new Runnable() { // from class: tk0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.C4002f.m57196b(Consumer.this, location);
                        }
                    });
                    m57194d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$g */
    /* loaded from: classes2.dex */
    public static class C4003g {

        /* renamed from: a */
        public static final SimpleArrayMap f33995a = new SimpleArrayMap();
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$h */
    /* loaded from: classes2.dex */
    public static class C4004h extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f33996a;

        public C4004h(GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f33996a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.f33996a.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f33996a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f33996a.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f33996a.onStopped();
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$i */
    /* loaded from: classes2.dex */
    public static class C4005i implements GpsStatus.Listener {

        /* renamed from: a */
        public final LocationManager f33997a;

        /* renamed from: b */
        public final GnssStatusCompat.Callback f33998b;

        /* renamed from: c */
        public volatile Executor f33999c;

        public C4005i(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f33997a = locationManager;
            this.f33998b = callback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57190a(C4005i c4005i, Executor executor) {
            c4005i.m57185f(executor);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57189b(C4005i c4005i, Executor executor) {
            c4005i.m57186e(executor);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57188c(C4005i c4005i, Executor executor, int i) {
            c4005i.m57184g(executor, i);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57187d(C4005i c4005i, Executor executor, GnssStatusCompat gnssStatusCompat) {
            c4005i.m57183h(executor, gnssStatusCompat);
        }

        /* renamed from: e */
        public final /* synthetic */ void m57186e(Executor executor) {
            if (this.f33999c != executor) {
                return;
            }
            this.f33998b.onStarted();
        }

        /* renamed from: f */
        public final /* synthetic */ void m57185f(Executor executor) {
            if (this.f33999c != executor) {
                return;
            }
            this.f33998b.onStopped();
        }

        /* renamed from: g */
        public final /* synthetic */ void m57184g(Executor executor, int i) {
            if (this.f33999c != executor) {
                return;
            }
            this.f33998b.onFirstFix(i);
        }

        /* renamed from: h */
        public final /* synthetic */ void m57183h(Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (this.f33999c != executor) {
                return;
            }
            this.f33998b.onSatelliteStatusChanged(gnssStatusCompat);
        }

        /* renamed from: i */
        public void m57182i(Executor executor) {
            boolean z;
            if (this.f33999c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f33999c = executor;
        }

        /* renamed from: j */
        public void m57181j() {
            this.f33999c = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.f33999c;
            if (executor == null) {
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (gpsStatus = this.f33997a.getGpsStatus(null)) != null) {
                            final GnssStatusCompat wrap = GnssStatusCompat.wrap(gpsStatus);
                            executor.execute(new Runnable() { // from class: xk0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    LocationManagerCompat.C4005i.m57187d(LocationManagerCompat.C4005i.this, executor, wrap);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    GpsStatus gpsStatus2 = this.f33997a.getGpsStatus(null);
                    if (gpsStatus2 != null) {
                        final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                        executor.execute(new Runnable() { // from class: wk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationManagerCompat.C4005i.m57188c(LocationManagerCompat.C4005i.this, executor, timeToFirstFix);
                            }
                        });
                        return;
                    }
                    return;
                }
                executor.execute(new Runnable() { // from class: vk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.C4005i.m57190a(LocationManagerCompat.C4005i.this, executor);
                    }
                });
                return;
            }
            executor.execute(new Runnable() { // from class: uk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4005i.m57189b(LocationManagerCompat.C4005i.this, executor);
                }
            });
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$j */
    /* loaded from: classes2.dex */
    public static final class ExecutorC4006j implements Executor {

        /* renamed from: a */
        public final Handler f34000a;

        public ExecutorC4006j(Handler handler) {
            this.f34000a = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.myLooper() == this.f34000a.getLooper()) {
                runnable.run();
            } else if (this.f34000a.post((Runnable) Preconditions.checkNotNull(runnable))) {
            } else {
                throw new RejectedExecutionException(this.f34000a + " is shutting down");
            }
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$k */
    /* loaded from: classes2.dex */
    public static class C4007k {

        /* renamed from: a */
        public final String f34001a;

        /* renamed from: b */
        public final LocationListenerCompat f34002b;

        public C4007k(String str, LocationListenerCompat locationListenerCompat) {
            this.f34001a = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.f34002b = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4007k)) {
                return false;
            }
            C4007k c4007k = (C4007k) obj;
            if (!this.f34001a.equals(c4007k.f34001a) || !this.f34002b.equals(c4007k.f34002b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f34001a, this.f34002b);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$m */
    /* loaded from: classes2.dex */
    public static class C4009m extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f34005a;

        /* renamed from: b */
        public volatile Executor f34006b;

        public C4009m(GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f34005a = callback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57166a(C4009m c4009m, Executor executor) {
            c4009m.m57159h(executor);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57165b(C4009m c4009m, Executor executor, int i) {
            c4009m.m57162e(executor, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57164c(C4009m c4009m, Executor executor) {
            c4009m.m57160g(executor);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57163d(C4009m c4009m, Executor executor, GnssStatus gnssStatus) {
            c4009m.m57161f(executor, gnssStatus);
        }

        /* renamed from: e */
        public final /* synthetic */ void m57162e(Executor executor, int i) {
            if (this.f34006b != executor) {
                return;
            }
            this.f34005a.onFirstFix(i);
        }

        /* renamed from: f */
        public final /* synthetic */ void m57161f(Executor executor, GnssStatus gnssStatus) {
            if (this.f34006b != executor) {
                return;
            }
            this.f34005a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        /* renamed from: g */
        public final /* synthetic */ void m57160g(Executor executor) {
            if (this.f34006b != executor) {
                return;
            }
            this.f34005a.onStarted();
        }

        /* renamed from: h */
        public final /* synthetic */ void m57159h(Executor executor) {
            if (this.f34006b != executor) {
                return;
            }
            this.f34005a.onStopped();
        }

        /* renamed from: i */
        public void m57158i(Executor executor) {
            boolean z;
            boolean z2 = false;
            if (executor != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null executor");
            if (this.f34006b == null) {
                z2 = true;
            }
            Preconditions.checkState(z2);
            this.f34006b = executor;
        }

        /* renamed from: j */
        public void m57157j() {
            this.f34006b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.f34006b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Ek0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4009m.m57165b(LocationManagerCompat.C4009m.this, executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f34006b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Fk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4009m.m57163d(LocationManagerCompat.C4009m.this, executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f34006b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Hk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4009m.m57164c(LocationManagerCompat.C4009m.this, executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f34006b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Gk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4009m.m57166a(LocationManagerCompat.C4009m.this, executor);
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m57219a(Consumer consumer, Location location) {
        consumer.accept(location);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m57218b(LocationManager locationManager, C4005i c4005i) {
        return m57216d(locationManager, c4005i);
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m57216d(LocationManager locationManager, C4005i c4005i) {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c4005i));
    }

    /* renamed from: e */
    public static boolean m57215e(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f33981a == null) {
                    f33981a = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f33982b == null) {
                    Method declaredMethod = f33981a.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, null);
                    f33982b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f33983c == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, AbstractC21351nk0.m26255a());
                    f33983c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f33983c.invoke(locationManager, f33982b.invoke(f33981a.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
                if (invoke != null) {
                    if (((Boolean) invoke).booleanValue()) {
                        return true;
                    }
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00cc A[Catch: all -> 0x00a7, TryCatch #7 {all -> 0x00a7, blocks: (B:114:0x0056, B:147:0x00ad, B:148:0x00c3, B:149:0x00c4, B:151:0x00cc, B:153:0x00d4, B:154:0x00da, B:155:0x00db, B:156:0x00e0, B:157:0x00e1, B:158:0x00e7), top: B:166:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00e1 A[Catch: all -> 0x00a7, TryCatch #7 {all -> 0x00a7, blocks: (B:114:0x0056, B:147:0x00ad, B:148:0x00c3, B:149:0x00c4, B:151:0x00cc, B:153:0x00d4, B:154:0x00da, B:155:0x00db, B:156:0x00e0, B:157:0x00e1, B:158:0x00e7), top: B:166:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ea A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #10 {all -> 0x002f, blocks: (B:103:0x0021, B:105:0x0029, B:109:0x0035, B:111:0x004c, B:120:0x0079, B:121:0x0080, B:130:0x008d, B:131:0x0094, B:160:0x00ea, B:161:0x00f1, B:112:0x0050, B:162:0x00f2, B:163:0x0108, B:108:0x0032), top: B:167:0x0021 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m57214f(final android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.m57214f(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    /* renamed from: g */
    public static void m57213g(LocationManager locationManager, C4008l c4008l) {
        C4008l c4008l2;
        WeakReference weakReference = (WeakReference) f33984d.put(c4008l.m57174g(), new WeakReference(c4008l));
        if (weakReference != null) {
            c4008l2 = (C4008l) weakReference.get();
        } else {
            c4008l2 = null;
        }
        if (c4008l2 != null) {
            c4008l2.m57167n();
            locationManager.removeUpdates(c4008l2);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4000d.m57203a(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: ok0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.m57219a(Consumer.this, lastKnownLocation);
                }
            });
            return;
        }
        final C4002f c4002f = new C4002f(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, c4002f, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: pk0
                @Override // androidx.core.p005os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    LocationManagerCompat.C4002f.this.m57195c();
                }
            });
        }
        c4002f.m57191g(30000L);
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3999c.m57206a(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3999c.m57205b(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4001e.m57200a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            if (locationManager.getProvider(str) != null) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isLocationEnabled(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3999c.m57204c(locationManager);
        }
        if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
            return false;
        }
        return true;
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT != 30) {
            return C3998b.m57210a(locationManager, callback, handler);
        }
        return m57215e(locationManager, ExecutorCompat.create(handler), callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, new ExecutorC4006j(handler), callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager, @NonNull LocationListenerCompat locationListenerCompat) {
        WeakHashMap weakHashMap = f33984d;
        synchronized (weakHashMap) {
            try {
                ArrayList arrayList = null;
                for (WeakReference weakReference : weakHashMap.values()) {
                    C4008l c4008l = (C4008l) weakReference.get();
                    if (c4008l != null) {
                        C4007k m57174g = c4008l.m57174g();
                        if (m57174g.f34002b == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(m57174g);
                            c4008l.m57167n();
                            locationManager.removeUpdates(c4008l);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f33984d.remove((C4007k) it.next());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull Executor executor, @NonNull LocationListenerCompat locationListenerCompat) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            C4001e.m57198c(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
        } else if (i < 30 || !C4000d.m57201c(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            C4008l c4008l = new C4008l(new C4007k(str, locationListenerCompat), executor);
            if (C3997a.m57211b(locationManager, str, locationRequestCompat, c4008l)) {
                return;
            }
            synchronized (f33984d) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), c4008l, Looper.getMainLooper());
                m57213g(locationManager, c4008l);
            }
        }
    }

    @RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
        C3998b.m57208c(locationManager, callback);
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap simpleArrayMap = C4003g.f33995a;
            synchronized (simpleArrayMap) {
                try {
                    Object remove = simpleArrayMap.remove(callback);
                    if (remove != null) {
                        C3998b.m57207d(locationManager, remove);
                    }
                } finally {
                }
            }
            return;
        }
        SimpleArrayMap simpleArrayMap2 = C4003g.f33995a;
        synchronized (simpleArrayMap2) {
            try {
                C4005i c4005i = (C4005i) simpleArrayMap2.remove(callback);
                if (c4005i != null) {
                    c4005i.m57181j();
                    locationManager.removeGpsStatusListener(c4005i);
                }
            } finally {
            }
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$l */
    /* loaded from: classes2.dex */
    public static class C4008l implements LocationListener {

        /* renamed from: a */
        public volatile C4007k f34003a;

        /* renamed from: b */
        public final Executor f34004b;

        public C4008l(C4007k c4007k, Executor executor) {
            this.f34003a = c4007k;
            this.f34004b = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57180a(C4008l c4008l, String str) {
            c4008l.m57169l(str);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57179b(C4008l c4008l, String str, int i, Bundle bundle) {
            c4008l.m57168m(str, i, bundle);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57178c(C4008l c4008l, Location location) {
            c4008l.m57172i(location);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57177d(C4008l c4008l, List list) {
            c4008l.m57171j(list);
        }

        /* renamed from: e */
        public static /* synthetic */ void m57176e(C4008l c4008l, String str) {
            c4008l.m57170k(str);
        }

        /* renamed from: f */
        public static /* synthetic */ void m57175f(C4008l c4008l, int i) {
            c4008l.m57173h(i);
        }

        /* renamed from: g */
        public C4007k m57174g() {
            return (C4007k) ObjectsCompat.requireNonNull(this.f34003a);
        }

        /* renamed from: h */
        public final /* synthetic */ void m57173h(int i) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onFlushComplete(i);
        }

        /* renamed from: i */
        public final /* synthetic */ void m57172i(Location location) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onLocationChanged(location);
        }

        /* renamed from: j */
        public final /* synthetic */ void m57171j(List list) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onLocationChanged(list);
        }

        /* renamed from: k */
        public final /* synthetic */ void m57170k(String str) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onProviderDisabled(str);
        }

        /* renamed from: l */
        public final /* synthetic */ void m57169l(String str) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onProviderEnabled(str);
        }

        /* renamed from: m */
        public final /* synthetic */ void m57168m(String str, int i, Bundle bundle) {
            C4007k c4007k = this.f34003a;
            if (c4007k == null) {
                return;
            }
            c4007k.f34002b.onStatusChanged(str, i, bundle);
        }

        /* renamed from: n */
        public void m57167n() {
            this.f34003a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: Ck0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57175f(LocationManagerCompat.C4008l.this, i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: Bk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57178c(LocationManagerCompat.C4008l.this, location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: zk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57176e(LocationManagerCompat.C4008l.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: yk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57180a(LocationManagerCompat.C4008l.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: Dk0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57179b(LocationManagerCompat.C4008l.this, str, i, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List list) {
            if (this.f34003a == null) {
                return;
            }
            this.f34004b.execute(new Runnable() { // from class: Ak0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4008l.m57177d(LocationManagerCompat.C4008l.this, list);
                }
            });
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m57214f(locationManager, null, executor, callback);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m57214f(locationManager, new Handler(myLooper), executor, callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(30)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT > 30) {
            return C4001e.m57199b(locationManager, executor, callback);
        }
        return m57215e(locationManager, executor, callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull LocationListenerCompat locationListenerCompat, @NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C4001e.m57198c(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else if (C3997a.m57212a(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }
}