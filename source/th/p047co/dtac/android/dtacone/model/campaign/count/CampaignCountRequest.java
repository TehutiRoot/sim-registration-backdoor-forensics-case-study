package th.p047co.dtac.android.dtacone.model.campaign.count;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountRequest;", "", "channel", "", "rtrCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getRtrCode", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.count.CampaignCountRequest */
/* loaded from: classes8.dex */
public final class CampaignCountRequest {
    public static final int $stable = 0;
    @SerializedName("channel")
    @NotNull
    private final String channel;
    @SerializedName("rtrCode")
    @NotNull
    private final String rtrCode;

    public CampaignCountRequest() {
        this(null, null, 3, null);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getRtrCode() {
        return this.rtrCode;
    }

    public CampaignCountRequest(@NotNull String channel, @NotNull String rtrCode) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(rtrCode, "rtrCode");
        this.channel = channel;
        this.rtrCode = rtrCode;
    }

    public /* synthetic */ CampaignCountRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
