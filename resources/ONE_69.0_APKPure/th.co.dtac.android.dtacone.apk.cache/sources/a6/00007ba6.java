package co.omise.android.models;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m29142d2 = {"Lco/omise/android/models/APIError;", "Ljava/lang/Error;", "Lkotlin/Error;", FirebaseAnalytics.Param.LOCATION, "", "code", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getLocation", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public final class APIError extends Error {
    @Nullable
    private final String code;
    @Nullable
    private final String location;
    @Nullable
    private final String message;

    public APIError() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ APIError copy$default(APIError aPIError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIError.location;
        }
        if ((i & 2) != 0) {
            str2 = aPIError.code;
        }
        if ((i & 4) != 0) {
            str3 = aPIError.getMessage();
        }
        return aPIError.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.location;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return getMessage();
    }

    @NotNull
    public final APIError copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new APIError(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof APIError) {
            APIError aPIError = (APIError) obj;
            return Intrinsics.areEqual(this.location, aPIError.location) && Intrinsics.areEqual(this.code, aPIError.code) && Intrinsics.areEqual(getMessage(), aPIError.getMessage());
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.location;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        return ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (getMessage() != null ? getMessage().hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "APIError(location=" + this.location + ", code=" + this.code + ", message=" + getMessage() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ APIError(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public APIError(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.location = str;
        this.code = str2;
        this.message = str3;
    }
}