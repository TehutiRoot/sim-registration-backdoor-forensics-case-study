package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setContentInsetEndWithActions;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.util.List;
import th.p047co.dtac.android.dtacone.extension.BitMapExtenKt;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class hashCode extends equals {
    private static int ThreeDS2ServiceInstance = 0;
    public static long get = 8524945010203665524L;
    private static int getSDKInfo = 1;
    public static int[] values = {-579404086, 1723857941, -1390103833, 788320410, 414671877, -740175351, 922052257, 721070228, -798713041, 1046482830, -134951557, -1372210244, -530607458, 1284655369, 1049146209, -1508452524, 855762542, 1895918156};

    public hashCode(C9613nb c9613nb, setHighlightColor sethighlightcolor) {
        super(c9613nb, sethighlightcolor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.hashCode.get     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.hashCode.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }

    private List<setContentInsetEndWithActions> get() {
        getClass getclass = new getClass();
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("ꐐ痮߬퇨\ue3fd뷣俺", (ViewConfiguration.getScrollBarSize() >> 8) + 53759, objArr);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr[0]).intern()).valueOf(getDeclaringClass.get()).ThreeDS2Service(notify.valueOf().get(notify.getSDKInfo())).ThreeDS2Service());
        Object[] objArr2 = new Object[1];
        valueOf(new int[]{486496255, 1720753384}, 4 - View.getDefaultSize(0, 0), objArr2);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr2[0]).intern()).valueOf(getDeclaringClass.values()).ThreeDS2Service(notify.getSDKInfo()).ThreeDS2Service());
        Object[] objArr3 = new Object[1];
        valueOf(new int[]{1348017096, 941575240, 388323047, 1212626684, -1464123302, 1485490912}, 10 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr3[0]).intern()).valueOf(getDeclaringClass.values()).ThreeDS2Service(notify.getSDKInfo()).ThreeDS2Service());
        List<setContentInsetEndWithActions> ThreeDS2Service = getclass.ThreeDS2Service();
        getSDKInfo = (ThreeDS2ServiceInstance + CameraActivity.REQUEST_CODE) % 128;
        return ThreeDS2Service;
    }

    private List<setContentInsetEndWithActions> valueOf() {
        getClass getclass = new getClass();
        Object[] objArr = new Object[1];
        valueOf(new int[]{822190469, -1536918492, -555983325, -697774013, -607983150, -1802411482, 178842399, -195055421, -1162080350, -1528792832}, 20 - ExpandableListView.getPackedPositionType(0L), objArr);
        setContentInsetEndWithActions.values valueOf = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr[0]).intern()).valueOf(getDeclaringClass.get());
        finalize valueOf2 = notify.valueOf();
        Object[] objArr2 = new Object[1];
        ThreeDS2ServiceInstance("ꐀ㒛蔻ᗆ", 37021 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance("ꐒ\ue01cⰊ栜됵", KeyEvent.normalizeMetaState(0) + 17417, objArr3);
        getclass.valueOf(valueOf.ThreeDS2Service(valueOf2.get(notify.get(intern, ((String) objArr3[0]).intern())).get(notify.valueOf(new String[0]))).ThreeDS2Service());
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("ꐐ끘貚飲", View.resolveSize(0, 0) + 5197, objArr4);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr4[0]).intern()).valueOf(getDeclaringClass.values()).ThreeDS2Service(notify.get(8059).get(notify.ThreeDS2ServiceInstance())).ThreeDS2Service());
        Object[] objArr5 = new Object[1];
        valueOf(new int[]{-1108271141, 899295464}, 2 - Color.green(0), objArr5);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr5[0]).intern()).valueOf(getDeclaringClass.get()).ThreeDS2Service(notify.get(64)).ThreeDS2Service());
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance("ꐚ켚爇\ue53c", 27407 - View.resolveSize(0, 0), objArr6);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr6[0]).intern()).valueOf(getDeclaringClass.get()).ThreeDS2Service(notify.get(64)).ThreeDS2Service());
        List<setContentInsetEndWithActions> ThreeDS2Service = getclass.ThreeDS2Service();
        int i = getSDKInfo + 43;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    private List<setContentInsetEndWithActions> values() {
        Object[] objArr = new Object[1];
        valueOf(new int[]{-207487856, -666122851}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        getClass getclass = new getClass();
        Object[] objArr2 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -1948570856, -1391205812, -242114524, -858059913, -1729833943, -542669082, 1502146774, -963475918, -2021374415, 203164641, -345870607, -1083089019}, 29 - ImageFormat.getBitsPerPixel(0), objArr2);
        setContentInsetEndWithActions.values valueOf = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr2[0]).intern()).valueOf(getDeclaringClass.values());
        Object[] objArr3 = new Object[1];
        valueOf(new int[]{84869895, -10387868}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("ꑍ置", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 56099, objArr4);
        finalize ThreeDS2Service = notify.ThreeDS2Service(intern2, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ\uf6e0", 21157 - KeyEvent.normalizeMetaState(0), objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        valueOf(new int[]{1266197586, -962286012}, 2 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr6);
        getclass.valueOf(valueOf.ThreeDS2Service(ThreeDS2Service.get(notify.get(intern3, ((String) objArr6[0]).intern()))).ThreeDS2Service());
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ\ue72f≳涁꣔\uebee㜨牶붉\uf8fb㯫䜱艱춦\u08d0䯽霶퉮ᶣ壈鯼✴扰궈\ue8d0⯣", KeyEvent.getDeadChar(0, 0) + 17203, objArr7);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr7[0]).intern()).valueOf(getDeclaringClass.values()).ThreeDS2Service(notify.get(intern)).ThreeDS2Service());
        Object[] objArr8 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -1948570856, -1391205812, -242114524, -858059913, 1338595310, -2017714138, -1727447016, 1006607437, -750659076, -594958678, -345870607, -1083089019}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, objArr8);
        setContentInsetEndWithActions.values ThreeDS2Service2 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ\ue72f≳涁꣔\uebee㜨牶붉\uf8fb㯫䜱艱춦\u08d0䯽霶퉮ᶣ壈鯼✴扰궈\ue8d0⯣", KeyEvent.keyCodeFromString("") + 17203, objArr9);
        setContentInsetEndWithActions.values valueOf2 = ThreeDS2Service2.valueOf(getDeclaringClass.get(((String) objArr9[0]).intern(), intern));
        finalize valueOf3 = notify.valueOf();
        Object[] objArr10 = new Object[1];
        valueOf(new int[]{84869895, -10387868}, 2 - TextUtils.getOffsetAfter("", 0), objArr10);
        String intern4 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance("ꑍ置", 56099 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr11);
        finalize finalizeVar = valueOf3.get(notify.ThreeDS2Service(intern4, ((String) objArr11[0]).intern()));
        Object[] objArr12 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ\uf6e0", 21158 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr12);
        String intern5 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        valueOf(new int[]{1266197586, -962286012}, 2 - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
        getclass.valueOf(valueOf2.ThreeDS2Service(finalizeVar.get(notify.get(intern5, ((String) objArr13[0]).intern()))).ThreeDS2Service());
        Object[] objArr14 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -1948570856, -1391205812, -242114524, -858059913, -1073590420, 1828980469, -1332255098, 1371722971, -509627911, -280589501}, 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr14);
        setContentInsetEndWithActions.values valueOf4 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr14[0]).intern()).valueOf(getDeclaringClass.values());
        Object[] objArr15 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ\uf6e0", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21157, objArr15);
        String intern6 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        valueOf(new int[]{-35598248, -685542799}, 2 - TextUtils.indexOf("", "", 0), objArr16);
        getclass.valueOf(valueOf4.ThreeDS2Service(notify.valueOf(intern6, ((String) objArr16[0]).intern())).ThreeDS2Service());
        Object[] objArr17 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ솥潧锳㋼墌왌氜觙㞱崯\ufaf3悹蹔㐄凗ﾖ敄茺⢮噢ﰼ᧾", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26041, objArr17);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr17[0]).intern()).valueOf(getDeclaringClass.get()).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr18 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -1948570856, -1391205812, -242114524, -858059913, -1787165618, 740338058, 542904614, -2115627780, -2050824147, 1678822853}, 25 - (KeyEvent.getMaxKeyCode() >> 16), objArr18);
        setContentInsetEndWithActions.values valueOf5 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr18[0]).intern()).valueOf(getDeclaringClass.values());
        Object[] objArr19 = new Object[1];
        ThreeDS2ServiceInstance("ꐺ", 33108 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr19);
        getclass.valueOf(valueOf5.ThreeDS2Service(notify.get(intern, ((String) objArr19[0]).intern())).ThreeDS2Service());
        Object[] objArr20 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ䴱癏ᾟ¬⧰팔쐨\ued79隥뿗ꃯ䨉獸摬ඣ㛖\udff0섊\uea4c鎗蒢귆圚", 59693 - (ViewConfiguration.getTouchSlop() >> 8), objArr20);
        setContentInsetEndWithActions.values ThreeDS2Service3 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -1948570856, -1391205812, -242114524, -858059913, -1787165618, 740338058, 542904614, -2115627780, -2050824147, 1678822853}, TextUtils.indexOf("", "") + 25, objArr21);
        setContentInsetEndWithActions.values valueOf6 = ThreeDS2Service3.valueOf(getDeclaringClass.get(((String) objArr21[0]).intern(), intern));
        finalize valueOf7 = notify.valueOf();
        Object[] objArr22 = new Object[1];
        ThreeDS2ServiceInstance("ꐺ", 33107 - ((Process.getThreadPriority(0) + 20) >> 6), objArr22);
        getclass.valueOf(valueOf6.ThreeDS2Service(valueOf7.get(notify.get(intern, ((String) objArr22[0]).intern()))).ThreeDS2Service());
        List<setContentInsetEndWithActions> ThreeDS2Service4 = getclass.ThreeDS2Service();
        int i = ThreeDS2ServiceInstance + 55;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service4;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.equals
    public List<setContentInsetEndWithActions> ThreeDS2Service() {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("ꑄ\uf6e0", ExpandableListView.getPackedPositionGroup(0L) + 21157, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf(new int[]{1266197586, -962286012}, 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        valueOf(new int[]{84869895, -10387868}, 2 - TextUtils.getOffsetAfter("", 0), objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ創", View.MeasureSpec.makeMeasureSpec(0, 0) + 63029, objArr4);
        String intern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ꒜", 223 - Drawable.resolveOpacity(0, 0), objArr5);
        String intern5 = ((String) objArr5[0]).intern();
        getClass getclass = new getClass();
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance("ꐀ\ua631ꁜꊖ겥껑ꤩ\uab1c땹랓뇀돾븚롩며蒶蛊胺茗赧", 557 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr6[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service()).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2ServiceInstance(36)).get(notify.values(this.ThreeDS2Service.ThreeDS2Service()))).ThreeDS2Service());
        Object[] objArr7 = new Object[1];
        ThreeDS2ServiceInstance("ꐕỊ톽钠佯ɐ씴렋狹㗃\ue897ꍿ晇\ud91e", 47837 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
        setContentInsetEndWithActions.values valueOf = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr7[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service());
        finalize valueOf2 = notify.valueOf();
        finalize ThreeDS2ServiceInstance2 = notify.ThreeDS2ServiceInstance(3);
        Object[] objArr8 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ霷슢", AndroidCharacter.getMirror('0') + 13123, objArr8);
        String intern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        ThreeDS2ServiceInstance("ꑆ栀㳃", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52289, objArr9);
        getclass.valueOf(valueOf.ThreeDS2Service(valueOf2.get(ThreeDS2ServiceInstance2.get(notify.valueOf(intern6, ((String) objArr9[0]).intern()))).get(notify.ThreeDS2Service(Integer.valueOf(this.ThreeDS2Service.getWarnings())))).ThreeDS2Service());
        Object[] objArr10 = new Object[1];
        ThreeDS2ServiceInstance("ꐕ㋸觙惱ﾜ嚒ⶢ", 38639 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
        setContentInsetEndWithActions.values ThreeDS2Service = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr10[0]).intern());
        notifyAll ThreeDS2ServiceInstance3 = getDeclaringClass.ThreeDS2ServiceInstance();
        Object[] objArr11 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ铨", 12456 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
        String intern7 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        valueOf(new int[]{1177329027, -1889154400}, (ViewConfiguration.getTapTimeout() >> 16) + 2, objArr12);
        getclass.valueOf(ThreeDS2Service.valueOf(ThreeDS2ServiceInstance3.get(getDeclaringClass.valueOf(intern7, ((String) objArr12[0]).intern()))).ThreeDS2Service(notify.valueOf().get(notify.get((int) BitMapExtenKt.MAX_JPEG_BYTE_SIZE)).get(notify.get())).ThreeDS2Service());
        Object[] objArr13 = new Object[1];
        ThreeDS2ServiceInstance("ꐕ딂蘭霟\ue052\uf17c쉤펔ⲕ㶍", View.MeasureSpec.getSize(0) + 4373, objArr13);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr13[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service()).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2ServiceInstance(36)).get(notify.values(this.ThreeDS2Service.get()))).ThreeDS2Service());
        Object[] objArr14 = new Object[1];
        valueOf(new int[]{7203137, 587028155, 1460117713, -650239943, 253075369, 292104585}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, objArr14);
        setContentInsetEndWithActions.values valueOf3 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr14[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance());
        finalize valueOf4 = notify.valueOf();
        Object[] objArr15 = new Object[1];
        valueOf(new int[]{-183432152, -1142922200}, Color.argb(0, 0, 0, 0) + 2, objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        ThreeDS2ServiceInstance("ꑍ置", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56099, objArr16);
        finalize finalizeVar = valueOf4.get(notify.ThreeDS2Service(intern8, ((String) objArr16[0]).intern()));
        Object[] objArr17 = new Object[1];
        ThreeDS2ServiceInstance("ꑄ铨", View.combineMeasuredStates(0, 0) + 12457, objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        valueOf(new int[]{1177329027, -1889154400}, 1 - Process.getGidForName(""), objArr18);
        getclass.valueOf(valueOf3.ThreeDS2Service(finalizeVar.get(notify.get(intern, intern2, intern3, intern4, intern9, ((String) objArr18[0]).intern(), intern5))).ThreeDS2Service());
        Object[] objArr19 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, 412695380, -1127639809, 212531888, -1255983482, -2062968165, 1618254933}, 17 - View.combineMeasuredStates(0, 0), objArr19);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr19[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(45)).ThreeDS2Service());
        Object[] objArr20 = new Object[1];
        ThreeDS2ServiceInstance("ꐗﱇᒣ괉앴ᷖ똸칮曉뼄힕濰聀\ud887烫襕↭稐鉼⫼䌆魧", 22619 - (ViewConfiguration.getScrollBarSize() >> 8), objArr20);
        setContentInsetEndWithActions.values valueOf5 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr20[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service());
        finalize valueOf6 = notify.valueOf();
        Object[] objArr21 = new Object[1];
        valueOf(new int[]{-207487856, -666122851}, 1 - TextUtils.indexOf("", "", 0), objArr21);
        String intern10 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        ThreeDS2ServiceInstance("ꐺ", 33107 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr22);
        getclass.valueOf(valueOf5.ThreeDS2Service(valueOf6.get(notify.get(intern10, ((String) objArr22[0]).intern()))).ThreeDS2Service());
        Object[] objArr23 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, 43306793, -727079245, -351695233, -1673600776, 577292125, 871057727}, 17 - (Process.myPid() >> 22), objArr23);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr23[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2ServiceInstance())).get(values()).ThreeDS2Service());
        Object[] objArr24 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, 43306793, -727079245, -351695233, -1673600776, 1076608023, -578533467}, KeyEvent.getDeadChar(0, 0) + 20, objArr24);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr24[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern))).ThreeDS2Service(notify.ThreeDS2ServiceInstance()).get(values()).ThreeDS2Service());
        Object[] objArr25 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, -593586718, 695876003, 312680421, -437270960, 1425719095, -1239649197}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, objArr25);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr25[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr26 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ葫\ue4fb약◄ق曐䝒ꞩ耒\ue0bc섏\u218fȳ抗䋯ꍡ菿", TextUtils.getCapsMode("", 0, 0) + 8311, objArr26);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr26[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern2, intern3).valueOf(getDeclaringClass.values().get(getDeclaringClass.valueOf(intern4, intern5))))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr27 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ숁栯陏㱬媀살滘铹㌸夸윭浇譙ㆇ徿에", 26141 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr27);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr27[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(350))).ThreeDS2Service());
        Object[] objArr28 = new Object[1];
        ThreeDS2ServiceInstance("ꐗ鈿졓ٱ粔ꪾ\ue0c8\udee6ᔉ䌆륄\uf793\u2dbfᯧ击蠁옰㱮橬ꂉ麡퓈̗礥띓\ued6d", 13859 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr28);
        setContentInsetEndWithActions.values valueOf7 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr28[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5)));
        Object[] objArr29 = new Object[1];
        valueOf(new int[]{-207487856, -666122851}, KeyEvent.normalizeMetaState(0) + 1, objArr29);
        String intern11 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        ThreeDS2ServiceInstance("ꐺ", 33107 - KeyEvent.normalizeMetaState(0), objArr30);
        getclass.valueOf(valueOf7.ThreeDS2Service(notify.get(intern11, ((String) objArr30[0]).intern())).ThreeDS2Service());
        Object[] objArr31 = new Object[1];
        valueOf(new int[]{-708971675, 168021524, 91055326, 413706616, 1259124185, 1227207001, 445491218, 1762743845, -1547321989, 1210536274}, View.MeasureSpec.getSize(0) + 19, objArr31);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr31[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern2, intern3))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service().get(notify.get(1, 8))).get(notify.get((Integer) 4, (Integer) 45))).ThreeDS2Service());
        Object[] objArr32 = new Object[1];
        ThreeDS2ServiceInstance("ꐐﹶ\u10ccꬨ춋怒멜\udccc眢規Ⱋ䙷飇㌆喸\ue81bɫꓷＯᆩ됌", 23142 - TextUtils.lastIndexOf("", '0', 0), objArr32);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr32[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(64)).ThreeDS2Service());
        Object[] objArr33 = new Object[1];
        valueOf(new int[]{-27057534, -1594197819, 1035402856, -1628119292, -792061431, -208006220, -371701346, 898983924}, KeyEvent.getDeadChar(0, 0) + 15, objArr33);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr33[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(45)).ThreeDS2Service());
        Object[] objArr34 = new Object[1];
        valueOf(new int[]{-27057534, -1594197819, 1035402856, -1628119292, -1896484918, -1726382688, -372095415, -1929103131}, 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr34);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr34[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(256)).ThreeDS2Service());
        Object[] objArr35 = new Object[1];
        valueOf(new int[]{361271662, 1912521124, -1133777978, -2013587969, 1847379622, -1256889162, 212531888, -1255983482, -2062968165, 1618254933}, (ViewConfiguration.getPressedStateDuration() >> 16) + 17, objArr35);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr35[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern5))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr36 = new Object[1];
        valueOf(new int[]{566118708, -1414990632, 104084672, -1924064030, -58604678, 101192940}, 11 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr36);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr36[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.get(6144).get(notify.ThreeDS2ServiceInstance())).get(get()).ThreeDS2Service());
        Object[] objArr37 = new Object[1];
        valueOf(new int[]{-1894636557, -1710121624, -209264067, 622961619, -1003678625, 1750122648, -1418067628, 921957138}, 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr37);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr37[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service().get(getDeclaringClass.values())).ThreeDS2Service(notify.ThreeDS2Service().get(notify.get(0, 15))).get(valueOf()).ThreeDS2Service());
        Object[] objArr38 = new Object[1];
        valueOf(new int[]{-1894636557, -1710121624, 2117769820, -1095464587, 726626653, 1848084387}, 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr38);
        setContentInsetEndWithActions.values valueOf8 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr38[0]).intern()).valueOf(getDeclaringClass.get());
        Object[] objArr39 = new Object[1];
        ThreeDS2ServiceInstance("ꐷ㞁荟Ỳ", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37798, objArr39);
        String intern12 = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        ThreeDS2ServiceInstance("ꐱ\u2d2b뙜㾜", 35117 - Color.green(0), objArr40);
        getclass.valueOf(valueOf8.ThreeDS2Service(notify.ThreeDS2ServiceInstance(intern12, ((String) objArr40[0]).intern())).ThreeDS2Service());
        Object[] objArr41 = new Object[1];
        valueOf(new int[]{-1894636557, -1710121624, 592689173, 1081525430, 1042457135, 778946683, -767709883, -316131954}, 13 - MotionEvent.axisFromString(""), objArr41);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr41[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service()).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2ServiceInstance(setFastScrollEnabled.valueOf.get))).ThreeDS2Service());
        Object[] objArr42 = new Object[1];
        ThreeDS2ServiceInstance("ꐛ◜ꞘⅠꌘ⳧꺒⡤ꨮ⯮뗞", (ViewConfiguration.getFadingEdgeLength() >> 16) + 33223, objArr42);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr42[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern4))).ThreeDS2Service(notify.ThreeDS2Service(45)).ThreeDS2Service());
        Object[] objArr43 = new Object[1];
        valueOf(new int[]{-1349581266, 1896227706, 88606083, 1010378246, 768374747, 797603000}, 9 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr43);
        setContentInsetEndWithActions.values ThreeDS2Service2 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr43[0]).intern());
        notifyAll ThreeDS2ServiceInstance4 = getDeclaringClass.ThreeDS2ServiceInstance();
        notifyAll valueOf9 = getDeclaringClass.valueOf(intern4);
        Object[] objArr44 = new Object[1];
        ThreeDS2ServiceInstance("ꐛ◜ꞘⅠꌘ⳧꺒⡤ꨮ⯮뗞", 33223 - ExpandableListView.getPackedPositionGroup(0L), objArr44);
        notifyAll notifyall = valueOf9.get(getDeclaringClass.ThreeDS2Service(((String) objArr44[0]).intern()));
        notifyAll values2 = getDeclaringClass.values();
        Object[] objArr45 = new Object[1];
        valueOf(new int[]{1177329027, -1889154400}, 2 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr45);
        getclass.valueOf(ThreeDS2Service2.valueOf(ThreeDS2ServiceInstance4.get(notifyall.valueOf(values2.get(getDeclaringClass.valueOf(((String) objArr45[0]).intern()))))).ThreeDS2Service(notify.valueOf().get(notify.get(2048)).get(notify.cleanup())).ThreeDS2Service());
        Object[] objArr46 = new Object[1];
        ThreeDS2ServiceInstance("ꐛ\uf016ఌ堐\uf42f[屎\ue846Ѳ側\uec93㢷咉\ue0bf㲧䣛", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21517, objArr46);
        setContentInsetEndWithActions.values ThreeDS2Service3 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr46[0]).intern());
        notifyAll notifyall2 = getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern4));
        Object[] objArr47 = new Object[1];
        ThreeDS2ServiceInstance("ꐛ◜ꞘⅠꌘ⳧꺒⡤ꨮ⯮뗞", 33223 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr47);
        getclass.valueOf(ThreeDS2Service3.valueOf(notifyall2.get(getDeclaringClass.valueOf(((String) objArr47[0]).intern()))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr48 = new Object[1];
        valueOf(new int[]{1643241838, -310872797, -58604678, 101192940}, 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr48);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr48[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.get(6144).get(notify.ThreeDS2ServiceInstance())).get(get()).ThreeDS2Service());
        Object[] objArr49 = new Object[1];
        ThreeDS2ServiceInstance("ꐆ魈\udab5ᨚ奾颭\ud82bή廚鸺\udd7c\u1cca尹鎅틃ሬ冊郑큗ឍ囥陕", MotionEvent.axisFromString("") + 16218, objArr49);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr49[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern))).ThreeDS2Service(notify.ThreeDS2Service(45)).ThreeDS2Service());
        Object[] objArr50 = new Object[1];
        valueOf(new int[]{1799847096, 7783138, -1453025620, -1738876633, -2140037694, -612797663}, 10 - TextUtils.getOffsetBefore("", 0), objArr50);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr50[0]).intern()).valueOf(getDeclaringClass.ThreeDS2Service()).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2ServiceInstance(36)).get(notify.values(this.ThreeDS2Service.cleanup()))).ThreeDS2Service());
        Object[] objArr51 = new Object[1];
        ThreeDS2ServiceInstance("ꐇ\u0bceﮈꭴᬡ쬋뫯檨\uda78詛稇⧿馴䦞㥅\ue934声ࢢ\uf895ꡇ᠔쿮뿜澈\udf70", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 45007, objArr51);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr51[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.valueOf(intern, intern2, intern3))).ThreeDS2Service(notify.valueOf().get(notify.ThreeDS2Service(45))).ThreeDS2Service());
        Object[] objArr52 = new Object[1];
        ThreeDS2ServiceInstance("ꐀꈰꡅ뚒벴뫆脦輶镟鎞馮\ue7c4\uee1f\uf435\uf267\uf89f욠", 1579 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr52);
        setContentInsetEndWithActions.values valueOf10 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr52[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5)));
        Object[] objArr53 = new Object[1];
        ThreeDS2ServiceInstance("ꑍ置", Color.blue(0) + 56099, objArr53);
        getclass.valueOf(valueOf10.ThreeDS2Service(notify.ThreeDS2Service(intern2, ((String) objArr53[0]).intern()).get(notify.get(intern))).ThreeDS2Service());
        Object[] objArr54 = new Object[1];
        ThreeDS2ServiceInstance("ꐀꮧ뭗諹骃\uea02阮쥲\ud908⢨㡍", 4001 - Color.red(0), objArr54);
        setContentInsetEndWithActions.values valueOf11 = setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr54[0]).intern()).valueOf(getDeclaringClass.valueOf());
        finalize valueOf12 = notify.valueOf();
        Object[] objArr55 = new Object[1];
        valueOf(new int[]{-207487856, -666122851}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, objArr55);
        String intern13 = ((String) objArr55[0]).intern();
        Object[] objArr56 = new Object[1];
        ThreeDS2ServiceInstance("ꐺ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33107, objArr56);
        String intern14 = ((String) objArr56[0]).intern();
        Object[] objArr57 = new Object[1];
        ThreeDS2ServiceInstance("ꐡ", TextUtils.lastIndexOf("", '0', 0) + 40388, objArr57);
        String intern15 = ((String) objArr57[0]).intern();
        Object[] objArr58 = new Object[1];
        valueOf(new int[]{67449058, -1241883721}, 1 - TextUtils.getOffsetBefore("", 0), objArr58);
        String intern16 = ((String) objArr58[0]).intern();
        Object[] objArr59 = new Object[1];
        valueOf(new int[]{-2075990742, -198031620}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr59);
        String intern17 = ((String) objArr59[0]).intern();
        Object[] objArr60 = new Object[1];
        ThreeDS2ServiceInstance("ꐦ", View.MeasureSpec.makeMeasureSpec(0, 0) + 47681, objArr60);
        String intern18 = ((String) objArr60[0]).intern();
        Object[] objArr61 = new Object[1];
        ThreeDS2ServiceInstance("ꐽ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35670, objArr61);
        String intern19 = ((String) objArr61[0]).intern();
        Object[] objArr62 = new Object[1];
        ThreeDS2ServiceInstance("ꐰ", KeyEvent.getDeadChar(0, 0) + 6521, objArr62);
        String intern20 = ((String) objArr62[0]).intern();
        Object[] objArr63 = new Object[1];
        valueOf(new int[]{1768540615, 2113634557}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr63);
        getclass.valueOf(valueOf11.ThreeDS2Service(valueOf12.get(notify.get(intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, ((String) objArr63[0]).intern()))).ThreeDS2Service());
        Object[] objArr64 = new Object[1];
        ThreeDS2ServiceInstance("ꐀ\udad9妿\ud89a彼\ude63崧\udc1e勸퇪催힇噯핳吣쬝䧰", 32479 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr64);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr64[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(64)).ThreeDS2Service());
        Object[] objArr65 = new Object[1];
        ThreeDS2ServiceInstance("ꐃ羓ጓ㚐쨦\uedd9腁ꓑ硭ᰑ㞇쬽", Color.blue(0) + 56207, objArr65);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr65[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(45)).ThreeDS2Service());
        Object[] objArr66 = new Object[1];
        valueOf(new int[]{-154944447, 1126989826, -1926641329, 834554699, 890709541, -1511635159}, 11 - KeyEvent.normalizeMetaState(0), objArr66);
        getclass.valueOf(setContentInsetEndWithActions.values.ThreeDS2Service(((String) objArr66[0]).intern()).valueOf(getDeclaringClass.ThreeDS2ServiceInstance().get(getDeclaringClass.values()).get(getDeclaringClass.valueOf(intern, intern2, intern3, intern4, intern5))).ThreeDS2Service(notify.ThreeDS2Service(256)).ThreeDS2Service());
        List<setContentInsetEndWithActions> ThreeDS2Service4 = getclass.ThreeDS2Service();
        getSDKInfo = (ThreeDS2ServiceInstance + 53) % 128;
        return ThreeDS2Service4;
    }

    private static void valueOf(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) values.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}
