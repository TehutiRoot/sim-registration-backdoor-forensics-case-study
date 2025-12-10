package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p016v1.ApplicationInfo;

/* loaded from: classes4.dex */
public class FirebasePerfApplicationInfoValidator extends PerfMetricValidator {

    /* renamed from: b */
    public static final AndroidLogger f56210b = AndroidLogger.getInstance();

    /* renamed from: a */
    public final ApplicationInfo f56211a;

    public FirebasePerfApplicationInfoValidator(ApplicationInfo applicationInfo) {
        this.f56211a = applicationInfo;
    }

    /* renamed from: b */
    public final boolean m38227b() {
        ApplicationInfo applicationInfo = this.f56211a;
        if (applicationInfo == null) {
            f56210b.warn("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo.hasGoogleAppId()) {
            f56210b.warn("GoogleAppId is null");
            return false;
        } else if (!this.f56211a.hasAppInstanceId()) {
            f56210b.warn("AppInstanceId is null");
            return false;
        } else if (!this.f56211a.hasApplicationProcessState()) {
            f56210b.warn("ApplicationProcessState is null");
            return false;
        } else if (this.f56211a.hasAndroidAppInfo()) {
            if (!this.f56211a.getAndroidAppInfo().hasPackageName()) {
                f56210b.warn("AndroidAppInfo.packageName is null");
                return false;
            } else if (!this.f56211a.getAndroidAppInfo().hasSdkVersion()) {
                f56210b.warn("AndroidAppInfo.sdkVersion is null");
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
        if (!m38227b()) {
            f56210b.warn("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
