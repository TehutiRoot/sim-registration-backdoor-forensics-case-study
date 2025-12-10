package com.google.android.odml.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes4.dex */
public class BitmapMlImageBuilder {

    /* renamed from: a */
    public final Bitmap f51591a;

    /* renamed from: b */
    public int f51592b;

    /* renamed from: c */
    public Rect f51593c;

    public BitmapMlImageBuilder(@NonNull Context context, @NonNull Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new C18876Yk2(this.f51591a), this.f51592b, this.f51593c, 0L, this.f51591a.getWidth(), this.f51591a.getHeight());
    }

    @NonNull
    public BitmapMlImageBuilder setRotation(int i) {
        MlImage.m43403g(i);
        this.f51592b = i;
        return this;
    }

    public BitmapMlImageBuilder(@NonNull Bitmap bitmap) {
        this.f51591a = bitmap;
        this.f51592b = 0;
        this.f51593c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}