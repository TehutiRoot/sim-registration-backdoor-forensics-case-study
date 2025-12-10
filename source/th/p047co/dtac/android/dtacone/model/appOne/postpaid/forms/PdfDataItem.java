package th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/PdfDataItem;", "", "copyFlag", "", "pdfDataID", "(Ljava/lang/String;Ljava/lang/String;)V", "getCopyFlag", "()Ljava/lang/String;", "getPdfDataID", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.forms.PdfDataItem */
/* loaded from: classes8.dex */
public final class PdfDataItem {
    public static final int $stable = 0;
    @SerializedName("copyFlag")
    @Nullable
    private final String copyFlag;
    @SerializedName("pdfDataID")
    @Nullable
    private final String pdfDataID;

    public PdfDataItem() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PdfDataItem copy$default(PdfDataItem pdfDataItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfDataItem.copyFlag;
        }
        if ((i & 2) != 0) {
            str2 = pdfDataItem.pdfDataID;
        }
        return pdfDataItem.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.copyFlag;
    }

    @Nullable
    public final String component2() {
        return this.pdfDataID;
    }

    @NotNull
    public final PdfDataItem copy(@Nullable String str, @Nullable String str2) {
        return new PdfDataItem(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PdfDataItem) {
            PdfDataItem pdfDataItem = (PdfDataItem) obj;
            return Intrinsics.areEqual(this.copyFlag, pdfDataItem.copyFlag) && Intrinsics.areEqual(this.pdfDataID, pdfDataItem.pdfDataID);
        }
        return false;
    }

    @Nullable
    public final String getCopyFlag() {
        return this.copyFlag;
    }

    @Nullable
    public final String getPdfDataID() {
        return this.pdfDataID;
    }

    public int hashCode() {
        String str = this.copyFlag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pdfDataID;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.copyFlag;
        String str2 = this.pdfDataID;
        return "PdfDataItem(copyFlag=" + str + ", pdfDataID=" + str2 + ")";
    }

    public PdfDataItem(@Nullable String str, @Nullable String str2) {
        this.copyFlag = str;
        this.pdfDataID = str2;
    }

    public /* synthetic */ PdfDataItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
