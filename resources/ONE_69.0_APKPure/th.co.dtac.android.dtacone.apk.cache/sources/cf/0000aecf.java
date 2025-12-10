package com.google.firebase.appdistribution.gradle.models.uploadstatus;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\f¨\u0006)"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;", "", "", "name", "displayVersion", "buildVersion", "firebaseConsoleUri", "testingUri", "binaryDownloadUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/Release;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisplayVersion", OperatorName.CURVE_TO, "getBuildVersion", "d", "getFirebaseConsoleUri", "e", "getTestingUri", OperatorName.FILL_NON_ZERO, "getBinaryDownloadUri", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Release {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f54662a;
    @SerializedName("displayVersion")
    @NotNull

    /* renamed from: b */
    private final String f54663b;
    @SerializedName("buildVersion")
    @NotNull

    /* renamed from: c */
    private final String f54664c;
    @SerializedName("firebaseConsoleUri")
    @NotNull

    /* renamed from: d */
    private final String f54665d;
    @SerializedName("testingUri")
    @NotNull

    /* renamed from: e */
    private final String f54666e;
    @SerializedName("binaryDownloadUri")
    @NotNull

    /* renamed from: f */
    private final String f54667f;

    public Release(@NotNull String name, @NotNull String displayVersion, @NotNull String buildVersion, @NotNull String firebaseConsoleUri, @NotNull String testingUri, @NotNull String binaryDownloadUri) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayVersion, "displayVersion");
        Intrinsics.checkNotNullParameter(buildVersion, "buildVersion");
        Intrinsics.checkNotNullParameter(firebaseConsoleUri, "firebaseConsoleUri");
        Intrinsics.checkNotNullParameter(testingUri, "testingUri");
        Intrinsics.checkNotNullParameter(binaryDownloadUri, "binaryDownloadUri");
        this.f54662a = name;
        this.f54663b = displayVersion;
        this.f54664c = buildVersion;
        this.f54665d = firebaseConsoleUri;
        this.f54666e = testingUri;
        this.f54667f = binaryDownloadUri;
    }

    public static /* synthetic */ Release copy$default(Release release, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = release.f54662a;
        }
        if ((i & 2) != 0) {
            str2 = release.f54663b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = release.f54664c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = release.f54665d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = release.f54666e;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = release.f54667f;
        }
        return release.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.f54662a;
    }

    @NotNull
    public final String component2() {
        return this.f54663b;
    }

    @NotNull
    public final String component3() {
        return this.f54664c;
    }

    @NotNull
    public final String component4() {
        return this.f54665d;
    }

    @NotNull
    public final String component5() {
        return this.f54666e;
    }

    @NotNull
    public final String component6() {
        return this.f54667f;
    }

    @NotNull
    public final Release copy(@NotNull String name, @NotNull String displayVersion, @NotNull String buildVersion, @NotNull String firebaseConsoleUri, @NotNull String testingUri, @NotNull String binaryDownloadUri) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayVersion, "displayVersion");
        Intrinsics.checkNotNullParameter(buildVersion, "buildVersion");
        Intrinsics.checkNotNullParameter(firebaseConsoleUri, "firebaseConsoleUri");
        Intrinsics.checkNotNullParameter(testingUri, "testingUri");
        Intrinsics.checkNotNullParameter(binaryDownloadUri, "binaryDownloadUri");
        return new Release(name, displayVersion, buildVersion, firebaseConsoleUri, testingUri, binaryDownloadUri);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Release) {
            Release release = (Release) obj;
            return Intrinsics.areEqual(this.f54662a, release.f54662a) && Intrinsics.areEqual(this.f54663b, release.f54663b) && Intrinsics.areEqual(this.f54664c, release.f54664c) && Intrinsics.areEqual(this.f54665d, release.f54665d) && Intrinsics.areEqual(this.f54666e, release.f54666e) && Intrinsics.areEqual(this.f54667f, release.f54667f);
        }
        return false;
    }

    @NotNull
    public final String getBinaryDownloadUri() {
        return this.f54667f;
    }

    @NotNull
    public final String getBuildVersion() {
        return this.f54664c;
    }

    @NotNull
    public final String getDisplayVersion() {
        return this.f54663b;
    }

    @NotNull
    public final String getFirebaseConsoleUri() {
        return this.f54665d;
    }

    @NotNull
    public final String getName() {
        return this.f54662a;
    }

    @NotNull
    public final String getTestingUri() {
        return this.f54666e;
    }

    public int hashCode() {
        return (((((((((this.f54662a.hashCode() * 31) + this.f54663b.hashCode()) * 31) + this.f54664c.hashCode()) * 31) + this.f54665d.hashCode()) * 31) + this.f54666e.hashCode()) * 31) + this.f54667f.hashCode();
    }

    @NotNull
    public String toString() {
        return "Release(name=" + this.f54662a + ", displayVersion=" + this.f54663b + ", buildVersion=" + this.f54664c + ", firebaseConsoleUri=" + this.f54665d + ", testingUri=" + this.f54666e + ", binaryDownloadUri=" + this.f54667f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}