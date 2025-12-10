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
public class C0670Jc implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final Context f3043a;

    /* renamed from: b */
    public final Uri f3044b;

    /* renamed from: c */
    public final List f3045c;

    /* renamed from: d */
    public DialogC0599Ic f3046d;

    /* renamed from: Jc$a */
    /* loaded from: classes.dex */
    public class RunnableC0671a implements Runnable {
        public RunnableC0671a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) C0670Jc.this.f3043a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(ImagesContract.URL, C0670Jc.this.f3044b.toString()));
            Toast.makeText(C0670Jc.this.f3043a, C0670Jc.this.f3043a.getString(R.string.copy_toast_msg), 0).show();
        }
    }

    /* renamed from: Jc$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0672b implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f3048a;

        public View$OnClickListenerC0672b(TextView textView) {
            this.f3048a = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextViewCompat.getMaxLines(this.f3048a) == Integer.MAX_VALUE) {
                this.f3048a.setMaxLines(1);
                this.f3048a.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
            this.f3048a.setMaxLines(Integer.MAX_VALUE);
            this.f3048a.setEllipsize(null);
        }
    }

    public C0670Jc(Context context, Uri uri, List list) {
        this.f3043a = context;
        this.f3044b = uri;
        this.f3045c = m67817b(list);
    }

    /* renamed from: a */
    public final Runnable m67818a() {
        return new RunnableC0671a();
    }

    /* renamed from: b */
    public final List m67817b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BrowserActionItem(this.f3043a.getString(R.string.fallback_menu_item_open_in_browser), m67816c()));
        arrayList.add(new BrowserActionItem(this.f3043a.getString(R.string.fallback_menu_item_copy_link), m67818a()));
        arrayList.add(new BrowserActionItem(this.f3043a.getString(R.string.fallback_menu_item_share_link), m67815d()));
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public final PendingIntent m67816c() {
        return PendingIntent.getActivity(this.f3043a, 0, new Intent("android.intent.action.VIEW", this.f3044b), 67108864);
    }

    /* renamed from: d */
    public final PendingIntent m67815d() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", this.f3044b.toString());
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        return PendingIntent.getActivity(this.f3043a, 0, intent, 67108864);
    }

    /* renamed from: e */
    public void m67814e() {
        View inflate = LayoutInflater.from(this.f3043a).inflate(R.layout.browser_actions_context_menu_page, (ViewGroup) null);
        DialogC0599Ic dialogC0599Ic = new DialogC0599Ic(this.f3043a, m67813f(inflate));
        this.f3046d = dialogC0599Ic;
        dialogC0599Ic.setContentView(inflate);
        this.f3046d.show();
    }

    /* renamed from: f */
    public final BrowserActionsFallbackMenuView m67813f(View view) {
        BrowserActionsFallbackMenuView browserActionsFallbackMenuView = (BrowserActionsFallbackMenuView) view.findViewById(R.id.browser_actions_menu_view);
        TextView textView = (TextView) view.findViewById(R.id.browser_actions_header_text);
        textView.setText(this.f3044b.toString());
        textView.setOnClickListener(new View$OnClickListenerC0672b(textView));
        ListView listView = (ListView) view.findViewById(R.id.browser_actions_menu_items);
        listView.setAdapter((ListAdapter) new C0529Hc(this.f3045c, this.f3043a));
        listView.setOnItemClickListener(this);
        return browserActionsFallbackMenuView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f3045c.get(i);
        if (browserActionItem.getAction() != null) {
            try {
                browserActionItem.getAction().send();
            } catch (PendingIntent.CanceledException unused) {
            }
        } else if (browserActionItem.m64021a() != null) {
            browserActionItem.m64021a().run();
        }
        DialogC0599Ic dialogC0599Ic = this.f3046d;
        if (dialogC0599Ic == null) {
            return;
        }
        dialogC0599Ic.dismiss();
    }
}