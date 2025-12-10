package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/Properties;", "", "fEE", "", "tERM", "pOOLNAMES", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFEE", "()Ljava/lang/String;", "getPOOLNAMES", "getTERM", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.Properties */
/* loaded from: classes8.dex */
public final class Properties {
    public static final int $stable = 0;
    @SerializedName("FEE")
    @Nullable
    private final String fEE;
    @SerializedName("POOL_NAMES")
    @Nullable
    private final String pOOLNAMES;
    @SerializedName("TERM")
    @Nullable
    private final String tERM;

    public Properties() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Properties copy$default(Properties properties, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = properties.fEE;
        }
        if ((i & 2) != 0) {
            str2 = properties.tERM;
        }
        if ((i & 4) != 0) {
            str3 = properties.pOOLNAMES;
        }
        return properties.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.fEE;
    }

    @Nullable
    public final String component2() {
        return this.tERM;
    }

    @Nullable
    public final String component3() {
        return this.pOOLNAMES;
    }

    @NotNull
    public final Properties copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new Properties(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Properties) {
            Properties properties = (Properties) obj;
            return Intrinsics.areEqual(this.fEE, properties.fEE) && Intrinsics.areEqual(this.tERM, properties.tERM) && Intrinsics.areEqual(this.pOOLNAMES, properties.pOOLNAMES);
        }
        return false;
    }

    @Nullable
    public final String getFEE() {
        return this.fEE;
    }

    @Nullable
    public final String getPOOLNAMES() {
        return this.pOOLNAMES;
    }

    @Nullable
    public final String getTERM() {
        return this.tERM;
    }

    public int hashCode() {
        String str = this.fEE;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tERM;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pOOLNAMES;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.fEE;
        String str2 = this.tERM;
        String str3 = this.pOOLNAMES;
        return "Properties(fEE=" + str + ", tERM=" + str2 + ", pOOLNAMES=" + str3 + ")";
    }

    public Properties(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.fEE = str;
        this.tERM = str2;
        this.pOOLNAMES = str3;
    }

    public /* synthetic */ Properties(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
