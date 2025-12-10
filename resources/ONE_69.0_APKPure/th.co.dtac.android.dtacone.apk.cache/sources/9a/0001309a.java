package th.p047co.dtac.android.dtacone.view.appOne.eSign.state;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "", "DocumentDetected", "FaceDetected", "FaceNotDetected", "Idle", "Preview", "TakingPhoto", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState */
/* loaded from: classes10.dex */
public interface OneUnifyTakePhotoState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$FaceNotDetected;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$FaceNotDetected */
    /* loaded from: classes10.dex */
    public static final class FaceNotDetected implements OneUnifyTakePhotoState {
        public static final int $stable = 0;
        @NotNull
        public static final FaceNotDetected INSTANCE = new FaceNotDetected();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$Idle;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$Idle */
    /* loaded from: classes10.dex */
    public static final class Idle implements OneUnifyTakePhotoState {
        public static final int $stable = 0;
        @NotNull
        public static final Idle INSTANCE = new Idle();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$Preview;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "component1", "()Landroid/graphics/Bitmap;", "copy", "(Landroid/graphics/Bitmap;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$Preview;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$Preview */
    /* loaded from: classes10.dex */
    public static final class Preview implements OneUnifyTakePhotoState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Bitmap f90924a;

        public Preview(@Nullable Bitmap bitmap) {
            this.f90924a = bitmap;
        }

        public static /* synthetic */ Preview copy$default(Preview preview, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = preview.f90924a;
            }
            return preview.copy(bitmap);
        }

        @Nullable
        public final Bitmap component1() {
            return this.f90924a;
        }

        @NotNull
        public final Preview copy(@Nullable Bitmap bitmap) {
            return new Preview(bitmap);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Preview) && Intrinsics.areEqual(this.f90924a, ((Preview) obj).f90924a);
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.f90924a;
        }

        public int hashCode() {
            Bitmap bitmap = this.f90924a;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.hashCode();
        }

        @NotNull
        public String toString() {
            Bitmap bitmap = this.f90924a;
            return "Preview(bitmap=" + bitmap + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$TakingPhoto;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$TakingPhoto */
    /* loaded from: classes10.dex */
    public static final class TakingPhoto implements OneUnifyTakePhotoState {
        public static final int $stable = 0;
        @NotNull
        public static final TakingPhoto INSTANCE = new TakingPhoto();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\f¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$DocumentDetected;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "Landroid/graphics/Bitmap;", "bitmap", "", "confirmPreview", "takeMore", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$DocumentDetected;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", "getConfirmPreview", OperatorName.CURVE_TO, "getTakeMore", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$DocumentDetected */
    /* loaded from: classes10.dex */
    public static final class DocumentDetected implements OneUnifyTakePhotoState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Bitmap f90918a;

        /* renamed from: b */
        public final Boolean f90919b;

        /* renamed from: c */
        public final Boolean f90920c;

        public DocumentDetected(@Nullable Bitmap bitmap, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.f90918a = bitmap;
            this.f90919b = bool;
            this.f90920c = bool2;
        }

        public static /* synthetic */ DocumentDetected copy$default(DocumentDetected documentDetected, Bitmap bitmap, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = documentDetected.f90918a;
            }
            if ((i & 2) != 0) {
                bool = documentDetected.f90919b;
            }
            if ((i & 4) != 0) {
                bool2 = documentDetected.f90920c;
            }
            return documentDetected.copy(bitmap, bool, bool2);
        }

        @Nullable
        public final Bitmap component1() {
            return this.f90918a;
        }

        @Nullable
        public final Boolean component2() {
            return this.f90919b;
        }

        @Nullable
        public final Boolean component3() {
            return this.f90920c;
        }

        @NotNull
        public final DocumentDetected copy(@Nullable Bitmap bitmap, @Nullable Boolean bool, @Nullable Boolean bool2) {
            return new DocumentDetected(bitmap, bool, bool2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DocumentDetected) {
                DocumentDetected documentDetected = (DocumentDetected) obj;
                return Intrinsics.areEqual(this.f90918a, documentDetected.f90918a) && Intrinsics.areEqual(this.f90919b, documentDetected.f90919b) && Intrinsics.areEqual(this.f90920c, documentDetected.f90920c);
            }
            return false;
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.f90918a;
        }

        @Nullable
        public final Boolean getConfirmPreview() {
            return this.f90919b;
        }

        @Nullable
        public final Boolean getTakeMore() {
            return this.f90920c;
        }

        public int hashCode() {
            Bitmap bitmap = this.f90918a;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Boolean bool = this.f90919b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f90920c;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Bitmap bitmap = this.f90918a;
            Boolean bool = this.f90919b;
            Boolean bool2 = this.f90920c;
            return "DocumentDetected(bitmap=" + bitmap + ", confirmPreview=" + bool + ", takeMore=" + bool2 + ")";
        }

        public /* synthetic */ DocumentDetected(Bitmap bitmap, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\f¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$FaceDetected;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState;", "Landroid/graphics/Bitmap;", "bitmap", "", "confirmPreview", "takeMore", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/lang/Boolean;", "component3", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/view/appOne/eSign/state/OneUnifyTakePhotoState$FaceDetected;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", "getConfirmPreview", OperatorName.CURVE_TO, "getTakeMore", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.state.OneUnifyTakePhotoState$FaceDetected */
    /* loaded from: classes10.dex */
    public static final class FaceDetected implements OneUnifyTakePhotoState {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Bitmap f90921a;

        /* renamed from: b */
        public final Boolean f90922b;

        /* renamed from: c */
        public final Boolean f90923c;

        public FaceDetected(@Nullable Bitmap bitmap, @Nullable Boolean bool, @Nullable Boolean bool2) {
            this.f90921a = bitmap;
            this.f90922b = bool;
            this.f90923c = bool2;
        }

        public static /* synthetic */ FaceDetected copy$default(FaceDetected faceDetected, Bitmap bitmap, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = faceDetected.f90921a;
            }
            if ((i & 2) != 0) {
                bool = faceDetected.f90922b;
            }
            if ((i & 4) != 0) {
                bool2 = faceDetected.f90923c;
            }
            return faceDetected.copy(bitmap, bool, bool2);
        }

        @Nullable
        public final Bitmap component1() {
            return this.f90921a;
        }

        @Nullable
        public final Boolean component2() {
            return this.f90922b;
        }

        @Nullable
        public final Boolean component3() {
            return this.f90923c;
        }

        @NotNull
        public final FaceDetected copy(@Nullable Bitmap bitmap, @Nullable Boolean bool, @Nullable Boolean bool2) {
            return new FaceDetected(bitmap, bool, bool2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FaceDetected) {
                FaceDetected faceDetected = (FaceDetected) obj;
                return Intrinsics.areEqual(this.f90921a, faceDetected.f90921a) && Intrinsics.areEqual(this.f90922b, faceDetected.f90922b) && Intrinsics.areEqual(this.f90923c, faceDetected.f90923c);
            }
            return false;
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.f90921a;
        }

        @Nullable
        public final Boolean getConfirmPreview() {
            return this.f90922b;
        }

        @Nullable
        public final Boolean getTakeMore() {
            return this.f90923c;
        }

        public int hashCode() {
            Bitmap bitmap = this.f90921a;
            int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Boolean bool = this.f90922b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f90923c;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Bitmap bitmap = this.f90921a;
            Boolean bool = this.f90922b;
            Boolean bool2 = this.f90923c;
            return "FaceDetected(bitmap=" + bitmap + ", confirmPreview=" + bool + ", takeMore=" + bool2 + ")";
        }

        public /* synthetic */ FaceDetected(Bitmap bitmap, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2);
        }
    }
}