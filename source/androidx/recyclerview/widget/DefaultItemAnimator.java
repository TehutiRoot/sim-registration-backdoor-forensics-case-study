package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: s */
    public static TimeInterpolator f36612s;

    /* renamed from: h */
    public ArrayList f36613h = new ArrayList();

    /* renamed from: i */
    public ArrayList f36614i = new ArrayList();

    /* renamed from: j */
    public ArrayList f36615j = new ArrayList();

    /* renamed from: k */
    public ArrayList f36616k = new ArrayList();

    /* renamed from: l */
    public ArrayList f36617l = new ArrayList();

    /* renamed from: m */
    public ArrayList f36618m = new ArrayList();

    /* renamed from: n */
    public ArrayList f36619n = new ArrayList();

    /* renamed from: o */
    public ArrayList f36620o = new ArrayList();

    /* renamed from: p */
    public ArrayList f36621p = new ArrayList();

    /* renamed from: q */
    public ArrayList f36622q = new ArrayList();

    /* renamed from: r */
    public ArrayList f36623r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$a */
    /* loaded from: classes2.dex */
    public class RunnableC4881a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36624a;

        public RunnableC4881a(ArrayList arrayList) {
            this.f36624a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36624a.iterator();
            while (it.hasNext()) {
                C4890j c4890j = (C4890j) it.next();
                DefaultItemAnimator.this.m53653e(c4890j.f36658a, c4890j.f36659b, c4890j.f36660c, c4890j.f36661d, c4890j.f36662e);
            }
            this.f36624a.clear();
            DefaultItemAnimator.this.f36618m.remove(this.f36624a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$b */
    /* loaded from: classes2.dex */
    public class RunnableC4882b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36626a;

        public RunnableC4882b(ArrayList arrayList) {
            this.f36626a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36626a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.m53654d((C4889i) it.next());
            }
            this.f36626a.clear();
            DefaultItemAnimator.this.f36619n.remove(this.f36626a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$c */
    /* loaded from: classes2.dex */
    public class RunnableC4883c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36628a;

        public RunnableC4883c(ArrayList arrayList) {
            this.f36628a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36628a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.m53655c((RecyclerView.ViewHolder) it.next());
            }
            this.f36628a.clear();
            DefaultItemAnimator.this.f36617l.remove(this.f36628a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$d */
    /* loaded from: classes2.dex */
    public class C4884d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36630a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36631b;

        /* renamed from: c */
        public final /* synthetic */ View f36632c;

        public C4884d(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36630a = viewHolder;
            this.f36631b = viewPropertyAnimator;
            this.f36632c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36631b.setListener(null);
            this.f36632c.setAlpha(1.0f);
            DefaultItemAnimator.this.dispatchRemoveFinished(this.f36630a);
            DefaultItemAnimator.this.f36622q.remove(this.f36630a);
            DefaultItemAnimator.this.m53650h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchRemoveStarting(this.f36630a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$e */
    /* loaded from: classes2.dex */
    public class C4885e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36634a;

        /* renamed from: b */
        public final /* synthetic */ View f36635b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f36636c;

        public C4885e(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f36634a = viewHolder;
            this.f36635b = view;
            this.f36636c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f36635b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36636c.setListener(null);
            DefaultItemAnimator.this.dispatchAddFinished(this.f36634a);
            DefaultItemAnimator.this.f36620o.remove(this.f36634a);
            DefaultItemAnimator.this.m53650h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchAddStarting(this.f36634a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$f */
    /* loaded from: classes2.dex */
    public class C4886f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36638a;

        /* renamed from: b */
        public final /* synthetic */ int f36639b;

        /* renamed from: c */
        public final /* synthetic */ View f36640c;

        /* renamed from: d */
        public final /* synthetic */ int f36641d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f36642e;

        public C4886f(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f36638a = viewHolder;
            this.f36639b = i;
            this.f36640c = view;
            this.f36641d = i2;
            this.f36642e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f36639b != 0) {
                this.f36640c.setTranslationX(0.0f);
            }
            if (this.f36641d != 0) {
                this.f36640c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36642e.setListener(null);
            DefaultItemAnimator.this.dispatchMoveFinished(this.f36638a);
            DefaultItemAnimator.this.f36621p.remove(this.f36638a);
            DefaultItemAnimator.this.m53650h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchMoveStarting(this.f36638a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$g */
    /* loaded from: classes2.dex */
    public class C4887g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4889i f36644a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36645b;

        /* renamed from: c */
        public final /* synthetic */ View f36646c;

        public C4887g(C4889i c4889i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36644a = c4889i;
            this.f36645b = viewPropertyAnimator;
            this.f36646c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36645b.setListener(null);
            this.f36646c.setAlpha(1.0f);
            this.f36646c.setTranslationX(0.0f);
            this.f36646c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f36644a.f36652a, true);
            DefaultItemAnimator.this.f36623r.remove(this.f36644a.f36652a);
            DefaultItemAnimator.this.m53650h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f36644a.f36652a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$h */
    /* loaded from: classes2.dex */
    public class C4888h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4889i f36648a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36649b;

        /* renamed from: c */
        public final /* synthetic */ View f36650c;

        public C4888h(C4889i c4889i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36648a = c4889i;
            this.f36649b = viewPropertyAnimator;
            this.f36650c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36649b.setListener(null);
            this.f36650c.setAlpha(1.0f);
            this.f36650c.setTranslationX(0.0f);
            this.f36650c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f36648a.f36653b, false);
            DefaultItemAnimator.this.f36623r.remove(this.f36648a.f36653b);
            DefaultItemAnimator.this.m53650h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f36648a.f36653b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$j */
    /* loaded from: classes2.dex */
    public static class C4890j {

        /* renamed from: a */
        public RecyclerView.ViewHolder f36658a;

        /* renamed from: b */
        public int f36659b;

        /* renamed from: c */
        public int f36660c;

        /* renamed from: d */
        public int f36661d;

        /* renamed from: e */
        public int f36662e;

        public C4890j(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f36658a = viewHolder;
            this.f36659b = i;
            this.f36660c = i2;
            this.f36661d = i3;
            this.f36662e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        m53646l(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f36614i.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        m53646l(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            m53646l(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.f36616k.add(new C4889i(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        m53646l(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f36615j.add(new C4890j(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        m53646l(viewHolder);
        this.f36613h.add(viewHolder);
        return true;
    }

    /* renamed from: c */
    public void m53655c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f36620o.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C4885e(viewHolder, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        if (list.isEmpty() && !super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m53654d(C4889i c4889i) {
        View view;
        RecyclerView.ViewHolder viewHolder = c4889i.f36652a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = c4889i.f36653b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f36623r.add(c4889i.f36652a);
            duration.translationX(c4889i.f36656e - c4889i.f36654c);
            duration.translationY(c4889i.f36657f - c4889i.f36655d);
            duration.alpha(0.0f).setListener(new C4887g(c4889i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f36623r.add(c4889i.f36653b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C4888h(c4889i, animate, view2)).start();
        }
    }

    /* renamed from: e */
    public void m53653e(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f36621p.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new C4886f(viewHolder, i5, view, i6, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.f36615j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C4890j) this.f36615j.get(size)).f36658a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.f36615j.remove(size);
            }
        }
        m53649i(this.f36616k, viewHolder);
        if (this.f36613h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f36614i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f36619n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f36619n.get(size2);
            m53649i(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f36619n.remove(size2);
            }
        }
        for (int size3 = this.f36618m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f36618m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C4890j) arrayList2.get(size4)).f36658a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f36618m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f36617l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f36617l.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f36617l.remove(size5);
                }
            }
        }
        this.f36622q.remove(viewHolder);
        this.f36620o.remove(viewHolder);
        this.f36623r.remove(viewHolder);
        this.f36621p.remove(viewHolder);
        m53650h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.f36615j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C4890j c4890j = (C4890j) this.f36615j.get(size);
            View view = c4890j.f36658a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c4890j.f36658a);
            this.f36615j.remove(size);
        }
        for (int size2 = this.f36613h.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((RecyclerView.ViewHolder) this.f36613h.get(size2));
            this.f36613h.remove(size2);
        }
        int size3 = this.f36614i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f36614i.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f36614i.remove(size3);
        }
        for (int size4 = this.f36616k.size() - 1; size4 >= 0; size4--) {
            m53648j((C4889i) this.f36616k.get(size4));
        }
        this.f36616k.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.f36618m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList = (ArrayList) this.f36618m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C4890j c4890j2 = (C4890j) arrayList.get(size6);
                View view2 = c4890j2.f36658a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(c4890j2.f36658a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f36618m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f36617l.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList2 = (ArrayList) this.f36617l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                viewHolder2.itemView.setAlpha(1.0f);
                dispatchAddFinished(viewHolder2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f36617l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f36619n.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList3 = (ArrayList) this.f36619n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                m53648j((C4889i) arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f36619n.remove(arrayList3);
                }
            }
        }
        m53651g(this.f36622q);
        m53651g(this.f36621p);
        m53651g(this.f36620o);
        m53651g(this.f36623r);
        dispatchAnimationsFinished();
    }

    /* renamed from: f */
    public final void m53652f(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f36622q.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C4884d(viewHolder, animate, view)).start();
    }

    /* renamed from: g */
    public void m53651g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: h */
    public void m53650h() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* renamed from: i */
    public final void m53649i(List list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C4889i c4889i = (C4889i) list.get(size);
            if (m53647k(c4889i, viewHolder) && c4889i.f36652a == null && c4889i.f36653b == null) {
                list.remove(c4889i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.f36614i.isEmpty() && this.f36616k.isEmpty() && this.f36615j.isEmpty() && this.f36613h.isEmpty() && this.f36621p.isEmpty() && this.f36622q.isEmpty() && this.f36620o.isEmpty() && this.f36623r.isEmpty() && this.f36618m.isEmpty() && this.f36617l.isEmpty() && this.f36619n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m53648j(C4889i c4889i) {
        RecyclerView.ViewHolder viewHolder = c4889i.f36652a;
        if (viewHolder != null) {
            m53647k(c4889i, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = c4889i.f36653b;
        if (viewHolder2 != null) {
            m53647k(c4889i, viewHolder2);
        }
    }

    /* renamed from: k */
    public final boolean m53647k(C4889i c4889i, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (c4889i.f36653b == viewHolder) {
            c4889i.f36653b = null;
        } else if (c4889i.f36652a != viewHolder) {
            return false;
        } else {
            c4889i.f36652a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* renamed from: l */
    public final void m53646l(RecyclerView.ViewHolder viewHolder) {
        if (f36612s == null) {
            f36612s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f36612s);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.f36613h.isEmpty();
        boolean z2 = !this.f36615j.isEmpty();
        boolean z3 = !this.f36616k.isEmpty();
        boolean z4 = !this.f36614i.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator it = this.f36613h.iterator();
        while (it.hasNext()) {
            m53652f((RecyclerView.ViewHolder) it.next());
        }
        this.f36613h.clear();
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f36615j);
            this.f36618m.add(arrayList);
            this.f36615j.clear();
            RunnableC4881a runnableC4881a = new RunnableC4881a(arrayList);
            if (z) {
                ViewCompat.postOnAnimationDelayed(((C4890j) arrayList.get(0)).f36658a.itemView, runnableC4881a, getRemoveDuration());
            } else {
                runnableC4881a.run();
            }
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f36616k);
            this.f36619n.add(arrayList2);
            this.f36616k.clear();
            RunnableC4882b runnableC4882b = new RunnableC4882b(arrayList2);
            if (z) {
                ViewCompat.postOnAnimationDelayed(((C4889i) arrayList2.get(0)).f36652a.itemView, runnableC4882b, getRemoveDuration());
            } else {
                runnableC4882b.run();
            }
        }
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f36614i);
            this.f36617l.add(arrayList3);
            this.f36614i.clear();
            RunnableC4883c runnableC4883c = new RunnableC4883c(arrayList3);
            if (!z && !z2 && !z3) {
                runnableC4883c.run();
                return;
            }
            long j3 = 0;
            if (z) {
                j = getRemoveDuration();
            } else {
                j = 0;
            }
            if (z2) {
                j2 = getMoveDuration();
            } else {
                j2 = 0;
            }
            if (z3) {
                j3 = getChangeDuration();
            }
            ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder) arrayList3.get(0)).itemView, runnableC4883c, j + Math.max(j2, j3));
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$i */
    /* loaded from: classes2.dex */
    public static class C4889i {

        /* renamed from: a */
        public RecyclerView.ViewHolder f36652a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f36653b;

        /* renamed from: c */
        public int f36654c;

        /* renamed from: d */
        public int f36655d;

        /* renamed from: e */
        public int f36656e;

        /* renamed from: f */
        public int f36657f;

        public C4889i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f36652a = viewHolder;
            this.f36653b = viewHolder2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f36652a + ", newHolder=" + this.f36653b + ", fromX=" + this.f36654c + ", fromY=" + this.f36655d + ", toX=" + this.f36656e + ", toY=" + this.f36657f + '}';
        }

        public C4889i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f36654c = i;
            this.f36655d = i2;
            this.f36656e = i3;
            this.f36657f = i4;
        }
    }
}
