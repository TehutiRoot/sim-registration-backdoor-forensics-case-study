package com.google.firebase.appdistribution.gradle;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.models.ServiceAccountCredentials;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/CredentialsRetriever;", "", "Lcom/google/api/client/http/HttpTransport;", "httpTransport", "Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;", "appDistributionEnvironment", "<init>", "(Lcom/google/api/client/http/HttpTransport;Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;)V", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;)V", "", "serviceCredentialsPath", "Lcom/google/api/client/auth/oauth2/Credential;", "getAuthCredential", "(Ljava/lang/String;)Lcom/google/api/client/auth/oauth2/Credential;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/api/client/http/HttpTransport;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class CredentialsRetriever {
    @NotNull
    public static final Companion Companion;

    /* renamed from: c */
    public static final Logger f54571c;

    /* renamed from: a */
    public final HttpTransport f54572a;

    /* renamed from: b */
    public final AppDistributionEnvironment f54573b;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/CredentialsRetriever$Companion;", "", "()V", "logger", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        f54571c = Logging.getLogger(companion.getClass());
    }

    public CredentialsRetriever() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Credential getAuthCredential$default(CredentialsRetriever credentialsRetriever, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return credentialsRetriever.getAuthCredential(str);
    }

    @Nullable
    public final Credential getAuthCredential(@Nullable String str) {
        if (str != null) {
            try {
                return ServiceAccountCredentials.Companion.fromFile(OptionsUtils.ensureFileExists(str, AppDistributionException.Reason.SERVICE_CREDENTIALS_NOT_FOUND)).getGoogleCredential();
            } catch (IOException e) {
                throw new AppDistributionException(AppDistributionException.Reason.SERVICE_CREDENTIALS_NOT_FOUND, e, null, 4, null);
            }
        }
        String str2 = System.getenv("FIREBASE_TOKEN");
        if (str2 != null) {
            try {
                f54571c.info("Using credentials token specified by environment variable {}", "FIREBASE_TOKEN");
                return new RefreshToken(str2, this.f54572a).generateNewCredentials();
            } catch (Exception unused) {
                throw new AppDistributionException(AppDistributionException.Reason.REFRESH_TOKEN_ERROR, null, "The refresh token set as the environment variable FIREBASE_TOKEN is not valid", 2, null);
            }
        }
        GoogleCredential firebaseCliLoginCredentials = this.f54573b.getFirebaseCliLoginCredentials(this.f54572a);
        if (firebaseCliLoginCredentials != null) {
            f54571c.info("Using cached Firebase CLI credentials");
            return firebaseCliLoginCredentials;
        }
        String str3 = System.getenv("GOOGLE_APPLICATION_CREDENTIALS");
        if (str3 != null) {
            f54571c.info("Using credentials file specified by environment variable {}: {}", "GOOGLE_APPLICATION_CREDENTIALS", str3);
            try {
                return ServiceAccountCredentials.Companion.fromFile(OptionsUtils.ensureFileExists(str3, AppDistributionException.Reason.SERVICE_CREDENTIALS_NOT_FOUND)).getGoogleCredential();
            } catch (IOException e2) {
                throw new AppDistributionException(AppDistributionException.Reason.SERVICE_CREDENTIALS_NOT_FOUND, e2, null, 4, null);
            }
        }
        return null;
    }

    public CredentialsRetriever(@NotNull HttpTransport httpTransport, @NotNull AppDistributionEnvironment appDistributionEnvironment) {
        Intrinsics.checkNotNullParameter(httpTransport, "httpTransport");
        Intrinsics.checkNotNullParameter(appDistributionEnvironment, "appDistributionEnvironment");
        this.f54572a = httpTransport;
        this.f54573b = appDistributionEnvironment;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CredentialsRetriever(com.google.api.client.http.HttpTransport r1, com.google.firebase.appdistribution.gradle.AppDistributionEnvironment r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto Ld
            com.google.api.client.http.javanet.NetHttpTransport r1 = com.google.api.client.googleapis.javanet.GoogleNetHttpTransport.newTrustedTransport()
            java.lang.String r4 = "newTrustedTransport()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
        Ld:
            r3 = r3 & 2
            if (r3 == 0) goto L16
            com.google.firebase.appdistribution.gradle.AppDistributionEnvironmentImpl r2 = new com.google.firebase.appdistribution.gradle.AppDistributionEnvironmentImpl
            r2.<init>()
        L16:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.CredentialsRetriever.<init>(com.google.api.client.http.HttpTransport, com.google.firebase.appdistribution.gradle.AppDistributionEnvironment, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CredentialsRetriever(@org.jetbrains.annotations.NotNull com.google.firebase.appdistribution.gradle.AppDistributionEnvironment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "appDistributionEnvironment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.google.api.client.http.javanet.NetHttpTransport r0 = com.google.api.client.googleapis.javanet.GoogleNetHttpTransport.newTrustedTransport()
            java.lang.String r1 = "newTrustedTransport()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.CredentialsRetriever.<init>(com.google.firebase.appdistribution.gradle.AppDistributionEnvironment):void");
    }
}
