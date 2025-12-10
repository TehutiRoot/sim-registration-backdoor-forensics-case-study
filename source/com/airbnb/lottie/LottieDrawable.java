package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.manager.FontAssetManager;
import com.airbnb.lottie.manager.ImageAssetManager;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.parser.LayerParser;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.cli.HelpFormatter;

/* loaded from: classes3.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    /* renamed from: A */
    public final Matrix f40948A;

    /* renamed from: B */
    public Bitmap f40949B;

    /* renamed from: C */
    public Canvas f40950C;

    /* renamed from: D */
    public Rect f40951D;

    /* renamed from: E */
    public RectF f40952E;

    /* renamed from: F */
    public Paint f40953F;

    /* renamed from: G */
    public Rect f40954G;

    /* renamed from: H */
    public Rect f40955H;

    /* renamed from: I */
    public RectF f40956I;

    /* renamed from: J */
    public RectF f40957J;

    /* renamed from: K */
    public Matrix f40958K;

    /* renamed from: L */
    public Matrix f40959L;

    /* renamed from: M */
    public boolean f40960M;

    /* renamed from: a */
    public LottieComposition f40961a;

    /* renamed from: b */
    public final LottieValueAnimator f40962b;

    /* renamed from: c */
    public boolean f40963c;

    /* renamed from: d */
    public boolean f40964d;

    /* renamed from: e */
    public boolean f40965e;

    /* renamed from: f */
    public OnVisibleAction f40966f;

    /* renamed from: g */
    public final ArrayList f40967g;

    /* renamed from: h */
    public final ValueAnimator.AnimatorUpdateListener f40968h;

    /* renamed from: i */
    public ImageAssetManager f40969i;

    /* renamed from: j */
    public String f40970j;

    /* renamed from: k */
    public ImageAssetDelegate f40971k;

    /* renamed from: l */
    public FontAssetManager f40972l;

    /* renamed from: m */
    public Map f40973m;

    /* renamed from: n */
    public String f40974n;

    /* renamed from: o */
    public FontAssetDelegate f40975o;

    /* renamed from: p */
    public TextDelegate f40976p;

    /* renamed from: q */
    public boolean f40977q;

    /* renamed from: r */
    public boolean f40978r;

    /* renamed from: s */
    public boolean f40979s;

    /* renamed from: t */
    public CompositionLayer f40980t;

    /* renamed from: u */
    public int f40981u;

    /* renamed from: v */
    public boolean f40982v;

    /* renamed from: w */
    public boolean f40983w;

    /* renamed from: x */
    public boolean f40984x;

    /* renamed from: y */
    public RenderMode f40985y;

    /* renamed from: z */
    public boolean f40986z;

    /* loaded from: classes3.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RepeatMode {
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$a */
    /* loaded from: classes3.dex */
    public class C5666a implements ValueAnimator.AnimatorUpdateListener {
        public C5666a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.f40980t != null) {
                LottieDrawable.this.f40980t.setProgress(LottieDrawable.this.f40962b.getAnimatedValueAbsolute());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$b */
    /* loaded from: classes3.dex */
    public class C5667b extends LottieValueCallback {

        /* renamed from: c */
        public final /* synthetic */ SimpleLottieValueCallback f40988c;

        public C5667b(SimpleLottieValueCallback simpleLottieValueCallback) {
            this.f40988c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public Object getValue(LottieFrameInfo lottieFrameInfo) {
            return this.f40988c.getValue(lottieFrameInfo);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieDrawable$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC5668c {
        /* renamed from: a */
        void mo23435a(LottieComposition lottieComposition);
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.f40962b = lottieValueAnimator;
        this.f40963c = true;
        this.f40964d = false;
        this.f40965e = false;
        this.f40966f = OnVisibleAction.NONE;
        this.f40967g = new ArrayList();
        C5666a c5666a = new C5666a();
        this.f40968h = c5666a;
        this.f40978r = false;
        this.f40979s = true;
        this.f40981u = 255;
        this.f40985y = RenderMode.AUTOMATIC;
        this.f40986z = false;
        this.f40948A = new Matrix();
        this.f40960M = false;
        lottieValueAnimator.addUpdateListener(c5666a);
    }

    /* renamed from: A */
    public final FontAssetManager m50965A() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f40972l == null) {
            FontAssetManager fontAssetManager = new FontAssetManager(getCallback(), this.f40975o);
            this.f40972l = fontAssetManager;
            String str = this.f40974n;
            if (str != null) {
                fontAssetManager.setDefaultFontFileExtension(str);
            }
        }
        return this.f40972l;
    }

    /* renamed from: B */
    public final ImageAssetManager m50964B() {
        ImageAssetManager imageAssetManager = this.f40969i;
        if (imageAssetManager != null && !imageAssetManager.hasSameContext(m50919z())) {
            this.f40969i = null;
        }
        if (this.f40969i == null) {
            this.f40969i = new ImageAssetManager(getCallback(), this.f40970j, this.f40971k, this.f40961a.getImages());
        }
        return this.f40969i;
    }

    /* renamed from: C */
    public final boolean m50963C() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    /* renamed from: D */
    public boolean m50962D() {
        if (isVisible()) {
            return this.f40962b.isRunning();
        }
        OnVisibleAction onVisibleAction = this.f40966f;
        if (onVisibleAction != OnVisibleAction.PLAY && onVisibleAction != OnVisibleAction.RESUME) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final /* synthetic */ void m50961E(KeyPath keyPath, Object obj, LottieValueCallback lottieValueCallback, LottieComposition lottieComposition) {
        addValueCallback(keyPath, (KeyPath) obj, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    /* renamed from: F */
    public final /* synthetic */ void m50960F(LottieComposition lottieComposition) {
        playAnimation();
    }

    /* renamed from: G */
    public final /* synthetic */ void m50959G(LottieComposition lottieComposition) {
        resumeAnimation();
    }

    /* renamed from: H */
    public final /* synthetic */ void m50958H(int i, LottieComposition lottieComposition) {
        setFrame(i);
    }

    /* renamed from: I */
    public final /* synthetic */ void m50957I(int i, LottieComposition lottieComposition) {
        setMaxFrame(i);
    }

    /* renamed from: J */
    public final /* synthetic */ void m50956J(String str, LottieComposition lottieComposition) {
        setMaxFrame(str);
    }

    /* renamed from: K */
    public final /* synthetic */ void m50955K(float f, LottieComposition lottieComposition) {
        setMaxProgress(f);
    }

    /* renamed from: L */
    public final /* synthetic */ void m50954L(int i, int i2, LottieComposition lottieComposition) {
        setMinAndMaxFrame(i, i2);
    }

    /* renamed from: M */
    public final /* synthetic */ void m50953M(String str, LottieComposition lottieComposition) {
        setMinAndMaxFrame(str);
    }

    /* renamed from: N */
    public final /* synthetic */ void m50952N(String str, String str2, boolean z, LottieComposition lottieComposition) {
        setMinAndMaxFrame(str, str2, z);
    }

    /* renamed from: O */
    public final /* synthetic */ void m50951O(float f, float f2, LottieComposition lottieComposition) {
        setMinAndMaxProgress(f, f2);
    }

    /* renamed from: P */
    public final /* synthetic */ void m50950P(int i, LottieComposition lottieComposition) {
        setMinFrame(i);
    }

    /* renamed from: Q */
    public final /* synthetic */ void m50949Q(String str, LottieComposition lottieComposition) {
        setMinFrame(str);
    }

    /* renamed from: R */
    public final /* synthetic */ void m50948R(float f, LottieComposition lottieComposition) {
        setMinProgress(f);
    }

    /* renamed from: S */
    public final /* synthetic */ void m50947S(float f, LottieComposition lottieComposition) {
        setProgress(f);
    }

    /* renamed from: T */
    public final void m50946T(Canvas canvas, CompositionLayer compositionLayer) {
        if (this.f40961a != null && compositionLayer != null) {
            m50920y();
            canvas.getMatrix(this.f40958K);
            canvas.getClipBounds(this.f40951D);
            m50924u(this.f40951D, this.f40952E);
            this.f40958K.mapRect(this.f40952E);
            m50923v(this.f40952E, this.f40951D);
            if (this.f40979s) {
                this.f40957J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                compositionLayer.getBounds(this.f40957J, null, false);
            }
            this.f40958K.mapRect(this.f40957J);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            m50945U(this.f40957J, width, height);
            if (!m50963C()) {
                RectF rectF = this.f40957J;
                Rect rect = this.f40951D;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.f40957J.width());
            int ceil2 = (int) Math.ceil(this.f40957J.height());
            if (ceil != 0 && ceil2 != 0) {
                m50921x(ceil, ceil2);
                if (this.f40960M) {
                    this.f40948A.set(this.f40958K);
                    this.f40948A.preScale(width, height);
                    Matrix matrix = this.f40948A;
                    RectF rectF2 = this.f40957J;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f40949B.eraseColor(0);
                    compositionLayer.draw(this.f40950C, this.f40948A, this.f40981u);
                    this.f40958K.invert(this.f40959L);
                    this.f40959L.mapRect(this.f40956I, this.f40957J);
                    m50923v(this.f40956I, this.f40955H);
                }
                this.f40954G.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f40949B, this.f40954G, this.f40955H, this.f40953F);
            }
        }
    }

    /* renamed from: U */
    public final void m50945U(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40962b.addListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40962b.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40962b.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final KeyPath keyPath, final T t, @Nullable final LottieValueCallback<T> lottieValueCallback) {
        CompositionLayer compositionLayer = this.f40980t;
        if (compositionLayer == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: gn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50961E(keyPath, t, lottieValueCallback, lottieComposition);
                }
            });
            return;
        }
        boolean z = true;
        if (keyPath == KeyPath.COMPOSITION) {
            compositionLayer.addValueCallback(t, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t, lottieValueCallback);
        } else {
            List<KeyPath> resolveKeyPath = resolveKeyPath(keyPath);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).getResolvedElement().addValueCallback(t, lottieValueCallback);
            }
            z = true ^ resolveKeyPath.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == LottieProperty.TIME_REMAP) {
                setProgress(getProgress());
            }
        }
    }

    public void cancelAnimation() {
        this.f40967g.clear();
        this.f40962b.cancel();
        if (!isVisible()) {
            this.f40966f = OnVisibleAction.NONE;
        }
    }

    public void clearComposition() {
        if (this.f40962b.isRunning()) {
            this.f40962b.cancel();
            if (!isVisible()) {
                this.f40966f = OnVisibleAction.NONE;
            }
        }
        this.f40961a = null;
        this.f40980t = null;
        this.f40969i = null;
        this.f40962b.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        C5655L.beginSection("Drawable#draw");
        if (this.f40965e) {
            try {
                if (this.f40986z) {
                    m50946T(canvas, this.f40980t);
                } else {
                    m50922w(canvas);
                }
            } catch (Throwable th2) {
                Logger.error("Lottie crashed in draw!", th2);
            }
        } else if (this.f40986z) {
            m50946T(canvas, this.f40980t);
        } else {
            m50922w(canvas);
        }
        this.f40960M = false;
        C5655L.endSection("Drawable#draw");
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.f40977q;
    }

    @MainThread
    public void endAnimation() {
        this.f40967g.clear();
        this.f40962b.endAnimation();
        if (!isVisible()) {
            this.f40966f = OnVisibleAction.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f40981u;
    }

    @Nullable
    public Bitmap getBitmapForId(String str) {
        ImageAssetManager m50964B = m50964B();
        if (m50964B != null) {
            return m50964B.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipToCompositionBounds() {
        return this.f40979s;
    }

    public LottieComposition getComposition() {
        return this.f40961a;
    }

    public int getFrame() {
        return (int) this.f40962b.getFrame();
    }

    @Nullable
    @Deprecated
    public Bitmap getImageAsset(String str) {
        LottieImageAsset lottieImageAsset;
        ImageAssetManager m50964B = m50964B();
        if (m50964B != null) {
            return m50964B.bitmapForId(str);
        }
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            lottieImageAsset = null;
        } else {
            lottieImageAsset = lottieComposition.getImages().get(str);
        }
        if (lottieImageAsset == null) {
            return null;
        }
        return lottieImageAsset.getBitmap();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f40970j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().width();
    }

    @Nullable
    public LottieImageAsset getLottieImageAssetForId(String str) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            return null;
        }
        return lottieComposition.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f40978r;
    }

    public float getMaxFrame() {
        return this.f40962b.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f40962b.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getProgress() {
        return this.f40962b.getAnimatedValueAbsolute();
    }

    public RenderMode getRenderMode() {
        if (this.f40986z) {
            return RenderMode.SOFTWARE;
        }
        return RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.f40962b.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.f40962b.getRepeatMode();
    }

    public float getSpeed() {
        return this.f40962b.getSpeed();
    }

    @Nullable
    public TextDelegate getTextDelegate() {
        return this.f40976p;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface getTypeface(Font font) {
        Map map = this.f40973m;
        if (map != null) {
            String family = font.getFamily();
            if (map.containsKey(family)) {
                return (Typeface) map.get(family);
            }
            String name = font.getName();
            if (map.containsKey(name)) {
                return (Typeface) map.get(name);
            }
            String str = font.getFamily() + HelpFormatter.DEFAULT_OPT_PREFIX + font.getStyle();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        FontAssetManager m50965A = m50965A();
        if (m50965A != null) {
            return m50965A.getTypeface(font);
        }
        return null;
    }

    public boolean hasMasks() {
        CompositionLayer compositionLayer = this.f40980t;
        if (compositionLayer != null && compositionLayer.hasMasks()) {
            return true;
        }
        return false;
    }

    public boolean hasMatte() {
        CompositionLayer compositionLayer = this.f40980t;
        if (compositionLayer != null && compositionLayer.hasMatte()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f40960M) {
            return;
        }
        this.f40960M = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        LottieValueAnimator lottieValueAnimator = this.f40962b;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.f40984x;
    }

    public boolean isLooping() {
        if (this.f40962b.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f40977q;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        LottieValueAnimator lottieValueAnimator = this.f40962b;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieValueAnimator.setRepeatCount(i);
    }

    public void pauseAnimation() {
        this.f40967g.clear();
        this.f40962b.pauseAnimation();
        if (!isVisible()) {
            this.f40966f = OnVisibleAction.NONE;
        }
    }

    @MainThread
    public void playAnimation() {
        float maxFrame;
        if (this.f40980t == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: mn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50960F(lottieComposition);
                }
            });
            return;
        }
        m50925t();
        if (m50927r() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f40962b.playAnimation();
                this.f40966f = OnVisibleAction.NONE;
            } else {
                this.f40966f = OnVisibleAction.PLAY;
            }
        }
        if (!m50927r()) {
            if (getSpeed() < 0.0f) {
                maxFrame = getMinFrame();
            } else {
                maxFrame = getMaxFrame();
            }
            setFrame((int) maxFrame);
            this.f40962b.endAnimation();
            if (!isVisible()) {
                this.f40966f = OnVisibleAction.NONE;
            }
        }
    }

    /* renamed from: r */
    public final boolean m50927r() {
        if (!this.f40963c && !this.f40964d) {
            return false;
        }
        return true;
    }

    public void removeAllAnimatorListeners() {
        this.f40962b.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.f40962b.removeAllUpdateListeners();
        this.f40962b.addUpdateListener(this.f40968h);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40962b.removeListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40962b.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40962b.removeUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        if (this.f40980t == null) {
            Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f40980t.resolveKeyPath(keyPath, 0, arrayList, new KeyPath(new String[0]));
        return arrayList;
    }

    @MainThread
    public void resumeAnimation() {
        float maxFrame;
        if (this.f40980t == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: in0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50959G(lottieComposition);
                }
            });
            return;
        }
        m50925t();
        if (m50927r() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.f40962b.resumeAnimation();
                this.f40966f = OnVisibleAction.NONE;
            } else {
                this.f40966f = OnVisibleAction.RESUME;
            }
        }
        if (!m50927r()) {
            if (getSpeed() < 0.0f) {
                maxFrame = getMinFrame();
            } else {
                maxFrame = getMaxFrame();
            }
            setFrame((int) maxFrame);
            this.f40962b.endAnimation();
            if (!isVisible()) {
                this.f40966f = OnVisibleAction.NONE;
            }
        }
    }

    public void reverseAnimationSpeed() {
        this.f40962b.reverseAnimationSpeed();
    }

    /* renamed from: s */
    public final void m50926s() {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            return;
        }
        CompositionLayer compositionLayer = new CompositionLayer(this, LayerParser.parse(lottieComposition), lottieComposition.getLayers(), lottieComposition);
        this.f40980t = compositionLayer;
        if (this.f40983w) {
            compositionLayer.setOutlineMasksAndMattes(true);
        }
        this.f40980t.setClipToCompositionBounds(this.f40979s);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m64742to = 255) int i) {
        this.f40981u = i;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f40984x = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        if (z != this.f40979s) {
            this.f40979s = z;
            CompositionLayer compositionLayer = this.f40980t;
            if (compositionLayer != null) {
                compositionLayer.setClipToCompositionBounds(z);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Logger.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(LottieComposition lottieComposition) {
        if (this.f40961a == lottieComposition) {
            return false;
        }
        this.f40960M = true;
        clearComposition();
        this.f40961a = lottieComposition;
        m50926s();
        this.f40962b.setComposition(lottieComposition);
        setProgress(this.f40962b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f40967g).iterator();
        while (it.hasNext()) {
            InterfaceC5668c interfaceC5668c = (InterfaceC5668c) it.next();
            if (interfaceC5668c != null) {
                interfaceC5668c.mo23435a(lottieComposition);
            }
            it.remove();
        }
        this.f40967g.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.f40982v);
        m50925t();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f40974n = str;
        FontAssetManager m50965A = m50965A();
        if (m50965A != null) {
            m50965A.setDefaultFontFileExtension(str);
        }
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.f40975o = fontAssetDelegate;
        FontAssetManager fontAssetManager = this.f40972l;
        if (fontAssetManager != null) {
            fontAssetManager.setDelegate(fontAssetDelegate);
        }
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        if (map == this.f40973m) {
            return;
        }
        this.f40973m = map;
        invalidateSelf();
    }

    public void setFrame(final int i) {
        if (this.f40961a == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: pn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50958H(i, lottieComposition);
                }
            });
        } else {
            this.f40962b.setFrame(i);
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f40964d = z;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f40971k = imageAssetDelegate;
        ImageAssetManager imageAssetManager = this.f40969i;
        if (imageAssetManager != null) {
            imageAssetManager.setDelegate(imageAssetDelegate);
        }
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.f40970j = str;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f40978r = z;
    }

    public void setMaxFrame(final int i) {
        if (this.f40961a == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: en0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50957I(i, lottieComposition);
                }
            });
        } else {
            this.f40962b.setMaxFrame(i + 0.99f);
        }
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) final float f) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: hn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50955K(f, lottieComposition2);
                }
            });
        } else {
            this.f40962b.setMaxFrame(MiscUtils.lerp(lottieComposition.getStartFrame(), this.f40961a.getEndFrame(), f));
        }
    }

    public void setMinAndMaxFrame(final String str) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: cn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50953M(str, lottieComposition2);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            int i = (int) marker.startFrame;
            setMinAndMaxFrame(i, ((int) marker.durationFrames) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) final float f, @FloatRange(from = 0.0d, m64743to = 1.0d) final float f2) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: qn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50951O(f, f2, lottieComposition2);
                }
            });
        } else {
            setMinAndMaxFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.f40961a.getEndFrame(), f), (int) MiscUtils.lerp(this.f40961a.getStartFrame(), this.f40961a.getEndFrame(), f2));
        }
    }

    public void setMinFrame(final int i) {
        if (this.f40961a == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: fn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50950P(i, lottieComposition);
                }
            });
        } else {
            this.f40962b.setMinFrame(i);
        }
    }

    public void setMinProgress(final float f) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: nn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50948R(f, lottieComposition2);
                }
            });
        } else {
            setMinFrame((int) MiscUtils.lerp(lottieComposition.getStartFrame(), this.f40961a.getEndFrame(), f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.f40983w == z) {
            return;
        }
        this.f40983w = z;
        CompositionLayer compositionLayer = this.f40980t;
        if (compositionLayer != null) {
            compositionLayer.setOutlineMasksAndMattes(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f40982v = z;
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) final float f) {
        if (this.f40961a == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: on0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50947S(f, lottieComposition);
                }
            });
            return;
        }
        C5655L.beginSection("Drawable#setProgress");
        this.f40962b.setFrame(this.f40961a.getFrameForProgress(f));
        C5655L.endSection("Drawable#setProgress");
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f40985y = renderMode;
        m50925t();
    }

    public void setRepeatCount(int i) {
        this.f40962b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f40962b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f40965e = z;
    }

    public void setSpeed(float f) {
        this.f40962b.setSpeed(f);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.f40963c = bool.booleanValue();
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f40976p = textDelegate;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f40962b.setUseCompositionFrameRate(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            OnVisibleAction onVisibleAction = this.f40966f;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                playAnimation();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                resumeAnimation();
            }
        } else if (this.f40962b.isRunning()) {
            pauseAnimation();
            this.f40966f = OnVisibleAction.RESUME;
        } else if (!z3) {
            this.f40966f = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        endAnimation();
    }

    /* renamed from: t */
    public final void m50925t() {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            return;
        }
        this.f40986z = this.f40985y.useSoftwareRendering(Build.VERSION.SDK_INT, lottieComposition.hasDashPattern(), lottieComposition.getMaskAndMatteCount());
    }

    /* renamed from: u */
    public final void m50924u(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        ImageAssetManager m50964B = m50964B();
        if (m50964B == null) {
            Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap updateBitmap = m50964B.updateBitmap(str, bitmap);
        invalidateSelf();
        return updateBitmap;
    }

    public boolean useTextGlyphs() {
        if (this.f40973m == null && this.f40976p == null && this.f40961a.getCharacters().size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final void m50923v(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: w */
    public final void m50922w(Canvas canvas) {
        CompositionLayer compositionLayer = this.f40980t;
        LottieComposition lottieComposition = this.f40961a;
        if (compositionLayer != null && lottieComposition != null) {
            this.f40948A.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f40948A.preScale(bounds.width() / lottieComposition.getBounds().width(), bounds.height() / lottieComposition.getBounds().height());
                this.f40948A.preTranslate(bounds.left, bounds.top);
            }
            compositionLayer.draw(canvas, this.f40948A, this.f40981u);
        }
    }

    /* renamed from: x */
    public final void m50921x(int i, int i2) {
        Bitmap bitmap = this.f40949B;
        if (bitmap != null && bitmap.getWidth() >= i && this.f40949B.getHeight() >= i2) {
            if (this.f40949B.getWidth() > i || this.f40949B.getHeight() > i2) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f40949B, 0, 0, i, i2);
                this.f40949B = createBitmap;
                this.f40950C.setBitmap(createBitmap);
                this.f40960M = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.f40949B = createBitmap2;
        this.f40950C.setBitmap(createBitmap2);
        this.f40960M = true;
    }

    /* renamed from: y */
    public final void m50920y() {
        if (this.f40950C != null) {
            return;
        }
        this.f40950C = new Canvas();
        this.f40957J = new RectF();
        this.f40958K = new Matrix();
        this.f40959L = new Matrix();
        this.f40951D = new Rect();
        this.f40952E = new RectF();
        this.f40953F = new LPaint();
        this.f40954G = new Rect();
        this.f40955H = new Rect();
        this.f40956I = new RectF();
    }

    /* renamed from: z */
    public final Context m50919z() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        if (this.f40977q == z) {
            return;
        }
        this.f40977q = z;
        if (this.f40961a != null) {
            m50926s();
        }
    }

    public void setMaxFrame(final String str) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: kn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50956J(str, lottieComposition2);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinFrame(final String str) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: ln0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50949Q(str, lottieComposition2);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z) {
        LottieComposition lottieComposition = this.f40961a;
        if (lottieComposition == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: jn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.m50952N(str, str2, z, lottieComposition2);
                }
            });
            return;
        }
        Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i = (int) marker.startFrame;
        Marker marker2 = this.f40961a.getMarker(str2);
        if (marker2 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        setMinAndMaxFrame(i, (int) (marker2.startFrame + (z ? 1.0f : 0.0f)));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void draw(Canvas canvas, Matrix matrix) {
        CompositionLayer compositionLayer = this.f40980t;
        LottieComposition lottieComposition = this.f40961a;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        if (this.f40986z) {
            canvas.save();
            canvas.concat(matrix);
            m50946T(canvas, compositionLayer);
            canvas.restore();
        } else {
            compositionLayer.draw(canvas, matrix, this.f40981u);
        }
        this.f40960M = false;
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) new C5667b(simpleLottieValueCallback));
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.f40961a == null) {
            this.f40967g.add(new InterfaceC5668c() { // from class: dn0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5668c
                /* renamed from: a */
                public final void mo23435a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m50954L(i, i2, lottieComposition);
                }
            });
        } else {
            this.f40962b.setMinAndMaxFrames(i, i2 + 0.99f);
        }
    }
}
