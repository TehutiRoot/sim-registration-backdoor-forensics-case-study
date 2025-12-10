package th.p047co.dtac.android.dtacone.model.withDevice.validateImei.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/GetCampaignResponse;", "Landroid/os/Parcelable;", "deviceType", "", "saleOrderTranId", "campaign", "", "Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/CampaignItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCampaign", "()Ljava/util/List;", "getDeviceType", "()Ljava/lang/String;", "getSaleOrderTranId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.validateImei.response.GetCampaignResponse */
/* loaded from: classes8.dex */
public final class GetCampaignResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<GetCampaignResponse> CREATOR = new Creator();
    @SerializedName("campaign")
    @Nullable
    private final List<CampaignItem> campaign;
    @SerializedName("deviceType")
    @Nullable
    private final String deviceType;
    @SerializedName("saleOrderTranId")
    @Nullable
    private final String saleOrderTranId;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.validateImei.response.GetCampaignResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<GetCampaignResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetCampaignResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(CampaignItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GetCampaignResponse(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GetCampaignResponse[] newArray(int i) {
            return new GetCampaignResponse[i];
        }
    }

    public GetCampaignResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCampaignResponse copy$default(GetCampaignResponse getCampaignResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCampaignResponse.deviceType;
        }
        if ((i & 2) != 0) {
            str2 = getCampaignResponse.saleOrderTranId;
        }
        if ((i & 4) != 0) {
            list = getCampaignResponse.campaign;
        }
        return getCampaignResponse.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.deviceType;
    }

    @Nullable
    public final String component2() {
        return this.saleOrderTranId;
    }

    @Nullable
    public final List<CampaignItem> component3() {
        return this.campaign;
    }

    @NotNull
    public final GetCampaignResponse copy(@Nullable String str, @Nullable String str2, @Nullable List<CampaignItem> list) {
        return new GetCampaignResponse(str, str2, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCampaignResponse) {
            GetCampaignResponse getCampaignResponse = (GetCampaignResponse) obj;
            return Intrinsics.areEqual(this.deviceType, getCampaignResponse.deviceType) && Intrinsics.areEqual(this.saleOrderTranId, getCampaignResponse.saleOrderTranId) && Intrinsics.areEqual(this.campaign, getCampaignResponse.campaign);
        }
        return false;
    }

    @Nullable
    public final List<CampaignItem> getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getSaleOrderTranId() {
        return this.saleOrderTranId;
    }

    public int hashCode() {
        String str = this.deviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.saleOrderTranId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<CampaignItem> list = this.campaign;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.saleOrderTranId;
        List<CampaignItem> list = this.campaign;
        return "GetCampaignResponse(deviceType=" + str + ", saleOrderTranId=" + str2 + ", campaign=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.deviceType);
        out.writeString(this.saleOrderTranId);
        List<CampaignItem> list = this.campaign;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (CampaignItem campaignItem : list) {
            campaignItem.writeToParcel(out, i);
        }
    }

    public GetCampaignResponse(@Nullable String str, @Nullable String str2, @Nullable List<CampaignItem> list) {
        this.deviceType = str;
        this.saleOrderTranId = str2;
        this.campaign = list;
    }

    public /* synthetic */ GetCampaignResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}