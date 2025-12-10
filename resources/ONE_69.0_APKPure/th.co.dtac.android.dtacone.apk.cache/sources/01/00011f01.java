package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/PartnerDocument;", "", "partnerCode", "", "fileName", "fileBase64", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileBase64", "()Ljava/lang/String;", "setFileBase64", "(Ljava/lang/String;)V", "getFileName", "setFileName", "getPartnerCode", "setPartnerCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.submit.PartnerDocument */
/* loaded from: classes8.dex */
public final class PartnerDocument {
    public static final int $stable = 8;
    @SerializedName("fileBase64")
    @Nullable
    private String fileBase64;
    @SerializedName("fileName")
    @Nullable
    private String fileName;
    @SerializedName("partnerCode")
    @Nullable
    private String partnerCode;

    public PartnerDocument() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PartnerDocument copy$default(PartnerDocument partnerDocument, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerDocument.partnerCode;
        }
        if ((i & 2) != 0) {
            str2 = partnerDocument.fileName;
        }
        if ((i & 4) != 0) {
            str3 = partnerDocument.fileBase64;
        }
        return partnerDocument.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.partnerCode;
    }

    @Nullable
    public final String component2() {
        return this.fileName;
    }

    @Nullable
    public final String component3() {
        return this.fileBase64;
    }

    @NotNull
    public final PartnerDocument copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new PartnerDocument(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerDocument) {
            PartnerDocument partnerDocument = (PartnerDocument) obj;
            return Intrinsics.areEqual(this.partnerCode, partnerDocument.partnerCode) && Intrinsics.areEqual(this.fileName, partnerDocument.fileName) && Intrinsics.areEqual(this.fileBase64, partnerDocument.fileBase64);
        }
        return false;
    }

    @Nullable
    public final String getFileBase64() {
        return this.fileBase64;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    public int hashCode() {
        String str = this.partnerCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileBase64;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setFileBase64(@Nullable String str) {
        this.fileBase64 = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setPartnerCode(@Nullable String str) {
        this.partnerCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.partnerCode;
        String str2 = this.fileName;
        String str3 = this.fileBase64;
        return "PartnerDocument(partnerCode=" + str + ", fileName=" + str2 + ", fileBase64=" + str3 + ")";
    }

    public PartnerDocument(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.partnerCode = str;
        this.fileName = str2;
        this.fileBase64 = str3;
    }

    public /* synthetic */ PartnerDocument(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}