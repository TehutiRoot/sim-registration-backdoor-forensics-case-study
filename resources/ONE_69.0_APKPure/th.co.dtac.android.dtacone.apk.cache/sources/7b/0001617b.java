package p000;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* renamed from: xn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC23090xn0 extends LottieValueCallback {

    /* renamed from: c */
    public final Object f108852c;

    /* renamed from: d */
    public final Object f108853d;

    /* renamed from: e */
    public final Interpolator f108854e;

    public AbstractC23090xn0(Object obj, Object obj2) {
        this(obj, obj2, new LinearInterpolator());
    }

    /* renamed from: a */
    public abstract Object mo480a(Object obj, Object obj2, float f);

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public Object getValue(LottieFrameInfo lottieFrameInfo) {
        return mo480a(this.f108852c, this.f108853d, this.f108854e.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public AbstractC23090xn0(Object obj, Object obj2, Interpolator interpolator) {
        this.f108852c = obj;
        this.f108853d = obj2;
        this.f108854e = interpolator;
    }
}