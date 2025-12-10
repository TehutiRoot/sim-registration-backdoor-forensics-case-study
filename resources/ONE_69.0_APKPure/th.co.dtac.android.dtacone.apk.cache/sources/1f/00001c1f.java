package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ActivityChooserModel extends DataSetObservable {

    /* renamed from: n */
    public static final Object f9614n = new Object();

    /* renamed from: o */
    public static final Map f9615o = new HashMap();

    /* renamed from: d */
    public final Context f9619d;

    /* renamed from: e */
    public final String f9620e;

    /* renamed from: f */
    public Intent f9621f;

    /* renamed from: m */
    public OnChooseActivityListener f9628m;

    /* renamed from: a */
    public final Object f9616a = new Object();

    /* renamed from: b */
    public final List f9617b = new ArrayList();

    /* renamed from: c */
    public final List f9618c = new ArrayList();

    /* renamed from: g */
    public ActivitySorter f9622g = new C2153a();

    /* renamed from: h */
    public int f9623h = 50;

    /* renamed from: i */
    public boolean f9624i = true;

    /* renamed from: j */
    public boolean f9625j = false;

    /* renamed from: k */
    public boolean f9626k = true;

    /* renamed from: l */
    public boolean f9627l = false;

    /* loaded from: classes.dex */
    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    /* loaded from: classes.dex */
    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        @Override // java.lang.Comparable
        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }
    }

    /* loaded from: classes.dex */
    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    /* loaded from: classes.dex */
    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            if (this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j = this.time;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public String toString() {
            return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(this.weight) + "]";
        }

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }
    }

    /* loaded from: classes.dex */
    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserModel$a */
    /* loaded from: classes.dex */
    public static final class C2153a implements ActivitySorter {

        /* renamed from: a */
        public final Map f9629a = new HashMap();

        @Override // androidx.appcompat.widget.ActivityChooserModel.ActivitySorter
        public void sort(Intent intent, List list, List list2) {
            Map map = this.f9629a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) list.get(i);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = (HistoricalRecord) list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActivityChooserModel$b */
    /* loaded from: classes.dex */
    public final class AsyncTaskC2154b extends AsyncTask {
        public AsyncTaskC2154b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
            if (r15 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
            if (r15 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.ActivityChooserModel r7 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch: java.io.FileNotFoundException -> Lc9
                android.content.Context r7 = r7.f9619d     // Catch: java.io.FileNotFoundException -> Lc9
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch: java.io.FileNotFoundException -> Lc9
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.startDocument(r8, r9)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.startTag(r6, r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                int r8 = r4.size()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r9 = 0
            L31:
                if (r9 >= r8) goto L66
                java.lang.Object r10 = r4.remove(r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r10 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r10     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.startTag(r6, r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.activity     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r12 = r12.flattenToString()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.attribute(r6, r11, r12)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r11 = "time"
                long r12 = r10.time     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.attribute(r6, r11, r12)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r11 = "weight"
                float r10 = r10.weight     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.attribute(r6, r11, r10)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.endTag(r6, r0)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                int r9 = r9 + r5
                goto L31
            L64:
                r0 = move-exception
                goto Lbf
            L66:
                r7.endTag(r6, r1)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                r7.endDocument()     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L76 java.lang.IllegalStateException -> L8e java.lang.IllegalArgumentException -> La6
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f9624i = r5
                if (r15 == 0) goto Lbe
            L72:
                r15.close()     // Catch: java.io.IOException -> Lbe
                goto Lbe
            L76:
                java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.f9614n     // Catch: java.lang.Throwable -> L64
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
                r0.<init>()     // Catch: java.lang.Throwable -> L64
                r0.append(r2)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = r1.f9620e     // Catch: java.lang.Throwable -> L64
                r0.append(r1)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f9624i = r5
                if (r15 == 0) goto Lbe
                goto L72
            L8e:
                java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.f9614n     // Catch: java.lang.Throwable -> L64
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
                r0.<init>()     // Catch: java.lang.Throwable -> L64
                r0.append(r2)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = r1.f9620e     // Catch: java.lang.Throwable -> L64
                r0.append(r1)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f9624i = r5
                if (r15 == 0) goto Lbe
                goto L72
            La6:
                java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.f9614n     // Catch: java.lang.Throwable -> L64
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
                r0.<init>()     // Catch: java.lang.Throwable -> L64
                r0.append(r2)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = r1.f9620e     // Catch: java.lang.Throwable -> L64
                r0.append(r1)     // Catch: java.lang.Throwable -> L64
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.f9624i = r5
                if (r15 == 0) goto Lbe
                goto L72
            Lbe:
                return r6
            Lbf:
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this
                r1.f9624i = r5
                if (r15 == 0) goto Lc8
                r15.close()     // Catch: java.io.IOException -> Lc8
            Lc8:
                throw r0
            Lc9:
                java.lang.Object r0 = androidx.appcompat.widget.ActivityChooserModel.f9614n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r15)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.AsyncTaskC2154b.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public ActivityChooserModel(Context context, String str) {
        this.f9619d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.f9620e = str + ".xml";
            return;
        }
        this.f9620e = str;
    }

    /* renamed from: d */
    public static ActivityChooserModel m64344d(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (f9614n) {
            try {
                Map map = f9615o;
                activityChooserModel = (ActivityChooserModel) map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return activityChooserModel;
    }

    /* renamed from: a */
    public final boolean m64347a(HistoricalRecord historicalRecord) {
        boolean add = this.f9618c.add(historicalRecord);
        if (add) {
            this.f9626k = true;
            m64336l();
            m64337k();
            m64330r();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: b */
    public Intent m64346b(int i) {
        synchronized (this.f9616a) {
            try {
                if (this.f9621f == null) {
                    return null;
                }
                m64345c();
                ActivityInfo activityInfo = ((ActivityResolveInfo) this.f9617b.get(i)).resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f9621f);
                intent.setComponent(componentName);
                if (this.f9628m != null) {
                    if (this.f9628m.onChooseActivity(this, new Intent(intent))) {
                        return null;
                    }
                }
                m64347a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m64345c() {
        boolean m64338j = m64338j() | m64335m();
        m64336l();
        if (m64338j) {
            m64330r();
            notifyChanged();
        }
    }

    /* renamed from: e */
    public ResolveInfo m64343e(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f9616a) {
            m64345c();
            resolveInfo = ((ActivityResolveInfo) this.f9617b.get(i)).resolveInfo;
        }
        return resolveInfo;
    }

    /* renamed from: f */
    public int m64342f() {
        int size;
        synchronized (this.f9616a) {
            m64345c();
            size = this.f9617b.size();
        }
        return size;
    }

    /* renamed from: g */
    public int m64341g(ResolveInfo resolveInfo) {
        synchronized (this.f9616a) {
            try {
                m64345c();
                List list = this.f9617b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((ActivityResolveInfo) list.get(i)).resolveInfo == resolveInfo) {
                        return i;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public ResolveInfo m64340h() {
        synchronized (this.f9616a) {
            try {
                m64345c();
                if (!this.f9617b.isEmpty()) {
                    return ((ActivityResolveInfo) this.f9617b.get(0)).resolveInfo;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public int m64339i() {
        int size;
        synchronized (this.f9616a) {
            m64345c();
            size = this.f9618c.size();
        }
        return size;
    }

    /* renamed from: j */
    public final boolean m64338j() {
        if (!this.f9627l || this.f9621f == null) {
            return false;
        }
        this.f9627l = false;
        this.f9617b.clear();
        List<ResolveInfo> queryIntentActivities = this.f9619d.getPackageManager().queryIntentActivities(this.f9621f, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f9617b.add(new ActivityResolveInfo(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: k */
    public final void m64337k() {
        if (this.f9625j) {
            if (!this.f9626k) {
                return;
            }
            this.f9626k = false;
            if (!TextUtils.isEmpty(this.f9620e)) {
                new AsyncTaskC2154b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f9618c), this.f9620e);
                return;
            }
            return;
        }
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    /* renamed from: l */
    public final void m64336l() {
        int size = this.f9618c.size() - this.f9623h;
        if (size <= 0) {
            return;
        }
        this.f9626k = true;
        for (int i = 0; i < size; i++) {
            HistoricalRecord historicalRecord = (HistoricalRecord) this.f9618c.remove(0);
        }
    }

    /* renamed from: m */
    public final boolean m64335m() {
        if (!this.f9624i || !this.f9626k || TextUtils.isEmpty(this.f9620e)) {
            return false;
        }
        this.f9624i = false;
        this.f9625j = true;
        m64334n();
        return true;
    }

    /* renamed from: n */
    public final void m64334n() {
        FileInputStream fileInputStream;
        XmlPullParser newPullParser;
        try {
            try {
                FileInputStream openFileInput = this.f9619d.openFileInput(this.f9620e);
                try {
                    newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                } catch (IOException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error reading historical recrod file: ");
                    sb.append(this.f9620e);
                    if (openFileInput == null) {
                        return;
                    }
                } catch (XmlPullParserException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error reading historical recrod file: ");
                    sb2.append(this.f9620e);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.f9618c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (next != 3 && next != 4) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new HistoricalRecord(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (Throwable th2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    /* renamed from: o */
    public void m64333o(int i) {
        float f;
        synchronized (this.f9616a) {
            try {
                m64345c();
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.f9617b.get(i);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) this.f9617b.get(0);
                if (activityResolveInfo2 != null) {
                    f = (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f;
                } else {
                    f = 1.0f;
                }
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                m64347a(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p */
    public void m64332p(Intent intent) {
        synchronized (this.f9616a) {
            try {
                if (this.f9621f == intent) {
                    return;
                }
                this.f9621f = intent;
                this.f9627l = true;
                m64345c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public void m64331q(OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.f9616a) {
            this.f9628m = onChooseActivityListener;
        }
    }

    /* renamed from: r */
    public final boolean m64330r() {
        if (this.f9622g != null && this.f9621f != null && !this.f9617b.isEmpty() && !this.f9618c.isEmpty()) {
            this.f9622g.sort(this.f9621f, this.f9617b, Collections.unmodifiableList(this.f9618c));
            return true;
        }
        return false;
    }
}