package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class TextAppearance {

    /* renamed from: a */
    public ColorStateList f50477a;

    /* renamed from: b */
    public float f50478b;

    /* renamed from: c */
    public final int f50479c;

    /* renamed from: d */
    public boolean f50480d = false;

    /* renamed from: e */
    public Typeface f50481e;
    @Nullable
    public final String fontFamily;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable
    public final ColorStateList textColorHint;
    @Nullable
    public final ColorStateList textColorLink;
    public final int textStyle;
    public final int typeface;

    /* renamed from: com.google.android.material.resources.TextAppearance$a */
    /* loaded from: classes4.dex */
    public class C7032a extends ResourcesCompat.FontCallback {

        /* renamed from: a */
        public final /* synthetic */ TextAppearanceFontCallback f50482a;

        public C7032a(TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f50482a = textAppearanceFontCallback;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrievalFailed(int i) {
            TextAppearance.this.f50480d = true;
            this.f50482a.onFontRetrievalFailed(i);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        public void onFontRetrieved(Typeface typeface) {
            TextAppearance textAppearance = TextAppearance.this;
            textAppearance.f50481e = Typeface.create(typeface, textAppearance.textStyle);
            TextAppearance.this.f50480d = true;
            this.f50482a.onFontRetrieved(TextAppearance.this.f50481e, false);
        }
    }

    /* renamed from: com.google.android.material.resources.TextAppearance$b */
    /* loaded from: classes4.dex */
    public class C7033b extends TextAppearanceFontCallback {

        /* renamed from: a */
        public final /* synthetic */ Context f50484a;

        /* renamed from: b */
        public final /* synthetic */ TextPaint f50485b;

        /* renamed from: c */
        public final /* synthetic */ TextAppearanceFontCallback f50486c;

        public C7033b(Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
            this.f50484a = context;
            this.f50485b = textPaint;
            this.f50486c = textAppearanceFontCallback;
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            this.f50486c.onFontRetrievalFailed(i);
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
            TextAppearance.this.updateTextPaintMeasureState(this.f50484a, this.f50485b, typeface);
            this.f50486c.onFontRetrieved(typeface, z);
        }
    }

    public TextAppearance(@NonNull Context context, @StyleRes int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
        setTextSize(obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
        int m44399b = MaterialResources.m44399b(obtainStyledAttributes, R.styleable.TextAppearance_fontFamily, R.styleable.TextAppearance_android_fontFamily);
        this.f50479c = obtainStyledAttributes.getResourceId(m44399b, 0);
        this.fontFamily = obtainStyledAttributes.getString(m44399b);
        this.textAllCaps = obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, R.styleable.MaterialTextAppearance);
        this.hasLetterSpacing = obtainStyledAttributes2.hasValue(R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = obtainStyledAttributes2.getFloat(R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    public final void m44395d() {
        String str;
        if (this.f50481e == null && (str = this.fontFamily) != null) {
            this.f50481e = Typeface.create(str, this.textStyle);
        }
        if (this.f50481e == null) {
            int i = this.typeface;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f50481e = Typeface.DEFAULT;
                    } else {
                        this.f50481e = Typeface.MONOSPACE;
                    }
                } else {
                    this.f50481e = Typeface.SERIF;
                }
            } else {
                this.f50481e = Typeface.SANS_SERIF;
            }
            this.f50481e = Typeface.create(this.f50481e, this.textStyle);
        }
    }

    /* renamed from: e */
    public final boolean m44394e(Context context) {
        Typeface typeface;
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.f50479c;
        if (i != 0) {
            typeface = ResourcesCompat.getCachedFont(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface getFallbackFont() {
        m44395d();
        return this.f50481e;
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.f50480d) {
            return this.f50481e;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f50479c);
                this.f50481e = font;
                if (font != null) {
                    this.f50481e = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.fontFamily);
            }
        }
        m44395d();
        this.f50480d = true;
        return this.f50481e;
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m44394e(context)) {
            getFont(context);
        } else {
            m44395d();
        }
        int i = this.f50479c;
        if (i == 0) {
            this.f50480d = true;
        }
        if (this.f50480d) {
            textAppearanceFontCallback.onFontRetrieved(this.f50481e, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new C7032a(textAppearanceFontCallback), null);
        } catch (Resources.NotFoundException unused) {
            this.f50480d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.fontFamily);
            this.f50480d = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.f50477a;
    }

    public float getTextSize() {
        return this.f50478b;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.f50477a = colorStateList;
    }

    public void setTextSize(float f) {
        this.f50478b = f;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        int i;
        int i2;
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f50477a;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m44394e(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        boolean z;
        float f;
        Typeface maybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (maybeCopyWithFontWeightAdjustment != null) {
            typeface = maybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.textStyle & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f50478b);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new C7033b(context, textPaint, textAppearanceFontCallback));
    }
}
