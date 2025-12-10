package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapeStroke implements ContentModel {

    /* renamed from: a */
    public final String f41398a;

    /* renamed from: b */
    public final AnimatableFloatValue f41399b;

    /* renamed from: c */
    public final List f41400c;

    /* renamed from: d */
    public final AnimatableColorValue f41401d;

    /* renamed from: e */
    public final AnimatableIntegerValue f41402e;

    /* renamed from: f */
    public final AnimatableFloatValue f41403f;

    /* renamed from: g */
    public final LineCapType f41404g;

    /* renamed from: h */
    public final LineJoinType f41405h;

    /* renamed from: i */
    public final float f41406i;

    /* renamed from: j */
    public final boolean f41407j;

    /* loaded from: classes3.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C5704a.f41408a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes3.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C5704a.f41409b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5704a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41408a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f41409b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f41409b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41409b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41409b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f41408a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41408a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41408a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f41398a = str;
        this.f41399b = animatableFloatValue;
        this.f41400c = list;
        this.f41401d = animatableColorValue;
        this.f41402e = animatableIntegerValue;
        this.f41403f = animatableFloatValue2;
        this.f41404g = lineCapType;
        this.f41405h = lineJoinType;
        this.f41406i = f;
        this.f41407j = z;
    }

    public LineCapType getCapType() {
        return this.f41404g;
    }

    public AnimatableColorValue getColor() {
        return this.f41401d;
    }

    public AnimatableFloatValue getDashOffset() {
        return this.f41399b;
    }

    public LineJoinType getJoinType() {
        return this.f41405h;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.f41400c;
    }

    public float getMiterLimit() {
        return this.f41406i;
    }

    public String getName() {
        return this.f41398a;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.f41402e;
    }

    public AnimatableFloatValue getWidth() {
        return this.f41403f;
    }

    public boolean isHidden() {
        return this.f41407j;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}
