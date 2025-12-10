package p000;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.browser.R;
import androidx.browser.browseractions.BrowserActionItem;
import androidx.browser.browseractions.BrowserActionsFallbackMenuView;
import androidx.core.widget.TextViewCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.protocol.HTTP;

/* renamed from: Jc */
/* loaded from: classes.dex */
public class C0682Jc implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final Context f2837a;

    /* renamed from: b */
    public final Uri f2838b;

    /* renamed from: c */
    public final List f2839c;

    /* renamed from: d */
    public DialogC0609Ic f2840d;

    /* renamed from: Jc$a */
    /* loaded from: classes.dex */
    public class RunnableC0683a implements Runnable {
        public RunnableC0683a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) C0682Jc.this.f2837a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(ImagesContract.URL, C0682Jc.this.f2838b.toString()));
            Toast.makeText(C0682Jc.this.f2837a, C0682Jc.this.f2837a.getString(R.string.copy_toast_msg), 0).show();
        }
    }

    /* renamed from: Jc$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0684b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f2842a;

        public View$OnClickListenerC0684b(TextView textView) {
            this.f2842a = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextViewCompat.getMaxLines(this.f2842a) == Integer.MAX_VALUE) {
                this.f2842a.setMaxLines(1);
                this.f2842a.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.f2842a.setMaxLines(Integer.MAX_VALUE);
            this.f2842a.setEllipsize(null);
        }
    }

    public C0682Jc(Context context, Uri uri, List list) {
        this.f2837a = context;
        this.f2838b = uri;
        this.f2839c = m67737b(list);
    }

    /* renamed from: a */
    public final Runnable m67738a() {
        return new RunnableC0683a();
    }

    /* renamed from: b */
    public final List m67737b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BrowserActionItem(this.f2837a.getString(R.string.fallback_menu_item_open_in_browser), m67736c()));
        arrayList.add(new BrowserActionItem(this.f2837a.getString(R.string.fallback_menu_item_copy_link), m67738a()));
        arrayList.add(new BrowserActionItem(this.f2837a.getString(R.string.fallback_menu_item_share_link), m67735d()));
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public final PendingIntent m67736c() {
        return PendingIntent.getActivity(this.f2837a, 0, new Intent("android.intent.action.VIEW", this.f2838b), 67108864);
    }

    /* renamed from: d */
    public final PendingIntent m67735d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f2838b.toString());
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        return PendingIntent.getActivity(this.f2837a, 0, intent, 67108864);
    }

    /* renamed from: e */
    public void m67734e() {
        View inflate = LayoutInflater.from(this.f2837a).inflate(R.layout.browser_actions_context_menu_page, (ViewGroup) null);
        DialogC0609Ic dialogC0609Ic = new DialogC0609Ic(this.f2837a, m67733f(inflate));
        this.f2840d = dialogC0609Ic;
        dialogC0609Ic.setContentView(inflate);
        this.f2840d.show();
    }

    /* renamed from: f */
    public final BrowserActionsFallbackMenuView m67733f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(R.id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(R.id.browser_actions_header_text);
        textView.setText(this.f2838b.toString());
        textView.setOnClickListener(new View$OnClickListenerC0684b(textView));
        ListView listView = (ListView) view.findViewById(R.id.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new C0536Hc(this.f2839c, this.f2837a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f2839c.get(i);
        if (browserActionItem.getAction() != null) {
            try {
                browserActionItem.getAction().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (browserActionItem.m64070a() != null) {
            browserActionItem.m64070a().run();
        }
        DialogC0609Ic dialogC0609Ic = this.f2840d;
        if (dialogC0609Ic == null) {
            return;
        }
        dialogC0609Ic.dismiss();
    }
}
