package th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsRequest;", "", "pdfData", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/PdfDataItem;", "orderId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getPdfData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.forms.OneSaveFormsRequest */
/* loaded from: classes8.dex */
public final class OneSaveFormsRequest {
    public static final int $stable = 8;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("pdfData")
    @Nullable
    private final List<PdfDataItem> pdfData;

    public OneSaveFormsRequest() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneSaveFormsRequest copy$default(OneSaveFormsRequest oneSaveFormsRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneSaveFormsRequest.pdfData;
        }
        if ((i & 2) != 0) {
            str = oneSaveFormsRequest.orderId;
        }
        return oneSaveFormsRequest.copy(list, str);
    }

    @Nullable
    public final List<PdfDataItem> component1() {
        return this.pdfData;
    }

    @Nullable
    public final String component2() {
        return this.orderId;
    }

    @NotNull
    public final OneSaveFormsRequest copy(@Nullable List<PdfDataItem> list, @Nullable String str) {
        return new OneSaveFormsRequest(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneSaveFormsRequest) {
            OneSaveFormsRequest oneSaveFormsRequest = (OneSaveFormsRequest) obj;
            return Intrinsics.areEqual(this.pdfData, oneSaveFormsRequest.pdfData) && Intrinsics.areEqual(this.orderId, oneSaveFormsRequest.orderId);
        }
        return false;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final List<PdfDataItem> getPdfData() {
        return this.pdfData;
    }

    public int hashCode() {
        List<PdfDataItem> list = this.pdfData;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.orderId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PdfDataItem> list = this.pdfData;
        String str = this.orderId;
        return "OneSaveFormsRequest(pdfData=" + list + ", orderId=" + str + ")";
    }

    public OneSaveFormsRequest(@Nullable List<PdfDataItem> list, @Nullable String str) {
        this.pdfData = list;
        this.orderId = str;
    }

    public /* synthetic */ OneSaveFormsRequest(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
