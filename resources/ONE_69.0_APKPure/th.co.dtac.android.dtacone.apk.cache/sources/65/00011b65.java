package th.p047co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.response;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/response/DataSaveOrderResponse;", "", "trxId", "", "processInstance", "displayMessages", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/saveOrder/response/DisplaySaveOrderMessagesItem;", NotificationCompat.CATEGORY_STATUS, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisplayMessages", "()Ljava/util/List;", "getProcessInstance", "()Ljava/lang/String;", "getStatus", "getTrxId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.saveOrder.response.DataSaveOrderResponse */
/* loaded from: classes8.dex */
public final class DataSaveOrderResponse {
    public static final int $stable = 8;
    @SerializedName("display-messages")
    @Nullable
    private final List<DisplaySaveOrderMessagesItem> displayMessages;
    @SerializedName("process-instance")
    @Nullable
    private final String processInstance;
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private final String status;
    @SerializedName("trx-id")
    @Nullable
    private final String trxId;

    public DataSaveOrderResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataSaveOrderResponse copy$default(DataSaveOrderResponse dataSaveOrderResponse, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataSaveOrderResponse.trxId;
        }
        if ((i & 2) != 0) {
            str2 = dataSaveOrderResponse.processInstance;
        }
        if ((i & 4) != 0) {
            list = dataSaveOrderResponse.displayMessages;
        }
        if ((i & 8) != 0) {
            str3 = dataSaveOrderResponse.status;
        }
        return dataSaveOrderResponse.copy(str, str2, list, str3);
    }

    @Nullable
    public final String component1() {
        return this.trxId;
    }

    @Nullable
    public final String component2() {
        return this.processInstance;
    }

    @Nullable
    public final List<DisplaySaveOrderMessagesItem> component3() {
        return this.displayMessages;
    }

    @Nullable
    public final String component4() {
        return this.status;
    }

    @NotNull
    public final DataSaveOrderResponse copy(@Nullable String str, @Nullable String str2, @Nullable List<DisplaySaveOrderMessagesItem> list, @Nullable String str3) {
        return new DataSaveOrderResponse(str, str2, list, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataSaveOrderResponse) {
            DataSaveOrderResponse dataSaveOrderResponse = (DataSaveOrderResponse) obj;
            return Intrinsics.areEqual(this.trxId, dataSaveOrderResponse.trxId) && Intrinsics.areEqual(this.processInstance, dataSaveOrderResponse.processInstance) && Intrinsics.areEqual(this.displayMessages, dataSaveOrderResponse.displayMessages) && Intrinsics.areEqual(this.status, dataSaveOrderResponse.status);
        }
        return false;
    }

    @Nullable
    public final List<DisplaySaveOrderMessagesItem> getDisplayMessages() {
        return this.displayMessages;
    }

    @Nullable
    public final String getProcessInstance() {
        return this.processInstance;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTrxId() {
        return this.trxId;
    }

    public int hashCode() {
        String str = this.trxId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.processInstance;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<DisplaySaveOrderMessagesItem> list = this.displayMessages;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.status;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.trxId;
        String str2 = this.processInstance;
        List<DisplaySaveOrderMessagesItem> list = this.displayMessages;
        String str3 = this.status;
        return "DataSaveOrderResponse(trxId=" + str + ", processInstance=" + str2 + ", displayMessages=" + list + ", status=" + str3 + ")";
    }

    public DataSaveOrderResponse(@Nullable String str, @Nullable String str2, @Nullable List<DisplaySaveOrderMessagesItem> list, @Nullable String str3) {
        this.trxId = str;
        this.processInstance = str2;
        this.displayMessages = list;
        this.status = str3;
    }

    public /* synthetic */ DataSaveOrderResponse(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3);
    }
}