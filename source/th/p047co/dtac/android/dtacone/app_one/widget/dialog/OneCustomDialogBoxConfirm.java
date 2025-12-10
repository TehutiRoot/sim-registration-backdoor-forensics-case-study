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
    public FrameLayout f82921a;

    /* renamed from: b */
    public ImageView f82922b;

    /* renamed from: c */
    public TextView f82923c;

    /* renamed from: d */
    public TextView f82924d;

    /* renamed from: e */
    public Button f82925e;

    /* renamed from: f */
    public Button f82926f;

    /* renamed from: g */
    public OneFontTextView f82927g;

    /* renamed from: h */
    public OneFontTextView f82928h;

    /* renamed from: i */
    public OneFontTextView f82929i;

    /* renamed from: j */
    public OneFontTextView f82930j;

    /* renamed from: k */
    public int f82931k;

    /* renamed from: l */
    public boolean f82932l;

    /* renamed from: m */
    public Object f82933m;

    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBoxConfirm$Builder */
    /* loaded from: classes7.dex */
    public static class Builder {

        /* renamed from: a */
        public int f82934a;

        /* renamed from: b */
        public String f82935b;

        /* renamed from: c */
        public int f82936c;

        /* renamed from: d */
        public String f82937d;

        /* renamed from: e */
        public int f82938e;

        /* renamed from: f */
        public int f82939f;

        /* renamed from: g */
        public int f82940g;

        /* renamed from: h */
        public int f82941h;

        /* renamed from: i */
        public int f82942i;

        /* renamed from: j */
        public boolean f82943j;

        /* renamed from: k */
        public int f82944k;

        /* renamed from: l */
        public int f82945l;

        /* renamed from: m */
        public String f82946m;

        /* renamed from: n */
        public String f82947n;

        /* renamed from: o */
        public String f82948o;

        /* renamed from: p */
        public String f82949p;

        /* renamed from: q */
        public String f82950q;

        /* renamed from: r */
        public Boolean f82951r;

        public OneCustomDialogBoxConfirm create() {
            boolean z;
            OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm = new OneCustomDialogBoxConfirm();
            Bundle bundle = new Bundle();
            bundle.putInt("ICON", this.f82938e);
            bundle.putInt("MESSAGE_ID", this.f82934a);
            bundle.putString("MESSAGE", this.f82935b);
            bundle.putInt("SUB_ID_MESSAGE", this.f82936c);
            bundle.putString("SUB_MESSAGE", this.f82937d);
            bundle.putInt("EXTRA_LAYOUT", this.f82939f);
            bundle.putInt("EXTRA_BACKGROUND_BUTTON", this.f82940g);
            bundle.putInt("EXTRA_OK_TEXT", this.f82941h);
            bundle.putInt("EXTRA_CANCEL_TEXT", this.f82942i);
            bundle.putBoolean("EXTRA_CANCELABLE", this.f82943j);
            bundle.putInt("EXTRA_BACKGROUND_OK", this.f82944k);
            bundle.putInt("EXTRA_BACKGROUND_CANCEL", this.f82945l);
            bundle.putString("EXTRA_TIME_STAMP", this.f82946m);
            bundle.putString("EXTRA_USER", this.f82947n);
            bundle.putString("EXTRA_MESSAGE_ID_DEVICE", this.f82948o);
            bundle.putString("EXTRA_ERROR_CODE", this.f82949p);
            bundle.putString("TEXT_TO_HIGHLIGHT", this.f82950q);
            Boolean bool = this.f82951r;
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
            this.f82944k = i;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.f82943j = z;
            return this;
        }

        public Builder setErrorCode(@NonNull String str) {
            this.f82949p = str;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.f82938e = i;
            return this;
        }

        public Builder setLayout(@LayoutRes int i) {
            this.f82939f = i;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            this.f82934a = i;
            return this;
        }

        public Builder setMessageIDXDevice(@NonNull String str) {
            this.f82948o = str;
            return this;
        }

        public Builder setOkButtonColor(@DrawableRes int i) {
            this.f82940g = i;
            return this;
        }

        public Builder setSubMessage(@StringRes int i) {
            this.f82936c = i;
            return this;
        }

        public Builder setTextCancelButton(@StringRes int i) {
            this.f82942i = i;
            return this;
        }

        public Builder setTextOkButton(@StringRes int i) {
            this.f82941h = i;
            return this;
        }

        public Builder setTextToHighlightSubMessage(@NonNull String str) {
            this.f82950q = str;
            return this;
        }

        public Builder setTimestamp(@NonNull String str) {
            this.f82946m = str;
            return this;
        }

        public Builder setTransparent(Boolean bool) {
            this.f82951r = bool;
            return this;
        }

        public Builder setUser(@NonNull String str) {
            this.f82947n = str;
            return this;
        }

        public Builder setMessage(@NonNull String str) {
            this.f82935b = str;
            return this;
        }

        public Builder setSubMessage(@NonNull String str) {
            this.f82937d = str;
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
        Button button = this.f82925e;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: KO0
                {
                    OneCustomDialogBoxConfirm.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBoxConfirm.m19792o(OneCustomDialogBoxConfirm.this, view);
                }
            });
        }
        Button button2 = this.f82926f;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: LO0
                {
                    OneCustomDialogBoxConfirm.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBoxConfirm.m19793n(OneCustomDialogBoxConfirm.this, view);
                }
            });
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m19793n(OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm, View view) {
        oneCustomDialogBoxConfirm.m19786u(view);
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
    public static /* synthetic */ void m19792o(OneCustomDialogBoxConfirm oneCustomDialogBoxConfirm, View view) {
        oneCustomDialogBoxConfirm.m19787t(view);
    }

    /* renamed from: q */
    private void m19790q(View view) {
        this.f82921a = (FrameLayout) view.findViewById(R.id.alert_icon_exit);
        this.f82922b = (ImageView) view.findViewById(R.id.alert_icon);
        this.f82923c = (TextView) view.findViewById(R.id.alert_message);
        this.f82924d = (TextView) view.findViewById(R.id.alert_sub_message);
        this.f82925e = (Button) view.findViewById(R.id.btnOk);
        this.f82926f = (Button) view.findViewById(R.id.btnCancel);
        this.f82927g = (OneFontTextView) view.findViewById(R.id.tvTimestamp);
        this.f82928h = (OneFontTextView) view.findViewById(R.id.tvErrorUser);
        this.f82929i = (OneFontTextView) view.findViewById(R.id.alert_message_id_device);
        this.f82930j = (OneFontTextView) view.findViewById(R.id.tvErrorCode);
    }

    /* renamed from: t */
    public /* synthetic */ void m19787t(View view) {
        onConfirm();
    }

    /* renamed from: u */
    public /* synthetic */ void m19786u(View view) {
        onCancel();
    }

    /* renamed from: A */
    public final void m19801A() {
        int i = getArguments().getInt("ICON");
        if (i > 0) {
            this.f82922b.setImageResource(i);
            return;
        }
        FrameLayout frameLayout = this.f82921a;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: B */
    public final View m19800B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = getArguments().getInt("EXTRA_LAYOUT");
        if (i > 0) {
            return layoutInflater.inflate(i, viewGroup, true);
        }
        return layoutInflater.inflate(R.layout.one_alert_box_confirm, viewGroup, true);
    }

    /* renamed from: C */
    public final void m19799C() {
        TextView textView;
        int i = getArguments().getInt("MESSAGE_ID");
        if (i > 0) {
            this.f82923c.setText(i);
            return;
        }
        String string = getArguments().getString("MESSAGE");
        if (string != null && string.isEmpty() && (textView = this.f82923c) != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f82923c;
        if (textView2 != null) {
            textView2.setText(string);
        }
    }

    /* renamed from: D */
    public final void m19798D() {
        String string = getArguments().getString("EXTRA_MESSAGE_ID_DEVICE");
        if (string != null) {
            this.f82929i.setText(string);
        }
    }

    /* renamed from: E */
    public final void m19797E() {
        int i = getArguments().getInt("SUB_ID_MESSAGE");
        if (i > 0) {
            this.f82924d.setText(i);
        } else if (StringUtil.hasText(getArguments().getString("SUB_MESSAGE"))) {
            if (StringUtil.hasText(getArguments().getString("TEXT_TO_HIGHLIGHT"))) {
                m19791p(this.f82924d, getArguments().getString("SUB_MESSAGE"), getArguments().getString("TEXT_TO_HIGHLIGHT"));
                return;
            }
            this.f82924d.setText(getArguments().getString("SUB_MESSAGE"));
        } else {
            TextView textView = this.f82924d;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: F */
    public final void m19796F() {
        int i = getArguments().getInt("EXTRA_OK_TEXT");
        int i2 = getArguments().getInt("EXTRA_CANCEL_TEXT");
        if (i > 0) {
            this.f82925e.setText(i);
        }
        if (i2 > 0) {
            this.f82926f.setText(i2);
        }
    }

    /* renamed from: G */
    public final void m19795G() {
        String string = getArguments().getString("EXTRA_TIME_STAMP");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f82927g;
            oneFontTextView.setText("วันที่ : " + string);
            this.f82927g.setVisibility(0);
        }
    }

    /* renamed from: H */
    public final void m19794H() {
        String string = getArguments().getString("EXTRA_USER");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f82928h;
            oneFontTextView.setText("User : " + string);
            this.f82928h.setVisibility(0);
        }
    }

    public void onCancel() {
        dismiss();
        m19788s().onCancelButtonClick(getTargetRequestCode());
    }

    public void onConfirm() {
        dismiss();
        m19788s().onOkButtonClick(getTargetRequestCode(), this.f82933m);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        m19782y();
        getDialog().setCanceledOnTouchOutside(m19789r());
        getDialog().setCancelable(m19789r());
        View m19800B = m19800B(layoutInflater, viewGroup);
        m19790q(m19800B);
        initView();
        m19783x();
        m19799C();
        m19797E();
        m19801A();
        m19796F();
        m19784w();
        m19785v();
        m19795G();
        m19794H();
        m19798D();
        m19781z();
        return m19800B;
    }

    /* renamed from: p */
    public final void m19791p(TextView textView, String str, String str2) {
        textView.setText(Html.fromHtml(str.replaceAll(str2, "<font color='#00a3dc'>" + str2 + "</font>").replace("\n", "<br>")));
    }

    /* renamed from: r */
    public final boolean m19789r() {
        return getArguments().getBoolean("EXTRA_CANCELABLE", true);
    }

    /* renamed from: s */
    public final ConfirmDialogListener m19788s() {
        if (this.f82932l) {
            return (ConfirmDialogListener) getTargetFragment();
        }
        return (ConfirmDialogListener) getActivity();
    }

    public void setResult(Object obj) {
        this.f82933m = obj;
    }

    public void setTargetActivity(int i) {
        this.f82931k = i;
        this.f82932l = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void setTargetFragment(Fragment fragment, int i) {
        super.setTargetFragment(fragment, i);
        this.f82931k = i;
        this.f82932l = true;
    }

    /* renamed from: v */
    public final void m19785v() {
        int i = getArguments().getInt("EXTRA_BACKGROUND_CANCEL");
        if (i > 0) {
            this.f82926f.setBackgroundResource(i);
        }
    }

    /* renamed from: w */
    public final void m19784w() {
        int i = getArguments().getInt("EXTRA_BACKGROUND_OK");
        if (i > 0) {
            this.f82925e.setBackgroundResource(i);
        }
    }

    /* renamed from: x */
    public final void m19783x() {
        Button button;
        int i = getArguments().getInt("EXTRA_BACKGROUND_BUTTON", 0);
        if (i != 0 && (button = this.f82925e) != null) {
            button.setBackgroundResource(i);
        }
    }

    /* renamed from: y */
    public final void m19782y() {
        if (getArguments().getBoolean("BG_TRANSPARENT", false)) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: z */
    public final void m19781z() {
        String string = getArguments().getString("EXTRA_ERROR_CODE");
        if (string != null) {
            OneFontTextView oneFontTextView = this.f82930j;
            oneFontTextView.setText("Code : " + string);
            this.f82930j.setVisibility(0);
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
