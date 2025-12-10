package th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/CustomerItem;", "", "result", "", "timeStamp", "resultDesc", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getResultDesc", "getStatus", "getTimeStamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.CustomerItem */
/* loaded from: classes8.dex */
public final class CustomerItem {
    public static final int $stable = 0;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;
    @SerializedName("timeStamp")
    @Nullable
    private final String timeStamp;

    public CustomerItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CustomerItem copy$default(CustomerItem customerItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerItem.result;
        }
        if ((i & 2) != 0) {
            str2 = customerItem.timeStamp;
        }
        if ((i & 4) != 0) {
            str3 = customerItem.resultDesc;
        }
        if ((i & 8) != 0) {
            str4 = customerItem.status;
        }
        return customerItem.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final String component2() {
        return this.timeStamp;
    }

    @Nullable
    public final String component3() {
        return this.resultDesc;
    }

    @Nullable
    public final String component4() {
        return this.status;
    }

    @NotNull
    public final CustomerItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new CustomerItem(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerItem) {
            CustomerItem customerItem = (CustomerItem) obj;
            return Intrinsics.areEqual(this.result, customerItem.result) && Intrinsics.areEqual(this.timeStamp, customerItem.timeStamp) && Intrinsics.areEqual(this.resultDesc, customerItem.resultDesc) && Intrinsics.areEqual(this.status, customerItem.status);
        }
        return false;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultDesc() {
        return this.resultDesc;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.timeStamp;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultDesc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        String str2 = this.timeStamp;
        String str3 = this.resultDesc;
        String str4 = this.status;
        return "CustomerItem(result=" + str + ", timeStamp=" + str2 + ", resultDesc=" + str3 + ", status=" + str4 + ")";
    }

    public CustomerItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.result = str;
        this.timeStamp = str2;
        this.resultDesc = str3;
        this.status = str4;
    }

    public /* synthetic */ CustomerItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}