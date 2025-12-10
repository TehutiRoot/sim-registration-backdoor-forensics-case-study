package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public class setLineSpacing {
    public static long ThreeDS2Service = 1371945196448432526L;
    public static char ThreeDS2ServiceInstance = 0;
    public static long get = -7277928229446554361L;
    private static int jcbConfiguration = 0;
    private static int unionSchemeConfiguration = 1;
    public static int valueOf;
    private final Boolean ConfigParameters;
    private final int ConfigurationBuilder;
    private final replaceAll SchemeConfiguration;
    private final String ThreeDS2Service$InitializationCallback;
    private final String addParam;
    private final Boolean apiKey;
    private final String build;
    private final String cleanup;
    private final initCause configureScheme;
    private final setCustomSelectionActionModeCallback createTransaction;
    private final computeIfPresent getParamValue;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final getStackTrace getWarnings;
    private final String initialize;
    private final putAll mastercardSchemeConfiguration;
    private final put onCompleted;
    private final computeIfAbsent onError;
    private final EnumC9571load removeParam;
    private final String restrictedParameters;
    private final String values;

    public setLineSpacing(String str, String str2, getStackTrace getstacktrace, String str3, String str4, String str5, setCustomSelectionActionModeCallback setcustomselectionactionmodecallback, put putVar, Boolean bool, String str6, computeIfAbsent computeifabsent, Boolean bool2, EnumC9571load enumC9571load, String str7, int i, String str8, computeIfPresent computeifpresent, String str9, replaceAll replaceall, putAll putall, initCause initcause) {
        this.values = str;
        this.getSDKInfo = str2;
        this.getWarnings = getstacktrace;
        this.initialize = str3;
        this.cleanup = str4;
        this.getSDKVersion = str5;
        this.createTransaction = setcustomselectionactionmodecallback;
        this.onCompleted = putVar;
        this.ConfigParameters = bool;
        this.ThreeDS2Service$InitializationCallback = str6;
        this.onError = computeifabsent;
        this.apiKey = bool2;
        this.removeParam = enumC9571load;
        this.addParam = str7;
        this.ConfigurationBuilder = i;
        this.getParamValue = computeifpresent;
        this.restrictedParameters = str8;
        this.build = str9;
        this.SchemeConfiguration = replaceall;
        this.mastercardSchemeConfiguration = putall;
        this.configureScheme = initcause;
    }

    public putAll ConfigParameters() {
        int i = jcbConfiguration;
        putAll putall = this.mastercardSchemeConfiguration;
        unionSchemeConfiguration = (i + 19) % 128;
        return putall;
    }

    public String ConfigurationBuilder() {
        int i = unionSchemeConfiguration;
        String str = this.addParam;
        int i2 = i + 47;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public String SchemeConfiguration() {
        int i = unionSchemeConfiguration;
        int i2 = i + 57;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            String str = this.build;
            jcbConfiguration = (i + 111) % 128;
            return str;
        }
        throw null;
    }

    public getStackTrace ThreeDS2Service() {
        int i = unionSchemeConfiguration;
        getStackTrace getstacktrace = this.getWarnings;
        jcbConfiguration = (i + 23) % 128;
        return getstacktrace;
    }

    public computeIfPresent ThreeDS2Service$InitializationCallback() {
        int i = unionSchemeConfiguration + 11;
        jcbConfiguration = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
            return this.getParamValue;
        }
        return this.getParamValue;
    }

    public String ThreeDS2ServiceInstance() {
        int i = (unionSchemeConfiguration + 57) % 128;
        jcbConfiguration = i;
        String str = this.values;
        int i2 = i + 91;
        unionSchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return str;
    }

    public String addParam() {
        int i = (unionSchemeConfiguration + 95) % 128;
        jcbConfiguration = i;
        String str = this.restrictedParameters;
        unionSchemeConfiguration = (i + 103) % 128;
        return str;
    }

    public computeIfAbsent apiKey() {
        int i = jcbConfiguration + 37;
        unionSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
            return this.onError;
        }
        return this.onError;
    }

    public String build() {
        Object obj;
        int i = jcbConfiguration + 11;
        unionSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            TextUtils.lastIndexOf("", 'B');
            Object[] objArr = new Object[1];
            valueOf(0, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 45) * 4804), "韘\uf381", "骛\ue663⋟嘲", "\ued07\udf0c髕髿", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(TextUtils.lastIndexOf("", '0') + 1, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12834), "韘\uf381", "骛\ue663⋟嘲", "\ued07\udf0c髕髿", objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = unionSchemeConfiguration + 5;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return intern;
    }

    public EnumC9571load cleanup() {
        int i = jcbConfiguration + 7;
        int i2 = i % 128;
        unionSchemeConfiguration = i2;
        if (i % 2 != 0) {
            EnumC9571load enumC9571load = this.removeParam;
            int i3 = i2 + 31;
            jcbConfiguration = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
            }
            return enumC9571load;
        }
        throw null;
    }

    public initCause configureScheme() {
        int i = (jcbConfiguration + 45) % 128;
        unionSchemeConfiguration = i;
        initCause initcause = this.configureScheme;
        jcbConfiguration = (i + 99) % 128;
        return initcause;
    }

    public Boolean createTransaction() {
        int i = (jcbConfiguration + 69) % 128;
        unionSchemeConfiguration = i;
        Boolean bool = this.ConfigParameters;
        int i2 = i + 1;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public String get() {
        int i = jcbConfiguration;
        String str = this.initialize;
        int i2 = i + 27;
        unionSchemeConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public Boolean getParamValue() {
        int i = unionSchemeConfiguration + 35;
        int i2 = i % 128;
        jcbConfiguration = i2;
        if (i % 2 == 0) {
            Boolean bool = this.apiKey;
            unionSchemeConfiguration = (i2 + 89) % 128;
            return bool;
        }
        throw null;
    }

    public setCustomSelectionActionModeCallback getSDKInfo() {
        int i = jcbConfiguration + 49;
        unionSchemeConfiguration = i % 128;
        if (i % 2 != 0) {
            return this.createTransaction;
        }
        throw null;
    }

    public String getSDKVersion() {
        int i = (jcbConfiguration + 41) % 128;
        unionSchemeConfiguration = i;
        String str = this.getSDKVersion;
        int i2 = i + 61;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return str;
    }

    public keySet getWarnings() {
        int i = jcbConfiguration + 53;
        unionSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
            return keySet.values;
        }
        return keySet.values;
    }

    public put initialize() {
        put putVar;
        int i = jcbConfiguration;
        int i2 = i + 51;
        unionSchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            putVar = this.onCompleted;
            int i3 = 93 / 0;
        } else {
            putVar = this.onCompleted;
        }
        unionSchemeConfiguration = (i + 15) % 128;
        return putVar;
    }

    public String onCompleted() {
        int i = unionSchemeConfiguration;
        String str = this.ThreeDS2Service$InitializationCallback;
        int i2 = i + 41;
        jcbConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public replaceAll onError() {
        int i = unionSchemeConfiguration;
        replaceAll replaceall = this.SchemeConfiguration;
        jcbConfiguration = (i + 69) % 128;
        return replaceall;
    }

    public int removeParam() {
        int i = jcbConfiguration;
        int i2 = this.ConfigurationBuilder;
        unionSchemeConfiguration = (i + 67) % 128;
        return i2;
    }

    public String toString() {
        Object[] objArr = new Object[1];
        valueOf((-19616493) - TextUtils.indexOf("", "", 0, 0), (char) (55819 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "蔖㗎\ua959퍕佚沺蹴ꠙ\ueed4䮟벂钿།솘ꮻざ朑", "ጀ풭૾\uf0da", "\ued07\udf0c髕髿", objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        get("禙秭_㵻솹븕仯ਠ翄ػ㜒ў疌వ\u31efᾐ歃ᗛ⮣\u19dc愗ᮤ■ጡ暼ℸ", TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.values);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr3 = new Object[1];
        get("\u008f£淕˵걻膈䏿ܶۄ毩ࢮॼ\u0c91懶ํኡሚ硪", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.getSDKInfo);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr4 = new Object[1];
        get("벮벂髁\ueac4孯榻娵ỷ뫷鳅\ue083Ⴒ낰零\ue652୬깧輷ﰜംꐢ脼", (-1) - ExpandableListView.getPackedPositionChild(0L), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(this.getWarnings);
        Object[] objArr5 = new Object[1];
        get("᪖᪺䭢꛷諌█湼⪾\u1ccf䵦결⓻ᚈ䝕ꩡ㼢\u085f庎뀭㥫Ș僖븆㎏ֳ橍", TextUtils.getOffsetAfter("", 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(this.initialize);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr6 = new Object[1];
        valueOf((-442379973) - Process.getGidForName(""), (char) View.resolveSizeAndState(0, 0, 0), "\udbe9駏碢坔㐴젛媻ꠣ\uf2a3ೃ쏰\udb6c\uec05\ue3e9鯢뿙ꔪﭧ挴⽖उ켖测\uf248圎", "㲍ꇑ\ue8e5縒", "\ued07\udf0c髕髿", objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(this.cleanup);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr7 = new Object[1];
        get("ﱣﱏថ\u0e75혾贊蒠쁢墨ᆔв츧\uf07dᮧˣ헲\uee9fɅᢂ펶\ue4e2తᚗ\ud96f\ue315㛬⽌\ue71b\ud90eデ", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(this.getSDKVersion);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr8 = new Object[1];
        valueOf((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 550007305, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 48633), "\ue77f놇슥覰縪꯬䋩瑴暁㨋撽♖웇俑付뤸ϟ芁\uefb1", "ੜ졲鸞㶽", "\ued07\udf0c髕髿", objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(this.createTransaction);
        Object[] objArr9 = new Object[1];
        get("꽱꽝㽡⇨ﻏꊙ\u193e己ꤺ㥺⮬去ꍤ㍧⵰䡖붪⪐㜲丂랬", View.getDefaultSize(0, 0), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(this.onCompleted);
        Object[] objArr10 = new Object[1];
        get("ᅁᅭ㡣鿩留Ლ궗\ue952\u171b㹈閡\ue71bᵅ㑚鍸ﳸΌⶭ襬\ufaf4\u0991⎞", View.resolveSize(0, 0), objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(this.ConfigParameters);
        Object[] objArr11 = new Object[1];
        valueOf((-447611867) - TextUtils.indexOf((CharSequence) "", '0'), (char) (17527 - TextUtils.indexOf("", "", 0, 0)), "疚걪潃쿿\uf60e䶕ᴈ麯闏羟\u0000\uf2e2뵵㤛쏋霰\uee7cﳬ㼾", "♍凼知㝄", "\ued07\udf0c髕髿", objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(this.ThreeDS2Service$InitializationCallback);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr12 = new Object[1];
        get("\ue049\ue065᷒鵍\udc7cḣ媜ṓ\ue602ᯟ霙ယ\uec7aᇪ野௪\uf28d\u082f讉ඩ\uf8ccد", TextUtils.getOffsetAfter("", 0), objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(this.onError);
        Object[] objArr13 = new Object[1];
        valueOf(View.MeasureSpec.getSize(0), (char) View.MeasureSpec.getMode(0), "\u18ffய⦝〥鷘ࣿ䗾\ufb10擵畜\uf709唞\uf371䒡춚勺\ue5a1墙Ⓤ뎸嵍\ue87b\uefac붫", "쩱채ࡨ쯺", "\ued07\udf0c髕髿", objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(this.apiKey);
        Object[] objArr14 = new Object[1];
        valueOf(AndroidCharacter.getMirror('0') - 38641, (char) (KeyEvent.getDeadChar(0, 0) + 38927), "\ude39蛢⫿ꁱ屖\ued8bꄚ췟ᙆ\ufded욼狼끹\uecb3逸穹읦䁁⅑", "㼮婩࿁캘", "\ued07\udf0c髕髿", objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(this.removeParam);
        Object[] objArr15 = new Object[1];
        get("\u1c8bᲧ\ue5f6ꙍ\u2458┢\uf735돻\u1ad8\ue3ca간붶႕\ue9d5ꫧꙫพ\uf049", Drawable.resolveOpacity(0, 0), objArr15);
        sb.append(((String) objArr15[0]).intern());
        sb.append(this.addParam);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr16 = new Object[1];
        valueOf(((Process.getThreadPriority(0) + 20) >> 6) + 25604305, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 54464), "\udc7c鼰迶햂㴾\ue128吀ј壩挳ᴅ\ua958Ᾰ돷甫鉲㙊", "텴蚰쀁䀹", "\ued07\udf0c髕髿", objArr16);
        sb.append(((String) objArr16[0]).intern());
        sb.append(this.ConfigurationBuilder);
        Object[] objArr17 = new Object[1];
        valueOf((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "ᆠ껇ﺲ쐨ﭯ䅾䯂ꗌꊘ㾟⓿ち㛂쉒쟸螂ꍚ䜜脧锱폖尝ﵿ琓", "\ue194ﴒ毥昿", "\ued07\udf0c髕髿", objArr17);
        sb.append(((String) objArr17[0]).intern());
        sb.append(this.getParamValue);
        Object[] objArr18 = new Object[1];
        valueOf((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) (15494 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "샦豸搸䜒ϫ\ue7a0吭춓귌콢䁂㉤Ὴ䬏Κ諘ⱂꢏ⨷\uf0f2䚫ꊽä씬\uf4cd㋄", "鸃\u0b59蕔☼", "\ued07\udf0c髕髿", objArr18);
        sb.append(((String) objArr18[0]).intern());
        sb.append(this.restrictedParameters);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr19 = new Object[1];
        get("鰾鰒辳浼丝\uee0f\uef93ꭖ驤覚末ꔁ逝莗懢뻽軣驘篶룦", Drawable.resolveOpacity(0, 0), objArr19);
        sb.append(((String) objArr19[0]).intern());
        sb.append(this.build);
        sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
        Object[] objArr20 = new Object[1];
        get("톍톡亱\ude94輟巼鰴\ud8ecퟀ䢪퓜횚\udd94䊒툄쵪썄孝졙쬣줃唅왲쇇캨", View.MeasureSpec.makeMeasureSpec(0, 0), objArr20);
        sb.append(((String) objArr20[0]).intern());
        sb.append(this.SchemeConfiguration);
        Object[] objArr21 = new Object[1];
        valueOf((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1079515465, (char) TextUtils.getOffsetAfter("", 0), "ₘ竰◹\ue0ec滻熪䆲ᦿ寺㭆頱浔ﰴ䟈쵏㋩ⳙꋿ\uf8c3\uf43f\ue361尽坰륁⤻", "뢤\ua7e6뾿ᷭ", "\ued07\udf0c髕髿", objArr21);
        sb.append(((String) objArr21[0]).intern());
        sb.append(this.mastercardSchemeConfiguration);
        Object[] objArr22 = new Object[1];
        get("쓁쓭ꋫ痸捅\uf687执⚥슘ꓯ羿⣠죟껜祮㌼혍뜗挀㕚\udc45륎浆", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr22);
        sb.append(((String) objArr22[0]).intern());
        sb.append(this.configureScheme);
        sb.append('}');
        String sb2 = sb.toString();
        unionSchemeConfiguration = (jcbConfiguration + 107) % 128;
        return sb2;
    }

    public String valueOf() {
        int i = jcbConfiguration;
        int i2 = i + 5;
        unionSchemeConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            String str = this.cleanup;
            int i3 = i + 23;
            unionSchemeConfiguration = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String values() {
        int i = jcbConfiguration;
        String str = this.getSDKInfo;
        int i2 = i + 5;
        unionSchemeConfiguration = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getWarnings.valueOf
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.setLineSpacing.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setLineSpacing.ThreeDS2Service     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLineSpacing.get(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.setLineSpacing.get     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.setLineSpacing.valueOf     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.setLineSpacing.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setLineSpacing.valueOf(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    /* loaded from: classes5.dex */
    public static class ThreeDS2ServiceInstance {
        private static int build = 1;
        private static int mastercardSchemeConfiguration;
        private final String ConfigParameters;
        private computeIfPresent ConfigurationBuilder;
        private final InterfaceC9499jc SchemeConfiguration;
        private String ThreeDS2Service;
        private EnumC9571load ThreeDS2Service$InitializationCallback;
        private getStackTrace ThreeDS2ServiceInstance;
        private String addParam;
        private putAll apiKey;
        private Boolean cleanup;
        private final int createTransaction;
        private final String get;
        private initCause getParamValue;
        private String getSDKInfo;
        private computeIfAbsent getSDKVersion;
        private String getWarnings;
        private final put initialize;
        private final String onCompleted;
        private Boolean onError;
        private replaceAll removeParam;
        private String valueOf;
        private final String values;

        public ThreeDS2ServiceInstance(String str, String str2, put putVar, String str3, int i, String str4, InterfaceC9499jc interfaceC9499jc) {
            this.values = str;
            this.get = str2;
            this.initialize = putVar;
            this.onCompleted = str3;
            this.createTransaction = i;
            this.ConfigParameters = str4;
            this.SchemeConfiguration = interfaceC9499jc;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(String str) {
            int i = mastercardSchemeConfiguration;
            int i2 = i & 31;
            int i3 = -(-(i | 31));
            int i4 = (i2 & i3) + (i3 | i2);
            build = i4 % 128;
            if (i4 % 2 != 0) {
                this.getWarnings = str;
                return this;
            }
            this.getWarnings = str;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(String str) {
            int i = mastercardSchemeConfiguration;
            int i2 = (-2) - (~((i & 28) + (i | 28)));
            int i3 = i2 % 128;
            build = i3;
            if (i2 % 2 != 0) {
                this.valueOf = str;
                int i4 = i3 + 112;
                mastercardSchemeConfiguration = ((~i4) + (i4 << 1)) % 128;
                return this;
            }
            this.valueOf = str;
            throw null;
        }

        public ThreeDS2ServiceInstance get(getStackTrace getstacktrace) {
            int i = mastercardSchemeConfiguration;
            int i2 = (((i ^ 43) | (i & 43)) << 1) - (((~i) & 43) | (i & (-44)));
            int i3 = i2 % 128;
            build = i3;
            if (i2 % 2 != 0) {
                this.ThreeDS2ServiceInstance = getstacktrace;
                int i4 = i3 ^ 47;
                int i5 = ((i3 & 47) | i4) << 1;
                int i6 = -i4;
                mastercardSchemeConfiguration = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
                return this;
            }
            this.ThreeDS2ServiceInstance = getstacktrace;
            throw null;
        }

        public ThreeDS2ServiceInstance valueOf(setCustomSelectionActionModeCallback setcustomselectionactionmodecallback) {
            int i = build;
            int i2 = (i & 35) + (i | 35);
            mastercardSchemeConfiguration = i2 % 128;
            if (i2 % 2 != 0) {
                this.SchemeConfiguration.valueOf(setcustomselectionactionmodecallback);
                int i3 = 8 / 0;
            } else {
                this.SchemeConfiguration.valueOf(setcustomselectionactionmodecallback);
            }
            return this;
        }

        public ThreeDS2ServiceInstance values(String str) {
            int i = mastercardSchemeConfiguration;
            int i2 = i ^ 63;
            int i3 = (i & 63) << 1;
            int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
            int i5 = i4 % 128;
            build = i5;
            if (i4 % 2 == 0) {
                this.ThreeDS2Service = str;
                int i6 = 99 / 0;
            } else {
                this.ThreeDS2Service = str;
            }
            int i7 = i5 & 99;
            int i8 = i7 + ((i5 ^ 99) | i7);
            mastercardSchemeConfiguration = i8 % 128;
            if (i8 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(Boolean bool) {
            int i = build;
            int i2 = ((i & 59) + (i | 59)) % 128;
            mastercardSchemeConfiguration = i2;
            this.cleanup = bool;
            int i3 = i2 + 54;
            int i4 = (~i3) + (i3 << 1);
            build = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance valueOf(String str) {
            int i = build;
            int i2 = (-2) - (~(i + 36));
            mastercardSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.getSDKInfo = str;
                int i3 = i & 77;
                int i4 = (i ^ 77) | i3;
                mastercardSchemeConfiguration = ((i3 & i4) + (i3 | i4)) % 128;
                return this;
            }
            this.getSDKInfo = str;
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2ServiceInstance(Boolean bool) {
            int i = mastercardSchemeConfiguration;
            this.onError = bool;
            build = (((i & 14) + (i | 14)) - 1) % 128;
            return this;
        }

        public ThreeDS2ServiceInstance get(computeIfAbsent computeifabsent) {
            int i = mastercardSchemeConfiguration;
            int i2 = (i & (-48)) | ((~i) & 47);
            int i3 = (i & 47) << 1;
            int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
            build = i4 % 128;
            if (i4 % 2 != 0) {
                this.getSDKVersion = computeifabsent;
                int i5 = ((i & 71) - (~(-(-(i | 71))))) - 1;
                build = i5 % 128;
                if (i5 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.getSDKVersion = computeifabsent;
            throw null;
        }

        public ThreeDS2ServiceInstance values(putAll putall) {
            int i = mastercardSchemeConfiguration;
            int i2 = (((i & (-80)) | ((~i) & 79)) - (~(-(-((i & 79) << 1))))) - 1;
            build = i2 % 128;
            if (i2 % 2 == 0) {
                this.apiKey = putall;
                int i3 = 37 / 0;
            } else {
                this.apiKey = putall;
            }
            return this;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(replaceAll replaceall) {
            int i = mastercardSchemeConfiguration;
            int i2 = ((i | 73) << 1) - (i ^ 73);
            build = i2 % 128;
            if (i2 % 2 != 0) {
                this.removeParam = replaceall;
                int i3 = i | 7;
                int i4 = ((i3 << 1) - (~(-(i3 & (~(i & 7)))))) - 1;
                build = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.removeParam = replaceall;
            throw null;
        }

        public ThreeDS2ServiceInstance valueOf(computeIfPresent computeifpresent) {
            int i = mastercardSchemeConfiguration;
            int i2 = (i & 13) + (i | 13);
            build = i2 % 128;
            if (i2 % 2 == 0) {
                this.ConfigurationBuilder = computeifpresent;
                int i3 = 93 / 0;
            } else {
                this.ConfigurationBuilder = computeifpresent;
            }
            return this;
        }

        public setLineSpacing values() {
            setLineSpacing setlinespacing = new setLineSpacing(this.values, this.get, this.ThreeDS2ServiceInstance, this.valueOf, this.ThreeDS2Service, this.getWarnings, this.SchemeConfiguration.values(this.initialize), this.initialize, this.cleanup, this.getSDKInfo, this.getSDKVersion, this.onError, this.ThreeDS2Service$InitializationCallback, this.onCompleted, this.createTransaction, this.ConfigParameters, this.ConfigurationBuilder, this.addParam, this.removeParam, this.apiKey, this.getParamValue);
            int i = mastercardSchemeConfiguration;
            int i2 = i & 89;
            int i3 = i | 89;
            build = ((i2 & i3) + (i3 | i2)) % 128;
            return setlinespacing;
        }

        public ThreeDS2ServiceInstance get(EnumC9571load enumC9571load) {
            int i = build;
            int i2 = ((i ^ 27) + ((i & 27) << 1)) % 128;
            mastercardSchemeConfiguration = i2;
            this.ThreeDS2Service$InitializationCallback = enumC9571load;
            int i3 = (((i2 & (-8)) | ((~i2) & 7)) - (~((i2 & 7) << 1))) - 1;
            build = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public ThreeDS2ServiceInstance ThreeDS2Service(initCause initcause) {
            int i = mastercardSchemeConfiguration;
            int i2 = i ^ 87;
            int i3 = ((i & 87) | i2) << 1;
            int i4 = -i2;
            int i5 = (i3 & i4) + (i4 | i3);
            build = i5 % 128;
            if (i5 % 2 != 0) {
                this.getParamValue = initcause;
                int i6 = i & 101;
                int i7 = ((i | 101) & (~i6)) + (i6 << 1);
                build = i7 % 128;
                if (i7 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.getParamValue = initcause;
            throw null;
        }

        public ThreeDS2ServiceInstance get(String str) {
            int i = mastercardSchemeConfiguration;
            this.addParam = str;
            int i2 = i ^ 111;
            int i3 = (((i & 111) | i2) << 1) - i2;
            build = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }
    }
}
