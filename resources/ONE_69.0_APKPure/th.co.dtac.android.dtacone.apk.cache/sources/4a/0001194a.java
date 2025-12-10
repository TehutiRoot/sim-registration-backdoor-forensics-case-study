package th.p047co.dtac.android.dtacone.extension.command;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorData;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, m29142d2 = {"toCommonErrorResponse", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "toErrorCollection", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.command.UpPassCommonExtKt */
/* loaded from: classes7.dex */
public final class UpPassCommonExtKt {
    @NotNull
    public static final CommonErrorResponse toCommonErrorResponse(@NotNull ErrorCollection errorCollection) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(errorCollection, "<this>");
        String codeType = errorCollection.getCodeType();
        if (codeType == null) {
            str = "";
        } else {
            str = codeType;
        }
        String statusCode = errorCollection.getStatusCode();
        if (statusCode == null) {
            str2 = "";
        } else {
            str2 = statusCode;
        }
        String description = errorCollection.getDescription();
        if (description == null) {
            str3 = "";
        } else {
            str3 = description;
        }
        String username = errorCollection.getUsername();
        if (username == null) {
            str4 = "";
        } else {
            str4 = username;
        }
        String systemMessage = errorCollection.getSystemMessage();
        if (systemMessage == null) {
            str5 = "";
        } else {
            str5 = systemMessage;
        }
        List emptyList = CollectionsKt__CollectionsKt.emptyList();
        String responseDateTime = errorCollection.getResponseDateTime();
        if (responseDateTime == null) {
            responseDateTime = "";
        }
        return new CommonErrorResponse(str, str2, str3, str4, str5, emptyList, responseDateTime, new CommonErrorData("failed"));
    }

    @NotNull
    public static final ErrorCollection toErrorCollection(@NotNull CommonErrorResponse commonErrorResponse) {
        Intrinsics.checkNotNullParameter(commonErrorResponse, "<this>");
        ErrorCollection errorCollection = new ErrorCollection();
        errorCollection.setCodeType(commonErrorResponse.getCodeType());
        errorCollection.setStatusCode(commonErrorResponse.getCode());
        errorCollection.setDescription(commonErrorResponse.getDesc());
        errorCollection.setResponseDateTime(commonErrorResponse.getResponseDateTime());
        errorCollection.setSystemMessage(commonErrorResponse.getSystemMessage());
        errorCollection.setUsername(commonErrorResponse.getUserId());
        return errorCollection;
    }
}