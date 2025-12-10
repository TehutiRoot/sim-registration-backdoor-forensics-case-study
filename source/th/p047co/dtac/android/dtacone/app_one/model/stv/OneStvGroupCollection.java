package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupCollection;", "Landroid/os/Parcelable;", "", "packageType", "name", "type", "", "descriptions", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "packages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPackageType", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getName", OperatorName.CURVE_TO, "getType", "d", "[Ljava/lang/String;", "getDescriptions", "()[Ljava/lang/String;", "e", "Ljava/util/List;", "getPackages", "()Ljava/util/List;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvGroupCollection */
/* loaded from: classes7.dex */
public final class OneStvGroupCollection implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneStvGroupCollection> CREATOR = new Creator();
    @SerializedName("packageType")
    @Nullable

    /* renamed from: a */
    private final String f82140a;
    @SerializedName("name")
    @Nullable

    /* renamed from: b */
    private final String f82141b;
    @SerializedName("type")
    @Nullable

    /* renamed from: c */
    private final String f82142c;
    @SerializedName("descriptions")
    @NotNull

    /* renamed from: d */
    private final String[] f82143d;
    @SerializedName("packages")
    @Nullable

    /* renamed from: e */
    private final List<OneStvPackageCollection> f82144e;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneStvGroupCollection$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneStvGroupCollection> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvGroupCollection createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String[] createStringArray = parcel.createStringArray();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(OneStvPackageCollection.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OneStvGroupCollection(readString, readString2, readString3, createStringArray, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneStvGroupCollection[] newArray(int i) {
            return new OneStvGroupCollection[i];
        }
    }

    public OneStvGroupCollection() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String[] getDescriptions() {
        return this.f82143d;
    }

    @Nullable
    public final String getName() {
        return this.f82141b;
    }

    @Nullable
    public final String getPackageType() {
        return this.f82140a;
    }

    @Nullable
    public final List<OneStvPackageCollection> getPackages() {
        return this.f82144e;
    }

    @Nullable
    public final String getType() {
        return this.f82142c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82140a);
        out.writeString(this.f82141b);
        out.writeString(this.f82142c);
        out.writeStringArray(this.f82143d);
        List<OneStvPackageCollection> list = this.f82144e;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (OneStvPackageCollection oneStvPackageCollection : list) {
            oneStvPackageCollection.writeToParcel(out, i);
        }
    }

    public OneStvGroupCollection(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String[] descriptions, @Nullable List<OneStvPackageCollection> list) {
        Intrinsics.checkNotNullParameter(descriptions, "descriptions");
        this.f82140a = str;
        this.f82141b = str2;
        this.f82142c = str3;
        this.f82143d = descriptions;
        this.f82144e = list;
    }

    public /* synthetic */ OneStvGroupCollection(String str, String str2, String str3, String[] strArr, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? new String[0] : strArr, (i & 16) != 0 ? null : list);
    }
}
