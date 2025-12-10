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
    public static WeakReference f51533f;

    /* renamed from: d */
    public Rect f51537d;

    /* renamed from: a */
    public boolean f51534a = true;

    /* renamed from: b */
    public boolean f51535b = true;

    /* renamed from: c */
    public boolean f51536c = false;

    /* renamed from: e */
    public ShapeProvider f51538e = new ShapeableViewShapeProvider();

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
    public class C7181a extends AbstractC20564jV1 {

        /* renamed from: a */
        public final /* synthetic */ Window f51539a;

        public C7181a(Window window) {
            this.f51539a = window;
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43441g(this.f51539a);
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43442f(this.f51539a);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$b */
    /* loaded from: classes4.dex */
    public class C7182b extends AbstractC20564jV1 {

        /* renamed from: a */
        public final /* synthetic */ Activity f51541a;

        public C7182b(Activity activity) {
            this.f51541a = activity;
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (MaterialContainerTransformSharedElementCallback.f51533f != null && (view = (View) MaterialContainerTransformSharedElementCallback.f51533f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = MaterialContainerTransformSharedElementCallback.f51533f = null;
            }
            this.f51541a.finish();
            this.f51541a.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$c */
    /* loaded from: classes4.dex */
    public class C7183c extends AbstractC20564jV1 {

        /* renamed from: a */
        public final /* synthetic */ Window f51543a;

        public C7183c(Window window) {
            this.f51543a = window;
        }

        @Override // p000.AbstractC20564jV1, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            MaterialContainerTransformSharedElementCallback.m43442f(this.f51543a);
        }
    }

    /* renamed from: e */
    public static Drawable m43443e(Window window) {
        return window.getDecorView().getBackground();
    }

    /* renamed from: f */
    public static void m43442f(Window window) {
        Drawable m43443e = m43443e(window);
        if (m43443e == null) {
            return;
        }
        m43443e.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
    }

    /* renamed from: g */
    public static void m43441g(Window window) {
        Drawable m43443e = m43443e(window);
        if (m43443e == null) {
            return;
        }
        m43443e.mutate().clearColorFilter();
    }

    /* renamed from: j */
    public static void m43438j(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.f51538e;
    }

    /* renamed from: h */
    public final void m43440h(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.f51536c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f51535b) {
                m43438j(window, materialContainerTransform);
                materialContainerTransform.addListener(new C7181a(window));
            }
        }
    }

    /* renamed from: i */
    public final void m43439i(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new C7182b(activity));
            if (this.f51535b) {
                m43438j(window, materialContainerTransform);
                materialContainerTransform.addListener(new C7183c(window));
            }
        }
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.f51536c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.f51535b;
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f51533f = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference weakReference;
        View view;
        ShapeAppearanceModel provideShape;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f51533f) != null && this.f51538e != null && (view = (View) weakReference.get()) != null && (provideShape = this.f51538e.provideShape(view)) != null) {
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
            if (this.f51534a) {
                m43440h(window);
            } else {
                m43439i(activity, window);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f51534a && !list2.isEmpty()) {
            this.f51537d = AbstractC21596pV1.m23677j(list2.get(0));
        }
        this.f51534a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f51534a && !list2.isEmpty() && this.f51537d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f51537d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f51537d.height(), 1073741824));
            Rect rect = this.f51537d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider) {
        this.f51538e = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.f51536c = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.f51535b = z;
    }
}
