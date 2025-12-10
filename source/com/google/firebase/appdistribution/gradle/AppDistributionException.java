package com.google.firebase.appdistribution.gradle;

import com.google.api.client.http.HttpResponseException;
import com.google.firebase.appdistribution.gradle.models.AabState;
import com.google.firebase.appdistribution.gradle.models.ErrorPayload;
import com.google.firebase.appdistribution.gradle.models.WrappedErrorResponse;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0002\u000e\u000fB\u0017\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "reason", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "subReason", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;)V", "cause", "", "extraInformation", "", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;Ljava/lang/Throwable;Ljava/lang/String;)V", "getReason", "()Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "Companion", "Reason", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public final class AppDistributionException extends RuntimeException {
    @NotNull
    public static final Companion Companion;
    private static final Logger logger;
    @NotNull
    private final Reason reason;

    @Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Companion;", "", "<init>", "()V", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "reason", "", "extraInformation", "formatMessage", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/IOException;", "cause", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "fromIoException", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;Ljava/io/IOException;)Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "Lcom/google/api/client/http/HttpResponseException;", "fromHttpResponseException", "(Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;Lcom/google/api/client/http/HttpResponseException;)Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "Lcom/google/firebase/appdistribution/gradle/models/AabState;", RemoteConfigConstants.ResponseFieldKey.STATE, "forAabState", "(Lcom/google/firebase/appdistribution/gradle/models/AabState;)Lcom/google/firebase/appdistribution/gradle/AppDistributionException;", "exception", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lcom/google/api/client/http/HttpResponseException;)Ljava/lang/String;", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/gradle/api/logging/Logger;", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AabState.values().length];
                try {
                    iArr[AabState.APP_NOT_PUBLISHED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AabState.NO_APP_WITH_GIVEN_BUNDLE_ID_IN_PLAY_ACCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AabState.PLAY_ACCOUNT_NOT_LINKED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AabState.PLAY_IAS_TERMS_NOT_ACCEPTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m39272a(HttpResponseException httpResponseException) {
            ErrorPayload errorPayload;
            String statusMessage = httpResponseException.getStatusMessage();
            try {
                WrappedErrorResponse wrappedErrorResponse = (WrappedErrorResponse) new Gson().fromJson(httpResponseException.getContent(), (Class<Object>) WrappedErrorResponse.class);
                if (wrappedErrorResponse != null) {
                    errorPayload = wrappedErrorResponse.getError();
                } else {
                    errorPayload = null;
                }
                if (errorPayload != null) {
                    return wrappedErrorResponse.getError().getMessage();
                }
                return statusMessage;
            } catch (JsonSyntaxException unused) {
                AppDistributionException.logger.warn("Failed to parse error response: {}", httpResponseException.getContent());
                return statusMessage;
            }
        }

        @NotNull
        public final AppDistributionException forAabState(@Nullable AabState aabState) {
            Reason reason;
            if (aabState == null) {
                return new AppDistributionException(Reason.AAB_PROCESSING_ERROR, null, null, 6, null);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[aabState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return new AppDistributionException(Reason.AAB_PROCESSING_ERROR, null, null, 6, null);
                        }
                        reason = Reason.AAB_APP_ERROR_TOS_NOT_ACCEPTED;
                    } else {
                        reason = Reason.AAB_APP_ERROR_PLAY_ACCOUNT_NOT_LINKED;
                    }
                } else {
                    reason = Reason.AAB_APP_ERROR_NO_APP_WITH_GIVEN_BUNDLE_ID_IN_PLAY_ACCOUNT;
                }
            } else {
                reason = Reason.AAB_APP_ERROR_APP_NOT_PUBLISHED;
            }
            return new AppDistributionException(Reason.AAB_PROCESSING_ERROR, reason, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final String formatMessage(@NotNull Reason reason, @Nullable String str) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (str == null) {
                return reason.getMessage();
            }
            return reason.getMessage() + ": " + str;
        }

        @NotNull
        public final AppDistributionException fromHttpResponseException(@NotNull Reason reason, @NotNull HttpResponseException cause) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new AppDistributionException(reason, cause, AbstractJsonLexerKt.BEGIN_LIST + cause.getStatusCode() + "] " + m39272a(cause));
        }

        @NotNull
        public final AppDistributionException fromIoException(@NotNull Reason reason, @NotNull IOException cause) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new AppDistributionException(reason, cause, cause.getMessage());
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006+"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "MISSING_CREDENTIALS", "APK_NOT_FOUND", "AAB_NOT_FOUND", "MISSING_PROJECT_NUMBER", "MISSING_APP_ID", "INVALID_APP_ID", "MISSING_TESTER_EMAILS", "SERVICE_CREDENTIALS_NOT_FOUND", "UPLOAD_RELEASE_NOTES_ERROR", "UPLOAD_TESTERS_ERROR", "UPLOAD_AAB_ERROR", "UPLOAD_APK_ERROR", "AAB_PROCESSING_ERROR", "APK_PROCESSING_ERROR", "GET_RELEASE_TIMEOUT", "REFRESH_TOKEN_ERROR", "GET_APP_ERROR", "APP_NOT_ONBOARDED_ERROR", "AAB_APP_ERROR_APP_NOT_PUBLISHED", "AAB_APP_ERROR_NO_APP_WITH_GIVEN_BUNDLE_ID_IN_PLAY_ACCOUNT", "AAB_APP_ERROR_PLAY_ACCOUNT_NOT_LINKED", "AAB_APP_ERROR_TOS_NOT_ACCEPTED", "ADD_TESTERS_ERROR", "REMOVE_TESTERS_ERROR", "TOO_MANY_TESTER_EMAILS", "TEST_LOGIN_CREDENTIAL_MISMATCH", "TEST_LOGIN_CREDENTIAL_RESOURCE_MISMATCH", "TEST_LOGIN_CREDENTIAL_MISSING", "STARTING_TEST_FAILED", "GET_TEST_RETRIEVAL_FAILURE", "GET_TEST_TIMEOUT", "GET_TEST_FAILED", "TEST_CASE_NOT_FOUND", "TEST_CASE_WITH_LOGIN_RESOURCES", "APPLICATION_DEFAULT_CREDENTIALS_NOT_FOUND", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public enum Reason {
        MISSING_CREDENTIALS("Missing credentials. Please check that a refresh token was set or service credentials were passed in and try again"),
        APK_NOT_FOUND("Could not find the APK. Make sure you build first by running ./gradlew assemble[Variant], or set the artifactPath parameter to point to your APK"),
        AAB_NOT_FOUND("Could not find the AAB. Make sure you build first by running ./gradlew bundle[Variant], or set the artifactPath parameter to point to your AAB"),
        MISSING_PROJECT_NUMBER("Missing project number. Please check that it was passed in and try again"),
        MISSING_APP_ID("Missing app id. Please check that it was passed in and try again"),
        INVALID_APP_ID("Invalid app id. Please check that the correct id was passed in and try again"),
        MISSING_TESTER_EMAILS("Missing tester emails. Please check that they were passed in and try again"),
        SERVICE_CREDENTIALS_NOT_FOUND("Service credentials file does not exist. Please check the service credentials path and try again"),
        UPLOAD_RELEASE_NOTES_ERROR("App Distribution halted because it had a problem uploading release notes"),
        UPLOAD_TESTERS_ERROR("App Distribution halted because it had a problem adding testers/groups"),
        UPLOAD_AAB_ERROR("App Distribution halted because it had a problem uploading the AAB"),
        UPLOAD_APK_ERROR("App Distribution halted because it had a problem uploading the APK"),
        AAB_PROCESSING_ERROR("App Distribution failed to process the AAB"),
        APK_PROCESSING_ERROR("App Distribution failed to process the APK"),
        GET_RELEASE_TIMEOUT("App Distribution failed to fetch release information"),
        REFRESH_TOKEN_ERROR("Could not generate credentials from the refresh token specified"),
        GET_APP_ERROR("App Distribution failed to fetch app information"),
        APP_NOT_ONBOARDED_ERROR("App Distribution not onboarded"),
        AAB_APP_ERROR_APP_NOT_PUBLISHED("This app is not published in the Google Play console."),
        AAB_APP_ERROR_NO_APP_WITH_GIVEN_BUNDLE_ID_IN_PLAY_ACCOUNT("App with matching package name does not exist in Google Play."),
        AAB_APP_ERROR_PLAY_ACCOUNT_NOT_LINKED("This project is not linked to a Google Play account."),
        AAB_APP_ERROR_TOS_NOT_ACCEPTED("You must accept the Play Internal App Sharing (IAS) terms to upload AABs."),
        ADD_TESTERS_ERROR("App Distribution failed to add testers"),
        REMOVE_TESTERS_ERROR("App Distribution failed to remove testers"),
        TOO_MANY_TESTER_EMAILS("App Distribution could not perform the operation, too many tester emails"),
        TEST_LOGIN_CREDENTIAL_MISMATCH("Username and password for automated tests need to be specified together."),
        TEST_LOGIN_CREDENTIAL_RESOURCE_MISMATCH("Username and password resource names for automated tests need to be specified together."),
        TEST_LOGIN_CREDENTIAL_MISSING("Must specify username and password"),
        STARTING_TEST_FAILED("App Distribution could not perform the automated test."),
        GET_TEST_RETRIEVAL_FAILURE("App Distribution could not retrieve the test."),
        GET_TEST_TIMEOUT("It took longer than expected to process your test, please try again."),
        GET_TEST_FAILED("Automated test failed or was inconclusive."),
        TEST_CASE_NOT_FOUND("Could not find find test case with ID"),
        TEST_CASE_WITH_LOGIN_RESOURCES("Username or password resources for automatic login cannot be specified when test cases IDs are set"),
        APPLICATION_DEFAULT_CREDENTIALS_NOT_FOUND("Unable to create application default credentials in current environment.");
        
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final String message;

        @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason$Companion;", "", "()V", "binaryNotFoundError", "Lcom/google/firebase/appdistribution/gradle/AppDistributionException$Reason;", "binaryType", "Lcom/google/firebase/appdistribution/gradle/BinaryType;", "processingBinaryError", "uploadBinaryError", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Reason binaryNotFoundError(@NotNull BinaryType binaryType) {
                Intrinsics.checkNotNullParameter(binaryType, "binaryType");
                if (binaryType == BinaryType.AAB) {
                    return Reason.AAB_NOT_FOUND;
                }
                return Reason.APK_NOT_FOUND;
            }

            @NotNull
            public final Reason processingBinaryError(@NotNull BinaryType binaryType) {
                Intrinsics.checkNotNullParameter(binaryType, "binaryType");
                if (binaryType == BinaryType.AAB) {
                    return Reason.AAB_PROCESSING_ERROR;
                }
                return Reason.APK_PROCESSING_ERROR;
            }

            @NotNull
            public final Reason uploadBinaryError(@NotNull BinaryType binaryType) {
                Intrinsics.checkNotNullParameter(binaryType, "binaryType");
                if (binaryType == BinaryType.AAB) {
                    return Reason.UPLOAD_AAB_ERROR;
                }
                return Reason.UPLOAD_APK_ERROR;
            }

            public Companion() {
            }
        }

        Reason(String str) {
            this.message = str;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        logger = Logging.getLogger(companion.getClass());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AppDistributionException(@NotNull Reason reason) {
        this(reason, null, null, 6, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    @NotNull
    public final Reason getReason() {
        return this.reason;
    }

    public /* synthetic */ AppDistributionException(Reason reason, Reason reason2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, reason2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AppDistributionException(@NotNull Reason reason, @Nullable Throwable th2) {
        this(reason, th2, null, 4, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public /* synthetic */ AppDistributionException(Reason reason, Throwable th2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reason, (i & 2) != 0 ? null : th2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AppDistributionException(@NotNull Reason reason, @Nullable Throwable th2, @Nullable String str) {
        super(Companion.formatMessage(reason, str), th2);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    private AppDistributionException(Reason reason, Reason reason2) {
        this(reason, null, reason2.getMessage(), 2, null);
    }
}
