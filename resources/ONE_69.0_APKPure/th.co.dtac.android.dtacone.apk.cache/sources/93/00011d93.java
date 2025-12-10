package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/AuthorizeScreen;", "", "actionName", "", "actionDescription", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionDescription", "()Ljava/lang/String;", "getActionName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.AuthorizeScreen */
/* loaded from: classes8.dex */
public final class AuthorizeScreen {
    public static final int $stable = 0;
    @SerializedName("actionDescription")
    @NotNull
    private final String actionDescription;
    @SerializedName("actionName")
    @NotNull
    private final String actionName;

    public AuthorizeScreen(@NotNull String actionName, @NotNull String actionDescription) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(actionDescription, "actionDescription");
        this.actionName = actionName;
        this.actionDescription = actionDescription;
    }

    public static /* synthetic */ AuthorizeScreen copy$default(AuthorizeScreen authorizeScreen, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizeScreen.actionName;
        }
        if ((i & 2) != 0) {
            str2 = authorizeScreen.actionDescription;
        }
        return authorizeScreen.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.actionName;
    }

    @NotNull
    public final String component2() {
        return this.actionDescription;
    }

    @NotNull
    public final AuthorizeScreen copy(@NotNull String actionName, @NotNull String actionDescription) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(actionDescription, "actionDescription");
        return new AuthorizeScreen(actionName, actionDescription);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthorizeScreen) {
            AuthorizeScreen authorizeScreen = (AuthorizeScreen) obj;
            return Intrinsics.areEqual(this.actionName, authorizeScreen.actionName) && Intrinsics.areEqual(this.actionDescription, authorizeScreen.actionDescription);
        }
        return false;
    }

    @NotNull
    public final String getActionDescription() {
        return this.actionDescription;
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public int hashCode() {
        return (this.actionName.hashCode() * 31) + this.actionDescription.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.actionName;
        String str2 = this.actionDescription;
        return "AuthorizeScreen(actionName=" + str + ", actionDescription=" + str2 + ")";
    }
}