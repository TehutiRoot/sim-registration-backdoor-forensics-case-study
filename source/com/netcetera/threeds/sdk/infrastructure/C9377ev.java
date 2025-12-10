package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ev */
/* loaded from: classes5.dex */
public final class C9377ev {
    public static long ThreeDS2Service = 0;
    private static final int ThreeDS2ServiceInstance;
    private static int get = 1;
    private static int valueOf;
    private static final int values;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        values("末月嶐ᔈ䆶킅쿙ᙄ䗩縣挕\ueabd∅", Drawable.resolveOpacity(0, 0) + 1, objArr);
        ThreeDS2ServiceInstance = Color.parseColor(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        values("䮱䮒ꍜ\uebc4釂ñ᎓쩘椥肹댷㛷້", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        values = Color.parseColor(((String) objArr2[0]).intern());
        int i = get + 55;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = 7007455008260638889L;
    }

    public static <T extends EditText> void get(T t, InterfaceC9513jq interfaceC9513jq) {
        int i = valueOf + 97;
        get = i % 128;
        if (i % 2 == 0) {
            values(t, interfaceC9513jq);
            int parseColor = Color.parseColor(interfaceC9513jq.ThreeDS2Service());
            t.setBackground(C9608my.ThreeDS2ServiceInstance(interfaceC9513jq.getWarnings(), interfaceC9513jq.values(), parseColor));
            int i2 = 45 / 0;
        } else {
            values(t, interfaceC9513jq);
            int parseColor2 = Color.parseColor(interfaceC9513jq.ThreeDS2Service());
            t.setBackground(C9608my.ThreeDS2ServiceInstance(interfaceC9513jq.getWarnings(), interfaceC9513jq.values(), parseColor2));
        }
        valueOf = (get + 67) % 128;
    }

    public static <T extends TextView> void valueOf(T t, InterfaceC9514jr interfaceC9514jr, int i) {
        get = (valueOf + 73) % 128;
        t.setTextColor(Color.parseColor(interfaceC9514jr.get()));
        t.setTextSize(2, interfaceC9514jr.ThreeDS2ServiceInstance());
        get(t, interfaceC9514jr, i);
        int i2 = get + 91;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        throw null;
    }

    public static <T extends TextView> void values(T t, InterfaceC9514jr interfaceC9514jr) {
        valueOf = (get + 7) % 128;
        valueOf(t, interfaceC9514jr, 0);
        int i = get + 45;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static <T extends View> void ThreeDS2ServiceInstance(T t, String str) {
        int i = get + 97;
        valueOf = i % 128;
        if (i % 2 == 0) {
            t.setBackgroundColor(Color.parseColor(str));
        } else {
            t.setBackgroundColor(Color.parseColor(str));
            throw null;
        }
    }

    public static void values(Button button, InterfaceC9507jk interfaceC9507jk) {
        int parseColor;
        int i;
        float valueOf2 = C9624nm.valueOf(interfaceC9507jk.values());
        float[] fArr = {valueOf2, valueOf2, valueOf2, valueOf2, valueOf2, valueOf2, valueOf2, valueOf2};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, fArr));
        shapeDrawable.getPaint().setColor(Color.parseColor(interfaceC9507jk.ThreeDS2Service()));
        shapeDrawable.getPaint().setAntiAlias(true);
        if (!C9606mw.ThreeDS2Service(parseColor)) {
            i = values;
        } else {
            int i2 = valueOf + 71;
            int i3 = i2 % 128;
            get = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            i = ThreeDS2ServiceInstance;
            valueOf = (i3 + 125) % 128;
        }
        button.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{i}), shapeDrawable, null));
    }

    public static <T extends TextView> void get(T t, InterfaceC9511jo interfaceC9511jo) {
        int i = valueOf + 5;
        get = i % 128;
        if (i % 2 == 0) {
            t.setTextColor(Color.parseColor(interfaceC9511jo.values()));
            t.setTextSize(5, interfaceC9511jo.ThreeDS2Service());
            get(t, interfaceC9511jo, C9670on.ThreeDS2Service.intValue());
            return;
        }
        t.setTextColor(Color.parseColor(interfaceC9511jo.values()));
        t.setTextSize(2, interfaceC9511jo.ThreeDS2Service());
        get(t, interfaceC9511jo, C9670on.ThreeDS2Service.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.C9377ev.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2Service(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getWarnings.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9377ev.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getWarnings.values     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getWarnings.values = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9377ev.values(java.lang.String, int, java.lang.Object[]):void");
    }

    @SuppressLint({"DiscouragedApi"})
    private static <T extends TextView> void get(T t, InterfaceC9514jr interfaceC9514jr, int i) {
        Typeface create;
        try {
            try {
                Context context = t.getContext();
                Resources resources = context.getResources();
                String valueOf2 = interfaceC9514jr.valueOf();
                Object[] objArr = new Object[1];
                values("➏⟩આ䉀\ue815礩褭傢", View.resolveSize(0, 0) + 1, objArr);
                create = ResourcesCompat.getFont(context, resources.getIdentifier(valueOf2, ((String) objArr[0]).intern(), context.getPackageName()));
                valueOf = (get + 93) % 128;
            } catch (Throwable unused) {
                create = Typeface.create(interfaceC9514jr.valueOf(), i);
            }
        } catch (Throwable unused2) {
            AssetManager assets = t.getContext().getAssets();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            values("퉦툀蠎새朽\uf601㼲\ue6bd\uf0ed", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb.append(interfaceC9514jr.valueOf());
            Object[] objArr3 = new Object[1];
            values("肪肄쪡艼좨妎⋜סּ", 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr3);
            sb.append(((String) objArr3[0]).intern());
            create = Typeface.createFromAsset(assets, sb.toString());
        }
        if (i == C9670on.ThreeDS2Service.intValue()) {
            int i2 = valueOf + 99;
            get = i2 % 128;
            if (i2 % 2 != 0) {
                t.setTypeface(create);
                return;
            }
            t.setTypeface(create);
            int i3 = 14 / 0;
            return;
        }
        t.setTypeface(create, i);
    }
}
