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
    public final Bitmap f51579a;

    /* renamed from: b */
    public int f51580b;

    /* renamed from: c */
    public Rect f51581c;

    public BitmapMlImageBuilder(@NonNull Context context, @NonNull Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new C19229bk2(this.f51579a), this.f51580b, this.f51581c, 0L, this.f51579a.getWidth(), this.f51579a.getHeight());
    }

    @NonNull
    public BitmapMlImageBuilder setRotation(int i) {
        MlImage.m43416g(i);
        this.f51580b = i;
        return this;
    }

    public BitmapMlImageBuilder(@NonNull Bitmap bitmap) {
        this.f51579a = bitmap;
        this.f51580b = 0;
        this.f51581c = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
