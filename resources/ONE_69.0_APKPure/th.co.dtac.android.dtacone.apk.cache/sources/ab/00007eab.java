package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r */
    public static final LottieListener f40901r = new LottieListener() { // from class: Vm0
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            LottieAnimationView.m51012b((Throwable) obj);
        }
    };

    /* renamed from: d */
    public final LottieListener f40902d;

    /* renamed from: e */
    public final LottieListener f40903e;

    /* renamed from: f */
    public LottieListener f40904f;

    /* renamed from: g */
    public int f40905g;

    /* renamed from: h */
    public final LottieDrawable f40906h;

    /* renamed from: i */
    public String f40907i;

    /* renamed from: j */
    public int f40908j;

    /* renamed from: k */
    public boolean f40909k;

    /* renamed from: l */
    public boolean f40910l;

    /* renamed from: m */
    public boolean f40911m;

    /* renamed from: n */
    public final Set f40912n;

    /* renamed from: o */
    public final Set f40913o;

    /* renamed from: p */
    public LottieTask f40914p;

    /* renamed from: q */
    public LottieComposition f40915q;

    /* loaded from: classes3.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    /* loaded from: classes3.dex */
    public class C5646a implements LottieListener {
        public C5646a() {
            LottieAnimationView.this = r1;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* renamed from: a */
        public void onResult(Throwable th2) {
            if (LottieAnimationView.this.f40905g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f40905g);
            }
            (LottieAnimationView.this.f40904f == null ? LottieAnimationView.f40901r : LottieAnimationView.this.f40904f).onResult(th2);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    /* loaded from: classes3.dex */
    public class C5647b extends LottieValueCallback {

        /* renamed from: c */
        public final /* synthetic */ SimpleLottieValueCallback f40917c;

        public C5647b(SimpleLottieValueCallback simpleLottieValueCallback) {
            LottieAnimationView.this = r1;
            this.f40917c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public Object getValue(LottieFrameInfo lottieFrameInfo) {
            return this.f40917c.getValue(lottieFrameInfo);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    /* loaded from: classes3.dex */
    public static class C5648c extends View.BaseSavedState {
        public static final Parcelable.Creator<C5648c> CREATOR = new C5649a();

        /* renamed from: a */
        public String f40919a;

        /* renamed from: b */
        public int f40920b;

        /* renamed from: c */
        public float f40921c;

        /* renamed from: d */
        public boolean f40922d;

        /* renamed from: e */
        public String f40923e;

        /* renamed from: f */
        public int f40924f;

        /* renamed from: g */
        public int f40925g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$c$a */
        /* loaded from: classes3.dex */
        public class C5649a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5648c createFromParcel(Parcel parcel) {
                return new C5648c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C5648c[] newArray(int i) {
                return new C5648c[i];
            }
        }

        public /* synthetic */ C5648c(Parcel parcel, C5646a c5646a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f40919a);
            parcel.writeFloat(this.f40921c);
            parcel.writeInt(this.f40922d ? 1 : 0);
            parcel.writeString(this.f40923e);
            parcel.writeInt(this.f40924f);
            parcel.writeInt(this.f40925g);
        }

        public C5648c(Parcelable parcelable) {
            super(parcelable);
        }

        public C5648c(Parcel parcel) {
            super(parcel);
            this.f40919a = parcel.readString();
            this.f40921c = parcel.readFloat();
            this.f40922d = parcel.readInt() == 1;
            this.f40923e = parcel.readString();
            this.f40924f = parcel.readInt();
            this.f40925g = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f40902d = new LottieListener() { // from class: Tm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40903e = new C5646a();
        this.f40905g = 0;
        this.f40906h = new LottieDrawable();
        this.f40909k = false;
        this.f40910l = false;
        this.f40911m = true;
        this.f40912n = new HashSet();
        this.f40913o = new HashSet();
        m51003k(null, R.attr.lottieAnimationViewStyle);
    }

    /* renamed from: a */
    public static /* synthetic */ LottieResult m51013a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.m51002l(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m51012b(Throwable th2) {
        m51000n(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ LottieResult m51011c(LottieAnimationView lottieAnimationView, int i) {
        return lottieAnimationView.m51001m(i);
    }

    /* renamed from: n */
    public static /* synthetic */ void m51000n(Throwable th2) {
        if (Utils.isNetworkException(th2)) {
            Logger.warning("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        this.f40912n.add(UserActionTaken.SET_ANIMATION);
        m51006h();
        m51007g();
        this.f40914p = lottieTask.addListener(this.f40902d).addFailureListener(this.f40903e);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40906h.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40906h.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40906h.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition lottieComposition = this.f40915q;
        if (lottieComposition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
        return this.f40913o.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        this.f40906h.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    @MainThread
    public void cancelAnimation() {
        this.f40912n.add(UserActionTaken.PLAY_OPTION);
        this.f40906h.cancelAnimation();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.f40906h.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.f40906h.enableMergePathsForKitKatAndAbove(z);
    }

    /* renamed from: g */
    public final void m51007g() {
        LottieTask lottieTask = this.f40914p;
        if (lottieTask != null) {
            lottieTask.removeListener(this.f40902d);
            this.f40914p.removeFailureListener(this.f40903e);
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.f40906h.getClipToCompositionBounds();
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.f40915q;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.f40915q;
        if (lottieComposition != null) {
            return lottieComposition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f40906h.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f40906h.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f40906h.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.f40906h.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f40906h.getMinFrame();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.f40906h.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getProgress() {
        return this.f40906h.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.f40906h.getRenderMode();
    }

    public int getRepeatCount() {
        return this.f40906h.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f40906h.getRepeatMode();
    }

    public float getSpeed() {
        return this.f40906h.getSpeed();
    }

    /* renamed from: h */
    public final void m51006h() {
        this.f40915q = null;
        this.f40906h.clearComposition();
    }

    public boolean hasMasks() {
        return this.f40906h.hasMasks();
    }

    public boolean hasMatte() {
        return this.f40906h.hasMatte();
    }

    /* renamed from: i */
    public final LottieTask m51005i(final String str) {
        if (isInEditMode()) {
            return new LottieTask(new Callable() { // from class: Um0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m51013a(LottieAnimationView.this, str);
                }
            }, true);
        }
        if (this.f40911m) {
            return LottieCompositionFactory.fromAsset(getContext(), str);
        }
        return LottieCompositionFactory.fromAsset(getContext(), str, null);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.f40906h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f40906h;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.f40906h.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f40906h.isMergePathsEnabledForKitKatAndAbove();
    }

    /* renamed from: j */
    public final LottieTask m51004j(final int i) {
        if (isInEditMode()) {
            return new LottieTask(new Callable() { // from class: Wm0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m51011c(LottieAnimationView.this, i);
                }
            }, true);
        }
        if (this.f40911m) {
            return LottieCompositionFactory.fromRawRes(getContext(), i);
        }
        return LottieCompositionFactory.fromRawRes(getContext(), i, null);
    }

    /* renamed from: k */
    public final void m51003k(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i, 0);
        this.f40911m = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_rawRes);
        boolean hasValue2 = obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_fileName);
        boolean hasValue3 = obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_url);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.f40910l = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.f40906h.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(R.styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        m50998p(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f), obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_progress));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_colorFilter)) {
            addValueCallback(new KeyPath("**"), (KeyPath) LottieProperty.COLOR_FILTER, (LottieValueCallback<KeyPath>) new LottieValueCallback(new SimpleColorFilter(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_renderMode)) {
            int i2 = R.styleable.LottieAnimationView_lottie_renderMode;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i3 = obtainStyledAttributes.getInt(i2, renderMode.ordinal());
            if (i3 >= RenderMode.values().length) {
                i3 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        obtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable = this.f40906h;
        if (Utils.getAnimationScale(getContext()) != 0.0f) {
            z = true;
        }
        lottieDrawable.setSystemAnimationsAreEnabled(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final /* synthetic */ LottieResult m51002l(String str) {
        if (this.f40911m) {
            return LottieCompositionFactory.fromAssetSync(getContext(), str);
        }
        return LottieCompositionFactory.fromAssetSync(getContext(), str, null);
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable = this.f40906h;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable.setRepeatCount(i);
    }

    /* renamed from: m */
    public final /* synthetic */ LottieResult m51001m(int i) {
        if (this.f40911m) {
            return LottieCompositionFactory.fromRawResSync(getContext(), i);
        }
        return LottieCompositionFactory.fromRawResSync(getContext(), i, null);
    }

    /* renamed from: o */
    public final void m50999o() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.f40906h);
        if (isAnimating) {
            this.f40906h.resumeAnimation();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f40910l) {
            this.f40906h.playAnimation();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C5648c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5648c c5648c = (C5648c) parcelable;
        super.onRestoreInstanceState(c5648c.getSuperState());
        this.f40907i = c5648c.f40919a;
        Set set = this.f40912n;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.f40907i)) {
            setAnimation(this.f40907i);
        }
        this.f40908j = c5648c.f40920b;
        if (!this.f40912n.contains(userActionTaken) && (i = this.f40908j) != 0) {
            setAnimation(i);
        }
        if (!this.f40912n.contains(UserActionTaken.SET_PROGRESS)) {
            m50998p(c5648c.f40921c, false);
        }
        if (!this.f40912n.contains(UserActionTaken.PLAY_OPTION) && c5648c.f40922d) {
            playAnimation();
        }
        if (!this.f40912n.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(c5648c.f40923e);
        }
        if (!this.f40912n.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(c5648c.f40924f);
        }
        if (!this.f40912n.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            setRepeatCount(c5648c.f40925g);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5648c c5648c = new C5648c(super.onSaveInstanceState());
        c5648c.f40919a = this.f40907i;
        c5648c.f40920b = this.f40908j;
        c5648c.f40921c = this.f40906h.getProgress();
        c5648c.f40922d = this.f40906h.m50959D();
        c5648c.f40923e = this.f40906h.getImageAssetsFolder();
        c5648c.f40924f = this.f40906h.getRepeatMode();
        c5648c.f40925g = this.f40906h.getRepeatCount();
        return c5648c;
    }

    /* renamed from: p */
    public final void m50998p(float f, boolean z) {
        if (z) {
            this.f40912n.add(UserActionTaken.SET_PROGRESS);
        }
        this.f40906h.setProgress(f);
    }

    @MainThread
    public void pauseAnimation() {
        this.f40910l = false;
        this.f40906h.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        this.f40912n.add(UserActionTaken.PLAY_OPTION);
        this.f40906h.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.f40906h.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.f40913o.clear();
    }

    public void removeAllUpdateListeners() {
        this.f40906h.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40906h.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40906h.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.f40913o.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40906h.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.f40906h.resolveKeyPath(keyPath);
    }

    @MainThread
    public void resumeAnimation() {
        this.f40912n.add(UserActionTaken.PLAY_OPTION);
        this.f40906h.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.f40906h.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes int i) {
        this.f40908j = i;
        this.f40907i = null;
        setCompositionTask(m51004j(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f40911m ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f40906h.setApplyingOpacityToLayersEnabled(z);
    }

    public void setCacheComposition(boolean z) {
        this.f40911m = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f40906h.setClipToCompositionBounds(z);
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        if (C5644L.DBG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(lottieComposition);
        }
        this.f40906h.setCallback(this);
        this.f40915q = lottieComposition;
        this.f40909k = true;
        boolean composition = this.f40906h.setComposition(lottieComposition);
        this.f40909k = false;
        if (getDrawable() == this.f40906h && !composition) {
            return;
        }
        if (!composition) {
            m50999o();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener : this.f40913o) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f40906h.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f40904f = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f40905g = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.f40906h.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f40906h.setFontMap(map);
    }

    public void setFrame(int i) {
        this.f40906h.setFrame(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f40906h.setIgnoreDisabledSystemAnimations(z);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f40906h.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.f40906h.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m51007g();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m51007g();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m51007g();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f40906h.setMaintainOriginalImageBounds(z);
    }

    public void setMaxFrame(int i) {
        this.f40906h.setMaxFrame(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        this.f40906h.setMaxProgress(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f40906h.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f, @FloatRange(from = 0.0d, m64694to = 1.0d) float f2) {
        this.f40906h.setMinAndMaxProgress(f, f2);
    }

    public void setMinFrame(int i) {
        this.f40906h.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.f40906h.setMinProgress(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f40906h.setOutlineMasksAndMattes(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f40906h.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        m50998p(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f40906h.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i) {
        this.f40912n.add(UserActionTaken.SET_REPEAT_COUNT);
        this.f40906h.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f40912n.add(UserActionTaken.SET_REPEAT_MODE);
        this.f40906h.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f40906h.setSafeMode(z);
    }

    public void setSpeed(float f) {
        this.f40906h.setSpeed(f);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f40906h.setTextDelegate(textDelegate);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f40906h.setUseCompositionFrameRate(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.f40909k && drawable == (lottieDrawable = this.f40906h) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.f40909k && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.f40906h.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.f40906h.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) new C5647b(simpleLottieValueCallback));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f40906h.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f40906h.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f40906h.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f40906h.setMinAndMaxFrame(i, i2);
    }

    public void setAnimation(String str) {
        this.f40907i = str;
        this.f40908j = 0;
        setCompositionTask(m51005i(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40902d = new LottieListener() { // from class: Tm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40903e = new C5646a();
        this.f40905g = 0;
        this.f40906h = new LottieDrawable();
        this.f40909k = false;
        this.f40910l = false;
        this.f40911m = true;
        this.f40912n = new HashSet();
        this.f40913o = new HashSet();
        m51003k(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40902d = new LottieListener() { // from class: Tm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40903e = new C5646a();
        this.f40905g = 0;
        this.f40906h = new LottieDrawable();
        this.f40909k = false;
        this.f40910l = false;
        this.f40911m = true;
        this.f40912n = new HashSet();
        this.f40913o = new HashSet();
        m51003k(attributeSet, i);
    }
}