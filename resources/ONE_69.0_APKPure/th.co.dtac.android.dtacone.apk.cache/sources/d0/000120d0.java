package th.p047co.dtac.android.dtacone.model.upPass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003Ja\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/CreateFormResponse;", "", "codeType", "", "code", "desc", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/upPass/CreateFormData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/upPass/CreateFormData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/upPass/CreateFormData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.CreateFormResponse */
/* loaded from: classes8.dex */
public final class CreateFormResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @NotNull
    private final CreateFormData data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;

    public CreateFormResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CreateFormResponse copy$default(CreateFormResponse createFormResponse, String str, String str2, String str3, String str4, List list, String str5, CreateFormData createFormData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFormResponse.codeType;
        }
        if ((i & 2) != 0) {
            str2 = createFormResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = createFormResponse.desc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = createFormResponse.systemMessage;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = createFormResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = createFormResponse.responseDateTime;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            createFormData = createFormResponse.data;
        }
        return createFormResponse.copy(str, str6, str7, str8, list3, str9, createFormData);
    }

    @Nullable
    public final String component1() {
        return this.codeType;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.systemMessage;
    }

    @Nullable
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component6() {
        return this.responseDateTime;
    }

    @NotNull
    public final CreateFormData component7() {
        return this.data;
    }

    @NotNull
    public final CreateFormResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @NotNull CreateFormData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new CreateFormResponse(str, str2, str3, str4, list, str5, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateFormResponse) {
            CreateFormResponse createFormResponse = (CreateFormResponse) obj;
            return Intrinsics.areEqual(this.codeType, createFormResponse.codeType) && Intrinsics.areEqual(this.code, createFormResponse.code) && Intrinsics.areEqual(this.desc, createFormResponse.desc) && Intrinsics.areEqual(this.systemMessage, createFormResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, createFormResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, createFormResponse.responseDateTime) && Intrinsics.areEqual(this.data, createFormResponse.data);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final CreateFormData getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.codeType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.systemMessage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.responseDateTime;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.codeType;
        String str2 = this.code;
        String str3 = this.desc;
        String str4 = this.systemMessage;
        List<String> list = this.replaceMessage;
        String str5 = this.responseDateTime;
        CreateFormData createFormData = this.data;
        return "CreateFormResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + createFormData + ")";
    }

    public CreateFormResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @NotNull CreateFormData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.codeType = str;
        this.code = str2;
        this.desc = str3;
        this.systemMessage = str4;
        this.replaceMessage = list;
        this.responseDateTime = str5;
        this.data = data;
    }

    public /* synthetic */ CreateFormResponse(String str, String str2, String str3, String str4, List list, String str5, CreateFormData createFormData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? new CreateFormData(null, null, 3, null) : createFormData);
    }
}