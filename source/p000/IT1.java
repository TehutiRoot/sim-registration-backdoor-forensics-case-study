package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R;

/* renamed from: IT1 */
/* loaded from: classes.dex */
public class IT1 {

    /* renamed from: a */
    public final Context f2513a;

    /* renamed from: b */
    public final View f2514b;

    /* renamed from: c */
    public final TextView f2515c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f2516d;

    /* renamed from: e */
    public final Rect f2517e;

    /* renamed from: f */
    public final int[] f2518f;

    /* renamed from: g */
    public final int[] f2519g;

    public IT1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2516d = layoutParams;
        this.f2517e = new Rect();
        this.f2518f = new int[2];
        this.f2519g = new int[2];
        this.f2513a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2514b = inflate;
        this.f2515c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m67910b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m67911a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f2513a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f2513a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f2513a.getResources();
        if (z) {
            i4 = R.dimen.tooltip_y_offset_touch;
        } else {
            i4 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View m67910b = m67910b(view);
        if (m67910b == null) {
            return;
        }
        m67910b.getWindowVisibleDisplayFrame(this.f2517e);
        Rect rect = this.f2517e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f2513a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i5 = resources2.getDimensionPixelSize(identifier);
            } else {
                i5 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f2517e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m67910b.getLocationOnScreen(this.f2519g);
        view.getLocationOnScreen(this.f2518f);
        int[] iArr = this.f2518f;
        int i6 = iArr[0];
        int[] iArr2 = this.f2519g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i) - (m67910b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f2514b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f2514b.getMeasuredHeight();
        int i8 = this.f2518f[1];
        int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.f2517e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    /* renamed from: c */
    public void m67909c() {
        if (!m67908d()) {
            return;
        }
        ((WindowManager) this.f2513a.getSystemService("window")).removeView(this.f2514b);
    }

    /* renamed from: d */
    public boolean m67908d() {
        if (this.f2514b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m67907e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m67908d()) {
            m67909c();
        }
        this.f2515c.setText(charSequence);
        m67911a(view, i, i2, z, this.f2516d);
        ((WindowManager) this.f2513a.getSystemService("window")).addView(this.f2514b, this.f2516d);
    }
}
