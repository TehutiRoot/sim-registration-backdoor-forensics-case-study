package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;

@SuppressLint({"ClickableViewAccessibility"})
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ai */
/* loaded from: classes5.dex */
public class View$OnTouchListenerC9242ai extends AbstractC9758w<EditText> implements View.OnTouchListener, save {
    private static int SchemeConfiguration = 1;
    private static final String ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static final String createTransaction;
    public static long get;
    private static final String getWarnings;
    private static final String initialize;
    private static int restrictedParameters;
    private static final String valueOf;
    public static long values;
    private final InterfaceC9513jq ConfigParameters;
    private Drawable ConfigurationBuilder;
    private final String ThreeDS2Service$InitializationCallback;
    private boolean addParam;
    private EditText apiKey;
    private boolean configureScheme;
    private Drawable getParamValue;
    private boolean mastercardSchemeConfiguration;
    private final String onCompleted;
    private final String onError;
    private final String removeParam;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        values("\uec88埽\uf8afꤷ\uecd8鯓恂충\uddc3ꨙㄇ㽺躤祕Ϟ渵罐㞛풸凸⠌우ꕘ肿\u1acd闅瘊\uf243쮐ꐥ㣇┇둂獺সᓏ攸Ơ\udab4䞉埱탸ꭶ襛\u009b\uef3f簠\uf826\uf16b빱", 1 - KeyEvent.getDeadChar(0, 0), objArr);
        createTransaction = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values("哗ڿይ㿔咇쪑言孊斜ﭛ\udb45ꦙ㛻⠗\ue99c\uf8d6윏曙㻺윛道韲会ᙜꊒ쒇鱈撠珏\uf567튅돤ఝ∸\ue3fa般\udd64僤ヲ텭\uefae膟䄲ᾤ룛빯陴", TextUtils.indexOf("", "") + 1, objArr2);
        initialize = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        values("嶛롪땹ȧ巋瑄ⶔ暹泐䖎糑鑪㾮雌东씩칪\ud807饟\ufaf4餒⤀\ue89e⮹ꯘ穼㯃契窝䮸甑踆ժ鳰䑨뿂퐚\uee31面\ueca1\ue6e2㽸\ue697≙놬", 1 - View.MeasureSpec.getMode(0), objArr3);
        getWarnings = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        values("婄এ嗉ྔ娔얡촤權欏\uf46b鱡駙㡨✧꺸좖즜槩秞\uf75b黀飂࠾☜각쮷\udb6c哠絜練閡莤ʎⴈꓞ뉬폴忒矒\ue12a\ue13d躊ؐ⿸뙗녍텆庞䞾\ue009", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr4);
        ThreeDS2ServiceInstance = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        values("싩怔䖇縤승갺\udd6a᪺\uf3a2鷰谯\ue869ꃅ亼뻶뤦儱r榐蛫٭\uf159ᡰ垬㒬ꈬ쬢═\ue5f1鏌藯\uf214騣䒓뒐쏜䭚㙏枘邝禐\ue734ᙘ幔\u2efe\ud8dd섔", View.resolveSizeAndState(0, 0, 0) + 1, objArr5);
        valueOf = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        ThreeDS2ServiceInstance("\ud8f3偓짲䅣敖爙\uebb7挰鱦ᗛ赺۳븪㞐꼹\ud8ae凊쥗䋸﨣玘\ueb2b撥鷋ᕕ軯ٷ뾜㜪ꂧ\ud80e兘쫢䉦ﮄ猻\ueca2搯鵪ᛚ蹮", TextUtils.lastIndexOf("", '0', 0, 0) + 34962, objArr6);
        ThreeDS2Service = ((String) objArr6[0]).intern();
        int i = restrictedParameters + 77;
        SchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
    }

    public View$OnTouchListenerC9242ai(Context context, InterfaceC9513jq interfaceC9513jq, String str, String str2, String str3, String str4) {
        super(context);
        this.addParam = false;
        this.mastercardSchemeConfiguration = false;
        this.configureScheme = false;
        this.ConfigParameters = interfaceC9513jq;
        this.onError = str;
        this.onCompleted = str2;
        this.ThreeDS2Service$InitializationCallback = str3;
        this.removeParam = str4;
    }

    private void ThreeDS2Service(boolean z) {
        int i = SchemeConfiguration + 113;
        restrictedParameters = i % 128;
        PasswordTransformationMethod passwordTransformationMethod = null;
        if (i % 2 == 0) {
            this.addParam = z;
            int selectionEnd = this.apiKey.getSelectionEnd();
            EditText editText = this.apiKey;
            if (this.addParam) {
                passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                restrictedParameters = (SchemeConfiguration + 17) % 128;
            }
            editText.setTransformationMethod(passwordTransformationMethod);
            if (selectionEnd >= 0) {
                this.apiKey.setSelection(selectionEnd);
                return;
            }
            return;
        }
        this.addParam = z;
        this.apiKey.getSelectionEnd();
        throw null;
    }

    public static void valueOf() {
        get = 8887842704166475939L;
        values = -1573769101711979441L;
    }

    public void ThreeDS2ServiceInstance() {
        restrictedParameters = (SchemeConfiguration + 47) % 128;
        this.configureScheme = true;
        get(true);
        this.apiKey.setOnTouchListener(this);
        int i = restrictedParameters + 107;
        SchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9758w
    public /* synthetic */ EditText get(Context context) {
        restrictedParameters = (SchemeConfiguration + 23) % 128;
        EditText values2 = values(context);
        int i = restrictedParameters + 17;
        SchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
        return values2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getAction() == 1) {
            restrictedParameters = (SchemeConfiguration + 43) % 128;
            Drawable drawable = this.apiKey.getCompoundDrawables()[2];
            if (drawable != null) {
                if (motionEvent.getRawX() >= this.apiKey.getRight() - drawable.getBounds().width()) {
                    if (!this.mastercardSchemeConfiguration) {
                        z = true;
                    } else {
                        SchemeConfiguration = (restrictedParameters + 63) % 128;
                    }
                    get(z);
                    return true;
                }
            }
        }
        return false;
    }

    public EditText values(Context context) {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("\ud8caힿ옂\uf6ae\ue53e閫萪뒭ꌴ厦䈱犉愣ᆿ6サ⼿\udfa9츒ﺸ\ued26鶻谠벨\uab27审", 3966 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        this.ConfigurationBuilder = values(context, ((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        values("\ufd4f傽ｬ\uf22aﴦ鲑枭隷찒굅㛅摴齘縈О㔐溏パ퍙૬㧓쇧ꊽ\udb9aଂ銵燍\ua956\uda43", AndroidCharacter.getMirror('0') - '/', objArr2);
        this.getParamValue = values(context, ((String) objArr2[0]).intern());
        EditText editText = new EditText(context);
        this.apiKey = editText;
        editText.setLayoutParams(C9378ex.valueOf());
        EditText editText2 = this.apiKey;
        int i = C9375et.values;
        editText2.setPadding(i, 0, i, 0);
        this.apiKey.setSingleLine(true);
        this.apiKey.setFilters(new InputFilter[]{new InputFilter.LengthFilter(45)});
        this.apiKey.setMinHeight(C9375et.getSDKInfo);
        this.apiKey.setInputType(524432);
        values(this.apiKey, this.removeParam);
        C9377ev.get(this.apiKey, this.ConfigParameters);
        EditText editText3 = this.apiKey;
        int i2 = restrictedParameters + 19;
        SchemeConfiguration = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return editText3;
    }

    public static View$OnTouchListenerC9242ai get(Context context, InterfaceC9513jq interfaceC9513jq) {
        Object[] objArr = new Object[1];
        values("嶛롪땹ȧ巋瑄ⶔ暹泐䖎糑鑪㾮雌东씩칪\ud807饟\ufaf4餒⤀\ue89e⮹ꯘ穼㯃契窝䮸甑踆ժ鳰䑨뿂퐚\uee31面\ueca1\ue6e2㽸\ue697≙놬", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values("哗ڿይ㿔咇쪑言孊斜ﭛ\udb45ꦙ㛻⠗\ue99c\uf8d6윏曙㻺윛道韲会ᙜꊒ쒇鱈撠珏\uf567튅돤ఝ∸\ue3fa般\udd64僤ヲ텭\uefae膟䄲ᾤ룛빯陴", TextUtils.getOffsetAfter("", 0) + 1, objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        values("\uec88埽\uf8afꤷ\uecd8鯓恂충\uddc3ꨙㄇ㽺躤祕Ϟ渵罐㞛풸凸⠌우ꕘ肿\u1acd闅瘊\uf243쮐ꐥ㣇┇둂獺সᓏ攸Ơ\udab4䞉埱탸ꭶ襛\u009b\uef3f簠\uf826\uf16b빱", KeyEvent.getDeadChar(0, 0) + 1, objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("\ud8c0ä梜偂롳\ue02d짗ㆍᦾ䅛꤀鋏靖⊣ਖ਼爃娿菐\ueb88펰㭨挝䳶듿鲥쑀Ⱇᐯ緘ꖒ赎\uf56a\udd1cۘ滪嚡빠\ue601츷㟺ᾎ䝐", Color.alpha(0) + 55343, objArr4);
        View$OnTouchListenerC9242ai view$OnTouchListenerC9242ai = new View$OnTouchListenerC9242ai(context, interfaceC9513jq, intern, intern2, intern3, ((String) objArr4[0]).intern());
        restrictedParameters = (SchemeConfiguration + 49) % 128;
        return view$OnTouchListenerC9242ai;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.contains
    public void valueOf(setAllCaps setallcaps) {
        restrictedParameters = (SchemeConfiguration + 67) % 128;
    }

    public static View$OnTouchListenerC9242ai valueOf(Context context, InterfaceC9513jq interfaceC9513jq) {
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance("\ud8f3偓짲䅣敖爙\uebb7挰鱦ᗛ赺۳븪㞐꼹\ud8ae凊쥗䋸﨣玘\ueb2b撥鷋ᕕ軯ٷ뾜㜪ꂧ\ud80e兘쫢䉦ﮄ猻\ueca2搯鵪ᛚ蹮", 34961 - TextUtils.indexOf("", "", 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values("싩怔䖇縤승갺\udd6a᪺\uf3a2鷰谯\ue869ꃅ亼뻶뤦儱r榐蛫٭\uf159ᡰ垬㒬ꈬ쬢═\ue5f1鏌藯\uf214騣䒓뒐쏜䭚㙏枘邝禐\ue734ᙘ幔\u2efe\ud8dd섔", -TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        values("婄এ嗉ྔ娔얡촤權欏\uf46b鱡駙㡨✧꺸좖즜槩秞\uf75b黀飂࠾☜각쮷\udb6c哠絜練閡莤ʎⴈꓞ뉬폴忒矒\ue12a\ue13d躊ؐ⿸뙗녍텆庞䞾\ue009", Color.argb(0, 0, 0, 0) + 1, objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance("\ud8c0鳰傴ᑾ젣跡䆯ՙ爛뻯犘㙃\uea38긿揱➷魿弤ᓠ좬豘䀑\u05ee曆뵅焔㔯\ueae3꺈扮☦鯾徜ፗ휛賗䂰э\uf80f밮燮㖤", 17467 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
        View$OnTouchListenerC9242ai view$OnTouchListenerC9242ai = new View$OnTouchListenerC9242ai(context, interfaceC9513jq, intern, intern2, intern3, ((String) objArr4[0]).intern());
        restrictedParameters = (SchemeConfiguration + 83) % 128;
        return view$OnTouchListenerC9242ai;
    }

    public void get() {
        SchemeConfiguration = (restrictedParameters + 79) % 128;
        ThreeDS2Service(true);
        restrictedParameters = (SchemeConfiguration + 79) % 128;
    }

    private void get(boolean z) {
        Drawable drawable;
        this.mastercardSchemeConfiguration = z;
        if (z) {
            int i = (restrictedParameters + 55) % 128;
            SchemeConfiguration = i;
            drawable = this.getParamValue;
            restrictedParameters = (i + 49) % 128;
        } else {
            drawable = this.ConfigurationBuilder;
            SchemeConfiguration = (restrictedParameters + 71) % 128;
        }
        this.apiKey.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        this.apiKey.setCompoundDrawablePadding(C9375et.ThreeDS2ServiceInstance);
        ThreeDS2Service(this.mastercardSchemeConfiguration);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void valueOf(InterfaceC9370eo interfaceC9370eo) {
        int i = SchemeConfiguration + 7;
        restrictedParameters = i % 128;
        if (i % 2 == 0) {
            interfaceC9370eo.values(this.onError, this.addParam);
            interfaceC9370eo.values(this.onCompleted, this.mastercardSchemeConfiguration);
            interfaceC9370eo.values(this.ThreeDS2Service$InitializationCallback, this.configureScheme);
            return;
        }
        interfaceC9370eo.values(this.onError, this.addParam);
        interfaceC9370eo.values(this.onCompleted, this.mastercardSchemeConfiguration);
        interfaceC9370eo.values(this.ThreeDS2Service$InitializationCallback, this.configureScheme);
        throw null;
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.View$OnTouchListenerC9242ai.get     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.View$OnTouchListenerC9242ai.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.save
    public void values(InterfaceC9373er interfaceC9373er) {
        values();
        boolean booleanValue = interfaceC9373er.get(this.onError, false).booleanValue();
        boolean booleanValue2 = interfaceC9373er.get(this.onCompleted, false).booleanValue();
        this.configureScheme = interfaceC9373er.get(this.ThreeDS2Service$InitializationCallback, false).booleanValue();
        ThreeDS2Service(booleanValue);
        if (!(!this.configureScheme)) {
            int i = SchemeConfiguration + 69;
            restrictedParameters = i % 128;
            int i2 = i % 2;
            get(booleanValue2);
            if (i2 != 0) {
                int i3 = 69 / 0;
            }
        }
        SchemeConfiguration = (restrictedParameters + 73) % 128;
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "DiscouragedApi"})
    private Drawable values(Context context, String str) {
        int identifier;
        int i = restrictedParameters + 75;
        SchemeConfiguration = i % 128;
        try {
            if (i % 2 == 0) {
                Resources resources = context.getResources();
                Object[] objArr = new Object[1];
                values("嫲\u05fb\uf44c芹媖짆河\ue623殯\uf812㷺ᓵ", 1 >> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                identifier = resources.getIdentifier(str, ((String) objArr[0]).intern(), context.getPackageName());
            } else {
                Resources resources2 = context.getResources();
                Object[] objArr2 = new Object[1];
                values("嫲\u05fb\uf44c芹媖짆河\ue623殯\uf812㷺ᓵ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr2);
                identifier = resources2.getIdentifier(str, ((String) objArr2[0]).intern(), context.getPackageName());
            }
            Drawable drawable = context.getDrawable(identifier);
            restrictedParameters = (SchemeConfiguration + 73) % 128;
            return drawable;
        } catch (Throwable th2) {
            InterfaceC9652ns interfaceC9652ns = this.cleanup;
            Object[] objArr3 = new Object[1];
            ThreeDS2ServiceInstance("\ud8f6감ㅸ虖\u0bbb邗断\ueadc縤썆䡦\uddb9ꊋ㞺볮u销ᩓ\uef09璠秊代툪ꜙⱹ녚ڴ诌ღ\ue5ce楫﹀䍘죻嶊⋉", 29917 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
            interfaceC9652ns.valueOf(String.format(((String) objArr3[0]).intern(), str, th2.getMessage()));
            return null;
        }
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
            long r1 = com.netcetera.threeds.sdk.infrastructure.View$OnTouchListenerC9242ai.values     // Catch: java.lang.Throwable -> L3a
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.View$OnTouchListenerC9242ai.values     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.View$OnTouchListenerC9242ai.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
