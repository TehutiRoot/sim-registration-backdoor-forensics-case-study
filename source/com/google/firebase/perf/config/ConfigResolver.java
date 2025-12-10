package com.google.firebase.perf.config;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Utils;

/* loaded from: classes4.dex */
public class ConfigResolver {

    /* renamed from: d */
    public static final AndroidLogger f56092d = AndroidLogger.getInstance();

    /* renamed from: e */
    public static volatile ConfigResolver f56093e;

    /* renamed from: a */
    public final RemoteConfigManager f56094a;

    /* renamed from: b */
    public ImmutableBundle f56095b;

    /* renamed from: c */
    public DeviceCacheManager f56096c;

    @VisibleForTesting
    public ConfigResolver(@Nullable RemoteConfigManager remoteConfigManager, @Nullable ImmutableBundle immutableBundle, @Nullable DeviceCacheManager deviceCacheManager) {
        this.f56094a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f56095b = immutableBundle == null ? new ImmutableBundle() : immutableBundle;
        this.f56096c = deviceCacheManager == null ? DeviceCacheManager.getInstance() : deviceCacheManager;
    }

    @VisibleForTesting
    public static void clearInstance() {
        f56093e = null;
    }

    public static synchronized ConfigResolver getInstance() {
        ConfigResolver configResolver;
        synchronized (ConfigResolver.class) {
            try {
                if (f56093e == null) {
                    f56093e = new ConfigResolver(null, null, null);
                }
                configResolver = f56093e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configResolver;
    }

    /* renamed from: a */
    public final Optional m38304a(AbstractC17229zw abstractC17229zw) {
        return this.f56096c.getBoolean(abstractC17229zw.getDeviceCacheFlag());
    }

    /* renamed from: b */
    public final Optional m38303b(AbstractC17229zw abstractC17229zw) {
        return this.f56096c.getDouble(abstractC17229zw.getDeviceCacheFlag());
    }

    /* renamed from: c */
    public final Optional m38302c(AbstractC17229zw abstractC17229zw) {
        return this.f56096c.getLong(abstractC17229zw.getDeviceCacheFlag());
    }

    /* renamed from: d */
    public final Optional m38301d(AbstractC17229zw abstractC17229zw) {
        return this.f56096c.getString(abstractC17229zw.getDeviceCacheFlag());
    }

    /* renamed from: e */
    public final boolean m38300e() {
        ConfigurationConstants$SdkEnabled configurationConstants$SdkEnabled = ConfigurationConstants$SdkEnabled.getInstance();
        Optional m38295j = m38295j(configurationConstants$SdkEnabled);
        if (m38295j.isAvailable()) {
            if (this.f56094a.isLastFetchFailed()) {
                return false;
            }
            this.f56096c.setValue(configurationConstants$SdkEnabled.getDeviceCacheFlag(), ((Boolean) m38295j.get()).booleanValue());
            return ((Boolean) m38295j.get()).booleanValue();
        }
        Optional m38304a = m38304a(configurationConstants$SdkEnabled);
        if (m38304a.isAvailable()) {
            return ((Boolean) m38304a.get()).booleanValue();
        }
        return configurationConstants$SdkEnabled.getDefault().booleanValue();
    }

    /* renamed from: f */
    public final boolean m38299f() {
        ConfigurationConstants$SdkDisabledVersions configurationConstants$SdkDisabledVersions = ConfigurationConstants$SdkDisabledVersions.getInstance();
        Optional m38292m = m38292m(configurationConstants$SdkDisabledVersions);
        if (m38292m.isAvailable()) {
            this.f56096c.setValue(configurationConstants$SdkDisabledVersions.getDeviceCacheFlag(), (String) m38292m.get());
            return m38290o((String) m38292m.get());
        }
        Optional m38301d = m38301d(configurationConstants$SdkDisabledVersions);
        if (m38301d.isAvailable()) {
            return m38290o((String) m38301d.get());
        }
        return m38290o(configurationConstants$SdkDisabledVersions.getDefault());
    }

    /* renamed from: g */
    public final Optional m38298g(AbstractC17229zw abstractC17229zw) {
        return this.f56095b.getBoolean(abstractC17229zw.getMetadataFlag());
    }

    public String getAndCacheLogSourceName() {
        String logSourceName;
        ConfigurationConstants$LogSourceName configurationConstants$LogSourceName = ConfigurationConstants$LogSourceName.getInstance();
        if (BuildConfig.ENFORCE_DEFAULT_LOG_SRC.booleanValue()) {
            return configurationConstants$LogSourceName.getDefault();
        }
        String remoteConfigFlag = configurationConstants$LogSourceName.getRemoteConfigFlag();
        long j = -1;
        if (remoteConfigFlag != null) {
            j = ((Long) this.f56094a.getRemoteConfigValueOrDefault(remoteConfigFlag, -1L)).longValue();
        }
        String deviceCacheFlag = configurationConstants$LogSourceName.getDeviceCacheFlag();
        if (ConfigurationConstants$LogSourceName.isLogSourceKnown(j) && (logSourceName = ConfigurationConstants$LogSourceName.getLogSourceName(j)) != null) {
            this.f56096c.setValue(deviceCacheFlag, logSourceName);
            return logSourceName;
        }
        Optional m38301d = m38301d(configurationConstants$LogSourceName);
        if (m38301d.isAvailable()) {
            return (String) m38301d.get();
        }
        return configurationConstants$LogSourceName.getDefault();
    }

    public double getFragmentSamplingRate() {
        ConfigurationConstants$FragmentSamplingRate configurationConstants$FragmentSamplingRate = ConfigurationConstants$FragmentSamplingRate.getInstance();
        Optional m38297h = m38297h(configurationConstants$FragmentSamplingRate);
        if (m38297h.isAvailable()) {
            double doubleValue = ((Double) m38297h.get()).doubleValue() / 100.0d;
            if (m38288q(doubleValue)) {
                return doubleValue;
            }
        }
        Optional m38294k = m38294k(configurationConstants$FragmentSamplingRate);
        if (m38294k.isAvailable() && m38288q(((Double) m38294k.get()).doubleValue())) {
            this.f56096c.setValue(configurationConstants$FragmentSamplingRate.getDeviceCacheFlag(), ((Double) m38294k.get()).doubleValue());
            return ((Double) m38294k.get()).doubleValue();
        }
        Optional m38303b = m38303b(configurationConstants$FragmentSamplingRate);
        if (m38303b.isAvailable() && m38288q(((Double) m38303b.get()).doubleValue())) {
            return ((Double) m38303b.get()).doubleValue();
        }
        return configurationConstants$FragmentSamplingRate.getDefault().doubleValue();
    }

    public boolean getIsExperimentTTIDEnabled() {
        ConfigurationConstants$ExperimentTTID configurationConstants$ExperimentTTID = ConfigurationConstants$ExperimentTTID.getInstance();
        Optional m38298g = m38298g(configurationConstants$ExperimentTTID);
        if (m38298g.isAvailable()) {
            return ((Boolean) m38298g.get()).booleanValue();
        }
        Optional m38295j = m38295j(configurationConstants$ExperimentTTID);
        if (m38295j.isAvailable()) {
            this.f56096c.setValue(configurationConstants$ExperimentTTID.getDeviceCacheFlag(), ((Boolean) m38295j.get()).booleanValue());
            return ((Boolean) m38295j.get()).booleanValue();
        }
        Optional m38304a = m38304a(configurationConstants$ExperimentTTID);
        if (m38304a.isAvailable()) {
            return ((Boolean) m38304a.get()).booleanValue();
        }
        return configurationConstants$ExperimentTTID.getDefault().booleanValue();
    }

    @Nullable
    public Boolean getIsPerformanceCollectionDeactivated() {
        ConfigurationConstants$CollectionDeactivated configurationConstants$CollectionDeactivated = ConfigurationConstants$CollectionDeactivated.getInstance();
        Optional m38298g = m38298g(configurationConstants$CollectionDeactivated);
        if (m38298g.isAvailable()) {
            return (Boolean) m38298g.get();
        }
        return configurationConstants$CollectionDeactivated.getDefault();
    }

    @Nullable
    public Boolean getIsPerformanceCollectionEnabled() {
        if (getIsPerformanceCollectionDeactivated().booleanValue()) {
            return Boolean.FALSE;
        }
        ConfigurationConstants$CollectionEnabled configurationConstants$CollectionEnabled = ConfigurationConstants$CollectionEnabled.getInstance();
        Optional m38304a = m38304a(configurationConstants$CollectionEnabled);
        if (m38304a.isAvailable()) {
            return (Boolean) m38304a.get();
        }
        Optional m38298g = m38298g(configurationConstants$CollectionEnabled);
        if (m38298g.isAvailable()) {
            return (Boolean) m38298g.get();
        }
        return null;
    }

    public boolean getIsServiceCollectionEnabled() {
        if (m38300e() && !m38299f()) {
            return true;
        }
        return false;
    }

    public long getNetworkEventCountBackground() {
        ConfigurationConstants$NetworkEventCountBackground configurationConstants$NetworkEventCountBackground = ConfigurationConstants$NetworkEventCountBackground.getInstance();
        Optional m38293l = m38293l(configurationConstants$NetworkEventCountBackground);
        if (m38293l.isAvailable() && m38291n(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$NetworkEventCountBackground.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$NetworkEventCountBackground);
        if (m38302c.isAvailable() && m38291n(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$NetworkEventCountBackground.getDefault().longValue();
    }

    public long getNetworkEventCountForeground() {
        ConfigurationConstants$NetworkEventCountForeground configurationConstants$NetworkEventCountForeground = ConfigurationConstants$NetworkEventCountForeground.getInstance();
        Optional m38293l = m38293l(configurationConstants$NetworkEventCountForeground);
        if (m38293l.isAvailable() && m38291n(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$NetworkEventCountForeground.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$NetworkEventCountForeground);
        if (m38302c.isAvailable() && m38291n(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$NetworkEventCountForeground.getDefault().longValue();
    }

    public double getNetworkRequestSamplingRate() {
        ConfigurationConstants$NetworkRequestSamplingRate configurationConstants$NetworkRequestSamplingRate = ConfigurationConstants$NetworkRequestSamplingRate.getInstance();
        Optional m38294k = m38294k(configurationConstants$NetworkRequestSamplingRate);
        if (m38294k.isAvailable() && m38288q(((Double) m38294k.get()).doubleValue())) {
            this.f56096c.setValue(configurationConstants$NetworkRequestSamplingRate.getDeviceCacheFlag(), ((Double) m38294k.get()).doubleValue());
            return ((Double) m38294k.get()).doubleValue();
        }
        Optional m38303b = m38303b(configurationConstants$NetworkRequestSamplingRate);
        if (m38303b.isAvailable() && m38288q(((Double) m38303b.get()).doubleValue())) {
            return ((Double) m38303b.get()).doubleValue();
        }
        if (this.f56094a.isLastFetchFailed()) {
            return configurationConstants$NetworkRequestSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$NetworkRequestSamplingRate.getDefault().doubleValue();
    }

    public long getRateLimitSec() {
        ConfigurationConstants$RateLimitSec configurationConstants$RateLimitSec = ConfigurationConstants$RateLimitSec.getInstance();
        Optional m38293l = m38293l(configurationConstants$RateLimitSec);
        if (m38293l.isAvailable() && m38286s(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$RateLimitSec.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$RateLimitSec);
        if (m38302c.isAvailable() && m38286s(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$RateLimitSec.getDefault().longValue();
    }

    public long getSessionsCpuCaptureFrequencyBackgroundMs() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs = ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getInstance();
        Optional m38296i = m38296i(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (m38296i.isAvailable() && m38289p(((Long) m38296i.get()).longValue())) {
            return ((Long) m38296i.get()).longValue();
        }
        Optional m38293l = m38293l(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (m38293l.isAvailable() && m38289p(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs);
        if (m38302c.isAvailable() && m38289p(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$SessionsCpuCaptureFrequencyBackgroundMs.getDefault().longValue();
    }

    public long getSessionsCpuCaptureFrequencyForegroundMs() {
        ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs configurationConstants$SessionsCpuCaptureFrequencyForegroundMs = ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getInstance();
        Optional m38296i = m38296i(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (m38296i.isAvailable() && m38289p(((Long) m38296i.get()).longValue())) {
            return ((Long) m38296i.get()).longValue();
        }
        Optional m38293l = m38293l(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (m38293l.isAvailable() && m38289p(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$SessionsCpuCaptureFrequencyForegroundMs);
        if (m38302c.isAvailable() && m38289p(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        if (this.f56094a.isLastFetchFailed()) {
            return configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDefaultOnRcFetchFail().longValue();
        }
        return configurationConstants$SessionsCpuCaptureFrequencyForegroundMs.getDefault().longValue();
    }

    public long getSessionsMaxDurationMinutes() {
        ConfigurationConstants$SessionsMaxDurationMinutes configurationConstants$SessionsMaxDurationMinutes = ConfigurationConstants$SessionsMaxDurationMinutes.getInstance();
        Optional m38296i = m38296i(configurationConstants$SessionsMaxDurationMinutes);
        if (m38296i.isAvailable() && m38287r(((Long) m38296i.get()).longValue())) {
            return ((Long) m38296i.get()).longValue();
        }
        Optional m38293l = m38293l(configurationConstants$SessionsMaxDurationMinutes);
        if (m38293l.isAvailable() && m38287r(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$SessionsMaxDurationMinutes.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$SessionsMaxDurationMinutes);
        if (m38302c.isAvailable() && m38287r(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$SessionsMaxDurationMinutes.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyBackgroundMs() {
        C8569xa42982f3 c8569xa42982f3 = C8569xa42982f3.getInstance();
        Optional m38296i = m38296i(c8569xa42982f3);
        if (m38296i.isAvailable() && m38289p(((Long) m38296i.get()).longValue())) {
            return ((Long) m38296i.get()).longValue();
        }
        Optional m38293l = m38293l(c8569xa42982f3);
        if (m38293l.isAvailable() && m38289p(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(c8569xa42982f3.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(c8569xa42982f3);
        if (m38302c.isAvailable() && m38289p(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return c8569xa42982f3.getDefault().longValue();
    }

    public long getSessionsMemoryCaptureFrequencyForegroundMs() {
        C8570xbe24e5c8 c8570xbe24e5c8 = C8570xbe24e5c8.getInstance();
        Optional m38296i = m38296i(c8570xbe24e5c8);
        if (m38296i.isAvailable() && m38289p(((Long) m38296i.get()).longValue())) {
            return ((Long) m38296i.get()).longValue();
        }
        Optional m38293l = m38293l(c8570xbe24e5c8);
        if (m38293l.isAvailable() && m38289p(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(c8570xbe24e5c8.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(c8570xbe24e5c8);
        if (m38302c.isAvailable() && m38289p(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        if (this.f56094a.isLastFetchFailed()) {
            return c8570xbe24e5c8.getDefaultOnRcFetchFail().longValue();
        }
        return c8570xbe24e5c8.getDefault().longValue();
    }

    public double getSessionsSamplingRate() {
        ConfigurationConstants$SessionsSamplingRate configurationConstants$SessionsSamplingRate = ConfigurationConstants$SessionsSamplingRate.getInstance();
        Optional m38297h = m38297h(configurationConstants$SessionsSamplingRate);
        if (m38297h.isAvailable()) {
            double doubleValue = ((Double) m38297h.get()).doubleValue() / 100.0d;
            if (m38288q(doubleValue)) {
                return doubleValue;
            }
        }
        Optional m38294k = m38294k(configurationConstants$SessionsSamplingRate);
        if (m38294k.isAvailable() && m38288q(((Double) m38294k.get()).doubleValue())) {
            this.f56096c.setValue(configurationConstants$SessionsSamplingRate.getDeviceCacheFlag(), ((Double) m38294k.get()).doubleValue());
            return ((Double) m38294k.get()).doubleValue();
        }
        Optional m38303b = m38303b(configurationConstants$SessionsSamplingRate);
        if (m38303b.isAvailable() && m38288q(((Double) m38303b.get()).doubleValue())) {
            return ((Double) m38303b.get()).doubleValue();
        }
        if (this.f56094a.isLastFetchFailed()) {
            return configurationConstants$SessionsSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$SessionsSamplingRate.getDefault().doubleValue();
    }

    public long getTraceEventCountBackground() {
        ConfigurationConstants$TraceEventCountBackground configurationConstants$TraceEventCountBackground = ConfigurationConstants$TraceEventCountBackground.getInstance();
        Optional m38293l = m38293l(configurationConstants$TraceEventCountBackground);
        if (m38293l.isAvailable() && m38291n(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$TraceEventCountBackground.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$TraceEventCountBackground);
        if (m38302c.isAvailable() && m38291n(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$TraceEventCountBackground.getDefault().longValue();
    }

    public long getTraceEventCountForeground() {
        ConfigurationConstants$TraceEventCountForeground configurationConstants$TraceEventCountForeground = ConfigurationConstants$TraceEventCountForeground.getInstance();
        Optional m38293l = m38293l(configurationConstants$TraceEventCountForeground);
        if (m38293l.isAvailable() && m38291n(((Long) m38293l.get()).longValue())) {
            this.f56096c.setValue(configurationConstants$TraceEventCountForeground.getDeviceCacheFlag(), ((Long) m38293l.get()).longValue());
            return ((Long) m38293l.get()).longValue();
        }
        Optional m38302c = m38302c(configurationConstants$TraceEventCountForeground);
        if (m38302c.isAvailable() && m38291n(((Long) m38302c.get()).longValue())) {
            return ((Long) m38302c.get()).longValue();
        }
        return configurationConstants$TraceEventCountForeground.getDefault().longValue();
    }

    public double getTraceSamplingRate() {
        ConfigurationConstants$TraceSamplingRate configurationConstants$TraceSamplingRate = ConfigurationConstants$TraceSamplingRate.getInstance();
        Optional m38294k = m38294k(configurationConstants$TraceSamplingRate);
        if (m38294k.isAvailable() && m38288q(((Double) m38294k.get()).doubleValue())) {
            this.f56096c.setValue(configurationConstants$TraceSamplingRate.getDeviceCacheFlag(), ((Double) m38294k.get()).doubleValue());
            return ((Double) m38294k.get()).doubleValue();
        }
        Optional m38303b = m38303b(configurationConstants$TraceSamplingRate);
        if (m38303b.isAvailable() && m38288q(((Double) m38303b.get()).doubleValue())) {
            return ((Double) m38303b.get()).doubleValue();
        }
        if (this.f56094a.isLastFetchFailed()) {
            return configurationConstants$TraceSamplingRate.getDefaultOnRcFetchFail().doubleValue();
        }
        return configurationConstants$TraceSamplingRate.getDefault().doubleValue();
    }

    /* renamed from: h */
    public final Optional m38297h(AbstractC17229zw abstractC17229zw) {
        return this.f56095b.getDouble(abstractC17229zw.getMetadataFlag());
    }

    /* renamed from: i */
    public final Optional m38296i(AbstractC17229zw abstractC17229zw) {
        return this.f56095b.getLong(abstractC17229zw.getMetadataFlag());
    }

    public boolean isCollectionEnabledConfigValueAvailable() {
        Optional m38295j = m38295j(ConfigurationConstants$SdkEnabled.getInstance());
        if (!m38304a(ConfigurationConstants$CollectionEnabled.getInstance()).isAvailable() && !m38295j.isAvailable()) {
            return false;
        }
        return true;
    }

    public boolean isPerformanceMonitoringEnabled() {
        Boolean isPerformanceCollectionEnabled = getIsPerformanceCollectionEnabled();
        if ((isPerformanceCollectionEnabled == null || isPerformanceCollectionEnabled.booleanValue()) && getIsServiceCollectionEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final Optional m38295j(AbstractC17229zw abstractC17229zw) {
        return this.f56094a.getBoolean(abstractC17229zw.getRemoteConfigFlag());
    }

    /* renamed from: k */
    public final Optional m38294k(AbstractC17229zw abstractC17229zw) {
        return this.f56094a.getDouble(abstractC17229zw.getRemoteConfigFlag());
    }

    /* renamed from: l */
    public final Optional m38293l(AbstractC17229zw abstractC17229zw) {
        return this.f56094a.getLong(abstractC17229zw.getRemoteConfigFlag());
    }

    /* renamed from: m */
    public final Optional m38292m(AbstractC17229zw abstractC17229zw) {
        return this.f56094a.getString(abstractC17229zw.getRemoteConfigFlag());
    }

    /* renamed from: n */
    public final boolean m38291n(long j) {
        return j >= 0;
    }

    /* renamed from: o */
    public final boolean m38290o(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(BuildConfig.FIREPERF_VERSION_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m38289p(long j) {
        return j >= 0;
    }

    /* renamed from: q */
    public final boolean m38288q(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    /* renamed from: r */
    public final boolean m38287r(long j) {
        return j > 0;
    }

    /* renamed from: s */
    public final boolean m38286s(long j) {
        return j > 0;
    }

    public void setApplicationContext(Context context) {
        f56092d.setLogcatEnabled(Utils.isDebugLoggingEnabled(context));
        this.f56096c.setContext(context);
    }

    public void setContentProviderContext(Context context) {
        setApplicationContext(context.getApplicationContext());
    }

    @VisibleForTesting
    public void setDeviceCacheManager(DeviceCacheManager deviceCacheManager) {
        this.f56096c = deviceCacheManager;
    }

    public void setIsPerformanceCollectionEnabled(Boolean bool) {
        String deviceCacheFlag;
        if (!getIsPerformanceCollectionDeactivated().booleanValue() && (deviceCacheFlag = ConfigurationConstants$CollectionEnabled.getInstance().getDeviceCacheFlag()) != null) {
            if (bool != null) {
                this.f56096c.setValue(deviceCacheFlag, Boolean.TRUE.equals(bool));
            } else {
                this.f56096c.clear(deviceCacheFlag);
            }
        }
    }

    public void setMetadataBundle(ImmutableBundle immutableBundle) {
        this.f56095b = immutableBundle;
    }
}
