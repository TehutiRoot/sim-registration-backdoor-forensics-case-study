package th.p047co.dtac.android.dtacone.view.appOne.buyDol.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J4\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0013¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "Landroid/os/Parcelable;", "", "bankCode", "aliasBankName", "accountPayment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getBankCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAliasBankName", OperatorName.CURVE_TO, "getAccountPayment", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel */
/* loaded from: classes10.dex */
public final class OneDirectAccountListModel implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("bankCode")
    @Nullable

    /* renamed from: a */
    private final String f88532a;
    @SerializedName("aliasBankName")
    @Nullable

    /* renamed from: b */
    private final String f88533b;
    @SerializedName("accountPayment")
    @Nullable

    /* renamed from: c */
    private final String f88534c;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/OneDirectAccountListModel;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.model.OneDirectAccountListModel$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<OneDirectAccountListModel> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDirectAccountListModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneDirectAccountListModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OneDirectAccountListModel[] newArray(int i) {
            return new OneDirectAccountListModel[i];
        }
    }

    public OneDirectAccountListModel(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f88532a = str;
        this.f88533b = str2;
        this.f88534c = str3;
    }

    public static /* synthetic */ OneDirectAccountListModel copy$default(OneDirectAccountListModel oneDirectAccountListModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneDirectAccountListModel.f88532a;
        }
        if ((i & 2) != 0) {
            str2 = oneDirectAccountListModel.f88533b;
        }
        if ((i & 4) != 0) {
            str3 = oneDirectAccountListModel.f88534c;
        }
        return oneDirectAccountListModel.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.f88532a;
    }

    @Nullable
    public final String component2() {
        return this.f88533b;
    }

    @Nullable
    public final String component3() {
        return this.f88534c;
    }

    @NotNull
    public final OneDirectAccountListModel copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new OneDirectAccountListModel(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneDirectAccountListModel) {
            OneDirectAccountListModel oneDirectAccountListModel = (OneDirectAccountListModel) obj;
            return Intrinsics.areEqual(this.f88532a, oneDirectAccountListModel.f88532a) && Intrinsics.areEqual(this.f88533b, oneDirectAccountListModel.f88533b) && Intrinsics.areEqual(this.f88534c, oneDirectAccountListModel.f88534c);
        }
        return false;
    }

    @Nullable
    public final String getAccountPayment() {
        return this.f88534c;
    }

    @Nullable
    public final String getAliasBankName() {
        return this.f88533b;
    }

    @Nullable
    public final String getBankCode() {
        return this.f88532a;
    }

    public int hashCode() {
        String str = this.f88532a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f88533b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88534c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f88532a;
        String str2 = this.f88533b;
        String str3 = this.f88534c;
        return "OneDirectAccountListModel(bankCode=" + str + ", aliasBankName=" + str2 + ", accountPayment=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f88532a);
        parcel.writeString(this.f88533b);
        parcel.writeString(this.f88534c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneDirectAccountListModel(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}