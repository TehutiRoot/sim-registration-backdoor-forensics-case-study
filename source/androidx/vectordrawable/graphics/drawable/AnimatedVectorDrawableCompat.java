package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class AnimatedVectorDrawableCompat extends P02 implements Animatable2Compat {

    /* renamed from: b */
    public C5146c f37859b;

    /* renamed from: c */
    public Context f37860c;

    /* renamed from: d */
    public android.animation.ArgbEvaluator f37861d;

    /* renamed from: e */
    public C5147d f37862e;

    /* renamed from: f */
    public Animator.AnimatorListener f37863f;

    /* renamed from: g */
    public ArrayList f37864g;

    /* renamed from: h */
    public final Drawable.Callback f37865h;

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$a */
    /* loaded from: classes2.dex */
    public class C5144a implements Drawable.Callback {
        public C5144a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$b */
    /* loaded from: classes2.dex */
    public class C5145b extends AnimatorListenerAdapter {
        public C5145b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f37864g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(AnimatedVectorDrawableCompat.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f37864g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(AnimatedVectorDrawableCompat.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$c */
    /* loaded from: classes2.dex */
    public static class C5146c extends Drawable.ConstantState {

        /* renamed from: a */
        public int f37868a;

        /* renamed from: b */
        public VectorDrawableCompat f37869b;

        /* renamed from: c */
        public AnimatorSet f37870c;

        /* renamed from: d */
        public ArrayList f37871d;

        /* renamed from: e */
        public ArrayMap f37872e;

        public C5146c(Context context, C5146c c5146c, Drawable.Callback callback, Resources resources) {
            if (c5146c != null) {
                this.f37868a = c5146c.f37868a;
                VectorDrawableCompat vectorDrawableCompat = c5146c.f37869b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.f37869b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f37869b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = (VectorDrawableCompat) this.f37869b.mutate();
                    this.f37869b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.f37869b.setBounds(c5146c.f37869b.getBounds());
                    this.f37869b.m52548f(false);
                }
                ArrayList arrayList = c5146c.f37871d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f37871d = new ArrayList(size);
                    this.f37872e = new ArrayMap(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) c5146c.f37871d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) c5146c.f37872e.get(animator);
                        clone.setTarget(this.f37869b.m52552b(str));
                        this.f37871d.add(clone);
                        this.f37872e.put(clone, str);
                    }
                    m52575a();
                }
            }
        }

        /* renamed from: a */
        public void m52575a() {
            if (this.f37870c == null) {
                this.f37870c = new AnimatorSet();
            }
            this.f37870c.playTogether(this.f37871d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f37868a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static void m52579a(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.AnimationCallback animationCallback) {
        animatedVectorDrawable.registerAnimationCallback(animationCallback.m52580a());
    }

    @Nullable
    public static AnimatedVectorDrawableCompat create(@NonNull Context context, @DrawableRes int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
            animatedVectorDrawableCompat.f4617a = drawable;
            drawable.setCallback(animatedVectorDrawableCompat.f37865h);
            animatedVectorDrawableCompat.f37862e = new C5147d(animatedVectorDrawableCompat.f4617a.getConstantState());
            return animatedVectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return createFromXmlInner(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    /* renamed from: d */
    public static boolean m52576d(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat.AnimationCallback animationCallback) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = animatedVectorDrawable.unregisterAnimationCallback(animationCallback.m52580a());
        return unregisterAnimationCallback;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.applyTheme(drawable, theme);
        }
    }

    /* renamed from: b */
    public final void m52578b() {
        Animator.AnimatorListener animatorListener = this.f37863f;
        if (animatorListener != null) {
            this.f37859b.f37870c.removeListener(animatorListener);
            this.f37863f = null;
        }
    }

    /* renamed from: c */
    public final void m52577c(String str, Animator animator) {
        animator.setTarget(this.f37859b.f37869b.m52552b(str));
        C5146c c5146c = this.f37859b;
        if (c5146c.f37871d == null) {
            c5146c.f37871d = new ArrayList();
            this.f37859b.f37872e = new ArrayMap();
        }
        this.f37859b.f37871d.add(animator);
        this.f37859b.f37872e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m52578b();
        ArrayList arrayList = this.f37864g;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f37859b.f37869b.draw(canvas);
        if (this.f37859b.f37870c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.getAlpha(drawable);
        }
        return this.f37859b.f37869b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f37859b.f37868a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.getColorFilter(drawable);
        }
        return this.f37859b.f37869b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4617a != null && Build.VERSION.SDK_INT >= 24) {
            return new C5147d(this.f4617a.getConstantState());
        }
        return null;
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f37859b.f37869b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f37859b.f37869b.getIntrinsicWidth();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f37859b.f37869b.getOpacity();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AbstractC13060p4.f76472e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat create = VectorDrawableCompat.create(resources, resourceId, theme);
                        create.m52548f(false);
                        create.setCallback(this.f37865h);
                        VectorDrawableCompat vectorDrawableCompat = this.f37859b.f37869b;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        this.f37859b.f37869b = create;
                    }
                    obtainAttributes.recycle();
                } else if (TypedValues.AttributesType.S_TARGET.equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, AbstractC13060p4.f76473f);
                    String string = obtainAttributes2.getString(0);
                    int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f37860c;
                        if (context != null) {
                            m52577c(string, AnimatorInflaterCompat.loadAnimator(context, resourceId2));
                        } else {
                            obtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f37859b.m52575a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return DrawableCompat.isAutoMirrored(drawable);
        }
        return this.f37859b.f37869b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f37859b.f37870c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f37859b.f37869b.isStateful();
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f37859b.f37869b.setBounds(rect);
        }
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f37859b.f37869b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f37859b.f37869b.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            m52579a((AnimatedVectorDrawable) drawable, animationCallback);
        } else if (animationCallback == null) {
        } else {
            if (this.f37864g == null) {
                this.f37864g = new ArrayList();
            }
            if (this.f37864g.contains(animationCallback)) {
                return;
            }
            this.f37864g.add(animationCallback);
            if (this.f37863f == null) {
                this.f37863f = new C5145b();
            }
            this.f37859b.f37870c.addListener(this.f37863f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f37859b.f37869b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f37859b.f37869b.setAutoMirrored(z);
        }
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000.P02, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            this.f37859b.f37869b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        } else {
            this.f37859b.f37869b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        } else {
            this.f37859b.f37869b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f37859b.f37869b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f37859b.f37870c.isStarted()) {
        } else {
            this.f37859b.f37870c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f37859b.f37870c.end();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            m52576d((AnimatedVectorDrawable) drawable, animationCallback);
        }
        ArrayList arrayList = this.f37864g;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean remove = arrayList.remove(animationCallback);
        if (this.f37864g.size() == 0) {
            m52578b();
        }
        return remove;
    }

    public AnimatedVectorDrawableCompat(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4617a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f37859b.f37869b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$d */
    /* loaded from: classes2.dex */
    public static class C5147d extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f37873a;

        public C5147d(Drawable.ConstantState constantState) {
            this.f37873a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f37873a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f37873a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f37873a.newDrawable();
            animatedVectorDrawableCompat.f4617a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f37865h);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f37873a.newDrawable(resources);
            animatedVectorDrawableCompat.f4617a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f37865h);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f37873a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f4617a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f37865h);
            return animatedVectorDrawableCompat;
        }
    }

    public AnimatedVectorDrawableCompat(Context context, C5146c c5146c, Resources resources) {
        this.f37861d = null;
        this.f37863f = null;
        this.f37864g = null;
        C5144a c5144a = new C5144a();
        this.f37865h = c5144a;
        this.f37860c = context;
        if (c5146c != null) {
            this.f37859b = c5146c;
        } else {
            this.f37859b = new C5146c(context, c5146c, c5144a, resources);
        }
    }

    public static void clearAnimationCallbacks(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((AnimatedVectorDrawableCompat) drawable).clearAnimationCallbacks();
            }
        }
    }

    public static boolean unregisterAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof Animatable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return m52576d((AnimatedVectorDrawable) drawable, animationCallback);
        }
        return ((AnimatedVectorDrawableCompat) drawable).unregisterAnimationCallback(animationCallback);
    }

    public static void registerAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m52579a((AnimatedVectorDrawable) drawable, animationCallback);
        } else {
            ((AnimatedVectorDrawableCompat) drawable).registerAnimationCallback(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
