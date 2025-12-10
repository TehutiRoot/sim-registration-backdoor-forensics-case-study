package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, m28850d2 = {"Landroidx/compose/animation/TransitionData;", "", "Landroidx/compose/animation/Fade;", "fade", "Landroidx/compose/animation/Slide;", "slide", "Landroidx/compose/animation/ChangeSize;", "changeSize", "Landroidx/compose/animation/Scale;", "scale", "<init>", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;)V", "component1", "()Landroidx/compose/animation/Fade;", "component2", "()Landroidx/compose/animation/Slide;", "component3", "()Landroidx/compose/animation/ChangeSize;", "component4", "()Landroidx/compose/animation/Scale;", "copy", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;)Landroidx/compose/animation/TransitionData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/Fade;", "getFade", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/Slide;", "getSlide", OperatorName.CURVE_TO, "Landroidx/compose/animation/ChangeSize;", "getChangeSize", "d", "Landroidx/compose/animation/Scale;", "getScale", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransitionData {

    /* renamed from: a */
    public final Fade f12403a;

    /* renamed from: b */
    public final Slide f12404b;

    /* renamed from: c */
    public final ChangeSize f12405c;

    /* renamed from: d */
    public final Scale f12406d;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i, Object obj) {
        if ((i & 1) != 0) {
            fade = transitionData.f12403a;
        }
        if ((i & 2) != 0) {
            slide = transitionData.f12404b;
        }
        if ((i & 4) != 0) {
            changeSize = transitionData.f12405c;
        }
        if ((i & 8) != 0) {
            scale = transitionData.f12406d;
        }
        return transitionData.copy(fade, slide, changeSize, scale);
    }

    @Nullable
    public final Fade component1() {
        return this.f12403a;
    }

    @Nullable
    public final Slide component2() {
        return this.f12404b;
    }

    @Nullable
    public final ChangeSize component3() {
        return this.f12405c;
    }

    @Nullable
    public final Scale component4() {
        return this.f12406d;
    }

    @NotNull
    public final TransitionData copy(@Nullable Fade fade, @Nullable Slide slide, @Nullable ChangeSize changeSize, @Nullable Scale scale) {
        return new TransitionData(fade, slide, changeSize, scale);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransitionData) {
            TransitionData transitionData = (TransitionData) obj;
            return Intrinsics.areEqual(this.f12403a, transitionData.f12403a) && Intrinsics.areEqual(this.f12404b, transitionData.f12404b) && Intrinsics.areEqual(this.f12405c, transitionData.f12405c) && Intrinsics.areEqual(this.f12406d, transitionData.f12406d);
        }
        return false;
    }

    @Nullable
    public final ChangeSize getChangeSize() {
        return this.f12405c;
    }

    @Nullable
    public final Fade getFade() {
        return this.f12403a;
    }

    @Nullable
    public final Scale getScale() {
        return this.f12406d;
    }

    @Nullable
    public final Slide getSlide() {
        return this.f12404b;
    }

    public int hashCode() {
        Fade fade = this.f12403a;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.f12404b;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.f12405c;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.f12406d;
        return hashCode3 + (scale != null ? scale.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.f12403a + ", slide=" + this.f12404b + ", changeSize=" + this.f12405c + ", scale=" + this.f12406d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TransitionData(@Nullable Fade fade, @Nullable Slide slide, @Nullable ChangeSize changeSize, @Nullable Scale scale) {
        this.f12403a = fade;
        this.f12404b = slide;
        this.f12405c = changeSize;
        this.f12406d = scale;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale);
    }
}
