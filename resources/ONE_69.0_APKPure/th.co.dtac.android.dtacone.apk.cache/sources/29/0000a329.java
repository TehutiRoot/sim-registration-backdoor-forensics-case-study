package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class SideSheetCallback implements QH1 {
    /* renamed from: a */
    public void m44052a(View view) {
    }

    @Override // p000.QH1
    public abstract void onSlide(@NonNull View view, float f);

    @Override // p000.QH1
    public abstract void onStateChanged(@NonNull View view, int i);
}