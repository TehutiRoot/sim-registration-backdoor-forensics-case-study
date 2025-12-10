package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/Blocking;", "", "codeSequence", "", "createDateTime", "descriptionEnglish", "descriptionThai", "total", "", "transactiontype", "userType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCodeSequence", "()Ljava/lang/String;", "getCreateDateTime", "getDescriptionEnglish", "getDescriptionThai", "getTotal", "()I", "getTransactiontype", "getUserType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.Blocking */
/* loaded from: classes8.dex */
public final class Blocking {
    public static final int $stable = 0;
    @SerializedName("codeSequence")
    @NotNull
    private final String codeSequence;
    @SerializedName("createDateTime")
    @NotNull
    private final String createDateTime;
    @SerializedName("descriptionEnglish")
    @NotNull
    private final String descriptionEnglish;
    @SerializedName("descriptionThai")
    @NotNull
    private final String descriptionThai;
    @SerializedName("total")
    private final int total;
    @SerializedName("transactiontype")
    @NotNull
    private final String transactiontype;
    @SerializedName("userType")
    @NotNull
    private final String userType;

    public Blocking(@NotNull String codeSequence, @NotNull String createDateTime, @NotNull String descriptionEnglish, @NotNull String descriptionThai, int i, @NotNull String transactiontype, @NotNull String userType) {
        Intrinsics.checkNotNullParameter(codeSequence, "codeSequence");
        Intrinsics.checkNotNullParameter(createDateTime, "createDateTime");
        Intrinsics.checkNotNullParameter(descriptionEnglish, "descriptionEnglish");
        Intrinsics.checkNotNullParameter(descriptionThai, "descriptionThai");
        Intrinsics.checkNotNullParameter(transactiontype, "transactiontype");
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.codeSequence = codeSequence;
        this.createDateTime = createDateTime;
        this.descriptionEnglish = descriptionEnglish;
        this.descriptionThai = descriptionThai;
        this.total = i;
        this.transactiontype = transactiontype;
        this.userType = userType;
    }

    public static /* synthetic */ Blocking copy$default(Blocking blocking, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = blocking.codeSequence;
        }
        if ((i2 & 2) != 0) {
            str2 = blocking.createDateTime;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = blocking.descriptionEnglish;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = blocking.descriptionThai;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            i = blocking.total;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = blocking.transactiontype;
        }
        String str10 = str5;
        if ((i2 & 64) != 0) {
            str6 = blocking.userType;
        }
        return blocking.copy(str, str7, str8, str9, i3, str10, str6);
    }

    @NotNull
    public final String component1() {
        return this.codeSequence;
    }

    @NotNull
    public final String component2() {
        return this.createDateTime;
    }

    @NotNull
    public final String component3() {
        return this.descriptionEnglish;
    }

    @NotNull
    public final String component4() {
        return this.descriptionThai;
    }

    public final int component5() {
        return this.total;
    }

    @NotNull
    public final String component6() {
        return this.transactiontype;
    }

    @NotNull
    public final String component7() {
        return this.userType;
    }

    @NotNull
    public final Blocking copy(@NotNull String codeSequence, @NotNull String createDateTime, @NotNull String descriptionEnglish, @NotNull String descriptionThai, int i, @NotNull String transactiontype, @NotNull String userType) {
        Intrinsics.checkNotNullParameter(codeSequence, "codeSequence");
        Intrinsics.checkNotNullParameter(createDateTime, "createDateTime");
        Intrinsics.checkNotNullParameter(descriptionEnglish, "descriptionEnglish");
        Intrinsics.checkNotNullParameter(descriptionThai, "descriptionThai");
        Intrinsics.checkNotNullParameter(transactiontype, "transactiontype");
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new Blocking(codeSequence, createDateTime, descriptionEnglish, descriptionThai, i, transactiontype, userType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Blocking) {
            Blocking blocking = (Blocking) obj;
            return Intrinsics.areEqual(this.codeSequence, blocking.codeSequence) && Intrinsics.areEqual(this.createDateTime, blocking.createDateTime) && Intrinsics.areEqual(this.descriptionEnglish, blocking.descriptionEnglish) && Intrinsics.areEqual(this.descriptionThai, blocking.descriptionThai) && this.total == blocking.total && Intrinsics.areEqual(this.transactiontype, blocking.transactiontype) && Intrinsics.areEqual(this.userType, blocking.userType);
        }
        return false;
    }

    @NotNull
    public final String getCodeSequence() {
        return this.codeSequence;
    }

    @NotNull
    public final String getCreateDateTime() {
        return this.createDateTime;
    }

    @NotNull
    public final String getDescriptionEnglish() {
        return this.descriptionEnglish;
    }

    @NotNull
    public final String getDescriptionThai() {
        return this.descriptionThai;
    }

    public final int getTotal() {
        return this.total;
    }

    @NotNull
    public final String getTransactiontype() {
        return this.transactiontype;
    }

    @NotNull
    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        return (((((((((((this.codeSequence.hashCode() * 31) + this.createDateTime.hashCode()) * 31) + this.descriptionEnglish.hashCode()) * 31) + this.descriptionThai.hashCode()) * 31) + this.total) * 31) + this.transactiontype.hashCode()) * 31) + this.userType.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.codeSequence;
        String str2 = this.createDateTime;
        String str3 = this.descriptionEnglish;
        String str4 = this.descriptionThai;
        int i = this.total;
        String str5 = this.transactiontype;
        String str6 = this.userType;
        return "Blocking(codeSequence=" + str + ", createDateTime=" + str2 + ", descriptionEnglish=" + str3 + ", descriptionThai=" + str4 + ", total=" + i + ", transactiontype=" + str5 + ", userType=" + str6 + ")";
    }
}