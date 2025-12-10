package com.google.firebase.appdistribution.gradle;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.HttpTransport;
import com.google.common.base.Splitter;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.models.LoginCredential;
import com.google.firebase.appdistribution.gradle.models.LoginCredentialFieldHints;
import com.google.firebase.appdistribution.gradle.models.TestDevice;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001aB\u0081\u0002\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J)\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\b\u0010%\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\b\u0012\u0004\u0012\u00020,0'2\b\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b-\u0010)JC\u00104\u001a\u0004\u0018\u0001032\b\u0010.\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00022\b\u00100\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b4\u00105J%\u00106\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00022\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010B\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010D\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\bC\u0010:R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006¢\u0006\f\n\u0004\b!\u0010E\u001a\u0004\bF\u0010GR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006¢\u0006\f\n\u0004\b\u001f\u0010E\u001a\u0004\bI\u0010GR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020,0'8\u0006¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010GR\u0019\u0010R\u001a\u0004\u0018\u00010M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006¢\u0006\f\n\u0004\bS\u0010E\u001a\u0004\bT\u0010GR\u0019\u0010Z\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006b"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "debug", "testNonBlocking", "binaryPath", "Lcom/google/api/client/http/HttpTransport;", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;", "appDistributionEnvironment", "serviceCredentialsFile", "releaseNotesValue", "releaseNotesPath", "testersValue", "testersPath", "groupsValue", "groupsPath", "testDevicesValue", "testDevicesPath", "testUsername", "testPassword", "testPasswordPath", "testUsernameResource", "testPasswordResource", "testCasesValue", "testCasesPath", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/google/api/client/http/HttpTransport;Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", OperatorName.NON_STROKING_GRAY, "()V", OperatorName.FILL_NON_ZERO, "Ljava/io/File;", "e", "(Ljava/lang/String;)Ljava/io/File;", "value", "valuePath", "", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "testDevices", "testDevicesFile", "Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", OperatorName.CURVE_TO, HintConstants.AUTOFILL_HINT_USERNAME, "passwordValue", "passwordPath", "usernameResource", "passwordResource", "Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "Z", "getDebug", "()Z", "getTestNonBlocking", "Ljava/io/File;", "getBinary", "()Ljava/io/File;", "binary", "getReleaseNotes", "releaseNotes", "Ljava/util/List;", "getTesters", "()Ljava/util/List;", "testers", "getGroups", "groups", OperatorName.CLOSE_PATH, "getTestDevices", "Lcom/google/api/client/auth/oauth2/Credential;", "i", "Lcom/google/api/client/auth/oauth2/Credential;", "getCredential", "()Lcom/google/api/client/auth/oauth2/Credential;", "credential", OperatorName.SET_LINE_JOINSTYLE, "getTestCases", "testCases", OperatorName.NON_STROKING_CMYK, "Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "getTestLoginCredential", "()Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "testLoginCredential", "Lcom/google/firebase/appdistribution/gradle/BinaryType;", OperatorName.LINE_TO, "Lcom/google/firebase/appdistribution/gradle/BinaryType;", "getBinaryType", "()Lcom/google/firebase/appdistribution/gradle/BinaryType;", "binaryType", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadDistributionOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadDistributionOptions.kt\ncom/google/firebase/appdistribution/gradle/UploadDistributionOptions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1557#2:188\n1628#2,3:189\n*S KotlinDebug\n*F\n+ 1 UploadDistributionOptions.kt\ncom/google/firebase/appdistribution/gradle/UploadDistributionOptions\n*L\n119#1:188\n119#1:189,3\n*E\n"})
/* loaded from: classes4.dex */
public final class UploadDistributionOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: m */
    public static final Pattern f54591m = Pattern.compile("(?<version>\\d+):(?<projectNumber>\\d+):(?<platform>ios|android|web):(\\p{XDigit}+)");

    /* renamed from: a */
    public final String f54592a;

    /* renamed from: b */
    public final boolean f54593b;

    /* renamed from: c */
    public final boolean f54594c;

    /* renamed from: d */
    public final File f54595d;

    /* renamed from: e */
    public final String f54596e;

    /* renamed from: f */
    public final List f54597f;

    /* renamed from: g */
    public final List f54598g;

    /* renamed from: h */
    public final List f54599h;

    /* renamed from: i */
    public final Credential f54600i;

    /* renamed from: j */
    public final List f54601j;

    /* renamed from: k */
    public final LoginCredential f54602k;

    /* renamed from: l */
    public final BinaryType f54603l;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/UploadDistributionOptions$Companion;", "", "<init>", "()V", "", "value1", "value2", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Ljava/lang/String;)Z", OperatorName.CLOSE_AND_STROKE, "Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "APP_ID_PATTERN", "Ljava/util/regex/Pattern;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m39247a(String str, String str2) {
            return (str == null) ^ (str2 == null);
        }

        /* renamed from: b */
        public final TestDevice m39246b(String str) {
            Map<String, String> split = Splitter.m41291on(',').omitEmptyStrings().trimResults().withKeyValueSeparator('=').split(str);
            String str2 = split.get("orientation");
            return new TestDevice(split.get("locale"), split.get("model"), str2, split.get(ClientCookie.VERSION_ATTR));
        }

        public Companion() {
        }
    }

    public UploadDistributionOptions(@NotNull String appId, boolean z, boolean z2, @NotNull String binaryPath, @NotNull HttpTransport transport, @NotNull AppDistributionEnvironment appDistributionEnvironment, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(binaryPath, "binaryPath");
        Intrinsics.checkNotNullParameter(transport, "transport");
        Intrinsics.checkNotNullParameter(appDistributionEnvironment, "appDistributionEnvironment");
        this.f54592a = appId;
        this.f54593b = z;
        this.f54594c = z2;
        File m39250e = m39250e(binaryPath);
        this.f54595d = m39250e;
        this.f54596e = OptionsUtils.getValueFromStringOrFile(str2, str3);
        this.f54597f = m39251d(str4, str5);
        this.f54598g = m39251d(str6, str7);
        this.f54599h = m39252c(str8, str9);
        this.f54600i = new CredentialsRetriever(transport, appDistributionEnvironment).getAuthCredential(str);
        this.f54601j = m39251d(str15, str16);
        this.f54602k = m39254a(str10, str11, str12, str13, str14);
        BinaryType fromPath = BinaryType.fromPath(m39250e.getName());
        Intrinsics.checkNotNullExpressionValue(fromPath, "fromPath(binary.name)");
        this.f54603l = fromPath;
        m39249f();
        m39248g();
    }

    /* renamed from: a */
    public final LoginCredential m39254a(String str, String str2, String str3, String str4, String str5) {
        String m39253b = m39253b(str2, str3);
        LoginCredentialFieldHints loginCredentialFieldHints = null;
        if (str == null && m39253b == null && str4 == null && str5 == null) {
            return null;
        }
        Companion companion = Companion;
        if (!companion.m39247a(str, m39253b)) {
            if (!companion.m39247a(str4, str5)) {
                if (str4 != null && str5 != null && str == null && m39253b == null) {
                    throw new AppDistributionException(AppDistributionException.Reason.TEST_LOGIN_CREDENTIAL_MISSING, null, null, 6, null);
                }
                if (str4 != null || str5 != null) {
                    loginCredentialFieldHints = new LoginCredentialFieldHints(str5, str4);
                }
                return new LoginCredential(loginCredentialFieldHints, null, m39253b, str, 2, null);
            }
            throw new AppDistributionException(AppDistributionException.Reason.TEST_LOGIN_CREDENTIAL_RESOURCE_MISMATCH, null, null, 6, null);
        }
        throw new AppDistributionException(AppDistributionException.Reason.TEST_LOGIN_CREDENTIAL_MISMATCH, null, null, 6, null);
    }

    /* renamed from: b */
    public final String m39253b(String str, String str2) {
        String valueFromStringOrFile = OptionsUtils.getValueFromStringOrFile(str, str2);
        if (valueFromStringOrFile != null) {
            return StringsKt__StringsKt.trim(valueFromStringOrFile).toString();
        }
        return null;
    }

    /* renamed from: c */
    public final List m39252c(String str, String str2) {
        List<String> splitSemicolonOrNewlineSeparatedString = OptionsUtils.INSTANCE.splitSemicolonOrNewlineSeparatedString(OptionsUtils.getValueFromStringOrFile(str, str2));
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(splitSemicolonOrNewlineSeparatedString, 10));
        for (String str3 : splitSemicolonOrNewlineSeparatedString) {
            arrayList.add(Companion.m39246b(str3));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List m39251d(String str, String str2) {
        return OptionsUtils.splitCommaOrNewlineSeparatedString(OptionsUtils.getValueFromStringOrFile(str, str2));
    }

    /* renamed from: e */
    public final File m39250e(String str) {
        AppDistributionException.Reason.Companion companion = AppDistributionException.Reason.Companion;
        BinaryType fromPath = BinaryType.fromPath(str);
        Intrinsics.checkNotNullExpressionValue(fromPath, "fromPath(binaryPath)");
        return OptionsUtils.ensureFileExists(str, companion.binaryNotFoundError(fromPath));
    }

    /* renamed from: f */
    public final void m39249f() {
        if (this.f54592a.length() != 0) {
            if (f54591m.matcher(this.f54592a).matches()) {
                return;
            }
            throw new AppDistributionException(AppDistributionException.Reason.INVALID_APP_ID, null, null, 6, null);
        }
        throw new AppDistributionException(AppDistributionException.Reason.MISSING_APP_ID, null, null, 6, null);
    }

    /* renamed from: g */
    public final void m39248g() {
        LoginCredentialFieldHints loginCredentialFieldHints;
        if (!this.f54601j.isEmpty()) {
            LoginCredential loginCredential = this.f54602k;
            if (loginCredential != null) {
                loginCredentialFieldHints = loginCredential.getFieldHints();
            } else {
                loginCredentialFieldHints = null;
            }
            if (loginCredentialFieldHints != null) {
                throw new AppDistributionException(AppDistributionException.Reason.TEST_CASE_WITH_LOGIN_RESOURCES, null, null, 6, null);
            }
        }
    }

    @NotNull
    public final String getAppId() {
        return this.f54592a;
    }

    @NotNull
    public final File getBinary() {
        return this.f54595d;
    }

    @NotNull
    public final BinaryType getBinaryType() {
        return this.f54603l;
    }

    @Nullable
    public final Credential getCredential() {
        return this.f54600i;
    }

    public final boolean getDebug() {
        return this.f54593b;
    }

    @NotNull
    public final List<String> getGroups() {
        return this.f54598g;
    }

    @Nullable
    public final String getReleaseNotes() {
        return this.f54596e;
    }

    @NotNull
    public final List<String> getTestCases() {
        return this.f54601j;
    }

    @NotNull
    public final List<TestDevice> getTestDevices() {
        return this.f54599h;
    }

    @Nullable
    public final LoginCredential getTestLoginCredential() {
        return this.f54602k;
    }

    public final boolean getTestNonBlocking() {
        return this.f54594c;
    }

    @NotNull
    public final List<String> getTesters() {
        return this.f54597f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ UploadDistributionOptions(java.lang.String r27, boolean r28, boolean r29, java.lang.String r30, com.google.api.client.http.HttpTransport r31, com.google.firebase.appdistribution.gradle.AppDistributionEnvironment r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.appdistribution.gradle.UploadDistributionOptions.<init>(java.lang.String, boolean, boolean, java.lang.String, com.google.api.client.http.HttpTransport, com.google.firebase.appdistribution.gradle.AppDistributionEnvironment, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
