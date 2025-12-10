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
import androidx.annotation.InterfaceC2037Px;
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
    public static final int f50534A = R.style.Widget_Material3_SearchView;

    /* renamed from: a */
    public final View f50535a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f50536b;

    /* renamed from: c */
    public final View f50537c;

    /* renamed from: d */
    public final View f50538d;

    /* renamed from: e */
    public final FrameLayout f50539e;

    /* renamed from: f */
    public final FrameLayout f50540f;

    /* renamed from: g */
    public final MaterialToolbar f50541g;

    /* renamed from: h */
    public final Toolbar f50542h;

    /* renamed from: i */
    public final TextView f50543i;

    /* renamed from: j */
    public final EditText f50544j;

    /* renamed from: k */
    public final ImageButton f50545k;

    /* renamed from: l */
    public final View f50546l;

    /* renamed from: m */
    public final TouchObserverFrameLayout f50547m;

    /* renamed from: n */
    public final boolean f50548n;

    /* renamed from: o */
    public final C7040b f50549o;

    /* renamed from: p */
    public final ElevationOverlayProvider f50550p;

    /* renamed from: q */
    public final Set f50551q;

    /* renamed from: r */
    public SearchBar f50552r;

    /* renamed from: s */
    public int f50553s;

    /* renamed from: t */
    public boolean f50554t;

    /* renamed from: u */
    public boolean f50555u;

    /* renamed from: v */
    public boolean f50556v;

    /* renamed from: w */
    public boolean f50557w;

    /* renamed from: x */
    public boolean f50558x;

    /* renamed from: y */
    public TransitionState f50559y;

    /* renamed from: z */
    public Map f50560z;

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
    public class C7029a implements TextWatcher {
        public C7029a() {
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
            ImageButton imageButton = SearchView.this.f50545k;
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
    public static class C7030b extends AbsSavedState {
        public static final Parcelable.Creator<C7030b> CREATOR = new C7031a();

        /* renamed from: b */
        public String f50562b;

        /* renamed from: c */
        public int f50563c;

        /* renamed from: com.google.android.material.search.SearchView$b$a */
        /* loaded from: classes4.dex */
        public class C7031a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C7030b createFromParcel(Parcel parcel) {
                return new C7030b(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C7030b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7030b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C7030b[] newArray(int i) {
                return new C7030b[i];
            }
        }

        public C7030b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f50562b);
            parcel.writeInt(this.f50563c);
        }

        public C7030b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50562b = parcel.readString();
            this.f50563c = parcel.readInt();
        }

        public C7030b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m44343a(SearchView searchView, View view) {
        searchView.m44322v(view);
    }

    /* renamed from: b */
    public static /* synthetic */ WindowInsetsCompat m44342b(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, WindowInsetsCompat windowInsetsCompat) {
        return m44326r(marginLayoutParams, i, i2, view, windowInsetsCompat);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m44341c(SearchView searchView, View view, MotionEvent motionEvent) {
        return searchView.m44327q(view, motionEvent);
    }

    /* renamed from: d */
    public static /* synthetic */ void m44340d(SearchView searchView) {
        searchView.m44331m();
    }

    /* renamed from: e */
    public static /* synthetic */ void m44339e(SearchView searchView) {
        searchView.m44330n();
    }

    /* renamed from: f */
    public static /* synthetic */ void m44338f(SearchView searchView, View view) {
        searchView.m44328p(view);
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsetsCompat m44337g(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        return searchView.m44323u(view, windowInsetsCompat, relativePadding);
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
        SearchBar searchBar = this.f50552r;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @InterfaceC2037Px
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: h */
    public static /* synthetic */ WindowInsetsCompat m44336h(SearchView searchView, View view, WindowInsetsCompat windowInsetsCompat) {
        return searchView.m44324t(view, windowInsetsCompat);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m44335i(View view, MotionEvent motionEvent) {
        return m44325s(view, motionEvent);
    }

    /* renamed from: j */
    public static /* synthetic */ void m44334j(SearchView searchView, View view) {
        searchView.m44329o(view);
    }

    /* renamed from: r */
    public static /* synthetic */ WindowInsetsCompat m44326r(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, WindowInsetsCompat windowInsetsCompat) {
        marginLayoutParams.leftMargin = i + windowInsetsCompat.getSystemWindowInsetLeft();
        marginLayoutParams.rightMargin = i2 + windowInsetsCompat.getSystemWindowInsetRight();
        return windowInsetsCompat;
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m44325s(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        int i;
        View view = this.f50538d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider = this.f50550p;
        if (elevationOverlayProvider != null && this.f50537c != null) {
            this.f50537c.setBackgroundColor(elevationOverlayProvider.compositeOverlayWithThemeSurfaceColorIfNeeded(f));
        }
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.f50539e, false));
        }
    }

    private void setUpStatusBarSpacer(@InterfaceC2037Px int i) {
        if (this.f50538d.getLayoutParams().height != i) {
            this.f50538d.getLayoutParams().height = i;
            this.f50538d.requestLayout();
        }
    }

    /* renamed from: A */
    public final void m44353A() {
        this.f50547m.setOnTouchListener(new View.OnTouchListener() { // from class: VF1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m44341c(SearchView.this, view, motionEvent);
            }
        });
    }

    /* renamed from: B */
    public final void m44352B() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f50546l.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        ViewCompat.setOnApplyWindowInsetsListener(this.f50546l, new OnApplyWindowInsetsListener() { // from class: PF1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.m44342b(marginLayoutParams, i, i2, view, windowInsetsCompat);
            }
        });
    }

    /* renamed from: C */
    public final void m44351C(int i, String str, String str2) {
        if (i != -1) {
            TextViewCompat.setTextAppearance(this.f50544j, i);
        }
        this.f50544j.setText(str);
        this.f50544j.setHint(str2);
    }

    /* renamed from: D */
    public final void m44350D() {
        m44347G();
        m44352B();
        m44348F();
    }

    /* renamed from: E */
    public final void m44349E() {
        this.f50536b.setOnTouchListener(new View.OnTouchListener() { // from class: UF1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.m44335i(view, motionEvent);
            }
        });
    }

    /* renamed from: F */
    public final void m44348F() {
        setUpStatusBarSpacer(getStatusBarHeight());
        ViewCompat.setOnApplyWindowInsetsListener(this.f50538d, new OnApplyWindowInsetsListener() { // from class: SF1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SearchView.m44336h(SearchView.this, view, windowInsetsCompat);
            }
        });
    }

    /* renamed from: G */
    public final void m44347G() {
        ViewUtils.doOnApplyWindowInsets(this.f50541g, new ViewUtils.OnApplyWindowInsetsListener() { // from class: RF1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                return SearchView.m44337g(SearchView.this, view, windowInsetsCompat, relativePadding);
            }
        });
    }

    /* renamed from: H */
    public final void m44346H(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.f50536b.getId()) != null) {
                    m44346H((ViewGroup) childAt, z);
                } else if (!z) {
                    Map map = this.f50560z;
                    if (map != null && map.containsKey(childAt)) {
                        ViewCompat.setImportantForAccessibility(childAt, ((Integer) this.f50560z.get(childAt)).intValue());
                    }
                } else {
                    this.f50560z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                }
            }
        }
    }

    /* renamed from: I */
    public final void m44345I() {
        MaterialToolbar materialToolbar = this.f50541g;
        if (materialToolbar == null || m44332l(materialToolbar)) {
            return;
        }
        int i = R.drawable.ic_arrow_back_black_24;
        if (this.f50552r == null) {
            this.f50541g.setNavigationIcon(i);
            return;
        }
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(getContext(), i).mutate());
        if (this.f50541g.getNavigationIconTint() != null) {
            DrawableCompat.setTint(wrap, this.f50541g.getNavigationIconTint().intValue());
        }
        this.f50541g.setNavigationIcon(new FadeThroughDrawable(this.f50552r.getNavigationIcon(), wrap));
        m44344J();
    }

    /* renamed from: J */
    public final void m44344J() {
        int i;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.f50541g);
        if (navigationIconButton == null) {
            return;
        }
        if (this.f50536b.getVisibility() == 0) {
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
        this.f50539e.addView(view);
        this.f50539e.setVisibility(0);
    }

    public void addTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f50551q.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f50548n) {
            this.f50547m.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void clearFocusAndHideKeyboard() {
        this.f50544j.post(new Runnable() { // from class: XF1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m44340d(SearchView.this);
            }
        });
    }

    public void clearText() {
        this.f50544j.setText("");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<SearchView> getBehavior() {
        return new Behavior();
    }

    @NonNull
    public TransitionState getCurrentTransitionState() {
        return this.f50559y;
    }

    @NonNull
    public EditText getEditText() {
        return this.f50544j;
    }

    @Nullable
    public CharSequence getHint() {
        return this.f50544j.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.f50543i;
    }

    @Nullable
    public CharSequence getSearchPrefixText() {
        return this.f50543i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f50553s;
    }

    @Nullable
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f50544j.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.f50541g;
    }

    public void hide() {
        if (!this.f50559y.equals(TransitionState.HIDDEN) && !this.f50559y.equals(TransitionState.HIDING)) {
            this.f50549o.m44267J();
            setModalForAccessibility(false);
        }
    }

    public void inflateMenu(@MenuRes int i) {
        this.f50541g.inflateMenu(i);
    }

    public boolean isAnimatedNavigationIcon() {
        return this.f50554t;
    }

    public boolean isAutoShowKeyboard() {
        return this.f50556v;
    }

    public boolean isMenuItemsAnimated() {
        return this.f50555u;
    }

    public boolean isSetupWithSearchBar() {
        if (this.f50552r != null) {
            return true;
        }
        return false;
    }

    public boolean isShowing() {
        if (!this.f50559y.equals(TransitionState.SHOWN) && !this.f50559y.equals(TransitionState.SHOWING)) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.f50557w;
    }

    /* renamed from: k */
    public boolean m44333k() {
        if (this.f50553s == 48) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m44332l(Toolbar toolbar) {
        return DrawableCompat.unwrap(toolbar.getNavigationIcon()) instanceof DrawerArrowDrawable;
    }

    /* renamed from: m */
    public final /* synthetic */ void m44331m() {
        this.f50544j.clearFocus();
        SearchBar searchBar = this.f50552r;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.f50544j, this.f50557w);
    }

    /* renamed from: n */
    public final /* synthetic */ void m44330n() {
        if (this.f50544j.requestFocus()) {
            this.f50544j.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.f50544j, this.f50557w);
    }

    /* renamed from: o */
    public final /* synthetic */ void m44329o(View view) {
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
        if (!(parcelable instanceof C7030b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7030b c7030b = (C7030b) parcelable;
        super.onRestoreInstanceState(c7030b.getSuperState());
        setText(c7030b.f50562b);
        if (c7030b.f50563c == 0) {
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
        C7030b c7030b = new C7030b(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        c7030b.f50562b = charSequence;
        c7030b.f50563c = this.f50536b.getVisibility();
        return c7030b;
    }

    /* renamed from: p */
    public final /* synthetic */ void m44328p(View view) {
        clearText();
        m44321w();
    }

    /* renamed from: q */
    public final /* synthetic */ boolean m44327q(View view, MotionEvent motionEvent) {
        if (m44333k()) {
            clearFocusAndHideKeyboard();
            return false;
        }
        return false;
    }

    public void removeAllHeaderViews() {
        this.f50539e.removeAllViews();
        this.f50539e.setVisibility(8);
    }

    public void removeHeaderView(@NonNull View view) {
        this.f50539e.removeView(view);
        if (this.f50539e.getChildCount() == 0) {
            this.f50539e.setVisibility(8);
        }
    }

    public void removeTransitionListener(@NonNull TransitionListener transitionListener) {
        this.f50551q.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.f50544j.postDelayed(new Runnable() { // from class: QF1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.m44339e(SearchView.this);
            }
        }, 100L);
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.f50554t = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.f50556v = z;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.f50544j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.f50555u = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.f50560z = new HashMap(viewGroup.getChildCount());
        }
        m44346H(viewGroup, z);
        if (!z) {
            this.f50560z = null;
        }
    }

    public void setOnMenuItemClickListener(@Nullable Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.f50541g.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(@Nullable CharSequence charSequence) {
        int i;
        this.f50543i.setText(charSequence);
        TextView textView = this.f50543i;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.f50558x = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Nullable CharSequence charSequence) {
        this.f50544j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.f50541g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull TransitionState transitionState) {
        if (this.f50559y.equals(transitionState)) {
            return;
        }
        TransitionState transitionState2 = this.f50559y;
        this.f50559y = transitionState;
        for (TransitionListener transitionListener : new LinkedHashSet(this.f50551q)) {
            transitionListener.onStateChanged(this, transitionState2, transitionState);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
        this.f50557w = z;
    }

    public void setVisible(boolean z) {
        boolean z2;
        TransitionState transitionState;
        int i = 0;
        if (this.f50536b.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f50536b;
        if (!z) {
            i = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i);
        m44344J();
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
        this.f50552r = searchBar;
        this.f50549o.m44257T(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: TF1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchView.m44343a(SearchView.this, view);
                }
            });
        }
        m44345I();
        m44319y();
    }

    public void show() {
        if (!this.f50559y.equals(TransitionState.SHOWN) && !this.f50559y.equals(TransitionState.SHOWING)) {
            this.f50549o.m44255V();
            setModalForAccessibility(true);
        }
    }

    /* renamed from: t */
    public final /* synthetic */ WindowInsetsCompat m44324t(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        setUpStatusBarSpacer(systemWindowInsetTop);
        if (!this.f50558x) {
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
    public final /* synthetic */ WindowInsetsCompat m44323u(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        int i;
        int i2;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.f50541g);
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
        this.f50541g.setPadding(i + windowInsetsCompat.getSystemWindowInsetLeft(), relativePadding.top, i2 + windowInsetsCompat.getSystemWindowInsetRight(), relativePadding.bottom);
        return windowInsetsCompat;
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f50553s = activityWindow.getAttributes().softInputMode;
        }
    }

    /* renamed from: v */
    public final /* synthetic */ void m44322v(View view) {
        show();
    }

    /* renamed from: w */
    public void m44321w() {
        if (this.f50556v) {
            requestFocusAndShowKeyboard();
        }
    }

    /* renamed from: x */
    public final void m44320x(boolean z, boolean z2) {
        if (z2) {
            this.f50541g.setNavigationIcon((Drawable) null);
            return;
        }
        this.f50541g.setNavigationOnClickListener(new View.OnClickListener() { // from class: WF1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m44334j(SearchView.this, view);
            }
        });
        if (z) {
            DrawerArrowDrawable drawerArrowDrawable = new DrawerArrowDrawable(getContext());
            drawerArrowDrawable.setColor(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.f50541g.setNavigationIcon(drawerArrowDrawable);
        }
    }

    /* renamed from: y */
    public final void m44319y() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    /* renamed from: z */
    public final void m44318z() {
        this.f50545k.setOnClickListener(new View.OnClickListener() { // from class: YF1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.m44338f(SearchView.this, view);
            }
        });
        this.f50544j.addTextChangedListener(new C7029a());
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(@StringRes int i) {
        this.f50544j.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.f50544j.setText(i);
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