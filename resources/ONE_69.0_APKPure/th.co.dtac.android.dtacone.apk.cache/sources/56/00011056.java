package th.p047co.dtac.android.dtacone.app_one.model.forgotPassword;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\t¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordRequest;", "Landroid/os/Parcelable;", "", "userId", HintConstants.AUTOFILL_HINT_PASSWORD, "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/forgotPassword/ForgotPasswordRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getUserId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getPassword", OperatorName.CURVE_TO, "getEvent", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordRequest */
/* loaded from: classes7.dex */
public final class ForgotPasswordRequest implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<ForgotPasswordRequest> CREATOR = new Creator();
    @SerializedName("userId")
    @Nullable

    /* renamed from: a */
    private final String f81783a;
    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    @Nullable

    /* renamed from: b */
    private final String f81784b;
    @SerializedName("event")
    @Nullable

    /* renamed from: c */
    private final String f81785c;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.forgotPassword.ForgotPasswordRequest$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ForgotPasswordRequest> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ForgotPasswordRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ForgotPasswordRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ForgotPasswordRequest[] newArray(int i) {
            return new ForgotPasswordRequest[i];
        }
    }

    public ForgotPasswordRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ForgotPasswordRequest copy$default(ForgotPasswordRequest forgotPasswordRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = forgotPasswordRequest.f81783a;
        }
        if ((i & 2) != 0) {
            str2 = forgotPasswordRequest.f81784b;
        }
        if ((i & 4) != 0) {
            str3 = forgotPasswordRequest.f81785c;
        }
        return forgotPasswordRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f81783a;
    }

    @Nullable
    public final String component2() {
        return this.f81784b;
    }

    @Nullable
    public final String component3() {
        return this.f81785c;
    }

    @NotNull
    public final ForgotPasswordRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new ForgotPasswordRequest(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ForgotPasswordRequest) {
            ForgotPasswordRequest forgotPasswordRequest = (ForgotPasswordRequest) obj;
            return Intrinsics.areEqual(this.f81783a, forgotPasswordRequest.f81783a) && Intrinsics.areEqual(this.f81784b, forgotPasswordRequest.f81784b) && Intrinsics.areEqual(this.f81785c, forgotPasswordRequest.f81785c);
        }
        return false;
    }

    @Nullable
    public final String getEvent() {
        return this.f81785c;
    }

    @Nullable
    public final String getPassword() {
        return this.f81784b;
    }

    @Nullable
    public final String getUserId() {
        return this.f81783a;
    }

    public int hashCode() {
        String str = this.f81783a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81784b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81785c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81783a;
        String str2 = this.f81784b;
        String str3 = this.f81785c;
        return "ForgotPasswordRequest(userId=" + str + ", password=" + str2 + ", event=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f81783a);
        out.writeString(this.f81784b);
        out.writeString(this.f81785c);
    }

    public ForgotPasswordRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f81783a = str;
        this.f81784b = str2;
        this.f81785c = str3;
    }

    public /* synthetic */ ForgotPasswordRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}