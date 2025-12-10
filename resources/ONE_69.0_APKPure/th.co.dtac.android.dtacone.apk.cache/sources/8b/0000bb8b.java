package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatDelegate;
import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.e */
/* loaded from: classes5.dex */
public class C9340e extends getSchemeEncryptionPublicKeyId {
    private static values ConfigParameters = null;
    private static int[] ConfigurationBuilder = null;
    public static ids ThreeDS2Service = null;
    private static values ThreeDS2Service$InitializationCallback = null;
    private static final long[] ThreeDS2ServiceInstance;
    private static getSchemeLogoDark.ThreeDS2Service addParam = null;
    private static values apiKey = null;
    private static int build = 0;
    private static final String[] cleanup;
    private static char[] configureScheme = null;
    private static values createTransaction = null;
    private static final long[] get;
    private static values getParamValue = null;
    private static final long[] getSDKInfo;
    private static final String[] getSDKVersion;
    private static final long[] getWarnings;
    private static final long[] initialize;
    private static int mastercardSchemeConfiguration = 1;
    private static final String[] onCompleted;
    private static final long[] onError;
    private static values removeParam;
    private static final long[] valueOf;
    public static long values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.e$ThreeDS2Service */
    /* loaded from: classes5.dex */
    public interface ThreeDS2Service {
        void ThreeDS2ServiceInstance(int i, int i2);
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.e$get */
    /* loaded from: classes5.dex */
    public interface get {
        void get(ids idsVar);
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.e$valueOf */
    /* loaded from: classes5.dex */
    public static class valueOf extends Thread {
        private static int valueOf = 1;
        private static int values;
        private final int ThreeDS2ServiceInstance;
        private final get get;

        public valueOf(get getVar, int i) {
            this.get = getVar;
            this.ThreeDS2ServiceInstance = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            int i;
            values = (valueOf + 93) % 128;
            int i2 = this.ThreeDS2ServiceInstance;
            if (C9461i.m33355e() > 0) {
                int i3 = valueOf;
                values = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
                i = this.ThreeDS2ServiceInstance ^ 249;
            } else {
                i = this.ThreeDS2ServiceInstance;
                int i4 = values;
                valueOf = ((i4 & 103) + (i4 | 103)) % 128;
            }
            C9340e.get(i2, i, this.get);
        }
    }

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.e$values */
    /* loaded from: classes5.dex */
    public static class values {
        private static int ThreeDS2ServiceInstance = 0;
        private static int cleanup = 1;
        private int ThreeDS2Service;
        private int get;
        private long[] valueOf;
        private long values;

        public values(int i, long[] jArr, int i2, long j) {
            this.ThreeDS2Service = i;
            this.valueOf = jArr;
            this.get = i2;
            this.values = j;
        }

        public final int ThreeDS2ServiceInstance(String str) {
            int i = ThreeDS2ServiceInstance;
            int i2 = (i ^ 59) + ((i & 59) << 1);
            int i3 = i2 % 128;
            cleanup = i3;
            if (i2 % 2 != 0) {
                int i4 = this.get;
                if (i4 == 0 && this.values == 0) {
                    ThreeDS2ServiceInstance = (i3 + 5) % 128;
                    for (int i5 = 0; i5 < this.valueOf.length; i5 = ((i5 | 1) << 1) - (i5 ^ 1)) {
                        ThreeDS2ServiceInstance = (cleanup + 69) % 128;
                        if (visaSchemeConfiguration.ThreeDS2ServiceInstance(str) == this.valueOf[i5]) {
                            int i6 = cleanup + 75;
                            ThreeDS2ServiceInstance = i6 % 128;
                            if (i6 % 2 != 0) {
                                return this.ThreeDS2Service * i5;
                            }
                            int i7 = this.ThreeDS2Service;
                            return (i7 & i5) + (i7 | i5);
                        }
                    }
                    int i8 = cleanup;
                    ThreeDS2ServiceInstance = (((i8 | 121) << 1) - (i8 ^ 121)) % 128;
                } else {
                    int ThreeDS2ServiceInstance2 = visaSchemeConfiguration.ThreeDS2ServiceInstance(str, i4, this.values, this.valueOf);
                    if (ThreeDS2ServiceInstance2 != 0) {
                        cleanup = (ThreeDS2ServiceInstance + 77) % 128;
                        int i9 = this.ThreeDS2Service;
                        int i10 = -(-ThreeDS2ServiceInstance2);
                        return (((i9 | i10) << 1) - (i10 ^ i9)) - 1;
                    }
                }
                return 0;
            }
            throw null;
        }
    }

