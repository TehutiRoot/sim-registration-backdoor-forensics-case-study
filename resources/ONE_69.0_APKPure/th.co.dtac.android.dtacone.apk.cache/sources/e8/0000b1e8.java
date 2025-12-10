package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.ApplicationInfo;

/* loaded from: classes4.dex */
public class FirebasePerfApplicationInfoValidator extends PerfMetricValidator {

    /* renamed from: b */
    public static final AndroidLogger f56222b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final ApplicationInfo f56223a;

    public FirebasePerfApplicationInfoValidator(ApplicationInfo applicationInfo) {
        this.f56223a = applicationInfo;
    }

    /* renamed from: b */
    public final boolean m38219b() {
        ApplicationInfo applicationInfo = this.f56223a;
        if (applicationInfo == null) {
            f56222b.warn("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo.hasGoogleAppId()) {
            f56222b.warn("GoogleAppId is null");
            return false;
        } else if (!this.f56223a.hasAppInstanceId()) {
            f56222b.warn("AppInstanceId is null");
            return false;
        } else if (!this.f56223a.hasApplicationProcessState()) {
            f56222b.warn("ApplicationProcessState is null");
            return false;
        } else if (this.f56223a.hasAndroidAppInfo()) {
            if (!this.f56223a.getAndroidAppInfo().hasPackageName()) {
                f56222b.warn("AndroidAppInfo.packageName is null");
                return false;
            } else if (!this.f56223a.getAndroidAppInfo().hasSdkVersion()) {
                f56222b.warn("AndroidAppInfo.sdkVersion is null");
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (!m38219b()) {
            f56222b.warn("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}