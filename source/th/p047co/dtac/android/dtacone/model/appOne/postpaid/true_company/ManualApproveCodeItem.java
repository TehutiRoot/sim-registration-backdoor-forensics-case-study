package th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ManualApproveCodeItem;", "", "result", "", "approveCode", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ApproveCode;", "resultDesc", "(Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ApproveCode;Ljava/lang/String;)V", "getApproveCode", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/ApproveCode;", "getResult", "()Ljava/lang/String;", "getResultDesc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.true_company.ManualApproveCodeItem */
/* loaded from: classes8.dex */
public final class ManualApproveCodeItem {
    public static final int $stable = 0;
    @SerializedName("approveCode")
    @Nullable
    private final ApproveCode approveCode;
    @SerializedName("result")
    @Nullable
    private final String result;
    @SerializedName("resultDesc")
    @Nullable
    private final String resultDesc;

    public ManualApproveCodeItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ManualApproveCodeItem copy$default(ManualApproveCodeItem manualApproveCodeItem, String str, ApproveCode approveCode, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = manualApproveCodeItem.result;
        }
        if ((i & 2) != 0) {
            approveCode = manualApproveCodeItem.approveCode;
        }
        if ((i & 4) != 0) {
            str2 = manualApproveCodeItem.resultDesc;
        }
        return manualApproveCodeItem.copy(str, approveCode, str2);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final ApproveCode component2() {
        return this.approveCode;
    }

    @Nullable
    public final String component3() {
        return this.resultDesc;
    }

    @NotNull
    public final ManualApproveCodeItem copy(@Nullable String str, @Nullable ApproveCode approveCode, @Nullable String str2) {
        return new ManualApproveCodeItem(str, approveCode, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ManualApproveCodeItem) {
            ManualApproveCodeItem manualApproveCodeItem = (ManualApproveCodeItem) obj;
            return Intrinsics.areEqual(this.result, manualApproveCodeItem.result) && Intrinsics.areEqual(this.approveCode, manualApproveCodeItem.approveCode) && Intrinsics.areEqual(this.resultDesc, manualApproveCodeItem.resultDesc);
        }
        return false;
    }

    @Nullable
    public final ApproveCode getApproveCode() {
        return this.approveCode;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final String getResultDesc() {
        return this.resultDesc;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApproveCode approveCode = this.approveCode;
        int hashCode2 = (hashCode + (approveCode == null ? 0 : approveCode.hashCode())) * 31;
        String str2 = this.resultDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.result;
        ApproveCode approveCode = this.approveCode;
        String str2 = this.resultDesc;
        return "ManualApproveCodeItem(result=" + str + ", approveCode=" + approveCode + ", resultDesc=" + str2 + ")";
    }

    public ManualApproveCodeItem(@Nullable String str, @Nullable ApproveCode approveCode, @Nullable String str2) {
        this.result = str;
        this.approveCode = approveCode;
        this.resultDesc = str2;
    }

    public /* synthetic */ ManualApproveCodeItem(String str, ApproveCode approveCode, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : approveCode, (i & 4) != 0 ? null : str2);
    }
}
