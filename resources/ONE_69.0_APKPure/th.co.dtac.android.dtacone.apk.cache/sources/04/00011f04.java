package th.p047co.dtac.android.dtacone.model.mrtr_online_registration.submit;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/UploadRetailerDocumentRequest;", "", "partnerCode", "", "salesCode", "partnerDocument", "", "Lth/co/dtac/android/dtacone/model/mrtr_online_registration/submit/PartnerDocument;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPartnerCode", "()Ljava/lang/String;", "setPartnerCode", "(Ljava/lang/String;)V", "getPartnerDocument", "()Ljava/util/List;", "setPartnerDocument", "(Ljava/util/List;)V", "getSalesCode", "setSalesCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_online_registration.submit.UploadRetailerDocumentRequest */
/* loaded from: classes8.dex */
public final class UploadRetailerDocumentRequest {
    public static final int $stable = 8;
    @SerializedName("partnerCode")
    @Nullable
    private String partnerCode;
    @SerializedName("partnerDocument")
    @Nullable
    private List<PartnerDocument> partnerDocument;
    @SerializedName("salesCode")
    @Nullable
    private String salesCode;

    public UploadRetailerDocumentRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadRetailerDocumentRequest copy$default(UploadRetailerDocumentRequest uploadRetailerDocumentRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadRetailerDocumentRequest.partnerCode;
        }
        if ((i & 2) != 0) {
            str2 = uploadRetailerDocumentRequest.salesCode;
        }
        if ((i & 4) != 0) {
            list = uploadRetailerDocumentRequest.partnerDocument;
        }
        return uploadRetailerDocumentRequest.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.partnerCode;
    }

    @Nullable
    public final String component2() {
        return this.salesCode;
    }

    @Nullable
    public final List<PartnerDocument> component3() {
        return this.partnerDocument;
    }

    @NotNull
    public final UploadRetailerDocumentRequest copy(@Nullable String str, @Nullable String str2, @Nullable List<PartnerDocument> list) {
        return new UploadRetailerDocumentRequest(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadRetailerDocumentRequest) {
            UploadRetailerDocumentRequest uploadRetailerDocumentRequest = (UploadRetailerDocumentRequest) obj;
            return Intrinsics.areEqual(this.partnerCode, uploadRetailerDocumentRequest.partnerCode) && Intrinsics.areEqual(this.salesCode, uploadRetailerDocumentRequest.salesCode) && Intrinsics.areEqual(this.partnerDocument, uploadRetailerDocumentRequest.partnerDocument);
        }
        return false;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final List<PartnerDocument> getPartnerDocument() {
        return this.partnerDocument;
    }

    @Nullable
    public final String getSalesCode() {
        return this.salesCode;
    }

    public int hashCode() {
        String str = this.partnerCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.salesCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PartnerDocument> list = this.partnerDocument;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setPartnerCode(@Nullable String str) {
        this.partnerCode = str;
    }

    public final void setPartnerDocument(@Nullable List<PartnerDocument> list) {
        this.partnerDocument = list;
    }

    public final void setSalesCode(@Nullable String str) {
        this.salesCode = str;
    }

    @NotNull
    public String toString() {
        String str = this.partnerCode;
        String str2 = this.salesCode;
        List<PartnerDocument> list = this.partnerDocument;
        return "UploadRetailerDocumentRequest(partnerCode=" + str + ", salesCode=" + str2 + ", partnerDocument=" + list + ")";
    }

    public UploadRetailerDocumentRequest(@Nullable String str, @Nullable String str2, @Nullable List<PartnerDocument> list) {
        this.partnerCode = str;
        this.salesCode = str2;
        this.partnerDocument = list;
    }

    public /* synthetic */ UploadRetailerDocumentRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}