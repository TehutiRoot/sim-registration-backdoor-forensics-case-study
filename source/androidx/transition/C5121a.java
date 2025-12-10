package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: androidx.transition.a */
/* loaded from: classes2.dex */
public class C5121a extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f37829a;

    /* renamed from: b */
    public boolean f37830b;

    public C5121a(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f37829a = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        D22.m68697b(this.f37829a).mo148a(this);
        this.f37830b = true;
    }

    /* renamed from: b */
    public static C5121a m52601b(ViewGroup viewGroup) {
        return (C5121a) viewGroup.getTag(R.id.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m52599d(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m52599d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m52598e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            if (view.getZ() <= view2.getZ()) {
                return false;
            }
            return true;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(D22.m68698a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m52597f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = (View) arrayList.get(i);
            View view2 = (View) arrayList2.get(i);
            if (view != view2) {
                return m52598e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m52602a(C5122b c5122b) {
        ArrayList arrayList = new ArrayList();
        m52599d(c5122b.f37833c, arrayList);
        int m52600c = m52600c(arrayList);
        if (m52600c >= 0 && m52600c < getChildCount()) {
            addView(c5122b, m52600c);
        } else {
            addView(c5122b);
        }
    }

    /* renamed from: c */
    public final int m52600c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m52599d(((C5122b) getChildAt(i2)).f37833c, arrayList2);
            if (m52597f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void m52596g() {
        if (this.f37830b) {
            D22.m68697b(this.f37829a).mo147b(this);
            D22.m68697b(this.f37829a).mo148a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f37830b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f37829a.setTag(R.id.ghost_view_holder, null);
            D22.m68697b(this.f37829a).mo147b(this);
            this.f37830b = false;
        }
    }
}
