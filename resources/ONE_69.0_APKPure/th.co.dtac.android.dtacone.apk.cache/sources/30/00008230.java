package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {

    /* renamed from: a */
    public int[] f42755a;

    /* renamed from: b */
    public C5928a f42756b;

    /* renamed from: com.bumptech.glide.util.ViewPreloadSizeProvider$a */
    /* loaded from: classes3.dex */
    public static final class C5928a extends CustomViewTarget {
        public C5928a(View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(Object obj, Transition transition) {
        }
    }

    public ViewPreloadSizeProvider() {
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull T t, int i, int i2) {
        int[] iArr = this.f42755a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        this.f42755a = new int[]{i, i2};
        this.f42756b = null;
    }

    public void setView(@NonNull View view) {
        if (this.f42755a == null && this.f42756b == null) {
            C5928a c5928a = new C5928a(view);
            this.f42756b = c5928a;
            c5928a.getSize(this);
        }
    }

    public ViewPreloadSizeProvider(@NonNull View view) {
        C5928a c5928a = new C5928a(view);
        this.f42756b = c5928a;
        c5928a.getSize(this);
    }
}