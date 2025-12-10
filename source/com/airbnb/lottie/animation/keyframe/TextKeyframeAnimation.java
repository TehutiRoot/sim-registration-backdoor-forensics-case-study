package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class TextKeyframeAnimation extends AbstractC18114Nh0 {

    /* renamed from: com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation$a */
    /* loaded from: classes3.dex */
    public class C5690a extends LottieValueCallback {

        /* renamed from: c */
        public final /* synthetic */ LottieFrameInfo f41203c;

        /* renamed from: d */
        public final /* synthetic */ LottieValueCallback f41204d;

        /* renamed from: e */
        public final /* synthetic */ DocumentData f41205e;

        public C5690a(LottieFrameInfo lottieFrameInfo, LottieValueCallback lottieValueCallback, DocumentData documentData) {
            this.f41203c = lottieFrameInfo;
            this.f41204d = lottieValueCallback;
            this.f41205e = documentData;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* renamed from: a */
        public DocumentData getValue(LottieFrameInfo lottieFrameInfo) {
            Object startValue;
            this.f41203c.set(lottieFrameInfo.getStartFrame(), lottieFrameInfo.getEndFrame(), ((DocumentData) lottieFrameInfo.getStartValue()).text, ((DocumentData) lottieFrameInfo.getEndValue()).text, lottieFrameInfo.getLinearKeyframeProgress(), lottieFrameInfo.getInterpolatedKeyframeProgress(), lottieFrameInfo.getOverallProgress());
            String str = (String) this.f41204d.getValue(this.f41203c);
            if (lottieFrameInfo.getInterpolatedKeyframeProgress() == 1.0f) {
                startValue = lottieFrameInfo.getEndValue();
            } else {
                startValue = lottieFrameInfo.getStartValue();
            }
            DocumentData documentData = (DocumentData) startValue;
            this.f41205e.set(str, documentData.fontName, documentData.size, documentData.justification, documentData.tracking, documentData.lineHeight, documentData.baselineShift, documentData.color, documentData.strokeColor, documentData.strokeWidth, documentData.strokeOverFill, documentData.boxPosition, documentData.boxSize);
            return this.f41205e;
        }
    }

    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: e */
    public DocumentData getValue(Keyframe keyframe, float f) {
        Object obj;
        float floatValue;
        DocumentData documentData;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != 0) {
            float f2 = keyframe.startFrame;
            Float f3 = keyframe.endFrame;
            if (f3 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f3.floatValue();
            }
            Object obj2 = keyframe.startValue;
            DocumentData documentData2 = (DocumentData) obj2;
            Object obj3 = keyframe.endValue;
            if (obj3 == null) {
                documentData = (DocumentData) obj2;
            } else {
                documentData = (DocumentData) obj3;
            }
            return (DocumentData) lottieValueCallback.getValueInternal(f2, floatValue, documentData2, documentData, f, getInterpolatedCurrentKeyframeProgress(), getProgress());
        } else if (f == 1.0f && (obj = keyframe.endValue) != null) {
            return (DocumentData) obj;
        } else {
            return (DocumentData) keyframe.startValue;
        }
    }

    public void setStringValueCallback(LottieValueCallback<String> lottieValueCallback) {
        super.setValueCallback(new C5690a(new LottieFrameInfo(), lottieValueCallback, new DocumentData()));
    }
}
