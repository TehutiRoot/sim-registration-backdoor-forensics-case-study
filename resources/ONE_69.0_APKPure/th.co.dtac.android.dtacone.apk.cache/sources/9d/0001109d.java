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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\b¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterRequest;", "Landroid/os/Parcelable;", "", "rtrCode", "msisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMsisdn", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterRequest */
/* loaded from: classes7.dex */
public final class CheckProfileRegisterRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CheckProfileRegisterRequest> CREATOR = new Creator();
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f82154a;
    @SerializedName("msisdn")
    @Nullable

    /* renamed from: b */
    private final String f82155b;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<CheckProfileRegisterRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckProfileRegisterRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckProfileRegisterRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CheckProfileRegisterRequest[] newArray(int i) {
            return new CheckProfileRegisterRequest[i];
        }
    }

    public CheckProfileRegisterRequest() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CheckProfileRegisterRequest copy$default(CheckProfileRegisterRequest checkProfileRegisterRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkProfileRegisterRequest.f82154a;
        }
        if ((i & 2) != 0) {
            str2 = checkProfileRegisterRequest.f82155b;
        }
        return checkProfileRegisterRequest.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f82154a;
    }

    @Nullable
    public final String component2() {
        return this.f82155b;
    }

    @NotNull
    public final CheckProfileRegisterRequest copy(@Nullable String str, @Nullable String str2) {
        return new CheckProfileRegisterRequest(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckProfileRegisterRequest) {
            CheckProfileRegisterRequest checkProfileRegisterRequest = (CheckProfileRegisterRequest) obj;
            return Intrinsics.areEqual(this.f82154a, checkProfileRegisterRequest.f82154a) && Intrinsics.areEqual(this.f82155b, checkProfileRegisterRequest.f82155b);
        }
        return false;
    }

    @Nullable
    public final String getMsisdn() {
        return this.f82155b;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82154a;
    }

    public int hashCode() {
        String str = this.f82154a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82155b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82154a;
        String str2 = this.f82155b;
        return "CheckProfileRegisterRequest(rtrCode=" + str + ", msisdn=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82154a);
        out.writeString(this.f82155b);
    }

    public CheckProfileRegisterRequest(@Nullable String str, @Nullable String str2) {
        this.f82154a = str;
        this.f82155b = str2;
    }

    public /* synthetic */ CheckProfileRegisterRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}