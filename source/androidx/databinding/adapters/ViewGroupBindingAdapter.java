package androidx.databinding.adapters;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;

@BindingMethods({@BindingMethod(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @BindingMethod(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class ViewGroupBindingAdapter {

    /* loaded from: classes2.dex */
    public interface OnAnimationEnd {
        void onAnimationEnd(Animation animation);
    }

    /* loaded from: classes2.dex */
    public interface OnAnimationRepeat {
        void onAnimationRepeat(Animation animation);
    }

    /* loaded from: classes2.dex */
    public interface OnAnimationStart {
        void onAnimationStart(Animation animation);
    }

    /* loaded from: classes2.dex */
    public interface OnChildViewAdded {
        void onChildViewAdded(View view, View view2);
    }

    /* loaded from: classes2.dex */
    public interface OnChildViewRemoved {
        void onChildViewRemoved(View view, View view2);
    }

    /* renamed from: androidx.databinding.adapters.ViewGroupBindingAdapter$a */
    /* loaded from: classes2.dex */
    public class ViewGroup$OnHierarchyChangeListenerC4307a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public final /* synthetic */ OnChildViewAdded f34589a;

        /* renamed from: b */
        public final /* synthetic */ OnChildViewRemoved f34590b;

        public ViewGroup$OnHierarchyChangeListenerC4307a(OnChildViewAdded onChildViewAdded, OnChildViewRemoved onChildViewRemoved) {
            this.f34589a = onChildViewAdded;
            this.f34590b = onChildViewRemoved;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            OnChildViewAdded onChildViewAdded = this.f34589a;
            if (onChildViewAdded != null) {
                onChildViewAdded.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            OnChildViewRemoved onChildViewRemoved = this.f34590b;
            if (onChildViewRemoved != null) {
                onChildViewRemoved.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.databinding.adapters.ViewGroupBindingAdapter$b  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class animationAnimation$AnimationListenerC4308b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ OnAnimationStart f34591a;

        /* renamed from: b */
        public final /* synthetic */ OnAnimationEnd f34592b;

        /* renamed from: c */
        public final /* synthetic */ OnAnimationRepeat f34593c;

        public animationAnimation$AnimationListenerC4308b(OnAnimationStart onAnimationStart, OnAnimationEnd onAnimationEnd, OnAnimationRepeat onAnimationRepeat) {
            this.f34591a = onAnimationStart;
            this.f34592b = onAnimationEnd;
            this.f34593c = onAnimationRepeat;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            OnAnimationEnd onAnimationEnd = this.f34592b;
            if (onAnimationEnd != null) {
                onAnimationEnd.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            OnAnimationRepeat onAnimationRepeat = this.f34593c;
            if (onAnimationRepeat != null) {
                onAnimationRepeat.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            OnAnimationStart onAnimationStart = this.f34591a;
            if (onAnimationStart != null) {
                onAnimationStart.onAnimationStart(animation);
            }
        }
    }

    @BindingAdapter({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void setAnimateLayoutChanges(ViewGroup viewGroup, boolean z) {
        if (z) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void setListener(ViewGroup viewGroup, OnChildViewAdded onChildViewAdded, OnChildViewRemoved onChildViewRemoved) {
        if (onChildViewAdded == null && onChildViewRemoved == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC4307a(onChildViewAdded, onChildViewRemoved));
        }
    }

    @BindingAdapter(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void setListener(ViewGroup viewGroup, OnAnimationStart onAnimationStart, OnAnimationEnd onAnimationEnd, OnAnimationRepeat onAnimationRepeat) {
        if (onAnimationStart == null && onAnimationEnd == null && onAnimationRepeat == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new animationAnimation$AnimationListenerC4308b(onAnimationStart, onAnimationEnd, onAnimationRepeat));
        }
    }
}
