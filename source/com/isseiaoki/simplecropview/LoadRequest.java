package com.isseiaoki.simplecropview;

import android.graphics.RectF;
import android.net.Uri;
import com.isseiaoki.simplecropview.callback.LoadCallback;
import io.reactivex.Completable;

/* loaded from: classes5.dex */
public class LoadRequest {

    /* renamed from: a */
    public float f58191a;

    /* renamed from: b */
    public RectF f58192b;

    /* renamed from: c */
    public boolean f58193c;

    /* renamed from: d */
    public CropImageView f58194d;

    /* renamed from: e */
    public Uri f58195e;

    public LoadRequest(CropImageView cropImageView, Uri uri) {
        this.f58194d = cropImageView;
        this.f58195e = uri;
    }

    public void execute(LoadCallback loadCallback) {
        if (this.f58192b == null) {
            this.f58194d.setInitialFrameScale(this.f58191a);
        }
        this.f58194d.loadAsync(this.f58195e, this.f58193c, this.f58192b, loadCallback);
    }

    public Completable executeAsCompletable() {
        if (this.f58192b == null) {
            this.f58194d.setInitialFrameScale(this.f58191a);
        }
        return this.f58194d.loadAsCompletable(this.f58195e, this.f58193c, this.f58192b);
    }

    public LoadRequest initialFrameRect(RectF rectF) {
        this.f58192b = rectF;
        return this;
    }

    public LoadRequest initialFrameScale(float f) {
        this.f58191a = f;
        return this;
    }

    public LoadRequest useThumbnail(boolean z) {
        this.f58193c = z;
        return this;
    }
}
