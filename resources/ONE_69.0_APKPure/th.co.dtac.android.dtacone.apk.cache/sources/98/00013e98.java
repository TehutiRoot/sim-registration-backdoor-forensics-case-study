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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b\t\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b¨\u0006/"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateContactPersonResponse;", "Landroid/os/Parcelable;", "", "isFirstNameEditable", "", "firstName", "lastName", "isLastNameEditable", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "isPhoneNumberEditable", "idCard", "isIdCardNumberEditable", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", OperatorName.CURVE_TO, "getLastName", "setLastName", "d", "e", "getPhoneNumber", "setPhoneNumber", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "getIdCard", "setIdCard", OperatorName.CLOSE_PATH, "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateContactPersonResponse */
/* loaded from: classes10.dex */
public final class OneRetailerProfileUpdateContactPersonResponse implements Parcelable {
    @SerializedName("isFirstNameEditable")

    /* renamed from: a */
    private final boolean f96965a;
    @SerializedName("firstName")
    @Nullable

    /* renamed from: b */
    private String f96966b;
    @SerializedName("lastName")
    @Nullable

    /* renamed from: c */
    private String f96967c;
    @SerializedName("isLastNameEditable")

    /* renamed from: d */
    private final boolean f96968d;
    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)
    @Nullable

    /* renamed from: e */
    private String f96969e;
    @SerializedName("isPhoneNumberEditable")

    /* renamed from: f */
    private final boolean f96970f;
    @SerializedName("idCardNumber")
    @Nullable

    /* renamed from: g */
    private String f96971g;
    @SerializedName("isIdCardNumberEditable")

    /* renamed from: h */
    private final boolean f96972h;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<OneRetailerProfileUpdateContactPersonResponse> CREATOR = new Parcelable.Creator<OneRetailerProfileUpdateContactPersonResponse>() { // from class: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateContactPersonResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateContactPersonResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OneRetailerProfileUpdateContactPersonResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneRetailerProfileUpdateContactPersonResponse[] newArray(int i) {
            return new OneRetailerProfileUpdateContactPersonResponse[i];
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateContactPersonResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/retailerProfileUpdate/model/response/OneRetailerProfileUpdateContactPersonResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.retailerProfileUpdate.model.response.OneRetailerProfileUpdateContactPersonResponse$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OneRetailerProfileUpdateContactPersonResponse(boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, boolean z3, @Nullable String str4, boolean z4) {
        this.f96965a = z;
        this.f96966b = str;
        this.f96967c = str2;
        this.f96968d = z2;
        this.f96969e = str3;
        this.f96970f = z3;
        this.f96971g = str4;
        this.f96972h = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getFirstName() {
        return this.f96966b;
    }

    @Nullable
    public final String getIdCard() {
        return this.f96971g;
    }

    @Nullable
    public final String getLastName() {
        return this.f96967c;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.f96969e;
    }

    public final boolean isFirstNameEditable() {
        return this.f96965a;
    }

    public final boolean isIdCardNumberEditable() {
        return this.f96972h;
    }

    public final boolean isLastNameEditable() {
        return this.f96968d;
    }

    public final boolean isPhoneNumberEditable() {
        return this.f96970f;
    }

    public final void setFirstName(@Nullable String str) {
        this.f96966b = str;
    }

    public final void setIdCard(@Nullable String str) {
        this.f96971g = str;
    }

    public final void setLastName(@Nullable String str) {
        this.f96967c = str;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.f96969e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f96965a ? 1 : 0);
        dest.writeString(this.f96966b);
        dest.writeString(this.f96967c);
        dest.writeInt(this.f96968d ? 1 : 0);
        dest.writeString(this.f96969e);
        dest.writeInt(this.f96970f ? 1 : 0);
        dest.writeString(this.f96971g);
        dest.writeInt(this.f96972h ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneRetailerProfileUpdateContactPersonResponse(@NotNull Parcel source) {
        this(1 == source.readInt(), source.readString(), source.readString(), 1 == source.readInt(), source.readString(), 1 == source.readInt(), source.readString(), 1 == source.readInt());
        Intrinsics.checkNotNullParameter(source, "source");
    }
}