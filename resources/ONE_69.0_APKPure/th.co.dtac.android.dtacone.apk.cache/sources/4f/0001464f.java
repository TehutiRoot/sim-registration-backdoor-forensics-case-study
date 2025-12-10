package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState;", "", "Error", "Idle", "PreviewPhoto", "TakingPhoto", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$Idle;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$PreviewPhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$TakingPhoto;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState */
/* loaded from: classes10.dex */
public interface TakePhotoOptionalState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements TakePhotoOptionalState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f98411a;

        public Error(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f98411a = message;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.f98411a;
            }
            return error.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f98411a;
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
            return (obj instanceof Error) && Intrinsics.areEqual(this.f98411a, ((Error) obj).f98411a);
        }

        @NotNull
        public final String getMessage() {
            return this.f98411a;
        }

        public int hashCode() {
            return this.f98411a.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f98411a;
            return "Error(message=" + str + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$Idle;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState$Idle */
    /* loaded from: classes10.dex */
    public static final class Idle implements TakePhotoOptionalState {
        public static final int $stable = 0;
        @NotNull
        public static final Idle INSTANCE = new Idle();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$PreviewPhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$PreviewPhoto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState$PreviewPhoto */
    /* loaded from: classes10.dex */
    public static final class PreviewPhoto implements TakePhotoOptionalState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Bitmap f98412a;

        public PreviewPhoto(@Nullable Bitmap bitmap) {
            this.f98412a = bitmap;
        }

        public static /* synthetic */ PreviewPhoto copy$default(PreviewPhoto previewPhoto, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = previewPhoto.f98412a;
            }
            return previewPhoto.copy(bitmap);
        }

        @Nullable
        public final Bitmap component1() {
            return this.f98412a;
        }

        @NotNull
        public final PreviewPhoto copy(@Nullable Bitmap bitmap) {
            return new PreviewPhoto(bitmap);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreviewPhoto) && Intrinsics.areEqual(this.f98412a, ((PreviewPhoto) obj).f98412a);
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.f98412a;
        }

        public int hashCode() {
            Bitmap bitmap = this.f98412a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        @NotNull
        public String toString() {
            Bitmap bitmap = this.f98412a;
            return "PreviewPhoto(bitmap=" + bitmap + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState$TakingPhoto;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/TakePhotoOptionalState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState$TakingPhoto */
    /* loaded from: classes10.dex */
    public static final class TakingPhoto implements TakePhotoOptionalState {
        public static final int $stable = 0;
        @NotNull
        public static final TakingPhoto INSTANCE = new TakingPhoto();
    }
}