package com.google.firebase.appdistribution.gradle;

import androidx.core.view.PointerIconCompat;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.appdistribution.gradle.ApiService;
import com.google.firebase.appdistribution.gradle.AppDistributionException;
import com.google.firebase.appdistribution.gradle.models.AabInfo;
import com.google.firebase.appdistribution.gradle.models.DeviceExecution;
import com.google.firebase.appdistribution.gradle.models.LoginCredential;
import com.google.firebase.appdistribution.gradle.models.ReleaseTest;
import com.google.firebase.appdistribution.gradle.models.TestDevice;
import com.google.firebase.appdistribution.gradle.models.uploadstatus.UploadStatusResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.i18n.TextBundle;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0004\b+\u0010*J\u001d\u0010-\u001a\u00020,2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020,2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020,2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060(¢\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u0002092\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060(H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/ApiService;", "", "Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "httpClient", "<init>", "(Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;)V", "", "operationName", "Lcom/google/firebase/appdistribution/gradle/BinaryType;", "binaryType", "Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "getUploadStatus", "(Ljava/lang/String;Lcom/google/firebase/appdistribution/gradle/BinaryType;)Lcom/google/firebase/appdistribution/gradle/models/uploadstatus/UploadStatusResponse;", "releaseName", "releaseNotes", "", "createReleaseNotes", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "emails", "groupIds", "distributeRelease", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z", "Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "testDevices", "Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "testLoginCredential", "testCaseName", "Lcom/google/firebase/appdistribution/gradle/models/ReleaseTest;", "testRelease", "(Ljava/lang/String;Ljava/util/List;Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/ReleaseTest;", "releaseTestName", "getReleaseTest", "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/ReleaseTest;", "appName", "Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", "getAabInfo", "(Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/AabInfo;", "", "projectNumber", "", "batchAddTesters", "(JLjava/util/Collection;)Z", "batchRemoveTesters", "Lcom/google/gson/JsonObject;", "buildCreateReleaseNotesJson", "(Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonObject;", "buildDistributeReleaseJson", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/google/gson/JsonObject;", "buildTesterEmailsJson", "(Ljava/util/Collection;)Lcom/google/gson/JsonObject;", FirebaseAnalytics.Param.SUCCESS, "successMessage", "failureMessage", "e", "(ZLjava/lang/String;Ljava/lang/String;)Z", "entities", "Lcom/google/gson/JsonArray;", OperatorName.CURVE_TO, "(Ljava/util/Collection;)Lcom/google/gson/JsonArray;", "Lcom/google/gson/JsonElement;", "json", "Lcom/google/api/client/http/ByteArrayContent;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lcom/google/gson/JsonElement;)Lcom/google/api/client/http/ByteArrayContent;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/google/firebase/appdistribution/gradle/AuthenticatedHttpClient;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApiService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiService.kt\ncom/google/firebase/appdistribution/gradle/ApiService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1557#2:262\n1628#2,3:263\n*S KotlinDebug\n*F\n+ 1 ApiService.kt\ncom/google/firebase/appdistribution/gradle/ApiService\n*L\n103#1:262\n103#1:263,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ApiService {
    @NotNull
    public static final Companion Companion;

    /* renamed from: b */
    public static final Logger f54565b;

    /* renamed from: a */
    public final AuthenticatedHttpClient f54566a;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/ApiService$Companion;", "", "()V", "MAX_TESTER_EMAILS", "", "logger", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        f54565b = Logging.getLogger(companion.getClass());
    }

    public ApiService(@NotNull AuthenticatedHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f54566a = httpClient;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39277a(JsonArray jsonArray, String str) {
        m39274d(jsonArray, str);
    }

    /* renamed from: d */
    public static final void m39274d(JsonArray jsonArray, String string) {
        Intrinsics.checkNotNullParameter(jsonArray, "$jsonArray");
        Intrinsics.checkNotNullParameter(string, "string");
        jsonArray.add(string);
    }

    public static /* synthetic */ ReleaseTest testRelease$default(ApiService apiService, String str, List list, LoginCredential loginCredential, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return apiService.testRelease(str, list, loginCredential, str2);
    }

    /* renamed from: b */
    public final ByteArrayContent m39276b(JsonElement jsonElement) {
        String jsonElement2 = jsonElement.toString();
        Intrinsics.checkNotNullExpressionValue(jsonElement2, "json.toString()");
        byte[] bytes = jsonElement2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new ByteArrayContent("application/json", bytes);
    }

    public final boolean batchAddTesters(long j, @NotNull Collection<String> emails) {
        HttpResponse execute;
        Intrinsics.checkNotNullParameter(emails, "emails");
        if (emails.size() <= 1000) {
            f54565b.info("Adding {} testers to project {}...", Integer.valueOf(emails.size()), Long.valueOf(j));
            return m39273e(AuthenticatedHttpClient.newPostRequest$default(this.f54566a, ApiEndpoints.INSTANCE.getBatchAddTestersEndpoint(j), null, 2, null).setContent(m39276b(buildTesterEmailsJson(emails))).execute().isSuccessStatusCode(), "Testers added successfully [" + execute.getStatusCode() + AbstractJsonLexerKt.END_LIST, "Unable to add testers. Response code: " + execute.getStatusCode());
        }
        throw new AppDistributionException(AppDistributionException.Reason.TOO_MANY_TESTER_EMAILS, null, "Cannot add " + emails.size() + " testers, 1000 is the maximum allowed", 2, null);
    }

    public final boolean batchRemoveTesters(long j, @NotNull Collection<String> emails) {
        JsonArray asJsonArray;
        Intrinsics.checkNotNullParameter(emails, "emails");
        if (emails.size() <= 1000) {
            Logger logger = f54565b;
            logger.info("Removing {} testers from project {}...", Integer.valueOf(emails.size()), Long.valueOf(j));
            HttpResponse execute = AuthenticatedHttpClient.newPostRequest$default(this.f54566a, ApiEndpoints.INSTANCE.getBatchRemoveTestersEndpoint(j), null, 2, null).setContent(m39276b(buildTesterEmailsJson(emails))).execute();
            if (execute.isSuccessStatusCode()) {
                JsonElement jsonElement = JsonParser.parseString(execute.parseAsString()).getAsJsonObject().get("emails");
                if (jsonElement == null) {
                    asJsonArray = new JsonArray();
                } else {
                    asJsonArray = jsonElement.getAsJsonArray();
                }
                logger.info("{} testers removed successfully [{}]", Integer.valueOf(asJsonArray.size()), Integer.valueOf(execute.getStatusCode()));
                logger.debug("Testers removed: {}", asJsonArray);
                return true;
            }
            logger.warn("Unable to remove testers. Response code: {}", Integer.valueOf(execute.getStatusCode()));
            return false;
        }
        AppDistributionException.Reason reason = AppDistributionException.Reason.TOO_MANY_TESTER_EMAILS;
        throw new AppDistributionException(reason, null, "Cannot remove " + emails.size() + " testers, 1000 is the maximum allowed", 2, null);
    }

    @NotNull
    public final JsonObject buildCreateReleaseNotesJson(@NotNull String releaseName, @NotNull String releaseNotes) {
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(releaseNotes, "releaseNotes");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("name", new JsonPrimitive(releaseName));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add(TextBundle.TEXT_ENTRY, new JsonPrimitive(releaseNotes));
        jsonObject.add("releaseNotes", jsonObject2);
        return jsonObject;
    }

    @NotNull
    public final JsonObject buildDistributeReleaseJson(@NotNull String releaseName, @NotNull List<String> emails, @NotNull List<String> groupIds) {
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("name", new JsonPrimitive(releaseName));
        jsonObject.add("testerEmails", m39275c(emails));
        jsonObject.add("groupAliases", m39275c(groupIds));
        return jsonObject;
    }

    @NotNull
    public final JsonObject buildTesterEmailsJson(@NotNull Collection<String> emails) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("emails", m39275c(emails));
        return jsonObject;
    }

    /* renamed from: c */
    public final JsonArray m39275c(Collection collection) {
        final JsonArray jsonArray = new JsonArray();
        collection.forEach(new Consumer() { // from class: j5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ApiService.m39277a(jsonArray, (String) obj);
            }
        });
        return jsonArray;
    }

    public final boolean createReleaseNotes(@NotNull String releaseName, @NotNull String releaseNotes) {
        HttpResponse execute;
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(releaseNotes, "releaseNotes");
        String jsonElement = buildCreateReleaseNotesJson(releaseName, releaseNotes).toString();
        Intrinsics.checkNotNullExpressionValue(jsonElement, "jsonBody.toString()");
        byte[] bytes = jsonElement.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return m39273e(this.f54566a.newPatchRequest(ApiEndpoints.INSTANCE.getCreateReleaseNotesEndpoint(releaseName), new ByteArrayContent("application/json", bytes)).execute().isSuccessStatusCode(), "Added release notes successfully " + execute.getStatusCode(), "Unable to add release notes. Response code: " + execute.getStatusCode());
    }

    public final boolean distributeRelease(@NotNull String releaseName, @NotNull List<String> emails, @NotNull List<String> groupIds) {
        HttpResponse execute;
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        return m39273e(this.f54566a.newPostRequest(ApiEndpoints.INSTANCE.getDistributeReleaseEndpoint(releaseName), m39276b(buildDistributeReleaseJson(releaseName, emails, groupIds))).execute().isSuccessStatusCode(), "Added testers/groups successfully " + execute.getStatusCode(), "Unable to add testers/groups. Response code: " + execute.getStatusCode());
    }

    /* renamed from: e */
    public final boolean m39273e(boolean z, String str, String str2) {
        if (z) {
            f54565b.info(str);
            return true;
        }
        f54565b.warn(str2);
        return false;
    }

    @NotNull
    public final AabInfo getAabInfo(@NotNull String appName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Object fromJson = new Gson().fromJson(this.f54566a.newGetRequest(ApiEndpoints.INSTANCE.getAabInfo(appName)).execute().parseAsString(), (Class<Object>) AabInfo.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(appRespo…g(), AabInfo::class.java)");
        return (AabInfo) fromJson;
    }

    @Nullable
    public final ReleaseTest getReleaseTest(@NotNull String releaseTestName) {
        Intrinsics.checkNotNullParameter(releaseTestName, "releaseTestName");
        HttpResponse execute = this.f54566a.newGetRequest(ApiEndpoints.INSTANCE.getReleaseTestEndpoint(releaseTestName)).execute();
        if (execute.isSuccessStatusCode()) {
            return (ReleaseTest) new Gson().fromJson(execute.parseAsString(), (Class<Object>) ReleaseTest.class);
        }
        f54565b.warn("Unable to retrieve test. Response code: {}", Integer.valueOf(execute.getStatusCode()));
        return null;
    }

    @NotNull
    public final UploadStatusResponse getUploadStatus(@NotNull String operationName, @NotNull BinaryType binaryType) {
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(binaryType, "binaryType");
        try {
            Object fromJson = new Gson().fromJson(this.f54566a.newGetRequest(ApiEndpoints.INSTANCE.getUploadStatusEndpoint(operationName)).execute().parseAsString(), (Class<Object>) UploadStatusResponse.class);
            Intrinsics.checkNotNullExpressionValue(fromJson, "{\n      val response = h…sponse::class.java)\n    }");
            return (UploadStatusResponse) fromJson;
        } catch (HttpResponseException e) {
            throw AppDistributionException.Companion.fromHttpResponseException(AppDistributionException.Reason.Companion.processingBinaryError(binaryType), e);
        } catch (IOException e2) {
            throw AppDistributionException.Companion.fromIoException(AppDistributionException.Reason.Companion.processingBinaryError(binaryType), e2);
        }
    }

    @Nullable
    public final ReleaseTest testRelease(@NotNull String releaseName, @NotNull List<TestDevice> testDevices, @Nullable LoginCredential loginCredential, @Nullable String str) {
        String str2;
        Intrinsics.checkNotNullParameter(releaseName, "releaseName");
        Intrinsics.checkNotNullParameter(testDevices, "testDevices");
        List<TestDevice> list = testDevices;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (TestDevice testDevice : list) {
            arrayList.add(new DeviceExecution(null, null, testDevice, null, null, null, null, null, null, null, PointerIconCompat.TYPE_ZOOM_OUT, null));
        }
        ReleaseTest releaseTest = new ReleaseTest(null, arrayList, loginCredential, null, str, 9, null);
        try {
            AuthenticatedHttpClient authenticatedHttpClient = this.f54566a;
            GenericUrl createReleaseTestEndpoint = ApiEndpoints.INSTANCE.getCreateReleaseTestEndpoint(releaseName);
            JsonElement jsonTree = new Gson().toJsonTree(releaseTest);
            Intrinsics.checkNotNullExpressionValue(jsonTree, "Gson().toJsonTree(releaseTest)");
            HttpResponse execute = authenticatedHttpClient.newPostRequest(createReleaseTestEndpoint, m39276b(jsonTree)).execute();
            if (execute.isSuccessStatusCode()) {
                if (str != null) {
                    str2 = "Started test case " + NameUtils.INSTANCE.extractResourceId(str);
                } else {
                    str2 = "Started test";
                }
                f54565b.lifecycle("{} successfully [{}]. Note: This feature is in beta.", new Object[]{str2, Integer.valueOf(execute.getStatusCode())});
                return (ReleaseTest) new Gson().fromJson(execute.parseAsString(), (Class<Object>) ReleaseTest.class);
            }
            f54565b.warn("Unable to start test. Response code: {}", Integer.valueOf(execute.getStatusCode()));
            return null;
        } catch (HttpResponseException e) {
            if (e.getStatusCode() == 404) {
                throw new AppDistributionException(AppDistributionException.Reason.TEST_CASE_NOT_FOUND, null, str, 2, null);
            }
            throw e;
        }
    }
}
