package p000;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* renamed from: rn0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21988rn0 extends LottieValueCallback {

    /* renamed from: c */
    public final Object f77405c;

    /* renamed from: d */
    public final Object f77406d;

    /* renamed from: e */
    public final Interpolator f77407e;

    public AbstractC21988rn0(Object obj, Object obj2) {
        this(obj, obj2, new LinearInterpolator());
    }

    /* renamed from: a */
    public abstract Object mo23270a(Object obj, Object obj2, float f);

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public Object getValue(LottieFrameInfo lottieFrameInfo) {
        return mo23270a(this.f77405c, this.f77406d, this.f77407e.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    public AbstractC21988rn0(Object obj, Object obj2, Interpolator interpolator) {
        this.f77405c = obj;
        this.f77406d = obj2;
        this.f77407e = interpolator;
    }
}
