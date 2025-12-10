package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "Landroid/os/Parcelable;", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "defaultPackage", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "tabs", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneTabs;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;Ljava/util/List;)V", "getDefaultPackage", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "getTabs", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse */
/* loaded from: classes8.dex */
public final class OnePostpaidPackageSetResponse implements Parcelable {
    @SerializedName("default")
    @Nullable
    private final OnePostpaidPackageSet defaultPackage;
    @SerializedName("tabs")
    @Nullable
    private final List<OneTabs> tabs;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @JvmField
    @NotNull
    public static final Parcelable.Creator<OnePostpaidPackageSetResponse> CREATOR = new Parcelable.Creator<OnePostpaidPackageSetResponse>() { // from class: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidPackageSetResponse createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OnePostpaidPackageSetResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidPackageSetResponse[] newArray(int i) {
            return new OnePostpaidPackageSetResponse[i];
        }
    };

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OnePostpaidPackageSetResponse(@Nullable OnePostpaidPackageSet onePostpaidPackageSet, @Nullable List<OneTabs> list) {
        this.defaultPackage = onePostpaidPackageSet;
        this.tabs = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final OnePostpaidPackageSet getDefaultPackage() {
        return this.defaultPackage;
    }

    @Nullable
    public final List<OneTabs> getTabs() {
        return this.tabs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.defaultPackage, 0);
        dest.writeTypedList(this.tabs);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackageSetResponse(@NotNull Parcel source) {
        this((OnePostpaidPackageSet) source.readParcelable(OnePostpaidPackageSet.class.getClassLoader()), source.createTypedArrayList(OneTabs.CREATOR));
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
