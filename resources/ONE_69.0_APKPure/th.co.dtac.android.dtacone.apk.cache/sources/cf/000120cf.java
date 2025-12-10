package th.p047co.dtac.android.dtacone.model.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/CreateFormRequest;", "", "form", "", "type", ResponseProcessor.CONTENT_TYPE_IMAGE, "allowDocumentType", "", "orderType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAllowDocumentType", "()Ljava/util/List;", "getForm", "()Ljava/lang/String;", "getImage", "getOrderType", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.CreateFormRequest */
/* loaded from: classes8.dex */
public final class CreateFormRequest {
    public static final int $stable = 8;
    @SerializedName("allowDocumentType")
    @Nullable
    private final List<String> allowDocumentType;
    @SerializedName("form")
    @NotNull
    private final String form;
    @SerializedName(ResponseProcessor.CONTENT_TYPE_IMAGE)
    @Nullable
    private final String image;
    @SerializedName("orderType")
    @Nullable
    private final String orderType;
    @SerializedName("type")
    @Nullable
    private final String type;

    public CreateFormRequest(@NotNull String form, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(form, "form");
        this.form = form;
        this.type = str;
        this.image = str2;
        this.allowDocumentType = list;
        this.orderType = str3;
    }

    public static /* synthetic */ CreateFormRequest copy$default(CreateFormRequest createFormRequest, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFormRequest.form;
        }
        if ((i & 2) != 0) {
            str2 = createFormRequest.type;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = createFormRequest.image;
        }
        String str6 = str3;
        List<String> list2 = list;
        if ((i & 8) != 0) {
            list2 = createFormRequest.allowDocumentType;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = createFormRequest.orderType;
        }
        return createFormRequest.copy(str, str5, str6, list3, str4);
    }

    @NotNull
    public final String component1() {
        return this.form;
    }

    @Nullable
    public final String component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.image;
    }

    @Nullable
    public final List<String> component4() {
        return this.allowDocumentType;
    }

    @Nullable
    public final String component5() {
        return this.orderType;
    }

    @NotNull
    public final CreateFormRequest copy(@NotNull String form, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(form, "form");
        return new CreateFormRequest(form, str, str2, list, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateFormRequest) {
            CreateFormRequest createFormRequest = (CreateFormRequest) obj;
            return Intrinsics.areEqual(this.form, createFormRequest.form) && Intrinsics.areEqual(this.type, createFormRequest.type) && Intrinsics.areEqual(this.image, createFormRequest.image) && Intrinsics.areEqual(this.allowDocumentType, createFormRequest.allowDocumentType) && Intrinsics.areEqual(this.orderType, createFormRequest.orderType);
        }
        return false;
    }

    @Nullable
    public final List<String> getAllowDocumentType() {
        return this.allowDocumentType;
    }

    @NotNull
    public final String getForm() {
        return this.form;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getOrderType() {
        return this.orderType;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.form.hashCode() * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.allowDocumentType;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.orderType;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.form;
        String str2 = this.type;
        String str3 = this.image;
        List<String> list = this.allowDocumentType;
        String str4 = this.orderType;
        return "CreateFormRequest(form=" + str + ", type=" + str2 + ", image=" + str3 + ", allowDocumentType=" + list + ", orderType=" + str4 + ")";
    }

    public /* synthetic */ CreateFormRequest(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4);
    }
}