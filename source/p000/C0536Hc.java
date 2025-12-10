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
public class C0536Hc extends BaseAdapter {

    /* renamed from: a */
    public final List f2259a;

    /* renamed from: b */
    public final Context f2260b;

    /* renamed from: Hc$a */
    /* loaded from: classes.dex */
    public class RunnableC0537a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f2261a;

        /* renamed from: b */
        public final /* synthetic */ C0539c f2262b;

        /* renamed from: c */
        public final /* synthetic */ ListenableFuture f2263c;

        public RunnableC0537a(String str, C0539c c0539c, ListenableFuture listenableFuture) {
            this.f2261a = str;
            this.f2262b = c0539c;
            this.f2263c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (!TextUtils.equals(this.f2261a, this.f2262b.f2267b.getText())) {
                return;
            }
            try {
                bitmap = (Bitmap) this.f2263c.get();
            } catch (InterruptedException | ExecutionException unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                this.f2262b.f2266a.setVisibility(0);
                this.f2262b.f2266a.setImageBitmap(bitmap);
                return;
            }
            this.f2262b.f2266a.setVisibility(4);
            this.f2262b.f2266a.setImageBitmap(null);
        }
    }

    /* renamed from: Hc$b */
    /* loaded from: classes.dex */
    public class ExecutorC0538b implements Executor {
        public ExecutorC0538b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: Hc$c */
    /* loaded from: classes.dex */
    public static class C0539c {

        /* renamed from: a */
        public final ImageView f2266a;

        /* renamed from: b */
        public final TextView f2267b;

        public C0539c(ImageView imageView, TextView textView) {
            this.f2266a = imageView;
            this.f2267b = textView;
        }
    }

    public C0536Hc(List list, Context context) {
        this.f2259a = list;
        this.f2260b = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2259a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f2259a.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C0539c c0539c;
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f2259a.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.f2260b).inflate(R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(R.id.browser_actions_menu_item_icon);
            TextView textView = (TextView) view.findViewById(R.id.browser_actions_menu_item_text);
            if (imageView != null && textView != null) {
                c0539c = new C0539c(imageView, textView);
                view.setTag(c0539c);
            } else {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
        } else {
            c0539c = (C0539c) view.getTag();
        }
        String title = browserActionItem.getTitle();
        c0539c.f2267b.setText(title);
        if (browserActionItem.getIconId() != 0) {
            c0539c.f2266a.setImageDrawable(ResourcesCompat.getDrawable(this.f2260b.getResources(), browserActionItem.getIconId(), null));
        } else if (browserActionItem.getIconUri() != null) {
            ListenableFuture<Bitmap> loadBitmap = BrowserServiceFileProvider.loadBitmap(this.f2260b.getContentResolver(), browserActionItem.getIconUri());
            loadBitmap.addListener(new RunnableC0537a(title, c0539c, loadBitmap), new ExecutorC0538b());
        } else {
            c0539c.f2266a.setImageBitmap(null);
            c0539c.f2266a.setVisibility(4);
        }
        return view;
    }
}
