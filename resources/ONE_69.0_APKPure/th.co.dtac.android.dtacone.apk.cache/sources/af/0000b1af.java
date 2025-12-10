package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.ScreenTraceUtil;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class FragmentStateMonitor extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: f */
    public static final AndroidLogger f56093f = AndroidLogger.getInstance();

    /* renamed from: a */
    public final WeakHashMap f56094a = new WeakHashMap();

    /* renamed from: b */
    public final Clock f56095b;

    /* renamed from: c */
    public final TransportManager f56096c;

    /* renamed from: d */
    public final AppStateMonitor f56097d;

    /* renamed from: e */
    public final FrameMetricsRecorder f56098e;

    public FragmentStateMonitor(Clock clock, TransportManager transportManager, AppStateMonitor appStateMonitor, FrameMetricsRecorder frameMetricsRecorder) {
        this.f56095b = clock;
        this.f56096c = transportManager;
        this.f56097d = appStateMonitor;
        this.f56098e = frameMetricsRecorder;
    }

    public String getFragmentScreenTraceName(Fragment fragment) {
        return Constants.SCREEN_TRACE_PREFIX + fragment.getClass().getSimpleName();
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        AndroidLogger androidLogger = f56093f;
        androidLogger.debug("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f56094a.containsKey(fragment)) {
            androidLogger.warn("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f56094a.get(fragment);
        this.f56094a.remove(fragment);
        Optional<FrameMetricsCalculator.PerfFrameMetrics> stopFragment = this.f56098e.stopFragment(fragment);
        if (!stopFragment.isAvailable()) {
            androidLogger.warn("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        ScreenTraceUtil.addFrameCounters(trace, stopFragment.get());
        trace.stop();
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        String simpleName;
        super.onFragmentResumed(fragmentManager, fragment);
        f56093f.debug("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(getFragmentScreenTraceName(fragment), this.f56096c, this.f56095b, this.f56097d);
        trace.start();
        if (fragment.getParentFragment() == null) {
            simpleName = Constants.PARENT_FRAGMENT_ATTRIBUTE_VALUE_NONE;
        } else {
            simpleName = fragment.getParentFragment().getClass().getSimpleName();
        }
        trace.putAttribute(Constants.PARENT_FRAGMENT_ATTRIBUTE_KEY, simpleName);
        if (fragment.getActivity() != null) {
            trace.putAttribute(Constants.ACTIVITY_ATTRIBUTE_KEY, fragment.getActivity().getClass().getSimpleName());
        }
        this.f56094a.put(fragment, trace);
        this.f56098e.startFragment(fragment);
    }
}