package th.p047co.dtac.android.dtacone.view.fragment.take_photo.camera;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/take_photo/camera/FaceRecognitionPhoto;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "idNumber", "Landroid/graphics/Bitmap;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/Bitmap;", "getIdCardPhoto", "()Landroid/graphics/Bitmap;", "setIdCardPhoto", "(Landroid/graphics/Bitmap;)V", "idCardPhoto", OperatorName.CURVE_TO, "getFacePhoto", "setFacePhoto", "facePhoto", "d", "getImageCardTemplate", "setImageCardTemplate", "imageCardTemplate", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.take_photo.camera.FaceRecognitionPhoto */
/* loaded from: classes9.dex */
public final class FaceRecognitionPhoto {
    public static final int $stable = 8;

    /* renamed from: a */
    public String f104934a = "";

    /* renamed from: b */
    public Bitmap f104935b;

    /* renamed from: c */
    public Bitmap f104936c;

    /* renamed from: d */
    public Bitmap f104937d;

    @Nullable
    public final Bitmap getFacePhoto() {
        return this.f104936c;
    }

    @Nullable
    public final Bitmap getIdCardPhoto() {
        return this.f104935b;
    }

    @NotNull
    public final String getIdNumber() {
        return this.f104934a;
    }

    @Nullable
    public final Bitmap getImageCardTemplate() {
        return this.f104937d;
    }

    public final void setFacePhoto(@Nullable Bitmap bitmap) {
        this.f104936c = bitmap;
    }

    public final void setIdCardPhoto(@Nullable Bitmap bitmap) {
        this.f104935b = bitmap;
    }

    public final void setIdNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f104934a = str;
    }

    public final void setImageCardTemplate(@Nullable Bitmap bitmap) {
        this.f104937d = bitmap;
    }
}