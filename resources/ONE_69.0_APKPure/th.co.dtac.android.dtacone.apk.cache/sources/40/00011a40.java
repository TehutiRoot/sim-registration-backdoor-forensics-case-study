package th.p047co.dtac.android.dtacone.model.appOne.common.true_company.common_package;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pRICEPLANTYPE", "", "pPAUTH", "pPGROUP", "tRSPECIALOFFERIND", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPPAUTH", "()Ljava/lang/String;", "getPPGROUP", "getPRICEPLANTYPE", "getTRSPECIALOFFERIND", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.common_package.Properties */
/* loaded from: classes8.dex */
public final class Properties implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("PP_AUTH")
    @Nullable
    private final String pPAUTH;
    @SerializedName("PP_GROUP")
    @Nullable
    private final String pPGROUP;
    @SerializedName("PRICEPLAN_TYPE")
    @Nullable
    private final String pRICEPLANTYPE;
    @SerializedName("TR_SPECIAL_OFFER_IND")
    @Nullable
    private final String tRSPECIALOFFERIND;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/common/true_company/common_package/Properties;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.common.true_company.common_package.Properties$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<Properties> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Properties createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Properties(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Properties[] newArray(int i) {
            return new Properties[i];
        }
    }

    public Properties() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Properties copy$default(Properties properties, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = properties.pRICEPLANTYPE;
        }
        if ((i & 2) != 0) {
            str2 = properties.pPAUTH;
        }
        if ((i & 4) != 0) {
            str3 = properties.pPGROUP;
        }
        if ((i & 8) != 0) {
            str4 = properties.tRSPECIALOFFERIND;
        }
        return properties.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.pRICEPLANTYPE;
    }

    @Nullable
    public final String component2() {
        return this.pPAUTH;
    }

    @Nullable
    public final String component3() {
        return this.pPGROUP;
    }

    @Nullable
    public final String component4() {
        return this.tRSPECIALOFFERIND;
    }

    @NotNull
    public final Properties copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new Properties(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Properties) {
            Properties properties = (Properties) obj;
            return Intrinsics.areEqual(this.pRICEPLANTYPE, properties.pRICEPLANTYPE) && Intrinsics.areEqual(this.pPAUTH, properties.pPAUTH) && Intrinsics.areEqual(this.pPGROUP, properties.pPGROUP) && Intrinsics.areEqual(this.tRSPECIALOFFERIND, properties.tRSPECIALOFFERIND);
        }
        return false;
    }

    @Nullable
    public final String getPPAUTH() {
        return this.pPAUTH;
    }

    @Nullable
    public final String getPPGROUP() {
        return this.pPGROUP;
    }

    @Nullable
    public final String getPRICEPLANTYPE() {
        return this.pRICEPLANTYPE;
    }

    @Nullable
    public final String getTRSPECIALOFFERIND() {
        return this.tRSPECIALOFFERIND;
    }

    public int hashCode() {
        String str = this.pRICEPLANTYPE;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pPAUTH;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pPGROUP;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tRSPECIALOFFERIND;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pRICEPLANTYPE;
        String str2 = this.pPAUTH;
        String str3 = this.pPGROUP;
        String str4 = this.tRSPECIALOFFERIND;
        return "Properties(pRICEPLANTYPE=" + str + ", pPAUTH=" + str2 + ", pPGROUP=" + str3 + ", tRSPECIALOFFERIND=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.pRICEPLANTYPE);
        parcel.writeString(this.pPAUTH);
        parcel.writeString(this.pPGROUP);
        parcel.writeString(this.tRSPECIALOFFERIND);
    }

    public Properties(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.pRICEPLANTYPE = str;
        this.pPAUTH = str2;
        this.pPGROUP = str3;
        this.tRSPECIALOFFERIND = str4;
    }

    public /* synthetic */ Properties(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Properties(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}