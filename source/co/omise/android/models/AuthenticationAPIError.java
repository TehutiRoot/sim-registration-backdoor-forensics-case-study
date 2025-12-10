package co.omise.android.models;

import androidx.core.app.NotificationCompat;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.models.Authentication;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28850d2 = {"Lco/omise/android/models/AuthenticationAPIError;", "Ljava/lang/Error;", "Lkotlin/Error;", NotificationCompat.CATEGORY_STATUS, "Lco/omise/android/models/Authentication$AuthenticationStatus;", "message", "", "(Lco/omise/android/models/Authentication$AuthenticationStatus;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lco/omise/android/models/Authentication$AuthenticationStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class AuthenticationAPIError extends Error {
    @Nullable
    private final String message;
    @NotNull
    private final Authentication.AuthenticationStatus status;

    public AuthenticationAPIError() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AuthenticationAPIError copy$default(AuthenticationAPIError authenticationAPIError, Authentication.AuthenticationStatus authenticationStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            authenticationStatus = authenticationAPIError.status;
        }
        if ((i & 2) != 0) {
            str = authenticationAPIError.getMessage();
        }
        return authenticationAPIError.copy(authenticationStatus, str);
    }

    @NotNull
    public final Authentication.AuthenticationStatus component1() {
        return this.status;
    }

    @Nullable
    public final String component2() {
        return getMessage();
    }

    @NotNull
    public final AuthenticationAPIError copy(@NotNull Authentication.AuthenticationStatus status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new AuthenticationAPIError(status, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthenticationAPIError) {
            AuthenticationAPIError authenticationAPIError = (AuthenticationAPIError) obj;
            return this.status == authenticationAPIError.status && Intrinsics.areEqual(getMessage(), authenticationAPIError.getMessage());
        }
        return false;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    @NotNull
    public final Authentication.AuthenticationStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + (getMessage() == null ? 0 : getMessage().hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "AuthenticationAPIError(status=" + this.status + ", message=" + getMessage() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ AuthenticationAPIError(Authentication.AuthenticationStatus authenticationStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Authentication.AuthenticationStatus.FAILED : authenticationStatus, (i & 2) != 0 ? null : str);
    }

    public AuthenticationAPIError(@NotNull Authentication.AuthenticationStatus status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.message = str;
    }
}
