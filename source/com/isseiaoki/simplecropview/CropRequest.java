package com.isseiaoki.simplecropview;

import android.graphics.Bitmap;
import android.net.Uri;
import com.isseiaoki.simplecropview.callback.CropCallback;
import io.reactivex.Single;

/* loaded from: classes5.dex */
public class CropRequest {

    /* renamed from: a */
    public CropImageView f58185a;

    /* renamed from: b */
    public Uri f58186b;

    /* renamed from: c */
    public int f58187c;

    /* renamed from: d */
    public int f58188d;

    /* renamed from: e */
    public int f58189e;

    /* renamed from: f */
    public int f58190f;

    public CropRequest(CropImageView cropImageView, Uri uri) {
        this.f58185a = cropImageView;
        this.f58186b = uri;
    }

    /* renamed from: a */
    public final void m33782a() {
        int i = this.f58187c;
        if (i > 0) {
            this.f58185a.setOutputWidth(i);
        }
        int i2 = this.f58188d;
        if (i2 > 0) {
            this.f58185a.setOutputHeight(i2);
        }
        this.f58185a.setOutputMaxSize(this.f58189e, this.f58190f);
    }

    public void execute(CropCallback cropCallback) {
        m33782a();
        this.f58185a.cropAsync(this.f58186b, cropCallback);
    }

    public Single<Bitmap> executeAsSingle() {
        m33782a();
        return this.f58185a.cropAsSingle(this.f58186b);
    }

    public CropRequest outputHeight(int i) {
        this.f58188d = i;
        this.f58187c = 0;
        return this;
    }

    public CropRequest outputMaxHeight(int i) {
        this.f58190f = i;
        return this;
    }

    public CropRequest outputMaxWidth(int i) {
        this.f58189e = i;
        return this;
    }

    public CropRequest outputWidth(int i) {
        this.f58187c = i;
        this.f58188d = 0;
        return this;
    }
}
