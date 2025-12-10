package th.p047co.dtac.android.dtacone.view.appOne.eSign.state;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneConsentNoticeDocResponse;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "", "Error", "ErrorMessage", "ErrorResId", "Initial", "Loading", "Success", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState */
/* loaded from: classes10.dex */
public interface OneConsentNoticeDocState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;)V", "component1", "()Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "copy", "(Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "getError", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements OneConsentNoticeDocState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final CommonErrorResponse f90906a;

        public Error(@NotNull CommonErrorResponse error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f90906a = error;
        }

        public static /* synthetic */ Error copy$default(Error error, CommonErrorResponse commonErrorResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                commonErrorResponse = error.f90906a;
            }
            return error.copy(commonErrorResponse);
        }

        @NotNull
        public final CommonErrorResponse component1() {
            return this.f90906a;
        }

        @NotNull
        public final Error copy(@NotNull CommonErrorResponse error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.f90906a, ((Error) obj).f90906a);
        }

        @NotNull
        public final CommonErrorResponse getError() {
            return this.f90906a;
        }

        public int hashCode() {
            return this.f90906a.hashCode();
        }

        @NotNull
        public String toString() {
            CommonErrorResponse commonErrorResponse = this.f90906a;
            return "Error(error=" + commonErrorResponse + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$ErrorMessage;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$ErrorMessage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$ErrorMessage */
    /* loaded from: classes10.dex */
    public static final class ErrorMessage implements OneConsentNoticeDocState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f90907a;

        public ErrorMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f90907a = message;
        }

        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorMessage.f90907a;
            }
            return errorMessage.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f90907a;
        }

        @NotNull
        public final ErrorMessage copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorMessage(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorMessage) && Intrinsics.areEqual(this.f90907a, ((ErrorMessage) obj).f90907a);
        }

        @NotNull
        public final String getMessage() {
            return this.f90907a;
        }

        public int hashCode() {
            return this.f90907a.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f90907a;
            return "ErrorMessage(message=" + str + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$ErrorResId;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "", "resId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$ErrorResId;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getResId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$ErrorResId */
    /* loaded from: classes10.dex */
    public static final class ErrorResId implements OneConsentNoticeDocState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final int f90908a;

        public ErrorResId(@StringRes int i) {
            this.f90908a = i;
        }

        public static /* synthetic */ ErrorResId copy$default(ErrorResId errorResId, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = errorResId.f90908a;
            }
            return errorResId.copy(i);
        }

        public final int component1() {
            return this.f90908a;
        }

        @NotNull
        public final ErrorResId copy(@StringRes int i) {
            return new ErrorResId(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorResId) && this.f90908a == ((ErrorResId) obj).f90908a;
        }

        public final int getResId() {
            return this.f90908a;
        }

        public int hashCode() {
            return this.f90908a;
        }

        @NotNull
        public String toString() {
            int i = this.f90908a;
            return "ErrorResId(resId=" + i + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$Initial */
    /* loaded from: classes10.dex */
    public static final class Initial implements OneConsentNoticeDocState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$Loading */
    /* loaded from: classes10.dex */
    public static final class Loading implements OneConsentNoticeDocState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Success;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "data", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentNoticeDocState$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "getData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentNoticeDocState$Success */
    /* loaded from: classes10.dex */
    public static final class Success implements OneConsentNoticeDocState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneConsentNoticeDocResponse f90909a;

        public Success(@NotNull OneConsentNoticeDocResponse data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f90909a = data;
        }

        public static /* synthetic */ Success copy$default(Success success, OneConsentNoticeDocResponse oneConsentNoticeDocResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                oneConsentNoticeDocResponse = success.f90909a;
            }
            return success.copy(oneConsentNoticeDocResponse);
        }

        @NotNull
        public final OneConsentNoticeDocResponse component1() {
            return this.f90909a;
        }

        @NotNull
        public final Success copy(@NotNull OneConsentNoticeDocResponse data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Success(data);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.f90909a, ((Success) obj).f90909a);
        }

        @NotNull
        public final OneConsentNoticeDocResponse getData() {
            return this.f90909a;
        }

        public int hashCode() {
            return this.f90909a.hashCode();
        }

        @NotNull
        public String toString() {
            OneConsentNoticeDocResponse oneConsentNoticeDocResponse = this.f90909a;
            return "Success(data=" + oneConsentNoticeDocResponse + ")";
        }
    }
}