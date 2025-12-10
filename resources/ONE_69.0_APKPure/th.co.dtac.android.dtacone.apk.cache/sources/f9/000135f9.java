package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerLastTransaction;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/LastTransactionBodyModel;", "Landroid/os/Parcelable;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;", "transaction", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;)Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/LastTransactionBodyModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerLastTransaction;", "getTransaction", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.LastTransactionBodyModel */
/* loaded from: classes10.dex */
public final class LastTransactionBodyModel implements Parcelable {

    /* renamed from: a */
    public final OneOwnerLastTransaction f93100a;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/LastTransactionBodyModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/LastTransactionBodyModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/LastTransactionBodyModel;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.model.LastTransactionBodyModel$CREATOR */
    /* loaded from: classes10.dex */
    public static final class CREATOR implements Parcelable.Creator<LastTransactionBodyModel> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public LastTransactionBodyModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LastTransactionBodyModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public LastTransactionBodyModel[] newArray(int i) {
            return new LastTransactionBodyModel[i];
        }
    }

    public LastTransactionBodyModel(@Nullable OneOwnerLastTransaction oneOwnerLastTransaction) {
        this.f93100a = oneOwnerLastTransaction;
    }

    public static /* synthetic */ LastTransactionBodyModel copy$default(LastTransactionBodyModel lastTransactionBodyModel, OneOwnerLastTransaction oneOwnerLastTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            oneOwnerLastTransaction = lastTransactionBodyModel.f93100a;
        }
        return lastTransactionBodyModel.copy(oneOwnerLastTransaction);
    }

    @Nullable
    public final OneOwnerLastTransaction component1() {
        return this.f93100a;
    }

    @NotNull
    public final LastTransactionBodyModel copy(@Nullable OneOwnerLastTransaction oneOwnerLastTransaction) {
        return new LastTransactionBodyModel(oneOwnerLastTransaction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LastTransactionBodyModel) && Intrinsics.areEqual(this.f93100a, ((LastTransactionBodyModel) obj).f93100a);
    }

    @Nullable
    public final OneOwnerLastTransaction getTransaction() {
        return this.f93100a;
    }

    public int hashCode() {
        OneOwnerLastTransaction oneOwnerLastTransaction = this.f93100a;
        if (oneOwnerLastTransaction == null) {
            return 0;
        }
        return oneOwnerLastTransaction.hashCode();
    }

    @NotNull
    public String toString() {
        OneOwnerLastTransaction oneOwnerLastTransaction = this.f93100a;
        return "LastTransactionBodyModel(transaction=" + oneOwnerLastTransaction + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.f93100a, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LastTransactionBodyModel(@NotNull Parcel parcel) {
        this((OneOwnerLastTransaction) parcel.readParcelable(OneOwnerLastTransaction.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}