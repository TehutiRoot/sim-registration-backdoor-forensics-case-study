package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberByIDModel;", "", "subscriberList", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberListModel;", "idCardNumber", "", "(Ljava/util/List;Ljava/lang/String;)V", "getIdCardNumber", "()Ljava/lang/String;", "setIdCardNumber", "(Ljava/lang/String;)V", "getSubscriberList", "()Ljava/util/List;", "setSubscriberList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.SubscriberByIDModel */
/* loaded from: classes8.dex */
public final class SubscriberByIDModel {
    public static final int $stable = 8;
    @Nullable
    private String idCardNumber;
    @SerializedName("subscriberList")
    @Nullable
    private List<SubscriberListModel> subscriberList;

    public SubscriberByIDModel() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriberByIDModel copy$default(SubscriberByIDModel subscriberByIDModel, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = subscriberByIDModel.subscriberList;
        }
        if ((i & 2) != 0) {
            str = subscriberByIDModel.idCardNumber;
        }
        return subscriberByIDModel.copy(list, str);
    }

    @Nullable
    public final List<SubscriberListModel> component1() {
        return this.subscriberList;
    }

    @Nullable
    public final String component2() {
        return this.idCardNumber;
    }

    @NotNull
    public final SubscriberByIDModel copy(@Nullable List<SubscriberListModel> list, @Nullable String str) {
        return new SubscriberByIDModel(list, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SubscriberByIDModel) {
            SubscriberByIDModel subscriberByIDModel = (SubscriberByIDModel) obj;
            return Intrinsics.areEqual(this.subscriberList, subscriberByIDModel.subscriberList) && Intrinsics.areEqual(this.idCardNumber, subscriberByIDModel.idCardNumber);
        }
        return false;
    }

    @Nullable
    public final String getIdCardNumber() {
        return this.idCardNumber;
    }

    @Nullable
    public final List<SubscriberListModel> getSubscriberList() {
        return this.subscriberList;
    }

    public int hashCode() {
        List<SubscriberListModel> list = this.subscriberList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.idCardNumber;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setIdCardNumber(@Nullable String str) {
        this.idCardNumber = str;
    }

    public final void setSubscriberList(@Nullable List<SubscriberListModel> list) {
        this.subscriberList = list;
    }

    @NotNull
    public String toString() {
        List<SubscriberListModel> list = this.subscriberList;
        String str = this.idCardNumber;
        return "SubscriberByIDModel(subscriberList=" + list + ", idCardNumber=" + str + ")";
    }

    public SubscriberByIDModel(@Nullable List<SubscriberListModel> list, @Nullable String str) {
        this.subscriberList = list;
        this.idCardNumber = str;
    }

    public /* synthetic */ SubscriberByIDModel(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}