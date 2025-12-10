package com.google.firebase.sessions;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, m29142d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "versionName", "appBuildVersion", "deviceManufacturer", "Lcom/google/firebase/sessions/ProcessDetails;", "currentProcessDetails", "", "appProcessDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/google/firebase/sessions/ProcessDetails;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/sessions/ProcessDetails;Ljava/util/List;)Lcom/google/firebase/sessions/AndroidApplicationInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPackageName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getVersionName", OperatorName.CURVE_TO, "getAppBuildVersion", "d", "getDeviceManufacturer", "e", "Lcom/google/firebase/sessions/ProcessDetails;", "getCurrentProcessDetails", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getAppProcessDetails", "com.google.firebase-firebase-sessions"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class AndroidApplicationInfo {

    /* renamed from: a */
    public final String f56492a;

    /* renamed from: b */
    public final String f56493b;

    /* renamed from: c */
    public final String f56494c;

    /* renamed from: d */
    public final String f56495d;

    /* renamed from: e */
    public final ProcessDetails f56496e;

    /* renamed from: f */
    public final List f56497f;

    public AndroidApplicationInfo(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f56492a = packageName;
        this.f56493b = versionName;
        this.f56494c = appBuildVersion;
        this.f56495d = deviceManufacturer;
        this.f56496e = currentProcessDetails;
        this.f56497f = appProcessDetails;
    }

    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = androidApplicationInfo.f56492a;
        }
        if ((i & 2) != 0) {
            str2 = androidApplicationInfo.f56493b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = androidApplicationInfo.f56494c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = androidApplicationInfo.f56495d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            processDetails = androidApplicationInfo.f56496e;
        }
        ProcessDetails processDetails2 = processDetails;
        List list2 = list;
        if ((i & 32) != 0) {
            list2 = androidApplicationInfo.f56497f;
        }
        return androidApplicationInfo.copy(str, str5, str6, str7, processDetails2, list2);
    }

    @NotNull
    public final String component1() {
        return this.f56492a;
    }

    @NotNull
    public final String component2() {
        return this.f56493b;
    }

    @NotNull
    public final String component3() {
        return this.f56494c;
    }

    @NotNull
    public final String component4() {
        return this.f56495d;
    }

    @NotNull
    public final ProcessDetails component5() {
        return this.f56496e;
    }

    @NotNull
    public final List<ProcessDetails> component6() {
        return this.f56497f;
    }

    @NotNull
    public final AndroidApplicationInfo copy(@NotNull String packageName, @NotNull String versionName, @NotNull String appBuildVersion, @NotNull String deviceManufacturer, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidApplicationInfo) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            return Intrinsics.areEqual(this.f56492a, androidApplicationInfo.f56492a) && Intrinsics.areEqual(this.f56493b, androidApplicationInfo.f56493b) && Intrinsics.areEqual(this.f56494c, androidApplicationInfo.f56494c) && Intrinsics.areEqual(this.f56495d, androidApplicationInfo.f56495d) && Intrinsics.areEqual(this.f56496e, androidApplicationInfo.f56496e) && Intrinsics.areEqual(this.f56497f, androidApplicationInfo.f56497f);
        }
        return false;
    }

    @NotNull
    public final String getAppBuildVersion() {
        return this.f56494c;
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails() {
        return this.f56497f;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails() {
        return this.f56496e;
    }

    @NotNull
    public final String getDeviceManufacturer() {
        return this.f56495d;
    }

    @NotNull
    public final String getPackageName() {
        return this.f56492a;
    }

    @NotNull
    public final String getVersionName() {
        return this.f56493b;
    }

    public int hashCode() {
        return (((((((((this.f56492a.hashCode() * 31) + this.f56493b.hashCode()) * 31) + this.f56494c.hashCode()) * 31) + this.f56495d.hashCode()) * 31) + this.f56496e.hashCode()) * 31) + this.f56497f.hashCode();
    }

    @NotNull
    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f56492a + ", versionName=" + this.f56493b + ", appBuildVersion=" + this.f56494c + ", deviceManufacturer=" + this.f56495d + ", currentProcessDetails=" + this.f56496e + ", appProcessDetails=" + this.f56497f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}