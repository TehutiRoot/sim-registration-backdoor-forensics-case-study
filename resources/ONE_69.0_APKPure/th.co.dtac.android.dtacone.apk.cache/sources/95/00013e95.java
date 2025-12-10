package th.p047co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateCommissionInformationResponse;", "Landroid/os/Parcelable;", "", "type", "bankAccountNumber", "bankName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getType", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBankAccountNumber", OperatorName.CURVE_TO, "getBankName", "d", "getPhoneNumber", "setPhoneNumber", "(Ljava/lang/String;)V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateCommissionInformationResponse */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateCommissionInformationResponse implements Parcelable {
    @SerializedName("type")
    @Nullable

    /* renamed from: a */
    private final String f96961a;
    @SerializedName("bankAccountNumber")
    @Nullable

    /* renamed from: b */
    private final String f96962b;
    @SerializedName("bankName")
    @Nullable

    /* renamed from: c */
    private final String f96963c;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @Nullable

    /* renamed from: d */
    private String f96964d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<OneRetailerProfileUpdateCommissionInformationResponse> CREATOR = new Parcelable.Creator<OneRetailerProfileUpdateCommissionInformationResponse>() { // from class: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateCommissionInformationResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateCommissionInformationResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OneRetailerProfileUpdateCommissionInformationResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateCommissionInformationResponse[] newArray(int i) {
            return new OneRetailerProfileUpdateCommissionInformationResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateCommissionInformationResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateCommissionInformationResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateCommissionInformationResponse$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OneRetailerProfileUpdateCommissionInformationResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f96961a = str;
        this.f96962b = str2;
        this.f96963c = str3;
        this.f96964d = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getBankAccountNumber() {
        return this.f96962b;
    }

    @Nullable
    public final String getBankName() {
        return this.f96963c;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.f96964d;
    }

    @Nullable
    public final String getType() {
        return this.f96961a;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.f96964d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96961a);
        dest.writeString(this.f96962b);
        dest.writeString(this.f96963c);
        dest.writeString(this.f96964d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateCommissionInformationResponse(@NotNull Parcel source) {
        this(source.readString(), source.readString(), source.readString(), source.readString());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}