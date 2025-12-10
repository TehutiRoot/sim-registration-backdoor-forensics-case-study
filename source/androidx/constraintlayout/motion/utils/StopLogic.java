package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes2.dex */
public class StopLogic extends MotionInterpolator {

    /* renamed from: a */
    public StopLogicEngine f32665a;

    /* renamed from: b */
    public SpringStopEngine f32666b;

    /* renamed from: c */
    public StopEngine f32667c;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.f32665a = stopLogicEngine;
        this.f32667c = stopLogicEngine;
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        StopLogicEngine stopLogicEngine = this.f32665a;
        this.f32667c = stopLogicEngine;
        stopLogicEngine.config(f, f2, f3, f4, f5, f6);
    }

    public String debug(String str, float f) {
        return this.f32667c.debug(str, f);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.f32667c.getInterpolation(f);
    }

    public float getVelocity(float f) {
        return this.f32667c.getVelocity(f);
    }

    public boolean isStopped() {
        return this.f32667c.isStopped();
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f32666b == null) {
            this.f32666b = new SpringStopEngine();
        }
        SpringStopEngine springStopEngine = this.f32666b;
        this.f32667c = springStopEngine;
        springStopEngine.springConfig(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.f32667c.getVelocity();
    }
}
