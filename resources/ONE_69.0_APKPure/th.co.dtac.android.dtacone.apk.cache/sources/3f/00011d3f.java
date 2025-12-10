package th.p047co.dtac.android.dtacone.model.change_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/change_pack/NextCycle;", "", "sequence", "", "nextPkgpCode", "lastChangeDateTime", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLastChangeDateTime", "()Ljava/lang/String;", "setLastChangeDateTime", "(Ljava/lang/String;)V", "getNextPkgpCode", "setNextPkgpCode", "getSequence", "setSequence", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.change_pack.NextCycle */
/* loaded from: classes8.dex */
public final class NextCycle {
    public static final int $stable = 8;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private String lastChangeDateTime;
    @SerializedName("nextPkgpCode")
    @NotNull
    private String nextPkgpCode;
    @SerializedName("sequence")
    @NotNull
    private String sequence;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @NotNull
    private String status;

    public NextCycle() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ NextCycle copy$default(NextCycle nextCycle, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nextCycle.sequence;
        }
        if ((i & 2) != 0) {
            str2 = nextCycle.nextPkgpCode;
        }
        if ((i & 4) != 0) {
            str3 = nextCycle.lastChangeDateTime;
        }
        if ((i & 8) != 0) {
            str4 = nextCycle.status;
        }
        return nextCycle.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.sequence;
    }

    @NotNull
    public final String component2() {
        return this.nextPkgpCode;
    }

    @NotNull
    public final String component3() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component4() {
        return this.status;
    }

    @NotNull
    public final NextCycle copy(@NotNull String sequence, @NotNull String nextPkgpCode, @NotNull String lastChangeDateTime, @NotNull String status) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(nextPkgpCode, "nextPkgpCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(status, "status");
        return new NextCycle(sequence, nextPkgpCode, lastChangeDateTime, status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NextCycle) {
            NextCycle nextCycle = (NextCycle) obj;
            return Intrinsics.areEqual(this.sequence, nextCycle.sequence) && Intrinsics.areEqual(this.nextPkgpCode, nextCycle.nextPkgpCode) && Intrinsics.areEqual(this.lastChangeDateTime, nextCycle.lastChangeDateTime) && Intrinsics.areEqual(this.status, nextCycle.status);
        }
        return false;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getNextPkgpCode() {
        return this.nextPkgpCode;
    }

    @NotNull
    public final String getSequence() {
        return this.sequence;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.sequence.hashCode() * 31) + this.nextPkgpCode.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setLastChangeDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastChangeDateTime = str;
    }

    public final void setNextPkgpCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nextPkgpCode = str;
    }

    public final void setSequence(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sequence = str;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    @NotNull
    public String toString() {
        String str = this.sequence;
        String str2 = this.nextPkgpCode;
        String str3 = this.lastChangeDateTime;
        String str4 = this.status;
        return "NextCycle(sequence=" + str + ", nextPkgpCode=" + str2 + ", lastChangeDateTime=" + str3 + ", status=" + str4 + ")";
    }

    public NextCycle(@NotNull String sequence, @NotNull String nextPkgpCode, @NotNull String lastChangeDateTime, @NotNull String status) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(nextPkgpCode, "nextPkgpCode");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(status, "status");
        this.sequence = sequence;
        this.nextPkgpCode = nextPkgpCode;
        this.lastChangeDateTime = lastChangeDateTime;
        this.status = status;
    }

    public /* synthetic */ NextCycle(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}