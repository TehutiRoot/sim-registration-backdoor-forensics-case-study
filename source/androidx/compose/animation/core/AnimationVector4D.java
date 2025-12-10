package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001a\u00106\u001a\u00020\u00108\u0010X\u0090D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\"¨\u00067"}, m28850d2 = {"Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "", "reset$animation_core_release", "()V", "reset", "newVector$animation_core_release", "()Landroidx/compose/animation/core/AnimationVector4D;", "newVector", "", FirebaseAnalytics.Param.INDEX, "get$animation_core_release", "(I)F", "get", "value", "set$animation_core_release", "(IF)V", "set", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getV1", "()F", "setV1$animation_core_release", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getV2", "setV2$animation_core_release", OperatorName.CURVE_TO, "getV3", "setV3$animation_core_release", "d", "getV4", "setV4$animation_core_release", "e", "I", "getSize$animation_core_release", "size", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;

    /* renamed from: a */
    public float f12455a;

    /* renamed from: b */
    public float f12456b;

    /* renamed from: c */
    public float f12457c;

    /* renamed from: d */
    public float f12458d;

    /* renamed from: e */
    public final int f12459e;

    public AnimationVector4D(float f, float f2, float f3, float f4) {
        super(null);
        this.f12455a = f;
        this.f12456b = f2;
        this.f12457c = f3;
        this.f12458d = f4;
        this.f12459e = 4;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            if (animationVector4D.f12455a == this.f12455a && animationVector4D.f12456b == this.f12456b && animationVector4D.f12457c == this.f12457c && animationVector4D.f12458d == this.f12458d) {
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
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.f12458d;
                }
                return this.f12457c;
            }
            return this.f12456b;
        }
        return this.f12455a;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.f12459e;
    }

    public final float getV1() {
        return this.f12455a;
    }

    public final float getV2() {
        return this.f12456b;
    }

    public final float getV3() {
        return this.f12457c;
    }

    public final float getV4() {
        return this.f12458d;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f12455a) * 31) + Float.floatToIntBits(this.f12456b)) * 31) + Float.floatToIntBits(this.f12457c)) * 31) + Float.floatToIntBits(this.f12458d);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.f12455a = 0.0f;
        this.f12456b = 0.0f;
        this.f12457c = 0.0f;
        this.f12458d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f12458d = f;
                        return;
                    }
                    return;
                }
                this.f12457c = f;
                return;
            }
            this.f12456b = f;
            return;
        }
        this.f12455a = f;
    }

    public final void setV1$animation_core_release(float f) {
        this.f12455a = f;
    }

    public final void setV2$animation_core_release(float f) {
        this.f12456b = f;
    }

    public final void setV3$animation_core_release(float f) {
        this.f12457c = f;
    }

    public final void setV4$animation_core_release(float f) {
        this.f12458d = f;
    }

    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f12455a + ", v2 = " + this.f12456b + ", v3 = " + this.f12457c + ", v4 = " + this.f12458d;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    @NotNull
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
