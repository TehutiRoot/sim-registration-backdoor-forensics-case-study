package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, m29142d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "deviceModel", "sessionSdkVersion", "osVersion", "Lcom/google/firebase/sessions/LogEnvironment;", "logEnvironment", "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/LogEnvironment;", "component6", "()Lcom/google/firebase/sessions/AndroidApplicationInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/LogEnvironment;Lcom/google/firebase/sessions/AndroidApplicationInfo;)Lcom/google/firebase/sessions/ApplicationInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getAppId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDeviceModel", OperatorName.CURVE_TO, "getSessionSdkVersion", "d", "getOsVersion", "e", "Lcom/google/firebase/sessions/LogEnvironment;", "getLogEnvironment", OperatorName.FILL_NON_ZERO, "Lcom/google/firebase/sessions/AndroidApplicationInfo;", "getAndroidAppInfo", "com.google.firebase-firebase-sessions"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApplicationInfo {

    /* renamed from: a */
    public final String f56498a;

    /* renamed from: b */
    public final String f56499b;

    /* renamed from: c */
    public final String f56500c;

    /* renamed from: d */
    public final String f56501d;

    /* renamed from: e */
    public final LogEnvironment f56502e;

    /* renamed from: f */
    public final AndroidApplicationInfo f56503f;

    public ApplicationInfo(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f56498a = appId;
        this.f56499b = deviceModel;
        this.f56500c = sessionSdkVersion;
        this.f56501d = osVersion;
        this.f56502e = logEnvironment;
        this.f56503f = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationInfo.f56498a;
        }
        if ((i & 2) != 0) {
            str2 = applicationInfo.f56499b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = applicationInfo.f56500c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = applicationInfo.f56501d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            logEnvironment = applicationInfo.f56502e;
        }
        LogEnvironment logEnvironment2 = logEnvironment;
        if ((i & 32) != 0) {
            androidApplicationInfo = applicationInfo.f56503f;
        }
        return applicationInfo.copy(str, str5, str6, str7, logEnvironment2, androidApplicationInfo);
    }

    @NotNull
    public final String component1() {
        return this.f56498a;
    }

    @NotNull
    public final String component2() {
        return this.f56499b;
    }

    @NotNull
    public final String component3() {
        return this.f56500c;
    }

    @NotNull
    public final String component4() {
        return this.f56501d;
    }

    @NotNull
    public final LogEnvironment component5() {
        return this.f56502e;
    }

    @NotNull
    public final AndroidApplicationInfo component6() {
        return this.f56503f;
    }

    @NotNull
    public final ApplicationInfo copy(@NotNull String appId, @NotNull String deviceModel, @NotNull String sessionSdkVersion, @NotNull String osVersion, @NotNull LogEnvironment logEnvironment, @NotNull AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApplicationInfo) {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            return Intrinsics.areEqual(this.f56498a, applicationInfo.f56498a) && Intrinsics.areEqual(this.f56499b, applicationInfo.f56499b) && Intrinsics.areEqual(this.f56500c, applicationInfo.f56500c) && Intrinsics.areEqual(this.f56501d, applicationInfo.f56501d) && this.f56502e == applicationInfo.f56502e && Intrinsics.areEqual(this.f56503f, applicationInfo.f56503f);
        }
        return false;
    }

    @NotNull
    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.f56503f;
    }

    @NotNull
    public final String getAppId() {
        return this.f56498a;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.f56499b;
    }

    @NotNull
    public final LogEnvironment getLogEnvironment() {
        return this.f56502e;
    }

    @NotNull
    public final String getOsVersion() {
        return this.f56501d;
    }

    @NotNull
    public final String getSessionSdkVersion() {
        return this.f56500c;
    }

    public int hashCode() {
        return (((((((((this.f56498a.hashCode() * 31) + this.f56499b.hashCode()) * 31) + this.f56500c.hashCode()) * 31) + this.f56501d.hashCode()) * 31) + this.f56502e.hashCode()) * 31) + this.f56503f.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationInfo(appId=" + this.f56498a + ", deviceModel=" + this.f56499b + ", sessionSdkVersion=" + this.f56500c + ", osVersion=" + this.f56501d + ", logEnvironment=" + this.f56502e + ", androidAppInfo=" + this.f56503f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}