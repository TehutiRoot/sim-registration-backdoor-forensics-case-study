package th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankDataResponse;", "Landroid/os/Parcelable;", "", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankListResponse;", "bankList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OneBuyDolBankDataResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getBankList", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankDataResponse */
/* loaded from: classes10.dex */
public final class OneBuyDolBankDataResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneBuyDolBankDataResponse> CREATOR = new Creator();
    @SerializedName("listBank")
    @NotNull

    /* renamed from: a */
    private final List<OneBuyDolBankListResponse> f88571a;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.response.OneBuyDolBankDataResponse$Creator */
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<OneBuyDolBankDataResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneBuyDolBankDataResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(OneBuyDolBankListResponse.CREATOR.createFromParcel(parcel));
            }
            return new OneBuyDolBankDataResponse(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneBuyDolBankDataResponse[] newArray(int i) {
            return new OneBuyDolBankDataResponse[i];
        }
    }

    public OneBuyDolBankDataResponse(@NotNull List<OneBuyDolBankListResponse> bankList) {
        Intrinsics.checkNotNullParameter(bankList, "bankList");
        this.f88571a = bankList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneBuyDolBankDataResponse copy$default(OneBuyDolBankDataResponse oneBuyDolBankDataResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneBuyDolBankDataResponse.f88571a;
        }
        return oneBuyDolBankDataResponse.copy(list);
    }

    @NotNull
    public final List<OneBuyDolBankListResponse> component1() {
        return this.f88571a;
    }

    @NotNull
    public final OneBuyDolBankDataResponse copy(@NotNull List<OneBuyDolBankListResponse> bankList) {
        Intrinsics.checkNotNullParameter(bankList, "bankList");
        return new OneBuyDolBankDataResponse(bankList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneBuyDolBankDataResponse) && Intrinsics.areEqual(this.f88571a, ((OneBuyDolBankDataResponse) obj).f88571a);
    }

    @NotNull
    public final List<OneBuyDolBankListResponse> getBankList() {
        return this.f88571a;
    }

    public int hashCode() {
        return this.f88571a.hashCode();
    }

    @NotNull
    public String toString() {
        List<OneBuyDolBankListResponse> list = this.f88571a;
        return "OneBuyDolBankDataResponse(bankList=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<OneBuyDolBankListResponse> list = this.f88571a;
        out.writeInt(list.size());
        for (OneBuyDolBankListResponse oneBuyDolBankListResponse : list) {
            oneBuyDolBankListResponse.writeToParcel(out, i);
        }
    }
}