package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: I1 */
/* loaded from: classes.dex */
public class C0569I1 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f2386a;

    /* renamed from: I1$a */
    /* loaded from: classes.dex */
    public static class C0570a {
        /* renamed from: a */
        public static void m68011a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0569I1(ActionBarContainer actionBarContainer) {
        this.f2386a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2386a;
        if (actionBarContainer.f9460h) {
            Drawable drawable = actionBarContainer.f9459g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f9457e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2386a;
        Drawable drawable3 = actionBarContainer2.f9458f;
        if (drawable3 != null && actionBarContainer2.f9461i) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f2386a;
        if (actionBarContainer.f9460h) {
            if (actionBarContainer.f9459g != null) {
                C0570a.m68011a(actionBarContainer.f9457e, outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f9457e;
        if (drawable != null) {
            C0570a.m68011a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
