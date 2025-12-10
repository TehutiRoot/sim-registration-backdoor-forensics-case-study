package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: I1 */
/* loaded from: classes.dex */
public class C0560I1 extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f2544a;

    /* renamed from: I1$a */
    /* loaded from: classes.dex */
    public static class C0561a {
        /* renamed from: a */
        public static void m68074a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0560I1(ActionBarContainer actionBarContainer) {
        this.f2544a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2544a;
        if (actionBarContainer.f9548h) {
            Drawable drawable = actionBarContainer.f9547g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f9545e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2544a;
        Drawable drawable3 = actionBarContainer2.f9546f;
        if (drawable3 != null && actionBarContainer2.f9549i) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f2544a;
        if (actionBarContainer.f9548h) {
            if (actionBarContainer.f9547g != null) {
                C0561a.m68074a(actionBarContainer.f9545e, outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f9545e;
        if (drawable != null) {
            C0561a.m68074a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}