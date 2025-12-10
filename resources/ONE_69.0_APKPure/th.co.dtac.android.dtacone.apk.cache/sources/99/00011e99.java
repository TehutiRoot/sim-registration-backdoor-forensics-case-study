package th.p047co.dtac.android.dtacone.model.login;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login/PostFirebaseToken;", "", "userCode", "", "token", "socketId", "onlineStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOnlineStatus", "()Ljava/lang/String;", "getSocketId", "getToken", "getUserCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login.PostFirebaseToken */
/* loaded from: classes8.dex */
public final class PostFirebaseToken {
    public static final int $stable = 0;
    @SerializedName("onlineStatus")
    @NotNull
    private final String onlineStatus;
    @SerializedName("socketId")
    @NotNull
    private final String socketId;
    @SerializedName("token")
    @NotNull
    private final String token;
    @SerializedName("userCode")
    @NotNull
    private final String userCode;

    public PostFirebaseToken(@NotNull String userCode, @NotNull String token, @NotNull String socketId, @NotNull String onlineStatus) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(socketId, "socketId");
        Intrinsics.checkNotNullParameter(onlineStatus, "onlineStatus");
        this.userCode = userCode;
        this.token = token;
        this.socketId = socketId;
        this.onlineStatus = onlineStatus;
    }

    public static /* synthetic */ PostFirebaseToken copy$default(PostFirebaseToken postFirebaseToken, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postFirebaseToken.userCode;
        }
        if ((i & 2) != 0) {
            str2 = postFirebaseToken.token;
        }
        if ((i & 4) != 0) {
            str3 = postFirebaseToken.socketId;
        }
        if ((i & 8) != 0) {
            str4 = postFirebaseToken.onlineStatus;
        }
        return postFirebaseToken.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.userCode;
    }

    @NotNull
    public final String component2() {
        return this.token;
    }

    @NotNull
    public final String component3() {
        return this.socketId;
    }

    @NotNull
    public final String component4() {
        return this.onlineStatus;
    }

    @NotNull
    public final PostFirebaseToken copy(@NotNull String userCode, @NotNull String token, @NotNull String socketId, @NotNull String onlineStatus) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(socketId, "socketId");
        Intrinsics.checkNotNullParameter(onlineStatus, "onlineStatus");
        return new PostFirebaseToken(userCode, token, socketId, onlineStatus);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostFirebaseToken) {
            PostFirebaseToken postFirebaseToken = (PostFirebaseToken) obj;
            return Intrinsics.areEqual(this.userCode, postFirebaseToken.userCode) && Intrinsics.areEqual(this.token, postFirebaseToken.token) && Intrinsics.areEqual(this.socketId, postFirebaseToken.socketId) && Intrinsics.areEqual(this.onlineStatus, postFirebaseToken.onlineStatus);
        }
        return false;
    }

    @NotNull
    public final String getOnlineStatus() {
        return this.onlineStatus;
    }

    @NotNull
    public final String getSocketId() {
        return this.socketId;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserCode() {
        return this.userCode;
    }

    public int hashCode() {
        return (((((this.userCode.hashCode() * 31) + this.token.hashCode()) * 31) + this.socketId.hashCode()) * 31) + this.onlineStatus.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.userCode;
        String str2 = this.token;
        String str3 = this.socketId;
        String str4 = this.onlineStatus;
        return "PostFirebaseToken(userCode=" + str + ", token=" + str2 + ", socketId=" + str3 + ", onlineStatus=" + str4 + ")";
    }

    public /* synthetic */ PostFirebaseToken(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "1" : str4);
    }
}