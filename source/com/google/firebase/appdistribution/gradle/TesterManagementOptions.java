package com.google.firebase.appdistribution.gradle;

import com.google.api.client.auth.oauth2.Credential;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/TesterManagementOptions;", "", "", "projectNumber", "", "emailsValue", "emailsFile", "serviceCredentialsFile", "Lcom/google/firebase/appdistribution/gradle/CredentialsRetriever;", "credentialsRetriever", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/CredentialsRetriever;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getProjectNumber", "()J", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getEmails", "()Ljava/util/List;", "emails", "Lcom/google/api/client/auth/oauth2/Credential;", OperatorName.CURVE_TO, "Lcom/google/api/client/auth/oauth2/Credential;", "getCredential", "()Lcom/google/api/client/auth/oauth2/Credential;", "credential", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TesterManagementOptions {

    /* renamed from: a */
    public final long f54588a;

    /* renamed from: b */
    public final List f54589b;

    /* renamed from: c */
    public final Credential f54590c;

    public TesterManagementOptions(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull CredentialsRetriever credentialsRetriever) {
        Intrinsics.checkNotNullParameter(credentialsRetriever, "credentialsRetriever");
        this.f54588a = j;
        List<String> splitCommaOrNewlineSeparatedString = OptionsUtils.splitCommaOrNewlineSeparatedString(OptionsUtils.getValueFromStringOrFile(str, str2));
        this.f54589b = splitCommaOrNewlineSeparatedString;
        this.f54590c = credentialsRetriever.getAuthCredential(str3);
        if (j > 0) {
            if (splitCommaOrNewlineSeparatedString.isEmpty()) {
                throw new AppDistributionException(AppDistributionException.Reason.MISSING_TESTER_EMAILS, null, null, 6, null);
            }
            return;
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_PROJECT_NUMBER, null, null, 6, null);
    }

    @Nullable
    public final Credential getCredential() {
        return this.f54590c;
    }

    @NotNull
    public final List<String> getEmails() {
        return this.f54589b;
    }

    public final long getProjectNumber() {
        return this.f54588a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TesterManagementOptions(long r10, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.google.firebase.appdistribution.gradle.CredentialsRetriever r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r1
            goto L8
        L7:
            r5 = r12
        L8:
            r0 = r16 & 4
            if (r0 == 0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r13
        Lf:
            r0 = r16 & 8
            if (r0 == 0) goto L15
            r7 = r1
            goto L16
        L15:
            r7 = r14
        L16:
            r0 = r16 & 16
            if (r0 == 0) goto L2f
            com.google.firebase.appdistribution.gradle.CredentialsRetriever r0 = new com.google.firebase.appdistribution.gradle.CredentialsRetriever
            com.google.api.client.http.javanet.NetHttpTransport r1 = com.google.api.client.googleapis.javanet.GoogleNetHttpTransport.newTrustedTransport()
            java.lang.String r2 = "newTrustedTransport()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.appdistribution.gradle.AppDistributionEnvironmentImpl r2 = new com.google.firebase.appdistribution.gradle.AppDistributionEnvironmentImpl
            r2.<init>()
            r0.<init>(r1, r2)
            r8 = r0
            goto L30
        L2f:
            r8 = r15
        L30:
            r2 = r9
            r3 = r10
            r2.<init>(r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.TesterManagementOptions.<init>(long, java.lang.String, java.lang.String, java.lang.String, com.google.firebase.appdistribution.gradle.CredentialsRetriever, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
