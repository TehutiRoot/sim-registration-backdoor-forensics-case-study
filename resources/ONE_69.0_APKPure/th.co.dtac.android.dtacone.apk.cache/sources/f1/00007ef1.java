package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes3.dex */
public class PolystarContent implements InterfaceC18284Pi1, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {

    /* renamed from: b */
    public final String f41116b;

    /* renamed from: c */
    public final LottieDrawable f41117c;

    /* renamed from: d */
    public final PolystarShape.Type f41118d;

    /* renamed from: e */
    public final boolean f41119e;

    /* renamed from: f */
    public final boolean f41120f;

    /* renamed from: g */
    public final BaseKeyframeAnimation f41121g;

    /* renamed from: h */
    public final BaseKeyframeAnimation f41122h;

    /* renamed from: i */
    public final BaseKeyframeAnimation f41123i;

    /* renamed from: j */
    public final BaseKeyframeAnimation f41124j;

    /* renamed from: k */
    public final BaseKeyframeAnimation f41125k;

    /* renamed from: l */
    public final BaseKeyframeAnimation f41126l;

    /* renamed from: m */
    public final BaseKeyframeAnimation f41127m;

    /* renamed from: o */
    public boolean f41129o;

    /* renamed from: a */
    public final Path f41115a = new Path();

