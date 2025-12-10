package com.mixpanel.android.viewcrawler;

import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mixpanel.android.util.MPLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class Pathfinder {

    /* renamed from: a */
    public final C9197a f58799a = new C9197a();

    /* loaded from: classes5.dex */
    public interface Accumulator {
        void accumulate(View view);
    }

    /* loaded from: classes5.dex */
    public static class PathElement {
        public static final int SHORTEST_PREFIX = 1;
        public static final int ZERO_LENGTH_PREFIX = 0;
        public final String contentDescription;
        public final int index;
        public final int prefix;
        public final String tag;
        public final String viewClassName;
        public final int viewId;

        public PathElement(int i, String str, int i2, int i3, String str2, String str3) {
            this.prefix = i;
            this.viewClassName = str;
            this.index = i2;
            this.viewId = i3;
            this.contentDescription = str2;
            this.tag = str3;
        }

        public String toString() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.prefix == 1) {
                    jSONObject.put("prefix", "shortest");
                }
                String str = this.viewClassName;
                if (str != null) {
                    jSONObject.put("view_class", str);
                }
                int i = this.index;
                if (i > -1) {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i);
                }
                int i2 = this.viewId;
                if (i2 > -1) {
                    jSONObject.put("id", i2);
                }
                String str2 = this.contentDescription;
                if (str2 != null) {
                    jSONObject.put("contentDescription", str2);
                }
                String str3 = this.tag;
                if (str3 != null) {
                    jSONObject.put("tag", str3);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                throw new RuntimeException("Can't serialize PathElement to String", e);
            }
        }
    }

    /* renamed from: com.mixpanel.android.viewcrawler.Pathfinder$a */
    /* loaded from: classes5.dex */
    public static class C9197a {

        /* renamed from: a */
        public final int[] f58800a = new int[256];

        /* renamed from: b */
        public int f58801b = 0;

        /* renamed from: a */
        public int m33416a() {
            int i = this.f58801b;
            this.f58801b = i + 1;
            this.f58800a[i] = 0;
            return i;
        }

        /* renamed from: b */
        public void m33415b() {
            int i = this.f58801b - 1;
            this.f58801b = i;
            if (i >= 0) {
                return;
            }
            throw new ArrayIndexOutOfBoundsException(this.f58801b);
        }

        /* renamed from: c */
        public boolean m33414c() {
            if (this.f58800a.length == this.f58801b) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public void m33413d(int i) {
            int[] iArr = this.f58800a;
            iArr[i] = iArr[i] + 1;
        }

        /* renamed from: e */
        public int m33412e(int i) {
            return this.f58800a[i];
        }
    }

    /* renamed from: d */
    public static boolean m33418d(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); !cls.getCanonicalName().equals(str); cls = cls.getSuperclass()) {
            if (cls == Object.class) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final View m33421a(PathElement pathElement, View view, int i) {
        int m33412e = this.f58799a.m33412e(i);
        if (m33417e(pathElement, view)) {
            this.f58799a.m33413d(i);
            int i2 = pathElement.index;
            if (i2 == -1 || i2 == m33412e) {
                return view;
            }
        }
        if (pathElement.prefix == 1 && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View m33421a = m33421a(pathElement, viewGroup.getChildAt(i3), i);
                if (m33421a != null) {
                    return m33421a;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public final void m33420b(View view, List list, Accumulator accumulator) {
        if (list.isEmpty()) {
            accumulator.accumulate(view);
        } else if (view instanceof ViewGroup) {
            if (this.f58799a.m33414c()) {
                MPLog.m33445v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            PathElement pathElement = (PathElement) list.get(0);
            List subList = list.subList(1, list.size());
            int childCount = viewGroup.getChildCount();
            int m33416a = this.f58799a.m33416a();
            for (int i = 0; i < childCount; i++) {
                View m33421a = m33421a(pathElement, viewGroup.getChildAt(i), m33416a);
                if (m33421a != null) {
                    m33420b(m33421a, subList, accumulator);
                }
                if (pathElement.index >= 0 && this.f58799a.m33412e(m33416a) > pathElement.index) {
                    break;
                }
            }
            this.f58799a.m33415b();
        }
    }

    /* renamed from: c */
    public void m33419c(View view, List list, Accumulator accumulator) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f58799a.m33414c()) {
            MPLog.m33443w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
            return;
        }
        List subList = list.subList(1, list.size());
        View m33421a = m33421a((PathElement) list.get(0), view, this.f58799a.m33416a());
        this.f58799a.m33415b();
        if (m33421a != null) {
            m33420b(m33421a, subList, accumulator);
        }
    }

    /* renamed from: e */
    public final boolean m33417e(PathElement pathElement, View view) {
        String str = pathElement.viewClassName;
        if (str != null && !m33418d(view, str)) {
            return false;
        }
        if (-1 != pathElement.viewId && view.getId() != pathElement.viewId) {
            return false;
        }
        String str2 = pathElement.contentDescription;
        if (str2 != null && !str2.equals(view.getContentDescription())) {
            return false;
        }
        String str3 = pathElement.tag;
        if (str3 != null) {
            if (view.getTag() == null || !str3.equals(view.getTag().toString())) {
                return false;
            }
            return true;
        }
        return true;
    }
}