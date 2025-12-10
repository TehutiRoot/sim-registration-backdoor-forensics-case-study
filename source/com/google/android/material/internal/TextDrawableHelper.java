package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class TextDrawableHelper {

    /* renamed from: c */
    public float f50280c;

    /* renamed from: f */
    public TextAppearance f50283f;

    /* renamed from: a */
    public final TextPaint f50278a = new TextPaint(1);

    /* renamed from: b */
    public final TextAppearanceFontCallback f50279b = new C6999a();

    /* renamed from: d */
    public boolean f50281d = true;

    /* renamed from: e */
    public WeakReference f50282e = new WeakReference(null);

    /* loaded from: classes4.dex */
    public interface TextDrawableDelegate {
        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    /* renamed from: com.google.android.material.internal.TextDrawableHelper$a */
    /* loaded from: classes4.dex */
    public class C6999a extends TextAppearanceFontCallback {
        public C6999a() {
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            TextDrawableHelper.this.f50281d = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f50282e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
            if (!z) {
                TextDrawableHelper.this.f50281d = true;
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.f50282e.get();
                if (textDrawableDelegate != null) {
                    textDrawableDelegate.onTextSizeChange();
                }
            }
        }
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    /* renamed from: c */
    public final float m44544c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f50278a.measureText(charSequence, 0, charSequence.length());
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.f50283f;
    }

    @NonNull
    public TextPaint getTextPaint() {
        return this.f50278a;
    }

    public float getTextWidth(String str) {
        if (!this.f50281d) {
            return this.f50280c;
        }
        float m44544c = m44544c(str);
        this.f50280c = m44544c;
        this.f50281d = false;
        return m44544c;
    }

    public boolean isTextWidthDirty() {
        return this.f50281d;
    }

    public void setDelegate(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f50282e = new WeakReference(textDrawableDelegate);
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f50283f != textAppearance) {
            this.f50283f = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.f50278a, this.f50279b);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.f50282e.get();
                if (textDrawableDelegate != null) {
                    this.f50278a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.f50278a, this.f50279b);
                this.f50281d = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.f50282e.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextWidthDirty(boolean z) {
        this.f50281d = z;
    }

    public void updateTextPaintDrawState(Context context) {
        this.f50283f.updateDrawState(context, this.f50278a, this.f50279b);
    }
}
