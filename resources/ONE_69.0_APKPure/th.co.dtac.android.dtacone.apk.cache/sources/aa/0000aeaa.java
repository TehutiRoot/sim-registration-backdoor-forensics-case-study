package com.google.firebase.appdistribution.gradle;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpResponseException;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/FirebaseAppDistribution;", "", "<init>", "()V", "Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;", "options", "", "uploadDistribution", "(Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;)V", "Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;", "addTesters", "(Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;)V", "removeTesters", "Lcom/google/api/client/auth/oauth2/Credential;", OperatorName.CURVE_TO, "(Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;)Lcom/google/api/client/auth/oauth2/Credential;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;)Lcom/google/api/client/auth/oauth2/Credential;", "credential", "Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/google/api/client/auth/oauth2/Credential;)Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FirebaseAppDistribution {
    @NotNull
    public static final FirebaseAppDistribution INSTANCE = new FirebaseAppDistribution();

    @JvmStatic
    public static final void addTesters(@NotNull TesterManagementOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        FirebaseAppDistribution firebaseAppDistribution = INSTANCE;
        try {
            new ApiService(firebaseAppDistribution.m39256a(firebaseAppDistribution.m39255b(options))).batchAddTesters(options.getProjectNumber(), options.getEmails());
        } catch (HttpResponseException e) {
            throw AppDistributionException.Companion.fromHttpResponseException(AppDistributionException.Reason.ADD_TESTERS_ERROR, e);
        } catch (IOException e2) {
            throw AppDistributionException.Companion.fromIoException(AppDistributionException.Reason.ADD_TESTERS_ERROR, e2);
        }
    }

    @JvmStatic
    public static final void removeTesters(@NotNull TesterManagementOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        FirebaseAppDistribution firebaseAppDistribution = INSTANCE;
        try {
            new ApiService(firebaseAppDistribution.m39256a(firebaseAppDistribution.m39255b(options))).batchRemoveTesters(options.getProjectNumber(), options.getEmails());
        } catch (HttpResponseException e) {
            throw AppDistributionException.Companion.fromHttpResponseException(AppDistributionException.Reason.REMOVE_TESTERS_ERROR, e);
        } catch (IOException e2) {
            throw AppDistributionException.Companion.fromIoException(AppDistributionException.Reason.REMOVE_TESTERS_ERROR, e2);
        }
    }

    @JvmStatic
    public static final void uploadDistribution(@NotNull UploadDistributionOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        FirebaseAppDistribution firebaseAppDistribution = INSTANCE;
        AuthenticatedHttpClient m39256a = firebaseAppDistribution.m39256a(firebaseAppDistribution.m39254c(options));
        new FirebaseAppDistributionUpload(options, new ApiService(m39256a), new UploadService(m39256a), null, null, 24, null).uploadDistribution();
    }

    /* renamed from: a */
    public final AuthenticatedHttpClient m39256a(Credential credential) {
        boolean z;
        try {
            return new AuthenticatedHttpClient(credential);
        } catch (Exception e) {
            if (e instanceof GeneralSecurityException) {
                z = true;
            } else {
                z = e instanceof IOException;
            }
            if (z) {
                throw new RuntimeException("There was a problem. Please try again.", e);
            }
            throw e;
        }
    }

    /* renamed from: b */
    public final Credential m39255b(TesterManagementOptions testerManagementOptions) {
        Credential credential = testerManagementOptions.getCredential();
        if (credential != null) {
            return credential;
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_CREDENTIALS, null, null, 6, null);
    }

    /* renamed from: c */
    public final Credential m39254c(UploadDistributionOptions uploadDistributionOptions) {
        Credential credential = uploadDistributionOptions.getCredential();
        if (credential != null) {
            return credential;
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_CREDENTIALS, null, null, 6, null);
    }
}