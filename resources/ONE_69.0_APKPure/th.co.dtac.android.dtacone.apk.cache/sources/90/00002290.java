package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0090\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u00102\u001a\u00020\u000f8\u0010X\u0090D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010!¨\u00063"}, m29142d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "v3", "<init>", "(FFF)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector3D;", "newVector", "", FirebaseAnalytics.Param.INDEX, "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getV2", "setV2$animation_core_release", OperatorName.CURVE_TO, "getV3", "setV3$animation_core_release", "d", "I", "getSize$animation_core_release", "size", "animation-core_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector3D extends AnimationVector {
    public static final int $stable = 8;

    /* renamed from: a */
    public float f12539a;

    /* renamed from: b */
    public float f12540b;

    /* renamed from: c */
    public float f12541c;

    /* renamed from: d */
    public final int f12542d;

    public AnimationVector3D(float f, float f2, float f3) {
        super(null);
        this.f12539a = f;
        this.f12540b = f2;
        this.f12541c = f3;
        this.f12542d = 3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) obj;
            if (animationVector3D.f12539a == this.f12539a && animationVector3D.f12540b == this.f12540b && animationVector3D.f12541c == this.f12541c) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.f12541c;
            }
            return this.f12540b;
        }
        return this.f12539a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.f12542d;
    }

    public final float getV1() {
        return this.f12539a;
    }

    public final float getV2() {
        return this.f12540b;
    }

    public final float getV3() {
        return this.f12541c;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f12539a) * 31) + Float.floatToIntBits(this.f12540b)) * 31) + Float.floatToIntBits(this.f12541c);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f12539a = 0.0f;
        this.f12540b = 0.0f;
        this.f12541c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.f12541c = f;
                    return;
                }
                return;
            }
            this.f12540b = f;
            return;
        }
        this.f12539a = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f12539a = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f12540b = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f12541c = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f12539a + ", v2 = " + this.f12540b + ", v3 = " + this.f12541c;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector3D newVector$animation_core_release() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }
}