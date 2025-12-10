package th.p047co.dtac.android.dtacone.widget.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import th.p047co.dtac.android.dtacone.BuildConfig;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.adapter.TermsConditionAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZTermsConditionDialogBinding;
import th.p047co.dtac.android.dtacone.util.density.ScreenSizeHelper;
import th.p047co.dtac.android.dtacone.widget.dialog.DtacOneTermsConditionDialog;

/* renamed from: th.co.dtac.android.dtacone.widget.dialog.DtacOneTermsConditionDialog */
/* loaded from: classes9.dex */
public class DtacOneTermsConditionDialog extends BaseDialogFragment {
    public static final String EXTRA_TERMS = "EXTRA_TERMS";
    public static final String EXTRA_TITLE = "EXTRA_TITLE";

    /* renamed from: k */
    public static Callback f107315k;

    /* renamed from: a */
    public TextView f107316a;

    /* renamed from: b */
    public CheckBox f107317b;

    /* renamed from: c */
    public Button f107318c;

    /* renamed from: d */
    public RecyclerView f107319d;

    /* renamed from: e */
    public AppCompatImageView f107320e;

    /* renamed from: f */
    public TextView f107321f;

    /* renamed from: g */
    public TermsConditionAdapter f107322g;

    /* renamed from: h */
    public WeakReference f107323h;

    /* renamed from: i */
    public LinearLayoutManager f107324i;

    /* renamed from: j */
    public ZTermsConditionDialogBinding f107325j;

    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.DtacOneTermsConditionDialog$Callback */
    /* loaded from: classes9.dex */
    public interface Callback {
        void onAcceptButtonClick();
    }

    /* renamed from: B */
    private void m1614B() {
        this.f107319d.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.f107324i = linearLayoutManager;
        this.f107319d.setLayoutManager(linearLayoutManager);
        this.f107319d.setAdapter(this.f107322g);
        if (this.f107323h.get() != null) {
            this.f107322g.setListTermsCondition((String[]) this.f107323h.get());
        }
        this.f107322g.notifyDataSetChanged();
    }

    private String getTitle() {
        return getArguments().getString("EXTRA_TITLE", getString(R.string.term_condition_title));
    }

    public static DtacOneTermsConditionDialog newInstance(String[] strArr, String str) {
        DtacOneTermsConditionDialog dtacOneTermsConditionDialog = new DtacOneTermsConditionDialog();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TITLE", str);
        bundle.putStringArray(EXTRA_TERMS, strArr);
        dtacOneTermsConditionDialog.setArguments(bundle);
        return dtacOneTermsConditionDialog;
    }

    /* renamed from: r */
    private void m1609r() {
        ZTermsConditionDialogBinding zTermsConditionDialogBinding = this.f107325j;
        this.f107316a = zTermsConditionDialogBinding.tvTitle;
        this.f107317b = zTermsConditionDialogBinding.chkAccept;
        this.f107318c = zTermsConditionDialogBinding.btnOk;
        this.f107319d = zTermsConditionDialogBinding.rvTermCondition;
        this.f107320e = zTermsConditionDialogBinding.ivScrollDown;
        this.f107321f = zTermsConditionDialogBinding.termsConditionTvConsentVersion;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m1607t(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    /* renamed from: v */
    public /* synthetic */ void m1605v(View view) {
        m1601z();
    }

    /* renamed from: A */
    public final void m1615A() {
        if (ScreenSizeHelper.isTableSW600(getResources().getDisplayMetrics())) {
            this.f107319d.getLayoutParams().height = ScreenSizeHelper.getHeightScreenSizePixel(getResources().getDisplayMetrics()) - 380;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().setCanceledOnTouchOutside(false);
        getDialog().setCancelable(false);
        this.f107325j = ZTermsConditionDialogBinding.inflate(layoutInflater, viewGroup, false);
        m1609r();
        this.f107317b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ZK
            {
                DtacOneTermsConditionDialog.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                DtacOneTermsConditionDialog.this.m1606u(compoundButton, z);
            }
        });
        this.f107320e.setOnClickListener(new View.OnClickListener() { // from class: aL
            {
                DtacOneTermsConditionDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DtacOneTermsConditionDialog.this.m1605v(view);
            }
        });
        this.f107318c.setOnClickListener(new View.OnClickListener() { // from class: bL
            {
                DtacOneTermsConditionDialog.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DtacOneTermsConditionDialog.this.m1604w(view);
            }
        });
        m1615A();
        this.f107323h = new WeakReference(getArguments().getStringArray(EXTRA_TERMS));
        this.f107322g = new TermsConditionAdapter();
        this.f107316a.setText(getTitle());
        this.f107321f.setText(BuildConfig.CONSENT_VERSION);
        m1614B();
        m1608s();
        return this.f107325j.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        WeakReference weakReference = this.f107323h;
        if (weakReference != null) {
            weakReference.clear();
        }
        super.onDestroy();
    }

    /* renamed from: s */
    public final void m1608s() {
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: cL
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean m1607t;
                m1607t = DtacOneTermsConditionDialog.m1607t(dialogInterface, i, keyEvent);
                return m1607t;
            }
        });
    }

    /* renamed from: u */
    public final /* synthetic */ void m1606u(CompoundButton compoundButton, boolean z) {
        m1602y();
    }

    /* renamed from: w */
    public final /* synthetic */ void m1604w(View view) {
        m1603x();
    }

    /* renamed from: x */
    public void m1603x() {
        Callback callback = f107315k;
        if (callback != null) {
            callback.onAcceptButtonClick();
        } else {
            ((Callback) getActivity()).onAcceptButtonClick();
        }
    }

    /* renamed from: y */
    public void m1602y() {
        if (this.f107317b.isChecked()) {
            this.f107318c.setEnabled(true);
            this.f107318c.setBackgroundResource(R.drawable.z_button_accept);
            return;
        }
        this.f107318c.setBackgroundResource(R.drawable.z_button_accept_disable);
        this.f107318c.setEnabled(false);
    }

    /* renamed from: z */
    public void m1601z() {
        WeakReference weakReference = this.f107323h;
        if (weakReference != null && ((String[]) weakReference.get()).length > 5) {
            this.f107319d.smoothScrollToPosition(((String[]) this.f107323h.get()).length - 1);
            if (this.f107324i.findLastCompletelyVisibleItemPosition() == ((String[]) this.f107323h.get()).length) {
                this.f107317b.setChecked(true);
            }
        }
    }

    public static DtacOneTermsConditionDialog newInstance(String[] strArr, String str, Callback callback) {
        DtacOneTermsConditionDialog dtacOneTermsConditionDialog = new DtacOneTermsConditionDialog();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TITLE", str);
        bundle.putStringArray(EXTRA_TERMS, strArr);
        dtacOneTermsConditionDialog.setArguments(bundle);
        f107315k = callback;
        return dtacOneTermsConditionDialog;
    }
}