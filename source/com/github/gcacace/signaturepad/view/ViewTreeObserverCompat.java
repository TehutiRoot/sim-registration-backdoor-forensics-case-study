package com.github.gcacace.signaturepad.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public class ViewTreeObserverCompat {
    @SuppressLint({"NewApi"})
    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }
}
