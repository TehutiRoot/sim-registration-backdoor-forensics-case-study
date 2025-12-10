package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "", "Error", "Initial", "Loading", "Removing", "Success", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Removing;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Success;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState */
/* loaded from: classes10.dex */
public interface ReviewImageState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "", "message", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements ReviewImageState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f98384a;

        public Error(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f98384a = message;
        }

        @NotNull
        public final String getMessage() {
            return this.f98384a;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState$Initial */
    /* loaded from: classes10.dex */
    public static final class Initial implements ReviewImageState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState$Loading */
    /* loaded from: classes10.dex */
    public static final class Loading implements ReviewImageState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Removing;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "", "Landroid/graphics/Bitmap;", "data", "", "optionalCount", "optionalMax", "<init>", "(Ljava/util/List;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getData", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getOptionalCount", "()I", OperatorName.CURVE_TO, "getOptionalMax", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState$Removing */
    /* loaded from: classes10.dex */
    public static final class Removing implements ReviewImageState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final List f98385a;

        /* renamed from: b */
        public final int f98386b;

        /* renamed from: c */
        public final int f98387c;

        public Removing(@NotNull List<Bitmap> data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f98385a = data;
            this.f98386b = i;
            this.f98387c = i2;
        }

        @NotNull
        public final List<Bitmap> getData() {
            return this.f98385a;
        }

        public final int getOptionalCount() {
            return this.f98386b;
        }

        public final int getOptionalMax() {
            return this.f98387c;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState$Success;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/ReviewImageState;", "", "Landroid/graphics/Bitmap;", "data", "", "optionalCount", "optionalMax", "<init>", "(Ljava/util/List;II)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getData", "()Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getOptionalCount", "()I", OperatorName.CURVE_TO, "getOptionalMax", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState$Success */
    /* loaded from: classes10.dex */
    public static final class Success implements ReviewImageState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final List f98388a;

        /* renamed from: b */
        public final int f98389b;

        /* renamed from: c */
        public final int f98390c;

        public Success(@NotNull List<Bitmap> data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f98388a = data;
            this.f98389b = i;
            this.f98390c = i2;
        }

        @NotNull
        public final List<Bitmap> getData() {
            return this.f98388a;
        }

        public final int getOptionalCount() {
            return this.f98389b;
        }

        public final int getOptionalMax() {
            return this.f98390c;
        }
    }
}