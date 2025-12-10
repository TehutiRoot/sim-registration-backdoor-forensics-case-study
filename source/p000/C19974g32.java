package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64OutputStream;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.net.SyslogConstants;
import com.mixpanel.android.mpmetrics.MPConfig;
import com.mixpanel.android.mpmetrics.ResourceIds;
import com.mixpanel.android.util.MPLog;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* renamed from: g32  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C19974g32 {

    /* renamed from: a */
    public final MPConfig f62031a;

    /* renamed from: c */
    public final List f62033c;

    /* renamed from: f */
    public final ResourceIds f62036f;

    /* renamed from: e */
    public final Handler f62035e = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CallableC10273c f62032b = new CallableC10273c();

    /* renamed from: d */
    public final C10272b f62034d = new C10272b(255);

    /* renamed from: g32$a */
    /* loaded from: classes5.dex */
    public static class C10271a {

        /* renamed from: b */
        public final Paint f62038b = new Paint(2);

        /* renamed from: a */
        public Bitmap f62037a = null;

        /* renamed from: a */
        public synchronized void m31238a(int i, int i2, int i3, Bitmap bitmap) {
            Bitmap bitmap2 = this.f62037a;
            if (bitmap2 == null || bitmap2.getWidth() != i || this.f62037a.getHeight() != i2) {
                try {
                    this.f62037a = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
                } catch (OutOfMemoryError unused) {
                    this.f62037a = null;
                }
                Bitmap bitmap3 = this.f62037a;
                if (bitmap3 != null) {
                    bitmap3.setDensity(i3);
                }
            }
            if (this.f62037a != null) {
                new Canvas(this.f62037a).drawBitmap(bitmap, 0.0f, 0.0f, this.f62038b);
            }
        }

        /* renamed from: b */
        public synchronized void m31237b(Bitmap.CompressFormat compressFormat, int i, OutputStream outputStream) {
            try {
                Bitmap bitmap = this.f62037a;
                if (bitmap != null && bitmap.getWidth() != 0 && this.f62037a.getHeight() != 0) {
                    outputStream.write(34);
                    Base64OutputStream base64OutputStream = new Base64OutputStream(outputStream, 2);
                    this.f62037a.compress(Bitmap.CompressFormat.PNG, 100, base64OutputStream);
                    base64OutputStream.flush();
                    outputStream.write(34);
                }
                outputStream.write(AbstractJsonLexerKt.NULL.getBytes());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g32$b */
    /* loaded from: classes5.dex */
    public static class C10272b extends LruCache {
        public C10272b(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public String create(Class cls) {
            return cls.getCanonicalName();
        }
    }

    /* renamed from: g32$c */
    /* loaded from: classes5.dex */
    public static class CallableC10273c implements Callable {

        /* renamed from: a */
        public IW1 f62039a;

        /* renamed from: e */
        public final int f62043e = SyslogConstants.LOG_LOCAL4;

        /* renamed from: c */
        public final DisplayMetrics f62041c = new DisplayMetrics();

        /* renamed from: b */
        public final List f62040b = new ArrayList();

        /* renamed from: d */
        public final C10271a f62042d = new C10271a();

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            this.f62040b.clear();
            for (Activity activity : this.f62039a.m67894b()) {
                String canonicalName = activity.getClass().getCanonicalName();
                View rootView = activity.getWindow().getDecorView().getRootView();
                activity.getWindowManager().getDefaultDisplay().getMetrics(this.f62041c);
                this.f62040b.add(new C10274d(canonicalName, rootView));
            }
            int size = this.f62040b.size();
            for (int i = 0; i < size; i++) {
                m31233c((C10274d) this.f62040b.get(i));
            }
            return this.f62040b;
        }

        /* renamed from: b */
        public void m31234b(IW1 iw1) {
            this.f62039a = iw1;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m31233c(p000.C19974g32.C10274d r14) {
            /*
                Method dump skipped, instructions count: 222
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C19974g32.CallableC10273c.m31233c(g32$d):void");
        }
    }

    /* renamed from: g32$d */
    /* loaded from: classes5.dex */
    public static class C10274d {

        /* renamed from: a */
        public final String f62044a;

        /* renamed from: b */
        public final View f62045b;

        /* renamed from: c */
        public C10271a f62046c = null;

        /* renamed from: d */
        public float f62047d = 1.0f;

        public C10274d(String str, View view) {
            this.f62044a = str;
            this.f62045b = view;
        }
    }

    public C19974g32(Context context, List list, ResourceIds resourceIds) {
        this.f62031a = MPConfig.getInstance(context);
        this.f62033c = list;
        this.f62036f = resourceIds;
    }

    /* renamed from: a */
    public final void m31242a(JsonWriter jsonWriter, View view) {
        C13106ph c13106ph;
        Object m23635a;
        Class<?> cls = view.getClass();
        for (C17622Fo1 c17622Fo1 : this.f62033c) {
            if (c17622Fo1.f1700b.isAssignableFrom(cls) && (c13106ph = c17622Fo1.f1701c) != null && (m23635a = c13106ph.m23635a(view)) != null) {
                if (m23635a instanceof Number) {
                    jsonWriter.name(c17622Fo1.f1699a).value((Number) m23635a);
                } else if (m23635a instanceof Boolean) {
                    jsonWriter.name(c17622Fo1.f1699a).value(((Boolean) m23635a).booleanValue());
                } else if (m23635a instanceof ColorStateList) {
                    jsonWriter.name(c17622Fo1.f1699a).value(Integer.valueOf(((ColorStateList) m23635a).getDefaultColor()));
                } else if (m23635a instanceof Drawable) {
                    Drawable drawable = (Drawable) m23635a;
                    Rect bounds = drawable.getBounds();
                    jsonWriter.name(c17622Fo1.f1699a);
                    jsonWriter.beginObject();
                    jsonWriter.name("classes");
                    jsonWriter.beginArray();
                    for (Class<?> cls2 = drawable.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                        jsonWriter.value(cls2.getCanonicalName());
                    }
                    jsonWriter.endArray();
                    jsonWriter.name("dimensions");
                    jsonWriter.beginObject();
                    jsonWriter.name("left").value(bounds.left);
                    jsonWriter.name("right").value(bounds.right);
                    jsonWriter.name("top").value(bounds.top);
                    jsonWriter.name("bottom").value(bounds.bottom);
                    jsonWriter.endObject();
                    if (drawable instanceof ColorDrawable) {
                        jsonWriter.name(TypedValues.Custom.S_COLOR).value(((ColorDrawable) drawable).getColor());
                    }
                    jsonWriter.endObject();
                } else {
                    jsonWriter.name(c17622Fo1.f1699a).value(m23635a.toString());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m31241b(JsonWriter jsonWriter, View view) {
        String nameForId;
        View childAt;
        if (view.getVisibility() == 4 && this.f62031a.getIgnoreInvisibleViewsEditor()) {
            return;
        }
        int id2 = view.getId();
        if (-1 == id2) {
            nameForId = null;
        } else {
            nameForId = this.f62036f.nameForId(id2);
        }
        jsonWriter.beginObject();
        jsonWriter.name("hashCode").value(view.hashCode());
        jsonWriter.name("id").value(id2);
        jsonWriter.name("mp_id_name").value(nameForId);
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription == null) {
            jsonWriter.name("contentDescription").nullValue();
        } else {
            jsonWriter.name("contentDescription").value(contentDescription.toString());
        }
        Object tag = view.getTag();
        if (tag == null) {
            jsonWriter.name("tag").nullValue();
        } else if (tag instanceof CharSequence) {
            jsonWriter.name("tag").value(tag.toString());
        }
        jsonWriter.name("top").value(view.getTop());
        jsonWriter.name("left").value(view.getLeft());
        jsonWriter.name("width").value(view.getWidth());
        jsonWriter.name("height").value(view.getHeight());
        jsonWriter.name("scrollX").value(view.getScrollX());
        jsonWriter.name("scrollY").value(view.getScrollY());
        jsonWriter.name("visibility").value(view.getVisibility());
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        jsonWriter.name("translationX").value(translationX);
        jsonWriter.name("translationY").value(translationY);
        jsonWriter.name("classes");
        jsonWriter.beginArray();
        Class<?> cls = view.getClass();
        do {
            jsonWriter.value((String) this.f62034d.get(cls));
            cls = cls.getSuperclass();
            if (cls == Object.class) {
                break;
            }
        } while (cls != null);
        jsonWriter.endArray();
        m31242a(jsonWriter, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            int[] rules = ((RelativeLayout.LayoutParams) layoutParams).getRules();
            jsonWriter.name("layoutRules");
            jsonWriter.beginArray();
            for (int i : rules) {
                jsonWriter.value(i);
            }
            jsonWriter.endArray();
        }
        jsonWriter.name("subviews");
        jsonWriter.beginArray();
        boolean z = view instanceof ViewGroup;
        if (z) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (viewGroup.getChildAt(i2) != null) {
                    jsonWriter.value(childAt.hashCode());
                }
            }
        }
        jsonWriter.endArray();
        jsonWriter.endObject();
        if (z) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int childCount2 = viewGroup2.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                if (childAt2 != null) {
                    m31241b(jsonWriter, childAt2);
                }
            }
        }
    }

    /* renamed from: c */
    public void m31240c(JsonWriter jsonWriter, View view) {
        jsonWriter.beginArray();
        m31241b(jsonWriter, view);
        jsonWriter.endArray();
    }

    /* renamed from: d */
    public void m31239d(IW1 iw1, OutputStream outputStream) {
        this.f62032b.m31234b(iw1);
        FutureTask futureTask = new FutureTask(this.f62032b);
        this.f62035e.post(futureTask);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        List emptyList = Collections.emptyList();
        outputStreamWriter.write("[");
        try {
            emptyList = (List) futureTask.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            MPLog.m33458d("MixpanelAPI.Snapshot", "Screenshot interrupted, no screenshot will be sent.", e);
        } catch (ExecutionException e2) {
            MPLog.m33456e("MixpanelAPI.Snapshot", "Exception thrown during screenshot attempt", e2);
        } catch (TimeoutException e3) {
            MPLog.m33454i("MixpanelAPI.Snapshot", "Screenshot took more than 1 second to be scheduled and executed. No screenshot will be sent.", e3);
        }
        int size = emptyList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                outputStreamWriter.write(",");
            }
            C10274d c10274d = (C10274d) emptyList.get(i);
            outputStreamWriter.write("{");
            outputStreamWriter.write("\"activity\":");
            outputStreamWriter.write(JSONObject.quote(c10274d.f62044a));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"scale\":");
            outputStreamWriter.write(String.format("%s", Float.valueOf(c10274d.f62047d)));
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"serialized_objects\":");
            JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
            jsonWriter.beginObject();
            jsonWriter.name("rootObject").value(c10274d.f62045b.hashCode());
            jsonWriter.name("objects");
            m31240c(jsonWriter, c10274d.f62045b);
            jsonWriter.endObject();
            jsonWriter.flush();
            outputStreamWriter.write(",");
            outputStreamWriter.write("\"screenshot\":");
            outputStreamWriter.flush();
            c10274d.f62046c.m31237b(Bitmap.CompressFormat.PNG, 100, outputStream);
            outputStreamWriter.write("}");
        }
        outputStreamWriter.write("]");
        outputStreamWriter.flush();
    }
}
