package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* loaded from: classes4.dex */
public class MediaMlImageBuilder {

    /* renamed from: a */
    public final Image f51588a;

    /* renamed from: b */
    public int f51589b = 0;

    /* renamed from: c */
    public Rect f51590c;

    public MediaMlImageBuilder(@NonNull Image image) {
        this.f51588a = image;
        this.f51590c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new C19953fw2(this.f51588a), this.f51589b, this.f51590c, 0L, this.f51588a.getWidth(), this.f51588a.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i) {
        MlImage.m43416g(i);
        this.f51589b = i;
        return this;
    }
}
