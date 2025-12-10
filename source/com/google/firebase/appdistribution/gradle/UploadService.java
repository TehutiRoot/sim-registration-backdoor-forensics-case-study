package com.google.firebase.appdistribution.gradle;

import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpResponse;
import com.google.firebase.appdistribution.gradle.models.UploadResponse;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/UploadService;", "", "Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "httpClient", "<init>", "(Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;)V", "", "appName", "Ljava/io/File;", "distributionFile", "uploadDistribution", "(Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class UploadService {
    @NotNull
    public static final Companion Companion;
    @NotNull
    public static final String RAW = "raw";
    @NotNull
    public static final String X_GOOG_UPLOAD_FILE_NAME = "X-Goog-Upload-File-Name";
    @NotNull
    public static final String X_GOOG_UPLOAD_PROTOCOL = "X-Goog-Upload-Protocol";

    /* renamed from: b */
    public static final Logger f54604b;

    /* renamed from: a */
    public final AuthenticatedHttpClient f54605a;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/UploadService$Companion;", "", "()V", "RAW", "", "X_GOOG_UPLOAD_FILE_NAME", "X_GOOG_UPLOAD_PROTOCOL", "logger", "Lorg/gradle/api/logging/Logger;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        Logger logger = Logging.getLogger(companion.getClass());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(this::class.java)");
        f54604b = logger;
    }

    public UploadService(@NotNull AuthenticatedHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f54605a = httpClient;
    }

    @Nullable
    public final String uploadDistribution(@NotNull String appName, @NotNull File distributionFile) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(distributionFile, "distributionFile");
        HttpResponse execute = AuthenticatedHttpClient.newPostRequest$default(this.f54605a, ApiEndpoints.getScottyUploadEndpoint(appName), null, 2, null).setContent(new FileContent("application/octet-stream", distributionFile)).setHeader(X_GOOG_UPLOAD_FILE_NAME, distributionFile.getName()).setHeader(X_GOOG_UPLOAD_PROTOCOL, RAW).execute();
        if (execute.isSuccessStatusCode()) {
            try {
                String name = ((UploadResponse) new Gson().fromJson(execute.parseAsString(), (Class<Object>) UploadResponse.class)).getName();
                f54604b.info("Uploaded {} successfully {}", BinaryType.fromPath(distributionFile.getPath()), Integer.valueOf(execute.getStatusCode()));
                return name;
            } catch (JsonSyntaxException e) {
                f54604b.info("Failed to parse upload response. Message: {}", e.getMessage());
                return null;
            }
        }
        f54604b.info("Unable to upload {}. Response code: {}", BinaryType.fromPath(distributionFile.getPath()), Integer.valueOf(execute.getStatusCode()));
        return null;
    }
}
