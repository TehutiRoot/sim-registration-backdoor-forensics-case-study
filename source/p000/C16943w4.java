package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: w4 */
/* loaded from: classes2.dex */
public final class C16943w4 {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f107891b;

    /* renamed from: a */
    public LinearLayoutManager f107892a;

    /* renamed from: w4$a */
    /* loaded from: classes2.dex */
    public class C16944a implements Comparator {
        public C16944a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f107891b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C16943w4(LinearLayoutManager linearLayoutManager) {
        this.f107892a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m925c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m925c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m927a() {
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.f107892a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (this.f107892a.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, childCount, 2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f107892a.getChildAt(i3);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f107891b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = childAt.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = childAt.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C16944a());
        for (int i4 = 1; i4 < childCount; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        int i7 = i5 - i6;
        if (i6 <= 0 && iArr[childCount - 1][1] >= i7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m926b() {
        int childCount = this.f107892a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m925c(this.f107892a.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m924d() {
        if ((!m927a() || this.f107892a.getChildCount() <= 1) && m926b()) {
            return true;
        }
        return false;
    }
}
