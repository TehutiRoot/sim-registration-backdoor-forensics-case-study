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
    public static final int f49316m = R.style.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: d */
    public final AccessibilityManager f49317d;

    /* renamed from: e */
    public BottomSheetBehavior f49318e;

    /* renamed from: f */
    public boolean f49319f;

    /* renamed from: g */
    public boolean f49320g;

    /* renamed from: h */
    public boolean f49321h;

    /* renamed from: i */
    public final String f49322i;

    /* renamed from: j */
    public final String f49323j;

    /* renamed from: k */
    public final String f49324k;

    /* renamed from: l */
    public final BottomSheetBehavior.BottomSheetCallback f49325l;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$a */
    /* loaded from: classes4.dex */
    public class C6837a extends BottomSheetBehavior.BottomSheetCallback {
        public C6837a() {
            BottomSheetDragHandleView.this = r1;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            BottomSheetDragHandleView.this.m45561i(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$b */
    /* loaded from: classes4.dex */
    public class C6838b extends AccessibilityDelegateCompat {
        public C6838b() {
            BottomSheetDragHandleView.this = r1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.m45565e();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m45569a(BottomSheetDragHandleView bottomSheetDragHandleView, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return bottomSheetDragHandleView.m45562h(view, commandArguments);
    }

    /* renamed from: g */
    public static View m45563g(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f49318e;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.f49325l);
            this.f49318e.m45629P(null);
        }
        this.f49318e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.m45629P(this);
            m45561i(this.f49318e.getState());
            this.f49318e.addBottomSheetCallback(this.f49325l);
        }
        m45560j();
    }

    /* renamed from: d */
    public final void m45566d(String str) {
        if (this.f49317d == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.f49317d.sendAccessibilityEvent(obtain);
    }

    /* renamed from: e */
    public final boolean m45565e() {
        boolean z = false;
        if (!this.f49320g) {
            return false;
        }
        m45566d(this.f49324k);
        if (!this.f49318e.isFitToContents() && !this.f49318e.shouldSkipHalfExpandedStateWhenDragging()) {
            z = true;
        }
        int state = this.f49318e.getState();
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
            if (!this.f49321h) {
                i2 = 4;
            }
            i = i2;
        }
        this.f49318e.setState(i);
        return true;
    }

    /* renamed from: f */
    public final BottomSheetBehavior m45564f() {
        View view = this;
        while (true) {
            view = m45563g(view);
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
    public final /* synthetic */ boolean m45562h(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return m45565e();
    }

    /* renamed from: i */
    public final void m45561i(int i) {
        String str;
        if (i == 4) {
            this.f49321h = true;
        } else if (i == 3) {
            this.f49321h = false;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK;
        if (this.f49321h) {
            str = this.f49322i;
        } else {
            str = this.f49323j;
        }
        ViewCompat.replaceAccessibilityAction(this, accessibilityActionCompat, str, new AccessibilityViewCommand() { // from class: qc
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return BottomSheetDragHandleView.m45569a(BottomSheetDragHandleView.this, view, commandArguments);
            }
        });
    }

    /* renamed from: j */
    public final void m45560j() {
        boolean z;
        int i = 1;
        if (this.f49319f && this.f49318e != null) {
            z = true;
        } else {
            z = false;
        }
        this.f49320g = z;
        if (this.f49318e == null) {
            i = 2;
        }
        ViewCompat.setImportantForAccessibility(this, i);
        setClickable(this.f49320g);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.f49319f = z;
        m45560j();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(m45564f());
        AccessibilityManager accessibilityManager = this.f49317d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f49317d.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f49317d;
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
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, f49316m), attributeSet, i);
        this.f49322i = getResources().getString(R.string.bottomsheet_action_expand);
        this.f49323j = getResources().getString(R.string.bottomsheet_action_collapse);
        this.f49324k = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.f49325l = new C6837a();
        this.f49317d = (AccessibilityManager) getContext().getSystemService("accessibility");
        m45560j();
        ViewCompat.setAccessibilityDelegate(this, new C6838b());
    }
}