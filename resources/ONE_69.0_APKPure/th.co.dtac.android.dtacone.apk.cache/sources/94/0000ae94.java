package com.google.firebase.appdistribution.gradle;

import androidx.core.app.NotificationCompat;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.firebase.appdistribution.gradle.models.FirebaseCliConfig;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironmentImpl;", "Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;", "()V", "getFirebaseCliLoginCredentials", "Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/google/api/client/http/HttpTransport;", "Companion", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes4.dex */
public final class AppDistributionEnvironmentImpl implements AppDistributionEnvironment {
    @NotNull
    public static final Companion Companion;

    /* renamed from: a */
    public static final Logger f54580a;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironmentImpl$Companion;", "", "()V", "logger", "Lorg/gradle/api/logging/Logger;", "kotlin.jvm.PlatformType", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
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
        f54580a = Logging.getLogger(companion.getClass());
    }

    @Override // com.google.firebase.appdistribution.gradle.AppDistributionEnvironment
    @Nullable
    public GoogleCredential getFirebaseCliLoginCredentials(@NotNull HttpTransport transport) {
        Path path;
        String str;
        FirebaseCliConfig.Tokens tokens;
        Intrinsics.checkNotNullParameter(transport, "transport");
        Gson create = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        if (System.getenv("XDG_CONFIG_HOME") != null) {
            path = Paths.get(System.getenv("XDG_CONFIG_HOME"), "configstore", "firebase-tools.json");
            Intrinsics.checkNotNullExpressionValue(path, "{\n          Paths.get(Sy…se-tools.json\")\n        }");
        } else {
            path = Paths.get(System.getProperty("user.home"), ".config", "configstore", "firebase-tools.json");
            Intrinsics.checkNotNullExpressionValue(path, "{\n          Paths.get(\n …se-tools.json\")\n        }");
        }
        try {
            FirebaseCliConfig firebaseCliConfig = (FirebaseCliConfig) create.fromJson((Reader) new FileReader(path.toString()), (Class<Object>) FirebaseCliConfig.class);
            if (firebaseCliConfig != null && (tokens = firebaseCliConfig.getTokens()) != null) {
                str = tokens.getRefreshToken();
            } else {
                str = null;
            }
            if (str != null) {
                return new RefreshToken(firebaseCliConfig.getTokens().getRefreshToken(), transport).generateNewCredentials();
            }
        } catch (IOException e) {
            f54580a.debug("Failed to authenticate with Firebase CLI credentials", e);
        }
        return null;
    }
}