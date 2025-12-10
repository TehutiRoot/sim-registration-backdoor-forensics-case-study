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
    public static final int[] f9708i = {16843505};

    /* renamed from: a */
    public final C13161q5 f9709a;

    /* renamed from: b */
    public final Context f9710b;

    /* renamed from: c */
    public ForwardingListener f9711c;

    /* renamed from: d */
    public SpinnerAdapter f9712d;

    /* renamed from: e */
    public final boolean f9713e;

    /* renamed from: f */
    public InterfaceC2177j f9714f;

    /* renamed from: g */
    public int f9715g;

    /* renamed from: h */
    public final Rect f9716h;

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    public class C2164a extends ForwardingListener {

        /* renamed from: j */
        public final /* synthetic */ C2171h f9717j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2164a(View view, C2171h c2171h) {
            super(view);
            this.f9717j = c2171h;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public ShowableListMenu getPopup() {
            return this.f9717j;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public boolean onForwardingStarted() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m64284b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC2165b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC2165b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.m64284b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C2166c.m64283a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    /* loaded from: classes.dex */
    public static final class C2166c {
        @DoNotInline
        /* renamed from: a */
        public static void m64283a(@NonNull ViewTreeObserver viewTreeObserver, @Nullable ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    /* loaded from: classes.dex */
    public static final class C2167d {
        @DoNotInline
        /* renamed from: a */
        public static int m64282a(@NonNull View view) {
            return view.getTextAlignment();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m64281b(@NonNull View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m64280c(@NonNull View view, int i) {
            view.setTextAlignment(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m64279d(@NonNull View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    /* loaded from: classes.dex */
    public static final class C2168e {
        @DoNotInline
        /* renamed from: a */
        public static void m64278a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
            if (!ObjectsCompat.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2169f implements InterfaceC2177j, DialogInterface.OnClickListener {

        /* renamed from: a */
        public AlertDialog f9720a;

        /* renamed from: b */
        public ListAdapter f9721b;

        /* renamed from: c */
        public CharSequence f9722c;

        public DialogInterface$OnClickListenerC2169f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: a */
        public void mo64271a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: b */
        public void mo64270b(int i, int i2) {
            if (this.f9721b == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f9722c;
            if (charSequence != null) {
                builder.setTitle(charSequence);
            }
            AlertDialog create = builder.setSingleChoiceItems(this.f9721b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f9720a = create;
            ListView listView = create.getListView();
            C2167d.m64279d(listView, i);
            C2167d.m64280c(listView, i2);
            this.f9720a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: c */
        public CharSequence mo64269c() {
            return this.f9722c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: d */
        public void mo64268d(CharSequence charSequence) {
            this.f9722c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void dismiss() {
            AlertDialog alertDialog = this.f9720a;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.f9720a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public boolean isShowing() {
            AlertDialog alertDialog = this.f9720a;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f9721b.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void setAdapter(ListAdapter listAdapter) {
            this.f9721b = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void setBackgroundDrawable(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void setHorizontalOffset(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void setVerticalOffset(int i) {
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    /* loaded from: classes.dex */
    public static class C2170g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        public SpinnerAdapter f9724a;

        /* renamed from: b */
        public ListAdapter f9725b;

        public C2170g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f9724a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f9725b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && AbstractC1198R5.m66699a(spinnerAdapter)) {
                    C2168e.m64278a(AbstractC1269S5.m66549a(spinnerAdapter), theme);
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
            ListAdapter listAdapter = this.f9725b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f9724a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f9724a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f9724a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f9724a;
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
            SpinnerAdapter spinnerAdapter = this.f9724a;
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
            ListAdapter listAdapter = this.f9725b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9724a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9724a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    /* loaded from: classes.dex */
    public class C2171h extends ListPopupWindow implements InterfaceC2177j {

        /* renamed from: J */
        public CharSequence f9726J;

        /* renamed from: K */
        public ListAdapter f9727K;

        /* renamed from: L */
        public final Rect f9728L;

        /* renamed from: M */
        public int f9729M;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        /* loaded from: classes.dex */
        public class C2172a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AppCompatSpinner f9731a;

            public C2172a(AppCompatSpinner appCompatSpinner) {
                this.f9731a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C2171h c2171h = C2171h.this;
                    AppCompatSpinner.this.performItemClick(view, i, c2171h.f9727K.getItemId(i));
                }
                C2171h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        /* loaded from: classes.dex */
        public class ViewTreeObserver$OnGlobalLayoutListenerC2173b implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC2173b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C2171h c2171h = C2171h.this;
                if (!c2171h.m64274n(AppCompatSpinner.this)) {
                    C2171h.this.dismiss();
                    return;
                }
                C2171h.this.m64276l();
                C2171h.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        /* loaded from: classes.dex */
        public class C2174c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f9734a;

            public C2174c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f9734a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f9734a);
                }
            }
        }

        public C2171h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f9728L = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new C2172a(AppCompatSpinner.this));
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: a */
        public void mo64271a(int i) {
            this.f9729M = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: b */
        public void mo64270b(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            m64276l();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            C2167d.m64279d(listView, i);
            C2167d.m64280c(listView, i2);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC2173b viewTreeObserver$OnGlobalLayoutListenerC2173b = new ViewTreeObserver$OnGlobalLayoutListenerC2173b();
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC2173b);
                setOnDismissListener(new C2174c(viewTreeObserver$OnGlobalLayoutListenerC2173b));
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: c */
        public CharSequence mo64269c() {
            return this.f9726J;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        /* renamed from: d */
        public void mo64268d(CharSequence charSequence) {
            this.f9726J = charSequence;
        }

        /* renamed from: l */
        public void m64276l() {
            int i;
            int m64275m;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f9716h);
                if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
                    i = AppCompatSpinner.this.f9716h.right;
                } else {
                    i = -AppCompatSpinner.this.f9716h.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f9716h;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i2 = appCompatSpinner.f9715g;
            if (i2 == -2) {
                int m64285a = appCompatSpinner.m64285a((SpinnerAdapter) this.f9727K, getBackground());
                int i3 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f9716h;
                int i4 = (i3 - rect2.left) - rect2.right;
                if (m64285a > i4) {
                    m64285a = i4;
                }
                setContentWidth(Math.max(m64285a, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i2);
            }
            if (ViewUtils.isLayoutRtl(AppCompatSpinner.this)) {
                m64275m = i + (((width - paddingRight) - getWidth()) - m64275m());
            } else {
                m64275m = i + paddingLeft + m64275m();
            }
            setHorizontalOffset(m64275m);
        }

        /* renamed from: m */
        public int m64275m() {
            return this.f9729M;
        }

        /* renamed from: n */
        public boolean m64274n(View view) {
            if (ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.f9728L)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.InterfaceC2177j
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f9727K = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    /* loaded from: classes.dex */
    public static class C2175i extends View.BaseSavedState {
        public static final Parcelable.Creator<C2175i> CREATOR = new C2176a();

        /* renamed from: a */
        public boolean f9736a;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i$a */
        /* loaded from: classes.dex */
        public class C2176a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C2175i createFromParcel(Parcel parcel) {
                return new C2175i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C2175i[] newArray(int i) {
                return new C2175i[i];
            }
        }

        public C2175i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f9736a ? (byte) 1 : (byte) 0);
        }

        public C2175i(Parcel parcel) {
            super(parcel);
            this.f9736a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$j */
    /* loaded from: classes.dex */
    public interface InterfaceC2177j {
        /* renamed from: a */
        void mo64271a(int i);

        /* renamed from: b */
        void mo64270b(int i, int i2);

        /* renamed from: c */
        CharSequence mo64269c();

        /* renamed from: d */
        void mo64268d(CharSequence charSequence);

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
    public int m64285a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
            drawable.getPadding(this.f9716h);
            Rect rect = this.f9716h;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    public void m64284b() {
        this.f9714f.mo64270b(C2167d.m64281b(this), C2167d.m64282a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            c13161q5.m23701b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            return interfaceC2177j.getHorizontalOffset();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            return interfaceC2177j.getVerticalOffset();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f9714f != null) {
            return this.f9715g;
        }
        return super.getDropDownWidth();
    }

    @VisibleForTesting
    public final InterfaceC2177j getInternalPopup() {
        return this.f9714f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            return interfaceC2177j.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9710b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            return interfaceC2177j.mo64269c();
        }
        return super.getPrompt();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            return c13161q5.m23700c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            return c13161q5.m23699d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null && interfaceC2177j.isShowing()) {
            this.f9714f.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9714f != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m64285a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C2175i c2175i = (C2175i) parcelable;
        super.onRestoreInstanceState(c2175i.getSuperState());
        if (c2175i.f9736a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC2165b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C2175i c2175i = new C2175i(super.onSaveInstanceState());
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null && interfaceC2177j.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        c2175i.f9736a = z;
        return c2175i;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.f9711c;
        if (forwardingListener != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            if (!interfaceC2177j.isShowing()) {
                m64284b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            c13161q5.m23697f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            c13161q5.m23696g(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            interfaceC2177j.mo64271a(i);
            this.f9714f.setHorizontalOffset(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            interfaceC2177j.setVerticalOffset(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f9714f != null) {
            this.f9715g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            interfaceC2177j.setBackgroundDrawable(drawable);
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
        InterfaceC2177j interfaceC2177j = this.f9714f;
        if (interfaceC2177j != null) {
            interfaceC2177j.mo64268d(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            c13161q5.m23694i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C13161q5 c13161q5 = this.f9709a;
        if (c13161q5 != null) {
            c13161q5.m23693j(mode);
        }
    }

    public AppCompatSpinner(@NonNull Context context, int i) {
        this(context, null, R.attr.spinnerStyle, i);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9713e) {
            this.f9712d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f9714f != null) {
            Context context = this.f9710b;
            if (context == null) {
                context = getContext();
            }
            this.f9714f.setAdapter(new C2170g(spinnerAdapter, context.getTheme()));
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
            r5.f9716h = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r5, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r6, r7, r0, r8, r1)
            q5 r2 = new q5
            r2.<init>(r5)
            r5.f9709a = r2
            if (r10 == 0) goto L29
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.f9710b = r2
            goto L3b
        L29:
            int r10 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r10 = r0.getResourceId(r10, r1)
            if (r10 == 0) goto L39
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r6, r10)
            r5.f9710b = r2
            goto L3b
        L39:
            r5.f9710b = r6
        L3b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L67
            int[] r10 = androidx.appcompat.widget.AppCompatSpinner.f9708i     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
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
            android.content.Context r3 = r5.f9710b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f9710b
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r7, r4, r8, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r5.f9715g = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r9.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r9.mo64268d(r3)
            r1.recycle()
            r5.f9714f = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.f9711c = r1
            goto Lb4
        La4:
            androidx.appcompat.widget.AppCompatSpinner$f r9 = new androidx.appcompat.widget.AppCompatSpinner$f
            r9.<init>()
            r5.f9714f = r9
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r9.mo64268d(r1)
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
            r5.f9713e = r10
            android.widget.SpinnerAdapter r6 = r5.f9712d
            if (r6 == 0) goto Lda
            r5.setAdapter(r6)
            r5.f9712d = r2
        Lda:
            q5 r6 = r5.f9709a
            r6.m23698e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}