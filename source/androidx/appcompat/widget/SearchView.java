package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* renamed from: q0 */
    public static final C2241l f9800q0;

    /* renamed from: A */
    public Rect f9801A;

    /* renamed from: B */
    public int[] f9802B;

    /* renamed from: C */
    public int[] f9803C;

    /* renamed from: D */
    public final ImageView f9804D;

    /* renamed from: E */
    public final Drawable f9805E;

    /* renamed from: F */
    public final int f9806F;

    /* renamed from: G */
    public final int f9807G;

    /* renamed from: H */
    public final Intent f9808H;

    /* renamed from: I */
    public final Intent f9809I;

    /* renamed from: J */
    public final CharSequence f9810J;

    /* renamed from: K */
    public OnQueryTextListener f9811K;

    /* renamed from: L */
    public OnCloseListener f9812L;

    /* renamed from: M */
    public View.OnFocusChangeListener f9813M;

    /* renamed from: N */
    public OnSuggestionListener f9814N;

    /* renamed from: O */
    public View.OnClickListener f9815O;

    /* renamed from: P */
    public boolean f9816P;

    /* renamed from: Q */
    public boolean f9817Q;

    /* renamed from: R */
    public CursorAdapter f9818R;

    /* renamed from: S */
    public boolean f9819S;

    /* renamed from: T */
    public CharSequence f9820T;

    /* renamed from: U */
    public boolean f9821U;

    /* renamed from: V */
    public boolean f9822V;

    /* renamed from: W */
    public int f9823W;

    /* renamed from: a0 */
    public boolean f9824a0;

    /* renamed from: b0 */
    public CharSequence f9825b0;

    /* renamed from: c0 */
    public CharSequence f9826c0;

    /* renamed from: d0 */
    public boolean f9827d0;

    /* renamed from: e0 */
    public int f9828e0;

    /* renamed from: f0 */
    public SearchableInfo f9829f0;

    /* renamed from: g0 */
    public Bundle f9830g0;

    /* renamed from: h0 */
    public final Runnable f9831h0;

    /* renamed from: i0 */
    public Runnable f9832i0;

    /* renamed from: j0 */
    public final WeakHashMap f9833j0;

    /* renamed from: k0 */
    public final View.OnClickListener f9834k0;

    /* renamed from: l0 */
    public View.OnKeyListener f9835l0;

    /* renamed from: m0 */
    public final TextView.OnEditorActionListener f9836m0;

    /* renamed from: n0 */
    public final AdapterView.OnItemClickListener f9837n0;

    /* renamed from: o0 */
    public final AdapterView.OnItemSelectedListener f9838o0;

    /* renamed from: p */
    public final SearchAutoComplete f9839p;

    /* renamed from: p0 */
    public TextWatcher f9840p0;

    /* renamed from: q */
    public final View f9841q;

    /* renamed from: r */
    public final View f9842r;

    /* renamed from: s */
    public final View f9843s;

    /* renamed from: t */
    public final ImageView f9844t;

    /* renamed from: u */
    public final ImageView f9845u;

    /* renamed from: v */
    public final ImageView f9846v;

    /* renamed from: w */
    public final ImageView f9847w;

    /* renamed from: x */
    public final View f9848x;

    /* renamed from: y */
    public C2244n f9849y;

    /* renamed from: z */
    public Rect f9850z;

    /* loaded from: classes.dex */
    public interface OnCloseListener {
        boolean onClose();
    }

    /* loaded from: classes.dex */
    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: classes.dex */
    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e */
        public int f9851e;

        /* renamed from: f */
        public SearchView f9852f;

        /* renamed from: g */
        public boolean f9853g;

        /* renamed from: h */
        public final Runnable f9854h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        public class RunnableC2229a implements Runnable {
            public RunnableC2229a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m64187d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return SyslogConstants.LOG_LOCAL4;
                }
                return CertificateHolderAuthorization.CVCA;
            }
            return CertificateHolderAuthorization.CVCA;
        }

        /* renamed from: b */
        public void m64189b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C2240k.m64185b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f9800q0.m64182c(this);
        }

        /* renamed from: c */
        public boolean m64188c() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void m64187d() {
            if (this.f9853g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f9853g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.f9851e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f9853g) {
                removeCallbacks(this.f9854h);
                post(this.f9854h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f9852f.m64210N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f9852f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f9852f.hasFocus() && getVisibility() == 0) {
                this.f9853g = true;
                if (SearchView.m64222B(getContext())) {
                    m64189b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f9853g = false;
                removeCallbacks(this.f9854h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f9853g = false;
                removeCallbacks(this.f9854h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f9853g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f9852f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f9851e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f9854h = new RunnableC2229a();
            this.f9851e = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    public class C2230a implements TextWatcher {
        public C2230a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m64211M(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    public class RunnableC2231b implements Runnable {
        public RunnableC2231b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m64205S();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    public class RunnableC2232c implements Runnable {
        public RunnableC2232c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CursorAdapter cursorAdapter = SearchView.this.f9818R;
            if (cursorAdapter instanceof UO1) {
                cursorAdapter.changeCursor(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    public class View$OnFocusChangeListenerC2233d implements View.OnFocusChangeListener {
        public View$OnFocusChangeListenerC2233d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f9813M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC2234e implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC2234e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m64198r();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2235f implements View.OnClickListener {
        public View$OnClickListenerC2235f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f9844t) {
                searchView.m64214J();
            } else if (view == searchView.f9846v) {
                searchView.m64217G();
            } else if (view == searchView.f9845u) {
                searchView.m64213K();
            } else if (view == searchView.f9847w) {
                searchView.m64209O();
            } else if (view == searchView.f9839p) {
                searchView.m64192x();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    public class View$OnKeyListenerC2236g implements View.OnKeyListener {
        public View$OnKeyListenerC2236g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f9829f0 == null) {
                return false;
            }
            if (searchView.f9839p.isPopupShowing() && SearchView.this.f9839p.getListSelection() != -1) {
                return SearchView.this.m64212L(view, i, keyEvent);
            }
            if (SearchView.this.f9839p.m64188c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m64219E(0, null, searchView2.f9839p.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    public class C2237h implements TextView.OnEditorActionListener {
        public C2237h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m64213K();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    public class C2238i implements AdapterView.OnItemClickListener {
        public C2238i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.m64216H(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    public class C2239j implements AdapterView.OnItemSelectedListener {
        public C2239j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.m64215I(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C2240k {
        @DoNotInline
        /* renamed from: a */
        public static void m64186a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m64185b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public static class C2241l {

        /* renamed from: a */
        public Method f9866a;

        /* renamed from: b */
        public Method f9867b;

        /* renamed from: c */
        public Method f9868c;

        public C2241l() {
            this.f9866a = null;
            this.f9867b = null;
            this.f9868c = null;
            m64181d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f9866a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f9867b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f9868c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m64181d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        /* renamed from: a */
        public void m64184a(AutoCompleteTextView autoCompleteTextView) {
            m64181d();
            Method method = this.f9867b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void m64183b(AutoCompleteTextView autoCompleteTextView) {
            m64181d();
            Method method = this.f9866a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void m64182c(AutoCompleteTextView autoCompleteTextView) {
            m64181d();
            Method method = this.f9868c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public static class C2242m extends AbsSavedState {
        public static final Parcelable.Creator<C2242m> CREATOR = new C2243a();

        /* renamed from: b */
        public boolean f9869b;

        /* renamed from: androidx.appcompat.widget.SearchView$m$a */
        /* loaded from: classes.dex */
        public class C2243a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2242m createFromParcel(Parcel parcel) {
                return new C2242m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C2242m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2242m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C2242m[] newArray(int i) {
                return new C2242m[i];
            }
        }

        public C2242m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f9869b + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f9869b));
        }

        public C2242m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9869b = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public static class C2244n extends TouchDelegate {

        /* renamed from: a */
        public final View f9870a;

        /* renamed from: b */
        public final Rect f9871b;

        /* renamed from: c */
        public final Rect f9872c;

        /* renamed from: d */
        public final Rect f9873d;

        /* renamed from: e */
        public final int f9874e;

        /* renamed from: f */
        public boolean f9875f;

        public C2244n(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f9874e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f9871b = new Rect();
            this.f9873d = new Rect();
            this.f9872c = new Rect();
            m64177a(rect, rect2);
            this.f9870a = view;
        }

        /* renamed from: a */
        public void m64177a(Rect rect, Rect rect2) {
            this.f9871b.set(rect);
            this.f9873d.set(rect);
            Rect rect3 = this.f9873d;
            int i = this.f9874e;
            rect3.inset(-i, -i);
            this.f9872c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z2 = this.f9875f;
                        this.f9875f = false;
                    }
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f9875f;
                    if (z2 && !this.f9873d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f9871b.contains(x, y)) {
                    this.f9875f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.f9872c.contains(x, y)) {
                motionEvent.setLocation(this.f9870a.getWidth() / 2, this.f9870a.getHeight() / 2);
            } else {
                Rect rect = this.f9872c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            }
            return this.f9870a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        C2241l c2241l;
        if (Build.VERSION.SDK_INT < 29) {
            c2241l = new C2241l();
        } else {
            c2241l = null;
        }
        f9800q0 = c2241l;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: B */
    public static boolean m64222B(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    /* renamed from: A */
    public final boolean m64223A() {
        Intent intent;
        SearchableInfo searchableInfo = this.f9829f0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f9829f0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f9808H;
        } else if (this.f9829f0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f9809I;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m64221C() {
        if ((this.f9819S || this.f9824a0) && !isIconified()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final void m64220D(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(intent);
        }
    }

    /* renamed from: E */
    public void m64219E(int i, String str, String str2) {
        getContext().startActivity(m64197s("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: F */
    public final boolean m64218F(int i, int i2, String str) {
        Cursor cursor = this.f9818R.getCursor();
        if (cursor != null && cursor.moveToPosition(i)) {
            m64220D(m64196t(cursor, i2, str));
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public void m64217G() {
        if (TextUtils.isEmpty(this.f9839p.getText())) {
            if (this.f9816P) {
                OnCloseListener onCloseListener = this.f9812L;
                if (onCloseListener == null || !onCloseListener.onClose()) {
                    clearFocus();
                    m64200X(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f9839p.setText("");
        this.f9839p.requestFocus();
        this.f9839p.setImeVisibility(true);
    }

    /* renamed from: H */
    public boolean m64216H(int i, int i2, String str) {
        OnSuggestionListener onSuggestionListener = this.f9814N;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i)) {
            return false;
        }
        m64218F(i, 0, null);
        this.f9839p.setImeVisibility(false);
        m64193w();
        return true;
    }

    /* renamed from: I */
    public boolean m64215I(int i) {
        OnSuggestionListener onSuggestionListener = this.f9814N;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionSelect(i)) {
            return false;
        }
        m64207Q(i);
        return true;
    }

    /* renamed from: J */
    public void m64214J() {
        m64200X(false);
        this.f9839p.requestFocus();
        this.f9839p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f9815O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: K */
    public void m64213K() {
        Editable text = this.f9839p.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            OnQueryTextListener onQueryTextListener = this.f9811K;
            if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
                if (this.f9829f0 != null) {
                    m64219E(0, null, text.toString());
                }
                this.f9839p.setImeVisibility(false);
                m64193w();
            }
        }
    }

    /* renamed from: L */
    public boolean m64212L(View view, int i, KeyEvent keyEvent) {
        int length;
        if (this.f9829f0 != null && this.f9818R != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i != 66 && i != 84 && i != 61) {
                if (i != 21 && i != 22) {
                    if (i == 19) {
                        this.f9839p.getListSelection();
                        return false;
                    }
                } else {
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = this.f9839p.length();
                    }
                    this.f9839p.setSelection(length);
                    this.f9839p.setListSelection(0);
                    this.f9839p.clearListSelection();
                    this.f9839p.m64189b();
                    return true;
                }
            } else {
                return m64216H(this.f9839p.getListSelection(), 0, null);
            }
        }
        return false;
    }

    /* renamed from: M */
    public void m64211M(CharSequence charSequence) {
        Editable text = this.f9839p.getText();
        this.f9826c0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        m64201W(!isEmpty);
        m64199Y(isEmpty);
        m64206R();
        m64202V();
        if (this.f9811K != null && !TextUtils.equals(charSequence, this.f9825b0)) {
            this.f9811K.onQueryTextChange(charSequence.toString());
        }
        this.f9825b0 = charSequence.toString();
    }

    /* renamed from: N */
    public void m64210N() {
        m64200X(isIconified());
        m64208P();
        if (this.f9839p.hasFocus()) {
            m64192x();
        }
    }

    /* renamed from: O */
    public void m64209O() {
        SearchableInfo searchableInfo = this.f9829f0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m64194v(this.f9808H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m64195u(this.f9809I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: P */
    public final void m64208P() {
        post(this.f9831h0);
    }

    /* renamed from: Q */
    public final void m64207Q(int i) {
        Editable text = this.f9839p.getText();
        Cursor cursor = this.f9818R.getCursor();
        if (cursor == null) {
            return;
        }
        if (cursor.moveToPosition(i)) {
            CharSequence convertToString = this.f9818R.convertToString(cursor);
            if (convertToString != null) {
                setQuery(convertToString);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    /* renamed from: R */
    public final void m64206R() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f9839p.getText());
        int i = 0;
        if (!z2 && (!this.f9816P || this.f9827d0)) {
            z = false;
        }
        ImageView imageView = this.f9846v;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f9846v.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: S */
    public void m64205S() {
        int[] iArr;
        if (this.f9839p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f9842r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f9843s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: T */
    public final void m64204T() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f9839p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m64190z(queryHint));
    }

    /* renamed from: U */
    public final void m64203U() {
        this.f9839p.setThreshold(this.f9829f0.getSuggestThreshold());
        this.f9839p.setImeOptions(this.f9829f0.getImeOptions());
        int inputType = this.f9829f0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f9829f0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f9839p.setInputType(inputType);
        CursorAdapter cursorAdapter = this.f9818R;
        if (cursorAdapter != null) {
            cursorAdapter.changeCursor(null);
        }
        if (this.f9829f0.getSuggestAuthority() != null) {
            UO1 uo1 = new UO1(getContext(), this, this.f9829f0, this.f9833j0);
            this.f9818R = uo1;
            this.f9839p.setAdapter(uo1);
            UO1 uo12 = (UO1) this.f9818R;
            if (this.f9821U) {
                i = 2;
            }
            uo12.m66049o(i);
        }
    }

    /* renamed from: V */
    public final void m64202V() {
        int i;
        if (m64221C() && (this.f9845u.getVisibility() == 0 || this.f9847w.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.f9843s.setVisibility(i);
    }

    /* renamed from: W */
    public final void m64201W(boolean z) {
        int i;
        if (this.f9819S && m64221C() && hasFocus() && (z || !this.f9824a0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.f9845u.setVisibility(i);
    }

    /* renamed from: X */
    public final void m64200X(boolean z) {
        int i;
        int i2;
        this.f9817Q = z;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f9839p.getText());
        this.f9844t.setVisibility(i);
        m64201W(!isEmpty);
        View view = this.f9841q;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f9804D.getDrawable() != null && !this.f9816P) {
            i3 = 0;
        }
        this.f9804D.setVisibility(i3);
        m64206R();
        m64199Y(isEmpty);
        m64202V();
    }

    /* renamed from: Y */
    public final void m64199Y(boolean z) {
        int i = 8;
        if (this.f9824a0 && !isIconified() && z) {
            this.f9845u.setVisibility(8);
            i = 0;
        }
        this.f9847w.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f9822V = true;
        super.clearFocus();
        this.f9839p.clearFocus();
        this.f9839p.setImeVisibility(false);
        this.f9822V = false;
    }

    public int getImeOptions() {
        return this.f9839p.getImeOptions();
    }

    public int getInputType() {
        return this.f9839p.getInputType();
    }

    public int getMaxWidth() {
        return this.f9823W;
    }

    public CharSequence getQuery() {
        return this.f9839p.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f9820T;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f9829f0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f9829f0.getHintId());
            }
            return this.f9810J;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f9807G;
    }

    public int getSuggestionRowLayout() {
        return this.f9806F;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f9818R;
    }

    public boolean isIconfiedByDefault() {
        return this.f9816P;
    }

    public boolean isIconified() {
        return this.f9817Q;
    }

    public boolean isQueryRefinementEnabled() {
        return this.f9821U;
    }

    public boolean isSubmitButtonEnabled() {
        return this.f9819S;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        m64200X(true);
        this.f9839p.setImeOptions(this.f9828e0);
        this.f9827d0 = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
        if (this.f9827d0) {
            return;
        }
        this.f9827d0 = true;
        int imeOptions = this.f9839p.getImeOptions();
        this.f9828e0 = imeOptions;
        this.f9839p.setImeOptions(imeOptions | MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
        this.f9839p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f9831h0);
        post(this.f9832i0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m64191y(this.f9839p, this.f9850z);
            Rect rect = this.f9801A;
            Rect rect2 = this.f9850z;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C2244n c2244n = this.f9849y;
            if (c2244n == null) {
                C2244n c2244n2 = new C2244n(this.f9801A, this.f9850z, this.f9839p);
                this.f9849y = c2244n2;
                setTouchDelegate(c2244n2);
                return;
            }
            c2244n.m64177a(this.f9801A, this.f9850z);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.f9823W) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.f9823W;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.f9823W;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onQueryRefine(@Nullable CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2242m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2242m c2242m = (C2242m) parcelable;
        super.onRestoreInstanceState(c2242m.getSuperState());
        m64200X(c2242m.f9869b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C2242m c2242m = new C2242m(super.onSaveInstanceState());
        c2242m.f9869b = isIconified();
        return c2242m;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m64208P();
    }

    /* renamed from: r */
    public void m64198r() {
        int i;
        int i2;
        if (this.f9848x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f9842r.getPaddingLeft();
            Rect rect = new Rect();
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            if (this.f9816P) {
                i = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
            } else {
                i = 0;
            }
            this.f9839p.getDropDownBackground().getPadding(rect);
            if (isLayoutRtl) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f9839p.setDropDownHorizontalOffset(i2);
            this.f9839p.setDropDownWidth((((this.f9848x.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f9822V || !isFocusable()) {
            return false;
        }
        if (!isIconified()) {
            boolean requestFocus = this.f9839p.requestFocus(i, rect);
            if (requestFocus) {
                m64200X(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    /* renamed from: s */
    public final Intent m64197s(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f9826c0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f9830g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f9829f0.getSearchActivity());
        return intent;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f9830g0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m64217G();
        } else {
            m64214J();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f9816P == z) {
            return;
        }
        this.f9816P = z;
        m64200X(z);
        m64204T();
    }

    public void setImeOptions(int i) {
        this.f9839p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f9839p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f9823W = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.f9812L = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f9813M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.f9811K = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f9815O = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.f9814N = onSuggestionListener;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.f9839p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f9839p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f9826c0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m64213K();
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f9820T = charSequence;
        m64204T();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f9821U = z;
        CursorAdapter cursorAdapter = this.f9818R;
        if (cursorAdapter instanceof UO1) {
            UO1 uo1 = (UO1) cursorAdapter;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            uo1.m66049o(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f9829f0 = searchableInfo;
        if (searchableInfo != null) {
            m64203U();
            m64204T();
        }
        boolean m64223A = m64223A();
        this.f9824a0 = m64223A;
        if (m64223A) {
            this.f9839p.setPrivateImeOptions("nm");
        }
        m64200X(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f9819S = z;
        m64200X(isIconified());
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.f9818R = cursorAdapter;
        this.f9839p.setAdapter(cursorAdapter);
    }

    /* renamed from: t */
    public final Intent m64196t(Cursor cursor, int i, String str) {
        int i2;
        Uri parse;
        String m66058f;
        try {
            String m66058f2 = UO1.m66058f(cursor, "suggest_intent_action");
            if (m66058f2 == null) {
                m66058f2 = this.f9829f0.getSuggestIntentAction();
            }
            if (m66058f2 == null) {
                m66058f2 = "android.intent.action.SEARCH";
            }
            String str2 = m66058f2;
            String m66058f3 = UO1.m66058f(cursor, "suggest_intent_data");
            if (m66058f3 == null) {
                m66058f3 = this.f9829f0.getSuggestIntentData();
            }
            if (m66058f3 != null && (m66058f = UO1.m66058f(cursor, "suggest_intent_data_id")) != null) {
                m66058f3 = m66058f3 + RemoteSettings.FORWARD_SLASH_STRING + Uri.encode(m66058f);
            }
            if (m66058f3 == null) {
                parse = null;
            } else {
                parse = Uri.parse(m66058f3);
            }
            return m64197s(str2, parse, UO1.m66058f(cursor, "suggest_intent_extra_data"), UO1.m66058f(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: u */
    public final Intent m64195u(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f9830g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: v */
    public final Intent m64194v(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    /* renamed from: w */
    public final void m64193w() {
        this.f9839p.dismissDropDown();
    }

    /* renamed from: x */
    public void m64192x() {
        if (Build.VERSION.SDK_INT >= 29) {
            C2240k.m64186a(this.f9839p);
            return;
        }
        C2241l c2241l = f9800q0;
        c2241l.m64183b(this.f9839p);
        c2241l.m64184a(this.f9839p);
    }

    /* renamed from: y */
    public final void m64191y(View view, Rect rect) {
        view.getLocationInWindow(this.f9802B);
        getLocationInWindow(this.f9803C);
        int[] iArr = this.f9802B;
        int i = iArr[1];
        int[] iArr2 = this.f9803C;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: z */
    public final CharSequence m64190z(CharSequence charSequence) {
        if (this.f9816P && this.f9805E != null) {
            int textSize = (int) (this.f9839p.getTextSize() * 1.25d);
            this.f9805E.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f9805E), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9850z = new Rect();
        this.f9801A = new Rect();
        this.f9802B = new int[2];
        this.f9803C = new int[2];
        this.f9831h0 = new RunnableC2231b();
        this.f9832i0 = new RunnableC2232c();
        this.f9833j0 = new WeakHashMap();
        View$OnClickListenerC2235f view$OnClickListenerC2235f = new View$OnClickListenerC2235f();
        this.f9834k0 = view$OnClickListenerC2235f;
        this.f9835l0 = new View$OnKeyListenerC2236g();
        C2237h c2237h = new C2237h();
        this.f9836m0 = c2237h;
        C2238i c2238i = new C2238i();
        this.f9837n0 = c2238i;
        C2239j c2239j = new C2239j();
        this.f9838o0 = c2239j;
        this.f9840p0 = new C2230a();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.SearchView, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.SearchView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R.styleable.SearchView_layout, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f9839p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f9841q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f9842r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f9843s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f9844t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f9845u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f9846v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f9847w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f9804D = imageView5;
        ViewCompat.setBackground(findViewById, obtainStyledAttributes.getDrawable(R.styleable.SearchView_queryBackground));
        ViewCompat.setBackground(findViewById2, obtainStyledAttributes.getDrawable(R.styleable.SearchView_submitBackground));
        imageView.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchIcon));
        imageView2.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchIcon));
        this.f9805E = obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchHintIcon);
        TooltipCompat.setTooltipText(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f9806F = obtainStyledAttributes.getResourceId(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.f9807G = obtainStyledAttributes.getResourceId(R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(view$OnClickListenerC2235f);
        imageView3.setOnClickListener(view$OnClickListenerC2235f);
        imageView2.setOnClickListener(view$OnClickListenerC2235f);
        imageView4.setOnClickListener(view$OnClickListenerC2235f);
        searchAutoComplete.setOnClickListener(view$OnClickListenerC2235f);
        searchAutoComplete.addTextChangedListener(this.f9840p0);
        searchAutoComplete.setOnEditorActionListener(c2237h);
        searchAutoComplete.setOnItemClickListener(c2238i);
        searchAutoComplete.setOnItemSelectedListener(c2239j);
        searchAutoComplete.setOnKeyListener(this.f9835l0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC2233d());
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(R.styleable.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f9810J = obtainStyledAttributes.getText(R.styleable.SearchView_defaultQueryHint);
        this.f9820T = obtainStyledAttributes.getText(R.styleable.SearchView_queryHint);
        int i2 = obtainStyledAttributes.getInt(R.styleable.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = obtainStyledAttributes.getInt(R.styleable.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(obtainStyledAttributes.getBoolean(R.styleable.SearchView_android_focusable, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f9808H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f9809I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f9848x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC2234e());
        }
        m64200X(this.f9816P);
        m64204T();
    }

    private void setQuery(CharSequence charSequence) {
        this.f9839p.setText(charSequence);
        this.f9839p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }
}
