package com.google.firebase.appdistribution.gradle.models;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.firebase.appdistribution.gradle.ApiEndpoints;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/ServiceAccountCredentials;", "", "Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", "googleCredential", "<init>", "(Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", "getGoogleCredential", "()Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ServiceAccountCredentials {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final GoogleCredential f54643a;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/ServiceAccountCredentials$Companion;", "", "()V", "fromFile", "Lcom/google/firebase/appdistribution/gradle/models/ServiceAccountCredentials;", "credentials", "Ljava/io/File;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServiceAccountCredentials fromFile(@NotNull File credentials) {
            Path path;
            InputStream newInputStream;
            Intrinsics.checkNotNullParameter(credentials, "credentials");
            path = credentials.toPath();
            newInputStream = Files.newInputStream(path, new OpenOption[0]);
            GoogleCredential createScoped = GoogleCredential.fromStream(newInputStream).createScoped(ApiEndpoints.getSCOPES());
            Intrinsics.checkNotNullExpressionValue(createScoped, "fromStream(Files.newInpu…oped(ApiEndpoints.SCOPES)");
            return new ServiceAccountCredentials(createScoped, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ ServiceAccountCredentials(GoogleCredential googleCredential, DefaultConstructorMarker defaultConstructorMarker) {
        this(googleCredential);
    }

    @NotNull
    public final GoogleCredential getGoogleCredential() {
        return this.f54643a;
    }

    public ServiceAccountCredentials(GoogleCredential googleCredential) {
        this.f54643a = googleCredential;
    }
}
