package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: i */
    public static final int[] f9620i = {16843505};

    /* renamed from: a */
    public final C13159q5 f9621a;

    /* renamed from: b */
    public final Context f9622b;

    /* renamed from: c */
    public ForwardingListener f9623c;

    /* renamed from: d */
    public SpinnerAdapter f9624d;

    /* renamed from: e */
    public final boolean f9625e;

    /* renamed from: f */
    public InterfaceC2195j f9626f;

    /* renamed from: g */
    public int f9627g;

    /* renamed from: h */
    public final Rect f9628h;

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    public class C2182a extends ForwardingListener {

        /* renamed from: j */
        public final /* synthetic */ C2189h f9629j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2182a(View view, C2189h c2189h) {
            super(view);
            this.f9629j = c2189h;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return this.f9629j;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m64333b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2183b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2183b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m64333b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C2184c.m64332a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    public static final class C2184c {
        @DoNotInline
        /* renamed from: a */
        public static void m64332a(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static final class C2185d {
        @DoNotInline
        /* renamed from: a */
        public static int m64331a(@NonNull View view) {
            return view.getTextAlignment();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m64330b(@NonNull View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64329c(@NonNull View view, int i) {
            view.setTextAlignment(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64328d(@NonNull View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    public static final class C2186e {
        @DoNotInline
        /* renamed from: a */
        public static void m64327a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (!ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2187f implements InterfaceC2195j, DialogInterface.OnClickListener {

        /* renamed from: a */
        public AlertDialog f9632a;

        /* renamed from: b */
        public ListAdapter f9633b;

        /* renamed from: c */
        public CharSequence f9634c;

        public DialogInterface$OnClickListenerC2187f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: a */
        public void mo64320a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: b */
        public void mo64319b(int i, int i2) {
            if (this.f9633b == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f9634c;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog create = builder.setSingleChoiceItems(this.f9633b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f9632a = create;
            ListView listView = create.getListView();
            C2185d.m64328d(listView, i);
            C2185d.m64329c(listView, i2);
            this.f9632a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: c */
        public CharSequence mo64318c() {
            return this.f9634c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: d */
        public void mo64317d(CharSequence charSequence) {
            this.f9634c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void dismiss() {
            AlertDialog alertDialog = this.f9632a;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f9632a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public boolean isShowing() {
            AlertDialog alertDialog = this.f9632a;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f9633b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void setAdapter(ListAdapter listAdapter) {
            this.f9633b = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void setHorizontalOffset(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void setVerticalOffset(int i) {
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    /* loaded from: classes.dex */
    public static class C2188g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f9636a;

        /* renamed from: b */
        public ListAdapter f9637b;

        public C2188g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f9636a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f9637b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && AbstractC1220R5.m66504a(spinnerAdapter)) {
                    C2186e.m64327a(AbstractC1289S5.m66369a(spinnerAdapter), theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f9637b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f9637b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9636a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    /* loaded from: classes.dex */
    public class C2189h extends ListPopupWindow implements InterfaceC2195j {

        /* renamed from: J */
        public CharSequence f9638J;

        /* renamed from: K */
        public ListAdapter f9639K;

        /* renamed from: L */
        public final Rect f9640L;

        /* renamed from: M */
        public int f9641M;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        /* loaded from: classes.dex */
        public class C2190a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f9643a;

            public C2190a(AppCompatSpinner appCompatSpinner) {
                this.f9643a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C2189h c2189h = C2189h.this;
                    AppCompatSpinner.this.performItemClick(view, i, c2189h.f9639K.getItemId(i));
                }
                C2189h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC2191b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC2191b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C2189h c2189h = C2189h.this;
                if (!c2189h.m64323n(AppCompatSpinner.this)) {
                    C2189h.this.dismiss();
                    return;
                }
                C2189h.this.m64325l();
                C2189h.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        /* loaded from: classes.dex */
        public class C2192c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f9646a;

            public C2192c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f9646a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f9646a);
                }
            }
        }

        public C2189h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f9640L = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new C2190a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: a */
        public void mo64320a(int i) {
            this.f9641M = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: b */
        public void mo64319b(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m64325l();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            C2185d.m64328d(listView, i);
            C2185d.m64329c(listView, i2);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC2191b viewTreeObserver$OnGlobalLayoutListenerC2191b = new ViewTreeObserver$OnGlobalLayoutListenerC2191b();
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC2191b);
                setOnDismissListener(new C2192c(viewTreeObserver$OnGlobalLayoutListenerC2191b));
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: c */
        public CharSequence mo64318c() {
            return this.f9638J;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        /* renamed from: d */
        public void mo64317d(CharSequence charSequence) {
            this.f9638J = charSequence;
        }

        /* renamed from: l */
        public void m64325l() {
            int i;
            int m64324m;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f9628h);
                if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
                    i = AppCompatSpinner.this.f9628h.right;
                } else {
                    i = -AppCompatSpinner.this.f9628h.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f9628h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f9627g;
            if (i2 == -2) {
                int m64334a = appCompatSpinner.m64334a((SpinnerAdapter) this.f9639K, getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f9628h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m64334a > i4) {
                    m64334a = i4;
                }
                setContentWidth(Math.max(m64334a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i2);
            }
            if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
                m64324m = i + (((width - paddingRight) - getWidth()) - m64324m());
            } else {
                m64324m = i + paddingLeft + m64324m();
            }
            setHorizontalOffset(m64324m);
        }

        /* renamed from: m */
        public int m64324m() {
            return this.f9641M;
        }

        /* renamed from: n */
        public boolean m64323n(View view) {
            if (ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.f9640L)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC2195j
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f9639K = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    /* loaded from: classes.dex */
    public static class C2193i extends View.BaseSavedState {
        public static final Parcelable.Creator<C2193i> CREATOR = new C2194a();

        /* renamed from: a */
        public boolean f9648a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i$a */
        /* loaded from: classes.dex */
        public class C2194a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2193i createFromParcel(Parcel parcel) {
                return new C2193i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2193i[] newArray(int i) {
                return new C2193i[i];
            }
        }

        public C2193i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f9648a ? (byte) 1 : (byte) 0);
        }

        public C2193i(Parcel parcel) {
            super(parcel);
            this.f9648a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$j */
    /* loaded from: classes.dex */
    public interface InterfaceC2195j {
        /* renamed from: a */
        void mo64320a(int i);

        /* renamed from: b */
        void mo64319b(int i, int i2);

        /* renamed from: c */
        CharSequence mo64318c();

        /* renamed from: d */
        void mo64317d(CharSequence charSequence);

        void dismiss();

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i);

        void setVerticalOffset(int i);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public int m64334a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f9628h);
            Rect rect = this.f9628h;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    public void m64333b() {
        this.f9626f.mo64319b(C2185d.m64330b(this), C2185d.m64331a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            c13159q5.m23544b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            return interfaceC2195j.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            return interfaceC2195j.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f9626f != null) {
            return this.f9627g;
        }
        return super.getDropDownWidth();
    }

    @VisibleForTesting
    public final InterfaceC2195j getInternalPopup() {
        return this.f9626f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            return interfaceC2195j.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9622b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            return interfaceC2195j.mo64318c();
        }
        return super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            return c13159q5.m23543c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            return c13159q5.m23542d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null && interfaceC2195j.isShowing()) {
            this.f9626f.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9626f != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m64334a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2193i c2193i = (C2193i) parcelable;
        super.onRestoreInstanceState(c2193i.getSuperState());
        if (c2193i.f9648a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC2183b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C2193i c2193i = new C2193i(super.onSaveInstanceState());
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null && interfaceC2195j.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        c2193i.f9648a = z;
        return c2193i;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f9623c;
        if (forwardingListener != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            if (!interfaceC2195j.isShowing()) {
                m64333b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            c13159q5.m23540f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            c13159q5.m23539g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            interfaceC2195j.mo64320a(i);
            this.f9626f.setHorizontalOffset(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            interfaceC2195j.setVerticalOffset(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f9626f != null) {
            this.f9627g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            interfaceC2195j.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(AppCompatResources.getDrawable(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC2195j interfaceC2195j = this.f9626f;
        if (interfaceC2195j != null) {
            interfaceC2195j.mo64317d(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            c13159q5.m23537i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C13159q5 c13159q5 = this.f9621a;
        if (c13159q5 != null) {
            c13159q5.m23536j(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9625e) {
            this.f9624d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f9626f != null) {
            Context context = this.f9622b;
            if (context == null) {
                context = getContext();
            }
            this.f9626f.setAdapter(new C2188g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r10 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f9628h = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r5, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r6, r7, r0, r8, r1)
            q5 r2 = new q5
            r2.<init>(r5)
            r5.f9621a = r2
            if (r10 == 0) goto L29
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.f9622b = r2
            goto L3b
        L29:
            int r10 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r10 = r0.getResourceId(r10, r1)
            if (r10 == 0) goto L39
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.f9622b = r2
            goto L3b
        L39:
            r5.f9622b = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L67
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.f9620i     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            boolean r3 = r10.hasValue(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r3 == 0) goto L55
            int r9 = r10.getInt(r1, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            goto L55
        L50:
            r6 = move-exception
            r2 = r10
            goto L5e
        L53:
            goto L64
        L55:
            r10.recycle()
            goto L67
        L59:
            r6 = move-exception
            goto L5e
        L5b:
            r10 = r2
            goto L64
        L5e:
            if (r2 == 0) goto L63
            r2.recycle()
        L63:
            throw r6
        L64:
            if (r10 == 0) goto L67
            goto L55
        L67:
            r10 = 1
            if (r9 == 0) goto La4
            if (r9 == r10) goto L6d
            goto Lb4
        L6d:
            androidx.appcompat.widget.AppCompatSpinner$h r9 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r5.f9622b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f9622b
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r5.f9627g = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r9.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r9.mo64317d(r3)
            r1.recycle()
            r5.f9626f = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f9623c = r1
            goto Lb4
        La4:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.f9626f = r9
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r9.mo64317d(r1)
        Lb4:
            int r9 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.getTextArray(r9)
            if (r9 == 0) goto Lcc
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter(r1)
        Lcc:
            r0.recycle()
            r5.f9625e = r10
            android.widget.SpinnerAdapter r6 = r5.f9624d
            if (r6 == 0) goto Lda
            r5.setAdapter(r6)
            r5.f9624d = r2
        Lda:
            q5 r6 = r5.f9621a
            r6.m23541e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
