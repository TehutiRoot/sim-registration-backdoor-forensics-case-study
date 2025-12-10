package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes3.dex */
public final class PreloadTarget<Z> extends CustomTarget<Z> {

    /* renamed from: e */
    public static final Handler f42675e = new Handler(Looper.getMainLooper(), new C5913a());

    /* renamed from: d */
    public final RequestManager f42676d;

    /* renamed from: com.bumptech.glide.request.target.PreloadTarget$a */
    /* loaded from: classes3.dex */
    public class C5913a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((PreloadTarget) message.obj).m50010a();
                return true;
            }
            return false;
        }
    }

    public PreloadTarget(RequestManager requestManager, int i, int i2) {
        super(i, i2);
        this.f42676d = requestManager;
    }

    public static <Z> PreloadTarget<Z> obtain(RequestManager requestManager, int i, int i2) {
        return new PreloadTarget<>(requestManager, i, i2);
    }

    /* renamed from: a */
    public void m50010a() {
        this.f42676d.clear(this);
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Z z, @Nullable Transition<? super Z> transition) {
        Request request = getRequest();
        if (request != null && request.isComplete()) {
            f42675e.obtainMessage(1, this).sendToTarget();
        }
    }
}