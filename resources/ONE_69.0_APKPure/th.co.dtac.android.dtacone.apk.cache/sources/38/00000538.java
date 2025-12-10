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

/* renamed from: FU1 */
/* loaded from: classes.dex */
public class FU1 {

    /* renamed from: a */
    public final Context f1692a;

    /* renamed from: b */
    public final View f1693b;

    /* renamed from: c */
    public final TextView f1694c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1695d;

    /* renamed from: e */
    public final Rect f1696e;

    /* renamed from: f */
    public final int[] f1697f;

    /* renamed from: g */
    public final int[] f1698g;

    public FU1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1695d = layoutParams;
        this.f1696e = new Rect();
        this.f1697f = new int[2];
        this.f1698g = new int[2];
        this.f1692a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1693b = inflate;
        this.f1694c = (TextView) inflate.findViewById(R.id.message);
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
    public static View m68422b(View view) {
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
    public final void m68423a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1692a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1692a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1692a.getResources();
        if (z) {
            i4 = R.dimen.tooltip_y_offset_touch;
        } else {
            i4 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View m68422b = m68422b(view);
        if (m68422b == null) {
            return;
        }
        m68422b.getWindowVisibleDisplayFrame(this.f1696e);
        Rect rect = this.f1696e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f1692a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i5 = resources2.getDimensionPixelSize(identifier);
            } else {
                i5 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f1696e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m68422b.getLocationOnScreen(this.f1698g);
        view.getLocationOnScreen(this.f1697f);
        int[] iArr = this.f1697f;
        int i6 = iArr[0];
        int[] iArr2 = this.f1698g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i) - (m68422b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1693b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1693b.getMeasuredHeight();
        int i8 = this.f1697f[1];
        int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.f1696e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    /* renamed from: c */
    public void m68421c() {
        if (!m68420d()) {
            return;
        }
        ((WindowManager) this.f1692a.getSystemService("window")).removeView(this.f1693b);
    }

    /* renamed from: d */
    public boolean m68420d() {
        if (this.f1693b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m68419e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m68420d()) {
            m68421c();
        }
        this.f1694c.setText(charSequence);
        m68423a(view, i, i2, z, this.f1695d);
        ((WindowManager) this.f1692a.getSystemService("window")).addView(this.f1693b, this.f1695d);
    }
}