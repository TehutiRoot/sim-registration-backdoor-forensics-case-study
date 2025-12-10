package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R;
import androidx.browser.browseractions.BrowserActionItem;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import androidx.core.content.res.ResourcesCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: Hc */
/* loaded from: classes.dex */
public class C0529Hc extends BaseAdapter {

    /* renamed from: a */
    public final List f2422a;

    /* renamed from: b */
    public final Context f2423b;

    /* renamed from: Hc$a */
    /* loaded from: classes.dex */
    public class RunnableC0530a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f2424a;

        /* renamed from: b */
        public final /* synthetic */ C0532c f2425b;

        /* renamed from: c */
        public final /* synthetic */ ListenableFuture f2426c;

        public RunnableC0530a(String str, C0532c c0532c, ListenableFuture listenableFuture) {
            this.f2424a = str;
            this.f2425b = c0532c;
            this.f2426c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (!TextUtils.equals(this.f2424a, this.f2425b.f2430b.getText())) {
                return;
            }
            try {
                bitmap = (Bitmap) this.f2426c.get();
            } catch (InterruptedException | ExecutionException unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                this.f2425b.f2429a.setVisibility(0);
                this.f2425b.f2429a.setImageBitmap(bitmap);
                return;
            }
            this.f2425b.f2429a.setVisibility(4);
            this.f2425b.f2429a.setImageBitmap(null);
        }
    }

    /* renamed from: Hc$b */
    /* loaded from: classes.dex */
    public class ExecutorC0531b implements Executor {
        public ExecutorC0531b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: Hc$c */
    /* loaded from: classes.dex */
    public static class C0532c {

        /* renamed from: a */
        public final ImageView f2429a;

        /* renamed from: b */
        public final TextView f2430b;

        public C0532c(ImageView imageView, TextView textView) {
            this.f2429a = imageView;
            this.f2430b = textView;
        }
    }

    public C0529Hc(List list, Context context) {
        this.f2422a = list;
        this.f2423b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2422a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f2422a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C0532c c0532c;
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f2422a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f2423b).inflate(R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(R.id.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(R.id.browser_actions_menu_item_text);
            if (imageView != null && textView != null) {
                c0532c = new C0532c(imageView, textView);
                view.setTag(c0532c);
            } else {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
        } else {
            c0532c = (C0532c) view.getTag();
        }
        String title = browserActionItem.getTitle();
        c0532c.f2430b.setText(title);
        if (browserActionItem.getIconId() != 0) {
            c0532c.f2429a.setImageDrawable(ResourcesCompat.getDrawable(this.f2423b.getResources(), browserActionItem.getIconId(), null));
        } else if (browserActionItem.getIconUri() != null) {
            ListenableFuture<Bitmap> loadBitmap = BrowserServiceFileProvider.loadBitmap(this.f2423b.getContentResolver(), browserActionItem.getIconUri());
            loadBitmap.addListener(new RunnableC0530a(title, c0532c, loadBitmap), new ExecutorC0531b());
        } else {
            c0532c.f2429a.setImageBitmap(null);
            c0532c.f2429a.setVisibility(4);
        }
        return view;
    }
}