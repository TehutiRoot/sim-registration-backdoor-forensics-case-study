package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bq\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003Ju\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010$\u001a\u00020%H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020%H\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u00060"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "rc", "", "propositionCode", "propositionInfo", "oc", "soc", "fee", "name", "description", FirebaseAnalytics.Param.TERM, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getFee", "getName", "getOc", "getPropositionCode", "getPropositionInfo", "getRc", "getSoc", "getTerm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem */
/* loaded from: classes8.dex */
public final class PropositionListItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("description")
    @Nullable
    private final String description;
    @SerializedName("fee")
    @Nullable
    private final String fee;
    @SerializedName("name")
    @Nullable
    private final String name;
    @SerializedName("oc")
    @Nullable

    /* renamed from: oc */
    private final String f85060oc;
    @SerializedName("propositionCode")
    @Nullable
    private final String propositionCode;
    @SerializedName("propositionInfo")
    @Nullable
    private final String propositionInfo;
    @SerializedName("rc")
    @Nullable

    /* renamed from: rc */
    private final String f85061rc;
    @SerializedName("soc")
    @Nullable
    private final String soc;
    @SerializedName(FirebaseAnalytics.Param.TERM)
    @Nullable
    private final String term;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/PropositionListItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.PropositionListItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PropositionListItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PropositionListItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PropositionListItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PropositionListItem[] newArray(int i) {
            return new PropositionListItem[i];
        }
    }

    public PropositionListItem() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    public final String component1() {
        return this.f85061rc;
    }

    @Nullable
    public final String component2() {
        return this.propositionCode;
    }

    @Nullable
    public final String component3() {
        return this.propositionInfo;
    }

    @Nullable
    public final String component4() {
        return this.f85060oc;
    }

    @Nullable
    public final String component5() {
        return this.soc;
    }

    @Nullable
    public final String component6() {
        return this.fee;
    }

    @Nullable
    public final String component7() {
        return this.name;
    }

    @Nullable
    public final String component8() {
        return this.description;
    }

    @Nullable
    public final String component9() {
        return this.term;
    }

    @NotNull
    public final PropositionListItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        return new PropositionListItem(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PropositionListItem) {
            PropositionListItem propositionListItem = (PropositionListItem) obj;
            return Intrinsics.areEqual(this.f85061rc, propositionListItem.f85061rc) && Intrinsics.areEqual(this.propositionCode, propositionListItem.propositionCode) && Intrinsics.areEqual(this.propositionInfo, propositionListItem.propositionInfo) && Intrinsics.areEqual(this.f85060oc, propositionListItem.f85060oc) && Intrinsics.areEqual(this.soc, propositionListItem.soc) && Intrinsics.areEqual(this.fee, propositionListItem.fee) && Intrinsics.areEqual(this.name, propositionListItem.name) && Intrinsics.areEqual(this.description, propositionListItem.description) && Intrinsics.areEqual(this.term, propositionListItem.term);
        }
        return false;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOc() {
        return this.f85060oc;
    }

    @Nullable
    public final String getPropositionCode() {
        return this.propositionCode;
    }

    @Nullable
    public final String getPropositionInfo() {
        return this.propositionInfo;
    }

    @Nullable
    public final String getRc() {
        return this.f85061rc;
    }

    @Nullable
    public final String getSoc() {
        return this.soc;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    public int hashCode() {
        String str = this.f85061rc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propositionCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propositionInfo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f85060oc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.soc;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fee;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.description;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.term;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f85061rc;
        String str2 = this.propositionCode;
        String str3 = this.propositionInfo;
        String str4 = this.f85060oc;
        String str5 = this.soc;
        String str6 = this.fee;
        String str7 = this.name;
        String str8 = this.description;
        String str9 = this.term;
        return "PropositionListItem(rc=" + str + ", propositionCode=" + str2 + ", propositionInfo=" + str3 + ", oc=" + str4 + ", soc=" + str5 + ", fee=" + str6 + ", name=" + str7 + ", description=" + str8 + ", term=" + str9 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.f85061rc);
        parcel.writeString(this.propositionCode);
        parcel.writeString(this.propositionInfo);
        parcel.writeString(this.f85060oc);
        parcel.writeString(this.soc);
        parcel.writeString(this.fee);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.term);
    }

    public PropositionListItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f85061rc = str;
        this.propositionCode = str2;
        this.propositionInfo = str3;
        this.f85060oc = str4;
        this.soc = str5;
        this.fee = str6;
        this.name = str7;
        this.description = str8;
        this.term = str9;
    }

    public /* synthetic */ PropositionListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PropositionListItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
