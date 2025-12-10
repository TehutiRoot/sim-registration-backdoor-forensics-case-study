package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    public final Typeface f50486a;

    /* renamed from: b */
    public final ApplyFont f50487b;

    /* renamed from: c */
    public boolean f50488c;

    /* loaded from: classes4.dex */
    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f50486a = typeface;
        this.f50487b = applyFont;
    }

    /* renamed from: a */
    public final void m44388a(Typeface typeface) {
        if (!this.f50488c) {
            this.f50487b.apply(typeface);
        }
    }

    public void cancel() {
        this.f50488c = true;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int i) {
        m44388a(this.f50486a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface, boolean z) {
        m44388a(typeface);
    }
}