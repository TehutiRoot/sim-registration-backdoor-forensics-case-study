package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ViewTransitionController {

    /* renamed from: a */
    public final MotionLayout f33056a;

    /* renamed from: c */
    public HashSet f33058c;

    /* renamed from: e */
    public ArrayList f33060e;

    /* renamed from: b */
    public ArrayList f33057b = new ArrayList();

    /* renamed from: d */
    public String f33059d = "ViewTransitionController";

    /* renamed from: f */
    public ArrayList f33061f = new ArrayList();

    /* renamed from: androidx.constraintlayout.motion.widget.ViewTransitionController$a */
    /* loaded from: classes2.dex */
    public class C3763a implements SharedValues.SharedValuesListener {

        /* renamed from: a */
        public final /* synthetic */ ViewTransition f33062a;

        /* renamed from: b */
        public final /* synthetic */ int f33063b;

        /* renamed from: c */
        public final /* synthetic */ boolean f33064c;

        /* renamed from: d */
        public final /* synthetic */ int f33065d;

        public C3763a(ViewTransition viewTransition, int i, boolean z, int i2) {
            this.f33062a = viewTransition;
            this.f33063b = i;
            this.f33064c = z;
            this.f33065d = i2;
        }

        @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
        public void onNewValue(int i, int i2, int i3) {
            int sharedValueCurrent = this.f33062a.getSharedValueCurrent();
            this.f33062a.setSharedValueCurrent(i2);
            if (this.f33063b == i && sharedValueCurrent != i2) {
                if (this.f33064c) {
                    if (this.f33065d == i2) {
                        int childCount = ViewTransitionController.this.f33056a.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt = ViewTransitionController.this.f33056a.getChildAt(i4);
                            if (this.f33062a.m58227i(childAt)) {
                                int currentState = ViewTransitionController.this.f33056a.getCurrentState();
                                ConstraintSet constraintSet = ViewTransitionController.this.f33056a.getConstraintSet(currentState);
                                ViewTransition viewTransition = this.f33062a;
                                ViewTransitionController viewTransitionController = ViewTransitionController.this;
                                viewTransition.m58233c(viewTransitionController, viewTransitionController.f33056a, currentState, constraintSet, childAt);
                            }
                        }
                    }
                } else if (this.f33065d != i2) {
                    int childCount2 = ViewTransitionController.this.f33056a.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = ViewTransitionController.this.f33056a.getChildAt(i5);
                        if (this.f33062a.m58227i(childAt2)) {
                            int currentState2 = ViewTransitionController.this.f33056a.getCurrentState();
                            ConstraintSet constraintSet2 = ViewTransitionController.this.f33056a.getConstraintSet(currentState2);
                            ViewTransition viewTransition2 = this.f33062a;
                            ViewTransitionController viewTransitionController2 = ViewTransitionController.this;
                            viewTransition2.m58233c(viewTransitionController2, viewTransitionController2.f33056a, currentState2, constraintSet2, childAt2);
                        }
                    }
                }
            }
        }
    }

    public ViewTransitionController(MotionLayout motionLayout) {
        this.f33056a = motionLayout;
    }

    public void add(ViewTransition viewTransition) {
        this.f33057b.add(viewTransition);
        this.f33058c = null;
        if (viewTransition.getStateTransition() == 4) {
            m58210h(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 5) {
            m58210h(viewTransition, false);
        }
    }

    /* renamed from: b */
    public void m58216b(ViewTransition.C3762b c3762b) {
        if (this.f33060e == null) {
            this.f33060e = new ArrayList();
        }
        this.f33060e.add(c3762b);
    }

    /* renamed from: c */
    public void m58215c() {
        ArrayList arrayList = this.f33060e;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ViewTransition.C3762b) it.next()).m58222a();
        }
        this.f33060e.removeAll(this.f33061f);
        this.f33061f.clear();
        if (this.f33060e.isEmpty()) {
            this.f33060e = null;
        }
    }

    /* renamed from: d */
    public boolean m58214d(int i, MotionController motionController) {
        Iterator it = this.f33057b.iterator();
        while (it.hasNext()) {
            ViewTransition viewTransition = (ViewTransition) it.next();
            if (viewTransition.m58231e() == i) {
                viewTransition.f33023f.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public void m58213e(int i, boolean z) {
        Iterator it = this.f33057b.iterator();
        while (it.hasNext()) {
            ViewTransition viewTransition = (ViewTransition) it.next();
            if (viewTransition.m58231e() == i) {
                viewTransition.m58225k(z);
                return;
            }
        }
    }

    /* renamed from: f */
    public void m58212f() {
        this.f33056a.invalidate();
    }

    /* renamed from: g */
    public boolean m58211g(int i) {
        Iterator it = this.f33057b.iterator();
        while (it.hasNext()) {
            ViewTransition viewTransition = (ViewTransition) it.next();
            if (viewTransition.m58231e() == i) {
                return viewTransition.m58229g();
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m58210h(ViewTransition viewTransition, boolean z) {
        ConstraintLayout.getSharedValues().addListener(viewTransition.getSharedValueID(), new C3763a(viewTransition, viewTransition.getSharedValueID(), z, viewTransition.getSharedValue()));
    }

    /* renamed from: i */
    public void m58209i(ViewTransition.C3762b c3762b) {
        this.f33061f.add(c3762b);
    }

    /* renamed from: j */
    public void m58208j(MotionEvent motionEvent) {
        ViewTransition viewTransition;
        int currentState = this.f33056a.getCurrentState();
        if (currentState == -1) {
            return;
        }
        if (this.f33058c == null) {
            this.f33058c = new HashSet();
            Iterator it = this.f33057b.iterator();
            while (it.hasNext()) {
                ViewTransition viewTransition2 = (ViewTransition) it.next();
                int childCount = this.f33056a.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.f33056a.getChildAt(i);
                    if (viewTransition2.m58227i(childAt)) {
                        childAt.getId();
                        this.f33058c.add(childAt);
                    }
                }
            }
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Rect rect = new Rect();
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f33060e;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = this.f33060e.iterator();
            while (it2.hasNext()) {
                ((ViewTransition.C3762b) it2.next()).m58219d(action, x, y);
            }
        }
        if (action == 0 || action == 1) {
            ConstraintSet constraintSet = this.f33056a.getConstraintSet(currentState);
            Iterator it3 = this.f33057b.iterator();
            while (it3.hasNext()) {
                ViewTransition viewTransition3 = (ViewTransition) it3.next();
                if (viewTransition3.m58224l(action)) {
                    Iterator it4 = this.f33058c.iterator();
                    while (it4.hasNext()) {
                        View view = (View) it4.next();
                        if (viewTransition3.m58227i(view)) {
                            view.getHitRect(rect);
                            if (rect.contains((int) x, (int) y)) {
                                viewTransition = viewTransition3;
                                viewTransition3.m58233c(this, this.f33056a, currentState, constraintSet, view);
                            } else {
                                viewTransition = viewTransition3;
                            }
                            viewTransition3 = viewTransition;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void m58207k(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33057b.iterator();
        while (it.hasNext()) {
            ViewTransition viewTransition = (ViewTransition) it.next();
            if (viewTransition.m58231e() == i) {
                for (View view : viewArr) {
                    if (viewTransition.m58232d(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m58206l(viewTransition, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: l */
    public final void m58206l(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.f33056a.getCurrentState();
        if (viewTransition.f33022e != 2) {
            if (currentState == -1) {
                String str = this.f33059d;
                Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.f33056a.toString());
                return;
            }
            ConstraintSet constraintSet = this.f33056a.getConstraintSet(currentState);
            if (constraintSet == null) {
                return;
            }
            viewTransition.m58233c(this, this.f33056a, currentState, constraintSet, viewArr);
            return;
        }
        viewTransition.m58233c(this, this.f33056a, currentState, null, viewArr);
    }
}
