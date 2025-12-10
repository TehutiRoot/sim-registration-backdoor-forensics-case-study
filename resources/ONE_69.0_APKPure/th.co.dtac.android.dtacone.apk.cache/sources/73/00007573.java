package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: androidx.transition.a */
/* loaded from: classes2.dex */
public class C5103a extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f37917a;

    /* renamed from: b */
    public boolean f37918b;

    public C5103a(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f37917a = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        A32.m69330b(this.f37917a).mo612a(this);
        this.f37918b = true;
    }

    /* renamed from: b */
    public static C5103a m52552b(ViewGroup viewGroup) {
        return (C5103a) viewGroup.getTag(R.id.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m52550d(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m52550d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m52549e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            if (view.getZ() <= view2.getZ()) {
                return false;
            }
            return true;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(A32.m69331a(viewGroup, i));
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
    public static boolean m52548f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = (View) arrayList.get(i);
            View view2 = (View) arrayList2.get(i);
            if (view != view2) {
                return m52549e(view, view2);
            }
        }
        if (arrayList2.size() == min) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m52553a(C5104b c5104b) {
        ArrayList arrayList = new ArrayList();
        m52550d(c5104b.f37921c, arrayList);
        int m52551c = m52551c(arrayList);
        if (m52551c >= 0 && m52551c < getChildCount()) {
            addView(c5104b, m52551c);
        } else {
            addView(c5104b);
        }
    }

    /* renamed from: c */
    public final int m52551c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m52550d(((C5104b) getChildAt(i2)).f37921c, arrayList2);
            if (m52548f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void m52547g() {
        if (this.f37918b) {
            A32.m69330b(this.f37917a).mo611b(this);
            A32.m69330b(this.f37917a).mo612a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f37918b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f37917a.setTag(R.id.ghost_view_holder, null);
            A32.m69330b(this.f37917a).mo611b(this);
            this.f37918b = false;
        }
    }
}