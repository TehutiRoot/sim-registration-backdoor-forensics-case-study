package com.google.firebase.appdistribution.gradle;

import com.google.api.client.http.HttpResponseException;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.models.AabInfo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0001$B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/FirebaseAppDistributionUpload;", "", "Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;", "options", "Lcom/google/firebase/appdistribution/gradle/ApiService;", "apiService", "Lcom/google/firebase/appdistribution/gradle/UploadService;", "uploadService", "Lcom/google/firebase/appdistribution/gradle/ReleaseLookup;", "releaseLookup", "Lcom/google/firebase/appdistribution/gradle/TestLookup;", "testLookup", "<init>", "(Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;Lcom/google/firebase/appdistribution/gradle/ApiService;Lcom/google/firebase/appdistribution/gradle/UploadService;Lcom/google/firebase/appdistribution/gradle/ReleaseLookup;Lcom/google/firebase/appdistribution/gradle/TestLookup;)V", "", "uploadDistribution", "()Z", "", "appName", "Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", "aabInfo", "", OperatorName.CURVE_TO, "(Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/models/AabInfo;)V", RemoteConfigConstants.RequestFieldKey.APP_ID, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;", "Lcom/google/firebase/appdistribution/gradle/ApiService;", "Lcom/google/firebase/appdistribution/gradle/UploadService;", "d", "Lcom/google/firebase/appdistribution/gradle/ReleaseLookup;", "e", "Lcom/google/firebase/appdistribution/gradle/TestLookup;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFirebaseAppDistributionUpload.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseAppDistributionUpload.kt\ncom/google/firebase/appdistribution/gradle/FirebaseAppDistributionUpload\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,211:1\n1#2:212\n1#2:223\n1611#3,9:213\n1863#3:222\n1864#3:224\n1620#3:225\n739#3,9:226\n37#4,2:235\n*S KotlinDebug\n*F\n+ 1 FirebaseAppDistributionUpload.kt\ncom/google/firebase/appdistribution/gradle/FirebaseAppDistributionUpload\n*L\n118#1:223\n118#1:213,9\n118#1:222\n118#1:224\n118#1:225\n203#1:226,9\n203#1:235,2\n*E\n"})
/* loaded from: classes4.dex */
public final class FirebaseAppDistributionUpload {
    @NotNull
    public static final Companion Companion;

    /* renamed from: f */
    public static final Logger f54574f;

    /* renamed from: a */
    public final UploadDistributionOptions f54575a;

    /* renamed from: b */
    public final ApiService f54576b;

    /* renamed from: c */
    public final UploadService f54577c;

    /* renamed from: d */
    public final ReleaseLookup f54578d;

    /* renamed from: e */
    public final TestLookup f54579e;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/FirebaseAppDistributionUpload$Companion;", "", "()V", "logger", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        f54574f = Logging.getLogger(companion.getClass());
    }

    public FirebaseAppDistributionUpload(@NotNull UploadDistributionOptions options, @NotNull ApiService apiService, @NotNull UploadService uploadService, @NotNull ReleaseLookup releaseLookup, @NotNull TestLookup testLookup) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(uploadService, "uploadService");
        Intrinsics.checkNotNullParameter(releaseLookup, "releaseLookup");
        Intrinsics.checkNotNullParameter(testLookup, "testLookup");
        this.f54575a = options;
        this.f54576b = apiService;
        this.f54577c = uploadService;
        this.f54578d = releaseLookup;
        this.f54579e = testLookup;
    }

    /* renamed from: a */
    public final AabInfo m39261a(String str) {
        try {
            return this.f54576b.getAabInfo(str);
        } catch (HttpResponseException e) {
            if (e.getStatusCode() == 404) {
                throw new AppDistributionException(AppDistributionException.Reason.APP_NOT_ONBOARDED_ERROR, null, null, 6, null);
            }
            throw AppDistributionException.Companion.fromHttpResponseException(AppDistributionException.Reason.GET_APP_ERROR, e);
        } catch (IOException e2) {
            throw AppDistributionException.Companion.fromIoException(AppDistributionException.Reason.GET_APP_ERROR, e2);
        }
    }

    /* renamed from: b */
    public final String m39260b(String str) {
        List emptyList;
        List<String> split = new Regex(":").split(str, 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        String str2 = ((String[]) emptyList.toArray(new String[0]))[1];
        return "projects/" + str2 + "/apps/" + str;
    }

    /* renamed from: c */
    public final void m39259c(String str, AabInfo aabInfo) {
        if (this.f54575a.getBinaryType() == BinaryType.AAB && aabInfo.getAabCertificate() == null) {
            AabInfo m39261a = m39261a(str);
            if (m39261a.getAabCertificate() != null) {
                Logger logger = f54574f;
                logger.quiet("After you upload an AAB for the first time, App Distribution generates a new test \ncertificate. All AAB uploads are re-signed with this test certificate. Use the \ncertificate fingerprints below to register your app signing key with API providers, such \nas Google Sign-In and Google Maps.");
                logger.quiet("MD5 certificate fingerprint: {}", new Object[]{m39261a.getAabCertificate().getCertificateHashMd5()});
                logger.quiet("SHA-1 certificate fingerprint: {}", new Object[]{m39261a.getAabCertificate().getCertificateHashSha1()});
                logger.quiet("SHA-256 certificate fingerprint: {}", new Object[]{m39261a.getAabCertificate().getCertificateHashSha256()});
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean uploadDistribution() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.FirebaseAppDistributionUpload.uploadDistribution():boolean");
    }

    public /* synthetic */ FirebaseAppDistributionUpload(UploadDistributionOptions uploadDistributionOptions, ApiService apiService, UploadService uploadService, ReleaseLookup releaseLookup, TestLookup testLookup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uploadDistributionOptions, apiService, uploadService, (i & 8) != 0 ? new ReleaseLookup(apiService, null, 0, 6, null) : releaseLookup, (i & 16) != 0 ? new TestLookup(null, 1, null) : testLookup);
    }
}
