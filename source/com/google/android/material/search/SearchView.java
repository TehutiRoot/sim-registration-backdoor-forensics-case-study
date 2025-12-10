package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.InterfaceC2055Px;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchView;
import com.google.android.material.shape.MaterialShapeUtils;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: A */
    public static final int f50522A = R.style.Widget_Material3_SearchView;

    /* renamed from: a */
    public final View f50523a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f50524b;

    /* renamed from: c */
    public final View f50525c;

    /* renamed from: d */
    public final View f50526d;

    /* renamed from: e */
    public final FrameLayout f50527e;

    /* renamed from: f */
    public final FrameLayout f50528f;

    /* renamed from: g */
    public final MaterialToolbar f50529g;

    /* renamed from: h */
    public final Toolbar f50530h;

    /* renamed from: i */
    public final TextView f50531i;

    /* renamed from: j */
    public final EditText f50532j;

    /* renamed from: k */
    public final ImageButton f50533k;

    /* renamed from: l */
    public final View f50534l;

    /* renamed from: m */
    public final TouchObserverFrameLayout f50535m;

    /* renamed from: n */
    public final boolean f50536n;

    /* renamed from: o */
    public final C7051b f50537o;

    /* renamed from: p */
    public final ElevationOverlayProvider f50538p;

    /* renamed from: q */
    public final Set f50539q;

    /* renamed from: r */
    public SearchBar f50540r;

    /* renamed from: s */
    public int f50541s;

    /* renamed from: t */
    public boolean f50542t;

    /* renamed from: u */
    public boolean f50543u;

    /* renamed from: v */
    public boolean f50544v;

    /* renamed from: w */
    public boolean f50545w;

    /* renamed from: x */
    public boolean f50546x;

    /* renamed from: y */
    public TransitionState f50547y;

    /* renamed from: z */
    public Map f50548z;

    /* loaded from: classes4.dex */
    public static class Behavior extends CoordinatorLayout.Behavior<SearchView> {
        public Behavior() {
        }

        public Behavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public interface TransitionListener {
        void onStateChanged(@NonNull SearchView searchView, @NonNull TransitionState transitionState, @NonNull TransitionState transitionState2);
    }

    /* loaded from: classes4.dex */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* renamed from: com.google.android.material.search.SearchView$a */
    /* loaded from: classes4.dex */
    public class C7040a implements TextWatcher {
        public C7040a() {
            SearchView.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageButton imageButton = SearchView.this.f50533k;
            if (charSequence.length() > 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageButton.setVisibility(i4);
        }
    }

    /* renamed from: com.google.android.material.search.SearchView$b */
    /* loaded from: classes4.dex */
    public static class C7041b extends AbsSavedState {
        public static final Parcelable.Creator<C7041b> CREATOR = new C7042a();

        /* renamed from: b */
        public String f50550b;

        /* renamed from: c */
        public int f50551c;

        /* renamed from: com.google.android.material.search.SearchView$b$a */
        /* loaded from: classes4.dex */
        public class C7042a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7041b createFromParcel(Parcel parcel) {
                return new C7041b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C7041b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7041b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C7041b[] newArray(int i) {
                return new C7041b[i];
            }
        }

        public C7041b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50550b);
            parcel.writeInt(this.f50551c);
        }

        public C7041b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50550b = parcel.readString();
            this.f50551c = parcel.readInt();
        }

        public C7041b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m44356a(SearchView searchView, View view) {
        searchView.m44335v(view);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m44354c(SearchView searchView, View view, MotionEvent motionEvent) {
        return searchView.m44340q(view, motionEvent);
    }

    /* renamed from: d */
    public static /* synthetic */ void m44353d(SearchView searchView) {
        searchView.m44344m();
    }

    /* renamed from: e */
    public static /* synthetic */ void m44352e(SearchView searchView) {
        searchView.m44343n();
    }

    /* renamed from: f */
    public static /* synthetic */ void m44351f(SearchView searchView, View view) {
        searchView.m44341p(view);
    }

    @Nullable
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f50540r;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @InterfaceC2055Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m44348i(View view, MotionEvent motionEvent) {
        return m44338s(view, motionEvent);
    }

    /* renamed from: j */
    public static /* synthetic */ void m44347j(SearchView searchView, View view) {
        searchView.m44342o(view);
    }

    /* renamed from: r */
    public static /* synthetic */ WindowInsetsCompat m44339r(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i + windowInsetsCompat.getSystemWindowInsetLeft();
        marginLayoutParams.rightMargin = i2 + windowInsetsCompat.getSystemWindowInsetRight();
        return windowInsetsCompat;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m44338s(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        int i;
        View view = this.f50526d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider = this.f50538p;
        if (elevationOverlayProvider != null && this.f50525c != null) {
            this.f50525c.setBackgroundColor(elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(f));
        }
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f50527e, false));
        }
    }

    private void setUpStatusBarSpacer(@InterfaceC2055Px int i) {
        if (this.f50526d.getLayoutParams().height != i) {
            this.f50526d.getLayoutParams().height = i;
            this.f50526d.requestLayout();
        }
    }

    /* renamed from: A */
    public final void m44366A() {
        this.f50535m.setOnTouchListener(new View.OnTouchListener() { // from class: YE1
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m44354c(SearchView.this, view, motionEvent);
            }
        });
    }

    /* renamed from: B */
    public final void m44365B() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f50534l.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.f50534l, new OnApplyWindowInsetsListener() { // from class: SE1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat m44339r;
                m44339r = SearchView.m44339r(marginLayoutParams, i, i2, view, windowInsetsCompat);
                return m44339r;
            }
        });
    }

    /* renamed from: C */
    public final void m44364C(int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.f50532j, i);
        }
        this.f50532j.setText(str);
        this.f50532j.setHint(str2);
    }

    /* renamed from: D */
    public final void m44363D() {
        m44360G();
        m44365B();
        m44361F();
    }

    /* renamed from: E */
    public final void m44362E() {
        this.f50524b.setOnTouchListener(new View.OnTouchListener() { // from class: XE1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m44348i(view, motionEvent);
            }
        });
    }

    /* renamed from: F */
    public final void m44361F() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.f50526d, new OnApplyWindowInsetsListener() { // from class: VE1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat m44337t;
                m44337t = SearchView.this.m44337t(view, windowInsetsCompat);
                return m44337t;
            }
        });
    }

    /* renamed from: G */
    public final void m44360G() {
        ViewUtils.doOnApplyWindowInsets(this.f50529g, new ViewUtils.OnApplyWindowInsetsListener() { // from class: UE1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                WindowInsetsCompat m44336u;
                m44336u = SearchView.this.m44336u(view, windowInsetsCompat, relativePadding);
                return m44336u;
            }
        });
    }

    /* renamed from: H */
    public final void m44359H(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f50524b.getId()) != null) {
                    m44359H((ViewGroup) childAt, z);
                } else if (!z) {
                    Map map = this.f50548z;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.f50548z.get(childAt)).intValue());
                    }
                } else {
                    this.f50548z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                }
            }
        }
    }

    /* renamed from: I */
    public final void m44358I() {
        MaterialToolbar materialToolbar = this.f50529g;
        if (materialToolbar == null || m44345l(materialToolbar)) {
            return;
        }
        int i = R.drawable.ic_arrow_back_black_24;
        if (this.f50540r == null) {
            this.f50529g.setNavigationIcon(i);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), i).mutate());
        if (this.f50529g.getNavigationIconTint() != null) {
            DrawableCompat.setTint(wrap, this.f50529g.getNavigationIconTint().intValue());
        }
        this.f50529g.setNavigationIcon(new FadeThroughDrawable(this.f50540r.getNavigationIcon(), wrap));
        m44357J();
    }

    /* renamed from: J */
    public final void m44357J() {
        int i;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f50529g);
        if (navigationIconButton == null) {
            return;
        }
        if (this.f50524b.getVisibility() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        Drawable unwrap = DrawableCompat.unwrap(navigationIconButton.getDrawable());
        if (unwrap instanceof DrawerArrowDrawable) {
            ((DrawerArrowDrawable) unwrap).setProgress(i);
        }
        if (unwrap instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) unwrap).setProgress(i);
        }
    }

    public void addHeaderView(@NonNull View view) {
        this.f50527e.addView(view);
        this.f50527e.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f50539q.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f50536n) {
            this.f50535m.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.f50532j.post(new Runnable() { // from class: aF1
            {
                SearchView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m44353d(SearchView.this);
            }
        });
    }

    public void clearText() {
        this.f50532j.setText("");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.f50547y;
    }

    @NonNull
    public EditText getEditText() {
        return this.f50532j;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f50532j.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f50531i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f50531i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f50541s;
    }

    @Nullable
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f50532j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f50529g;
    }

    public void hide() {
        if (!this.f50547y.equals(TransitionState.HIDDEN) && !this.f50547y.equals(TransitionState.HIDING)) {
            this.f50537o.m44280J();
            setModalForAccessibility(false);
        }
    }

    public void inflateMenu(@MenuRes int i) {
        this.f50529g.inflateMenu(i);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.f50542t;
    }

    public boolean isAutoShowKeyboard() {
        return this.f50544v;
    }

    public boolean isMenuItemsAnimated() {
        return this.f50543u;
    }

    public boolean isSetupWithSearchBar() {
        if (this.f50540r != null) {
            return true;
        }
        return false;
    }

    public boolean isShowing() {
        if (!this.f50547y.equals(TransitionState.SHOWN) && !this.f50547y.equals(TransitionState.SHOWING)) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.f50545w;
    }

    /* renamed from: k */
    public boolean m44346k() {
        if (this.f50541s == 48) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m44345l(Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    /* renamed from: m */
    public final /* synthetic */ void m44344m() {
        this.f50532j.clearFocus();
        SearchBar searchBar = this.f50540r;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.f50532j, this.f50545w);
    }

    /* renamed from: n */
    public final /* synthetic */ void m44343n() {
        if (this.f50532j.requestFocus()) {
            this.f50532j.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.f50532j, this.f50545w);
    }

    /* renamed from: o */
    public final /* synthetic */ void m44342o(View view) {
        hide();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean z;
        if (!(parcelable instanceof C7041b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7041b c7041b = (C7041b) parcelable;
        super.onRestoreInstanceState(c7041b.getSuperState());
        setText(c7041b.f50550b);
        if (c7041b.f50551c == 0) {
            z = true;
        } else {
            z = false;
        }
        setVisible(z);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        String charSequence;
        C7041b c7041b = new C7041b(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        c7041b.f50550b = charSequence;
        c7041b.f50551c = this.f50524b.getVisibility();
        return c7041b;
    }

    /* renamed from: p */
    public final /* synthetic */ void m44341p(View view) {
        clearText();
        m44334w();
    }

    /* renamed from: q */
    public final /* synthetic */ boolean m44340q(View view, MotionEvent motionEvent) {
        if (m44346k()) {
            clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    public void removeAllHeaderViews() {
        this.f50527e.removeAllViews();
        this.f50527e.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50527e.removeView(view);
        if (this.f50527e.getChildCount() == 0) {
            this.f50527e.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f50539q.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.f50532j.postDelayed(new Runnable() { // from class: TE1
            {
                SearchView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m44352e(SearchView.this);
            }
        }, 100L);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.f50542t = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.f50544v = z;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f50532j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.f50543u = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.f50548z = new HashMap(viewGroup.getChildCount());
        }
        m44359H(viewGroup, z);
        if (!z) {
            this.f50548z = null;
        }
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.f50529g.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        int i;
        this.f50531i.setText(charSequence);
        TextView textView = this.f50531i;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.f50546x = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f50532j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.f50529g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        if (this.f50547y.equals(transitionState)) {
            return;
        }
        TransitionState transitionState2 = this.f50547y;
        this.f50547y = transitionState;
        for (TransitionListener transitionListener : new LinkedHashSet(this.f50539q)) {
            transitionListener.onStateChanged(this, transitionState2, transitionState);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
        this.f50545w = z;
    }

    public void setVisible(boolean z) {
        boolean z2;
        TransitionState transitionState;
        int i = 0;
        if (this.f50524b.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f50524b;
        if (!z) {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        m44357J();
        if (z2 != z) {
            setModalForAccessibility(z);
        }
        if (z) {
            transitionState = TransitionState.SHOWN;
        } else {
            transitionState = TransitionState.HIDDEN;
        }
        setTransitionState(transitionState);
    }

    public void setupWithSearchBar(@Nullable SearchBar searchBar) {
        this.f50540r = searchBar;
        this.f50537o.m44270T(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: WE1
                {
                    SearchView.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.m44356a(SearchView.this, view);
                }
            });
        }
        m44358I();
        m44332y();
    }

    public void show() {
        if (!this.f50547y.equals(TransitionState.SHOWN) && !this.f50547y.equals(TransitionState.SHOWING)) {
            this.f50537o.m44268V();
            setModalForAccessibility(true);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ WindowInsetsCompat m44337t(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        setUpStatusBarSpacer(systemWindowInsetTop);
        if (!this.f50546x) {
            if (systemWindowInsetTop > 0) {
                z = true;
            } else {
                z = false;
            }
            setStatusBarSpacerEnabledInternal(z);
        }
        return windowInsetsCompat;
    }

    /* renamed from: u */
    public final /* synthetic */ WindowInsetsCompat m44336u(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        int i;
        int i2;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.f50529g);
        if (isLayoutRtl) {
            i = relativePadding.end;
        } else {
            i = relativePadding.start;
        }
        if (isLayoutRtl) {
            i2 = relativePadding.start;
        } else {
            i2 = relativePadding.end;
        }
        this.f50529g.setPadding(i + windowInsetsCompat.getSystemWindowInsetLeft(), relativePadding.top, i2 + windowInsetsCompat.getSystemWindowInsetRight(), relativePadding.bottom);
        return windowInsetsCompat;
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f50541s = activityWindow.getAttributes().softInputMode;
        }
    }

    /* renamed from: v */
    public final /* synthetic */ void m44335v(View view) {
        show();
    }

    /* renamed from: w */
    public void m44334w() {
        if (this.f50544v) {
            requestFocusAndShowKeyboard();
        }
    }

    /* renamed from: x */
    public final void m44333x(boolean z, boolean z2) {
        if (z2) {
            this.f50529g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f50529g.setNavigationOnClickListener(new View.OnClickListener() { // from class: ZE1
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m44347j(SearchView.this, view);
            }
        });
        if (z) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.f50529g.setNavigationIcon(drawerArrowDrawable);
        }
    }

    /* renamed from: y */
    public final void m44332y() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    /* renamed from: z */
    public final void m44331z() {
        this.f50533k.setOnClickListener(new View.OnClickListener() { // from class: bF1
            {
                SearchView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m44351f(SearchView.this, view);
            }
        });
        this.f50532j.addTextChangedListener(new C7040a());
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i) {
        this.f50532j.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f50532j.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchView(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.search.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
