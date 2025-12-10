package co.omise.android.extensions;

import android.content.res.Resources;
import co.omise.android.C5500R;
import co.omise.android.extensions.APIErrorCode;
import co.omise.android.extensions.BadRequestReason;
import co.omise.android.extensions.InvalidCardReason;
import co.omise.android.models.APIError;
import co.omise.android.models.Amount;
import com.zxy.tiny.common.UriUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, m29142d2 = {"errorCode", "Lco/omise/android/extensions/APIErrorCode;", "Lco/omise/android/models/APIError;", "getErrorCode", "(Lco/omise/android/models/APIError;)Lco/omise/android/extensions/APIErrorCode;", "getMessageFromResources", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Landroid/content/res/Resources;", "getMessageWhenBadRequest", "getMessageWhenInvalidCard", "sdk_productionRelease"}, m29141k = 2, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes.dex */
public final class APIErrorExtensionsKt {
    @NotNull
    public static final APIErrorCode getErrorCode(@NotNull APIError aPIError) {
        Intrinsics.checkNotNullParameter(aPIError, "<this>");
        APIErrorCode.Companion companion = APIErrorCode.Companion;
        String code = aPIError.getCode();
        String str = "";
        if (code == null) {
            code = "";
        }
        String message = aPIError.getMessage();
        if (message != null) {
            str = message;
        }
        return companion.creator(code, str);
    }

    @NotNull
    public static final String getMessageFromResources(@NotNull APIError aPIError, @NotNull Resources res) {
        String str;
        Intrinsics.checkNotNullParameter(aPIError, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        APIErrorCode errorCode = getErrorCode(aPIError);
        if (errorCode instanceof APIErrorCode.InvalidCard) {
            return getMessageWhenInvalidCard(aPIError, res);
        }
        if (errorCode instanceof APIErrorCode.BadRequest) {
            return getMessageWhenBadRequest(aPIError, res);
        }
        if (Intrinsics.areEqual(errorCode, APIErrorCode.AuthenticationFailure.INSTANCE)) {
            String string = res.getString(C5500R.C5507string.error_api_authentication_failure);
            Intrinsics.checkNotNullExpressionValue(string, "res.getString(R.string.e…i_authentication_failure)");
            return string;
        } else if (Intrinsics.areEqual(errorCode, APIErrorCode.ServiceNotFound.INSTANCE)) {
            String string2 = res.getString(C5500R.C5507string.error_api_service_not_found);
            Intrinsics.checkNotNullExpressionValue(string2, "res.getString(R.string.e…or_api_service_not_found)");
            return string2;
        } else {
            int i = C5500R.C5507string.error_required;
            String message = aPIError.getMessage();
            if (message != null) {
                str = StringExtensionsKt.capitalizeFirstChar(message);
            } else {
                str = null;
            }
            String string3 = res.getString(i, str);
            Intrinsics.checkNotNullExpressionValue(string3, "res.getString(\n         …irstChar(),\n            )");
            return string3;
        }
    }

    @NotNull
    public static final String getMessageWhenBadRequest(@NotNull APIError aPIError, @NotNull Resources res) {
        String message;
        String currency;
        String currency2;
        Intrinsics.checkNotNullParameter(aPIError, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        APIErrorCode errorCode = getErrorCode(aPIError);
        Intrinsics.checkNotNull(errorCode, "null cannot be cast to non-null type co.omise.android.extensions.APIErrorCode.BadRequest");
        BadRequestReason badRequestReason = (BadRequestReason) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) ((APIErrorCode.BadRequest) errorCode).getReasons());
        if (badRequestReason instanceof BadRequestReason.AmountIsGreaterThanValidAmount) {
            BadRequestReason.AmountIsGreaterThanValidAmount amountIsGreaterThanValidAmount = (BadRequestReason.AmountIsGreaterThanValidAmount) badRequestReason;
            if (amountIsGreaterThanValidAmount.getValidAmount() != null && (currency2 = amountIsGreaterThanValidAmount.getCurrency()) != null && currency2.length() != 0) {
                message = res.getString(C5500R.C5507string.f40234x2568a915, new Amount(amountIsGreaterThanValidAmount.getValidAmount().longValue(), amountIsGreaterThanValidAmount.getCurrency()).toAmountString());
            } else {
                message = res.getString(C5500R.C5507string.f40235x4c3d1031);
            }
        } else if (badRequestReason instanceof BadRequestReason.AmountIsLessThanValidAmount) {
            BadRequestReason.AmountIsLessThanValidAmount amountIsLessThanValidAmount = (BadRequestReason.AmountIsLessThanValidAmount) badRequestReason;
            if (amountIsLessThanValidAmount.getValidAmount() != null && (currency = amountIsLessThanValidAmount.getCurrency()) != null && currency.length() != 0) {
                message = res.getString(C5500R.C5507string.f40236x52b50dc, new Amount(amountIsLessThanValidAmount.getValidAmount().longValue(), amountIsLessThanValidAmount.getCurrency()).toAmountString());
            } else {
                message = res.getString(C5500R.C5507string.f40237x897f7f0a);
            }
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.InvalidCurrency.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_invalid_currency);
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.EmptyName.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_empty_name);
        } else if (badRequestReason instanceof BadRequestReason.NameIsTooLong) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_name_is_too_long_with_valid_length, Integer.valueOf(((BadRequestReason.NameIsTooLong) badRequestReason).getMaximum()));
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.InvalidName.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_invalid_name);
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.InvalidEmail.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_invalid_email);
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.InvalidPhoneNumber.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_invalid_phone_number);
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.SourceTypeNotSupported.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_source_type_not_supported);
        } else if (Intrinsics.areEqual(badRequestReason, BadRequestReason.CurrencyNotSupported.INSTANCE)) {
            message = res.getString(C5500R.C5507string.error_api_bad_request_currency_not_supported);
        } else {
            message = aPIError.getMessage();
            if (message == null) {
                message = res.getString(C5500R.C5507string.error_unknown_without_reason);
                Intrinsics.checkNotNullExpressionValue(message, "res.getString(R.string.e…r_unknown_without_reason)");
            }
        }
        Intrinsics.checkNotNullExpressionValue(message, "errorCode as APIErrorCod…t_reason)\n        }\n    }");
        return message;
    }

    @NotNull
    public static final String getMessageWhenInvalidCard(@NotNull APIError aPIError, @NotNull Resources res) {
        String str;
        String string;
        Intrinsics.checkNotNullParameter(aPIError, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        APIErrorCode errorCode = getErrorCode(aPIError);
        Intrinsics.checkNotNull(errorCode, "null cannot be cast to non-null type co.omise.android.extensions.APIErrorCode.InvalidCard");
        InvalidCardReason invalidCardReason = (InvalidCardReason) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) ((APIErrorCode.InvalidCard) errorCode).getReasons());
        if (Intrinsics.areEqual(invalidCardReason, InvalidCardReason.InvalidCardNumber.INSTANCE)) {
            string = res.getString(C5500R.C5507string.error_api_invalid_card_invalid_card_number);
        } else if (Intrinsics.areEqual(invalidCardReason, InvalidCardReason.InvalidExpirationDate.INSTANCE)) {
            string = res.getString(C5500R.C5507string.error_api_invalid_card_invalid_expiration_date);
        } else if (Intrinsics.areEqual(invalidCardReason, InvalidCardReason.EmptyCardHolderName.INSTANCE)) {
            string = res.getString(C5500R.C5507string.error_api_invalid_card_empty_card_holder_name);
        } else if (Intrinsics.areEqual(invalidCardReason, InvalidCardReason.UnsupportedBrand.INSTANCE)) {
            string = res.getString(C5500R.C5507string.error_api_invalid_card_unsupported_brand);
        } else if (invalidCardReason instanceof InvalidCardReason.Unknown) {
            string = res.getString(C5500R.C5507string.error_required, ((InvalidCardReason.Unknown) invalidCardReason).getMessage());
        } else {
            int i = C5500R.C5507string.error_required;
            String message = aPIError.getMessage();
            if (message != null) {
                str = StringExtensionsKt.capitalizeFirstChar(message);
            } else {
                str = null;
            }
            string = res.getString(i, str);
        }
        Intrinsics.checkNotNullExpressionValue(string, "errorCode as APIErrorCod…        )\n        }\n    }");
        return string;
    }
}