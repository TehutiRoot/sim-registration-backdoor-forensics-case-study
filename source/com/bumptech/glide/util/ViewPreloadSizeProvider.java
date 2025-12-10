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
    public int[] f42743a;

    /* renamed from: b */
    public C5939a f42744b;

    /* renamed from: com.bumptech.glide.util.ViewPreloadSizeProvider$a */
    /* loaded from: classes3.dex */
    public static final class C5939a extends CustomViewTarget {
        public C5939a(View view) {
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
        int[] iArr = this.f42743a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        this.f42743a = new int[]{i, i2};
        this.f42744b = null;
    }

    public void setView(@NonNull View view) {
        if (this.f42743a == null && this.f42744b == null) {
            C5939a c5939a = new C5939a(view);
            this.f42744b = c5939a;
            c5939a.getSize(this);
        }
    }

    public ViewPreloadSizeProvider(@NonNull View view) {
        C5939a c5939a = new C5939a(view);
        this.f42744b = c5939a;
        c5939a.getSize(this);
    }
}
