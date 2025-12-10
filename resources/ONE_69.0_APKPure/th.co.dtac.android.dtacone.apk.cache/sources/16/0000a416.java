package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes4.dex */
public class MediaMlImageBuilder {

    /* renamed from: a */
    public final Image f51600a;

    /* renamed from: b */
    public int f51601b = 0;

    /* renamed from: c */
    public Rect f51602c;

    public MediaMlImageBuilder(@NonNull Image image) {
        this.f51600a = image;
        this.f51602c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new C19489cx2(this.f51600a), this.f51601b, this.f51602c, 0L, this.f51600a.getWidth(), this.f51600a.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i) {
        MlImage.m43403g(i);
        this.f51601b = i;
        return this;
    }
}