package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class Trace extends AppStateUpdateHandler implements Parcelable, FirebasePerformanceAttributable, SessionAwareObject {

    /* renamed from: a */
    public final WeakReference f56198a;

    /* renamed from: b */
    public final Trace f56199b;

    /* renamed from: c */
    public final GaugeManager f56200c;

    /* renamed from: d */
    public final String f56201d;

    /* renamed from: e */
    public final Map f56202e;

    /* renamed from: f */
    public final Map f56203f;

    /* renamed from: g */
    public final List f56204g;

    /* renamed from: h */
    public final List f56205h;

    /* renamed from: i */
    public final TransportManager f56206i;

    /* renamed from: j */
    public final Clock f56207j;

    /* renamed from: k */
    public Timer f56208k;

    /* renamed from: l */
    public Timer f56209l;

    /* renamed from: m */
    public static final AndroidLogger f56195m = AndroidLogger.getInstance();

    /* renamed from: n */
    public static final Map f56196n = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new C8576a();

    /* renamed from: o */
    public static final Parcelable.Creator f56197o = new C8577b();

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    /* loaded from: classes4.dex */
    public class C8576a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$b */
    /* loaded from: classes4.dex */
    public class C8577b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean z, C8576a c8576a) {
        this(parcel, z);
    }

    @NonNull
    public static Trace create(@NonNull String str) {
        return new Trace(str);
    }

    /* renamed from: a */
    public final void m38242a(String str, String str2) {
        if (!m38234i()) {
            if (!this.f56203f.containsKey(str) && this.f56203f.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            PerfMetricValidator.validateAttribute(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f56201d));
    }

    /* renamed from: b */
    public Map m38241b() {
        return this.f56202e;
    }

    /* renamed from: c */
    public Timer m38240c() {
        return this.f56209l;
    }

    /* renamed from: d */
    public List m38239d() {
        List unmodifiableList;
        synchronized (this.f56204g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f56204g) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Timer m38238e() {
        return this.f56208k;
    }

    /* renamed from: f */
    public List m38237f() {
        return this.f56205h;
    }

    public void finalize() throws Throwable {
        try {
            if (m38235h()) {
                f56195m.warn("Trace '%s' is started but not stopped when it is destructed!", this.f56201d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public boolean m38236g() {
        if (this.f56208k != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f56203f.get(str);
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f56203f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.f56202e.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.m38252a();
    }

    @NonNull
    @VisibleForTesting
    public String getName() {
        return this.f56201d;
    }

    /* renamed from: h */
    public boolean m38235h() {
        if (m38236g() && !m38234i()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m38234i() {
        if (this.f56209l != null) {
            return true;
        }
        return false;
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String validateMetricName = PerfMetricValidator.validateMetricName(str);
        if (validateMetricName != null) {
            f56195m.error("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, validateMetricName);
        } else if (!m38236g()) {
            f56195m.warn("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f56201d);
        } else if (m38234i()) {
            f56195m.warn("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f56201d);
        } else {
            Counter m38233j = m38233j(str.trim());
            m38233j.increment(j);
            f56195m.debug("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m38233j.m38252a()), this.f56201d);
        }
    }

    /* renamed from: j */
    public final Counter m38233j(String str) {
        Counter counter = (Counter) this.f56202e.get(str);
        if (counter == null) {
            Counter counter2 = new Counter(str);
            this.f56202e.put(str, counter2);
            return counter2;
        }
        return counter;
    }

    /* renamed from: k */
    public final void m38232k(Timer timer) {
        if (this.f56205h.isEmpty()) {
            return;
        }
        Trace trace = (Trace) this.f56205h.get(this.f56205h.size() - 1);
        if (trace.f56209l == null) {
            trace.f56209l = timer;
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
            m38242a(str, str2);
            f56195m.debug("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f56201d);
        } catch (Exception e) {
            f56195m.error("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f56203f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String validateMetricName = PerfMetricValidator.validateMetricName(str);
        if (validateMetricName != null) {
            f56195m.error("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, validateMetricName);
        } else if (!m38236g()) {
            f56195m.warn("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f56201d);
        } else if (m38234i()) {
            f56195m.warn("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f56201d);
        } else {
            m38233j(str.trim()).m38250c(j);
            f56195m.debug("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f56201d);
        }
    }

    @Override // com.google.firebase.perf.FirebasePerformanceAttributable
    @Keep
    public void removeAttribute(@NonNull String str) {
        if (m38234i()) {
            f56195m.error("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f56203f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!ConfigResolver.getInstance().isPerformanceMonitoringEnabled()) {
            f56195m.debug("Trace feature is disabled.");
            return;
        }
        String validateTraceName = PerfMetricValidator.validateTraceName(this.f56201d);
        if (validateTraceName != null) {
            f56195m.error("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f56201d, validateTraceName);
        } else if (this.f56208k != null) {
            f56195m.error("Trace '%s' has already started, should not start again!", this.f56201d);
        } else {
            this.f56208k = this.f56207j.getTime();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f56198a);
            updateSession(perfSession);
            if (perfSession.isGaugeAndEventCollectionEnabled()) {
                this.f56200c.collectGaugeMetricOnce(perfSession.getTimer());
            }
        }
    }

    @Keep
    public void stop() {
        if (!m38236g()) {
            f56195m.error("Trace '%s' has not been started so unable to stop!", this.f56201d);
        } else if (m38234i()) {
            f56195m.error("Trace '%s' has already stopped, should not stop again!", this.f56201d);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f56198a);
            unregisterForAppState();
            Timer time = this.f56207j.getTime();
            this.f56209l = time;
            if (this.f56199b == null) {
                m38232k(time);
                if (!this.f56201d.isEmpty()) {
                    this.f56206i.log(new IU1(this).m67906a(), getAppState());
                    if (SessionManager.getInstance().perfSession().isGaugeAndEventCollectionEnabled()) {
                        this.f56200c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().getTimer());
                        return;
                    }
                    return;
                }
                f56195m.error("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            f56195m.warn("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (m38236g() && !m38234i()) {
            this.f56204g.add(perfSession);
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f56199b, 0);
        parcel.writeString(this.f56201d);
        parcel.writeList(this.f56205h);
        parcel.writeMap(this.f56202e);
        parcel.writeParcelable(this.f56208k, 0);
        parcel.writeParcelable(this.f56209l, 0);
        synchronized (this.f56204g) {
            parcel.writeList(this.f56204g);
        }
    }

    public Trace(String str) {
        this(str, TransportManager.getInstance(), new Clock(), AppStateMonitor.getInstance(), GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull TransportManager transportManager, @NonNull Clock clock, @NonNull AppStateMonitor appStateMonitor) {
        this(str, transportManager, clock, appStateMonitor, GaugeManager.getInstance());
    }

    public Trace(@NonNull String str, @NonNull TransportManager transportManager, @NonNull Clock clock, @NonNull AppStateMonitor appStateMonitor, @NonNull GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.f56198a = new WeakReference(this);
        this.f56199b = null;
        this.f56201d = str.trim();
        this.f56205h = new ArrayList();
        this.f56202e = new ConcurrentHashMap();
        this.f56203f = new ConcurrentHashMap();
        this.f56207j = clock;
        this.f56206i = transportManager;
        this.f56204g = Collections.synchronizedList(new ArrayList());
        this.f56200c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : AppStateMonitor.getInstance());
        this.f56198a = new WeakReference(this);
        this.f56199b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f56201d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f56205h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f56202e = concurrentHashMap;
        this.f56203f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f56208k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f56209l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f56204g = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f56206i = null;
            this.f56207j = null;
            this.f56200c = null;
            return;
        }
        this.f56206i = TransportManager.getInstance();
        this.f56207j = new Clock();
        this.f56200c = GaugeManager.getInstance();
    }
}
