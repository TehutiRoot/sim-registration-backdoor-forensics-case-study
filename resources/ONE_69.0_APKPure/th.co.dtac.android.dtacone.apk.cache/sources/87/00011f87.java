package th.p047co.dtac.android.dtacone.model.newsfeed;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/newsfeed/MissionRequest;", "", "rtrCode", "", "channel", "optinStatus", "option", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getOptinStatus", "getOption", "getRtrCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.MissionRequest */
/* loaded from: classes8.dex */
public final class MissionRequest {
    public static final int $stable = 0;
    @SerializedName("channel")
    @Nullable
    private final String channel;
    @SerializedName("optinStatus")
    @Nullable
    private final String optinStatus;
    @SerializedName("option")
    @Nullable
    private final String option;
    @SerializedName("rtrCode")
    @Nullable
    private final String rtrCode;

    public MissionRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MissionRequest copy$default(MissionRequest missionRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionRequest.rtrCode;
        }
        if ((i & 2) != 0) {
            str2 = missionRequest.channel;
        }
        if ((i & 4) != 0) {
            str3 = missionRequest.optinStatus;
        }
        if ((i & 8) != 0) {
            str4 = missionRequest.option;
        }
        return missionRequest.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.rtrCode;
    }

    @Nullable
    public final String component2() {
        return this.channel;
    }

    @Nullable
    public final String component3() {
        return this.optinStatus;
    }

    @Nullable
    public final String component4() {
        return this.option;
    }

    @NotNull
    public final MissionRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new MissionRequest(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionRequest) {
            MissionRequest missionRequest = (MissionRequest) obj;
            return Intrinsics.areEqual(this.rtrCode, missionRequest.rtrCode) && Intrinsics.areEqual(this.channel, missionRequest.channel) && Intrinsics.areEqual(this.optinStatus, missionRequest.optinStatus) && Intrinsics.areEqual(this.option, missionRequest.option);
        }
        return false;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getOptinStatus() {
        return this.optinStatus;
    }

    @Nullable
    public final String getOption() {
        return this.option;
    }

    @Nullable
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public int hashCode() {
        String str = this.rtrCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.optinStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.option;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.rtrCode;
        String str2 = this.channel;
        String str3 = this.optinStatus;
        String str4 = this.option;
        return "MissionRequest(rtrCode=" + str + ", channel=" + str2 + ", optinStatus=" + str3 + ", option=" + str4 + ")";
    }

    public MissionRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.rtrCode = str;
        this.channel = str2;
        this.optinStatus = str3;
        this.option = str4;
    }

    public /* synthetic */ MissionRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}