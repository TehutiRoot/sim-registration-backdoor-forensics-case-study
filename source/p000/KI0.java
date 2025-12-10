package p000;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableResource;

/* renamed from: KI0 */
/* loaded from: classes3.dex */
public final class KI0 extends DrawableResource {
    public KI0(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public static Resource m67627a(Drawable drawable) {
        if (drawable != null) {
            return new KI0(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public Class getResourceClass() {
        return this.drawable.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Math.max(1, this.drawable.getIntrinsicWidth() * this.drawable.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}
