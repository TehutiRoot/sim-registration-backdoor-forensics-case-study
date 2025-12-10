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
    public NestedScrollView f8887A;

    /* renamed from: C */
    public Drawable f8889C;

    /* renamed from: D */
    public ImageView f8890D;

    /* renamed from: E */
    public TextView f8891E;

    /* renamed from: F */
    public TextView f8892F;

    /* renamed from: G */
    public View f8893G;

    /* renamed from: H */
    public ListAdapter f8894H;

    /* renamed from: J */
    public int f8896J;

    /* renamed from: K */
    public int f8897K;

    /* renamed from: L */
    public int f8898L;

    /* renamed from: M */
    public int f8899M;

    /* renamed from: N */
    public int f8900N;

    /* renamed from: O */
    public int f8901O;

    /* renamed from: P */
    public boolean f8902P;

    /* renamed from: R */
    public Handler f8904R;

    /* renamed from: a */
    public final Context f8906a;

    /* renamed from: b */
    public final AppCompatDialog f8907b;

    /* renamed from: c */
    public final Window f8908c;

    /* renamed from: d */
    public final int f8909d;

    /* renamed from: e */
    public CharSequence f8910e;

    /* renamed from: f */
    public CharSequence f8911f;

    /* renamed from: g */
    public ListView f8912g;

    /* renamed from: h */
    public View f8913h;

    /* renamed from: i */
    public int f8914i;

    /* renamed from: j */
    public int f8915j;

    /* renamed from: k */
    public int f8916k;

    /* renamed from: l */
    public int f8917l;

    /* renamed from: m */
    public int f8918m;

    /* renamed from: o */
    public Button f8920o;

    /* renamed from: p */
    public CharSequence f8921p;

    /* renamed from: q */
    public Message f8922q;

    /* renamed from: r */
    public Drawable f8923r;

    /* renamed from: s */
    public Button f8924s;

    /* renamed from: t */
    public CharSequence f8925t;

    /* renamed from: u */
    public Message f8926u;

    /* renamed from: v */
    public Drawable f8927v;

    /* renamed from: w */
    public Button f8928w;

    /* renamed from: x */
    public CharSequence f8929x;

    /* renamed from: y */
    public Message f8930y;

    /* renamed from: z */
    public Drawable f8931z;

    /* renamed from: n */
    public boolean f8919n = false;

    /* renamed from: B */
    public int f8888B = 0;

    /* renamed from: I */
    public int f8895I = -1;

    /* renamed from: Q */
    public int f8903Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f8905S = new View$OnClickListenerC2055a();

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
        public class C2051a extends ArrayAdapter {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f8932a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2051a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f8932a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = AlertParams.this.mCheckedItems;
                if (zArr != null && zArr[i]) {
                    this.f8932a.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$b */
        /* loaded from: classes.dex */
        public class C2052b extends CursorAdapter {

            /* renamed from: a */
            public final int f8934a;

            /* renamed from: b */
            public final int f8935b;

            /* renamed from: c */
            public final /* synthetic */ RecycleListView f8936c;

            /* renamed from: d */
            public final /* synthetic */ AlertController f8937d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2052b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f8936c = recycleListView;
                this.f8937d = alertController;
                Cursor cursor2 = getCursor();
                this.f8934a = cursor2.getColumnIndexOrThrow(AlertParams.this.mLabelColumn);
                this.f8935b = cursor2.getColumnIndexOrThrow(AlertParams.this.mIsCheckedColumn);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f8934a));
                RecycleListView recycleListView = this.f8936c;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f8935b) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return AlertParams.this.mInflater.inflate(this.f8937d.f8899M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$c */
        /* loaded from: classes.dex */
        public class C2053c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ AlertController f8939a;

            public C2053c(AlertController alertController) {
                this.f8939a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AlertParams.this.mOnClickListener.onClick(this.f8939a.f8907b, i);
                if (!AlertParams.this.mIsSingleChoice) {
                    this.f8939a.f8907b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$AlertParams$d */
        /* loaded from: classes.dex */
        public class C2054d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            public final /* synthetic */ RecycleListView f8941a;

            /* renamed from: b */
            public final /* synthetic */ AlertController f8942b;

            public C2054d(RecycleListView recycleListView, AlertController alertController) {
                this.f8941a = recycleListView;
                this.f8942b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                boolean[] zArr = AlertParams.this.mCheckedItems;
                if (zArr != null) {
                    zArr[i] = this.f8941a.isItemChecked(i);
                }
                AlertParams.this.mOnCheckboxClickListener.onClick(this.f8942b.f8907b, i, this.f8941a.isItemChecked(i));
            }
        }

        public AlertParams(Context context) {
            this.mContext = context;
            this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public final void m64658a(AlertController alertController) {
            int i;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.mInflater.inflate(alertController.f8898L, (ViewGroup) null);
            if (this.mIsMultiChoice) {
                if (this.mCursor == null) {
                    listAdapter = new C2051a(this.mContext, alertController.f8899M, 16908308, this.mItems, recycleListView);
                } else {
                    listAdapter = new C2052b(this.mContext, this.mCursor, false, recycleListView, alertController);
                }
            } else {
                if (this.mIsSingleChoice) {
                    i = alertController.f8900N;
                } else {
                    i = alertController.f8901O;
                }
                int i2 = i;
                if (this.mCursor != null) {
                    listAdapter = new SimpleCursorAdapter(this.mContext, i2, this.mCursor, new String[]{this.mLabelColumn}, new int[]{16908308});
                } else {
                    listAdapter = this.mAdapter;
                    if (listAdapter == null) {
                        listAdapter = new C2061g(this.mContext, i2, 16908308, this.mItems);
                    }
                }
            }
            OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.onPrepareListView(recycleListView);
            }
            alertController.f8894H = listAdapter;
            alertController.f8895I = this.mCheckedItem;
            if (this.mOnClickListener != null) {
                recycleListView.setOnItemClickListener(new C2053c(alertController));
            } else if (this.mOnCheckboxClickListener != null) {
                recycleListView.setOnItemClickListener(new C2054d(recycleListView, alertController));
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
            alertController.f8912g = recycleListView;
        }

        public void apply(AlertController alertController) {
            View view = this.mCustomTitleView;
            if (view != null) {
                alertController.m64672m(view);
            } else {
                CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.m64667r(charSequence);
                }
                Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.m64670o(drawable);
                }
                int i = this.mIconId;
                if (i != 0) {
                    alertController.m64671n(i);
                }
                int i2 = this.mIconAttrId;
                if (i2 != 0) {
                    alertController.m64671n(alertController.m64681d(i2));
                }
            }
            CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.m64669p(charSequence2);
            }
            CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.m64673l(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.m64673l(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.m64673l(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                m64658a(alertController);
            }
            View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController.m64664u(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                } else {
                    alertController.m64665t(view2);
                    return;
                }
            }
            int i3 = this.mViewLayoutResId;
            if (i3 != 0) {
                alertController.m64666s(i3);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f8944a;

        /* renamed from: b */
        public final int f8945b;

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
                    i = this.f8944a;
                }
                int paddingRight = getPaddingRight();
                if (z2) {
                    i2 = getPaddingBottom();
                } else {
                    i2 = this.f8945b;
                }
                setPadding(paddingLeft, i, paddingRight, i2);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f8945b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f8944a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2055a implements View.OnClickListener {
        public View$OnClickListenerC2055a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f8920o && (message4 = alertController.f8922q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f8924s && (message3 = alertController.f8926u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f8928w && (message2 = alertController.f8930y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f8904R.obtainMessage(1, alertController2.f8907b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C2056b implements NestedScrollView.OnScrollChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f8947a;

        /* renamed from: b */
        public final /* synthetic */ View f8948b;

        public C2056b(View view, View view2) {
            this.f8947a = view;
            this.f8948b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m64678g(nestedScrollView, this.f8947a, this.f8948b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC2057c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f8950a;

        /* renamed from: b */
        public final /* synthetic */ View f8951b;

        public RunnableC2057c(View view, View view2) {
            this.f8950a = view;
            this.f8951b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m64678g(AlertController.this.f8887A, this.f8950a, this.f8951b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C2058d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f8953a;

        /* renamed from: b */
        public final /* synthetic */ View f8954b;

        public C2058d(View view, View view2) {
            this.f8953a = view;
            this.f8954b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m64678g(absListView, this.f8953a, this.f8954b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC2059e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f8956a;

        /* renamed from: b */
        public final /* synthetic */ View f8957b;

        public RunnableC2059e(View view, View view2) {
            this.f8956a = view;
            this.f8957b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m64678g(AlertController.this.f8912g, this.f8956a, this.f8957b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static final class HandlerC2060f extends Handler {

        /* renamed from: a */
        public WeakReference f8959a;

        public HandlerC2060f(DialogInterface dialogInterface) {
            this.f8959a = new WeakReference(dialogInterface);
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
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f8959a.get(), message.what);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    public static class C2061g extends ArrayAdapter {
        public C2061g(Context context, int i, int i2, CharSequence[] charSequenceArr) {
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
        this.f8906a = context;
        this.f8907b = appCompatDialog;
        this.f8908c = window;
        this.f8904R = new HandlerC2060f(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.f8896J = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.f8897K = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f8898L = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.f8899M = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f8900N = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f8901O = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.f8902P = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f8909d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    /* renamed from: A */
    public static boolean m64685A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64684a(View view) {
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
            if (m64684a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m64678g(View view, View view2, View view3) {
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
    public final void m64683b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public Button m64682c(int i) {
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    return null;
                }
                return this.f8920o;
            }
            return this.f8924s;
        }
        return this.f8928w;
    }

    /* renamed from: d */
    public int m64681d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f8906a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m64680e() {
        return this.f8912g;
    }

    /* renamed from: f */
    public void m64679f() {
        this.f8907b.setContentView(m64674k());
        m64659z();
    }

    /* renamed from: h */
    public boolean m64677h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8887A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m64676i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f8887A;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final ViewGroup m64675j(View view, View view2) {
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
    public final int m64674k() {
        int i = this.f8897K;
        if (i == 0) {
            return this.f8896J;
        }
        if (this.f8903Q == 1) {
            return i;
        }
        return this.f8896J;
    }

    /* renamed from: l */
    public void m64673l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f8904R.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.f8921p = charSequence;
                    this.f8922q = message;
                    this.f8923r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8925t = charSequence;
            this.f8926u = message;
            this.f8927v = drawable;
            return;
        }
        this.f8929x = charSequence;
        this.f8930y = message;
        this.f8931z = drawable;
    }

    /* renamed from: m */
    public void m64672m(View view) {
        this.f8893G = view;
    }

    /* renamed from: n */
    public void m64671n(int i) {
        this.f8889C = null;
        this.f8888B = i;
        ImageView imageView = this.f8890D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.f8890D.setImageResource(this.f8888B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: o */
    public void m64670o(Drawable drawable) {
        this.f8889C = drawable;
        this.f8888B = 0;
        ImageView imageView = this.f8890D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f8890D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: p */
    public void m64669p(CharSequence charSequence) {
        this.f8911f = charSequence;
        TextView textView = this.f8892F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public final void m64668q(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f8908c.findViewById(R.id.scrollIndicatorUp);
        View findViewById2 = this.f8908c.findViewById(R.id.scrollIndicatorDown);
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
            if (this.f8911f != null) {
                this.f8887A.setOnScrollChangeListener(new C2056b(findViewById, findViewById2));
                this.f8887A.post(new RunnableC2057c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f8912g;
            if (listView != null) {
                listView.setOnScrollListener(new C2058d(findViewById, findViewById2));
                this.f8912g.post(new RunnableC2059e(findViewById, findViewById2));
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
    public void m64667r(CharSequence charSequence) {
        this.f8910e = charSequence;
        TextView textView = this.f8891E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m64666s(int i) {
        this.f8913h = null;
        this.f8914i = i;
        this.f8919n = false;
    }

    /* renamed from: t */
    public void m64665t(View view) {
        this.f8913h = view;
        this.f8914i = 0;
        this.f8919n = false;
    }

    /* renamed from: u */
    public void m64664u(View view, int i, int i2, int i3, int i4) {
        this.f8913h = view;
        this.f8914i = 0;
        this.f8919n = true;
        this.f8915j = i;
        this.f8916k = i2;
        this.f8917l = i3;
        this.f8918m = i4;
    }

    /* renamed from: v */
    public final void m64663v(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f8920o = button;
        button.setOnClickListener(this.f8905S);
        if (TextUtils.isEmpty(this.f8921p) && this.f8923r == null) {
            this.f8920o.setVisibility(8);
            z = false;
        } else {
            this.f8920o.setText(this.f8921p);
            Drawable drawable = this.f8923r;
            if (drawable != null) {
                int i = this.f8909d;
                drawable.setBounds(0, 0, i, i);
                this.f8920o.setCompoundDrawables(this.f8923r, null, null, null);
            }
            this.f8920o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f8924s = button2;
        button2.setOnClickListener(this.f8905S);
        if (TextUtils.isEmpty(this.f8925t) && this.f8927v == null) {
            this.f8924s.setVisibility(8);
        } else {
            this.f8924s.setText(this.f8925t);
            Drawable drawable2 = this.f8927v;
            if (drawable2 != null) {
                int i2 = this.f8909d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f8924s.setCompoundDrawables(this.f8927v, null, null, null);
            }
            this.f8924s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f8928w = button3;
        button3.setOnClickListener(this.f8905S);
        if (TextUtils.isEmpty(this.f8929x) && this.f8931z == null) {
            this.f8928w.setVisibility(8);
        } else {
            this.f8928w.setText(this.f8929x);
            Drawable drawable3 = this.f8931z;
            if (drawable3 != null) {
                int i3 = this.f8909d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f8928w.setCompoundDrawables(this.f8931z, null, null, null);
            }
            this.f8928w.setVisibility(0);
            z |= true;
        }
        if (m64685A(this.f8906a)) {
            if (z) {
                m64683b(this.f8920o);
            } else if (z) {
                m64683b(this.f8924s);
            } else if (z) {
                m64683b(this.f8928w);
            }
        }
        if (!z) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    public final void m64662w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f8908c.findViewById(R.id.scrollView);
        this.f8887A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f8887A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f8892F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f8911f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f8887A.removeView(this.f8892F);
        if (this.f8912g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f8887A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f8887A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f8912g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    public final void m64661x(ViewGroup viewGroup) {
        View view = this.f8913h;
        boolean z = false;
        if (view == null) {
            if (this.f8914i != 0) {
                view = LayoutInflater.from(this.f8906a).inflate(this.f8914i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m64684a(view)) {
            this.f8908c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f8908c.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f8919n) {
                frameLayout.setPadding(this.f8915j, this.f8916k, this.f8917l, this.f8918m);
            }
            if (this.f8912g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    public final void m64660y(ViewGroup viewGroup) {
        if (this.f8893G != null) {
            viewGroup.addView(this.f8893G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f8908c.findViewById(R.id.title_template).setVisibility(8);
            return;
        }
        this.f8890D = (ImageView) this.f8908c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f8910e)) && this.f8902P) {
            TextView textView = (TextView) this.f8908c.findViewById(R.id.alertTitle);
            this.f8891E = textView;
            textView.setText(this.f8910e);
            int i = this.f8888B;
            if (i != 0) {
                this.f8890D.setImageResource(i);
                return;
            }
            Drawable drawable = this.f8889C;
            if (drawable != null) {
                this.f8890D.setImageDrawable(drawable);
                return;
            }
            this.f8891E.setPadding(this.f8890D.getPaddingLeft(), this.f8890D.getPaddingTop(), this.f8890D.getPaddingRight(), this.f8890D.getPaddingBottom());
            this.f8890D.setVisibility(8);
            return;
        }
        this.f8908c.findViewById(R.id.title_template).setVisibility(8);
        this.f8890D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public final void m64659z() {
        boolean z;
        boolean z2;
        boolean z3;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f8908c.findViewById(R.id.parentPanel);
        View findViewById5 = findViewById4.findViewById(R.id.topPanel);
        View findViewById6 = findViewById4.findViewById(R.id.contentPanel);
        View findViewById7 = findViewById4.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(R.id.customPanel);
        m64661x(viewGroup);
        View findViewById8 = viewGroup.findViewById(R.id.topPanel);
        View findViewById9 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById10 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m64675j = m64675j(findViewById8, findViewById5);
        ViewGroup m64675j2 = m64675j(findViewById9, findViewById6);
        ViewGroup m64675j3 = m64675j(findViewById10, findViewById7);
        m64662w(m64675j2);
        m64663v(m64675j3);
        m64660y(m64675j);
        int i = 0;
        if (viewGroup.getVisibility() != 8) {
            z = true;
        } else {
            z = false;
        }
        if (m64675j != null && m64675j.getVisibility() != 8) {
            z2 = 1;
        } else {
            z2 = 0;
        }
        if (m64675j3 != null && m64675j3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && m64675j2 != null && (findViewById3 = m64675j2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f8887A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f8911f == null && this.f8912g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m64675j.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m64675j2 != null && (findViewById = m64675j2.findViewById(R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f8912g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view = this.f8912g;
            if (view == null) {
                view = this.f8887A;
            }
            if (view != null) {
                if (z3) {
                    i = 2;
                }
                m64668q(m64675j2, view, z2 | i, 3);
            }
        }
        ListView listView2 = this.f8912g;
        if (listView2 != null && (listAdapter = this.f8894H) != null) {
            listView2.setAdapter(listAdapter);
            int i2 = this.f8895I;
            if (i2 > -1) {
                listView2.setItemChecked(i2, true);
                listView2.setSelection(i2);
            }
        }
    }
}