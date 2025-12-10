package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {

    /* renamed from: G */
    public static Method f9708G = null;

    /* renamed from: H */
    public static Method f9709H = null;

    /* renamed from: I */
    public static Method f9710I = null;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int WRAP_CONTENT = -2;

    /* renamed from: A */
    public Runnable f9711A;

    /* renamed from: B */
    public final Handler f9712B;

    /* renamed from: C */
    public final Rect f9713C;

    /* renamed from: D */
    public Rect f9714D;

    /* renamed from: E */
    public boolean f9715E;

    /* renamed from: F */
    public PopupWindow f9716F;

    /* renamed from: a */
    public Context f9717a;

    /* renamed from: b */
    public ListAdapter f9718b;

    /* renamed from: c */
    public C17112yK f9719c;

    /* renamed from: d */
    public int f9720d;

    /* renamed from: e */
    public int f9721e;

    /* renamed from: f */
    public int f9722f;

    /* renamed from: g */
    public int f9723g;

    /* renamed from: h */
    public int f9724h;

    /* renamed from: i */
    public boolean f9725i;

    /* renamed from: j */
    public boolean f9726j;

    /* renamed from: k */
    public boolean f9727k;

    /* renamed from: l */
    public int f9728l;

    /* renamed from: m */
    public boolean f9729m;

    /* renamed from: n */
    public boolean f9730n;

    /* renamed from: o */
    public int f9731o;

    /* renamed from: p */
    public View f9732p;

    /* renamed from: q */
    public int f9733q;

    /* renamed from: r */
    public DataSetObserver f9734r;

    /* renamed from: s */
    public View f9735s;

    /* renamed from: t */
    public Drawable f9736t;

    /* renamed from: u */
    public AdapterView.OnItemClickListener f9737u;

    /* renamed from: v */
    public AdapterView.OnItemSelectedListener f9738v;

    /* renamed from: w */
    public final RunnableC2212j f9739w;

    /* renamed from: x */
    public final View$OnTouchListenerC2211i f9740x;

    /* renamed from: y */
    public final C2210h f9741y;

    /* renamed from: z */
    public final RunnableC2208f f9742z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    /* loaded from: classes.dex */
    public class C2203a extends ForwardingListener {
        public C2203a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        /* renamed from: h */
        public ListPopupWindow getPopup() {
            return ListPopupWindow.this;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    /* loaded from: classes.dex */
    public class RunnableC2204b implements Runnable {
        public RunnableC2204b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View anchorView = ListPopupWindow.this.getAnchorView();
            if (anchorView != null && anchorView.getWindowToken() != null) {
                ListPopupWindow.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    /* loaded from: classes.dex */
    public class C2205c implements AdapterView.OnItemSelectedListener {
        public C2205c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            C17112yK c17112yK;
            if (i != -1 && (c17112yK = ListPopupWindow.this.f9719c) != null) {
                c17112yK.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    /* loaded from: classes.dex */
    public static class C2206d {
        @DoNotInline
        /* renamed from: a */
        public static int m64263a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    /* loaded from: classes.dex */
    public static class C2207e {
        @DoNotInline
        /* renamed from: a */
        public static void m64262a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m64261b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    /* loaded from: classes.dex */
    public class RunnableC2208f implements Runnable {
        public RunnableC2208f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    /* loaded from: classes.dex */
    public class C2209g extends DataSetObserver {
        public C2209g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$h */
    /* loaded from: classes.dex */
    public class C2210h implements AbsListView.OnScrollListener {
        public C2210h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.isInputMethodNotNeeded() && ListPopupWindow.this.f9716F.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f9712B.removeCallbacks(listPopupWindow.f9739w);
                ListPopupWindow.this.f9739w.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$i */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC2211i implements View.OnTouchListener {
        public View$OnTouchListenerC2211i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f9716F) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f9716F.getWidth() && y >= 0 && y < ListPopupWindow.this.f9716F.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f9712B.postDelayed(listPopupWindow.f9739w, 250L);
                return false;
            } else if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f9712B.removeCallbacks(listPopupWindow2.f9739w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$j */
    /* loaded from: classes.dex */
    public class RunnableC2212j implements Runnable {
        public RunnableC2212j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C17112yK c17112yK = ListPopupWindow.this.f9719c;
            if (c17112yK != null && ViewCompat.isAttachedToWindow(c17112yK) && ListPopupWindow.this.f9719c.getCount() > ListPopupWindow.this.f9719c.getChildCount()) {
                int childCount = ListPopupWindow.this.f9719c.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f9731o) {
                    listPopupWindow.f9716F.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f9708G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f9710I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f9709H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    /* renamed from: h */
    public static boolean m64267h(int i) {
        return i == 66 || i == 23;
    }

    public void clearListSelection() {
        C17112yK c17112yK = this.f9719c;
        if (c17112yK != null) {
            c17112yK.setListSelectionHidden(true);
            c17112yK.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new C2203a(view);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.f9716F.dismiss();
        m64266i();
        this.f9716F.setContentView(null);
        this.f9719c = null;
        this.f9712B.removeCallbacks(this.f9739w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final int m64269e() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        boolean z = true;
        if (this.f9719c == null) {
            Context context = this.f9717a;
            this.f9711A = new RunnableC2204b();
            C17112yK mo64260f = mo64260f(context, !this.f9715E);
            this.f9719c = mo64260f;
            Drawable drawable = this.f9736t;
            if (drawable != null) {
                mo64260f.setSelector(drawable);
            }
            this.f9719c.setAdapter(this.f9718b);
            this.f9719c.setOnItemClickListener(this.f9737u);
            this.f9719c.setFocusable(true);
            this.f9719c.setFocusableInTouchMode(true);
            this.f9719c.setOnItemSelectedListener(new C2205c());
            this.f9719c.setOnScrollListener(this.f9741y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f9738v;
            if (onItemSelectedListener != null) {
                this.f9719c.setOnItemSelectedListener(onItemSelectedListener);
            }
            C17112yK c17112yK = this.f9719c;
            View view = this.f9732p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f9733q;
                if (i4 != 0) {
                    if (i4 != 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid hint position ");
                        sb.append(this.f9733q);
                    } else {
                        linearLayout.addView(c17112yK, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(c17112yK, layoutParams);
                }
                int i5 = this.f9721e;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c17112yK = linearLayout;
            } else {
                i = 0;
            }
            this.f9716F.setContentView(c17112yK);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f9716F.getContentView();
            View view2 = this.f9732p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f9716F.getBackground();
        if (background != null) {
            background.getPadding(this.f9713C);
            Rect rect = this.f9713C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f9725i) {
                this.f9723g = -i6;
            }
        } else {
            this.f9713C.setEmpty();
            i2 = 0;
        }
        if (this.f9716F.getInputMethodMode() != 2) {
            z = false;
        }
        int m64268g = m64268g(getAnchorView(), this.f9723g, z);
        if (!this.f9729m && this.f9720d != -1) {
            int i7 = this.f9721e;
            if (i7 != -2) {
                if (i7 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    int i8 = this.f9717a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f9713C;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i9 = this.f9717a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f9713C;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int measureHeightOfChildrenCompat = this.f9719c.measureHeightOfChildrenCompat(makeMeasureSpec, 0, -1, m64268g - i, -1);
            if (measureHeightOfChildrenCompat > 0) {
                i += i2 + this.f9719c.getPaddingTop() + this.f9719c.getPaddingBottom();
            }
            return measureHeightOfChildrenCompat + i;
        }
        return m64268g + i2;
    }

    /* renamed from: f */
    public C17112yK mo64260f(Context context, boolean z) {
        return new C17112yK(context, z);
    }

    /* renamed from: g */
    public final int m64268g(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f9709H;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f9716F, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            return this.f9716F.getMaxAvailableHeight(view, i);
        }
        return C2206d.m64263a(this.f9716F, view, i, z);
    }

    @Nullable
    public View getAnchorView() {
        return this.f9735s;
    }

    @StyleRes
    public int getAnimationStyle() {
        return this.f9716F.getAnimationStyle();
    }

    @Nullable
    public Drawable getBackground() {
        return this.f9716F.getBackground();
    }

    @Nullable
    public Rect getEpicenterBounds() {
        if (this.f9714D != null) {
            return new Rect(this.f9714D);
        }
        return null;
    }

    public int getHeight() {
        return this.f9720d;
    }

    public int getHorizontalOffset() {
        return this.f9722f;
    }

    public int getInputMethodMode() {
        return this.f9716F.getInputMethodMode();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView getListView() {
        return this.f9719c;
    }

    public int getPromptPosition() {
        return this.f9733q;
    }

    @Nullable
    public Object getSelectedItem() {
        if (!isShowing()) {
            return null;
        }
        return this.f9719c.getSelectedItem();
    }

    public long getSelectedItemId() {
        if (!isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.f9719c.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        if (!isShowing()) {
            return -1;
        }
        return this.f9719c.getSelectedItemPosition();
    }

    @Nullable
    public View getSelectedView() {
        if (!isShowing()) {
            return null;
        }
        return this.f9719c.getSelectedView();
    }

    public int getSoftInputMode() {
        return this.f9716F.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (!this.f9725i) {
            return 0;
        }
        return this.f9723g;
    }

    public int getWidth() {
        return this.f9721e;
    }

    /* renamed from: i */
    public final void m64266i() {
        View view = this.f9732p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9732p);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
        return this.f9729m;
    }

    public boolean isInputMethodNotNeeded() {
        if (this.f9716F.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public boolean isModal() {
        return this.f9715E;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.f9716F.isShowing();
    }

    /* renamed from: j */
    public final void m64265j(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f9708G;
            if (method != null) {
                try {
                    method.invoke(this.f9716F, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        C2207e.m64261b(this.f9716F, z);
    }

    public boolean onKeyDown(int i, @NonNull KeyEvent keyEvent) {
        int i2;
        int i3;
        if (isShowing() && i != 62 && (this.f9719c.getSelectedItemPosition() >= 0 || !m64267h(i))) {
            int selectedItemPosition = this.f9719c.getSelectedItemPosition();
            boolean z = !this.f9716F.isAboveAnchor();
            ListAdapter listAdapter = this.f9718b;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i2 = 0;
                } else {
                    i2 = this.f9719c.lookForSelectablePosition(0, true);
                }
                if (areAllItemsEnabled) {
                    i3 = listAdapter.getCount() - 1;
                } else {
                    i3 = this.f9719c.lookForSelectablePosition(listAdapter.getCount() - 1, false);
                }
            } else {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            if ((z && i == 19 && selectedItemPosition <= i2) || (!z && i == 20 && selectedItemPosition >= i3)) {
                clearListSelection();
                this.f9716F.setInputMethodMode(1);
                show();
                return true;
            }
            this.f9719c.setListSelectionHidden(false);
            if (this.f9719c.onKeyDown(i, keyEvent)) {
                this.f9716F.setInputMethodMode(2);
                this.f9719c.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (z && i == 20) {
                if (selectedItemPosition == i3) {
                    return true;
                }
            } else if (!z && i == 19 && selectedItemPosition == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i, @NonNull KeyEvent keyEvent) {
        if (i == 4 && isShowing()) {
            View view = this.f9735s;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    dismiss();
                    return true;
                }
                return false;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean onKeyUp(int i, @NonNull KeyEvent keyEvent) {
        if (isShowing() && this.f9719c.getSelectedItemPosition() >= 0) {
            boolean onKeyUp = this.f9719c.onKeyUp(i, keyEvent);
            if (onKeyUp && m64267h(i)) {
                dismiss();
            }
            return onKeyUp;
        }
        return false;
    }

    public boolean performItemClick(int i) {
        if (isShowing()) {
            if (this.f9737u != null) {
                C17112yK c17112yK = this.f9719c;
                this.f9737u.onItemClick(c17112yK, c17112yK.getChildAt(i - c17112yK.getFirstVisiblePosition()), i, c17112yK.getAdapter().getItemId(i));
                return true;
            }
            return true;
        }
        return false;
    }

    public void postShow() {
        this.f9712B.post(this.f9711A);
    }

    public void setAdapter(@Nullable ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f9734r;
        if (dataSetObserver == null) {
            this.f9734r = new C2209g();
        } else {
            ListAdapter listAdapter2 = this.f9718b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9718b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9734r);
        }
        C17112yK c17112yK = this.f9719c;
        if (c17112yK != null) {
            c17112yK.setAdapter(this.f9718b);
        }
    }

    public void setAnchorView(@Nullable View view) {
        this.f9735s = view;
    }

    public void setAnimationStyle(@StyleRes int i) {
        this.f9716F.setAnimationStyle(i);
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.f9716F.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i) {
        Drawable background = this.f9716F.getBackground();
        if (background != null) {
            background.getPadding(this.f9713C);
            Rect rect = this.f9713C;
            this.f9721e = rect.left + rect.right + i;
            return;
        }
        setWidth(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z) {
        this.f9729m = z;
    }

    public void setDropDownGravity(int i) {
        this.f9728l = i;
    }

    public void setEpicenterBounds(@Nullable Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.f9714D = rect2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z) {
        this.f9730n = z;
    }

    public void setHeight(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f9720d = i;
    }

    public void setHorizontalOffset(int i) {
        this.f9722f = i;
    }

    public void setInputMethodMode(int i) {
        this.f9716F.setInputMethodMode(i);
    }

    public void setListSelector(Drawable drawable) {
        this.f9736t = drawable;
    }

    public void setModal(boolean z) {
        this.f9715E = z;
        this.f9716F.setFocusable(z);
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f9716F.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.f9737u = onItemClickListener;
    }

    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f9738v = onItemSelectedListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z) {
        this.f9727k = true;
        this.f9726j = z;
    }

    public void setPromptPosition(int i) {
        this.f9733q = i;
    }

    public void setPromptView(@Nullable View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            m64266i();
        }
        this.f9732p = view;
        if (isShowing) {
            show();
        }
    }

    public void setSelection(int i) {
        C17112yK c17112yK = this.f9719c;
        if (isShowing() && c17112yK != null) {
            c17112yK.setListSelectionHidden(false);
            c17112yK.setSelection(i);
            if (c17112yK.getChoiceMode() != 0) {
                c17112yK.setItemChecked(i, true);
            }
        }
    }

    public void setSoftInputMode(int i) {
        this.f9716F.setSoftInputMode(i);
    }

    public void setVerticalOffset(int i) {
        this.f9723g = i;
        this.f9725i = true;
    }

    public void setWidth(int i) {
        this.f9721e = i;
    }

    public void setWindowLayoutType(int i) {
        this.f9724h = i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int m64269e = m64269e();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(this.f9716F, this.f9724h);
        boolean z2 = true;
        if (this.f9716F.isShowing()) {
            if (!ViewCompat.isAttachedToWindow(getAnchorView())) {
                return;
            }
            int i5 = this.f9721e;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = getAnchorView().getWidth();
            }
            int i6 = this.f9720d;
            if (i6 == -1) {
                if (!isInputMethodNotNeeded) {
                    m64269e = -1;
                }
                if (isInputMethodNotNeeded) {
                    PopupWindow popupWindow = this.f9716F;
                    if (this.f9721e == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow.setWidth(i4);
                    this.f9716F.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f9716F;
                    if (this.f9721e == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow2.setWidth(i3);
                    this.f9716F.setHeight(-1);
                }
            } else if (i6 != -2) {
                m64269e = i6;
            }
            this.f9716F.setOutsideTouchable((this.f9730n || this.f9729m) ? false : false);
            PopupWindow popupWindow3 = this.f9716F;
            View anchorView = getAnchorView();
            int i7 = this.f9722f;
            int i8 = this.f9723g;
            if (i5 < 0) {
                i = -1;
            } else {
                i = i5;
            }
            if (m64269e < 0) {
                i2 = -1;
            } else {
                i2 = m64269e;
            }
            popupWindow3.update(anchorView, i7, i8, i, i2);
            return;
        }
        int i9 = this.f9721e;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = getAnchorView().getWidth();
        }
        int i10 = this.f9720d;
        if (i10 == -1) {
            m64269e = -1;
        } else if (i10 != -2) {
            m64269e = i10;
        }
        this.f9716F.setWidth(i9);
        this.f9716F.setHeight(m64269e);
        m64265j(true);
        PopupWindow popupWindow4 = this.f9716F;
        if (!this.f9730n && !this.f9729m) {
            z = true;
        } else {
            z = false;
        }
        popupWindow4.setOutsideTouchable(z);
        this.f9716F.setTouchInterceptor(this.f9740x);
        if (this.f9727k) {
            PopupWindowCompat.setOverlapAnchor(this.f9716F, this.f9726j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f9710I;
            if (method != null) {
                try {
                    method.invoke(this.f9716F, this.f9714D);
                } catch (Exception unused) {
                }
            }
        } else {
            C2207e.m64262a(this.f9716F, this.f9714D);
        }
        PopupWindowCompat.showAsDropDown(this.f9716F, getAnchorView(), this.f9722f, this.f9723g, this.f9728l);
        this.f9719c.setSelection(-1);
        if (!this.f9715E || this.f9719c.isInTouchMode()) {
            clearListSelection();
        }
        if (!this.f9715E) {
            this.f9712B.post(this.f9742z);
        }
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this.f9720d = -2;
        this.f9721e = -2;
        this.f9724h = 1002;
        this.f9728l = 0;
        this.f9729m = false;
        this.f9730n = false;
        this.f9731o = Integer.MAX_VALUE;
        this.f9733q = 0;
        this.f9739w = new RunnableC2212j();
        this.f9740x = new View$OnTouchListenerC2211i();
        this.f9741y = new C2210h();
        this.f9742z = new RunnableC2208f();
        this.f9713C = new Rect();
        this.f9717a = context;
        this.f9712B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i2);
        this.f9722f = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f9723g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9725i = true;
        }
        obtainStyledAttributes.recycle();
        C0919N5 c0919n5 = new C0919N5(context, attributeSet, i, i2);
        this.f9716F = c0919n5;
        c0919n5.setInputMethodMode(1);
    }
}