    static {
        valueOf();
        values = -1L;
        ThreeDS2Service = null;
        long[] jArr = {5346983579176056341L, 2009081199365669074L, 5956613504184305173L, 8899588629242527954L, 375079373922271629L, 1599531319238017234L, 5109561905117738517L, 2755552837602328786L};
        get = jArr;
        long[] jArr2 = {-8080523676569222304L, 6247535792709053186L, -7821137391702040246L, -3922916112654851522L, 8839175558035598718L, -2890535829032981914L, 4113801434712603158L, 5835755100867204884L};
        ThreeDS2ServiceInstance = jArr2;
        long[] jArr3 = {4085212954298587426L, 3012439845812021669L, 5769587637170450507L, 2969396325011468692L, 7867099544161923476L, 1598132056504805899L};
        valueOf = jArr3;
        long[] jArr4 = {2018191094461008829L, -3135287916255501627L, -6543530224906774004L, 6873030840008565331L, 3232606552312898193L, 6330987359265341719L};
        getWarnings = jArr4;
        long[] jArr5 = {1312179212427599182L, 8085699055651459282L, 6329818986207784146L, 7581214046858337288L, 222271138232253650L, 1524944220437646053L};
        initialize = jArr5;
        long[] jArr6 = {2414330307756640011L, -3593916909785094185L, 7092956718875610598L, -5964681408332242700L, 8518732971232906945L, -3109682652025013662L};
        getSDKInfo = jArr6;
        Object[] objArr = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{279, 12, 0, 7}, false, objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(new int[]{381517015, -1752773663, -1885620790, -554149036, 1522947209, -1327931594, 2074552243, 1462311956}, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{291, 17, 0, 7}, false, objArr3);
        Object[] objArr4 = new Object[1];
        ThreeDS2Service(new int[]{-1565694054, 2143379962, -1677541217, -90817425}, TextUtils.getTrimmedLength("") + 6, objArr4);
        Object[] objArr5 = new Object[1];
        ThreeDS2Service(new int[]{-1501305043, -301856149, -1017516395, 776826462, 2074552243, 1462311956}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr5);
        Object[] objArr6 = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{308, 17, 84, 0}, true, objArr6);
        String str2 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{325, 21, 0, 0}, true, objArr7);
        String str3 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        ThreeDS2Service("\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{346, 16, 137, 0}, false, objArr8);
        String str4 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        ThreeDS2Service(new int[]{-1501305043, -301856149, -1017516395, 776826462, -593154540, 1051533027, -1314560439, 813189764, 341727472, -794476368, -599697017, -986556745, -377854026, -117777828}, 24 - TextUtils.indexOf((CharSequence) "", '0'), objArr9);
        String str5 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{362, 13, 62, 11}, false, objArr10);
        String str6 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        ThreeDS2Service(new int[]{1584029294, -715558422, 1846522152, -142611021, -377854026, -117777828}, ImageFormat.getBitsPerPixel(0) + 10, objArr11);
        String str7 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        ThreeDS2Service("\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{375, 8, 27, 0}, false, objArr12);
        cleanup = new String[]{str, (String) objArr2[0], (String) objArr3[0], (String) objArr4[0], (String) objArr5[0], str2, str3, str4, str5, str6, str7, (String) objArr12[0]};
        Object[] objArr13 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{383, 7, 0, 0}, false, objArr13);
        String str8 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{390, 11, 171, 0}, true, objArr14);
        String str9 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{401, 12, 107, 0}, true, objArr15);
        String str10 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        ThreeDS2Service(new int[]{-1501305043, -301856149, -1017516395, 776826462, -680472970, 1453441961}, 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr16);
        String str11 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        ThreeDS2Service("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{413, 11, 90, 0}, true, objArr17);
        String str12 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        ThreeDS2Service(new int[]{-1565694054, 2143379962, -566832149, -302446288}, 5 - View.getDefaultSize(0, 0), objArr18);
        String str13 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0001", new int[]{424, 4, 0, 0}, false, objArr19);
        getSDKVersion = new String[]{str8, str9, str10, str11, str12, str13, (String) objArr19[0]};
        long[] jArr7 = {216413717};
        onError = jArr7;
        Object[] objArr20 = new Object[1];
        ThreeDS2Service("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000", new int[]{428, 8, 171, 0}, false, objArr20);
        String str14 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{436, 6, 0, 6}, false, objArr21);
        String str15 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{442, 7, 0, 4}, false, objArr22);
        String str16 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        ThreeDS2Service(new int[]{1657671458, 952173064, -1764247382, 824755877, -1325313463, 1856390504}, 9 - View.resolveSizeAndState(0, 0, 0), objArr23);
        String str17 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        ThreeDS2Service(new int[]{-2021473316, -1589581892, 222402448, 711300505}, 6 - View.MeasureSpec.getSize(0), objArr24);
        String str18 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        ThreeDS2Service(new int[]{59247478, 1075597529, 450099728, -358683330, 729074230, 142862121, 1845658267, -1175838656}, 13 - ExpandableListView.getPackedPositionGroup(0L), objArr25);
        String str19 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        ThreeDS2Service(new int[]{1040606375, -1424559808, -1500150862, 1823524103}, TextUtils.indexOf((CharSequence) "", '0', 0) + 6, objArr26);
        String str20 = (String) objArr26[0];
        Object[] objArr27 = new Object[1];
        ThreeDS2Service(new int[]{-1797371179, -560106568, 1639596469, -665901173}, 6 - (ViewConfiguration.getTouchSlop() >> 8), objArr27);
        String str21 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        ThreeDS2Service("\u0001\u0000", new int[]{449, 2, 0, 1}, false, objArr28);
        String str22 = (String) objArr28[0];
        Object[] objArr29 = new Object[1];
        ThreeDS2Service(new int[]{165061984, 448581838, -63535827, -979831118, 1744078880, 2004785163, -381094171, 206413464}, 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr29);
        String str23 = (String) objArr29[0];
        Object[] objArr30 = new Object[1];
        ThreeDS2Service(new int[]{-694757649, 1832243694, -1338492910, 2000193629, -36958868, -1012154849}, 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr30);
        String str24 = (String) objArr30[0];
        Object[] objArr31 = new Object[1];
        ThreeDS2Service(new int[]{473668644, 703036414, -1965043504, -1437831917}, 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr31);
        String str25 = (String) objArr31[0];
        Object[] objArr32 = new Object[1];
        ThreeDS2Service(new int[]{-77350795, 1322078935, -68141138, 1012798139, 406061869, -1168808680}, 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr32);
        String str26 = (String) objArr32[0];
        Object[] objArr33 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", new int[]{451, 14, 13, 0}, true, objArr33);
        String str27 = (String) objArr33[0];
        Object[] objArr34 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0000\u0001\u0000\u0000\u0000", new int[]{465, 7, 9, 1}, true, objArr34);
        String str28 = (String) objArr34[0];
        Object[] objArr35 = new Object[1];
        ThreeDS2Service(new int[]{1844890378, 1853305783, -925939284, -1578783531}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, objArr35);
        String str29 = (String) objArr35[0];
        Object[] objArr36 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{472, 7, 54, 7}, false, objArr36);
        String str30 = (String) objArr36[0];
        Object[] objArr37 = new Object[1];
        ThreeDS2Service(new int[]{-1528063628, 1168444205}, ExpandableListView.getPackedPositionChild(0L) + 3, objArr37);
        String str31 = (String) objArr37[0];
        Object[] objArr38 = new Object[1];
        ThreeDS2Service(new int[]{847921894, 943851692, 217011978, 602548728, 1519911538, 1344513762, -693950078, -239606477, -1706234723, -1873887496}, KeyEvent.getDeadChar(0, 0) + 20, objArr38);
        String str32 = (String) objArr38[0];
        Object[] objArr39 = new Object[1];
        ThreeDS2Service("\u0000\u0000\u0000\u0001\u0000\u0001", new int[]{479, 6, 79, 6}, true, objArr39);
        String str33 = (String) objArr39[0];
        Object[] objArr40 = new Object[1];
        ThreeDS2Service("\u0001\u0000", new int[]{277, 2, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 1}, false, objArr40);
        String str34 = (String) objArr40[0];
        Object[] objArr41 = new Object[1];
        ThreeDS2Service(new int[]{1468751056, 369208572, -1881300550, -760906077, 1815861299, 1523050619, 1015498180, -145244421}, 16 - KeyEvent.keyCodeFromString(""), objArr41);
        String str35 = (String) objArr41[0];
        Object[] objArr42 = new Object[1];
        ThreeDS2Service(new int[]{1023768146, 1265688514, -494519627, -1870244675, -1445662515, 1793119380}, 8 - Process.getGidForName(""), objArr42);
        String str36 = (String) objArr42[0];
        Object[] objArr43 = new Object[1];
        ThreeDS2Service(new int[]{1023768146, 1265688514, -494519627, -1870244675, -1521568817, -1988667182}, View.MeasureSpec.getMode(0) + 10, objArr43);
        String str37 = (String) objArr43[0];
        Object[] objArr44 = new Object[1];
        ThreeDS2Service("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{485, 11, 135, 0}, false, objArr44);
        String str38 = (String) objArr44[0];
        Object[] objArr45 = new Object[1];
        ThreeDS2Service(new int[]{915355880, 2070393270, 311138091, -1346956964, 541930791, -1771009792}, 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr45);
        String str39 = (String) objArr45[0];
        Object[] objArr46 = new Object[1];
        ThreeDS2Service(new int[]{915355880, 2070393270, -1413724454, 1603200392, 1749116640, -1136621026, 541930791, -1771009792}, 15 - ExpandableListView.getPackedPositionGroup(0L), objArr46);
        String str40 = (String) objArr46[0];
        Object[] objArr47 = new Object[1];
        ThreeDS2Service(new int[]{915355880, 2070393270, 1201829357, 419954002, -915907530, 1010068467, -1177369625, -1844017087}, (ViewConfiguration.getLongPressTimeout() >> 16) + 14, objArr47);
        onCompleted = new String[]{str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, (String) objArr47[0]};
        createTransaction = new values(40, jArr4, 0, 0L);
        ConfigParameters = new values(20, jArr2, 0, 0L);
        ThreeDS2Service$InitializationCallback = new values(60, jArr6, 0, 0L);
        apiKey = new values(40, jArr3, 5, Long.MAX_VALUE);
        getParamValue = new values(20, jArr, 5, Long.MAX_VALUE);
        new values(60, jArr5, 5, Long.MAX_VALUE);
        removeParam = new values(150, jArr7, 5, LockFreeTaskQueueCore.HEAD_MASK);
        addParam = new getSchemeLogoDark.ThreeDS2Service();
        mastercardSchemeConfiguration = (build + 67) % 128;
    }

    private static int ThreeDS2Service(int i, Context context, int i2) {
        boolean z;
        values valuesVar;
        if (Build.VERSION.SDK_INT >= 30 && context != null) {
            Object[] objArr = new Object[1];
            ThreeDS2Service(new int[]{-710444422, -991672563, 2070873464, 220302710, 585697521, 432035065, 2115796251, 1167212747, -739017832, -529263593, -1641277716, 1564776714, 1584985370, 951032748, -1614789582, -2107470505, 159855766, -896708533, -382404899, -1487535089}, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            if (context.checkPermission((String) objArr[0], Process.myPid(), Process.myUid()) != 0) {
                return i;
            }
        }
        if ((i2 & 4) != 0) {
            mastercardSchemeConfiguration = (build + 109) % 128;
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i2 & 256) != 0;
        boolean z3 = (i2 & 8) != 0;
        values valuesVar2 = null;
        if (z) {
            mastercardSchemeConfiguration = (build + 81) % 128;
            valuesVar = null;
        } else {
            valuesVar = createTransaction;
        }
        values valuesVar3 = z2 ? null : ConfigParameters;
        if (z3) {
            mastercardSchemeConfiguration = (build + 1) % 128;
        } else {
            valuesVar2 = ThreeDS2Service$InitializationCallback;
        }
        values[] valuesVarArr = {valuesVar, valuesVar3, valuesVar2};
        if ((i2 & 512) != 0) {
            int i3 = (build + 93) % 128;
            mastercardSchemeConfiguration = i3;
            int i4 = i3 + 33;
            build = i4 % 128;
            if (i4 % 2 == 0 ? context != null : context != null) {
                return ThreeDS2ServiceInstance(i, context, valuesVarArr, z);
            }
        }
        int valueOf2 = valueOf(i, valuesVarArr);
        if (valueOf2 != i) {
            return valueOf2;
        }
        if (z || context == null) {
            return i;
        }
        mastercardSchemeConfiguration = (build + 63) % 128;
        return valueOf(i, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x012e, code lost:
        if (r9.startsWith((java.lang.String) r4[0]) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0277, code lost:
        if (r4 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x027a, code lost:
        if (r4 != null) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int ThreeDS2ServiceInstance(int r20, android.content.Context r21, com.netcetera.threeds.sdk.infrastructure.C9340e.values[] r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.ThreeDS2ServiceInstance(int, android.content.Context, com.netcetera.threeds.sdk.infrastructure.e$values[], boolean):int");
    }

    /* renamed from: c */
    private static native long m33359c(int i);

    private static int get(int i) {
        int i2 = build + 75;
        mastercardSchemeConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            if (C9222a.m33363c() != 0) {
                int i3 = build + 101;
                mastercardSchemeConfiguration = i3 % 128;
                return i3 % 2 == 0 ? i ^ 30239 : i ^ 263;
            }
            return i;
        }
        C9222a.m33363c();
        throw null;
    }

    private static int getSDKInfo(int i) {
        int m33354a;
        int i2 = build + 119;
        mastercardSchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            m33354a = 8329 << C9485j.m33354a();
        } else {
            m33354a = C9485j.m33354a() * 266;
        }
        int i3 = i ^ m33354a;
        mastercardSchemeConfiguration = (build + 95) % 128;
        return i3;
    }

    private static int getSDKVersion(int i) {
        mastercardSchemeConfiguration = (build + 79) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2Service(new int[]{-1501305043, -301856149, -1340777083, -2089732263, -1513639134, 1664143320, 2091933780, 504576647, 2097817584, 1378799378, -370760714, 793047799}, 22 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        long m33346b = C9684q.m33346b((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{260, 17, 0, 0}, false, objArr2);
        long m33346b2 = C9684q.m33346b((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        ThreeDS2Service(new int[]{-817556376, -1030327357}, (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr3);
        long m33346b3 = C9684q.m33346b((String) objArr3[0]);
        if (m33346b > 0) {
            if (m33346b2 > 0) {
                int i2 = mastercardSchemeConfiguration;
                int i3 = i2 + 101;
                build = i3 % 128;
                if (i3 % 2 == 0 ? m33346b2 - 3 < m33346b : m33346b2 / 3 < m33346b) {
                    int i4 = i2 + 73;
                    build = i4 % 128;
                    if (i4 % 2 != 0) {
                        return i ^ 2383;
                    }
                    return i ^ 247;
                }
            }
            if (m33346b3 > 0 && m33346b3 + 100 < m33346b) {
                int i5 = mastercardSchemeConfiguration + 77;
                build = i5 % 128;
                if (i5 % 2 != 0) {
                    return i ^ 18091;
                }
                return i ^ 248;
            }
            return i;
        }
        return i;
    }

    private static int initialize(int i) {
        mastercardSchemeConfiguration = (build + 95) % 128;
        if (C9673p.m33347e() != 0) {
            int i2 = i ^ 264;
            int i3 = mastercardSchemeConfiguration + 63;
            build = i3 % 128;
            if (i3 % 2 == 0) {
                return i2;
            }
            throw null;
        }
        return i;
    }

    public static void valueOf() {
        ConfigurationBuilder = new int[]{290377774, -1889234017, -1347304472, -1712301670, -440864447, 47792579, 2055335229, 1022109353, 403430819, -2030831166, -925659669, -363344658, -2135353940, -1146454463, 2118352969, 1024249269, -1245809825, -1595256303};
        configureScheme = new char[]{28, 29, 'O', 'f', 'd', 'f', 'g', 'b', 'h', '2', 'h', 'i', 'k', 'o', 'k', 'J', 'M', 'n', 'i', 'H', 'g', 233, 262, 268, 272, 267, 265, 263, 231, 237, 270, 265, '9', 'p', 'n', 'l', 'n', 'j', 'b', 'f', 'j', 'n', 'p', 'X', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'd', 'h', 'l', 'f', 'j', 's', 'p', AbstractJsonLexerKt.BEGIN_LIST, '^', 'l', 'f', 'A', '}', '}', 'n', 'n', 129, Ascii.MAX, 129, '}', AbstractJsonLexerKt.UNICODE_ESC, 'y', '}', 129, 131, 'k', 'J', '`', 129, 'b', 'd', 132, '|', Ascii.MAX, 132, 129, '|', AbstractJsonLexerKt.BEGIN_LIST, '\\', 'y', Ascii.MAX, 131, '~', '|', 'z', 130, 257, 251, 253, 243, 260, 292, 290, 292, 289, 280, 253, 263, 295, 287, 290, 295, 289, 257, 255, 284, 290, 294, 289, 287, 285, 155, 305, 300, 298, 267, 269, 301, 307, 309, 309, 306, 272, 266, '?', 133, 140, 137, 132, 135, 139, 140, 135, 129, 140, '4', 'k', 'k', 'n', 'Q', 'P', 't', 'l', 'H', 'P', 't', 'j', 'a', 'b', 'c', 'i', 'n', 'n', 'a', 192, 192, 195, 198, 200, 193, 's', 231, 224, 216, Typography.times, 214, 212, 221, 229, 227, 228, 196, 196, 234, 234, 196, 197, 231, 226, 226, 230, 223, 222, 'j', 206, 197, 200, 199, 201, ':', 'q', 'g', 'g', 'M', 'Q', 'k', 'l', 'l', 'i', 'p', 'q', 'O', 'N', 'p', 'r', 'k', 'k', 's', 't', 'k', 'b', 'c', 148, 154, 148, 'O', 149, 132, 150, 133, 144, 147, 145, 'O', 144, 147, 147, 134, 147, 150, 149, 132, 130, 135, 150, 143, 130, 142, 'O', 142, 134, 149, '9', 'p', 'N', 'I', 'd', 'c', 'k', 'n', 'g', 'd', 'a', 'g', 'h', 23, 'O', 'q', 'p', 'i', 'I', 'Q', 'l', 'h', 'i', 'J', 'Q', 's', 'j', 'j', 't', 't', 'p', 224, 23, 'M', 'm', 'i', 'b', 'f', 'M', '/', 'I', 'b', 'j', 'j', '6', 'M', 'S', 'm', 'e', 'k', 'N', '/', 'I', 'b', 'j', 'j', 'H', 'M', 'm', 'i', 'b', 'A', 165, 202, 194, 157, 130, Typography.cent, 191, 185, 156, Typography.cent, Typography.half, 192, 199, 202, 202, 165, 23, 'J', 'e', 'c', 'j', 'o', 'j', 'e', 'c', 'J', 'N', 'k', 'e', 'H', 'N', 'i', 'l', 's', 'v', 'v', 'Q', '\\', 218, 255, 255, 252, 245, 242, Typography.times, 218, 244, 210, 220, 246, 238, 244, Typography.times, AbstractJsonLexerKt.BEGIN_LIST, 180, Typography.plusMinus, 170, Typography.section, 140, 145, 171, Typography.pound, Typography.copyright, 140, 'm', 143, CoreConstants.PERCENT_CHAR, 'l', 143, 'm', 'c', 128, 134, 'i', 23, 'Q', 'v', 'v', 's', 'l', 'i', 140, 278, 272, 243, 249, 276, 279, 286, 289, 289, 252, 'l', 214, 208, 213, 188, 185, 212, Typography.times, 222, 225, 225, 188, 'd', 197, 191, Typography.cent, 170, 202, 195, 195, 195, 199, 172, 23, 'J', 'l', 'k', 134, 269, 270, 267, 272, 275, 282, 289, '0', 'i', 'q', 'l', 'k', 'j', '9', 'l', 'k', 'k', 'd', 'h', 'q', ';', 'p', Typography.less, '}', 'x', 'x', 'x', 'q', AbstractJsonLexerKt.UNICODE_ESC, 'y', 'z', 'v', 'q', 'w', '}', '~', '=', '|', 'z', 'z', '{', 'w', 'r', 'T', 168, 164, Typography.nbsp, 164, Typography.cent, 130, Matrix.MATRIX_TYPE_ZERO, 179, Typography.plusMinus, 184, 194, 194, '}', 250, 240, 233, 235, 242, 247, 249, 251, 243, 212};
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ad, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9392g.m33357b(r0, 42) != 477111747) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int values(int r9) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.values(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0061, IOException -> 0x00ef, TryCatch #0 {all -> 0x0061, blocks: (B:4:0x0006, B:7:0x003c, B:9:0x0048, B:17:0x007d, B:19:0x009e, B:21:0x00bb, B:23:0x00d8, B:28:0x00e3, B:14:0x0064), top: B:34:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized int valueOf(int r13, com.netcetera.threeds.sdk.infrastructure.C9340e.values[] r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.valueOf(int, com.netcetera.threeds.sdk.infrastructure.e$values[]):int");
    }

    private static int get(int i, getSchemeLogoDark.ThreeDS2Service threeDS2Service, int i2) {
        int i3 = mastercardSchemeConfiguration + 107;
        int i4 = i3 % 128;
        build = i4;
        if (i3 % 2 == 0 ? (i2 & 32) != 0 : (i2 ^ 52) != 0) {
            mastercardSchemeConfiguration = (i4 + 109) % 128;
            return i;
        }
        return threeDS2Service.values(i);
    }

    public static ids get(int i, int i2, get getVar) {
        ids idsVar = new ids(i, i2);
        if (getVar != null) {
            build = (mastercardSchemeConfiguration + 7) % 128;
            getVar.get(idsVar);
        }
        return idsVar;
    }

    private static int ThreeDS2Service(int i) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getSchemeLogo.ThreeDS2ServiceInstance(addParam));
            sb.append(getSchemeLogo.ThreeDS2Service(addParam));
            String obj = sb.toString();
            values[] valuesVarArr = {getParamValue, apiKey, removeParam};
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = build + 49;
                mastercardSchemeConfiguration = i3 % 128;
                if (i3 % 2 != 0) {
                    int ThreeDS2ServiceInstance2 = valuesVarArr[i2].ThreeDS2ServiceInstance(obj);
                    if (ThreeDS2ServiceInstance2 != 0) {
                        build = (mastercardSchemeConfiguration + 43) % 128;
                        return i ^ ThreeDS2ServiceInstance2;
                    }
                } else {
                    valuesVarArr[i2].ThreeDS2ServiceInstance(obj);
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    private static int valueOf(int i, values[] valuesVarArr, String str) {
        build = (mastercardSchemeConfiguration + 111) % 128;
        for (values valuesVar : valuesVarArr) {
            if (valuesVar != null) {
                build = (mastercardSchemeConfiguration + 99) % 128;
                int ThreeDS2ServiceInstance2 = valuesVar.ThreeDS2ServiceInstance(str);
                if (ThreeDS2ServiceInstance2 != 0) {
                    return i ^ ThreeDS2ServiceInstance2;
                }
            }
        }
        return i;
    }

    private static int values(int i, int i2) {
        int i3 = build + 1;
        mastercardSchemeConfiguration = i3 % 128;
        if (i3 % 2 == 0) {
            if (Build.VERSION.SDK_INT < 87) {
                return i;
            }
        } else if (Build.VERSION.SDK_INT < 23) {
            return i;
        }
        if ((i2 & 1024) != 0) {
            mastercardSchemeConfiguration = (build + 75) % 128;
            int m33358b = C9368f.m33358b();
            if (m33358b != 2) {
                return m33358b != 0 ? i ^ 262 : i;
            }
            int i4 = mastercardSchemeConfiguration + 49;
            build = i4 % 128;
            return i4 % 2 != 0 ? i ^ 19123 : i ^ 267;
        }
        return i;
    }

    private static int valueOf(int i, Context context) {
        PackageManager packageManager;
        int i2;
        int i3 = build + 7;
        mastercardSchemeConfiguration = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                ThreeDS2Service(new int[]{-710444422, -991672563, 2070873464, 220302710, 870337881, 629453933, -967348485, 1817028634, -888289141, 1790758104, -747583184, 1521985053}, 115 - Drawable.resolveOpacity(0, 0), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                ThreeDS2Service(new int[]{1933491649, 66361383, 141500155, 662151080, 2045107928, 2013523336, 1517860661, 941706886, -1325313463, 1856390504}, 37 - TextUtils.getOffsetAfter("", 0), objArr2);
                packageManager = (PackageManager) cls.getMethod((String) objArr2[0], null).invoke(context, null);
                i2 = 1;
            } else {
                Object[] objArr3 = new Object[1];
                ThreeDS2Service(new int[]{-710444422, -991672563, 2070873464, 220302710, 870337881, 629453933, -967348485, 1817028634, -888289141, 1790758104, -747583184, 1521985053}, Drawable.resolveOpacity(0, 0) + 23, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                ThreeDS2Service(new int[]{1933491649, 66361383, 141500155, 662151080, 2045107928, 2013523336, 1517860661, 941706886, -1325313463, 1856390504}, 17 - TextUtils.getOffsetAfter("", 0), objArr4);
                packageManager = (PackageManager) cls2.getMethod((String) objArr4[0], null).invoke(context, null);
                i2 = 0;
            }
            Object[] objArr5 = {Integer.valueOf(i2)};
            Object[] objArr6 = new Object[1];
            ThreeDS2Service(new int[]{-710444422, -991672563, 2070873464, 220302710, 870337881, 629453933, -967348485, 1817028634, -1338043936, 365818812, 141500155, 662151080, 2045107928, 2013523336, 1517860661, 941706886, -1325313463, 1856390504}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 33, objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            ThreeDS2Service("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{32, 24, 0, 0}, true, objArr7);
            List list = (List) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(packageManager, objArr5);
            if (list.size() > 0) {
                build = (mastercardSchemeConfiguration + 61) % 128;
                for (Object obj : list) {
                    Object[] objArr8 = new Object[1];
                    ThreeDS2Service("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{56, 34, 19, 0}, true, objArr8);
                    Class<?> cls4 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    ThreeDS2Service(new int[]{-1237299760, 50457581, -1825250179, -1357752088, -1457205220, 338695865}, 9 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                    String str = (String) cls4.getField((String) objArr9[0]).get(obj);
                    if (str != null && visaSchemeConfiguration.ThreeDS2ServiceInstance(str) == -7031551473171390769L) {
                        int i4 = build + 1;
                        mastercardSchemeConfiguration = i4 % 128;
                        return i4 % 2 == 0 ? i | 3066 : i ^ 230;
                    }
                }
                build = (mastercardSchemeConfiguration + 71) % 128;
            } else {
                Object[] objArr10 = new Object[1];
                ThreeDS2Service("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{90, 26, 182, 0}, true, objArr10);
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent((String) objArr10[0]), 0)) {
                    mastercardSchemeConfiguration = (build + 31) % 128;
                    ApplicationInfo applicationInfo = ((ComponentInfo) resolveInfo.activityInfo).applicationInfo;
                    Object[] objArr11 = new Object[1];
                    ThreeDS2Service("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{56, 34, 19, 0}, true, objArr11);
                    Class<?> cls5 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    ThreeDS2Service(new int[]{-1237299760, 50457581, -1825250179, -1357752088, -1457205220, 338695865}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8, objArr12);
                    String str2 = (String) cls5.getField((String) objArr12[0]).get(applicationInfo);
                    if (str2 != null) {
                        mastercardSchemeConfiguration = (build + 43) % 128;
                        if (visaSchemeConfiguration.ThreeDS2ServiceInstance(str2) == -7031551473171390769L) {
                            return i ^ 230;
                        }
                    }
                }
            }
        } catch (RuntimeException unused) {
        }
        return i;
    }

    public static ids values(Context context, int i, int i2, final get getVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Set<BigInteger> ThreeDS2Service2 = getSchemeLogo.ThreeDS2Service(context, addParam);
        int i16 = get(i);
        if (i16 != i && (i15 = get(i16, addParam, i2)) != -1) {
            return get(i, i15, getVar);
        }
        int currentTimeMillis = ((int) System.currentTimeMillis()) ^ 343337308;
        int ThreeDS2ServiceInstance2 = currentTimeMillis ^ C9312d.ThreeDS2ServiceInstance(C9312d.get(m33359c(i ^ currentTimeMillis)));
        if (ThreeDS2ServiceInstance2 != i && (i14 = get(ThreeDS2ServiceInstance2, addParam, i2)) != -1) {
            return get(i, i14, getVar);
        }
        int values2 = values(i);
        if (values2 != i) {
            mastercardSchemeConfiguration = (build + 11) % 128;
            return get(i, values2, getVar);
        }
        int valueOf2 = valueOf(i);
        if (valueOf2 != i) {
            int i17 = mastercardSchemeConfiguration + CameraActivity.REQUEST_CODE;
            build = i17 % 128;
            if (i17 % 2 == 0 ? (i13 = get(valueOf2, addParam, i2)) != -1 : (i13 = get(valueOf2, addParam, i2)) != -1) {
                return get(i, i13, getVar);
            }
        }
        int sDKVersion = getSDKVersion(i);
        if (sDKVersion != i) {
            build = (mastercardSchemeConfiguration + 11) % 128;
            int i18 = get(sDKVersion, addParam, i2);
            if (i18 != -1) {
                mastercardSchemeConfiguration = (build + 47) % 128;
                return get(i, i18, getVar);
            }
        }
        int valueOf3 = valueOf(i, i2);
        if (valueOf3 != i && (i12 = get(valueOf3, addParam, i2)) != -1) {
            build = (mastercardSchemeConfiguration + 39) % 128;
            return get(i, i12, getVar);
        }
        if (ThreeDS2Service2.contains(getSchemeLogo.get)) {
            mastercardSchemeConfiguration = (build + 31) % 128;
            int ThreeDS2ServiceInstance3 = ThreeDS2ServiceInstance(i);
            if (ThreeDS2ServiceInstance3 != i && (i11 = get(ThreeDS2ServiceInstance3, addParam, i2)) != -1) {
                mastercardSchemeConfiguration = (build + 29) % 128;
                return get(i, i11, getVar);
            }
        }
        Object[] objArr = new Object[1];
        ThreeDS2Service("\u0001\u0000", new int[]{277, 2, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 1}, false, objArr);
        int ThreeDS2ServiceInstance4 = ThreeDS2ServiceInstance(i, i2, (String) objArr[0]);
        if (ThreeDS2ServiceInstance4 != i && (i10 = get(ThreeDS2ServiceInstance4, addParam, i2)) != -1) {
            return get(i, i10, getVar);
        }
        int ThreeDS2Service3 = ThreeDS2Service(i);
        if (ThreeDS2Service3 != i) {
            int i19 = build + 1;
            mastercardSchemeConfiguration = i19 % 128;
            if (i19 % 2 != 0 ? (i9 = get(ThreeDS2Service3, addParam, i2)) != -1 : (i9 = get(ThreeDS2Service3, addParam, i2)) != -1) {
                mastercardSchemeConfiguration = (build + 117) % 128;
                return get(i, i9, getVar);
            }
        }
        new eftposConfiguration();
        int ThreeDS2Service4 = eftposConfiguration.ThreeDS2Service(i);
        if (ThreeDS2Service4 != i && (i8 = get(ThreeDS2Service4, addParam, i2)) != -1) {
            return get(i, i8, getVar);
        }
        int values3 = values(i, i2);
        if (values3 != i && (i7 = get(values3, addParam, i2)) != -1) {
            return get(i, i7, getVar);
        }
        int initialize2 = initialize(i);
        if (initialize2 != i && (i6 = get(initialize2, addParam, i2)) != -1) {
            return get(i, i6, getVar);
        }
        int ThreeDS2ServiceInstance5 = ThreeDS2ServiceInstance(i, i2);
        if (ThreeDS2ServiceInstance5 != i) {
            int i20 = build + 107;
            mastercardSchemeConfiguration = i20 % 128;
            if (i20 % 2 != 0 ? (i5 = get(ThreeDS2ServiceInstance5, addParam, i2)) != -1 : (i5 = get(ThreeDS2ServiceInstance5, addParam, i2)) != -1) {
                return get(i, i5, getVar);
            }
        }
        int sDKInfo = getSDKInfo(i);
        if (sDKInfo != i && (i4 = get(sDKInfo, addParam, i2)) != -1) {
            return get(i, i4, getVar);
        }
        if (getVar != null) {
            new valueOf(new get() { // from class: com.netcetera.threeds.sdk.infrastructure.e.2
                private static int ThreeDS2Service = 0;
                private static int valueOf = 1;

                @Override // com.netcetera.threeds.sdk.infrastructure.C9340e.get
                public final void get(ids idsVar) {
                    int i21 = valueOf;
                    ThreeDS2Service = ((i21 ^ 33) + ((i21 & 33) << 1)) % 128;
                    C9340e.ThreeDS2Service = idsVar;
                    get.this.get(idsVar);
                    int i22 = ThreeDS2Service;
                    valueOf = ((i22 & 5) + (i22 | 5)) % 128;
                }
            }, i).start();
        }
        int ThreeDS2Service5 = ThreeDS2Service(i, context, i2);
        if (ThreeDS2Service5 != i && (i3 = get(ThreeDS2Service5, addParam, i2)) != -1) {
            return get(i, i3, getVar);
        }
        return new ids(i, i);
    }

    public static void ThreeDS2Service(Context context, int i, int i2, final ThreeDS2Service threeDS2Service) {
        values(context, i, i2, new get() { // from class: com.netcetera.threeds.sdk.infrastructure.e.1
            private static int valueOf = 0;
            private static int values = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.C9340e.get
            public final void get(ids idsVar) {
                int i3 = values;
                int i4 = (i3 ^ 119) + ((i3 & 119) << 1);
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    if (ThreeDS2Service.this == null) {
                        return;
                    }
                } else if (ThreeDS2Service.this == null) {
                    return;
                }
                ThreeDS2Service.this.ThreeDS2ServiceInstance(idsVar.ThreeDS2ServiceInstance(), idsVar.values());
                valueOf = (values + 71) % 128;
            }
        });
        int i3 = build + 47;
        mastercardSchemeConfiguration = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (rootPublicKey.ThreeDS2Service) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = (int[]) ConfigurationBuilder.clone();
                rootPublicKey.valueOf = 0;
                while (true) {
                    int i2 = rootPublicKey.valueOf;
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
                        rootPublicKey.ThreeDS2ServiceInstance = (c << 16) + c2;
                        rootPublicKey.values = (c3 << 16) + c4;
                        rootPublicKey.get(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = rootPublicKey.ThreeDS2ServiceInstance ^ iArr2[i5];
                            rootPublicKey.ThreeDS2ServiceInstance = i6;
                            rootPublicKey.values = rootPublicKey.ThreeDS2Service(i6) ^ rootPublicKey.values;
                            int i7 = rootPublicKey.ThreeDS2ServiceInstance;
                            rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                            rootPublicKey.values = i7;
                        }
                        int i8 = rootPublicKey.ThreeDS2ServiceInstance;
                        rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                        rootPublicKey.values = i8;
                        rootPublicKey.values = i8 ^ iArr2[16];
                        rootPublicKey.ThreeDS2ServiceInstance ^= iArr2[17];
                        int i9 = rootPublicKey.ThreeDS2ServiceInstance;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = rootPublicKey.values;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        rootPublicKey.get(iArr2);
                        int i11 = rootPublicKey.valueOf;
                        int i12 = i11 * 2;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        rootPublicKey.valueOf = i11 + 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r9, new java.lang.String[]{(java.lang.String) r2[0]}) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r9, new java.lang.String[]{(java.lang.String) r2[0]}) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        r9 = com.netcetera.threeds.sdk.infrastructure.C9340e.cleanup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r4 >= r9.length) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r9[r4]);
        r1.append(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9543l.m33352a(r1.toString()) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        return r8 ^ (r4 + 110);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        r4 = r4 + 1;
        com.netcetera.threeds.sdk.infrastructure.C9340e.build = (com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration + 1) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int ThreeDS2ServiceInstance(int r8, int r9, java.lang.String r10) {
        /*
            r9 = r9 & 64
            if (r9 == 0) goto L5
            return r8
        L5:
            r9 = 13
            r0 = 194(0xc2, float:2.72E-43)
            r1 = 116(0x74, float:1.63E-43)
            r2 = 9
            int[] r9 = new int[]{r1, r9, r0, r2}
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r3 = "\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000"
            r4 = 0
            ThreeDS2Service(r3, r9, r4, r1)
            r9 = r1[r4]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.netcetera.threeds.sdk.infrastructure.C9572m.m33350e(r9)
            if (r9 == 0) goto L91
            int r1 = com.netcetera.threeds.sdk.infrastructure.C9340e.build
            int r1 = r1 + 115
            int r3 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration = r3
            int r1 = r1 % 2
            java.lang.String r3 = "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000"
            r5 = 30
            r6 = 11
            r7 = 129(0x81, float:1.81E-43)
            if (r1 != 0) goto L50
            int[] r1 = new int[]{r7, r6, r5, r2}
            java.lang.Object[] r2 = new java.lang.Object[r0]
            ThreeDS2Service(r3, r1, r4, r2)
            r1 = r2[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r1 = new java.lang.String[]{r1}
            int r9 = com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r9, r1)
            if (r9 != 0) goto L91
            goto L67
        L50:
            int[] r1 = new int[]{r7, r6, r5, r2}
            java.lang.Object[] r2 = new java.lang.Object[r0]
            ThreeDS2Service(r3, r1, r4, r2)
            r1 = r2[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r1 = new java.lang.String[]{r1}
            int r9 = com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r9, r1)
            if (r9 != 0) goto L91
        L67:
            java.lang.String[] r9 = com.netcetera.threeds.sdk.infrastructure.C9340e.cleanup
            int r1 = r9.length
            if (r4 >= r1) goto L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r9 = r9[r4]
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            int r9 = com.netcetera.threeds.sdk.infrastructure.C9543l.m33352a(r9)
            if (r9 != 0) goto L87
            int r4 = r4 + 110
            r8 = r8 ^ r4
            return r8
        L87:
            int r4 = r4 + 1
            int r9 = com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration
            int r9 = r9 + r0
            int r9 = r9 % 128
            com.netcetera.threeds.sdk.infrastructure.C9340e.build = r9
            goto L67
        L91:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.ThreeDS2ServiceInstance(int, int, java.lang.String):int");
    }

    private static int valueOf(int i, int i2) {
        int i3 = build;
        mastercardSchemeConfiguration = (i3 + 75) % 128;
        if ((i2 & 2048) != 0) {
            int i4 = i3 + 61;
            mastercardSchemeConfiguration = i4 % 128;
            if (i4 % 2 != 0) {
                return i;
            }
            throw null;
        }
        int i5 = 0;
        while (true) {
            String[] strArr = getSDKVersion;
            if (i5 >= strArr.length) {
                return i;
            }
            int i6 = mastercardSchemeConfiguration + 99;
            build = i6 % 128;
            if (i6 % 2 == 0) {
                if (C9725s.m33343c(strArr[i5]) == 0) {
                    return i ^ (i5 + 90);
                }
                i5++;
            } else {
                C9725s.m33343c(strArr[i5]);
                throw null;
            }
        }
    }

    private static int ThreeDS2ServiceInstance(int i) {
        mastercardSchemeConfiguration = (build + 61) % 128;
        try {
            Object[] objArr = new Object[1];
            ThreeDS2Service("\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{116, 13, 194, 9}, false, objArr);
            String m33350e = C9572m.m33350e((String) objArr[0]);
            if (m33350e != null) {
                Object[] objArr2 = new Object[1];
                ThreeDS2Service("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{129, 11, 30, 9}, false, objArr2);
                if (getSchemePublicRootKeys.get(m33350e, new String[]{(String) objArr2[0]}) == 0) {
                    mastercardSchemeConfiguration = (build + 39) % 128;
                    return i;
                }
            }
            Object[] objArr3 = new Object[1];
            ThreeDS2Service("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001", new int[]{DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight, 18, 0, 0}, false, objArr3);
            String m33350e2 = C9572m.m33350e((String) objArr3[0]);
            if (m33350e2 != null) {
                int i2 = build + 103;
                mastercardSchemeConfiguration = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    ThreeDS2Service("\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{158, 7, 85, 6}, false, objArr4);
                    if (!m33350e2.equals((String) objArr4[0])) {
                        return i;
                    }
                } else {
                    Object[] objArr5 = new Object[1];
                    ThreeDS2Service("\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{158, 7, 85, 6}, true, objArr5);
                    if (!m33350e2.equals((String) objArr5[0])) {
                        return i;
                    }
                }
                Object[] objArr6 = new Object[1];
                ThreeDS2Service("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{165, 23, 116, 0}, true, objArr6);
                String m33350e3 = C9572m.m33350e((String) objArr6[0]);
                if (m33350e3 != null) {
                    int parseInt = Integer.parseInt(m33350e3);
                    if (parseInt != 0) {
                        int i3 = i ^ (parseInt + 170);
                        build = (mastercardSchemeConfiguration + 61) % 128;
                        return i3;
                    }
                    return i;
                }
                return i;
            }
            return i;
        } catch (Exception unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009c, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r5, new java.lang.String[]{(java.lang.String) r13[0], (java.lang.String) r9[0]}) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x009e, code lost:
        r7 = new java.lang.Object[1];
        ThreeDS2Service("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{194, 23, 0, 15}, true, r7);
        r5 = com.netcetera.threeds.sdk.infrastructure.C9572m.m33350e((java.lang.String) r7[0]);
        r8 = new java.lang.Object[1];
        ThreeDS2Service((java.lang.String) null, new int[]{217, 30, 33, 14}, true, r8);
        r7 = com.netcetera.threeds.sdk.infrastructure.C9572m.m33350e((java.lang.String) r8[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d6, code lost:
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d8, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration = (com.netcetera.threeds.sdk.infrastructure.C9340e.build + 99) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e4, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9392g.m33357b(r5, 42) == 477111747) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e8, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9340e.build = (com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f4, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9392g.m33357b(r7, 42) != 477111747) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f6, code lost:
        r5 = com.netcetera.threeds.sdk.infrastructure.C9340e.onCompleted;
        r7 = r5.length;
        r8 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fb, code lost:
        if (r8 >= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fd, code lost:
        r11 = r5[r8];
        r12 = new java.lang.StringBuilder();
        r15 = new java.lang.Object[1];
        ThreeDS2Service(new int[]{-1501305043, -301856149, -1017516395, 776826462, 2074552243, 1462311956}, 12 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), r15);
        r12.append((java.lang.String) r15[0]);
        r12.append(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0128, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.C9543l.m33352a(r12.toString()) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012a, code lost:
        com.netcetera.threeds.sdk.infrastructure.C9340e.build = (com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration + 71) % 128;
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0134, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0135, code lost:
        r10 = r10 + r11;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0146, code lost:
        if (r10 < (com.netcetera.threeds.sdk.infrastructure.C9340e.onCompleted.length * 0.9d)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0148, code lost:
        r0 = r17 ^ 261;
        r1 = com.netcetera.threeds.sdk.infrastructure.C9340e.build + 19;
        com.netcetera.threeds.sdk.infrastructure.C9340e.mastercardSchemeConfiguration = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0154, code lost:
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0156, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0157, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006f, code lost:
        if (com.netcetera.threeds.sdk.infrastructure.getSchemePublicRootKeys.get(r5, r7) != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int valueOf(int r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.valueOf(int):int");
    }

    private static int ThreeDS2ServiceInstance(int i, int i2) {
        int i3 = build + 17;
        mastercardSchemeConfiguration = i3 % 128;
        if (i3 % 2 != 0 ? (i2 & 4096) != 0 : (i2 ^ 11481) != 0) {
            if (C9744t.m33342c() == 1) {
                return i ^ 265;
            }
        }
        mastercardSchemeConfiguration = (build + 59) % 128;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r12, int[] r13, boolean r14, java.lang.Object[] r15) {
        /*
            if (r12 == 0) goto L8
            java.lang.String r0 = "ISO-8859-1"
            byte[] r12 = r12.getBytes(r0)
        L8:
            byte[] r12 = (byte[]) r12
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.ThreeDS2ServiceInstance
            monitor-enter(r0)
            r1 = 0
            r2 = r13[r1]     // Catch: java.lang.Throwable -> L39
            r3 = 1
            r4 = r13[r3]     // Catch: java.lang.Throwable -> L39
            r5 = 2
            r6 = r13[r5]     // Catch: java.lang.Throwable -> L39
            r7 = 3
            r7 = r13[r7]     // Catch: java.lang.Throwable -> L39
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.C9340e.configureScheme     // Catch: java.lang.Throwable -> L39
            char[] r9 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r8, r2, r9, r1, r4)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L4b
            char[] r2 = new char[r4]     // Catch: java.lang.Throwable -> L39
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
            r8 = 0
        L27:
            int r10 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r10 >= r4) goto L4a
            r11 = r12[r10]     // Catch: java.lang.Throwable -> L39
            if (r11 != r3) goto L3b
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
            int r11 = r11 * 2
            int r11 = r11 + r3
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
            r2[r10] = r8     // Catch: java.lang.Throwable -> L39
            goto L43
        L39:
            r12 = move-exception
            goto L8f
        L3b:
            char r11 = r9[r10]     // Catch: java.lang.Throwable -> L39
            int r11 = r11 * 2
            int r11 = r11 - r8
            char r8 = (char) r11     // Catch: java.lang.Throwable -> L39
            r2[r10] = r8     // Catch: java.lang.Throwable -> L39
        L43:
            char r8 = r2[r10]     // Catch: java.lang.Throwable -> L39
            int r10 = r10 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r10     // Catch: java.lang.Throwable -> L39
            goto L27
        L4a:
            r9 = r2
        L4b:
            if (r7 <= 0) goto L5a
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r9, r1, r12, r1, r4)     // Catch: java.lang.Throwable -> L39
            int r2 = r4 - r7
            java.lang.System.arraycopy(r12, r1, r9, r2, r7)     // Catch: java.lang.Throwable -> L39
            java.lang.System.arraycopy(r12, r7, r9, r1, r2)     // Catch: java.lang.Throwable -> L39
        L5a:
            if (r14 == 0) goto L71
            char[] r12 = new char[r4]     // Catch: java.lang.Throwable -> L39
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
        L60:
            int r14 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r14 >= r4) goto L70
            int r2 = r4 - r14
            int r2 = r2 - r3
            char r2 = r9[r2]     // Catch: java.lang.Throwable -> L39
            r12[r14] = r2     // Catch: java.lang.Throwable -> L39
            int r14 = r14 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r14     // Catch: java.lang.Throwable -> L39
            goto L60
        L70:
            r9 = r12
        L71:
            if (r6 <= 0) goto L86
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r1     // Catch: java.lang.Throwable -> L39
        L75:
            int r12 = com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get     // Catch: java.lang.Throwable -> L39
            if (r12 >= r4) goto L86
            char r14 = r9[r12]     // Catch: java.lang.Throwable -> L39
            r2 = r13[r5]     // Catch: java.lang.Throwable -> L39
            int r14 = r14 - r2
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L39
            r9[r12] = r14     // Catch: java.lang.Throwable -> L39
            int r12 = r12 + 1
            com.netcetera.threeds.sdk.infrastructure.amexConfiguration.get = r12     // Catch: java.lang.Throwable -> L39
            goto L75
        L86:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L39
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            r15[r1] = r12
            return
        L8f:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9340e.ThreeDS2Service(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }
}