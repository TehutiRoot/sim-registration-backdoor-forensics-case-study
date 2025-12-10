package th.p047co.dtac.android.dtacone.widget.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.widget.dialog.SimRListDialog */
/* loaded from: classes9.dex */
public class SimRListDialog extends BaseDialogFragment {
    public static final String TAG = "SimRListDialog";

    /* renamed from: a */
    public Listener f107352a;

    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.SimRListDialog$Listener */
    /* loaded from: classes9.dex */
    public interface Listener {
        void onChooseItem(String str);
    }

    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.SimRListDialog$a */
    /* loaded from: classes9.dex */
    public class C16775a extends RecyclerView.Adapter {

        /* renamed from: a */
        public String[] f107353a;

        /* renamed from: b */
        public String f107354b;

        public C16775a(String[] strArr, String str) {
            this.f107353a = strArr;
            this.f107354b = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: a */
        public void onBindViewHolder(View$OnClickListenerC16776b view$OnClickListenerC16776b, int i) {
            String str = this.f107353a[i].split("\\.")[0];
            TextView textView = view$OnClickListenerC16776b.f107356a;
            String str2 = this.f107354b;
            if (str2 != null && str2.equals(str)) {
                textView.setTextColor(ContextCompat.getColor(SimRListDialog.this.getContext(), R.color.colorPink));
            } else {
                textView.setTextColor(ContextCompat.getColor(SimRListDialog.this.getContext(), 17170444));
            }
            textView.setText(str);
            textView.setTag(str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b */
        public View$OnClickListenerC16776b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new View$OnClickListenerC16776b(LayoutInflater.from(SimRListDialog.this.getContext()).inflate(R.layout.z_text_with_line, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = this.f107353a;
            if (strArr == null) {
                return 0;
            }
            return strArr.length;
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.SimRListDialog$b */
    /* loaded from: classes9.dex */
    public class View$OnClickListenerC16776b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        public TextView f107356a;

        public View$OnClickListenerC16776b(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.tvOtherPrice);
            this.f107356a = textView;
            textView.setOnClickListener(this);
            if (SimRListDialog.this.getTitle() == R.string.sim_r_number) {
                this.f107356a.setBackgroundResource(R.drawable.z_button_white);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SimRListDialog.this.f107352a != null && SimRListDialog.this.getTitle() != R.string.sim_r_number) {
                SimRListDialog.this.f107352a.onChooseItem((String) view.getTag());
            }
            SimRListDialog.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTitle() {
        return getArguments().getInt("TITLE");
    }

    public static SimRListDialog newInstance(String[] strArr, @StringRes int i) {
        return newInstance(strArr, null, i);
    }

    /* renamed from: q */
    private String m1540q() {
        return getArguments().getString("MARKER_DATA");
    }

    public void initialView(View view) {
        ((TextView) view.findViewById(R.id.dialog_list_tv_title)).setText(getTitle());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.z_dialog_string_rv_data);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new C16775a(m1541p(), m1540q()));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().setCanceledOnTouchOutside(true);
        getDialog().setCancelable(true);
        getDialog().getWindow().setLayout(-1, -1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        View inflate = layoutInflater.inflate(R.layout.z_sim_r_list, viewGroup, true);
        initialView(inflate);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null && (targetFragment instanceof Listener)) {
            this.f107352a = (Listener) targetFragment;
        }
        return inflate;
    }

    /* renamed from: p */
    public final String[] m1541p() {
        return getArguments().getStringArray("DATA");
    }

    public static SimRListDialog newInstance(String[] strArr, String str, @StringRes int i) {
        SimRListDialog simRListDialog = new SimRListDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE", i);
        bundle.putStringArray("DATA", strArr);
        bundle.putString("MARKER_DATA", str);
        simRListDialog.setArguments(bundle);
        return simRListDialog;
    }
}