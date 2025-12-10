package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ShowFirstParty
@ThreadSafe
@KeepForSdk
/* loaded from: classes3.dex */
public class WakeLock {

    /* renamed from: r */
    public static final long f48567r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s */
    public static volatile ScheduledExecutorService f48568s = null;

    /* renamed from: t */
    public static final Object f48569t = new Object();

    /* renamed from: u */
    public static volatile zzd f48570u = new C17656Gd2();

    /* renamed from: a */
    public final Object f48571a;

    /* renamed from: b */
    public final PowerManager.WakeLock f48572b;

    /* renamed from: c */
    public int f48573c;

    /* renamed from: d */
    public Future f48574d;

    /* renamed from: e */
    public long f48575e;

    /* renamed from: f */
    public final Set f48576f;

    /* renamed from: g */
    public boolean f48577g;

    /* renamed from: h */
    public int f48578h;

    /* renamed from: i */
    public zzb f48579i;

    /* renamed from: j */
    public Clock f48580j;

    /* renamed from: k */
    public WorkSource f48581k;

    /* renamed from: l */
    public final String f48582l;

    /* renamed from: m */
    public final String f48583m;

    /* renamed from: n */
    public final Context f48584n;

    /* renamed from: o */
    public final Map f48585o;

    /* renamed from: p */
    public AtomicInteger f48586p;

    /* renamed from: q */
    public final ScheduledExecutorService f48587q;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String str2;
        String packageName = context.getPackageName();
        this.f48571a = new Object();
        this.f48573c = 0;
        this.f48576f = new HashSet();
        this.f48577g = true;
        this.f48580j = DefaultClock.getInstance();
        this.f48585o = new HashMap();
        this.f48586p = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f48584n = context.getApplicationContext();
        this.f48583m = str;
        this.f48579i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f48582l = str2;
        } else {
            this.f48582l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f48572b = newWakeLock;
            if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
                this.f48581k = fromPackage;
                if (fromPackage != null) {
                    m46052d(newWakeLock, fromPackage);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f48568s;
            if (scheduledExecutorService == null) {
                synchronized (f48569t) {
                    try {
                        scheduledExecutorService = f48568s;
                        if (scheduledExecutorService == null) {
                            zzh.zza();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f48568s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f48587q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* renamed from: d */
    public static void m46052d(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            e.toString();
        }
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f48571a) {
            try {
                if (!wakeLock.isHeld()) {
                    return;
                }
                String.valueOf(wakeLock.f48582l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                wakeLock.m46054b();
                if (!wakeLock.isHeld()) {
                    return;
                }
                wakeLock.f48573c = 1;
                wakeLock.m46053c(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final String m46055a(String str) {
        if (this.f48577g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @KeepForSdk
    public void acquire(long j) {
        this.f48586p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f48567r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f48571a) {
            try {
                if (!isHeld()) {
                    this.f48579i = zzb.zza(false, null);
                    this.f48572b.acquire();
                    this.f48580j.elapsedRealtime();
                }
                this.f48573c++;
                this.f48578h++;
                m46055a(null);
                C21794qf2 c21794qf2 = (C21794qf2) this.f48585o.get(null);
                if (c21794qf2 == null) {
                    c21794qf2 = new C21794qf2(null);
                    this.f48585o.put(null, c21794qf2);
                }
                c21794qf2.f77027a++;
                long elapsedRealtime = this.f48580j.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j2 = elapsedRealtime + max;
                }
                if (j2 > this.f48575e) {
                    this.f48575e = j2;
                    Future future = this.f48574d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f48574d = this.f48587q.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        {
                            WakeLock.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.zza(WakeLock.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m46054b() {
        if (this.f48576f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f48576f);
        this.f48576f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        zze zzeVar = (zze) arrayList.get(0);
        throw null;
    }

    /* renamed from: c */
    public final void m46053c(int i) {
        synchronized (this.f48571a) {
            try {
                if (!isHeld()) {
                    return;
                }
                if (this.f48577g) {
                    int i2 = this.f48573c - 1;
                    this.f48573c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f48573c = 0;
                }
                m46054b();
                for (C21794qf2 c21794qf2 : this.f48585o.values()) {
                    c21794qf2.f77027a = 0;
                }
                this.f48585o.clear();
                Future future = this.f48574d;
                if (future != null) {
                    future.cancel(false);
                    this.f48574d = null;
                    this.f48575e = 0L;
                }
                this.f48578h = 0;
                if (this.f48572b.isHeld()) {
                    try {
                        this.f48572b.release();
                        if (this.f48579i != null) {
                            this.f48579i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            String.valueOf(this.f48582l).concat(" failed to release!");
                            if (this.f48579i != null) {
                                this.f48579i = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    String.valueOf(this.f48582l).concat(" should be held!");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z;
        synchronized (this.f48571a) {
            if (this.f48573c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.f48586p.decrementAndGet() < 0) {
            String.valueOf(this.f48582l).concat(" release without a matched acquire!");
        }
        synchronized (this.f48571a) {
            try {
                m46055a(null);
                if (this.f48585o.containsKey(null)) {
                    C21794qf2 c21794qf2 = (C21794qf2) this.f48585o.get(null);
                    if (c21794qf2 != null) {
                        int i = c21794qf2.f77027a - 1;
                        c21794qf2.f77027a = i;
                        if (i == 0) {
                            this.f48585o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f48582l).concat(" counter does not exist"));
                }
                m46053c(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.f48571a) {
            this.f48577g = z;
        }
    }
}
