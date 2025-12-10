package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector3D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\f*\u00020\u000b*\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28850d2 = {"T", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "durationMillis", "reversed", "(Landroidx/compose/animation/core/FiniteAnimationSpec;I)Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "Lkotlin/Pair;", "specs", "combined", "(Ljava/util/List;)Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "animation-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimatorAnimationSpecsKt {
    /* renamed from: a */
    public static final AnimationVector m61657a(AnimationVector animationVector) {
        if (animationVector instanceof AnimationVector1D) {
            return new AnimationVector1D(((AnimationVector1D) animationVector).getValue() * (-1));
        }
        if (animationVector instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) animationVector;
            float f = -1;
            return new AnimationVector2D(animationVector2D.getV1() * f, animationVector2D.getV2() * f);
        } else if (animationVector instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) animationVector;
            float f2 = -1;
            return new AnimationVector3D(animationVector3D.getV1() * f2, animationVector3D.getV2() * f2, animationVector3D.getV3() * f2);
        } else if (animationVector instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) animationVector;
            float f3 = -1;
            return new AnimationVector4D(animationVector4D.getV1() * f3, animationVector4D.getV2() * f3, animationVector4D.getV3() * f3, animationVector4D.getV4() * f3);
        } else {
            throw new RuntimeException("Unknown AnimationVector: " + animationVector);
        }
    }

    @NotNull
    public static final <T> FiniteAnimationSpec<T> combined(@NotNull List<? extends Pair<Integer, ? extends FiniteAnimationSpec<T>>> specs) {
        Intrinsics.checkNotNullParameter(specs, "specs");
        return new C1345St(specs);
    }

    @NotNull
    public static final <T> FiniteAnimationSpec<T> reversed(@NotNull FiniteAnimationSpec<T> finiteAnimationSpec, int i) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "<this>");
        return new C20130gy1(finiteAnimationSpec, i);
    }
}
