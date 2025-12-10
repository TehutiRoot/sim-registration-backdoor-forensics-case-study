package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ae */
/* loaded from: classes5.dex */
public abstract class AbstractC9238ae extends AbstractC9758w<LinearLayout> {
    public static char ThreeDS2ServiceInstance = 0;
    private static int createTransaction = 1;
    public static int get;
    private static int getWarnings;
    public static long valueOf;
    private static final int values;
    private ImageView ThreeDS2Service;
    private ImageView initialize;

    static {
        get();
        values = C9624nm.valueOf(100);
        int i = getWarnings + 105;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    public AbstractC9238ae(Context context) {
        super(context);
    }

    private void ThreeDS2Service(ImageView imageView, Bitmap bitmap) {
        int i = (getWarnings + 83) % 128;
        createTransaction = i;
        if (bitmap != null) {
            getWarnings = (i + 27) % 128;
            ThreeDS2Service().setVisibility(0);
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
        }
        int i2 = createTransaction + 15;
        getWarnings = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        throw null;
    }

    public static void get() {
        get = -1608157163;
        ThreeDS2ServiceInstance = (char) 0;
        valueOf = 0L;
    }

    public abstract Drawable ThreeDS2ServiceInstance();

    @SuppressLint({"RtlHardcoded"})
    public LinearLayout ThreeDS2ServiceInstance(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, values));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        int i = C9375et.values;
        linearLayout.setPadding(i, i, i, i);
        LinearLayout.LayoutParams valueOf2 = valueOf();
        int i2 = C9375et.ThreeDS2ServiceInstance;
        valueOf2.rightMargin = i2;
        LinearLayout valueOf3 = valueOf(linearLayout, valueOf2, 3);
        LinearLayout.LayoutParams valueOf4 = valueOf();
        valueOf4.leftMargin = i2;
        LinearLayout valueOf5 = valueOf(linearLayout, valueOf4, 5);
        Object[] objArr = new Object[1];
        get(View.getDefaultSize(0, 0) - 1529702755, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "斈\uf615힕\ue406푼\uf4a5ﰐ\uecc7\ueaa6䍝絓ꗢ┊뾌㬰苑뷧呥ᓳᕝཬ꒯ѫ䦱純", "鶖튖檤赚", "\u0000\u0000\u0000\u0000", objArr);
        this.ThreeDS2Service = get(valueOf3, 3, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        get((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 347518848, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), "셓ˬ腺瘔欷䱹譡료༜羧굷ᦙ⾯\uffff\uee62鏽҂巍䀶娕퇢", "腂뚷贔鹫", "\u0000\u0000\u0000\u0000", objArr2);
        this.initialize = get(valueOf5, 5, ((String) objArr2[0]).intern());
        createTransaction = (getWarnings + 17) % 128;
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        getWarnings = (createTransaction + 33) % 128;
        values();
        ThreeDS2Service(this.ThreeDS2Service, setallcaps.initialize().values());
        ThreeDS2Service(this.initialize, setallcaps.getSDKInfo().values());
        getWarnings = (createTransaction + 103) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    @SuppressLint({"RtlHardcoded"})
    public /* synthetic */ LinearLayout get(Context context) {
        getWarnings = (createTransaction + 115) % 128;
        LinearLayout ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context);
        createTransaction = (getWarnings + 125) % 128;
        return ThreeDS2ServiceInstance2;
    }

    private ImageView get(ViewGroup viewGroup, int i, String str) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = i;
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        imageView.setBackground(ThreeDS2ServiceInstance());
        int i2 = C9375et.ThreeDS2ServiceInstance;
        imageView.setPadding(i2, i2, i2, i2);
        values(imageView, str);
        viewGroup.addView(imageView);
        getWarnings = (createTransaction + 81) % 128;
        return imageView;
    }

    private LinearLayout.LayoutParams valueOf() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        int i = createTransaction + 39;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            return layoutParams;
        }
        throw null;
    }

    private LinearLayout valueOf(ViewGroup viewGroup, LinearLayout.LayoutParams layoutParams, int i) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(i | 16);
        linearLayout.setOrientation(0);
        viewGroup.addView(linearLayout);
        getWarnings = (createTransaction + 13) % 128;
        return linearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r11 == 0) goto Le
            char[] r11 = r11.toCharArray()
        Le:
            char[] r11 = (char[]) r11
            if (r10 == 0) goto L16
            char[] r10 = r10.toCharArray()
        L16:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.cleanup.get
            monitor-enter(r0)
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r11[r1]     // Catch: java.lang.Throwable -> L7c
            r9 = r9 ^ r2
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L7c
            r11[r1] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 2
            char r2 = r12[r9]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r10.length     // Catch: java.lang.Throwable -> L7c
            char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r11[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r12[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.values = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r11[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.AbstractC9238ae.valueOf     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.AbstractC9238ae.get     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.AbstractC9238ae.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r9[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.AbstractC9238ae.get(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}
