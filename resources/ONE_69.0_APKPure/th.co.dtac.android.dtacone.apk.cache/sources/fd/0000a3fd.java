package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes4.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {

    /* renamed from: f */
    public static WeakReference f51545f;

    /* renamed from: d */
    public Rect f51549d;

    /* renamed from: a */
    public boolean f51546a = true;

    /* renamed from: b */
    public boolean f51547b = true;

    /* renamed from: c */
    public boolean f51548c = false;

    /* renamed from: e */
    public ShapeProvider f51550e = new ShapeableViewShapeProvider();

    /* loaded from: classes4.dex */
    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View view);
    }

    /* loaded from: classes4.dex */
    public static class ShapeableViewShapeProvider implements ShapeProvider {
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$a */
    /* loaded from: classes4.dex */
    public class C7170a extends AbstractC20103gW1 {

        /* renamed from: a */
        public final /* synthetic */ Window f51551a;

        public C7170a(Window window) {
            this.f51551a = window;
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43428g(this.f51551a);
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43429f(this.f51551a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$b */
    /* loaded from: classes4.dex */
    public class C7171b extends AbstractC20103gW1 {

        /* renamed from: a */
        public final /* synthetic */ Activity f51553a;

        public C7171b(Activity activity) {
            this.f51553a = activity;
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (MaterialContainerTransformSharedElementCallback.f51545f != null && (view = (View) MaterialContainerTransformSharedElementCallback.f51545f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = MaterialContainerTransformSharedElementCallback.f51545f = null;
            }
            this.f51553a.finish();
            this.f51553a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$c */
    /* loaded from: classes4.dex */
    public class C7172c extends AbstractC20103gW1 {

        /* renamed from: a */
        public final /* synthetic */ Window f51555a;

        public C7172c(Window window) {
            this.f51555a = window;
        }

        @Override // p000.AbstractC20103gW1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43429f(this.f51555a);
        }
    }

    /* renamed from: e */
    public static Drawable m43430e(Window window) {
        return window.getDecorView().getBackground();
    }

    /* renamed from: f */
    public static void m43429f(Window window) {
        Drawable m43430e = m43430e(window);
        if (m43430e == null) {
            return;
        }
        m43430e.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
    }

    /* renamed from: g */
    public static void m43428g(Window window) {
        Drawable m43430e = m43430e(window);
        if (m43430e == null) {
            return;
        }
        m43430e.mutate().clearColorFilter();
    }

    /* renamed from: j */
    public static void m43425j(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.f51550e;
    }

    /* renamed from: h */
    public final void m43427h(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.f51548c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f51547b) {
                m43425j(window, materialContainerTransform);
                materialContainerTransform.addListener(new C7170a(window));
            }
        }
    }

    /* renamed from: i */
    public final void m43426i(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new C7171b(activity));
            if (this.f51547b) {
                m43425j(window, materialContainerTransform);
                materialContainerTransform.addListener(new C7172c(window));
            }
        }
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.f51548c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.f51547b;
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f51545f = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference weakReference;
        View view;
        ShapeAppearanceModel provideShape;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f51545f) != null && this.f51550e != null && (view = (View) weakReference.get()) != null && (provideShape = this.f51550e.provideShape(view)) != null) {
            onCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, provideShape);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activity;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (activity = ContextUtils.getActivity(view.getContext())) != null) {
            Window window = activity.getWindow();
            if (this.f51546a) {
                m43427h(window);
            } else {
                m43426i(activity, window);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f51546a && !list2.isEmpty()) {
            this.f51549d = AbstractC21141mW1.m26646j(list2.get(0));
        }
        this.f51546a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f51546a && !list2.isEmpty() && this.f51549d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f51549d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f51549d.height(), 1073741824));
            Rect rect = this.f51549d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider) {
        this.f51550e = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.f51548c = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.f51547b = z;
    }
}