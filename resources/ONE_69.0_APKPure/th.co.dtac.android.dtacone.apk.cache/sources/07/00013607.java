package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerResponse;", "Landroid/os/Parcelable;", "", "ownerCount", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerItemResponse;", "owners", "<init>", "(ILjava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getOwnerCount", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getOwners", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerResponse */
/* loaded from: classes10.dex */
public final class OneOwnerResponse implements Parcelable {
    @SerializedName("ownerCount")

    /* renamed from: a */
    private final int f93138a;
    @SerializedName("owners")
    @Nullable

    /* renamed from: b */
    private final List<OneOwnerItemResponse> f93139b;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerResponse$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneOwnerResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOwnerResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneOwnerResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneOwnerResponse[] newArray(int i) {
            return new OneOwnerResponse[i];
        }
    }

    public OneOwnerResponse(int i, @Nullable List<OneOwnerItemResponse> list) {
        this.f93138a = i;
        this.f93139b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOwnerResponse copy$default(OneOwnerResponse oneOwnerResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = oneOwnerResponse.f93138a;
        }
        if ((i2 & 2) != 0) {
            list = oneOwnerResponse.f93139b;
        }
        return oneOwnerResponse.copy(i, list);
    }

    public final int component1() {
        return this.f93138a;
    }

    @Nullable
    public final List<OneOwnerItemResponse> component2() {
        return this.f93139b;
    }

    @NotNull
    public final OneOwnerResponse copy(int i, @Nullable List<OneOwnerItemResponse> list) {
        return new OneOwnerResponse(i, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneOwnerResponse) {
            OneOwnerResponse oneOwnerResponse = (OneOwnerResponse) obj;
            return this.f93138a == oneOwnerResponse.f93138a && Intrinsics.areEqual(this.f93139b, oneOwnerResponse.f93139b);
        }
        return false;
    }

    public final int getOwnerCount() {
        return this.f93138a;
    }

    @Nullable
    public final List<OneOwnerItemResponse> getOwners() {
        return this.f93139b;
    }

    public int hashCode() {
        int i = this.f93138a * 31;
        List<OneOwnerItemResponse> list = this.f93139b;
        return i + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.f93138a;
        List<OneOwnerItemResponse> list = this.f93139b;
        return "OneOwnerResponse(ownerCount=" + i + ", owners=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.f93138a);
        parcel.writeTypedList(this.f93139b);
    }

    public /* synthetic */ OneOwnerResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneOwnerResponse(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.createTypedArrayList(OneOwnerItemResponse.CREATOR));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}