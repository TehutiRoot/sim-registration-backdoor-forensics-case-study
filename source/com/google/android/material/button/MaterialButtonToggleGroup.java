package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final int f49334k = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a */
    public final List f49335a;

    /* renamed from: b */
    public final C6856d f49336b;

    /* renamed from: c */
    public final LinkedHashSet f49337c;

    /* renamed from: d */
    public final Comparator f49338d;

    /* renamed from: e */
    public Integer[] f49339e;

    /* renamed from: f */
    public boolean f49340f;

    /* renamed from: g */
    public boolean f49341g;

    /* renamed from: h */
    public boolean f49342h;

    /* renamed from: i */
    public final int f49343i;

    /* renamed from: j */
    public Set f49344j;

    /* loaded from: classes4.dex */
    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes4.dex */
    public class C6853a implements Comparator {
        public C6853a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes4.dex */
    public class C6854b extends AccessibilityDelegateCompat {
        public C6854b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, MaterialButtonToggleGroup.this.m45565g(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes4.dex */
    public static class C6855c {

        /* renamed from: e */
        public static final CornerSize f49347e = new AbsoluteCornerSize(0.0f);

        /* renamed from: a */
        public CornerSize f49348a;

        /* renamed from: b */
        public CornerSize f49349b;

        /* renamed from: c */
        public CornerSize f49350c;

        /* renamed from: d */
        public CornerSize f49351d;

        public C6855c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f49348a = cornerSize;
            this.f49349b = cornerSize3;
            this.f49350c = cornerSize4;
            this.f49351d = cornerSize2;
        }

        /* renamed from: a */
        public static C6855c m45553a(C6855c c6855c) {
            CornerSize cornerSize = f49347e;
            return new C6855c(cornerSize, c6855c.f49351d, cornerSize, c6855c.f49350c);
        }

        /* renamed from: b */
        public static C6855c m45552b(C6855c c6855c, View view) {
            if (ViewUtils.isLayoutRtl(view)) {
                return m45551c(c6855c);
            }
            return m45550d(c6855c);
        }

        /* renamed from: c */
        public static C6855c m45551c(C6855c c6855c) {
            CornerSize cornerSize = c6855c.f49348a;
            CornerSize cornerSize2 = c6855c.f49351d;
            CornerSize cornerSize3 = f49347e;
            return new C6855c(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        /* renamed from: d */
        public static C6855c m45550d(C6855c c6855c) {
            CornerSize cornerSize = f49347e;
            return new C6855c(cornerSize, cornerSize, c6855c.f49349b, c6855c.f49350c);
        }

        /* renamed from: e */
        public static C6855c m45549e(C6855c c6855c, View view) {
            if (ViewUtils.isLayoutRtl(view)) {
                return m45550d(c6855c);
            }
            return m45551c(c6855c);
        }

        /* renamed from: f */
        public static C6855c m45548f(C6855c c6855c) {
            CornerSize cornerSize = c6855c.f49348a;
            CornerSize cornerSize2 = f49347e;
            return new C6855c(cornerSize, cornerSize2, c6855c.f49349b, cornerSize2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes4.dex */
    public class C6856d implements MaterialButton.InterfaceC6850a {
        public C6856d() {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC6850a
        /* renamed from: a */
        public void mo45547a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ C6856d(MaterialButtonToggleGroup materialButtonToggleGroup, C6853a c6853a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m45563i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m45563i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m45563i(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static void m45559m(ShapeAppearanceModel.Builder builder, C6855c c6855c) {
        if (c6855c == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(c6855c.f49348a).setBottomLeftCornerSize(c6855c.f49351d).setTopRightCornerSize(c6855c.f49349b).setBottomRightCornerSize(c6855c.f49350c);
        }
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f49336b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f49337c.add(onButtonCheckedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m45568d(materialButton.getId(), materialButton.isChecked());
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f49335a.add(new C6855c(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
        materialButton.setEnabled(isEnabled());
        ViewCompat.setAccessibilityDelegate(materialButton, new C6854b());
    }

    /* renamed from: b */
    public final void m45570b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m45566f = m45566f(i);
            int min = Math.min(m45566f.getStrokeWidth(), m45566f(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m45569c = m45569c(m45566f);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(m45569c, 0);
                MarginLayoutParamsCompat.setMarginStart(m45569c, -min);
                m45569c.topMargin = 0;
            } else {
                m45569c.bottomMargin = 0;
                m45569c.topMargin = -min;
                MarginLayoutParamsCompat.setMarginStart(m45569c, 0);
            }
            m45566f.setLayoutParams(m45569c);
        }
        m45561k(firstVisibleChildIndex);
    }

    /* renamed from: c */
    public final LinearLayout.LayoutParams m45569c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public void check(@IdRes int i) {
        m45568d(i, true);
    }

    public void clearChecked() {
        m45558n(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.f49337c.clear();
    }

    /* renamed from: d */
    public final void m45568d(int i, boolean z) {
        if (i == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Button ID is not valid: ");
            sb.append(i);
            return;
        }
        HashSet hashSet = new HashSet(this.f49344j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f49341g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f49342h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        m45558n(hashSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        m45557o();
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m45567e(int i, boolean z) {
        Iterator it = this.f49337c.iterator();
        while (it.hasNext()) {
            ((OnButtonCheckedListener) it.next()).onButtonChecked(this, i, z);
        }
    }

    /* renamed from: f */
    public final MaterialButton m45566f(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: g */
    public final int m45565g(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m45563i(i2)) {
                i++;
            }
        }
        return -1;
    }

    @IdRes
    public int getCheckedButtonId() {
        if (this.f49341g && !this.f49344j.isEmpty()) {
            return ((Integer) this.f49344j.iterator().next()).intValue();
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m45566f(i).getId();
            if (this.f49344j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f49339e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    /* renamed from: h */
    public final C6855c m45564h(int i, int i2, int i3) {
        boolean z;
        C6855c c6855c = (C6855c) this.f49335a.get(i);
        if (i2 == i3) {
            return c6855c;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C6855c.m45549e(c6855c, this);
            }
            return C6855c.m45548f(c6855c);
        } else if (i == i3) {
            if (z) {
                return C6855c.m45552b(c6855c, this);
            }
            return C6855c.m45553a(c6855c);
        } else {
            return null;
        }
    }

    /* renamed from: i */
    public final boolean m45563i(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public boolean isSelectionRequired() {
        return this.f49342h;
    }

    public boolean isSingleSelection() {
        return this.f49341g;
    }

    /* renamed from: j */
    public void m45562j(MaterialButton materialButton, boolean z) {
        if (this.f49340f) {
            return;
        }
        m45568d(materialButton.getId(), z);
    }

    /* renamed from: k */
    public final void m45561k(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m45566f(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            MarginLayoutParamsCompat.setMarginEnd(layoutParams, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: l */
    public final void m45560l(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f49340f = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f49340f = false;
        }
    }

    /* renamed from: n */
    public final void m45558n(Set set) {
        Set set2 = this.f49344j;
        this.f49344j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m45566f(i).getId();
            m45560l(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                m45567e(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* renamed from: o */
    public final void m45557o() {
        TreeMap treeMap = new TreeMap(this.f49338d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m45566f(i), Integer.valueOf(i));
        }
        this.f49339e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f49343i;
        if (i != -1) {
            m45558n(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (isSingleSelection()) {
            i = 1;
        } else {
            i = 2;
        }
        wrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m45556p();
        m45570b();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f49335a.remove(indexOfChild);
        }
        m45556p();
        m45570b();
    }

    /* renamed from: p */
    public void m45556p() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m45566f = m45566f(i);
            if (m45566f.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = m45566f.getShapeAppearanceModel().toBuilder();
                m45559m(builder, m45564h(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m45566f.setShapeAppearanceModel(builder.build());
            }
        }
    }

    /* renamed from: q */
    public final void m45555q() {
        Class cls;
        for (int i = 0; i < getChildCount(); i++) {
            if (this.f49341g) {
                cls = RadioButton.class;
            } else {
                cls = ToggleButton.class;
            }
            m45566f(i).setA11yClassName(cls.getName());
        }
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f49337c.remove(onButtonCheckedListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            m45566f(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f49342h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f49341g != z) {
            this.f49341g = z;
            clearChecked();
        }
        m45555q();
    }

    public void uncheck(@IdRes int i) {
        m45568d(i, false);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f49334k
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f49335a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$d r7 = new com.google.android.material.button.MaterialButtonToggleGroup$d
            r0 = 0
            r7.<init>(r6, r0)
            r6.f49336b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f49337c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f49338d = r7
            r7 = 0
            r6.f49340f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f49344j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f49343i = r9
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f49342h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_android_enabled
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
