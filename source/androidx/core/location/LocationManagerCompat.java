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
    public static Class f33893a;

    /* renamed from: b */
    public static Method f33894b;

    /* renamed from: c */
    public static Method f33895c;

    /* renamed from: d */
    public static final WeakHashMap f33896d = new WeakHashMap();

    /* renamed from: androidx.core.location.LocationManagerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4015a {

        /* renamed from: a */
        public static Class f33897a;

        /* renamed from: b */
        public static Method f33898b;

        @DoNotInline
        /* renamed from: a */
        public static boolean m57262a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f33897a == null) {
                    f33897a = Class.forName("android.location.LocationRequest");
                }
                if (f33898b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33897a, LocationListener.class, Looper.class);
                    f33898b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    f33898b.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57261b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, C4026l c4026l) {
            try {
                if (f33897a == null) {
                    f33897a = Class.forName("android.location.LocationRequest");
                }
                if (f33898b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33897a, LocationListener.class, Looper.class);
                    f33898b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (LocationManagerCompat.f33896d) {
                        f33898b.invoke(locationManager, locationRequest, c4026l, Looper.getMainLooper());
                        LocationManagerCompat.m57263g(locationManager, c4026l);
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
    public static class C4016b {
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        /* renamed from: a */
        public static boolean m57260a(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback, @NonNull Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57259b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            boolean z;
            if (handler != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            SimpleArrayMap simpleArrayMap = C4021g.f33907a;
            synchronized (simpleArrayMap) {
                try {
                    C4027m c4027m = (C4027m) simpleArrayMap.get(callback);
                    if (c4027m == null) {
                        c4027m = new C4027m(callback);
                    } else {
                        c4027m.m57207j();
                    }
                    c4027m.m57208i(executor);
                    if (!locationManager.registerGnssStatusCallback(c4027m, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, c4027m);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static void m57258c(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m57257d(LocationManager locationManager, Object obj) {
            if (obj instanceof C4027m) {
                ((C4027m) obj).m57207j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$c */
    /* loaded from: classes2.dex */
    public static class C4017c {
        @DoNotInline
        /* renamed from: a */
        public static String m57256a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m57255b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m57254c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$d */
    /* loaded from: classes2.dex */
    public static class C4018d {

        /* renamed from: a */
        public static Class f33899a;

        /* renamed from: b */
        public static Method f33900b;

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: a */
        public static void m57253a(LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
            android.os.CancellationSignal cancellationSignal2;
            if (cancellationSignal != null) {
                cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
            } else {
                cancellationSignal2 = null;
            }
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal2, executor, new java.util.function.Consumer() { // from class: lk0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept((Location) obj);
                }
            });
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: b */
        public static boolean m57252b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap simpleArrayMap = C4021g.f33907a;
            synchronized (simpleArrayMap) {
                try {
                    C4022h c4022h = (C4022h) simpleArrayMap.get(callback);
                    if (c4022h == null) {
                        c4022h = new C4022h(callback);
                    }
                    if (locationManager.registerGnssStatusCallback(executor, c4022h)) {
                        simpleArrayMap.put(callback, c4022h);
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
        public static boolean m57251c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f33899a == null) {
                        f33899a = Class.forName("android.location.LocationRequest");
                    }
                    if (f33900b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f33899a, Executor.class, LocationListener.class);
                        f33900b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        f33900b.invoke(locationManager, locationRequest, executor, locationListenerCompat);
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
    public static class C4019e {
        @DoNotInline
        /* renamed from: a */
        public static boolean m57250a(LocationManager locationManager, @NonNull String str) {
            return locationManager.hasProvider(str);
        }

        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @DoNotInline
        /* renamed from: b */
        public static boolean m57249b(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @DoNotInline
        /* renamed from: c */
        public static void m57248c(LocationManager locationManager, @NonNull String str, @NonNull LocationRequest locationRequest, @NonNull Executor executor, @NonNull LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$f */
    /* loaded from: classes2.dex */
    public static final class C4020f implements LocationListener {

        /* renamed from: a */
        public final LocationManager f33901a;

        /* renamed from: b */
        public final Executor f33902b;

        /* renamed from: c */
        public final Handler f33903c = new Handler(Looper.getMainLooper());

        /* renamed from: d */
        public Consumer f33904d;

        /* renamed from: e */
        public boolean f33905e;

        /* renamed from: f */
        public Runnable f33906f;

        public C4020f(LocationManager locationManager, Executor executor, Consumer consumer) {
            this.f33901a = locationManager;
            this.f33902b = executor;
            this.f33904d = consumer;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57247a(C4020f c4020f) {
            c4020f.m57242f();
        }

        /* renamed from: b */
        public static /* synthetic */ void m57246b(Consumer consumer, Location location) {
            consumer.accept(location);
        }

        /* renamed from: c */
        public void m57245c() {
            synchronized (this) {
                try {
                    if (this.f33905e) {
                        return;
                    }
                    this.f33905e = true;
                    m57244d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: d */
        public final void m57244d() {
            this.f33904d = null;
            this.f33901a.removeUpdates(this);
            Runnable runnable = this.f33906f;
            if (runnable != null) {
                this.f33903c.removeCallbacks(runnable);
                this.f33906f = null;
            }
        }

        /* renamed from: f */
        public final /* synthetic */ void m57242f() {
            this.f33906f = null;
            onLocationChanged((Location) null);
        }

        /* renamed from: g */
        public void m57241g(long j) {
            synchronized (this) {
                try {
                    if (this.f33905e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: mk0
                        {
                            LocationManagerCompat.C4020f.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.C4020f.m57247a(LocationManagerCompat.C4020f.this);
                        }
                    };
                    this.f33906f = runnable;
                    this.f33903c.postDelayed(runnable, j);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            synchronized (this) {
                try {
                    if (this.f33905e) {
                        return;
                    }
                    this.f33905e = true;
                    final Consumer consumer = this.f33904d;
                    this.f33902b.execute(new Runnable() { // from class: nk0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.C4020f.m57246b(consumer, location);
                        }
                    });
                    m57244d();
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
    public static class C4021g {

        /* renamed from: a */
        public static final SimpleArrayMap f33907a = new SimpleArrayMap();
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$h */
    /* loaded from: classes2.dex */
    public static class C4022h extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f33908a;

        public C4022h(GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f33908a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.f33908a.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f33908a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.f33908a.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.f33908a.onStopped();
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$i */
    /* loaded from: classes2.dex */
    public static class C4023i implements GpsStatus.Listener {

        /* renamed from: a */
        public final LocationManager f33909a;

        /* renamed from: b */
        public final GnssStatusCompat.Callback f33910b;

        /* renamed from: c */
        public volatile Executor f33911c;

        public C4023i(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f33909a = locationManager;
            this.f33910b = callback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57240a(C4023i c4023i, Executor executor) {
            c4023i.m57235f(executor);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57239b(C4023i c4023i, Executor executor) {
            c4023i.m57236e(executor);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57238c(C4023i c4023i, Executor executor, int i) {
            c4023i.m57234g(executor, i);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57237d(C4023i c4023i, Executor executor, GnssStatusCompat gnssStatusCompat) {
            c4023i.m57233h(executor, gnssStatusCompat);
        }

        /* renamed from: e */
        public final /* synthetic */ void m57236e(Executor executor) {
            if (this.f33911c != executor) {
                return;
            }
            this.f33910b.onStarted();
        }

        /* renamed from: f */
        public final /* synthetic */ void m57235f(Executor executor) {
            if (this.f33911c != executor) {
                return;
            }
            this.f33910b.onStopped();
        }

        /* renamed from: g */
        public final /* synthetic */ void m57234g(Executor executor, int i) {
            if (this.f33911c != executor) {
                return;
            }
            this.f33910b.onFirstFix(i);
        }

        /* renamed from: h */
        public final /* synthetic */ void m57233h(Executor executor, GnssStatusCompat gnssStatusCompat) {
            if (this.f33911c != executor) {
                return;
            }
            this.f33910b.onSatelliteStatusChanged(gnssStatusCompat);
        }

        /* renamed from: i */
        public void m57232i(Executor executor) {
            boolean z;
            if (this.f33911c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.f33911c = executor;
        }

        /* renamed from: j */
        public void m57231j() {
            this.f33911c = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.f33911c;
            if (executor == null) {
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (gpsStatus = this.f33909a.getGpsStatus(null)) != null) {
                            final GnssStatusCompat wrap = GnssStatusCompat.wrap(gpsStatus);
                            executor.execute(new Runnable() { // from class: rk0
                                {
                                    LocationManagerCompat.C4023i.this = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    LocationManagerCompat.C4023i.m57237d(LocationManagerCompat.C4023i.this, executor, wrap);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    GpsStatus gpsStatus2 = this.f33909a.getGpsStatus(null);
                    if (gpsStatus2 != null) {
                        final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                        executor.execute(new Runnable() { // from class: qk0
                            {
                                LocationManagerCompat.C4023i.this = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationManagerCompat.C4023i.m57238c(LocationManagerCompat.C4023i.this, executor, timeToFirstFix);
                            }
                        });
                        return;
                    }
                    return;
                }
                executor.execute(new Runnable() { // from class: pk0
                    {
                        LocationManagerCompat.C4023i.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.C4023i.m57240a(LocationManagerCompat.C4023i.this, executor);
                    }
                });
                return;
            }
            executor.execute(new Runnable() { // from class: ok0
                {
                    LocationManagerCompat.C4023i.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4023i.m57239b(LocationManagerCompat.C4023i.this, executor);
                }
            });
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$j */
    /* loaded from: classes2.dex */
    public static final class ExecutorC4024j implements Executor {

        /* renamed from: a */
        public final Handler f33912a;

        public ExecutorC4024j(Handler handler) {
            this.f33912a = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.myLooper() == this.f33912a.getLooper()) {
                runnable.run();
            } else if (this.f33912a.post((Runnable) Preconditions.checkNotNull(runnable))) {
            } else {
                throw new RejectedExecutionException(this.f33912a + " is shutting down");
            }
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$k */
    /* loaded from: classes2.dex */
    public static class C4025k {

        /* renamed from: a */
        public final String f33913a;

        /* renamed from: b */
        public final LocationListenerCompat f33914b;

        public C4025k(String str, LocationListenerCompat locationListenerCompat) {
            this.f33913a = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.f33914b = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4025k)) {
                return false;
            }
            C4025k c4025k = (C4025k) obj;
            if (!this.f33913a.equals(c4025k.f33913a) || !this.f33914b.equals(c4025k.f33914b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.f33913a, this.f33914b);
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$m */
    /* loaded from: classes2.dex */
    public static class C4027m extends GnssStatus.Callback {

        /* renamed from: a */
        public final GnssStatusCompat.Callback f33917a;

        /* renamed from: b */
        public volatile Executor f33918b;

        public C4027m(GnssStatusCompat.Callback callback) {
            boolean z;
            if (callback != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null callback");
            this.f33917a = callback;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57216a(C4027m c4027m, Executor executor) {
            c4027m.m57209h(executor);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57215b(C4027m c4027m, Executor executor, int i) {
            c4027m.m57212e(executor, i);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57214c(C4027m c4027m, Executor executor) {
            c4027m.m57210g(executor);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57213d(C4027m c4027m, Executor executor, GnssStatus gnssStatus) {
            c4027m.m57211f(executor, gnssStatus);
        }

        /* renamed from: e */
        public final /* synthetic */ void m57212e(Executor executor, int i) {
            if (this.f33918b != executor) {
                return;
            }
            this.f33917a.onFirstFix(i);
        }

        /* renamed from: f */
        public final /* synthetic */ void m57211f(Executor executor, GnssStatus gnssStatus) {
            if (this.f33918b != executor) {
                return;
            }
            this.f33917a.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        /* renamed from: g */
        public final /* synthetic */ void m57210g(Executor executor) {
            if (this.f33918b != executor) {
                return;
            }
            this.f33917a.onStarted();
        }

        /* renamed from: h */
        public final /* synthetic */ void m57209h(Executor executor) {
            if (this.f33918b != executor) {
                return;
            }
            this.f33917a.onStopped();
        }

        /* renamed from: i */
        public void m57208i(Executor executor) {
            boolean z;
            boolean z2 = false;
            if (executor != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "invalid null executor");
            if (this.f33918b == null) {
                z2 = true;
            }
            Preconditions.checkState(z2);
            this.f33918b = executor;
        }

        /* renamed from: j */
        public void m57207j() {
            this.f33918b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.f33918b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: yk0
                {
                    LocationManagerCompat.C4027m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4027m.m57215b(LocationManagerCompat.C4027m.this, executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f33918b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: zk0
                {
                    LocationManagerCompat.C4027m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4027m.m57213d(LocationManagerCompat.C4027m.this, executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.f33918b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Bk0
                {
                    LocationManagerCompat.C4027m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4027m.m57214c(LocationManagerCompat.C4027m.this, executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.f33918b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: Ak0
                {
                    LocationManagerCompat.C4027m.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4027m.m57216a(LocationManagerCompat.C4027m.this, executor);
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m57269a(Consumer consumer, Location location) {
        consumer.accept(location);
    }

    /* renamed from: b */
    public static /* synthetic */ Boolean m57268b(LocationManager locationManager, C4023i c4023i) {
        return m57266d(locationManager, c4023i);
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m57266d(LocationManager locationManager, C4023i c4023i) {
        return Boolean.valueOf(locationManager.addGpsStatusListener(c4023i));
    }

    /* renamed from: e */
    public static boolean m57265e(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (f33893a == null) {
                    f33893a = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f33894b == null) {
                    Method declaredMethod = f33893a.getDeclaredMethod(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, null);
                    f33894b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (f33895c == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, AbstractC20259hk0.m30767a());
                    f33895c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = f33895c.invoke(locationManager, f33894b.invoke(f33893a.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
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
    public static boolean m57264f(final android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.m57264f(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    /* renamed from: g */
    public static void m57263g(LocationManager locationManager, C4026l c4026l) {
        C4026l c4026l2;
        WeakReference weakReference = (WeakReference) f33896d.put(c4026l.m57224g(), new WeakReference(c4026l));
        if (weakReference != null) {
            c4026l2 = (C4026l) weakReference.get();
        } else {
            c4026l2 = null;
        }
        if (c4026l2 != null) {
            c4026l2.m57217n();
            locationManager.removeUpdates(c4026l2);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@NonNull LocationManager locationManager, @NonNull String str, @Nullable CancellationSignal cancellationSignal, @NonNull Executor executor, @NonNull final Consumer<Location> consumer) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4018d.m57253a(locationManager, str, cancellationSignal, executor, consumer);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: ik0
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.m57269a(consumer, lastKnownLocation);
                }
            });
            return;
        }
        final C4020f c4020f = new C4020f(locationManager, executor, consumer);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, c4020f, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: jk0
                @Override // androidx.core.p005os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    c4020f.m57245c();
                }
            });
        }
        c4020f.m57241g(30000L);
    }

    @Nullable
    public static String getGnssHardwareModelName(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4017c.m57256a(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(@NonNull LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4017c.m57255b(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(@NonNull LocationManager locationManager, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4019e.m57250a(locationManager, str);
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
            return C4017c.m57254c(locationManager);
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
            return C4016b.m57260a(locationManager, callback, handler);
        }
        return m57265e(locationManager, ExecutorCompat.create(handler), callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, new ExecutorC4024j(handler), callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@NonNull LocationManager locationManager, @NonNull LocationListenerCompat locationListenerCompat) {
        WeakHashMap weakHashMap = f33896d;
        synchronized (weakHashMap) {
            try {
                ArrayList arrayList = null;
                for (WeakReference weakReference : weakHashMap.values()) {
                    C4026l c4026l = (C4026l) weakReference.get();
                    if (c4026l != null) {
                        C4025k m57224g = c4026l.m57224g();
                        if (m57224g.f33914b == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(m57224g);
                            c4026l.m57217n();
                            locationManager.removeUpdates(c4026l);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f33896d.remove((C4025k) it.next());
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
            C4019e.m57248c(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
        } else if (i < 30 || !C4018d.m57251c(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            C4026l c4026l = new C4026l(new C4025k(str, locationListenerCompat), executor);
            if (C4015a.m57261b(locationManager, str, locationRequestCompat, c4026l)) {
                return;
            }
            synchronized (f33896d) {
                locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), c4026l, Looper.getMainLooper());
                m57263g(locationManager, c4026l);
            }
        }
    }

    @RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull GnssMeasurementsEvent.Callback callback) {
        C4016b.m57258c(locationManager, callback);
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap simpleArrayMap = C4021g.f33907a;
            synchronized (simpleArrayMap) {
                try {
                    Object remove = simpleArrayMap.remove(callback);
                    if (remove != null) {
                        C4016b.m57257d(locationManager, remove);
                    }
                } finally {
                }
            }
            return;
        }
        SimpleArrayMap simpleArrayMap2 = C4021g.f33907a;
        synchronized (simpleArrayMap2) {
            try {
                C4023i c4023i = (C4023i) simpleArrayMap2.remove(callback);
                if (c4023i != null) {
                    c4023i.m57231j();
                    locationManager.removeGpsStatusListener(c4023i);
                }
            } finally {
            }
        }
    }

    /* renamed from: androidx.core.location.LocationManagerCompat$l */
    /* loaded from: classes2.dex */
    public static class C4026l implements LocationListener {

        /* renamed from: a */
        public volatile C4025k f33915a;

        /* renamed from: b */
        public final Executor f33916b;

        public C4026l(C4025k c4025k, Executor executor) {
            this.f33915a = c4025k;
            this.f33916b = executor;
        }

        /* renamed from: a */
        public static /* synthetic */ void m57230a(C4026l c4026l, String str) {
            c4026l.m57219l(str);
        }

        /* renamed from: b */
        public static /* synthetic */ void m57229b(C4026l c4026l, String str, int i, Bundle bundle) {
            c4026l.m57218m(str, i, bundle);
        }

        /* renamed from: c */
        public static /* synthetic */ void m57228c(C4026l c4026l, Location location) {
            c4026l.m57222i(location);
        }

        /* renamed from: d */
        public static /* synthetic */ void m57227d(C4026l c4026l, List list) {
            c4026l.m57221j(list);
        }

        /* renamed from: e */
        public static /* synthetic */ void m57226e(C4026l c4026l, String str) {
            c4026l.m57220k(str);
        }

        /* renamed from: f */
        public static /* synthetic */ void m57225f(C4026l c4026l, int i) {
            c4026l.m57223h(i);
        }

        /* renamed from: g */
        public C4025k m57224g() {
            return (C4025k) ObjectsCompat.requireNonNull(this.f33915a);
        }

        /* renamed from: h */
        public final /* synthetic */ void m57223h(int i) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onFlushComplete(i);
        }

        /* renamed from: i */
        public final /* synthetic */ void m57222i(Location location) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onLocationChanged(location);
        }

        /* renamed from: j */
        public final /* synthetic */ void m57221j(List list) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onLocationChanged(list);
        }

        /* renamed from: k */
        public final /* synthetic */ void m57220k(String str) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onProviderDisabled(str);
        }

        /* renamed from: l */
        public final /* synthetic */ void m57219l(String str) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onProviderEnabled(str);
        }

        /* renamed from: m */
        public final /* synthetic */ void m57218m(String str, int i, Bundle bundle) {
            C4025k c4025k = this.f33915a;
            if (c4025k == null) {
                return;
            }
            c4025k.f33914b.onStatusChanged(str, i, bundle);
        }

        /* renamed from: n */
        public void m57217n() {
            this.f33915a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: wk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57225f(LocationManagerCompat.C4026l.this, i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: vk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57228c(LocationManagerCompat.C4026l.this, location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: tk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57226e(LocationManagerCompat.C4026l.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: sk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57230a(LocationManagerCompat.C4026l.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: xk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57229b(LocationManagerCompat.C4026l.this, str, i, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List list) {
            if (this.f33915a == null) {
                return;
            }
            this.f33916b.execute(new Runnable() { // from class: uk0
                {
                    LocationManagerCompat.C4026l.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.C4026l.m57227d(LocationManagerCompat.C4026l.this, list);
                }
            });
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m57264f(locationManager, null, executor, callback);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return m57264f(locationManager, new Handler(myLooper), executor, callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @RequiresApi(30)
    public static boolean registerGnssMeasurementsCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT > 30) {
            return C4019e.m57249b(locationManager, executor, callback);
        }
        return m57265e(locationManager, executor, callback);
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@NonNull LocationManager locationManager, @NonNull String str, @NonNull LocationRequestCompat locationRequestCompat, @NonNull LocationListenerCompat locationListenerCompat, @NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            C4019e.m57248c(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else if (C4015a.m57262a(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }
}
