package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u008e\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001dR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\bD\u0010\u0016¨\u0006E"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/DeviceExecution;", "", "Lcom/google/firebase/appdistribution/gradle/models/AppCrash;", "appCrash", "", "crawlGraphUri", "Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "device", "failedReason", "inconclusiveReason", "resultsStoragePath", "Lcom/google/firebase/appdistribution/gradle/models/RoboStats;", "roboStats", "", "screenshotUris", RemoteConfigConstants.ResponseFieldKey.STATE, "videoUri", "<init>", "(Lcom/google/firebase/appdistribution/gradle/models/AppCrash;Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/models/TestDevice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/models/RoboStats;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/google/firebase/appdistribution/gradle/models/AppCrash;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "component4", "component5", "component6", "component7", "()Lcom/google/firebase/appdistribution/gradle/models/RoboStats;", "component8", "()Ljava/util/List;", "component9", "component10", "copy", "(Lcom/google/firebase/appdistribution/gradle/models/AppCrash;Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/models/TestDevice;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/models/RoboStats;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/DeviceExecution;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/models/AppCrash;", "getAppCrash", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getCrawlGraphUri", OperatorName.CURVE_TO, "Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "getDevice", "d", "getFailedReason", "e", "getInconclusiveReason", OperatorName.FILL_NON_ZERO, "getResultsStoragePath", OperatorName.NON_STROKING_GRAY, "Lcom/google/firebase/appdistribution/gradle/models/RoboStats;", "getRoboStats", OperatorName.CLOSE_PATH, "Ljava/util/List;", "getScreenshotUris", "i", "getState", OperatorName.SET_LINE_JOINSTYLE, "getVideoUri", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DeviceExecution {
    @SerializedName("appCrash")
    @Nullable

    /* renamed from: a */
    private final AppCrash f54613a;
    @SerializedName("crawlGraphUri")
    @Nullable

    /* renamed from: b */
    private final String f54614b;
    @SerializedName("device")
    @Nullable

    /* renamed from: c */
    private final TestDevice f54615c;
    @SerializedName("failedReason")
    @Nullable

    /* renamed from: d */
    private final String f54616d;
    @SerializedName("inconclusiveReason")
    @Nullable

    /* renamed from: e */
    private final String f54617e;
    @SerializedName("resultsStoragePath")
    @Nullable

    /* renamed from: f */
    private final String f54618f;
    @SerializedName("roboStats")
    @Nullable

    /* renamed from: g */
    private final RoboStats f54619g;
    @SerializedName("screenshotUris")
    @Nullable

    /* renamed from: h */
    private final List<String> f54620h;
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    @Nullable

    /* renamed from: i */
    private final String f54621i;
    @SerializedName("videoUri")
    @Nullable

    /* renamed from: j */
    private final String f54622j;

    public DeviceExecution() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final AppCrash component1() {
        return this.f54613a;
    }

    @Nullable
    public final String component10() {
        return this.f54622j;
    }

    @Nullable
    public final String component2() {
        return this.f54614b;
    }

    @Nullable
    public final TestDevice component3() {
        return this.f54615c;
    }

    @Nullable
    public final String component4() {
        return this.f54616d;
    }

    @Nullable
    public final String component5() {
        return this.f54617e;
    }

    @Nullable
    public final String component6() {
        return this.f54618f;
    }

    @Nullable
    public final RoboStats component7() {
        return this.f54619g;
    }

    @Nullable
    public final List<String> component8() {
        return this.f54620h;
    }

    @Nullable
    public final String component9() {
        return this.f54621i;
    }

    @NotNull
    public final DeviceExecution copy(@Nullable AppCrash appCrash, @Nullable String str, @Nullable TestDevice testDevice, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable RoboStats roboStats, @Nullable List<String> list, @Nullable String str5, @Nullable String str6) {
        return new DeviceExecution(appCrash, str, testDevice, str2, str3, str4, roboStats, list, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceExecution) {
            DeviceExecution deviceExecution = (DeviceExecution) obj;
            return Intrinsics.areEqual(this.f54613a, deviceExecution.f54613a) && Intrinsics.areEqual(this.f54614b, deviceExecution.f54614b) && Intrinsics.areEqual(this.f54615c, deviceExecution.f54615c) && Intrinsics.areEqual(this.f54616d, deviceExecution.f54616d) && Intrinsics.areEqual(this.f54617e, deviceExecution.f54617e) && Intrinsics.areEqual(this.f54618f, deviceExecution.f54618f) && Intrinsics.areEqual(this.f54619g, deviceExecution.f54619g) && Intrinsics.areEqual(this.f54620h, deviceExecution.f54620h) && Intrinsics.areEqual(this.f54621i, deviceExecution.f54621i) && Intrinsics.areEqual(this.f54622j, deviceExecution.f54622j);
        }
        return false;
    }

    @Nullable
    public final AppCrash getAppCrash() {
        return this.f54613a;
    }

    @Nullable
    public final String getCrawlGraphUri() {
        return this.f54614b;
    }

    @Nullable
    public final TestDevice getDevice() {
        return this.f54615c;
    }

    @Nullable
    public final String getFailedReason() {
        return this.f54616d;
    }

    @Nullable
    public final String getInconclusiveReason() {
        return this.f54617e;
    }

    @Nullable
    public final String getResultsStoragePath() {
        return this.f54618f;
    }

    @Nullable
    public final RoboStats getRoboStats() {
        return this.f54619g;
    }

    @Nullable
    public final List<String> getScreenshotUris() {
        return this.f54620h;
    }

    @Nullable
    public final String getState() {
        return this.f54621i;
    }

    @Nullable
    public final String getVideoUri() {
        return this.f54622j;
    }

    public int hashCode() {
        AppCrash appCrash = this.f54613a;
        int hashCode = (appCrash == null ? 0 : appCrash.hashCode()) * 31;
        String str = this.f54614b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TestDevice testDevice = this.f54615c;
        int hashCode3 = (hashCode2 + (testDevice == null ? 0 : testDevice.hashCode())) * 31;
        String str2 = this.f54616d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54617e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f54618f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RoboStats roboStats = this.f54619g;
        int hashCode7 = (hashCode6 + (roboStats == null ? 0 : roboStats.hashCode())) * 31;
        List<String> list = this.f54620h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f54621i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f54622j;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceExecution(appCrash=" + this.f54613a + ", crawlGraphUri=" + this.f54614b + ", device=" + this.f54615c + ", failedReason=" + this.f54616d + ", inconclusiveReason=" + this.f54617e + ", resultsStoragePath=" + this.f54618f + ", roboStats=" + this.f54619g + ", screenshotUris=" + this.f54620h + ", state=" + this.f54621i + ", videoUri=" + this.f54622j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public DeviceExecution(@Nullable AppCrash appCrash, @Nullable String str, @Nullable TestDevice testDevice, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable RoboStats roboStats, @Nullable List<String> list, @Nullable String str5, @Nullable String str6) {
        this.f54613a = appCrash;
        this.f54614b = str;
        this.f54615c = testDevice;
        this.f54616d = str2;
        this.f54617e = str3;
        this.f54618f = str4;
        this.f54619g = roboStats;
        this.f54620h = list;
        this.f54621i = str5;
        this.f54622j = str6;
    }

    public /* synthetic */ DeviceExecution(AppCrash appCrash, String str, TestDevice testDevice, String str2, String str3, String str4, RoboStats roboStats, List list, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appCrash, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : testDevice, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : roboStats, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str5, (i & 512) == 0 ? str6 : null);
    }
}
