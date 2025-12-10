package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/OffersInformation;", "", TypedValues.Custom.S_COLOR, "", "colorMessage", "campaignInformation", "campaignInformationUrl", "averageArpu", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAverageArpu", "()Ljava/lang/String;", "getCampaignInformation", "getCampaignInformationUrl", "getColor", "getColorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.OffersInformation */
/* loaded from: classes8.dex */
public final class OffersInformation {
    public static final int $stable = 0;
    @SerializedName("averageArpu")
    @NotNull
    private final String averageArpu;
    @SerializedName("campaignInformation")
    @NotNull
    private final String campaignInformation;
    @SerializedName("campaignInformationUrl")
    @NotNull
    private final String campaignInformationUrl;
    @SerializedName(TypedValues.Custom.S_COLOR)
    @NotNull
    private final String color;
    @SerializedName("colorMessage")
    @NotNull
    private final String colorMessage;

    public OffersInformation() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ OffersInformation copy$default(OffersInformation offersInformation, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = offersInformation.color;
        }
        if ((i & 2) != 0) {
            str2 = offersInformation.colorMessage;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = offersInformation.campaignInformation;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = offersInformation.campaignInformationUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = offersInformation.averageArpu;
        }
        return offersInformation.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.color;
    }

    @NotNull
    public final String component2() {
        return this.colorMessage;
    }

    @NotNull
    public final String component3() {
        return this.campaignInformation;
    }

    @NotNull
    public final String component4() {
        return this.campaignInformationUrl;
    }

    @NotNull
    public final String component5() {
        return this.averageArpu;
    }

    @NotNull
    public final OffersInformation copy(@NotNull String color, @NotNull String colorMessage, @NotNull String campaignInformation, @NotNull String campaignInformationUrl, @NotNull String averageArpu) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(colorMessage, "colorMessage");
        Intrinsics.checkNotNullParameter(campaignInformation, "campaignInformation");
        Intrinsics.checkNotNullParameter(campaignInformationUrl, "campaignInformationUrl");
        Intrinsics.checkNotNullParameter(averageArpu, "averageArpu");
        return new OffersInformation(color, colorMessage, campaignInformation, campaignInformationUrl, averageArpu);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffersInformation) {
            OffersInformation offersInformation = (OffersInformation) obj;
            return Intrinsics.areEqual(this.color, offersInformation.color) && Intrinsics.areEqual(this.colorMessage, offersInformation.colorMessage) && Intrinsics.areEqual(this.campaignInformation, offersInformation.campaignInformation) && Intrinsics.areEqual(this.campaignInformationUrl, offersInformation.campaignInformationUrl) && Intrinsics.areEqual(this.averageArpu, offersInformation.averageArpu);
        }
        return false;
    }

    @NotNull
    public final String getAverageArpu() {
        return this.averageArpu;
    }

    @NotNull
    public final String getCampaignInformation() {
        return this.campaignInformation;
    }

    @NotNull
    public final String getCampaignInformationUrl() {
        return this.campaignInformationUrl;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getColorMessage() {
        return this.colorMessage;
    }

    public int hashCode() {
        return (((((((this.color.hashCode() * 31) + this.colorMessage.hashCode()) * 31) + this.campaignInformation.hashCode()) * 31) + this.campaignInformationUrl.hashCode()) * 31) + this.averageArpu.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.color;
        String str2 = this.colorMessage;
        String str3 = this.campaignInformation;
        String str4 = this.campaignInformationUrl;
        String str5 = this.averageArpu;
        return "OffersInformation(color=" + str + ", colorMessage=" + str2 + ", campaignInformation=" + str3 + ", campaignInformationUrl=" + str4 + ", averageArpu=" + str5 + ")";
    }

    public OffersInformation(@NotNull String color, @NotNull String colorMessage, @NotNull String campaignInformation, @NotNull String campaignInformationUrl, @NotNull String averageArpu) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(colorMessage, "colorMessage");
        Intrinsics.checkNotNullParameter(campaignInformation, "campaignInformation");
        Intrinsics.checkNotNullParameter(campaignInformationUrl, "campaignInformationUrl");
        Intrinsics.checkNotNullParameter(averageArpu, "averageArpu");
        this.color = color;
        this.colorMessage = colorMessage;
        this.campaignInformation = campaignInformation;
        this.campaignInformationUrl = campaignInformationUrl;
        this.averageArpu = averageArpu;
    }

    public /* synthetic */ OffersInformation(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}