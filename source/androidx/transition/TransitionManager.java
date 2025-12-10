package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionManager {

    /* renamed from: c */
    public static Transition f37792c = new AutoTransition();

    /* renamed from: d */
    public static ThreadLocal f37793d = new ThreadLocal();

    /* renamed from: e */
    public static ArrayList f37794e = new ArrayList();

    /* renamed from: a */
    public ArrayMap f37795a = new ArrayMap();

    /* renamed from: b */
    public ArrayMap f37796b = new ArrayMap();

    /* renamed from: androidx.transition.TransitionManager$a */
    /* loaded from: classes2.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC5114a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public Transition f37797a;

        /* renamed from: b */
        public ViewGroup f37798b;

        /* renamed from: androidx.transition.TransitionManager$a$a */
        /* loaded from: classes2.dex */
        public class C5115a extends TransitionListenerAdapter {

            /* renamed from: a */
            public final /* synthetic */ ArrayMap f37799a;

            public C5115a(ArrayMap arrayMap) {
                this.f37799a = arrayMap;
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f37799a.get(ViewTreeObserver$OnPreDrawListenerC5114a.this.f37798b)).remove(transition);
                transition.removeListener(this);
            }
        }

        public ViewTreeObserver$OnPreDrawListenerC5114a(Transition transition, ViewGroup viewGroup) {
            this.f37797a = transition;
            this.f37798b = viewGroup;
        }

        /* renamed from: a */
        public final void m52616a() {
            this.f37798b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f37798b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m52616a();
            if (!TransitionManager.f37794e.remove(this.f37798b)) {
                return true;
            }
            ArrayMap m52622b = TransitionManager.m52622b();
            ArrayList arrayList = (ArrayList) m52622b.get(this.f37798b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                m52622b.put(this.f37798b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f37797a);
            this.f37797a.addListener(new C5115a(m52622b));
            this.f37797a.m52649f(this.f37798b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.f37798b);
                }
            }
            this.f37797a.m52632x(this.f37798b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m52616a();
            TransitionManager.f37794e.remove(this.f37798b);
            ArrayList arrayList = (ArrayList) TransitionManager.m52622b().get(this.f37798b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(this.f37798b);
                }
            }
            this.f37797a.m52648g(true);
        }
    }

    /* renamed from: a */
    public static void m52623a(Scene scene, Transition transition) {
        ViewGroup sceneRoot = scene.getSceneRoot();
        if (!f37794e.contains(sceneRoot)) {
            Scene currentScene = Scene.getCurrentScene(sceneRoot);
            if (transition == null) {
                if (currentScene != null) {
                    currentScene.exit();
                }
                scene.enter();
                return;
            }
            f37794e.add(sceneRoot);
            Transition m73913clone = transition.m73913clone();
            m73913clone.mo52615A(sceneRoot);
            if (currentScene != null && currentScene.m52660a()) {
                m73913clone.mo52608z(true);
            }
            m52619e(sceneRoot, m73913clone);
            scene.enter();
            m52620d(sceneRoot, m73913clone);
        }
    }

    /* renamed from: b */
    public static ArrayMap m52622b() {
        ArrayMap arrayMap;
        WeakReference weakReference = (WeakReference) f37793d.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap();
        f37793d.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup) {
        beginDelayedTransition(viewGroup, null);
    }

    /* renamed from: d */
    public static void m52620d(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC5114a viewTreeObserver$OnPreDrawListenerC5114a = new ViewTreeObserver$OnPreDrawListenerC5114a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC5114a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC5114a);
        }
    }

    /* renamed from: e */
    public static void m52619e(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m52622b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.m52649f(viewGroup, true);
        }
        Scene currentScene = Scene.getCurrentScene(viewGroup);
        if (currentScene != null) {
            currentScene.exit();
        }
    }

    public static void endTransitions(ViewGroup viewGroup) {
        f37794e.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m52622b().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo52609l(viewGroup);
            }
        }
    }

    /* renamed from: go */
    public static void m52618go(@NonNull Scene scene) {
        m52623a(scene, f37792c);
    }

    /* renamed from: c */
    public final Transition m52621c(Scene scene) {
        Scene currentScene;
        ArrayMap arrayMap;
        Transition transition;
        ViewGroup sceneRoot = scene.getSceneRoot();
        if (sceneRoot != null && (currentScene = Scene.getCurrentScene(sceneRoot)) != null && (arrayMap = (ArrayMap) this.f37796b.get(scene)) != null && (transition = (Transition) arrayMap.get(currentScene)) != null) {
            return transition;
        }
        Transition transition2 = (Transition) this.f37795a.get(scene);
        if (transition2 == null) {
            return f37792c;
        }
        return transition2;
    }

    public void setTransition(@NonNull Scene scene, @Nullable Transition transition) {
        this.f37795a.put(scene, transition);
    }

    public void transitionTo(@NonNull Scene scene) {
        m52623a(scene, m52621c(scene));
    }

    public static void beginDelayedTransition(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        if (f37794e.contains(viewGroup) || !ViewCompat.isLaidOut(viewGroup)) {
            return;
        }
        f37794e.add(viewGroup);
        if (transition == null) {
            transition = f37792c;
        }
        Transition m73913clone = transition.m73913clone();
        m52619e(viewGroup, m73913clone);
        Scene.m52659b(viewGroup, null);
        m52620d(viewGroup, m73913clone);
    }

    /* renamed from: go */
    public static void m52617go(@NonNull Scene scene, @Nullable Transition transition) {
        m52623a(scene, transition);
    }

    public void setTransition(@NonNull Scene scene, @NonNull Scene scene2, @Nullable Transition transition) {
        ArrayMap arrayMap = (ArrayMap) this.f37796b.get(scene2);
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            this.f37796b.put(scene2, arrayMap);
        }
        arrayMap.put(scene, transition);
    }
}
