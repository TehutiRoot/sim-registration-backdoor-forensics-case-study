package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f8799A;

    /* renamed from: C */
    public Drawable f8801C;

    /* renamed from: D */
    public ImageView f8802D;

    /* renamed from: E */
    public TextView f8803E;

    /* renamed from: F */
    public TextView f8804F;

    /* renamed from: G */
    public View f8805G;

    /* renamed from: H */
    public ListAdapter f8806H;

    /* renamed from: J */
    public int f8808J;

    /* renamed from: K */
    public int f8809K;

    /* renamed from: L */
    public int f8810L;

    /* renamed from: M */
    public int f8811M;

    /* renamed from: N */
    public int f8812N;

    /* renamed from: O */
    public int f8813O;

    /* renamed from: P */
    public boolean f8814P;

    /* renamed from: R */
    public Handler f8816R;

    /* renamed from: a */
    public final Context f8818a;

    /* renamed from: b */
    public final AppCompatDialog f8819b;

    /* renamed from: c */
    public final Window f8820c;

    /* renamed from: d */
    public final int f8821d;

    /* renamed from: e */
    public CharSequence f8822e;

    /* renamed from: f */
    public CharSequence f8823f;

    /* renamed from: g */
    public ListView f8824g;

    /* renamed from: h */
    public View f8825h;

    /* renamed from: i */
    public int f8826i;

    /* renamed from: j */
    public int f8827j;

    /* renamed from: k */
    public int f8828k;

    /* renamed from: l */
    public int f8829l;

    /* renamed from: m */
    public int f8830m;

    /* renamed from: o */
    public Button f8832o;

    /* renamed from: p */
    public CharSequence f8833p;

    /* renamed from: q */
    public Message f8834q;

    /* renamed from: r */
    public Drawable f8835r;

    /* renamed from: s */
    public Button f8836s;

    /* renamed from: t */
    public CharSequence f8837t;

    /* renamed from: u */
    public Message f8838u;

    /* renamed from: v */
    public Drawable f8839v;

    /* renamed from: w */
    public Button f8840w;

    /* renamed from: x */
    public CharSequence f8841x;

    /* renamed from: y */
    public Message f8842y;

    /* renamed from: z */
    public Drawable f8843z;

    /* renamed from: n */
    public boolean f8831n = false;

    /* renamed from: B */
    public int f8800B = 0;

    /* renamed from: I */
    public int f8807I = -1;

    /* renamed from: Q */
    public int f8815Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f8817S = new View$OnClickListenerC2073a();

    /* loaded from: classes.dex */
    public static class AlertParams {
        public ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final Context mContext;
        public Cursor mCursor;
        public View mCustomTitleView;
        public boolean mForceInverseBackground;
        public Drawable mIcon;
        public final LayoutInflater mInflater;
        public String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public CharSequence[] mItems;
        public String mLabelColumn;
        public CharSequence mMessage;
        public Drawable mNegativeButtonIcon;
        public DialogInterface.OnClickListener mNegativeButtonListener;
        public CharSequence mNegativeButtonText;
        public Drawable mNeutralButtonIcon;
        public DialogInterface.OnClickListener mNeutralButtonListener;
        public CharSequence mNeutralButtonText;
        public DialogInterface.OnCancelListener mOnCancelListener;
        public DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public DialogInterface.OnClickListener mOnClickListener;
        public DialogInterface.OnDismissListener mOnDismissListener;
        public AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public DialogInterface.OnKeyListener mOnKeyListener;
        public OnPrepareListViewListener mOnPrepareListViewListener;
        public Drawable mPositiveButtonIcon;
        public DialogInterface.OnClickListener mPositiveButtonListener;
        public CharSequence mPositiveButtonText;
        public CharSequence mTitle;
        public View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        /* loaded from: classes.dex */
        public interface OnPrepareListViewListener {
            void onPrepareListView(ListView listView);
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$a */
        /* loaded from: classes.dex */
        public class C2069a extends ArrayAdapter {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f8844a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2069a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f8844a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = AlertParams.this.mCheckedItems;
                if (zArr != null && zArr[i]) {
                    this.f8844a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$b */
        /* loaded from: classes.dex */
        public class C2070b extends CursorAdapter {

            /* renamed from: a */
            public final int f8846a;

            /* renamed from: b */
            public final int f8847b;

            /* renamed from: c */
            public final /* synthetic */ RecycleListView f8848c;

            /* renamed from: d */
            public final /* synthetic */ AlertController f8849d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2070b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f8848c = recycleListView;
                this.f8849d = alertController;
                Cursor cursor2 = getCursor();
                this.f8846a = cursor2.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                this.f8847b = cursor2.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f8846a));
                RecycleListView recycleListView = this.f8848c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f8847b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return AlertParams.this.mInflater.inflate(this.f8849d.f8811M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$c */
        /* loaded from: classes.dex */
        public class C2071c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f8851a;

            public C2071c(AlertController alertController) {
                this.f8851a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AlertParams.this.mOnClickListener.onClick(this.f8851a.f8819b, i);
                if (!AlertParams.this.mIsSingleChoice) {
                    this.f8851a.f8819b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$d */
        /* loaded from: classes.dex */
        public class C2072d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f8853a;

            /* renamed from: b */
            public final /* synthetic */ AlertController f8854b;

            public C2072d(RecycleListView recycleListView, AlertController alertController) {
                this.f8853a = recycleListView;
                this.f8854b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = AlertParams.this.mCheckedItems;
                if (zArr != null) {
                    zArr[i] = this.f8853a.isItemChecked(i);
                }
                AlertParams.this.mOnCheckboxClickListener.onClick(this.f8854b.f8819b, i, this.f8853a.isItemChecked(i));
            }
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public final void m64707a(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.mInflater.inflate(alertController.f8810L, (ViewGroup) null);
            if (this.mIsMultiChoice) {
                if (this.mCursor == null) {
                    listAdapter = new C2069a(this.mContext, alertController.f8811M, 16908308, this.mItems, recycleListView);
                } else {
                    listAdapter = new C2070b(this.mContext, this.mCursor, false, recycleListView, alertController);
                }
            } else {
                if (this.mIsSingleChoice) {
                    i = alertController.f8812N;
                } else {
                    i = alertController.f8813O;
                }
                int i2 = i;
                if (this.mCursor != null) {
                    listAdapter = new SimpleCursorAdapter(this.mContext, i2, this.mCursor, new String[]{this.mLabelColumn}, new int[]{16908308});
                } else {
                    listAdapter = this.mAdapter;
                    if (listAdapter == null) {
                        listAdapter = new C2079g(this.mContext, i2, 16908308, this.mItems);
                    }
                }
            }
            OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(recycleListView);
            }
            alertController.f8806H = listAdapter;
            alertController.f8807I = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                recycleListView.setOnItemClickListener(new C2071c(alertController));
            } else if (this.mOnCheckboxClickListener != null) {
                recycleListView.setOnItemClickListener(new C2072d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.mIsSingleChoice) {
                recycleListView.setChoiceMode(1);
            } else if (this.mIsMultiChoice) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f8824g = recycleListView;
        }

        public void apply(AlertController alertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.m64721m(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.m64716r(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.m64719o(drawable);
                }
                int i = this.mIconId;
                if (i != 0) {
                    alertController.m64720n(i);
                }
                int i2 = this.mIconAttrId;
                if (i2 != 0) {
                    alertController.m64720n(alertController.m64730d(i2));
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.m64718p(charSequence2);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.m64722l(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.m64722l(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.m64722l(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                m64707a(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController.m64713u(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                } else {
                    alertController.m64714t(view2);
                    return;
                }
            }
            int i3 = this.mViewLayoutResId;
            if (i3 != 0) {
                alertController.m64715s(i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f8856a;

        /* renamed from: b */
        public final int f8857b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            int i;
            int i2;
            if (!z2 || !z) {
                int paddingLeft = getPaddingLeft();
                if (z) {
                    i = getPaddingTop();
                } else {
                    i = this.f8856a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f8857b;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f8857b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f8856a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2073a implements View.OnClickListener {
        public View$OnClickListenerC2073a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f8832o && (message4 = alertController.f8834q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f8836s && (message3 = alertController.f8838u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f8840w && (message2 = alertController.f8842y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f8816R.obtainMessage(1, alertController2.f8819b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C2074b implements NestedScrollView.OnScrollChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f8859a;

        /* renamed from: b */
        public final /* synthetic */ View f8860b;

        public C2074b(View view, View view2) {
            this.f8859a = view;
            this.f8860b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m64727g(nestedScrollView, this.f8859a, this.f8860b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC2075c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f8862a;

        /* renamed from: b */
        public final /* synthetic */ View f8863b;

        public RunnableC2075c(View view, View view2) {
            this.f8862a = view;
            this.f8863b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m64727g(AlertController.this.f8799A, this.f8862a, this.f8863b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C2076d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f8865a;

        /* renamed from: b */
        public final /* synthetic */ View f8866b;

        public C2076d(View view, View view2) {
            this.f8865a = view;
            this.f8866b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m64727g(absListView, this.f8865a, this.f8866b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC2077e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f8868a;

        /* renamed from: b */
        public final /* synthetic */ View f8869b;

        public RunnableC2077e(View view, View view2) {
            this.f8868a = view;
            this.f8869b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m64727g(AlertController.this.f8824g, this.f8868a, this.f8869b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static final class HandlerC2078f extends Handler {

        /* renamed from: a */
        public WeakReference f8871a;

        public HandlerC2078f(DialogInterface dialogInterface) {
            this.f8871a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f8871a.get(), message.what);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    public static class C2079g extends ArrayAdapter {
        public C2079g(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f8818a = context;
        this.f8819b = appCompatDialog;
        this.f8820c = window;
        this.f8816R = new HandlerC2078f(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.f8808J = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.f8809K = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f8810L = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.f8811M = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f8812N = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f8813O = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.f8814P = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f8821d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    /* renamed from: A */
    public static boolean m64734A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64733a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m64733a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m64727g(View view, View view2, View view3) {
        int i;
        int i2 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    /* renamed from: b */
    public final void m64732b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button m64731c(int i) {
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    return null;
                }
                return this.f8832o;
            }
            return this.f8836s;
        }
        return this.f8840w;
    }

    /* renamed from: d */
    public int m64730d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f8818a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m64729e() {
        return this.f8824g;
    }

    /* renamed from: f */
    public void m64728f() {
        this.f8819b.setContentView(m64723k());
        m64708z();
    }

    /* renamed from: h */
    public boolean m64726h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8799A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m64725i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8799A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final ViewGroup m64724j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    public final int m64723k() {
        int i = this.f8809K;
        if (i == 0) {
            return this.f8808J;
        }
        if (this.f8815Q == 1) {
            return i;
        }
        return this.f8808J;
    }

    /* renamed from: l */
    public void m64722l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f8816R.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.f8833p = charSequence;
                    this.f8834q = message;
                    this.f8835r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8837t = charSequence;
            this.f8838u = message;
            this.f8839v = drawable;
            return;
        }
        this.f8841x = charSequence;
        this.f8842y = message;
        this.f8843z = drawable;
    }

    /* renamed from: m */
    public void m64721m(View view) {
        this.f8805G = view;
    }

    /* renamed from: n */
    public void m64720n(int i) {
        this.f8801C = null;
        this.f8800B = i;
        ImageView imageView = this.f8802D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f8802D.setImageResource(this.f8800B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m64719o(Drawable drawable) {
        this.f8801C = drawable;
        this.f8800B = 0;
        ImageView imageView = this.f8802D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f8802D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: p */
    public void m64718p(CharSequence charSequence) {
        this.f8823f = charSequence;
        TextView textView = this.f8804F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public final void m64717q(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f8820c.findViewById(R.id.scrollIndicatorUp);
        View findViewById2 = this.f8820c.findViewById(R.id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            ViewCompat.setScrollIndicators(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f8823f != null) {
                this.f8799A.setOnScrollChangeListener(new C2074b(findViewById, findViewById2));
                this.f8799A.post(new RunnableC2075c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f8824g;
            if (listView != null) {
                listView.setOnScrollListener(new C2076d(findViewById, findViewById2));
                this.f8824g.post(new RunnableC2077e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: r */
    public void m64716r(CharSequence charSequence) {
        this.f8822e = charSequence;
        TextView textView = this.f8803E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m64715s(int i) {
        this.f8825h = null;
        this.f8826i = i;
        this.f8831n = false;
    }

    /* renamed from: t */
    public void m64714t(View view) {
        this.f8825h = view;
        this.f8826i = 0;
        this.f8831n = false;
    }

    /* renamed from: u */
    public void m64713u(View view, int i, int i2, int i3, int i4) {
        this.f8825h = view;
        this.f8826i = 0;
        this.f8831n = true;
        this.f8827j = i;
        this.f8828k = i2;
        this.f8829l = i3;
        this.f8830m = i4;
    }

    /* renamed from: v */
    public final void m64712v(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f8832o = button;
        button.setOnClickListener(this.f8817S);
        if (TextUtils.isEmpty(this.f8833p) && this.f8835r == null) {
            this.f8832o.setVisibility(8);
            z = false;
        } else {
            this.f8832o.setText(this.f8833p);
            Drawable drawable = this.f8835r;
            if (drawable != null) {
                int i = this.f8821d;
                drawable.setBounds(0, 0, i, i);
                this.f8832o.setCompoundDrawables(this.f8835r, null, null, null);
            }
            this.f8832o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f8836s = button2;
        button2.setOnClickListener(this.f8817S);
        if (TextUtils.isEmpty(this.f8837t) && this.f8839v == null) {
            this.f8836s.setVisibility(8);
        } else {
            this.f8836s.setText(this.f8837t);
            Drawable drawable2 = this.f8839v;
            if (drawable2 != null) {
                int i2 = this.f8821d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f8836s.setCompoundDrawables(this.f8839v, null, null, null);
            }
            this.f8836s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f8840w = button3;
        button3.setOnClickListener(this.f8817S);
        if (TextUtils.isEmpty(this.f8841x) && this.f8843z == null) {
            this.f8840w.setVisibility(8);
        } else {
            this.f8840w.setText(this.f8841x);
            Drawable drawable3 = this.f8843z;
            if (drawable3 != null) {
                int i3 = this.f8821d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f8840w.setCompoundDrawables(this.f8843z, null, null, null);
            }
            this.f8840w.setVisibility(0);
            z |= true;
        }
        if (m64734A(this.f8818a)) {
            if (z) {
                m64732b(this.f8832o);
            } else if (z) {
                m64732b(this.f8836s);
            } else if (z) {
                m64732b(this.f8840w);
            }
        }
        if (!z) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    public final void m64711w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f8820c.findViewById(R.id.scrollView);
        this.f8799A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f8799A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f8804F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f8823f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f8799A.removeView(this.f8804F);
        if (this.f8824g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f8799A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f8799A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f8824g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    public final void m64710x(ViewGroup viewGroup) {
        View view = this.f8825h;
        boolean z = false;
        if (view == null) {
            if (this.f8826i != 0) {
                view = LayoutInflater.from(this.f8818a).inflate(this.f8826i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m64733a(view)) {
            this.f8820c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f8820c.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f8831n) {
                frameLayout.setPadding(this.f8827j, this.f8828k, this.f8829l, this.f8830m);
            }
            if (this.f8824g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    public final void m64709y(ViewGroup viewGroup) {
        if (this.f8805G != null) {
            viewGroup.addView(this.f8805G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f8820c.findViewById(R.id.title_template).setVisibility(8);
            return;
        }
        this.f8802D = (ImageView) this.f8820c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f8822e)) && this.f8814P) {
            TextView textView = (TextView) this.f8820c.findViewById(R.id.alertTitle);
            this.f8803E = textView;
            textView.setText(this.f8822e);
            int i = this.f8800B;
            if (i != 0) {
                this.f8802D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f8801C;
            if (drawable != null) {
                this.f8802D.setImageDrawable(drawable);
                return;
            }
            this.f8803E.setPadding(this.f8802D.getPaddingLeft(), this.f8802D.getPaddingTop(), this.f8802D.getPaddingRight(), this.f8802D.getPaddingBottom());
            this.f8802D.setVisibility(8);
            return;
        }
        this.f8820c.findViewById(R.id.title_template).setVisibility(8);
        this.f8802D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final void m64708z() {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f8820c.findViewById(R.id.parentPanel);
        View findViewById5 = findViewById4.findViewById(R.id.topPanel);
        View findViewById6 = findViewById4.findViewById(R.id.contentPanel);
        View findViewById7 = findViewById4.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(R.id.customPanel);
        m64710x(viewGroup);
        View findViewById8 = viewGroup.findViewById(R.id.topPanel);
        View findViewById9 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById10 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m64724j = m64724j(findViewById8, findViewById5);
        ViewGroup m64724j2 = m64724j(findViewById9, findViewById6);
        ViewGroup m64724j3 = m64724j(findViewById10, findViewById7);
        m64711w(m64724j2);
        m64712v(m64724j3);
        m64709y(m64724j);
        int i = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (m64724j != null && m64724j.getVisibility() != 8) {
            z2 = 1;
        } else {
            z2 = 0;
        }
        if (m64724j3 != null && m64724j3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m64724j2 != null && (findViewById3 = m64724j2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f8799A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f8823f == null && this.f8824g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m64724j.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m64724j2 != null && (findViewById = m64724j2.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f8824g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view = this.f8824g;
            if (view == null) {
                view = this.f8799A;
            }
            if (view != null) {
                if (z3) {
                    i = 2;
                }
                m64717q(m64724j2, view, z2 | i, 3);
            }
        }
        ListView listView2 = this.f8824g;
        if (listView2 != null && (listAdapter = this.f8806H) != null) {
            listView2.setAdapter(listAdapter);
            int i2 = this.f8807I;
            if (i2 > -1) {
                listView2.setItemChecked(i2, true);
                listView2.setSelection(i2);
            }
        }
    }
}
