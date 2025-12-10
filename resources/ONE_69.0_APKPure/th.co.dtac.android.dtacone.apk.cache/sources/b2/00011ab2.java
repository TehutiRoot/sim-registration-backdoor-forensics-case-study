package th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007HÆ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundDeleteRequest;", "", "serviceId", "", "ban", "openInvoice", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getBan", "()Ljava/lang/String;", "getOpenInvoice", "()Ljava/util/ArrayList;", "getServiceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundDeleteRequest */
/* loaded from: classes8.dex */
public final class OneNadOutboundDeleteRequest {
    public static final int $stable = 8;
    @SerializedName("ban")
    @NotNull
    private final String ban;
    @SerializedName("openInvoice")
    @Nullable
    private final ArrayList<String> openInvoice;
    @SerializedName("serviceId")
    @NotNull
    private final String serviceId;

    public OneNadOutboundDeleteRequest(@NotNull String serviceId, @NotNull String ban, @Nullable ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(ban, "ban");
        this.serviceId = serviceId;
        this.ban = ban;
        this.openInvoice = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneNadOutboundDeleteRequest copy$default(OneNadOutboundDeleteRequest oneNadOutboundDeleteRequest, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneNadOutboundDeleteRequest.serviceId;
        }
        if ((i & 2) != 0) {
            str2 = oneNadOutboundDeleteRequest.ban;
        }
        if ((i & 4) != 0) {
            arrayList = oneNadOutboundDeleteRequest.openInvoice;
        }
        return oneNadOutboundDeleteRequest.copy(str, str2, arrayList);
    }

    @NotNull
    public final String component1() {
        return this.serviceId;
    }

    @NotNull
    public final String component2() {
        return this.ban;
    }

    @Nullable
    public final ArrayList<String> component3() {
        return this.openInvoice;
    }

    @NotNull
    public final OneNadOutboundDeleteRequest copy(@NotNull String serviceId, @NotNull String ban, @Nullable ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(ban, "ban");
        return new OneNadOutboundDeleteRequest(serviceId, ban, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneNadOutboundDeleteRequest) {
            OneNadOutboundDeleteRequest oneNadOutboundDeleteRequest = (OneNadOutboundDeleteRequest) obj;
            return Intrinsics.areEqual(this.serviceId, oneNadOutboundDeleteRequest.serviceId) && Intrinsics.areEqual(this.ban, oneNadOutboundDeleteRequest.ban) && Intrinsics.areEqual(this.openInvoice, oneNadOutboundDeleteRequest.openInvoice);
        }
        return false;
    }

    @NotNull
    public final String getBan() {
        return this.ban;
    }

    @Nullable
    public final ArrayList<String> getOpenInvoice() {
        return this.openInvoice;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int hashCode = ((this.serviceId.hashCode() * 31) + this.ban.hashCode()) * 31;
        ArrayList<String> arrayList = this.openInvoice;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.serviceId;
        String str2 = this.ban;
        ArrayList<String> arrayList = this.openInvoice;
        return "OneNadOutboundDeleteRequest(serviceId=" + str + ", ban=" + str2 + ", openInvoice=" + arrayList + ")";
    }

    public /* synthetic */ OneNadOutboundDeleteRequest(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : arrayList);
    }
}