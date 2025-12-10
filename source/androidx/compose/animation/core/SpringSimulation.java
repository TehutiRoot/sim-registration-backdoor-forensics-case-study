package androidx.compose.animation.core;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0005R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0019R*\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0005R$\u0010,\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0005\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, m28850d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "getAcceleration", "(FF)F", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "F", "getFinalPosition", "()F", "setFinalPosition", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "D", "naturalFreq", "", OperatorName.CURVE_TO, "Z", "initialized", "d", "gammaPlus", "e", "gammaMinus", OperatorName.FILL_NON_ZERO, "dampedFreq", "value", OperatorName.NON_STROKING_GRAY, "getDampingRatio", "setDampingRatio", "dampingRatio", "getStiffness", "setStiffness", "stiffness", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SpringSimulation {

    /* renamed from: a */
    public float f12569a;

    /* renamed from: c */
    public boolean f12571c;

    /* renamed from: d */
    public double f12572d;

    /* renamed from: e */
    public double f12573e;

    /* renamed from: f */
    public double f12574f;

    /* renamed from: b */
    public double f12570b = Math.sqrt(50.0d);

    /* renamed from: g */
    public float f12575g = 1.0f;

    public SpringSimulation(float f) {
        this.f12569a = f;
    }

    /* renamed from: a */
    public final void m61685a() {
        if (this.f12571c) {
            return;
        }
        if (this.f12569a != SpringSimulationKt.getUNSET()) {
            float f = this.f12575g;
            double d = f * f;
            if (f > 1.0f) {
                double d2 = this.f12570b;
                double d3 = d - 1;
                this.f12572d = ((-f) * d2) + (d2 * Math.sqrt(d3));
                double d4 = this.f12570b;
                this.f12573e = ((-this.f12575g) * d4) - (d4 * Math.sqrt(d3));
            } else if (f >= 0.0f && f < 1.0f) {
                this.f12574f = this.f12570b * Math.sqrt(1 - d);
            }
            this.f12571c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final float getAcceleration(float f, float f2) {
        float f3 = f - this.f12569a;
        double d = this.f12570b;
        return (float) (((-(d * d)) * f3) - (((d * 2.0d) * this.f12575g) * f2));
    }

    public final float getDampingRatio() {
        return this.f12575g;
    }

    public final float getFinalPosition() {
        return this.f12569a;
    }

    public final float getStiffness() {
        double d = this.f12570b;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f >= 0.0f) {
            this.f12575g = f;
            this.f12571c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void setFinalPosition(float f) {
        this.f12569a = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() > 0.0f) {
            this.f12570b = Math.sqrt(f);
            this.f12571c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release  reason: not valid java name */
    public final long m69278updateValuesIJZedt4$animation_core_release(float f, float f2, long j) {
        float f3;
        double cos;
        double d;
        m61685a();
        float f4 = f - this.f12569a;
        double d2 = j / 1000.0d;
        float f5 = this.f12575g;
        if (f5 > 1.0f) {
            double d3 = f4;
            double d4 = this.f12573e;
            double d5 = f2;
            double d6 = this.f12572d;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            d = (Math.exp(d4 * d2) * d7) + (Math.exp(this.f12572d * d2) * d8);
            double d9 = this.f12573e;
            double exp = d7 * d9 * Math.exp(d9 * d2);
            double d10 = this.f12572d;
            cos = exp + (d8 * d10 * Math.exp(d10 * d2));
        } else if (f5 == 1.0f) {
            double d11 = this.f12570b;
            double d12 = f4;
            double d13 = f2 + (d11 * d12);
            double d14 = d12 + (d13 * d2);
            double exp2 = Math.exp((-d11) * d2) * d14;
            double exp3 = d14 * Math.exp((-this.f12570b) * d2);
            double d15 = this.f12570b;
            cos = (exp3 * (-d15)) + (d13 * Math.exp((-d15) * d2));
            d = exp2;
        } else {
            double d16 = this.f12570b;
            double d17 = f4;
            double d18 = (1 / this.f12574f) * ((f5 * d16 * d17) + f2);
            double exp4 = Math.exp((-f5) * d16 * d2) * ((Math.cos(this.f12574f * d2) * d17) + (Math.sin(this.f12574f * d2) * d18));
            double d19 = this.f12570b;
            double d20 = (-d19) * exp4 * this.f12575g;
            double exp5 = Math.exp((-f3) * d19 * d2);
            double d21 = this.f12574f;
            double sin = (-d21) * d17 * Math.sin(d21 * d2);
            double d22 = this.f12574f;
            cos = d20 + (exp5 * (sin + (d18 * d22 * Math.cos(d22 * d2))));
            d = exp4;
        }
        return SpringSimulationKt.Motion((float) (d + this.f12569a), (float) cos);
    }
}
