package th.p047co.dtac.android.dtacone.model.appOne.pre2post.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSaveFormsRequest;", "", "orderId", "", "pdfData", "", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostPdfData;", "(Ljava/lang/String;Ljava/util/List;)V", "getOrderId", "()Ljava/lang/String;", "getPdfData", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSaveFormsRequest */
/* loaded from: classes8.dex */
public final class OnePre2PostSaveFormsRequest {
    public static final int $stable = 8;
    @SerializedName("orderId")
    @Nullable
    private final String orderId;
    @SerializedName("pdfData")
    @Nullable
    private final List<OnePre2PostPdfData> pdfData;

    public OnePre2PostSaveFormsRequest() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnePre2PostSaveFormsRequest copy$default(OnePre2PostSaveFormsRequest onePre2PostSaveFormsRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostSaveFormsRequest.orderId;
        }
        if ((i & 2) != 0) {
            list = onePre2PostSaveFormsRequest.pdfData;
        }
        return onePre2PostSaveFormsRequest.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.orderId;
    }

    @Nullable
    public final List<OnePre2PostPdfData> component2() {
        return this.pdfData;
    }

    @NotNull
    public final OnePre2PostSaveFormsRequest copy(@Nullable String str, @Nullable List<OnePre2PostPdfData> list) {
        return new OnePre2PostSaveFormsRequest(str, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostSaveFormsRequest) {
            OnePre2PostSaveFormsRequest onePre2PostSaveFormsRequest = (OnePre2PostSaveFormsRequest) obj;
            return Intrinsics.areEqual(this.orderId, onePre2PostSaveFormsRequest.orderId) && Intrinsics.areEqual(this.pdfData, onePre2PostSaveFormsRequest.pdfData);
        }
        return false;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final List<OnePre2PostPdfData> getPdfData() {
        return this.pdfData;
    }

    public int hashCode() {
        String str = this.orderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OnePre2PostPdfData> list = this.pdfData;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.orderId;
        List<OnePre2PostPdfData> list = this.pdfData;
        return "OnePre2PostSaveFormsRequest(orderId=" + str + ", pdfData=" + list + ")";
    }

    public OnePre2PostSaveFormsRequest(@Nullable String str, @Nullable List<OnePre2PostPdfData> list) {
        this.orderId = str;
        this.pdfData = list;
    }

    public /* synthetic */ OnePre2PostSaveFormsRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
