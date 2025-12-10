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
    public static TimeInterpolator f36700s;

    /* renamed from: h */
    public ArrayList f36701h = new ArrayList();

    /* renamed from: i */
    public ArrayList f36702i = new ArrayList();

    /* renamed from: j */
    public ArrayList f36703j = new ArrayList();

    /* renamed from: k */
    public ArrayList f36704k = new ArrayList();

    /* renamed from: l */
    public ArrayList f36705l = new ArrayList();

    /* renamed from: m */
    public ArrayList f36706m = new ArrayList();

    /* renamed from: n */
    public ArrayList f36707n = new ArrayList();

    /* renamed from: o */
    public ArrayList f36708o = new ArrayList();

    /* renamed from: p */
    public ArrayList f36709p = new ArrayList();

    /* renamed from: q */
    public ArrayList f36710q = new ArrayList();

    /* renamed from: r */
    public ArrayList f36711r = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$a */
    /* loaded from: classes2.dex */
    public class RunnableC4863a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36712a;

        public RunnableC4863a(ArrayList arrayList) {
            this.f36712a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36712a.iterator();
            while (it.hasNext()) {
                C4872j c4872j = (C4872j) it.next();
                DefaultItemAnimator.this.m53604e(c4872j.f36746a, c4872j.f36747b, c4872j.f36748c, c4872j.f36749d, c4872j.f36750e);
            }
            this.f36712a.clear();
            DefaultItemAnimator.this.f36706m.remove(this.f36712a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$b */
    /* loaded from: classes2.dex */
    public class RunnableC4864b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36714a;

        public RunnableC4864b(ArrayList arrayList) {
            this.f36714a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36714a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.m53605d((C4871i) it.next());
            }
            this.f36714a.clear();
            DefaultItemAnimator.this.f36707n.remove(this.f36714a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$c */
    /* loaded from: classes2.dex */
    public class RunnableC4865c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f36716a;

        public RunnableC4865c(ArrayList arrayList) {
            this.f36716a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f36716a.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.m53606c((RecyclerView.ViewHolder) it.next());
            }
            this.f36716a.clear();
            DefaultItemAnimator.this.f36705l.remove(this.f36716a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$d */
    /* loaded from: classes2.dex */
    public class C4866d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36718a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36719b;

        /* renamed from: c */
        public final /* synthetic */ View f36720c;

        public C4866d(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36718a = viewHolder;
            this.f36719b = viewPropertyAnimator;
            this.f36720c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36719b.setListener(null);
            this.f36720c.setAlpha(1.0f);
            DefaultItemAnimator.this.dispatchRemoveFinished(this.f36718a);
            DefaultItemAnimator.this.f36710q.remove(this.f36718a);
            DefaultItemAnimator.this.m53601h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchRemoveStarting(this.f36718a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$e */
    /* loaded from: classes2.dex */
    public class C4867e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36722a;

        /* renamed from: b */
        public final /* synthetic */ View f36723b;

        /* renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f36724c;

        public C4867e(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f36722a = viewHolder;
            this.f36723b = view;
            this.f36724c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f36723b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36724c.setListener(null);
            DefaultItemAnimator.this.dispatchAddFinished(this.f36722a);
            DefaultItemAnimator.this.f36708o.remove(this.f36722a);
            DefaultItemAnimator.this.m53601h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchAddStarting(this.f36722a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$f */
    /* loaded from: classes2.dex */
    public class C4868f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView.ViewHolder f36726a;

        /* renamed from: b */
        public final /* synthetic */ int f36727b;

        /* renamed from: c */
        public final /* synthetic */ View f36728c;

        /* renamed from: d */
        public final /* synthetic */ int f36729d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f36730e;

        public C4868f(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f36726a = viewHolder;
            this.f36727b = i;
            this.f36728c = view;
            this.f36729d = i2;
            this.f36730e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f36727b != 0) {
                this.f36728c.setTranslationX(0.0f);
            }
            if (this.f36729d != 0) {
                this.f36728c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36730e.setListener(null);
            DefaultItemAnimator.this.dispatchMoveFinished(this.f36726a);
            DefaultItemAnimator.this.f36709p.remove(this.f36726a);
            DefaultItemAnimator.this.m53601h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchMoveStarting(this.f36726a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$g */
    /* loaded from: classes2.dex */
    public class C4869g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4871i f36732a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36733b;

        /* renamed from: c */
        public final /* synthetic */ View f36734c;

        public C4869g(C4871i c4871i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36732a = c4871i;
            this.f36733b = viewPropertyAnimator;
            this.f36734c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36733b.setListener(null);
            this.f36734c.setAlpha(1.0f);
            this.f36734c.setTranslationX(0.0f);
            this.f36734c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f36732a.f36740a, true);
            DefaultItemAnimator.this.f36711r.remove(this.f36732a.f36740a);
            DefaultItemAnimator.this.m53601h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f36732a.f36740a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$h */
    /* loaded from: classes2.dex */
    public class C4870h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4871i f36736a;

        /* renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f36737b;

        /* renamed from: c */
        public final /* synthetic */ View f36738c;

        public C4870h(C4871i c4871i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f36736a = c4871i;
            this.f36737b = viewPropertyAnimator;
            this.f36738c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f36737b.setListener(null);
            this.f36738c.setAlpha(1.0f);
            this.f36738c.setTranslationX(0.0f);
            this.f36738c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f36736a.f36741b, false);
            DefaultItemAnimator.this.f36711r.remove(this.f36736a.f36741b);
            DefaultItemAnimator.this.m53601h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f36736a.f36741b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$j */
    /* loaded from: classes2.dex */
    public static class C4872j {

        /* renamed from: a */
        public RecyclerView.ViewHolder f36746a;

        /* renamed from: b */
        public int f36747b;

        /* renamed from: c */
        public int f36748c;

        /* renamed from: d */
        public int f36749d;

        /* renamed from: e */
        public int f36750e;

        public C4872j(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f36746a = viewHolder;
            this.f36747b = i;
            this.f36748c = i2;
            this.f36749d = i3;
            this.f36750e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        m53597l(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f36702i.add(viewHolder);
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
        m53597l(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            m53597l(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.f36704k.add(new C4871i(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        m53597l(viewHolder);
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
        this.f36703j.add(new C4872j(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        m53597l(viewHolder);
        this.f36701h.add(viewHolder);
        return true;
    }

    /* renamed from: c */
    public void m53606c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f36708o.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C4867e(viewHolder, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        if (list.isEmpty() && !super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m53605d(C4871i c4871i) {
        View view;
        RecyclerView.ViewHolder viewHolder = c4871i.f36740a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = c4871i.f36741b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f36711r.add(c4871i.f36740a);
            duration.translationX(c4871i.f36744e - c4871i.f36742c);
            duration.translationY(c4871i.f36745f - c4871i.f36743d);
            duration.alpha(0.0f).setListener(new C4869g(c4871i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f36711r.add(c4871i.f36741b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C4870h(c4871i, animate, view2)).start();
        }
    }

    /* renamed from: e */
    public void m53604e(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
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
        this.f36709p.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new C4868f(viewHolder, i5, view, i6, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.f36703j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C4872j) this.f36703j.get(size)).f36746a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.f36703j.remove(size);
            }
        }
        m53600i(this.f36704k, viewHolder);
        if (this.f36701h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f36702i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f36707n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f36707n.get(size2);
            m53600i(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f36707n.remove(size2);
            }
        }
        for (int size3 = this.f36706m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f36706m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C4872j) arrayList2.get(size4)).f36746a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f36706m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f36705l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f36705l.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f36705l.remove(size5);
                }
            }
        }
        this.f36710q.remove(viewHolder);
        this.f36708o.remove(viewHolder);
        this.f36711r.remove(viewHolder);
        this.f36709p.remove(viewHolder);
        m53601h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.f36703j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C4872j c4872j = (C4872j) this.f36703j.get(size);
            View view = c4872j.f36746a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c4872j.f36746a);
            this.f36703j.remove(size);
        }
        for (int size2 = this.f36701h.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((RecyclerView.ViewHolder) this.f36701h.get(size2));
            this.f36701h.remove(size2);
        }
        int size3 = this.f36702i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.f36702i.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f36702i.remove(size3);
        }
        for (int size4 = this.f36704k.size() - 1; size4 >= 0; size4--) {
            m53599j((C4871i) this.f36704k.get(size4));
        }
        this.f36704k.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.f36706m.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList = (ArrayList) this.f36706m.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C4872j c4872j2 = (C4872j) arrayList.get(size6);
                View view2 = c4872j2.f36746a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(c4872j2.f36746a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.f36706m.remove(arrayList);
                }
            }
        }
        for (int size7 = this.f36705l.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList2 = (ArrayList) this.f36705l.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                viewHolder2.itemView.setAlpha(1.0f);
                dispatchAddFinished(viewHolder2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.f36705l.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.f36707n.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList3 = (ArrayList) this.f36707n.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                m53599j((C4871i) arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.f36707n.remove(arrayList3);
                }
            }
        }
        m53602g(this.f36710q);
        m53602g(this.f36709p);
        m53602g(this.f36708o);
        m53602g(this.f36711r);
        dispatchAnimationsFinished();
    }

    /* renamed from: f */
    public final void m53603f(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f36710q.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C4866d(viewHolder, animate, view)).start();
    }

    /* renamed from: g */
    public void m53602g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) list.get(size)).itemView.animate().cancel();
        }
    }

    /* renamed from: h */
    public void m53601h() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    /* renamed from: i */
    public final void m53600i(List list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C4871i c4871i = (C4871i) list.get(size);
            if (m53598k(c4871i, viewHolder) && c4871i.f36740a == null && c4871i.f36741b == null) {
                list.remove(c4871i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.f36702i.isEmpty() && this.f36704k.isEmpty() && this.f36703j.isEmpty() && this.f36701h.isEmpty() && this.f36709p.isEmpty() && this.f36710q.isEmpty() && this.f36708o.isEmpty() && this.f36711r.isEmpty() && this.f36706m.isEmpty() && this.f36705l.isEmpty() && this.f36707n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void m53599j(C4871i c4871i) {
        RecyclerView.ViewHolder viewHolder = c4871i.f36740a;
        if (viewHolder != null) {
            m53598k(c4871i, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = c4871i.f36741b;
        if (viewHolder2 != null) {
            m53598k(c4871i, viewHolder2);
        }
    }

    /* renamed from: k */
    public final boolean m53598k(C4871i c4871i, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (c4871i.f36741b == viewHolder) {
            c4871i.f36741b = null;
        } else if (c4871i.f36740a != viewHolder) {
            return false;
        } else {
            c4871i.f36740a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    /* renamed from: l */
    public final void m53597l(RecyclerView.ViewHolder viewHolder) {
        if (f36700s == null) {
            f36700s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f36700s);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.f36701h.isEmpty();
        boolean z2 = !this.f36703j.isEmpty();
        boolean z3 = !this.f36704k.isEmpty();
        boolean z4 = !this.f36702i.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator it = this.f36701h.iterator();
        while (it.hasNext()) {
            m53603f((RecyclerView.ViewHolder) it.next());
        }
        this.f36701h.clear();
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f36703j);
            this.f36706m.add(arrayList);
            this.f36703j.clear();
            RunnableC4863a runnableC4863a = new RunnableC4863a(arrayList);
            if (z) {
                ViewCompat.postOnAnimationDelayed(((C4872j) arrayList.get(0)).f36746a.itemView, runnableC4863a, getRemoveDuration());
            } else {
                runnableC4863a.run();
            }
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f36704k);
            this.f36707n.add(arrayList2);
            this.f36704k.clear();
            RunnableC4864b runnableC4864b = new RunnableC4864b(arrayList2);
            if (z) {
                ViewCompat.postOnAnimationDelayed(((C4871i) arrayList2.get(0)).f36740a.itemView, runnableC4864b, getRemoveDuration());
            } else {
                runnableC4864b.run();
            }
        }
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f36702i);
            this.f36705l.add(arrayList3);
            this.f36702i.clear();
            RunnableC4865c runnableC4865c = new RunnableC4865c(arrayList3);
            if (!z && !z2 && !z3) {
                runnableC4865c.run();
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
            ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder) arrayList3.get(0)).itemView, runnableC4865c, j + Math.max(j2, j3));
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$i */
    /* loaded from: classes2.dex */
    public static class C4871i {

        /* renamed from: a */
        public RecyclerView.ViewHolder f36740a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f36741b;

        /* renamed from: c */
        public int f36742c;

        /* renamed from: d */
        public int f36743d;

        /* renamed from: e */
        public int f36744e;

        /* renamed from: f */
        public int f36745f;

        public C4871i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f36740a = viewHolder;
            this.f36741b = viewHolder2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f36740a + ", newHolder=" + this.f36741b + ", fromX=" + this.f36742c + ", fromY=" + this.f36743d + ", toX=" + this.f36744e + ", toY=" + this.f36745f + '}';
        }

        public C4871i(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f36742c = i;
            this.f36743d = i2;
            this.f36744e = i3;
            this.f36745f = i4;
        }
    }
}