package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;

/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm */
/* loaded from: classes7.dex */
public class OneCustomDialogBoxConfirm extends BaseDialogFragment {

    /* renamed from: a */
    public FrameLayout f83013a;

    /* renamed from: b */
    public ImageView f83014b;

    /* renamed from: c */
    public TextView f83015c;

    /* renamed from: d */
    public TextView f83016d;

    /* renamed from: e */
    public Button f83017e;

    /* renamed from: f */
    public Button f83018f;

    /* renamed from: g */
    public OneFontTextView f83019g;

    /* renamed from: h */
    public OneFontTextView f83020h;

    /* renamed from: i */
    public OneFontTextView f83021i;

    /* renamed from: j */
    public OneFontTextView f83022j;

    /* renamed from: k */
    public int f83023k;

    /* renamed from: l */
    public boolean f83024l;

    /* renamed from: m */
    public Object f83025m;

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm$Builder */
    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        public int f83026a;

        /* renamed from: b */
        public String f83027b;

        /* renamed from: c */
        public int f83028c;

        /* renamed from: d */
        public String f83029d;

        /* renamed from: e */
        public int f83030e;

        /* renamed from: f */
        public int f83031f;

        /* renamed from: g */
        public int f83032g;

        /* renamed from: h */
        public int f83033h;

        /* renamed from: i */
        public int f83034i;

        /* renamed from: j */
        public boolean f83035j;

        /* renamed from: k */
        public int f83036k;

        /* renamed from: l */
        public int f83037l;

        /* renamed from: m */
        public String f83038m;

        /* renamed from: n */
        public String f83039n;

        /* renamed from: o */
        public String f83040o;

        /* renamed from: p */
        public String f83041p;

        /* renamed from: q */
        public String f83042q;

        /* renamed from: r */
        public Boolean f83043r;

        public OneCustomDialogBoxConfirm create() {
            boolean z;
            OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
            Bundle bundle = new Bundle();
            bundle.putInt("ICON", this.f83030e);
            bundle.putInt("MESSAGE_ID", this.f83026a);
            bundle.putString("MESSAGE", this.f83027b);
            bundle.putInt("SUB_ID_MESSAGE", this.f83028c);
            bundle.putString("SUB_MESSAGE", this.f83029d);
            bundle.putInt("EXTRA_LAYOUT", this.f83031f);
            bundle.putInt("EXTRA_BACKGROUND_BUTTON", this.f83032g);
            bundle.putInt("EXTRA_OK_TEXT", this.f83033h);
            bundle.putInt("EXTRA_CANCEL_TEXT", this.f83034i);
            bundle.putBoolean("EXTRA_CANCELABLE", this.f83035j);
            bundle.putInt("EXTRA_BACKGROUND_OK", this.f83036k);
            bundle.putInt("EXTRA_BACKGROUND_CANCEL", this.f83037l);
            bundle.putString("EXTRA_TIME_STAMP", this.f83038m);
            bundle.putString("EXTRA_USER", this.f83039n);
            bundle.putString("EXTRA_MESSAGE_ID_DEVICE", this.f83040o);
            bundle.putString("EXTRA_ERROR_CODE", this.f83041p);
            bundle.putString("TEXT_TO_HIGHLIGHT", this.f83042q);
            Boolean bool = this.f83043r;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            bundle.putBoolean("BG_TRANSPARENT", z);
            oneCustomDialogBoxConfirm.setArguments(bundle);
            return oneCustomDialogBoxConfirm;
        }

        public Builder setBackgroundOkButton(@DrawableRes int i) {
            this.f83036k = i;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.f83035j = z;
            return this;
        }

        public Builder setErrorCode(@NonNull String str) {
            this.f83041p = str;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.f83030e = i;
            return this;
        }

        public Builder setLayout(@LayoutRes int i) {
            this.f83031f = i;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            this.f83026a = i;
            return this;
        }

        public Builder setMessageIDXDevice(@NonNull String str) {
            this.f83040o = str;
            return this;
        }

        public Builder setOkButtonColor(@DrawableRes int i) {
            this.f83032g = i;
            return this;
        }

        public Builder setSubMessage(@StringRes int i) {
            this.f83028c = i;
            return this;
        }

        public Builder setTextCancelButton(@StringRes int i) {
            this.f83034i = i;
            return this;
        }

        public Builder setTextOkButton(@StringRes int i) {
            this.f83033h = i;
            return this;
        }

        public Builder setTextToHighlightSubMessage(@NonNull String str) {
            this.f83042q = str;
            return this;
        }

