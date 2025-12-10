package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Campaign;", "", "code", "", "moreInfo", "name", TypedValues.CycleType.S_WAVE_PERIOD, "seqn", "", "type", "typeDisplay", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMoreInfo", "getName", "getPeriod", "getSeqn", "()I", "getType", "getTypeDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Campaign */
/* loaded from: classes8.dex */
public final class Campaign {
    public static final int $stable = 0;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("moreInfo")
    @NotNull
    private final String moreInfo;
    @SerializedName("name")
    @NotNull
    private final String name;
    @SerializedName(TypedValues.CycleType.S_WAVE_PERIOD)
    @NotNull
    private final String period;
    @SerializedName("seqn")
    private final int seqn;
    @SerializedName("type")
    @NotNull
    private final String type;
    @SerializedName("typeDisplay")
    @NotNull
    private final String typeDisplay;

    public Campaign(@NotNull String code, @NotNull String moreInfo, @NotNull String name, @NotNull String period, int i, @NotNull String type, @NotNull String typeDisplay) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(moreInfo, "moreInfo");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeDisplay, "typeDisplay");
        this.code = code;
        this.moreInfo = moreInfo;
        this.name = name;
        this.period = period;
        this.seqn = i;
        this.type = type;
        this.typeDisplay = typeDisplay;
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = campaign.code;
        }
        if ((i2 & 2) != 0) {
            str2 = campaign.moreInfo;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = campaign.name;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = campaign.period;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            i = campaign.seqn;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = campaign.type;
        }
        String str10 = str5;
        if ((i2 & 64) != 0) {
            str6 = campaign.typeDisplay;
        }
        return campaign.copy(str, str7, str8, str9, i3, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.moreInfo;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final String component4() {
        return this.period;
    }

    public final int component5() {
        return this.seqn;
    }

    @NotNull
    public final String component6() {
        return this.type;
    }

    @NotNull
    public final String component7() {
        return this.typeDisplay;
    }

    @NotNull
    public final Campaign copy(@NotNull String code, @NotNull String moreInfo, @NotNull String name, @NotNull String period, int i, @NotNull String type, @NotNull String typeDisplay) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(moreInfo, "moreInfo");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeDisplay, "typeDisplay");
        return new Campaign(code, moreInfo, name, period, i, type, typeDisplay);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.code, campaign.code) && Intrinsics.areEqual(this.moreInfo, campaign.moreInfo) && Intrinsics.areEqual(this.name, campaign.name) && Intrinsics.areEqual(this.period, campaign.period) && this.seqn == campaign.seqn && Intrinsics.areEqual(this.type, campaign.type) && Intrinsics.areEqual(this.typeDisplay, campaign.typeDisplay);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMoreInfo() {
        return this.moreInfo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    public final int getSeqn() {
        return this.seqn;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public int hashCode() {
        return (((((((((((this.code.hashCode() * 31) + this.moreInfo.hashCode()) * 31) + this.name.hashCode()) * 31) + this.period.hashCode()) * 31) + this.seqn) * 31) + this.type.hashCode()) * 31) + this.typeDisplay.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.moreInfo;
        String str3 = this.name;
        String str4 = this.period;
        int i = this.seqn;
        String str5 = this.type;
        String str6 = this.typeDisplay;
        return "Campaign(code=" + str + ", moreInfo=" + str2 + ", name=" + str3 + ", period=" + str4 + ", seqn=" + i + ", type=" + str5 + ", typeDisplay=" + str6 + ")";
    }
}