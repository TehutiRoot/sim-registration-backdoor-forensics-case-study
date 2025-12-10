package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageRequest;", "Landroid/os/Parcelable;", "", "subscriber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvRecommendPackageRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSubscriber", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageRequest */
/* loaded from: classes7.dex */
public final class OneStvRecommendPackageRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<OneStvRecommendPackageRequest> CREATOR = new Creator();
    @SerializedName("subscriber")
    @Nullable

    /* renamed from: a */
    private final String f82281a;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvRecommendPackageRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneStvRecommendPackageRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvRecommendPackageRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneStvRecommendPackageRequest(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvRecommendPackageRequest[] newArray(int i) {
            return new OneStvRecommendPackageRequest[i];
        }
    }

    public OneStvRecommendPackageRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ OneStvRecommendPackageRequest copy$default(OneStvRecommendPackageRequest oneStvRecommendPackageRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneStvRecommendPackageRequest.f82281a;
        }
        return oneStvRecommendPackageRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f82281a;
    }

    @NotNull
    public final OneStvRecommendPackageRequest copy(@Nullable String str) {
        return new OneStvRecommendPackageRequest(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OneStvRecommendPackageRequest) && Intrinsics.areEqual(this.f82281a, ((OneStvRecommendPackageRequest) obj).f82281a);
    }

    @Nullable
    public final String getSubscriber() {
        return this.f82281a;
    }

    public int hashCode() {
        String str = this.f82281a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f82281a;
        return "OneStvRecommendPackageRequest(subscriber=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82281a);
    }

    public OneStvRecommendPackageRequest(@Nullable String str) {
        this.f82281a = str;
    }

    public /* synthetic */ OneStvRecommendPackageRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}