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
    public static final LottieListener f40889r = new LottieListener() { // from class: Pm0
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            LottieAnimationView.m51015b((Throwable) obj);
        }
    };

    /* renamed from: d */
    public final LottieListener f40890d;

    /* renamed from: e */
    public final LottieListener f40891e;

    /* renamed from: f */
    public LottieListener f40892f;

    /* renamed from: g */
    public int f40893g;

    /* renamed from: h */
    public final LottieDrawable f40894h;

    /* renamed from: i */
    public String f40895i;

    /* renamed from: j */
    public int f40896j;

    /* renamed from: k */
    public boolean f40897k;

    /* renamed from: l */
    public boolean f40898l;

    /* renamed from: m */
    public boolean f40899m;

    /* renamed from: n */
    public final Set f40900n;

    /* renamed from: o */
    public final Set f40901o;

    /* renamed from: p */
    public LottieTask f40902p;

    /* renamed from: q */
    public LottieComposition f40903q;

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
    public class C5657a implements LottieListener {
        public C5657a() {
            LottieAnimationView.this = r1;
        }

        @Override // com.airbnb.lottie.LottieListener
        /* renamed from: a */
        public void onResult(Throwable th2) {
            if (LottieAnimationView.this.f40893g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f40893g);
            }
            (LottieAnimationView.this.f40892f == null ? LottieAnimationView.f40889r : LottieAnimationView.this.f40892f).onResult(th2);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    /* loaded from: classes3.dex */
    public class C5658b extends LottieValueCallback {

        /* renamed from: c */
        public final /* synthetic */ SimpleLottieValueCallback f40905c;

        public C5658b(SimpleLottieValueCallback simpleLottieValueCallback) {
            LottieAnimationView.this = r1;
            this.f40905c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public Object getValue(LottieFrameInfo lottieFrameInfo) {
            return this.f40905c.getValue(lottieFrameInfo);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    /* loaded from: classes3.dex */
    public static class C5659c extends View.BaseSavedState {
        public static final Parcelable.Creator<C5659c> CREATOR = new C5660a();

        /* renamed from: a */
        public String f40907a;

        /* renamed from: b */
        public int f40908b;

        /* renamed from: c */
        public float f40909c;

        /* renamed from: d */
        public boolean f40910d;

        /* renamed from: e */
        public String f40911e;

        /* renamed from: f */
        public int f40912f;

        /* renamed from: g */
        public int f40913g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$c$a */
        /* loaded from: classes3.dex */
        public class C5660a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5659c createFromParcel(Parcel parcel) {
                return new C5659c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C5659c[] newArray(int i) {
                return new C5659c[i];
            }
        }

        public /* synthetic */ C5659c(Parcel parcel, C5657a c5657a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f40907a);
            parcel.writeFloat(this.f40909c);
            parcel.writeInt(this.f40910d ? 1 : 0);
            parcel.writeString(this.f40911e);
            parcel.writeInt(this.f40912f);
            parcel.writeInt(this.f40913g);
        }

        public C5659c(Parcelable parcelable) {
            super(parcelable);
        }

        public C5659c(Parcel parcel) {
            super(parcel);
            this.f40907a = parcel.readString();
            this.f40909c = parcel.readFloat();
            this.f40910d = parcel.readInt() == 1;
            this.f40911e = parcel.readString();
            this.f40912f = parcel.readInt();
            this.f40913g = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f40890d = new LottieListener() { // from class: Nm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40891e = new C5657a();
        this.f40893g = 0;
        this.f40894h = new LottieDrawable();
        this.f40897k = false;
        this.f40898l = false;
        this.f40899m = true;
        this.f40900n = new HashSet();
        this.f40901o = new HashSet();
        m51006k(null, R.attr.lottieAnimationViewStyle);
    }

    /* renamed from: a */
    public static /* synthetic */ LottieResult m51016a(LottieAnimationView lottieAnimationView, String str) {
        return lottieAnimationView.m51005l(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m51015b(Throwable th2) {
        m51003n(th2);
    }

    /* renamed from: c */
    public static /* synthetic */ LottieResult m51014c(LottieAnimationView lottieAnimationView, int i) {
        return lottieAnimationView.m51004m(i);
    }

    /* renamed from: n */
    public static /* synthetic */ void m51003n(Throwable th2) {
        if (Utils.isNetworkException(th2)) {
            Logger.warning("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        this.f40900n.add(UserActionTaken.SET_ANIMATION);
        m51009h();
        m51010g();
        this.f40902p = lottieTask.addListener(this.f40890d).addFailureListener(this.f40891e);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40894h.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40894h.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40894h.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition lottieComposition = this.f40903q;
        if (lottieComposition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
        return this.f40901o.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        this.f40894h.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) lottieValueCallback);
    }

    @MainThread
    public void cancelAnimation() {
        this.f40900n.add(UserActionTaken.PLAY_OPTION);
        this.f40894h.cancelAnimation();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.f40894h.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.f40894h.enableMergePathsForKitKatAndAbove(z);
    }

    /* renamed from: g */
    public final void m51010g() {
        LottieTask lottieTask = this.f40902p;
        if (lottieTask != null) {
            lottieTask.removeListener(this.f40890d);
            this.f40902p.removeFailureListener(this.f40891e);
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.f40894h.getClipToCompositionBounds();
    }

    @Nullable
    public LottieComposition getComposition() {
        return this.f40903q;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.f40903q;
        if (lottieComposition != null) {
            return lottieComposition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f40894h.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f40894h.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f40894h.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.f40894h.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f40894h.getMinFrame();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.f40894h.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getProgress() {
        return this.f40894h.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.f40894h.getRenderMode();
    }

    public int getRepeatCount() {
        return this.f40894h.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f40894h.getRepeatMode();
    }

    public float getSpeed() {
        return this.f40894h.getSpeed();
    }

    /* renamed from: h */
    public final void m51009h() {
        this.f40903q = null;
        this.f40894h.clearComposition();
    }

    public boolean hasMasks() {
        return this.f40894h.hasMasks();
    }

    public boolean hasMatte() {
        return this.f40894h.hasMatte();
    }

    /* renamed from: i */
    public final LottieTask m51008i(final String str) {
        if (isInEditMode()) {
            return new LottieTask(new Callable() { // from class: Om0
                {
                    LottieAnimationView.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m51016a(LottieAnimationView.this, str);
                }
            }, true);
        }
        if (this.f40899m) {
            return LottieCompositionFactory.fromAsset(getContext(), str);
        }
        return LottieCompositionFactory.fromAsset(getContext(), str, null);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.f40894h.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f40894h;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.f40894h.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f40894h.isMergePathsEnabledForKitKatAndAbove();
    }

    /* renamed from: j */
    public final LottieTask m51007j(final int i) {
        if (isInEditMode()) {
            return new LottieTask(new Callable() { // from class: Qm0
                {
                    LottieAnimationView.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LottieAnimationView.m51014c(LottieAnimationView.this, i);
                }
            }, true);
        }
        if (this.f40899m) {
            return LottieCompositionFactory.fromRawRes(getContext(), i);
        }
        return LottieCompositionFactory.fromRawRes(getContext(), i, null);
    }

    /* renamed from: k */
    public final void m51006k(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i, 0);
        this.f40899m = obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
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
            this.f40898l = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false)) {
            this.f40894h.setRepeatCount(-1);
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
        m51001p(obtainStyledAttributes.getFloat(R.styleable.LottieAnimationView_lottie_progress, 0.0f), obtainStyledAttributes.hasValue(R.styleable.LottieAnimationView_lottie_progress));
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
        LottieDrawable lottieDrawable = this.f40894h;
        if (Utils.getAnimationScale(getContext()) != 0.0f) {
            z = true;
        }
        lottieDrawable.setSystemAnimationsAreEnabled(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final /* synthetic */ LottieResult m51005l(String str) {
        if (this.f40899m) {
            return LottieCompositionFactory.fromAssetSync(getContext(), str);
        }
        return LottieCompositionFactory.fromAssetSync(getContext(), str, null);
    }

    @Deprecated
    public void loop(boolean z) {
        int i;
        LottieDrawable lottieDrawable = this.f40894h;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        lottieDrawable.setRepeatCount(i);
    }

    /* renamed from: m */
    public final /* synthetic */ LottieResult m51004m(int i) {
        if (this.f40899m) {
            return LottieCompositionFactory.fromRawResSync(getContext(), i);
        }
        return LottieCompositionFactory.fromRawResSync(getContext(), i, null);
    }

    /* renamed from: o */
    public final void m51002o() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.f40894h);
        if (isAnimating) {
            this.f40894h.resumeAnimation();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f40898l) {
            this.f40894h.playAnimation();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C5659c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5659c c5659c = (C5659c) parcelable;
        super.onRestoreInstanceState(c5659c.getSuperState());
        this.f40895i = c5659c.f40907a;
        Set set = this.f40900n;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.f40895i)) {
            setAnimation(this.f40895i);
        }
        this.f40896j = c5659c.f40908b;
        if (!this.f40900n.contains(userActionTaken) && (i = this.f40896j) != 0) {
            setAnimation(i);
        }
        if (!this.f40900n.contains(UserActionTaken.SET_PROGRESS)) {
            m51001p(c5659c.f40909c, false);
        }
        if (!this.f40900n.contains(UserActionTaken.PLAY_OPTION) && c5659c.f40910d) {
            playAnimation();
        }
        if (!this.f40900n.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(c5659c.f40911e);
        }
        if (!this.f40900n.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(c5659c.f40912f);
        }
        if (!this.f40900n.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            setRepeatCount(c5659c.f40913g);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5659c c5659c = new C5659c(super.onSaveInstanceState());
        c5659c.f40907a = this.f40895i;
        c5659c.f40908b = this.f40896j;
        c5659c.f40909c = this.f40894h.getProgress();
        c5659c.f40910d = this.f40894h.m50962D();
        c5659c.f40911e = this.f40894h.getImageAssetsFolder();
        c5659c.f40912f = this.f40894h.getRepeatMode();
        c5659c.f40913g = this.f40894h.getRepeatCount();
        return c5659c;
    }

    /* renamed from: p */
    public final void m51001p(float f, boolean z) {
        if (z) {
            this.f40900n.add(UserActionTaken.SET_PROGRESS);
        }
        this.f40894h.setProgress(f);
    }

    @MainThread
    public void pauseAnimation() {
        this.f40898l = false;
        this.f40894h.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        this.f40900n.add(UserActionTaken.PLAY_OPTION);
        this.f40894h.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.f40894h.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.f40901o.clear();
    }

    public void removeAllUpdateListeners() {
        this.f40894h.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f40894h.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f40894h.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.f40901o.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40894h.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.f40894h.resolveKeyPath(keyPath);
    }

    @MainThread
    public void resumeAnimation() {
        this.f40900n.add(UserActionTaken.PLAY_OPTION);
        this.f40894h.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.f40894h.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes int i) {
        this.f40896j = i;
        this.f40895i = null;
        setCompositionTask(m51007j(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f40899m ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f40894h.setApplyingOpacityToLayersEnabled(z);
    }

    public void setCacheComposition(boolean z) {
        this.f40899m = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f40894h.setClipToCompositionBounds(z);
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        if (C5655L.DBG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Set Composition \n");
            sb.append(lottieComposition);
        }
        this.f40894h.setCallback(this);
        this.f40903q = lottieComposition;
        this.f40897k = true;
        boolean composition = this.f40894h.setComposition(lottieComposition);
        this.f40897k = false;
        if (getDrawable() == this.f40894h && !composition) {
            return;
        }
        if (!composition) {
            m51002o();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener : this.f40901o) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(lottieComposition);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f40894h.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f40892f = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f40893g = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.f40894h.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f40894h.setFontMap(map);
    }

    public void setFrame(int i) {
        this.f40894h.setFrame(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f40894h.setIgnoreDisabledSystemAnimations(z);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f40894h.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.f40894h.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m51010g();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m51010g();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m51010g();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f40894h.setMaintainOriginalImageBounds(z);
    }

    public void setMaxFrame(int i) {
        this.f40894h.setMaxFrame(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f40894h.setMaxProgress(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f40894h.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f, @FloatRange(from = 0.0d, m64743to = 1.0d) float f2) {
        this.f40894h.setMinAndMaxProgress(f, f2);
    }

    public void setMinFrame(int i) {
        this.f40894h.setMinFrame(i);
    }

    public void setMinProgress(float f) {
        this.f40894h.setMinProgress(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f40894h.setOutlineMasksAndMattes(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f40894h.setPerformanceTrackingEnabled(z);
    }

    public void setProgress(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        m51001p(f, true);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f40894h.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i) {
        this.f40900n.add(UserActionTaken.SET_REPEAT_COUNT);
        this.f40894h.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f40900n.add(UserActionTaken.SET_REPEAT_MODE);
        this.f40894h.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f40894h.setSafeMode(z);
    }

    public void setSpeed(float f) {
        this.f40894h.setSpeed(f);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f40894h.setTextDelegate(textDelegate);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f40894h.setUseCompositionFrameRate(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.f40897k && drawable == (lottieDrawable = this.f40894h) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.f40897k && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.f40894h.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.f40894h.addValueCallback(keyPath, (KeyPath) t, (LottieValueCallback<KeyPath>) new C5658b(simpleLottieValueCallback));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f40894h.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.f40894h.setMinAndMaxFrame(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.f40894h.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f40894h.setMinAndMaxFrame(i, i2);
    }

    public void setAnimation(String str) {
        this.f40895i = str;
        this.f40896j = 0;
        setCompositionTask(m51008i(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40890d = new LottieListener() { // from class: Nm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40891e = new C5657a();
        this.f40893g = 0;
        this.f40894h = new LottieDrawable();
        this.f40897k = false;
        this.f40898l = false;
        this.f40899m = true;
        this.f40900n = new HashSet();
        this.f40901o = new HashSet();
        m51006k(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40890d = new LottieListener() { // from class: Nm0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((LottieComposition) obj);
            }
        };
        this.f40891e = new C5657a();
        this.f40893g = 0;
        this.f40894h = new LottieDrawable();
        this.f40897k = false;
        this.f40898l = false;
        this.f40899m = true;
        this.f40900n = new HashSet();
        this.f40901o = new HashSet();
        m51006k(attributeSet, i);
    }
}
