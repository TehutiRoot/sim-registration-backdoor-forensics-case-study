package th.p047co.dtac.android.dtacone.model.campaign.reward;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/reward/DetailsItem;", "", "uiStyle", "", "line", "data3", "data2", "data1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData1", "()Ljava/lang/String;", "getData2", "getData3", "getLine", "getUiStyle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.reward.DetailsItem */
/* loaded from: classes8.dex */
public final class DetailsItem {
    public static final int $stable = 0;
    @SerializedName("data1")
    @Nullable
    private final String data1;
    @SerializedName("data2")
    @Nullable
    private final String data2;
    @SerializedName("data3")
    @Nullable
    private final String data3;
    @SerializedName("line")
    @Nullable
    private final String line;
    @SerializedName("uiStyle")
    @Nullable
    private final String uiStyle;

    public DetailsItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ DetailsItem copy$default(DetailsItem detailsItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailsItem.uiStyle;
        }
        if ((i & 2) != 0) {
            str2 = detailsItem.line;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = detailsItem.data3;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = detailsItem.data2;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = detailsItem.data1;
        }
        return detailsItem.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.uiStyle;
    }

    @Nullable
    public final String component2() {
        return this.line;
    }

    @Nullable
    public final String component3() {
        return this.data3;
    }

    @Nullable
    public final String component4() {
        return this.data2;
    }

    @Nullable
    public final String component5() {
        return this.data1;
    }

    @NotNull
    public final DetailsItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new DetailsItem(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DetailsItem) {
            DetailsItem detailsItem = (DetailsItem) obj;
            return Intrinsics.areEqual(this.uiStyle, detailsItem.uiStyle) && Intrinsics.areEqual(this.line, detailsItem.line) && Intrinsics.areEqual(this.data3, detailsItem.data3) && Intrinsics.areEqual(this.data2, detailsItem.data2) && Intrinsics.areEqual(this.data1, detailsItem.data1);
        }
        return false;
    }

    @Nullable
    public final String getData1() {
        return this.data1;
    }

    @Nullable
    public final String getData2() {
        return this.data2;
    }

    @Nullable
    public final String getData3() {
        return this.data3;
    }

    @Nullable
    public final String getLine() {
        return this.line;
    }

    @Nullable
    public final String getUiStyle() {
        return this.uiStyle;
    }

    public int hashCode() {
        String str = this.uiStyle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.line;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.data3;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.data2;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.data1;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.uiStyle;
        String str2 = this.line;
        String str3 = this.data3;
        String str4 = this.data2;
        String str5 = this.data1;
        return "DetailsItem(uiStyle=" + str + ", line=" + str2 + ", data3=" + str3 + ", data2=" + str4 + ", data1=" + str5 + ")";
    }

    public DetailsItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.uiStyle = str;
        this.line = str2;
        this.data3 = str3;
        this.data2 = str4;
        this.data1 = str5;
    }

    public /* synthetic */ DetailsItem(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
