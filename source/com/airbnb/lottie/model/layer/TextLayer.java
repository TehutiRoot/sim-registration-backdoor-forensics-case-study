package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class TextLayer extends BaseLayer {

    /* renamed from: D */
    public final StringBuilder f41494D;

    /* renamed from: E */
    public final RectF f41495E;

    /* renamed from: F */
    public final Matrix f41496F;

    /* renamed from: G */
    public final Paint f41497G;

    /* renamed from: H */
    public final Paint f41498H;

    /* renamed from: I */
    public final Map f41499I;

    /* renamed from: J */
    public final LongSparseArray f41500J;

    /* renamed from: K */
    public final List f41501K;

    /* renamed from: L */
    public final TextKeyframeAnimation f41502L;

    /* renamed from: M */
    public final LottieDrawable f41503M;

    /* renamed from: N */
    public final LottieComposition f41504N;

    /* renamed from: O */
    public BaseKeyframeAnimation f41505O;

    /* renamed from: P */
    public BaseKeyframeAnimation f41506P;

    /* renamed from: Q */
    public BaseKeyframeAnimation f41507Q;

    /* renamed from: R */
    public BaseKeyframeAnimation f41508R;

    /* renamed from: S */
    public BaseKeyframeAnimation f41509S;

    /* renamed from: T */
    public BaseKeyframeAnimation f41510T;

    /* renamed from: U */
    public BaseKeyframeAnimation f41511U;

    /* renamed from: V */
    public BaseKeyframeAnimation f41512V;

    /* renamed from: W */
    public BaseKeyframeAnimation f41513W;

    /* renamed from: X */
    public BaseKeyframeAnimation f41514X;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$a */
    /* loaded from: classes3.dex */
    public class C5707a extends Paint {
        public C5707a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$b */
    /* loaded from: classes3.dex */
    public class C5708b extends Paint {
        public C5708b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C5709c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41517a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f41517a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41517a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41517a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        this.f41494D = new StringBuilder(2);
        this.f41495E = new RectF();
        this.f41496F = new Matrix();
        this.f41497G = new C5707a(1);
        this.f41498H = new C5708b(1);
        this.f41499I = new HashMap();
        this.f41500J = new LongSparseArray();
        this.f41501K = new ArrayList();
        this.f41503M = lottieDrawable;
        this.f41504N = layer.m50767a();
        TextKeyframeAnimation createAnimation = layer.m50755m().createAnimation();
        this.f41502L = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        AnimatableTextProperties m50754n = layer.m50754n();
        if (m50754n != null && (animatableColorValue2 = m50754n.color) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation2 = animatableColorValue2.createAnimation();
            this.f41505O = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.f41505O);
        }
        if (m50754n != null && (animatableColorValue = m50754n.stroke) != null) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation3 = animatableColorValue.createAnimation();
            this.f41507Q = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.f41507Q);
        }
        if (m50754n != null && (animatableFloatValue2 = m50754n.strokeWidth) != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation4 = animatableFloatValue2.createAnimation();
            this.f41509S = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.f41509S);
        }
        if (m50754n != null && (animatableFloatValue = m50754n.tracking) != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation5 = animatableFloatValue.createAnimation();
            this.f41511U = createAnimation5;
            createAnimation5.addUpdateListener(this);
            addAnimation(this.f41511U);
        }
    }

    /* renamed from: A */
    public final void m50750A(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: B */
    public final void m50749B(FontCharacter fontCharacter, float f, DocumentData documentData, Canvas canvas) {
        List m50741J = m50741J(fontCharacter);
        for (int i = 0; i < m50741J.size(); i++) {
            Path path = ((ContentGroup) m50741J.get(i)).getPath();
            path.computeBounds(this.f41495E, false);
            this.f41496F.reset();
            this.f41496F.preTranslate(0.0f, (-documentData.baselineShift) * Utils.dpScale());
            this.f41496F.preScale(f, f);
            path.transform(this.f41496F);
            if (documentData.strokeOverFill) {
                m50746E(path, this.f41497G, canvas);
                m50746E(path, this.f41498H, canvas);
            } else {
                m50746E(path, this.f41498H, canvas);
                m50746E(path, this.f41497G, canvas);
            }
        }
    }

    /* renamed from: C */
    public final void m50748C(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.strokeOverFill) {
            m50750A(str, this.f41497G, canvas);
            m50750A(str, this.f41498H, canvas);
            return;
        }
        m50750A(str, this.f41498H, canvas);
        m50750A(str, this.f41497G, canvas);
    }

    /* renamed from: D */
    public final void m50747D(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String m50735y = m50735y(str, i);
            i += m50735y.length();
            m50748C(m50735y, documentData, canvas);
            canvas.translate(this.f41497G.measureText(m50735y) + f, 0.0f);
        }
    }

    /* renamed from: E */
    public final void m50746E(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: F */
    public final void m50745F(String str, DocumentData documentData, Font font, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            FontCharacter fontCharacter = this.f41504N.getCharacters().get(FontCharacter.hashFor(str.charAt(i), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                m50749B(fontCharacter, f2, documentData, canvas);
                canvas.translate((((float) fontCharacter.getWidth()) * f2 * Utils.dpScale()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m50744G(com.airbnb.lottie.model.DocumentData r19, com.airbnb.lottie.model.Font r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.m50739L(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.text
            com.airbnb.lottie.LottieDrawable r2 = r7.f41503M
            com.airbnb.lottie.TextDelegate r2 = r2.getTextDelegate()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.getName()
            java.lang.String r1 = r2.getTextInternal(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.f41497G
            r2.setTypeface(r0)
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r0 = r7.f41513W
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.size
        L37:
            android.graphics.Paint r2 = r7.f41497G
            float r3 = com.airbnb.lottie.utils.Utils.dpScale()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f41498H
            android.graphics.Paint r3 = r7.f41497G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f41498H
            android.graphics.Paint r3 = r7.f41497G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.tracking
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r3 = r7.f41512V
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6c:
            float r2 = r2 + r3
            goto L7d
        L6e:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r3 = r7.f41511U
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6c
        L7d:
            float r3 = com.airbnb.lottie.utils.Utils.dpScale()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.m50740K(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r6 = 0
            r15 = -1
        L95:
            if (r6 >= r13) goto Le1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.boxSize
            if (r0 != 0) goto La5
            r0 = 0
            r2 = 0
            goto La8
        La5:
            float r0 = r0.x
            r2 = r0
        La8:
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.m50736O(r1, r2, r3, r4, r5, r6)
            r1 = 0
        Lb9:
            int r2 = r0.size()
            if (r1 >= r2) goto Lde
            java.lang.Object r2 = r0.get(r1)
            com.airbnb.lottie.model.layer.TextLayer$d r2 = (com.airbnb.lottie.model.layer.TextLayer.C5710d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.airbnb.lottie.model.layer.TextLayer.C5710d.m50733a(r2)
            r7.m50737N(r10, r8, r15, r3)
            java.lang.String r2 = com.airbnb.lottie.model.layer.TextLayer.C5710d.m50732b(r2)
            r7.m50747D(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb9
        Lde:
            int r6 = r17 + 1
            goto L95
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.m50744G(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.Font, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m50743H(com.airbnb.lottie.model.DocumentData r21, android.graphics.Matrix r22, com.airbnb.lottie.model.Font r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r0 = r8.f41513W
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.size
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.airbnb.lottie.utils.Utils.getScale(r22)
            java.lang.String r0 = r9.text
            java.util.List r12 = r8.m50740K(r0)
            int r13 = r12.size()
            int r0 = r9.tracking
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r1 = r8.f41512V
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.getValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
        L3c:
            r14 = r0
            goto L4d
        L3e:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation r1 = r8.f41511U
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.getValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4d:
            r15 = 0
            r0 = -1
            r6 = 0
            r7 = -1
        L51:
            if (r6 >= r13) goto Lb2
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.boxSize
            if (r0 != 0) goto L61
            r0 = 0
            r2 = 0
            goto L64
        L61:
            float r0 = r0.x
            r2 = r0
        L64:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.m50736O(r1, r2, r3, r4, r5, r6)
            r5 = 0
        L75:
            int r0 = r6.size()
            if (r5 >= r0) goto Laf
            java.lang.Object r0 = r6.get(r5)
            com.airbnb.lottie.model.layer.TextLayer$d r0 = (com.airbnb.lottie.model.layer.TextLayer.C5710d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.airbnb.lottie.model.layer.TextLayer.C5710d.m50733a(r0)
            r4 = r24
            r8.m50737N(r4, r9, r7, r1)
            java.lang.String r1 = com.airbnb.lottie.model.layer.TextLayer.C5710d.m50732b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.m50745F(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L75
        Laf:
            int r6 = r17 + 1
            goto L51
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.m50743H(com.airbnb.lottie.model.DocumentData, android.graphics.Matrix, com.airbnb.lottie.model.Font, android.graphics.Canvas):void");
    }

    /* renamed from: I */
    public final C5710d m50742I(int i) {
        for (int size = this.f41501K.size(); size < i; size++) {
            this.f41501K.add(new C5710d(null));
        }
        return (C5710d) this.f41501K.get(i - 1);
    }

    /* renamed from: J */
    public final List m50741J(FontCharacter fontCharacter) {
        if (this.f41499I.containsKey(fontCharacter)) {
            return (List) this.f41499I.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new ContentGroup(this.f41503M, this, shapes.get(i), this.f41504N));
        }
        this.f41499I.put(fontCharacter, arrayList);
        return arrayList;
    }

    /* renamed from: K */
    public final List m50740K(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: L */
    public final Typeface m50739L(Font font) {
        Typeface typeface;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41514X;
        if (baseKeyframeAnimation != null && (typeface = (Typeface) baseKeyframeAnimation.getValue()) != null) {
            return typeface;
        }
        Typeface typeface2 = this.f41503M.getTypeface(font);
        if (typeface2 != null) {
            return typeface2;
        }
        return font.getTypeface();
    }

    /* renamed from: M */
    public final boolean m50738M(int i) {
        if (Character.getType(i) != 16 && Character.getType(i) != 27 && Character.getType(i) != 6 && Character.getType(i) != 28 && Character.getType(i) != 8 && Character.getType(i) != 19) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public final void m50737N(Canvas canvas, DocumentData documentData, int i, float f) {
        float f2;
        float f3;
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float dpScale = Utils.dpScale();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (documentData.lineHeight * dpScale) + pointF.y;
        }
        float f5 = (i * documentData.lineHeight * dpScale) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = C5709c.f41517a[documentData.justification.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
                    return;
                }
                return;
            }
            canvas.translate((f3 + f4) - f, f5);
            return;
        }
        canvas.translate(f3, f5);
    }

    /* renamed from: O */
    public final List m50736O(String str, float f, Font font, float f2, float f3, boolean z) {
        float measureText;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i3 = 0;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                FontCharacter fontCharacter = this.f41504N.getCharacters().get(FontCharacter.hashFor(charAt, font.getFamily(), font.getStyle()));
                if (fontCharacter != null) {
                    measureText = ((float) fontCharacter.getWidth()) * f2 * Utils.dpScale();
                }
            } else {
                measureText = this.f41497G.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i3 = i4;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                C5710d m50742I = m50742I(i);
                if (i3 == i2) {
                    String substring = str.substring(i2, i4);
                    String trim = substring.trim();
                    m50742I.m50731c(trim, (f4 - f7) - ((trim.length() - substring.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    String substring2 = str.substring(i2, i3 - 1);
                    String trim2 = substring2.trim();
                    m50742I.m50731c(trim2, ((f4 - f5) - ((substring2.length() - trim2.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            m50742I(i).m50731c(str.substring(i2), f4);
        }
        return this.f41501K.subList(0, i);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.f41506P;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.f41506P = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41506P = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.f41506P);
        } else if (t == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation2 = this.f41508R;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.f41508R = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41508R = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.f41508R);
        } else if (t == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation3 = this.f41510T;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.f41510T = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41510T = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.f41510T);
        } else if (t == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation4 = this.f41512V;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.f41512V = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41512V = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.f41512V);
        } else if (t == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation5 = this.f41513W;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.f41513W = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41513W = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.f41513W);
        } else if (t == LottieProperty.TYPEFACE) {
            BaseKeyframeAnimation<?, ?> baseKeyframeAnimation6 = this.f41514X;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (lottieValueCallback == null) {
                this.f41514X = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.f41514X = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.addUpdateListener(this);
            addAnimation(this.f41514X);
        } else if (t == LottieProperty.TEXT) {
            this.f41502L.setStringValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        DocumentData documentData = (DocumentData) this.f41502L.getValue();
        Font font = this.f41504N.getFonts().get(documentData.fontName);
        if (font == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m50734z(documentData, matrix);
        if (this.f41503M.useTextGlyphs()) {
            m50743H(documentData, matrix, font, canvas);
        } else {
            m50744G(documentData, font, canvas);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f41504N.getBounds().width(), this.f41504N.getBounds().height());
    }

    /* renamed from: y */
    public final String m50735y(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m50738M(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f41500J.containsKey(j)) {
            return (String) this.f41500J.get(j);
        }
        this.f41494D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f41494D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f41494D.toString();
        this.f41500J.put(j, sb);
        return sb;
    }

    /* renamed from: z */
    public final void m50734z(DocumentData documentData, Matrix matrix) {
        int intValue;
        BaseKeyframeAnimation baseKeyframeAnimation = this.f41506P;
        if (baseKeyframeAnimation != null) {
            this.f41497G.setColor(((Integer) baseKeyframeAnimation.getValue()).intValue());
        } else {
            BaseKeyframeAnimation baseKeyframeAnimation2 = this.f41505O;
            if (baseKeyframeAnimation2 != null) {
                this.f41497G.setColor(((Integer) baseKeyframeAnimation2.getValue()).intValue());
            } else {
                this.f41497G.setColor(documentData.color);
            }
        }
        BaseKeyframeAnimation baseKeyframeAnimation3 = this.f41508R;
        if (baseKeyframeAnimation3 != null) {
            this.f41498H.setColor(((Integer) baseKeyframeAnimation3.getValue()).intValue());
        } else {
            BaseKeyframeAnimation baseKeyframeAnimation4 = this.f41507Q;
            if (baseKeyframeAnimation4 != null) {
                this.f41498H.setColor(((Integer) baseKeyframeAnimation4.getValue()).intValue());
            } else {
                this.f41498H.setColor(documentData.strokeColor);
            }
        }
        if (this.f41442x.getOpacity() == null) {
            intValue = 100;
        } else {
            intValue = this.f41442x.getOpacity().getValue().intValue();
        }
        int i = (intValue * 255) / 100;
        this.f41497G.setAlpha(i);
        this.f41498H.setAlpha(i);
        BaseKeyframeAnimation baseKeyframeAnimation5 = this.f41510T;
        if (baseKeyframeAnimation5 != null) {
            this.f41498H.setStrokeWidth(((Float) baseKeyframeAnimation5.getValue()).floatValue());
            return;
        }
        BaseKeyframeAnimation baseKeyframeAnimation6 = this.f41509S;
        if (baseKeyframeAnimation6 != null) {
            this.f41498H.setStrokeWidth(((Float) baseKeyframeAnimation6.getValue()).floatValue());
        } else {
            this.f41498H.setStrokeWidth(documentData.strokeWidth * Utils.dpScale());
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$d */
    /* loaded from: classes3.dex */
    public static class C5710d {

        /* renamed from: a */
        public String f41518a;

        /* renamed from: b */
        public float f41519b;

        public C5710d() {
            this.f41518a = "";
            this.f41519b = 0.0f;
        }

        /* renamed from: c */
        public void m50731c(String str, float f) {
            this.f41518a = str;
            this.f41519b = f;
        }

        public /* synthetic */ C5710d(C5707a c5707a) {
            this();
        }
    }
}
