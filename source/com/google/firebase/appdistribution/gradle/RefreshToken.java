package com.google.firebase.appdistribution.gradle;

import androidx.core.app.NotificationCompat;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleRefreshTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/RefreshToken;", "", "", "refreshToken", "Lcom/google/api/client/http/HttpTransport;", NotificationCompat.CATEGORY_TRANSPORT, "<init>", "(Ljava/lang/String;Lcom/google/api/client/http/HttpTransport;)V", "Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", "generateNewCredentials", "()Lcom/google/api/client/googleapis/auth/oauth2/GoogleCredential;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/google/api/client/http/HttpTransport;", "Companion", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RefreshToken {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final String f54580a;

    /* renamed from: b */
    public final HttpTransport f54581b;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/RefreshToken$Companion;", "", "()V", "CLIENT_ID", "", "CLIENT_SECRET", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RefreshToken(@NotNull String refreshToken, @NotNull HttpTransport transport) {
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.f54580a = refreshToken;
        this.f54581b = transport;
    }

    @NotNull
    public final GoogleCredential generateNewCredentials() {
        GoogleTokenResponse execute = new GoogleRefreshTokenRequest(this.f54581b, GsonFactory.getDefaultInstance(), this.f54580a, "563584335869-fgrhgmd47bqnekij5i8b5pr03ho849e6.apps.googleusercontent.com", "j9iVZfS8kkCEFUPaAeJV0sAi").execute();
        GoogleCredential credential = new GoogleCredential.Builder().build();
        credential.setFromTokenResponse((TokenResponse) execute);
        Intrinsics.checkNotNullExpressionValue(credential, "credential");
        return credential;
    }
}
