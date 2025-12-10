package th.p047co.dtac.android.dtacone.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.density.ScreenSizeHelper;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBoxTryAgain;

/* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogBoxTryAgain */
/* loaded from: classes9.dex */
public class CustomDialogBoxTryAgain extends AppCompatDialog {

    /* renamed from: f */
    public Callback f107275f;

    /* renamed from: g */
    public Context f107276g;

    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.CustomDialogBoxTryAgain$Callback */
    /* loaded from: classes9.dex */
    public interface Callback {
        void onCancel();

        void onTryAgain();
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    public CustomDialogBoxTryAgain(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    public /* synthetic */ void m1695h(View view) {
        Callback callback = this.f107275f;
        if (callback != null) {
            callback.onTryAgain();
        }
        dismiss();
    }

    /* renamed from: i */
    public final /* synthetic */ void m1694i(View view) {
        Callback callback = this.f107275f;
        if (callback != null) {
            callback.onCancel();
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Button button = (Button) findViewById(R.id.alert_box_button);
        Button button2 = (Button) findViewById(R.id.alert_box_button_cancel);
        if (ScreenSizeHelper.isTableSW600(this.f107276g.getResources().getDisplayMetrics())) {
            button.getLayoutParams().width = 260;
        }
        ((TextView) findViewById(R.id.tvDate)).setText(String.format("%s %s", "วันที่", DateUtil.displayDateTimeOnErrorDialog()));
        button.setOnClickListener(new View.OnClickListener() { // from class: aA
            {
                CustomDialogBoxTryAgain.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomDialogBoxTryAgain.this.m1695h(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: bA
            {
                CustomDialogBoxTryAgain.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomDialogBoxTryAgain.this.m1694i(view);
            }
        });
    }

    public void setError() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        button.setBackgroundResource(R.drawable.z_button_error);
        button.setText(R.string.ok);
    }

    public void setErrorInformation(String str) {
        setError();
        TextView textView = (TextView) findViewById(R.id.tvErrorCode);
        int i = 0;
        textView.setText(String.format("%s: %s", "ข้อผิดพลาด", str));
        if (!StringUtil.hasText(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public void setHideCancel() {
        ((Button) findViewById(R.id.alert_box_button_cancel)).setVisibility(8);
    }

    public void setMessage(String str) {
        ((TextView) findViewById(R.id.alert_message)).setText(str);
    }

    public void setSuccess() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        button.setBackgroundResource(R.drawable.z_button_success);
        button.setText(R.string.ok);
    }

    public void setTryAgain() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        button.setBackgroundResource(R.drawable.z_button_blue);
        button.setText(R.string.try_again);
        Button button2 = (Button) findViewById(R.id.alert_box_button_cancel);
        button2.setVisibility(0);
        button2.setText(R.string.cancel_text);
    }

    public void setWarning() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        button.setBackgroundResource(R.drawable.z_button_blue);
        button.setText(R.string.ok);
    }

    public CustomDialogBoxTryAgain(Context context, Callback callback) {
        this(context, false, null, callback);
    }

    public CustomDialogBoxTryAgain(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener, Callback callback) {
        super(context, z, onCancelListener);
        this.f107275f = callback;
        this.f107276g = context;
        requestWindowFeature(1);
        setContentView(R.layout.z_alert_box_tryagain);
    }

    public void setMessage(@StringRes int i) {
        ((TextView) findViewById(R.id.alert_message)).setText(getContext().getString(i));
    }
}