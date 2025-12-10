package com.google.firebase.appdistribution.gradle;

import androidx.core.app.NotificationCompat;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment;", "", "getFirebaseCliLoginCredentials", "Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", NotificationCompat.CATEGORY_TRANSPORT, "Lcom/google/api/client/http/HttpTransport;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes4.dex */
public interface AppDistributionEnvironment {
    @NotNull
    public static final Companion Companion = Companion.f54567a;
    @NotNull
    public static final String ENV_FIREBASE_TOKEN = "FIREBASE_TOKEN";
    @NotNull
    public static final String ENV_GOOGLE_APPLICATION_CREDENTIALS = "GOOGLE_APPLICATION_CREDENTIALS";

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/AppDistributionEnvironment$Companion;", "", "()V", "ENV_FIREBASE_TOKEN", "", "ENV_GOOGLE_APPLICATION_CREDENTIALS", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        @NotNull
        public static final String ENV_FIREBASE_TOKEN = "FIREBASE_TOKEN";
        @NotNull
        public static final String ENV_GOOGLE_APPLICATION_CREDENTIALS = "GOOGLE_APPLICATION_CREDENTIALS";

        /* renamed from: a */
        public static final /* synthetic */ Companion f54567a = new Companion();
    }

    @Nullable
    GoogleCredential getFirebaseCliLoginCredentials(@NotNull HttpTransport httpTransport);
}
