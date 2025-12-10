package me.dm7.barcodescanner.core;

import android.graphics.Rect;

/* loaded from: classes6.dex */
public interface IViewFinder {
    Rect getFramingRect();

    int getHeight();

    int getWidth();

    void setupViewFinder();
}