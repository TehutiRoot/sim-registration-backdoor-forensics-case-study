package th.p047co.dtac.android.dtacone.view.appOne.eSign.state;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "", "Error", "ErrorMessage", "ErrorResId", "Initial", "Loading", "Success", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState */
/* loaded from: classes10.dex */
public interface OneConsentState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", "getError", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements OneConsentState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final CommonErrorResponse f90910a;

        public Error(@NotNull CommonErrorResponse error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f90910a = error;
        }

        public static /* synthetic */ Error copy$default(Error error, CommonErrorResponse commonErrorResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                commonErrorResponse = error.f90910a;
            }
            return error.copy(commonErrorResponse);
        }

        @NotNull
        public final CommonErrorResponse component1() {
            return this.f90910a;
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
            return (obj instanceof Error) && Intrinsics.areEqual(this.f90910a, ((Error) obj).f90910a);
        }

        @NotNull
        public final CommonErrorResponse getError() {
            return this.f90910a;
        }

        public int hashCode() {
            return this.f90910a.hashCode();
        }

        @NotNull
        public String toString() {
            CommonErrorResponse commonErrorResponse = this.f90910a;
            return "Error(error=" + commonErrorResponse + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$ErrorMessage;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$ErrorMessage;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$ErrorMessage */
    /* loaded from: classes10.dex */
    public static final class ErrorMessage implements OneConsentState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f90911a;

        public ErrorMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f90911a = message;
        }

        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorMessage.f90911a;
            }
            return errorMessage.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f90911a;
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
            return (obj instanceof ErrorMessage) && Intrinsics.areEqual(this.f90911a, ((ErrorMessage) obj).f90911a);
        }

        @NotNull
        public final String getMessage() {
            return this.f90911a;
        }

        public int hashCode() {
            return this.f90911a.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f90911a;
            return "ErrorMessage(message=" + str + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$ErrorResId;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "", "resId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$ErrorResId;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getResId", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$ErrorResId */
    /* loaded from: classes10.dex */
    public static final class ErrorResId implements OneConsentState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final int f90912a;

        public ErrorResId(@StringRes int i) {
            this.f90912a = i;
        }

        public static /* synthetic */ ErrorResId copy$default(ErrorResId errorResId, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = errorResId.f90912a;
            }
            return errorResId.copy(i);
        }

        public final int component1() {
            return this.f90912a;
        }

        @NotNull
        public final ErrorResId copy(@StringRes int i) {
            return new ErrorResId(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorResId) && this.f90912a == ((ErrorResId) obj).f90912a;
        }

        public final int getResId() {
            return this.f90912a;
        }

        public int hashCode() {
            return this.f90912a;
        }

        @NotNull
        public String toString() {
            int i = this.f90912a;
            return "ErrorResId(resId=" + i + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$Initial */
    /* loaded from: classes10.dex */
    public static final class Initial implements OneConsentState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$Loading */
    /* loaded from: classes10.dex */
    public static final class Loading implements OneConsentState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Success;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState;", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "data", "<init>", "(Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;)V", "component1", "()Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "copy", "(Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneConsentState$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "getData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneConsentState$Success */
    /* loaded from: classes10.dex */
    public static final class Success implements OneConsentState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final OneConsentDataTmnResponse f90913a;

        public Success(@NotNull OneConsentDataTmnResponse data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f90913a = data;
        }

        public static /* synthetic */ Success copy$default(Success success, OneConsentDataTmnResponse oneConsentDataTmnResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                oneConsentDataTmnResponse = success.f90913a;
            }
            return success.copy(oneConsentDataTmnResponse);
        }

        @NotNull
        public final OneConsentDataTmnResponse component1() {
            return this.f90913a;
        }

        @NotNull
        public final Success copy(@NotNull OneConsentDataTmnResponse data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Success(data);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.f90913a, ((Success) obj).f90913a);
        }

        @NotNull
        public final OneConsentDataTmnResponse getData() {
            return this.f90913a;
        }

        public int hashCode() {
            return this.f90913a.hashCode();
        }

        @NotNull
        public String toString() {
            OneConsentDataTmnResponse oneConsentDataTmnResponse = this.f90913a;
            return "Success(data=" + oneConsentDataTmnResponse + ")";
        }
    }
}