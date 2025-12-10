package th.p047co.dtac.android.dtacone.app_one.model.stv;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJp\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u000f¨\u0006:"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "Landroid/os/Parcelable;", "", "systemMessage", "code", "codeType", "responseDateTime", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse$DataItem;", "data", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Ljava/util/List;", "getData", OperatorName.FILL_NON_ZERO, "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "DataItem", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse */
/* loaded from: classes7.dex */
public final class OneCurrentPackagesResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<OneCurrentPackagesResponse> CREATOR = new Creator();
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82114a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82115b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82116c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82117d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final List<DataItem> f82118e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82119f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82120g;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse$Creator */
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<OneCurrentPackagesResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneCurrentPackagesResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(DataItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OneCurrentPackagesResponse(readString, readString2, readString3, readString4, arrayList, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OneCurrentPackagesResponse[] newArray(int i) {
            return new OneCurrentPackagesResponse[i];
        }
    }

    @StabilityInferred(parameters = 0)
    @Parcelize
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u000f¨\u0006+"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse$DataItem;", "Landroid/os/Parcelable;", "", "beginDate", "endDate", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "remaining", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/app_one/model/stv/OneCurrentPackagesResponse$DataItem;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getBeginDate", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getEndDate", OperatorName.CURVE_TO, "getPackageName", "d", "Ljava/lang/Integer;", "getRemaining", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse$DataItem */
    /* loaded from: classes7.dex */
    public static final class DataItem implements Parcelable {
        public static final int $stable = 0;
        @NotNull
        public static final Parcelable.Creator<DataItem> CREATOR = new Creator();
        @SerializedName("beginDate")
        @Nullable

        /* renamed from: a */
        private final String f82121a;
        @SerializedName("endDate")
        @Nullable

        /* renamed from: b */
        private final String f82122b;
        @SerializedName(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME)
        @Nullable

        /* renamed from: c */
        private final String f82123c;
        @SerializedName("remaining")
        @Nullable

        /* renamed from: d */
        private final Integer f82124d;

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.OneCurrentPackagesResponse$DataItem$Creator */
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<DataItem> {
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DataItem createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public final DataItem[] newArray(int i) {
                return new DataItem[i];
            }
        }

        public DataItem() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ DataItem copy$default(DataItem dataItem, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dataItem.f82121a;
            }
            if ((i & 2) != 0) {
                str2 = dataItem.f82122b;
            }
            if ((i & 4) != 0) {
                str3 = dataItem.f82123c;
            }
            if ((i & 8) != 0) {
                num = dataItem.f82124d;
            }
            return dataItem.copy(str, str2, str3, num);
        }

        @Nullable
        public final String component1() {
            return this.f82121a;
        }

        @Nullable
        public final String component2() {
            return this.f82122b;
        }

        @Nullable
        public final String component3() {
            return this.f82123c;
        }

        @Nullable
        public final Integer component4() {
            return this.f82124d;
        }

        @NotNull
        public final DataItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            return new DataItem(str, str2, str3, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DataItem) {
                DataItem dataItem = (DataItem) obj;
                return Intrinsics.areEqual(this.f82121a, dataItem.f82121a) && Intrinsics.areEqual(this.f82122b, dataItem.f82122b) && Intrinsics.areEqual(this.f82123c, dataItem.f82123c) && Intrinsics.areEqual(this.f82124d, dataItem.f82124d);
            }
            return false;
        }

        @Nullable
        public final String getBeginDate() {
            return this.f82121a;
        }

        @Nullable
        public final String getEndDate() {
            return this.f82122b;
        }

        @Nullable
        public final String getPackageName() {
            return this.f82123c;
        }

        @Nullable
        public final Integer getRemaining() {
            return this.f82124d;
        }

        public int hashCode() {
            String str = this.f82121a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f82122b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82123c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f82124d;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f82121a;
            String str2 = this.f82122b;
            String str3 = this.f82123c;
            Integer num = this.f82124d;
            return "DataItem(beginDate=" + str + ", endDate=" + str2 + ", packageName=" + str3 + ", remaining=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f82121a);
            out.writeString(this.f82122b);
            out.writeString(this.f82123c);
            Integer num = this.f82124d;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }

        public DataItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
            this.f82121a = str;
            this.f82122b = str2;
            this.f82123c = str3;
            this.f82124d = num;
        }

        public /* synthetic */ DataItem(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
        }
    }

    public OneCurrentPackagesResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneCurrentPackagesResponse copy$default(OneCurrentPackagesResponse oneCurrentPackagesResponse, String str, String str2, String str3, String str4, List list, List list2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCurrentPackagesResponse.f82114a;
        }
        if ((i & 2) != 0) {
            str2 = oneCurrentPackagesResponse.f82115b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneCurrentPackagesResponse.f82116c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneCurrentPackagesResponse.f82117d;
        }
        String str8 = str4;
        List<DataItem> list3 = list;
        if ((i & 16) != 0) {
            list3 = oneCurrentPackagesResponse.f82118e;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 32) != 0) {
            list5 = oneCurrentPackagesResponse.f82119f;
        }
        List list6 = list5;
        if ((i & 64) != 0) {
            str5 = oneCurrentPackagesResponse.f82120g;
        }
        return oneCurrentPackagesResponse.copy(str, str6, str7, str8, list4, list6, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82114a;
    }

    @Nullable
    public final String component2() {
        return this.f82115b;
    }

    @Nullable
    public final String component3() {
        return this.f82116c;
    }

    @Nullable
    public final String component4() {
        return this.f82117d;
    }

    @Nullable
    public final List<DataItem> component5() {
        return this.f82118e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82119f;
    }

    @Nullable
    public final String component7() {
        return this.f82120g;
    }

    @NotNull
    public final OneCurrentPackagesResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DataItem> list, @Nullable List<String> list2, @Nullable String str5) {
        return new OneCurrentPackagesResponse(str, str2, str3, str4, list, list2, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCurrentPackagesResponse) {
            OneCurrentPackagesResponse oneCurrentPackagesResponse = (OneCurrentPackagesResponse) obj;
            return Intrinsics.areEqual(this.f82114a, oneCurrentPackagesResponse.f82114a) && Intrinsics.areEqual(this.f82115b, oneCurrentPackagesResponse.f82115b) && Intrinsics.areEqual(this.f82116c, oneCurrentPackagesResponse.f82116c) && Intrinsics.areEqual(this.f82117d, oneCurrentPackagesResponse.f82117d) && Intrinsics.areEqual(this.f82118e, oneCurrentPackagesResponse.f82118e) && Intrinsics.areEqual(this.f82119f, oneCurrentPackagesResponse.f82119f) && Intrinsics.areEqual(this.f82120g, oneCurrentPackagesResponse.f82120g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82115b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82116c;
    }

    @Nullable
    public final List<DataItem> getData() {
        return this.f82118e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82120g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82119f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82117d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82114a;
    }

    public int hashCode() {
        String str = this.f82114a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82115b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82116c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82117d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DataItem> list = this.f82118e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f82119f;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.f82120g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82114a;
        String str2 = this.f82115b;
        String str3 = this.f82116c;
        String str4 = this.f82117d;
        List<DataItem> list = this.f82118e;
        List<String> list2 = this.f82119f;
        String str5 = this.f82120g;
        return "OneCurrentPackagesResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + list + ", replaceMessage=" + list2 + ", desc=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f82114a);
        out.writeString(this.f82115b);
        out.writeString(this.f82116c);
        out.writeString(this.f82117d);
        List<DataItem> list = this.f82118e;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (DataItem dataItem : list) {
                dataItem.writeToParcel(out, i);
            }
        }
        out.writeStringList(this.f82119f);
        out.writeString(this.f82120g);
    }

    public OneCurrentPackagesResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<DataItem> list, @Nullable List<String> list2, @Nullable String str5) {
        this.f82114a = str;
        this.f82115b = str2;
        this.f82116c = str3;
        this.f82117d = str4;
        this.f82118e = list;
        this.f82119f = list2;
        this.f82120g = str5;
    }

    public /* synthetic */ OneCurrentPackagesResponse(String str, String str2, String str3, String str4, List list, List list2, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str5);
    }
}
