package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class SideSheetCallback implements TG1 {
    /* renamed from: a */
    public void m44065a(View view) {
    }

    @Override // p000.TG1
    public abstract void onSlide(@NonNull View view, float f);

    @Override // p000.TG1
    public abstract void onStateChanged(@NonNull View view, int i);
}
