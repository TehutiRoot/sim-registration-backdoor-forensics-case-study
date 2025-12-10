package com.isseiaoki.simplecropview;

import android.graphics.Bitmap;
import android.net.Uri;
import com.isseiaoki.simplecropview.callback.SaveCallback;
import io.reactivex.Single;

/* loaded from: classes5.dex */
public class SaveRequest {

    /* renamed from: a */
    public CropImageView f58196a;

    /* renamed from: b */
    public Bitmap f58197b;

    /* renamed from: c */
    public Bitmap.CompressFormat f58198c;

    /* renamed from: d */
    public int f58199d = -1;

    public SaveRequest(CropImageView cropImageView, Bitmap bitmap) {
        this.f58196a = cropImageView;
        this.f58197b = bitmap;
    }

    /* renamed from: a */
    public final void m33781a() {
        Bitmap.CompressFormat compressFormat = this.f58198c;
        if (compressFormat != null) {
            this.f58196a.setCompressFormat(compressFormat);
        }
        int i = this.f58199d;
        if (i >= 0) {
            this.f58196a.setCompressQuality(i);
        }
    }

    public SaveRequest compressFormat(Bitmap.CompressFormat compressFormat) {
        this.f58198c = compressFormat;
        return this;
    }

    public SaveRequest compressQuality(int i) {
        this.f58199d = i;
        return this;
    }

    public void execute(Uri uri, SaveCallback saveCallback) {
        m33781a();
        this.f58196a.saveAsync(uri, this.f58197b, saveCallback);
    }

    public Single<Uri> executeAsSingle(Uri uri) {
        m33781a();
        return this.f58196a.saveAsSingle(this.f58197b, uri);
    }
}