    /* renamed from: n */
    public final CompoundTrimPathContent f41128n = new CompoundTrimPathContent();

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5672a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41130a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f41130a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41130a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.f41117c = lottieDrawable;
        this.f41116b = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.f41118d = type;
        this.f41119e = polystarShape.isHidden();
        this.f41120f = polystarShape.isReversed();
        BaseKeyframeAnimation<Float, Float> createAnimation = polystarShape.getPoints().createAnimation();
        this.f41121g = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = polystarShape.getPosition().createAnimation();
        this.f41122h = createAnimation2;
        BaseKeyframeAnimation<Float, Float> createAnimation3 = polystarShape.getRotation().createAnimation();
        this.f41123i = createAnimation3;
        BaseKeyframeAnimation<Float, Float> createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.f41125k = createAnimation4;
        BaseKeyframeAnimation<Float, Float> createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.f41127m = createAnimation5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f41124j = polystarShape.getInnerRadius().createAnimation();
            this.f41126l = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.f41124j = null;
            this.f41126l = null;
        }
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        baseLayer.addAnimation(createAnimation4);
        baseLayer.addAnimation(createAnimation5);
        if (type == type2) {
            baseLayer.addAnimation(this.f41124j);
            baseLayer.addAnimation(this.f41126l);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type == type2) {
            this.f41124j.addUpdateListener(this);
            this.f41126l.addUpdateListener(this);
        }
    }

    /* renamed from: c */
    private void m50882c() {
        this.f41129o = false;
        this.f41117c.invalidateSelf();
    }

    /* renamed from: a */
    public final void m50884a() {
        double floatValue;
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(((Float) this.f41121g.getValue()).floatValue());
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41123i;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0d;
        } else {
            floatValue = ((Float) baseKeyframeAnimation.getValue()).floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floor;
        float floatValue2 = ((Float) this.f41127m.getValue()).floatValue() / 100.0f;
        float floatValue3 = ((Float) this.f41125k.getValue()).floatValue();
        double d5 = floatValue3;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f41115a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue2 != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue3 * floatValue2 * 0.25f;
                this.f41115a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f41115a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF pointF = (PointF) this.f41122h.getValue();
        this.f41115a.offset(pointF.x, pointF.y);
        this.f41115a.close();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation baseKeyframeAnimation;
        BaseKeyframeAnimation baseKeyframeAnimation2;
        if (t == LottieProperty.POLYSTAR_POINTS) {
            this.f41121g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_ROTATION) {
            this.f41123i.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POSITION) {
            this.f41122h.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.f41124j) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.f41125k.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.f41126l) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.f41127m.setValueCallback(lottieValueCallback);
        }
    }

    /* renamed from: b */
    public final void m50883b() {
        double floatValue;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        float f12;
        double d3;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue2 = ((Float) this.f41121g.getValue()).floatValue();
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41123i;
        if (baseKeyframeAnimation == null) {
            floatValue = 0.0d;
        } else {
            floatValue = ((Float) baseKeyframeAnimation.getValue()).floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floatValue2;
        float f17 = (float) (6.283185307179586d / d4);
        if (this.f41120f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue2 - ((int) floatValue2);
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue3 = ((Float) this.f41125k.getValue()).floatValue();
        float floatValue4 = ((Float) this.f41124j.getValue()).floatValue();
        BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41126l;
        if (baseKeyframeAnimation2 != null) {
            f = ((Float) baseKeyframeAnimation2.getValue()).floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41127m;
        if (baseKeyframeAnimation3 != null) {
            f2 = ((Float) baseKeyframeAnimation3.getValue()).floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f6 = ((floatValue3 - floatValue4) * f19) + floatValue4;
            i = i2;
            double d5 = f6;
            float cos = (float) (d5 * Math.cos(radians));
            f5 = (float) (d5 * Math.sin(radians));
            this.f41115a.moveTo(cos, f5);
            d = radians + ((f17 * f19) / 2.0f);
            f3 = cos;
            f4 = f18;
        } else {
            i = i2;
            double d6 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f41115a.moveTo(cos2, sin);
            f3 = cos2;
            f4 = f18;
            d = radians + f4;
            f5 = sin;
            f6 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f20 = f4;
        float f21 = f3;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                if (z) {
                    f7 = floatValue3;
                } else {
                    f7 = floatValue4;
                }
                int i4 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i4 != 0 && d7 == ceil - 2.0d) {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                } else {
                    f8 = f17;
                    f9 = f20;
                }
                if (i4 != 0 && d7 == ceil - 1.0d) {
                    d2 = d7;
                    f10 = f6;
                } else {
                    d2 = d7;
                    f10 = f6;
                    f6 = f7;
                }
                double d8 = f6;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (f == 0.0f && f2 == 0.0f) {
                    this.f41115a.lineTo(cos3, sin2);
                    d3 = d;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (float) (Math.atan2(f5, f21) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = floatValue4;
                    } else {
                        f15 = floatValue3;
                    }
                    if (z) {
                        f16 = floatValue3;
                    } else {
                        f16 = floatValue4;
                    }
                    float f22 = f15 * f13 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin3;
                    float f25 = f16 * f14 * 0.47829f;
                    float f26 = cos5 * f25;
                    float f27 = f25 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f23 *= f19;
                            f24 *= f19;
                        } else if (d2 == d9 - 1.0d) {
                            f26 *= f19;
                            f27 *= f19;
                        }
                    }
                    this.f41115a.cubicTo(f21 - f23, f5 - f24, cos3 + f26, sin2 + f27, cos3, sin2);
                }
                d = d3 + f9;
                z = !z;
                i3++;
                f21 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f6 = f10;
                f17 = f8;
                ceil = d9;
            } else {
                PointF pointF = (PointF) this.f41122h.getValue();
                this.f41115a.offset(pointF.x, pointF.y);
                this.f41115a.close();
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f41116b;
    }

    @Override // p000.InterfaceC18284Pi1
    public Path getPath() {
        if (this.f41129o) {
            return this.f41115a;
        }
        this.f41115a.reset();
        if (this.f41119e) {
            this.f41129o = true;
            return this.f41115a;
        }
        int i = C5672a.f41130a[this.f41118d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m50884a();
            }
        } else {
            m50883b();
        }
        this.f41115a.close();
        this.f41128n.apply(this.f41115a);
        this.f41129o = true;
        return this.f41115a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        m50882c();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.m50875b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f41128n.m50901a(trimPathContent);
                    trimPathContent.m50876a(this);
                }
            }
        }
    }
}