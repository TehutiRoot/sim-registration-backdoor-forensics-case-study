package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001a\u0010.\u001a\u00020\u000e8\u0010X\u0090D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010 ¨\u0006/"}, m28850d2 = {"Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "<init>", "(FF)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector2D;", "newVector", "", FirebaseAnalytics.Param.INDEX, "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getV2", "setV2$animation_core_release", OperatorName.CURVE_TO, "I", "getSize$animation_core_release", "size", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;

    /* renamed from: a */
    public float f12448a;

    /* renamed from: b */
    public float f12449b;

    /* renamed from: c */
    public final int f12450c;

    public AnimationVector2D(float f, float f2) {
        super(null);
        this.f12448a = f;
        this.f12449b = f2;
        this.f12450c = 2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            if (animationVector2D.f12448a == this.f12448a && animationVector2D.f12449b == this.f12449b) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.f12449b;
        }
        return this.f12448a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.f12450c;
    }

    public final float getV1() {
        return this.f12448a;
    }

    public final float getV2() {
        return this.f12449b;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f12448a) * 31) + Float.floatToIntBits(this.f12449b);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f12448a = 0.0f;
        this.f12449b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i == 1) {
                this.f12449b = f;
                return;
            }
            return;
        }
        this.f12448a = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f12448a = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f12449b = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f12448a + ", v2 = " + this.f12449b;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }
}
