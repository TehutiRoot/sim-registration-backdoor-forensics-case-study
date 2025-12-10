package th.p047co.dtac.android.dtacone.app_one.model.registration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\b¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerRequest;", "Landroid/os/Parcelable;", "", "rtrCode", "msisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/ListSIMRetailerRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMsisdn", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerRequest */
/* loaded from: classes7.dex */
public final class ListSIMRetailerRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<ListSIMRetailerRequest> CREATOR = new Creator();
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f82073a;
    @SerializedName("msisdn")
    @Nullable

    /* renamed from: b */
    private final String f82074b;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ListSIMRetailerRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListSIMRetailerRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ListSIMRetailerRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ListSIMRetailerRequest[] newArray(int i) {
            return new ListSIMRetailerRequest[i];
        }
    }

    public ListSIMRetailerRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ListSIMRetailerRequest copy$default(ListSIMRetailerRequest listSIMRetailerRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listSIMRetailerRequest.f82073a;
        }
        if ((i & 2) != 0) {
            str2 = listSIMRetailerRequest.f82074b;
        }
        return listSIMRetailerRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82073a;
    }

    @Nullable
    public final String component2() {
        return this.f82074b;
    }

    @NotNull
    public final ListSIMRetailerRequest copy(@Nullable String str, @Nullable String str2) {
        return new ListSIMRetailerRequest(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListSIMRetailerRequest) {
            ListSIMRetailerRequest listSIMRetailerRequest = (ListSIMRetailerRequest) obj;
            return Intrinsics.areEqual(this.f82073a, listSIMRetailerRequest.f82073a) && Intrinsics.areEqual(this.f82074b, listSIMRetailerRequest.f82074b);
        }
        return false;
    }

    @Nullable
    public final String getMsisdn() {
        return this.f82074b;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82073a;
    }

    public int hashCode() {
        String str = this.f82073a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82074b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82073a;
        String str2 = this.f82074b;
        return "ListSIMRetailerRequest(rtrCode=" + str + ", msisdn=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82073a);
        out.writeString(this.f82074b);
    }

    public ListSIMRetailerRequest(@Nullable String str, @Nullable String str2) {
        this.f82073a = str;
        this.f82074b = str2;
    }

    public /* synthetic */ ListSIMRetailerRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
