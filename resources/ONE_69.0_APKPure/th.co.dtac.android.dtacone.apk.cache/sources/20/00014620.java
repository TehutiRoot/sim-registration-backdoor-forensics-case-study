package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.FixedLinePlusNumberResponse;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "", "Error", "ErrorRes", "Initial", "Loading", "Success", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState */
/* loaded from: classes10.dex */
public interface OneRegisterTrueOnlineSignaturePageScreenState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements OneRegisterTrueOnlineSignaturePageScreenState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f98376a;

        public Error(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f98376a = message;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.f98376a;
            }
            return error.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f98376a;
        }

        @NotNull
        public final Error copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.f98376a, ((Error) obj).f98376a);
        }

        @NotNull
        public final String getMessage() {
            return this.f98376a;
        }

        public int hashCode() {
            return this.f98376a.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f98376a;
            return "Error(message=" + str + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$ErrorRes;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "", "message", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$ErrorRes;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState$ErrorRes */
    /* loaded from: classes10.dex */
    public static final class ErrorRes implements OneRegisterTrueOnlineSignaturePageScreenState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final int f98377a;

        public ErrorRes(int i) {
            this.f98377a = i;
        }

        public static /* synthetic */ ErrorRes copy$default(ErrorRes errorRes, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = errorRes.f98377a;
            }
            return errorRes.copy(i);
        }

        public final int component1() {
            return this.f98377a;
        }

        @NotNull
        public final ErrorRes copy(int i) {
            return new ErrorRes(i);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorRes) && this.f98377a == ((ErrorRes) obj).f98377a;
        }

        public final int getMessage() {
            return this.f98377a;
        }

        public int hashCode() {
            return this.f98377a;
        }

        @NotNull
        public String toString() {
            int i = this.f98377a;
            return "ErrorRes(message=" + i + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState$Initial */
    /* loaded from: classes10.dex */
    public static final class Initial implements OneRegisterTrueOnlineSignaturePageScreenState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState$Loading */
    /* loaded from: classes10.dex */
    public static final class Loading implements OneRegisterTrueOnlineSignaturePageScreenState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Success;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState;", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusNumberResponse;", "dataItem", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusNumberResponse;)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusNumberResponse;", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusNumberResponse;)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineSignaturePageScreenState$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/FixedLinePlusNumberResponse;", "getDataItem", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineSignaturePageScreenState$Success */
    /* loaded from: classes10.dex */
    public static final class Success implements OneRegisterTrueOnlineSignaturePageScreenState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final FixedLinePlusNumberResponse f98378a;

        public Success(@NotNull FixedLinePlusNumberResponse dataItem) {
            Intrinsics.checkNotNullParameter(dataItem, "dataItem");
            this.f98378a = dataItem;
        }

        public static /* synthetic */ Success copy$default(Success success, FixedLinePlusNumberResponse fixedLinePlusNumberResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                fixedLinePlusNumberResponse = success.f98378a;
            }
            return success.copy(fixedLinePlusNumberResponse);
        }

        @NotNull
        public final FixedLinePlusNumberResponse component1() {
            return this.f98378a;
        }

        @NotNull
        public final Success copy(@NotNull FixedLinePlusNumberResponse dataItem) {
            Intrinsics.checkNotNullParameter(dataItem, "dataItem");
            return new Success(dataItem);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.f98378a, ((Success) obj).f98378a);
        }

        @NotNull
        public final FixedLinePlusNumberResponse getDataItem() {
            return this.f98378a;
        }

        public int hashCode() {
            return this.f98378a.hashCode();
        }

        @NotNull
        public String toString() {
            FixedLinePlusNumberResponse fixedLinePlusNumberResponse = this.f98378a;
            return "Success(dataItem=" + fixedLinePlusNumberResponse + ")";
        }
    }
}