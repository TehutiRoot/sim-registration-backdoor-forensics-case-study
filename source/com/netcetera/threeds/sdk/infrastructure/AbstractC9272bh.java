package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ExpandableListView;
import es.dmoral.toasty.BuildConfig;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.bh */
/* loaded from: classes5.dex */
public abstract class AbstractC9272bh<T extends View> extends AbstractC9758w<T> {
    private static int ThreeDS2ServiceInstance = 1;
    public static int get = 109;
    private static int values;
    private final InterfaceC9652ns ThreeDS2Service;
    private get valueOf;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.netcetera.threeds.sdk.infrastructure.bh$get */
    /* loaded from: classes5.dex */
    public static final class get {
        private static final /* synthetic */ get[] ThreeDS2Service;
        public static final get ThreeDS2ServiceInstance;
        private static int cleanup = 1;
        public static final get get;
        private static int valueOf;
        public static int values;

        static {
            get();
            Object[] objArr = new Object[1];
            valueOf(Color.green(0) + 1, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7, "\u0006\u0002\u0001\u0004\u0006\u0004\ufff3\ufffb", 208 - (ViewConfiguration.getScrollDefaultDelay() >> 16), false, objArr);
            get getVar = new get(((String) objArr[0]).intern(), 0);
            ThreeDS2ServiceInstance = getVar;
            Object[] objArr2 = new Object[1];
            valueOf(2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 9 - KeyEvent.normalizeMetaState(0), "\b�\u0004\ufff9\u0006￼\u000b\ufffb\ufff9", 201 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false, objArr2);
            get getVar2 = new get(((String) objArr2[0]).intern(), 1);
            get = getVar2;
            ThreeDS2Service = new get[]{getVar, getVar2};
            cleanup = (valueOf + 27) % 128;
        }

        private get(String str, int i) {
        }

        public static void get() {
            values = BuildConfig.VERSION_CODE;
        }

        public static get valueOf(String str) {
            valueOf = (cleanup + 41) % 128;
            get getVar = (get) Enum.valueOf(get.class, str);
            int i = cleanup + 95;
            valueOf = i % 128;
            if (i % 2 == 0) {
                return getVar;
            }
            throw null;
        }

        public static get[] values() {
            int i = valueOf + 43;
            cleanup = i % 128;
            if (i % 2 != 0) {
                get[] getVarArr = (get[]) ThreeDS2Service.clone();
                int i2 = valueOf + 41;
                cleanup = i2 % 128;
                if (i2 % 2 != 0) {
                    return getVarArr;
                }
                throw null;
            }
            ThreeDS2Service.clone();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r8 = r8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void valueOf(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
            /*
                if (r8 == 0) goto L6
                char[] r8 = r8.toCharArray()
            L6:
                char[] r8 = (char[]) r8
                java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
                monitor-enter(r0)
                char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                r2 = 0
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L10:
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r3 >= r7) goto L31
                char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
                int r4 = r4 + r9
                char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
                int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh.get.values     // Catch: java.lang.Throwable -> L2f
                int r4 = r4 - r5
                char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
                r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
                int r3 = r3 + 1
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
                goto L10
            L2f:
                r6 = move-exception
                goto L69
            L31:
                if (r6 <= 0) goto L48
                com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
                int r9 = r7 - r8
                java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
            L48:
                if (r10 == 0) goto L60
                char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
            L4e:
                int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
                if (r8 >= r7) goto L5f
                int r9 = r7 - r8
                int r9 = r9 + (-1)
                char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
                r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
                int r8 = r8 + 1
                com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
                goto L4e
            L5f:
                r1 = r6
            L60:
                java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
                r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
                r11[r2] = r6
                return
            L69:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh.get.valueOf(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
        }
    }

    public AbstractC9272bh(Context context) {
        super(context);
        this.ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(AbstractC9272bh.class);
    }

    private Point ThreeDS2Service(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        int i5 = ThreeDS2ServiceInstance + 1;
        values = i5 % 128;
        if (i5 % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 43) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            navigationBars = WindowInsets.Type.navigationBars();
            displayCutout = WindowInsets.Type.displayCutout();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
            i = insetsIgnoringVisibility.right;
            i2 = insetsIgnoringVisibility.left;
            int i6 = i + i2;
            i3 = insetsIgnoringVisibility.top;
            i4 = insetsIgnoringVisibility.bottom;
            bounds = currentWindowMetrics.getBounds();
            return new Point(bounds.width() - i6, bounds.height() - (i3 + i4));
        }
        Point ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(windowManager);
        ThreeDS2ServiceInstance = (values + 1) % 128;
        return ThreeDS2ServiceInstance2;
    }

    private Point ThreeDS2ServiceInstance(WindowManager windowManager) {
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        ThreeDS2ServiceInstance = (values + 83) % 128;
        return point;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r7) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r9
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh.get     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r6 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r7) goto L5f
            int r9 = r7 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9272bh.values(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public abstract void ThreeDS2Service(setAllCaps setallcaps);

    public abstract T ThreeDS2ServiceInstance(Context context);

    public abstract void ThreeDS2ServiceInstance(setAllCaps setallcaps);

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public final T get(Context context) {
        Object[] objArr = new Object[1];
        values(5 - View.MeasureSpec.getSize(0), 6 - TextUtils.indexOf("", "", 0, 0), "\ufffb\u0000\ufff6\u0001\t\t", TextUtils.indexOf((CharSequence) "", '0') + 220, false, objArr);
        WindowManager windowManager = (WindowManager) context.getSystemService(((String) objArr[0]).intern());
        if (windowManager == null) {
            values = (ThreeDS2ServiceInstance + CameraActivity.REQUEST_CODE) % 128;
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2Service;
            Object[] objArr2 = new Object[1];
            values(12 - Color.blue(0), Color.argb(0, 0, 0, 0) + 38, "\u0005\u0010\u0018\uffc1\u000e\u0002\u000f\u0002\b\u0006\u0013ￏ￤\u0010\u0016\r\u0005\uffc1\u000f\u0010\u0015\uffc1\u0013\u0006\u0015\u0013\n\u0006\u0017\u0006\uffc1\u0015\t\u0006\uffc1\u0018\n\u000f", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 203, false, objArr2);
            interfaceC9652ns.valueOf(((String) objArr2[0]).intern());
            this.valueOf = get.ThreeDS2ServiceInstance;
            T valueOf = valueOf(context);
            values = (ThreeDS2ServiceInstance + 31) % 128;
            return valueOf;
        }
        Point ThreeDS2Service = ThreeDS2Service(windowManager);
        if (ThreeDS2Service.x > ThreeDS2Service.y) {
            this.valueOf = get.get;
            return ThreeDS2ServiceInstance(context);
        }
        this.valueOf = get.ThreeDS2ServiceInstance;
        return valueOf(context);
    }

    public abstract T valueOf(Context context);

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public final void valueOf(setAllCaps setallcaps) {
        get getVar = this.valueOf;
        if (getVar != null) {
            ThreeDS2ServiceInstance = (values + 51) % 128;
            if (getVar == get.get) {
                int i = ThreeDS2ServiceInstance + 31;
                values = i % 128;
                if (i % 2 == 0) {
                    ThreeDS2ServiceInstance(setallcaps);
                    values = (ThreeDS2ServiceInstance + 87) % 128;
                    return;
                }
                ThreeDS2ServiceInstance(setallcaps);
                throw null;
            }
        }
        ThreeDS2Service(setallcaps);
    }
}
