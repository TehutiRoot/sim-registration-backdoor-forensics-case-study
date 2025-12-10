package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes4.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: m */
    public static final int f49304m = R.style.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: d */
    public final AccessibilityManager f49305d;

    /* renamed from: e */
    public BottomSheetBehavior f49306e;

    /* renamed from: f */
    public boolean f49307f;

    /* renamed from: g */
    public boolean f49308g;

    /* renamed from: h */
    public boolean f49309h;

    /* renamed from: i */
    public final String f49310i;

    /* renamed from: j */
    public final String f49311j;

    /* renamed from: k */
    public final String f49312k;

    /* renamed from: l */
    public final BottomSheetBehavior.BottomSheetCallback f49313l;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$a */
    /* loaded from: classes4.dex */
    public class C6848a extends BottomSheetBehavior.BottomSheetCallback {
        public C6848a() {
            BottomSheetDragHandleView.this = r1;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            BottomSheetDragHandleView.this.m45585i(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$b */
    /* loaded from: classes4.dex */
    public class C6849b extends AccessibilityDelegateCompat {
        public C6849b() {
            BottomSheetDragHandleView.this = r1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.m45589e();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m45593a(BottomSheetDragHandleView bottomSheetDragHandleView, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return bottomSheetDragHandleView.m45586h(view, commandArguments);
    }

    /* renamed from: g */
    public static View m45587g(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f49306e;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.f49313l);
            this.f49306e.m45653P(null);
        }
        this.f49306e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.m45653P(this);
            m45585i(this.f49306e.getState());
            this.f49306e.addBottomSheetCallback(this.f49313l);
        }
        m45584j();
    }

    /* renamed from: d */
    public final void m45590d(String str) {
        if (this.f49305d == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.f49305d.sendAccessibilityEvent(obtain);
    }

    /* renamed from: e */
    public final boolean m45589e() {
        boolean z = false;
        if (!this.f49308g) {
            return false;
        }
        m45590d(this.f49312k);
        if (!this.f49306e.isFitToContents() && !this.f49306e.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.f49306e.getState();
        int i = 6;
        int i2 = 3;
        if (state == 4) {
            if (!z) {
                i = 3;
            }
        } else if (state == 3) {
            if (!z) {
                i = 4;
            }
        } else {
            if (!this.f49309h) {
                i2 = 4;
            }
            i = i2;
        }
        this.f49306e.setState(i);
        return true;
    }

    /* renamed from: f */
    public final BottomSheetBehavior m45588f() {
        View view = this;
        while (true) {
            view = m45587g(view);
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                    if (behavior instanceof BottomSheetBehavior) {
                        return (BottomSheetBehavior) behavior;
                    }
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ boolean m45586h(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return m45589e();
    }

    /* renamed from: i */
    public final void m45585i(int i) {
        String str;
        if (i == 4) {
            this.f49309h = true;
        } else if (i == 3) {
            this.f49309h = false;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK;
        if (this.f49309h) {
            str = this.f49310i;
        } else {
            str = this.f49311j;
        }
        ViewCompat.replaceAccessibilityAction(this, accessibilityActionCompat, str, new AccessibilityViewCommand() { // from class: qc
            {
                BottomSheetDragHandleView.this = this;
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return BottomSheetDragHandleView.m45593a(BottomSheetDragHandleView.this, view, commandArguments);
            }
        });
    }

    /* renamed from: j */
    public final void m45584j() {
        boolean z;
        int i = 1;
        if (this.f49307f && this.f49306e != null) {
            z = true;
        } else {
            z = false;
        }
        this.f49308g = z;
        if (this.f49306e == null) {
            i = 2;
        }
        ViewCompat.setImportantForAccessibility(this, i);
        setClickable(this.f49308g);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.f49307f = z;
        m45584j();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(m45588f());
        AccessibilityManager accessibilityManager = this.f49305d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f49305d.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f49305d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f49304m), attributeSet, i);
        this.f49310i = getResources().getString(R.string.bottomsheet_action_expand);
        this.f49311j = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f49312k = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f49313l = new C6848a();
        this.f49305d = (AccessibilityManager) getContext().getSystemService("accessibility");
        m45584j();
        ViewCompat.setAccessibilityDelegate(this, new C6849b());
    }
}
