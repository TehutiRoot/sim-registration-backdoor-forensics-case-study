package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    public final Typeface f50474a;

    /* renamed from: b */
    public final ApplyFont f50475b;

    /* renamed from: c */
    public boolean f50476c;

    /* loaded from: classes4.dex */
    public interface ApplyFont {
        void apply(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f50474a = typeface;
        this.f50475b = applyFont;
    }

    /* renamed from: a */
    public final void m44401a(Typeface typeface) {
        if (!this.f50476c) {
            this.f50475b.apply(typeface);
        }
    }

    public void cancel() {
        this.f50476c = true;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrievalFailed(int i) {
        m44401a(this.f50474a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public void onFontRetrieved(Typeface typeface, boolean z) {
        m44401a(typeface);
    }
}