        public Builder setTimestamp(@NonNull String str) {
            this.f83038m = str;
            return this;
        }

        public Builder setTransparent(Boolean bool) {
            this.f83043r = bool;
            return this;
        }

        public Builder setUser(@NonNull String str) {
            this.f83039n = str;
            return this;
        }

        public Builder setMessage(@NonNull String str) {
            this.f83027b = str;
            return this;
        }

        public Builder setSubMessage(@NonNull String str) {
            this.f83029d = str;
            return this;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm$ConfirmDialogListener */
    /* loaded from: classes7.dex */
    public interface ConfirmDialogListener<T> {
        void onCancelButtonClick(int i);

        void onOkButtonClick(int i, @Nullable T t);
    }

    private void initView() {
        Button button = this.f83017e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: QO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBoxConfirm.m19967o(OneCustomDialogBoxConfirm.this, view);
                }
            });
        }
        Button button2 = this.f83018f;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: RO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBoxConfirm.m19968n(OneCustomDialogBoxConfirm.this, view);
                }
            });
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m19968n(OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm, View view) {
        oneCustomDialogBoxConfirm.m19961u(view);
    }

    public static OneCustomDialogBoxConfirm newInstance(@NonNull String str, @DrawableRes int i) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putString("MESSAGE", str);
        bundle.putInt("ICON", i);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }

    /* renamed from: o */
    public static /* synthetic */ void m19967o(OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm, View view) {
        oneCustomDialogBoxConfirm.m19962t(view);
    }

    /* renamed from: q */
    private void m19965q(View view) {
        this.f83013a = (FrameLayout) view.findViewById(R.id.alert_icon_exit);
        this.f83014b = (ImageView) view.findViewById(R.id.alert_icon);
        this.f83015c = (TextView) view.findViewById(R.id.alert_message);
        this.f83016d = (TextView) view.findViewById(R.id.alert_sub_message);
        this.f83017e = (Button) view.findViewById(R.id.btnOk);
        this.f83018f = (Button) view.findViewById(R.id.btnCancel);
        this.f83019g = (OneFontTextView) view.findViewById(R.id.tvTimestamp);
        this.f83020h = (OneFontTextView) view.findViewById(R.id.tvErrorUser);
        this.f83021i = (OneFontTextView) view.findViewById(R.id.alert_message_id_device);
        this.f83022j = (OneFontTextView) view.findViewById(R.id.tvErrorCode);
    }

    /* renamed from: t */
    public /* synthetic */ void m19962t(View view) {
        onConfirm();
    }

    /* renamed from: u */
    public /* synthetic */ void m19961u(View view) {
        onCancel();
    }

    /* renamed from: A */
    public final void m19976A() {
        int i = getArguments().getInt("ICON");
        if (i > 0) {
            this.f83014b.setImageResource(i);
            return;
        }
        FrameLayout frameLayout = this.f83013a;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: B */
    public final View m19975B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = getArguments().getInt("EXTRA_LAYOUT");
        if (i > 0) {
            return layoutInflater.inflate(i, viewGroup, true);
        }
        return layoutInflater.inflate(R.layout.one_alert_box_confirm, viewGroup, true);
    }

    /* renamed from: C */
    public final void m19974C() {
        TextView textView;
        int i = getArguments().getInt("MESSAGE_ID");
        if (i > 0) {
            this.f83015c.setText(i);
            return;
        }
        String string = getArguments().getString("MESSAGE");
        if (string != null && string.isEmpty() && (textView = this.f83015c) != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f83015c;
        if (textView2 != null) {
            textView2.setText(string);
        }
    }

    /* renamed from: D */
    public final void m19973D() {
        String string = getArguments().getString("EXTRA_MESSAGE_ID_DEVICE");
        if (string != null) {
            this.f83021i.setText(string);
        }
    }

    /* renamed from: E */
    public final void m19972E() {
        int i = getArguments().getInt("SUB_ID_MESSAGE");
        if (i > 0) {
            this.f83016d.setText(i);
        } else if (StringUtil.hasText(getArguments().getString("SUB_MESSAGE"))) {
            if (StringUtil.hasText(getArguments().getString("TEXT_TO_HIGHLIGHT"))) {
                m19966p(this.f83016d, getArguments().getString("SUB_MESSAGE"), getArguments().getString("TEXT_TO_HIGHLIGHT"));
                return;
            }
            this.f83016d.setText(getArguments().getString("SUB_MESSAGE"));
        } else {
            TextView textView = this.f83016d;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: F */
    public final void m19971F() {
        int i = getArguments().getInt("EXTRA_OK_TEXT");
        int i2 = getArguments().getInt("EXTRA_CANCEL_TEXT");
        if (i > 0) {
            this.f83017e.setText(i);
        }
        if (i2 > 0) {
            this.f83018f.setText(i2);
        }
    }

    /* renamed from: G */
    public final void m19970G() {
        String string = getArguments().getString("EXTRA_TIME_STAMP");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f83019g;
            oneFontTextView.setText("วันที่ : " + string);
            this.f83019g.setVisibility(0);
        }
    }

    /* renamed from: H */
    public final void m19969H() {
        String string = getArguments().getString("EXTRA_USER");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f83020h;
            oneFontTextView.setText("User : " + string);
            this.f83020h.setVisibility(0);
        }
    }

    public void onCancel() {
        dismiss();
        m19963s().onCancelButtonClick(getTargetRequestCode());
    }

    public void onConfirm() {
        dismiss();
        m19963s().onOkButtonClick(getTargetRequestCode(), this.f83025m);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        m19957y();
        getDialog().setCanceledOnTouchOutside(m19964r());
        getDialog().setCancelable(m19964r());
        View m19975B = m19975B(layoutInflater, viewGroup);
        m19965q(m19975B);
        initView();
        m19958x();
        m19974C();
        m19972E();
        m19976A();
        m19971F();
        m19959w();
        m19960v();
        m19970G();
        m19969H();
        m19973D();
        m19956z();
        return m19975B;
    }

    /* renamed from: p */
    public final void m19966p(TextView textView, String str, String str2) {
        textView.setText(Html.fromHtml(str.replaceAll(str2, "<font color='#00a3dc'>" + str2 + "</font>").replace("\n", "<br>")));
    }

    /* renamed from: r */
    public final boolean m19964r() {
        return getArguments().getBoolean("EXTRA_CANCELABLE", true);
    }

    /* renamed from: s */
    public final ConfirmDialogListener m19963s() {
        if (this.f83024l) {
            return (ConfirmDialogListener) getTargetFragment();
        }
        return (ConfirmDialogListener) getActivity();
    }

    public void setResult(Object obj) {
        this.f83025m = obj;
    }

    public void setTargetActivity(int i) {
        this.f83023k = i;
        this.f83024l = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f83023k = i;
        this.f83024l = true;
    }

    /* renamed from: v */
    public final void m19960v() {
        int i = getArguments().getInt("EXTRA_BACKGROUND_CANCEL");
        if (i > 0) {
            this.f83018f.setBackgroundResource(i);
        }
    }

    /* renamed from: w */
    public final void m19959w() {
        int i = getArguments().getInt("EXTRA_BACKGROUND_OK");
        if (i > 0) {
            this.f83017e.setBackgroundResource(i);
        }
    }

    /* renamed from: x */
    public final void m19958x() {
        Button button;
        int i = getArguments().getInt("EXTRA_BACKGROUND_BUTTON", 0);
        if (i != 0 && (button = this.f83017e) != null) {
            button.setBackgroundResource(i);
        }
    }

    /* renamed from: y */
    public final void m19957y() {
        if (getArguments().getBoolean("BG_TRANSPARENT", false)) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: z */
    public final void m19956z() {
        String string = getArguments().getString("EXTRA_ERROR_CODE");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f83022j;
            oneFontTextView.setText("Code : " + string);
            this.f83022j.setVisibility(0);
        }
    }

    public static OneCustomDialogBoxConfirm newInstance(@StringRes int i, @DrawableRes int i2) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putInt("MESSAGE_ID", i);
        bundle.putInt("ICON", i2);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }

    public static OneCustomDialogBoxConfirm newInstance(@NonNull String str, @NonNull String str2, @DrawableRes int i) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putString("MESSAGE", str);
        bundle.putString("SUB_MESSAGE", str2);
        bundle.putInt("ICON", i);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }

    public static OneCustomDialogBoxConfirm newInstance(@NonNull String str, @NonNull String str2) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putString("MESSAGE", str);
        bundle.putString("SUB_MESSAGE", str2);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }

    public static OneCustomDialogBoxConfirm newInstance(@StringRes int i, @StringRes int i2, @DrawableRes int i3) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putInt("MESSAGE_ID", i);
        bundle.putInt("SUB_ID_MESSAGE", i2);
        bundle.putInt("ICON", i3);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }

    public static OneCustomDialogBoxConfirm newInstance(@NonNull String str) {
        OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
        Bundle bundle = new Bundle();
        bundle.putString("MESSAGE", str);
        oneCustomDialogBoxConfirm.setArguments(bundle);
        return oneCustomDialogBoxConfirm;
    }
}