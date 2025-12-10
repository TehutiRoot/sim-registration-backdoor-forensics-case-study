package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class FrameMetricsRecorder {

    /* renamed from: e */
    public static final AndroidLogger f56087e = AndroidLogger.getInstance();

    /* renamed from: a */
    public final Activity f56088a;

    /* renamed from: b */
    public final FrameMetricsAggregator f56089b;

    /* renamed from: c */
    public final Map f56090c;

    /* renamed from: d */
    public boolean f56091d;

    public FrameMetricsRecorder(Activity activity) {
        this(activity, new FrameMetricsAggregator(), new HashMap());
    }

    /* renamed from: a */
    public static boolean m38306a() {
        return true;
    }

    /* renamed from: b */
    public final Optional m38305b() {
        if (!this.f56091d) {
            f56087e.debug("No recording has been started.");
            return Optional.absent();
        }
        SparseIntArray[] metrics = this.f56089b.getMetrics();
        if (metrics == null) {
            f56087e.debug("FrameMetricsAggregator.mMetrics is uninitialized.");
            return Optional.absent();
        } else if (metrics[0] == null) {
            f56087e.debug("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return Optional.absent();
        } else {
            return Optional.m38156of(FrameMetricsCalculator.calculateFrameMetrics(metrics));
        }
    }

    public void start() {
        if (this.f56091d) {
            f56087e.debug("FrameMetricsAggregator is already recording %s", this.f56088a.getClass().getSimpleName());
            return;
        }
        this.f56089b.add(this.f56088a);
        this.f56091d = true;
    }

    public void startFragment(Fragment fragment) {
        if (!this.f56091d) {
            f56087e.debug("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f56090c.containsKey(fragment)) {
            f56087e.debug("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            Optional m38305b = m38305b();
            if (!m38305b.isAvailable()) {
                f56087e.debug("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            } else {
                this.f56090c.put(fragment, (FrameMetricsCalculator.PerfFrameMetrics) m38305b.get());
            }
        }
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stop() {
        if (!this.f56091d) {
            f56087e.debug("Cannot stop because no recording was started");
            return Optional.absent();
        }
        if (!this.f56090c.isEmpty()) {
            f56087e.debug("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f56090c.clear();
        }
        Optional<FrameMetricsCalculator.PerfFrameMetrics> m38305b = m38305b();
        try {
            this.f56089b.remove(this.f56088a);
        } catch (IllegalArgumentException | NullPointerException e) {
            if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e;
            }
            f56087e.warn("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
            m38305b = Optional.absent();
        }
        this.f56089b.reset();
        this.f56091d = false;
        return m38305b;
    }

    public Optional<FrameMetricsCalculator.PerfFrameMetrics> stopFragment(Fragment fragment) {
        if (!this.f56091d) {
            f56087e.debug("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return Optional.absent();
        } else if (!this.f56090c.containsKey(fragment)) {
            f56087e.debug("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return Optional.absent();
        } else {
            FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics = (FrameMetricsCalculator.PerfFrameMetrics) this.f56090c.remove(fragment);
            Optional m38305b = m38305b();
            if (!m38305b.isAvailable()) {
                f56087e.debug("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return Optional.absent();
            }
            return Optional.m38156of(((FrameMetricsCalculator.PerfFrameMetrics) m38305b.get()).deltaFrameMetricsFromSnapshot(perfFrameMetrics));
        }
    }

    public FrameMetricsRecorder(Activity activity, FrameMetricsAggregator frameMetricsAggregator, Map map) {
        this.f56091d = false;
        this.f56088a = activity;
        this.f56089b = frameMetricsAggregator;
        this.f56090c = map;
    }
}
