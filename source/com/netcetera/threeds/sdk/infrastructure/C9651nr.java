package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nr */
/* loaded from: classes5.dex */
public class C9651nr {
    public static char ThreeDS2Service = 0;
    private static final InterfaceC9652ns get;
    private static int getSDKInfo = 0;
    private static int getWarnings = 1;
    public static long valueOf;
    public static int values;
    private final JSONObject ThreeDS2ServiceInstance;

    static {
        ThreeDS2Service();
        get = C9653nt.ThreeDS2ServiceInstance(C9651nr.class);
        int i = getWarnings + 125;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private C9651nr(JSONObject jSONObject) {
        this.ThreeDS2ServiceInstance = jSONObject;
    }

    public static void ThreeDS2Service() {
        values = 0;
        ThreeDS2Service = (char) 1844;
        valueOf = 0L;
    }

    public static C9651nr ThreeDS2ServiceInstance() {
        int i = getSDKInfo + 3;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            ThreeDS2Service((JSONObject) null);
            throw null;
        }
        C9651nr ThreeDS2Service2 = ThreeDS2Service((JSONObject) null);
        getWarnings = (getSDKInfo + 69) % 128;
        return ThreeDS2Service2;
    }

    public static C9651nr get(String str) {
        try {
            C9651nr ThreeDS2Service2 = ThreeDS2Service(new JSONObject(str));
            int i = getSDKInfo + 23;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                return ThreeDS2Service2;
            }
            throw null;
        } catch (JSONException unused) {
            return ThreeDS2ServiceInstance();
        }
    }

    public static C9651nr values(Map map) {
        C9651nr c9651nr = new C9651nr(new JSONObject((Map) C9664oh.ThreeDS2Service(map, new HashMap())));
        getWarnings = (getSDKInfo + 31) % 128;
        return c9651nr;
    }

    public C9623nl cleanup(String str) {
        getWarnings = (getSDKInfo + 13) % 128;
        JSONArray optJSONArray = this.ThreeDS2ServiceInstance.optJSONArray(str);
        AudioTrack.getMinVolume();
        KeyEvent.getDeadChar(0, 0);
        C9623nl values2 = C9623nl.values(optJSONArray);
        getWarnings = (getSDKInfo + 117) % 128;
        return values2;
    }

    public Boolean getSDKInfo(String str) {
        getSDKInfo = (getWarnings + 1) % 128;
        Boolean valueOf2 = valueOf(str, null);
        getSDKInfo = (getWarnings + 13) % 128;
        return valueOf2;
    }

    public C9651nr getSDKVersion(String str) {
        C9651nr ThreeDS2Service2;
        int i = getSDKInfo + 69;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            JSONObject optJSONObject = this.ThreeDS2ServiceInstance.optJSONObject(str);
            View.MeasureSpec.getSize(0);
            ExpandableListView.getPackedPositionForGroup(1);
            ThreeDS2Service2 = ThreeDS2Service(optJSONObject);
        } else {
            JSONObject optJSONObject2 = this.ThreeDS2ServiceInstance.optJSONObject(str);
            View.MeasureSpec.getSize(0);
            ExpandableListView.getPackedPositionForGroup(0);
            ThreeDS2Service2 = ThreeDS2Service(optJSONObject2);
        }
        getWarnings = (getSDKInfo + 77) % 128;
        return ThreeDS2Service2;
    }

    public boolean getWarnings(String str) {
        getSDKInfo = (getWarnings + 83) % 128;
        boolean has = this.ThreeDS2ServiceInstance.has(str);
        int i = getSDKInfo + 23;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return has;
        }
        throw null;
    }

    public boolean initialize(String str) {
        JSONObject optJSONObject = this.ThreeDS2ServiceInstance.optJSONObject(str);
        Color.blue(0);
        ViewConfiguration.getLongPressTimeout();
        if (optJSONObject == null) {
            return false;
        }
        int i = (getWarnings + 29) % 128;
        getSDKInfo = i;
        getWarnings = (i + 113) % 128;
        return true;
    }

    public boolean onError(String str) {
        boolean z;
        JSONArray optJSONArray = this.ThreeDS2ServiceInstance.optJSONArray(str);
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getJumpTapTimeout();
        if (optJSONArray != null) {
            int i = getSDKInfo + 37;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                z = true;
                getWarnings = (getSDKInfo + 57) % 128;
                return z;
            }
        }
        z = false;
        getWarnings = (getSDKInfo + 57) % 128;
        return z;
    }

    public String toString() {
        int i = getWarnings + 59;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            String jSONObject = this.ThreeDS2ServiceInstance.toString();
            getSDKInfo = (getWarnings + 31) % 128;
            return jSONObject;
        }
        this.ThreeDS2ServiceInstance.toString();
        throw null;
    }

    public List<String> valueOf(String str) {
        ArrayList arrayList = new ArrayList();
        C9623nl values2 = C9623nl.values(this.ThreeDS2ServiceInstance.optJSONArray(str));
        for (int i = 0; i < values2.ThreeDS2ServiceInstance(); i++) {
            String valueOf2 = values2.valueOf(i);
            if (C9669om.ThreeDS2ServiceInstance(valueOf2)) {
                getWarnings = (getSDKInfo + 85) % 128;
                arrayList.add(valueOf2);
                getSDKInfo = (getWarnings + 1) % 128;
            }
        }
        return arrayList;
    }

    public static C9651nr ThreeDS2Service(String str) throws setId {
        try {
            C9651nr ThreeDS2Service2 = ThreeDS2Service(new JSONObject(str));
            getSDKInfo = (getWarnings + 109) % 128;
            return ThreeDS2Service2;
        } catch (JSONException e) {
            throw setForegroundGravity.onCompleted.valueOf(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r16.ThreeDS2ServiceInstance.isNull(r17) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        r2 = r16.ThreeDS2ServiceInstance.optString(r17, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.values((java.lang.CharSequence) r2) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = (com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo + 45) % 128;
        r7 = com.netcetera.threeds.sdk.infrastructure.C9651nr.get;
        r8 = new java.lang.Object[1];
        values(android.widget.ExpandableListView.getPackedPositionGroup(0), (char) (8772 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "ꆤ戄\u16fe渊\u0cf0愊嚞묫\uee7b따䮌ᑐ姆鲹깪夠栧涙\u0af2삨ධ᛫ා獆ޥ慠", "凐厩䐊┢", "\u0000\u0000\u0000\u0000", r8);
        r7.ThreeDS2Service(((java.lang.String) r8[0]).intern(), r17, r2);
        r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings + 75;
        com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        android.os.SystemClock.elapsedRealtimeNanos();
        android.view.ViewConfiguration.getScrollFriction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (getWarnings(r17) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (getWarnings(r17) != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = (com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings + 125) % 128;
        android.view.View.resolveSize(0, 0);
        android.graphics.Color.alpha(0);
        com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = (com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo + 89) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String ThreeDS2ServiceInstance(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = r3
            r3 = 2
            int r2 = r2 % r3
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L1b
            boolean r2 = r16.getWarnings(r17)
            int r6 = r3 / 0
            if (r2 != 0) goto L38
            goto L21
        L1b:
            boolean r2 = r16.getWarnings(r17)
            if (r2 == r4) goto L38
        L21:
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings
            int r1 = r1 + 125
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = r1
            android.view.View.resolveSize(r5, r5)
            android.graphics.Color.alpha(r5)
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo
            int r1 = r1 + 89
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = r1
            return r18
        L38:
            org.json.JSONObject r2 = r0.ThreeDS2ServiceInstance
            boolean r2 = r2.isNull(r1)
            r6 = 0
            if (r2 == 0) goto L43
            r2 = r6
            goto L49
        L43:
            org.json.JSONObject r2 = r0.ThreeDS2ServiceInstance
            java.lang.String r2 = r2.optString(r1, r6)
        L49:
            boolean r7 = com.netcetera.threeds.sdk.infrastructure.C9669om.values(r2)
            if (r7 == 0) goto L92
            int r7 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo
            int r7 = r7 + 45
            int r7 = r7 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = r7
            com.netcetera.threeds.sdk.infrastructure.ns r7 = com.netcetera.threeds.sdk.infrastructure.C9651nr.get
            r8 = 0
            int r10 = android.widget.ExpandableListView.getPackedPositionGroup(r8)
            int r8 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r8 = r8 >> 8
            int r8 = 8772 - r8
            char r11 = (char) r8
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r13 = "凐厩䐊┢"
            java.lang.String r14 = "\u0000\u0000\u0000\u0000"
            java.lang.String r12 = "ꆤ戄\u16fe渊\u0cf0愊嚞묫\uee7b따䮌ᑐ姆鲹깪夠栧涙\u0af2삨ධ᛫ා獆ޥ慠"
            r15 = r8
            values(r10, r11, r12, r13, r14, r15)
            r8 = r8[r5]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r9[r5] = r1
            r9[r4] = r2
            r7.ThreeDS2Service(r8, r9)
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = r2
            int r1 = r1 % r3
            if (r1 != 0) goto L91
            return r18
        L91:
            throw r6
        L92:
            android.os.SystemClock.elapsedRealtimeNanos()
            android.view.ViewConfiguration.getScrollFriction()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9651nr.ThreeDS2ServiceInstance(java.lang.String, java.lang.String):java.lang.String");
    }

    public String values(String str) {
        int i = getSDKInfo + 45;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            ThreeDS2ServiceInstance(str, (String) null);
            throw null;
        }
        String ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str, (String) null);
        getSDKInfo = (getWarnings + 101) % 128;
        return ThreeDS2ServiceInstance;
    }

    public Integer values(String str, Integer num) {
        getSDKInfo = (getWarnings + 19) % 128;
        String values2 = values(str);
        if (!(!C9670on.ThreeDS2ServiceInstance(values2))) {
            double parseDouble = Double.parseDouble(values2);
            TextUtils.getCapsMode("", 0, 0);
            ViewConfiguration.getMaximumFlingVelocity();
            return Integer.valueOf((int) parseDouble);
        }
        InterfaceC9652ns interfaceC9652ns = get;
        Object[] objArr = new Object[1];
        values((-2064681271) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(0, 0) + 20104), "⣙뭬\ud97e㪻搫ꝑ溁뤺⪩뫷躝嘑뛥\ue876≥\uedf1\ud9a2麜鋸犖뺡ﲂǼ揖̠阏迮", "쥮\uef76袄ፎ", "\u0000\u0000\u0000\u0000", objArr);
        interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, values2);
        getWarnings = (getSDKInfo + 1) % 128;
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r14) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r14) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(java.lang.String r14, java.lang.Object r15) {
        /*
            r13 = this;
            r0 = 1
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L19
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r14)
            r5 = 45
            int r5 = r5 / r4
            if (r1 == 0) goto L7a
            goto L1f
        L19:
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9669om.ThreeDS2ServiceInstance(r14)
            if (r1 == 0) goto L7a
        L1f:
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo
            int r1 = r1 + 67
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r4] = r15
            boolean r1 = com.netcetera.threeds.sdk.infrastructure.C9664oh.get(r1)
            if (r1 == 0) goto L7a
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings
            int r1 = r1 + 83
            int r5 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo = r5
            int r1 = r1 % r2
            if (r1 != 0) goto L42
            org.json.JSONObject r1 = r13.ThreeDS2ServiceInstance     // Catch: org.json.JSONException -> L48
            r1.putOpt(r14, r15)     // Catch: org.json.JSONException -> L48
            goto L7a
        L42:
            org.json.JSONObject r1 = r13.ThreeDS2ServiceInstance     // Catch: org.json.JSONException -> L48
            r1.putOpt(r14, r15)     // Catch: org.json.JSONException -> L48
            throw r3
        L48:
            com.netcetera.threeds.sdk.infrastructure.ns r1 = com.netcetera.threeds.sdk.infrastructure.C9651nr.get
            r5 = 0
            float r6 = android.graphics.PointF.length(r5, r5)
            java.lang.String r9 = "屦쬛糂㳌驆첝\ue794\uda91䗙텿薲ࣕ羱唕\ue1b2\ue6b0ᢧጻ羹䉷\u0ef2ⶉ꽐嬺펭莃㒃뚫礋\ue07b\udf18⪀ꈓ溺ሲ焤饚㳡䯧賓㔛\uea8f⅋歐蘝뱛Ű衏෦\u08cd덖矻놯㓽㤺ﺘ냁刭䌉\ua7eaﻰ␒\u0cd8휔跣뾵䂡"
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            r6 = 1387209524(0x52af2334, float:3.76104944E11)
            int r7 = r6 - r5
            int r5 = android.view.KeyEvent.getDeadChar(r4, r4)
            int r5 = r5 + 28471
            char r8 = (char) r5
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r10 = "㓁꼣㝒卯"
            java.lang.String r11 = "\u0000\u0000\u0000\u0000"
            r12 = r5
            values(r7, r8, r9, r10, r11, r12)
            r5 = r5[r4]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r14
            r6[r0] = r15
            r1.ThreeDS2Service(r5, r6)
        L7a:
            int r14 = com.netcetera.threeds.sdk.infrastructure.C9651nr.getSDKInfo
            int r14 = r14 + 19
            int r15 = r14 % 128
            com.netcetera.threeds.sdk.infrastructure.C9651nr.getWarnings = r15
            int r14 = r14 % r2
            if (r14 == 0) goto L86
            return
        L86:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9651nr.get(java.lang.String, java.lang.Object):void");
    }

    public static C9651nr ThreeDS2Service(JSONObject jSONObject) {
        C9651nr c9651nr = new C9651nr((JSONObject) C9664oh.ThreeDS2Service(jSONObject, new JSONObject()));
        int i = getWarnings + 53;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return c9651nr;
        }
        throw null;
    }

    public void ThreeDS2Service(String str, String str2) {
        int i = getWarnings + 31;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            CharSequence[] charSequenceArr = new CharSequence[5];
            charSequenceArr[0] = str;
            charSequenceArr[0] = str2;
            if (!C9669om.ThreeDS2Service(charSequenceArr)) {
                return;
            }
        } else if (!C9669om.ThreeDS2Service(str, str2)) {
            return;
        }
        try {
            this.ThreeDS2ServiceInstance.putOpt(str, str2);
            getWarnings = (getSDKInfo + 73) % 128;
        } catch (JSONException unused) {
            InterfaceC9652ns interfaceC9652ns = get;
            Object[] objArr = new Object[1];
            values(1387209524 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 28471), "屦쬛糂㳌驆첝\ue794\uda91䗙텿薲ࣕ羱唕\ue1b2\ue6b0ᢧጻ羹䉷\u0ef2ⶉ꽐嬺펭莃㒃뚫礋\ue07b\udf18⪀ꈓ溺ሲ焤饚㳡䯧賓㔛\uea8f⅋歐蘝뱛Ű衏෦\u08cd덖矻놯㓽㤺ﺘ냁刭䌉\ua7eaﻰ␒\u0cd8휔跣뾵䂡", "㓁꼣㝒卯", "\u0000\u0000\u0000\u0000", objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, str2);
        }
    }

    public Boolean valueOf(String str, Boolean bool) {
        getSDKInfo = (getWarnings + 1) % 128;
        String values2 = values(str);
        Object[] objArr = new Object[1];
        values(Color.alpha(0), (char) ((Process.myPid() >> 22) + 47161), "촱殈ꕬ欥", "\uebed⋸㤋徸", "\u0000\u0000\u0000\u0000", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((-2047264294) - ExpandableListView.getPackedPositionType(0L), (char) (32697 - ExpandableListView.getPackedPositionType(0L)), "⏊踦\uf422湆侙", "\uda55魯릅瑿", "\u0000\u0000\u0000\u0000", objArr2);
        if (!C9669om.values(values2, intern, ((String) objArr2[0]).intern())) {
            getSDKInfo = (getWarnings + 71) % 128;
            InterfaceC9652ns interfaceC9652ns = get;
            Object[] objArr3 = new Object[1];
            values((-2081458487) - Color.rgb(0, 0, 0), (char) (View.MeasureSpec.getSize(0) + 20104), "⣙뭬\ud97e㪻搫ꝑ溁뤺⪩뫷躝嘑뛥\ue876≥\uedf1\ud9a2麜鋸犖뺡ﲂǼ揖̠阏迮", "쥮\uef76袄ፎ", "\u0000\u0000\u0000\u0000", objArr3);
            interfaceC9652ns.ThreeDS2Service(((String) objArr3[0]).intern(), str, values2);
            return bool;
        }
        Boolean valueOf2 = Boolean.valueOf(Boolean.parseBoolean(values2));
        ViewConfiguration.getLongPressTimeout();
        View.MeasureSpec.getMode(0);
        getWarnings = (getSDKInfo + 81) % 128;
        return valueOf2;
    }

    public void values(String str, C9651nr c9651nr) {
        getSDKInfo = (getWarnings + 113) % 128;
        if (C9669om.ThreeDS2ServiceInstance(str)) {
            getWarnings = (getSDKInfo + 75) % 128;
            if (!(!C9664oh.get(c9651nr))) {
                try {
                    this.ThreeDS2ServiceInstance.putOpt(str, c9651nr.values());
                } catch (JSONException unused) {
                    InterfaceC9652ns interfaceC9652ns = get;
                    Object[] objArr = new Object[1];
                    values(1387209524 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (28472 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "屦쬛糂㳌驆첝\ue794\uda91䗙텿薲ࣕ羱唕\ue1b2\ue6b0ᢧጻ羹䉷\u0ef2ⶉ꽐嬺펭莃㒃뚫礋\ue07b\udf18⪀ꈓ溺ሲ焤饚㳡䯧賓㔛\uea8f⅋歐蘝뱛Ű衏෦\u08cd덖矻놯㓽㤺ﺘ냁刭䌉\ua7eaﻰ␒\u0cd8휔跣뾵䂡", "㓁꼣㝒卯", "\u0000\u0000\u0000\u0000", objArr);
                    interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, c9651nr);
                }
            }
        }
    }

    public Integer ThreeDS2ServiceInstance(String str) {
        int i = getSDKInfo + 47;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            return values(str, (Integer) null);
        }
        values(str, (Integer) null);
        throw null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/netcetera/threeds/sdk/infrastructure/printStackTrace;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)TT; */
    public Enum ThreeDS2ServiceInstance(String str, Class cls) {
        int i = getWarnings + 75;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            String values2 = values(str);
            if (values2 == null) {
                getWarnings = (getSDKInfo + 45) % 128;
                return null;
            }
            Enum ThreeDS2ServiceInstance = getCause.ThreeDS2ServiceInstance(cls, values2);
            if (ThreeDS2ServiceInstance == null) {
                int i2 = getWarnings + 111;
                getSDKInfo = i2 % 128;
                if (i2 % 2 != 0) {
                    InterfaceC9652ns interfaceC9652ns = get;
                    Object[] objArr = new Object[1];
                    values((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() - 102), "ᅵ쁜˷킽⤨\ue995ꃮᕼ뢠⼑瞐䔈㤵韗䖟\u2fe3ꩁ㇖\ueed3ᨛ臩⦢", "遜㯘奂댍", "\u0000\u0000\u0000\u0000", objArr);
                    String intern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[0];
                    objArr2[0] = str;
                    interfaceC9652ns.ThreeDS2Service(intern, objArr2);
                } else {
                    InterfaceC9652ns interfaceC9652ns2 = get;
                    Object[] objArr3 = new Object[1];
                    values((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "ᅵ쁜˷킽⤨\ue995ꃮᕼ뢠⼑瞐䔈㤵韗䖟\u2fe3ꩁ㇖\ueed3ᨛ臩⦢", "遜㯘奂댍", "\u0000\u0000\u0000\u0000", objArr3);
                    interfaceC9652ns2.ThreeDS2Service(((String) objArr3[0]).intern(), str);
                }
            }
            return ThreeDS2ServiceInstance;
        }
        values(str);
        throw null;
    }

    public Iterator<String> get() {
        Iterator<String> keys;
        int i = getSDKInfo + CameraActivity.REQUEST_CODE;
        getWarnings = i % 128;
        if (i % 2 == 0) {
            keys = this.ThreeDS2ServiceInstance.keys();
            int i2 = 63 / 0;
        } else {
            keys = this.ThreeDS2ServiceInstance.keys();
        }
        int i3 = getWarnings + 109;
        getSDKInfo = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return keys;
    }

    public Map<String, Object> valueOf() throws setId {
        try {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = this.ThreeDS2ServiceInstance.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = this.ThreeDS2ServiceInstance.get(next);
                if (obj instanceof JSONArray) {
                    obj = C9623nl.values((JSONArray) obj).get();
                } else if (obj instanceof JSONObject) {
                    int i = getSDKInfo + 103;
                    getWarnings = i % 128;
                    if (i % 2 != 0) {
                        obj = ThreeDS2Service((JSONObject) obj).valueOf();
                        getWarnings = (getSDKInfo + 107) % 128;
                    } else {
                        ThreeDS2Service((JSONObject) obj).valueOf();
                        throw null;
                    }
                } else {
                    continue;
                }
                hashMap.put(next, obj);
            }
            return hashMap;
        } catch (JSONException e) {
            throw setForegroundGravity.onCompleted.valueOf(e);
        }
    }

    public void values(String str, C9623nl c9623nl) {
        if (C9669om.ThreeDS2ServiceInstance(str) && !(!C9664oh.get(c9623nl))) {
            getWarnings = (getSDKInfo + 49) % 128;
            try {
                this.ThreeDS2ServiceInstance.putOpt(str, c9623nl.valueOf());
            } catch (JSONException unused) {
                InterfaceC9652ns interfaceC9652ns = get;
                Object[] objArr = new Object[1];
                values((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1387209523, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 28471), "屦쬛糂㳌驆첝\ue794\uda91䗙텿薲ࣕ羱唕\ue1b2\ue6b0ᢧጻ羹䉷\u0ef2ⶉ꽐嬺펭莃㒃뚫礋\ue07b\udf18⪀ꈓ溺ሲ焤饚㳡䯧賓㔛\uea8f⅋歐蘝뱛Ű衏෦\u08cd덖矻놯㓽㤺ﺘ냁刭䌉\ua7eaﻰ␒\u0cd8휔跣뾵䂡", "㓁꼣㝒卯", "\u0000\u0000\u0000\u0000", objArr);
                interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, c9623nl);
            }
        }
        getSDKInfo = (getWarnings + 39) % 128;
    }

    public <V> void values(String str, Collection<V> collection) {
        if (C9669om.ThreeDS2ServiceInstance(str)) {
            getWarnings = (getSDKInfo + 79) % 128;
            if (C9664oh.get(collection)) {
                try {
                    this.ThreeDS2ServiceInstance.putOpt(str, new JSONArray((Collection) collection));
                } catch (JSONException unused) {
                    InterfaceC9652ns interfaceC9652ns = get;
                    Object[] objArr = new Object[1];
                    values(View.getDefaultSize(0, 0) + 1387209524, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28470), "屦쬛糂㳌驆첝\ue794\uda91䗙텿薲ࣕ羱唕\ue1b2\ue6b0ᢧጻ羹䉷\u0ef2ⶉ꽐嬺펭莃㒃뚫礋\ue07b\udf18⪀ꈓ溺ሲ焤饚㳡䯧賓㔛\uea8f⅋歐蘝뱛Ű衏෦\u08cd덖矻놯㓽㤺ﺘ냁刭䌉\ua7eaﻰ␒\u0cd8휔跣뾵䂡", "㓁꼣㝒卯", "\u0000\u0000\u0000\u0000", objArr);
                    interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), str, collection);
                }
            }
        }
        getWarnings = (getSDKInfo + 121) % 128;
    }

    public JSONObject values() {
        int i = getSDKInfo + CameraActivity.REQUEST_CODE;
        int i2 = i % 128;
        getWarnings = i2;
        if (i % 2 != 0) {
            JSONObject jSONObject = this.ThreeDS2ServiceInstance;
            getSDKInfo = (i2 + 21) % 128;
            return jSONObject;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9651nr.valueOf     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9651nr.values     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.C9651nr.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9651nr.values(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }
}
