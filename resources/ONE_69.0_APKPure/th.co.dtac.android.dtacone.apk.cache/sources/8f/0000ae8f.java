package com.google.firebase.appdistribution.gradle;

import com.google.api.client.http.GenericUrl;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\bR\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/ApiEndpoints;", "", "<init>", "()V", "", "appName", "Lcom/google/api/client/http/GenericUrl;", "getScottyUploadEndpoint", "(Ljava/lang/String;)Lcom/google/api/client/http/GenericUrl;", "releaseName", "getDistributeReleaseEndpoint", "getCreateReleaseNotesEndpoint", "operationName", "getUploadStatusEndpoint", "getAabInfo", "", "projectNumber", "getBatchAddTestersEndpoint", "(J)Lcom/google/api/client/http/GenericUrl;", "getBatchRemoveTestersEndpoint", "getCreateReleaseTestEndpoint", "releaseTestName", "getReleaseTestEndpoint", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "API_URL", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getSCOPES", "()Ljava/util/List;", "getSCOPES$annotations", "SCOPES", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApiEndpoints {
    @NotNull
    public static final ApiEndpoints INSTANCE = new ApiEndpoints();

    /* renamed from: a */
    public static final String f54575a = System.getProperty("FIREBASE_APP_DISTRIBUTION_API_URL", "https://firebaseappdistribution.googleapis.com");

    /* renamed from: b */
    public static final List f54576b = AbstractC10100ds.listOf("https://www.googleapis.com/auth/cloud-platform");

    @NotNull
    public static final List<String> getSCOPES() {
        return f54576b;
    }

    @JvmStatic
    public static /* synthetic */ void getSCOPES$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final GenericUrl getScottyUploadEndpoint(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new GenericUrl(f54575a + "/upload/v1/" + appName + "/releases:upload");
    }

    @NotNull
    public final GenericUrl getAabInfo(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new GenericUrl(f54575a + "/v1/" + appName + "/aabInfo");
    }

    @NotNull
    public final GenericUrl getBatchAddTestersEndpoint(long j) {
        return new GenericUrl(f54575a + "/v1/projects/" + j + "/testers:batchAdd");
    }

    @NotNull
    public final GenericUrl getBatchRemoveTestersEndpoint(long j) {
        return new GenericUrl(f54575a + "/v1/projects/" + j + "/testers:batchRemove");
    }

    @NotNull
    public final GenericUrl getCreateReleaseNotesEndpoint(@NotNull String releaseName) {
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        return new GenericUrl(f54575a + "/v1/" + releaseName + "?updateMask=release_notes.text");
    }

    @NotNull
    public final GenericUrl getCreateReleaseTestEndpoint(@NotNull String releaseName) {
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        return new GenericUrl(f54575a + "/v1alpha/" + releaseName + "/tests");
    }

    @NotNull
    public final GenericUrl getDistributeReleaseEndpoint(@NotNull String releaseName) {
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        return new GenericUrl(f54575a + "/v1/" + releaseName + ":distribute");
    }

    @NotNull
    public final GenericUrl getReleaseTestEndpoint(@NotNull String releaseTestName) {
        Intrinsics.checkNotNullParameter(releaseTestName, "releaseTestName");
        return new GenericUrl(f54575a + "/v1alpha/" + releaseTestName);
    }

    @NotNull
    public final GenericUrl getUploadStatusEndpoint(@NotNull String operationName) {
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        return new GenericUrl(f54575a + "/v1/" + operationName);
    }
}