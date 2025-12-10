package th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_change_to_esi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_change_to_esi/ExistingChangeToESIMResponse;", "", "message", "", "isNotCaptured", "", "pendingEsimCard", "(Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "getMessage", "()Ljava/lang/String;", "getPendingEsimCard", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.existing_change_to_esi.ExistingChangeToESIMResponse */
/* loaded from: classes8.dex */
public final class ExistingChangeToESIMResponse {
    public static final int $stable = 0;
    @SerializedName("isNotCaptured")
    private final boolean isNotCaptured;
    @SerializedName("message")
    @Nullable
    private final String message;
    @SerializedName("pendingEsimCard")
    @NotNull
    private final String pendingEsimCard;

    public ExistingChangeToESIMResponse() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ ExistingChangeToESIMResponse copy$default(ExistingChangeToESIMResponse existingChangeToESIMResponse, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = existingChangeToESIMResponse.message;
        }
        if ((i & 2) != 0) {
            z = existingChangeToESIMResponse.isNotCaptured;
        }
        if ((i & 4) != 0) {
            str2 = existingChangeToESIMResponse.pendingEsimCard;
        }
        return existingChangeToESIMResponse.copy(str, z, str2);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    public final boolean component2() {
        return this.isNotCaptured;
    }

    @NotNull
    public final String component3() {
        return this.pendingEsimCard;
    }

    @NotNull
    public final ExistingChangeToESIMResponse copy(@Nullable String str, boolean z, @NotNull String pendingEsimCard) {
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        return new ExistingChangeToESIMResponse(str, z, pendingEsimCard);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExistingChangeToESIMResponse) {
            ExistingChangeToESIMResponse existingChangeToESIMResponse = (ExistingChangeToESIMResponse) obj;
            return Intrinsics.areEqual(this.message, existingChangeToESIMResponse.message) && this.isNotCaptured == existingChangeToESIMResponse.isNotCaptured && Intrinsics.areEqual(this.pendingEsimCard, existingChangeToESIMResponse.pendingEsimCard);
        }
        return false;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPendingEsimCard() {
        return this.pendingEsimCard;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isNotCaptured;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.pendingEsimCard.hashCode();
    }

    public final boolean isNotCaptured() {
        return this.isNotCaptured;
    }

    @NotNull
    public String toString() {
        String str = this.message;
        boolean z = this.isNotCaptured;
        String str2 = this.pendingEsimCard;
        return "ExistingChangeToESIMResponse(message=" + str + ", isNotCaptured=" + z + ", pendingEsimCard=" + str2 + ")";
    }

    public ExistingChangeToESIMResponse(@Nullable String str, boolean z, @NotNull String pendingEsimCard) {
        Intrinsics.checkNotNullParameter(pendingEsimCard, "pendingEsimCard");
        this.message = str;
        this.isNotCaptured = z;
        this.pendingEsimCard = pendingEsimCard;
    }

    public /* synthetic */ ExistingChangeToESIMResponse(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2);
    }
}