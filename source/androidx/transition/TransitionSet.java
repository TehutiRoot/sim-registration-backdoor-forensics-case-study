package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;

    /* renamed from: K */
    public ArrayList f37801K;

    /* renamed from: L */
    public boolean f37802L;

    /* renamed from: M */
    public int f37803M;

    /* renamed from: N */
    public boolean f37804N;

    /* renamed from: O */
    public int f37805O;

    /* renamed from: androidx.transition.TransitionSet$a */
    /* loaded from: classes2.dex */
    public class C5116a extends TransitionListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ Transition f37806a;

        public C5116a(Transition transition) {
            this.f37806a = transition;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f37806a.runAnimators();
            transition.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    /* loaded from: classes2.dex */
    public static class C5117b extends TransitionListenerAdapter {

        /* renamed from: a */
        public TransitionSet f37808a;

        public C5117b(TransitionSet transitionSet) {
            this.f37808a = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f37808a;
            int i = transitionSet.f37803M - 1;
            transitionSet.f37803M = i;
            if (i == 0) {
                transitionSet.f37804N = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f37808a;
            if (!transitionSet.f37804N) {
                transitionSet.start();
                this.f37808a.f37804N = true;
            }
        }
    }

    public TransitionSet() {
        this.f37801K = new ArrayList();
        this.f37802L = true;
        this.f37804N = false;
        this.f37805O = 0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: B */
    public String mo52614B(String str) {
        String mo52614B = super.mo52614B(str);
        for (int i = 0; i < this.f37801K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo52614B);
            sb.append("\n");
            sb.append(((Transition) this.f37801K.get(i)).mo52614B(str + "  "));
            mo52614B = sb.toString();
        }
        return mo52614B;
    }

    /* renamed from: C */
    public final void m52613C(Transition transition) {
        this.f37801K.add(transition);
        transition.f37772r = this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: D */
    public TransitionSet mo52615A(ViewGroup viewGroup) {
        super.mo52615A(viewGroup);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).mo52615A(viewGroup);
        }
        return this;
    }

    /* renamed from: E */
    public final void m52611E() {
        C5117b c5117b = new C5117b(this);
        Iterator it = this.f37801K.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).addListener(c5117b);
        }
        this.f37803M = this.f37801K.size();
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition) {
        m52613C(transition);
        long j = this.f37757c;
        if (j >= 0) {
            transition.setDuration(j);
        }
        if ((this.f37805O & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f37805O & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f37805O & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f37805O & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        if (m52640p(transitionValues.view)) {
            Iterator it = this.f37801K.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m52640p(transitionValues.view)) {
                    transition.captureEndValues(transitionValues);
                    transitionValues.f37809a.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        if (m52640p(transitionValues.view)) {
            Iterator it = this.f37801K.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m52640p(transitionValues.view)) {
                    transition.captureStartValues(transitionValues);
                    transitionValues.f37809a.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, C21940rV1 c21940rV1, C21940rV1 c21940rV12, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.f37801K.get(i);
            if (startDelay > 0 && (this.f37802L || i == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, c21940rV1, c21940rV12, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo52610e(TransitionValues transitionValues) {
        super.mo52610e(transitionValues);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).mo52610e(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    public int getOrdering() {
        return !this.f37802L ? 1 : 0;
    }

    @Nullable
    public Transition getTransitionAt(int i) {
        if (i >= 0 && i < this.f37801K.size()) {
            return (Transition) this.f37801K.get(i);
        }
        return null;
    }

    public int getTransitionCount() {
        return this.f37801K.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo52609l(ViewGroup viewGroup) {
        super.mo52609l(viewGroup);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).mo52609l(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).pause(view);
        }
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition) {
        this.f37801K.remove(transition);
        transition.f37772r = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f37801K.isEmpty()) {
            start();
            end();
            return;
        }
        m52611E();
        if (!this.f37802L) {
            for (int i = 1; i < this.f37801K.size(); i++) {
                ((Transition) this.f37801K.get(i - 1)).addListener(new C5116a((Transition) this.f37801K.get(i)));
            }
            Transition transition = (Transition) this.f37801K.get(0);
            if (transition != null) {
                transition.runAnimators();
                return;
            }
            return;
        }
        Iterator it = this.f37801K.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.f37805O |= 8;
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).setEpicenterCallback(epicenterCallback);
        }
    }

    @NonNull
    public TransitionSet setOrdering(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f37802L = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
        } else {
            this.f37802L = true;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f37805O |= 4;
        if (this.f37801K != null) {
            for (int i = 0; i < this.f37801K.size(); i++) {
                ((Transition) this.f37801K.get(i)).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.f37805O |= 2;
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).setPropagation(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: z */
    public void mo52608z(boolean z) {
        super.mo52608z(z);
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f37801K.get(i)).mo52608z(z);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.m73913clone();
        transitionSet.f37801K = new ArrayList();
        int size = this.f37801K.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m52613C(((Transition) this.f37801K.get(i)).m73913clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setDuration(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.f37757c >= 0 && (arrayList = this.f37801K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f37801K.get(i)).setDuration(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f37805O |= 1;
        ArrayList arrayList = this.f37801K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f37801K.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setStartDelay(long j) {
        return (TransitionSet) super.setStartDelay(j);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition addTarget(@NonNull Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition removeTarget(@NonNull Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull View view) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f37801K.size(); i2++) {
            ((Transition) this.f37801K.get(i2)).removeTarget(i);
        }
        return (TransitionSet) super.removeTarget(i);
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37801K = new ArrayList();
        this.f37802L = true;
        this.f37804N = false;
        this.f37805O = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC20550jO1.f67273i);
        setOrdering(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f37801K.size(); i2++) {
            ((Transition) this.f37801K.get(i2)).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@IdRes int i) {
        for (int i2 = 0; i2 < this.f37801K.size(); i2++) {
            ((Transition) this.f37801K.get(i2)).addTarget(i);
        }
        return (TransitionSet) super.addTarget(i);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull View view) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull String str) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull Class<?> cls) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull String str) {
        for (int i = 0; i < this.f37801K.size(); i++) {
            ((Transition) this.f37801K.get(i)).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
