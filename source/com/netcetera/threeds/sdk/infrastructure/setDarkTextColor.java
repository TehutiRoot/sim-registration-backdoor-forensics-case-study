package com.netcetera.threeds.sdk.infrastructure;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.ExpandableListView;
import com.google.api.ClientProto;
import com.netcetera.threeds.sdk.infrastructure.UiCustomization;
import com.netcetera.threeds.sdk.infrastructure.setFastScrollEnabled;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setDarkTextColor {
    private static int addParam = 0;
    private static int apiKey = 1;
    public static long get;
    public static char[] values;
    private final WindowManager ConfigParameters;
    private final setBackgroundDrawable ConfigurationBuilder;
    private final setScrollingCacheEnabled ThreeDS2Service;
    private final BluetoothManager ThreeDS2Service$InitializationCallback;
    private final Context ThreeDS2ServiceInstance;
    private final TelecomManager cleanup;
    private final AudioManager createTransaction;
    private final setBackground getParamValue;
    private final WifiManager getSDKInfo;
    private final LocationManager getSDKVersion;
    private final TelephonyManager getWarnings;
    private final PackageManager initialize;
    private final setSmoothScrollbarEnabled onCompleted;
    private final setDrawingCacheBackgroundColor onError;
    private final setBackgroundTintMode removeParam;
    private final SimpleDateFormat valueOf;

    /* loaded from: classes5.dex */
    public interface ThreeDS2Service<T> {
        getHeadingTextColor values(T t);
    }

    /* loaded from: classes5.dex */
    public interface valueOf {
        getHeadingTextColor values();
    }

    static {
        char[] cArr = new char[1252];
        ByteBuffer.wrap("\u0000l¢\u008eE¡èÂ\u008bð.\fÑ)tI\u0000w¢\u0088E¤èÊ\u0000c¢\u008eE¬èÍ\u008bá.\u0006Ñ2tN\u0017~¹\u0080\\¾ÿÒ\u0000p¢\u0089E\u00adèÍ\u008bá\u0010V²¦U\u008cøä\u009bÅ>(Á\t\u0000w¢\u0088E¬èÇ\u008bë.\u0012\u0000b¢\u008dE·èÆ\u008bð.\nÑ)tS\u0017`ËÎi;\u008e\t#e@D\u0000y¢\u0098E»èÚ\u008bÉ.(Ñ\"tC\u0017@¹¡\\§ÿÆ¢ÿE\u001e\u00001±tÄ\u001efî\u0081Í,°O\u0082êE\u0015K°9Ó\u001a}æ\u0098Ü;ºf\u0094\u0081M,CO9ê\u0001\u0014é·ÈÒ¾Åog\u0098\u0080½-ÊNêë\u001c\u0014\u0005±]Òf|\u0085\u0099\u0089:Úgÿ\u0080\u0015-7\u0000r¢\u0095E¶èü\u008bç.\u0004Ñ*tK\u0017a¹\u0087\\\u00adÿô¢áE\u0002è*\u008bJ\u0000v¢\u0088E èÑ\u008bå.\u0011Ñ#tx\u0017\u007f¹\u0081\\¯ÿÅ¢ÓE\u001fè'\u008bA.wÐ\u0098s¼\u0016Ô\u0000v¢\u0088E èÑ\u008bå.\u0011Ñ#tx\u0017g¹\u0087%;\u0087Ü`éÍ\u009f®\u0095\u000bYôgQ\u001d2'\u009cÓyíÚ\u008a\u0087¬Tèö\u0014\u00113¼ZßGzÈ\u0085è äC¦íA\u0000s¢\u0089E\u00adèÔ\u008bÛ.\u0015Ñ'tT\u0017{¹\u009e\\¥ÿÙ¢èû~Y\u008b¾©\u0013ÓpÄÕ\b*<\u008fHì{B\u0097§¶\u0004Ñ\u0000a¢\u0094E¶èÌ\u008bÛ.\u0015Ñ3tI\u0017k¹\u009d\\¿ÿÊ¢øE\bü%^Ð¹ò\u0014\u0088w\u009fÒB-c\u0088\u0013ë?\u0000s¢\u008eE·èÍ\u008bà.:Ñ#tA\u0017n¹\u008c\\©ÿß¢ÿE2è+\u008bA.qÐ\u0093s¾\u0016Ö¹ðú¨XY¿k\u0012\u001dq:ÔÐ+Â\u008e\u0093íµCT¦N\u0005\u0004X>¿Û\u0012ðq\u009bÔ¾*^\u0000s¢\u0082E°èÆ\u008bá.\u000bÑ\u0019tE\u0017z¹\u0080\\\u00adÿÃ¢øE\u0003è+\u008b\\.cÐ®s¿\u0016Ü¹ð\\\u0010\u0000s¢\u0082E°èÆ\u008bá.\u000bÑ\u0019tE\u0017z¹\u0080\\\u00adÿÃ¢øE\u0003è+\u008b\\.c\u0000m¢\u0094E¶èÆ\u008bÛ.\u0016Ñ2tU\u0017m¹\u0088\\§ÿØ¢ÓE\fè(\u008bI.uÐ\u0092s¦\u0016Ö¹ð\u0000m¢\u008eE¦èÆ\u008bÛ.\u0017Ñ/tI\u0017o¹\u008c\\¸ÿô¢ÿE\u0019è<\u008bJ.qÐ\u009cs¡\u0016ì¹õ\\\u0013ÿ0¢RE{ç\u008d\u008a¿-ß\u0000h¢\u0080E²è×\u008bí.\u0006Ñ\u0019tA\u0017m¹\u008c\\®ÿÉ¢íE\u000eè%\u008bp.uÐ\u009fs³\u0016Ñ¹ø\\\u0010ÿ20ü\u0092\u0014u6ØM»A\u001e\u008cá¿DÜ'þ\u0089\u0016\u0000e¢\u008fE¦èü\u008bæ.\u0010Ñ2tS\u0017g¹\u0087\\\u0095ÿÉ¢éE\u0005è/\u008bY.yÐ\u009es \u0000d¢\u0095E¯èÅ\u008bÛ.\u0011Ñ)tI\u0017mn®Ì_+e\u0086\u000få\u0011@Û¿ã\u001a\u0083y§×|2t\u0091\u0018Ì6+Â\u0000d¢\u0080E¶èÆ\u008bÛ.\u0003Ñ)tU\u0017e¹\u0088\\¾Gëå\u0004\u0002>¯OÌyi\u0083\u0096 3ÚPéþ?\u001b'¸Kåv\u0002\u0087¯¨ÌÐiü\u0097\n4:QXþt\u001b\u0090¸¶åÊ\u0002è /Í'j[\u0097x4\u0091Q¸þÃ\u001bÝR©ðF\u0017|º\rÙ;|Á\u0083â&\u0098E«ë}\u000ee\u00ad\tð4\u0017ÅºêÙ\u0092|¾\u0082H!xD\u001aë6\u000eÒ\u00adôð\u0088\u0017ª\u0000a¢\u0082E¡èÆ\u008bè.\u0000Ñ4tH\u0017e¹\u008c\\¾ÿÎ¢þE2è<\u008b@.dÐ\u0090s¦\u0016Ú¹û\\\u001b\u0082ô \u000bÇ'jI\tX¬\u0088S öÐ\u0095ü;\u0005Þ;}C |Ç±j¬\tÚ¬òR\u001bñ=\u0094Q;uÞ\u009a}° ëÇõe\u0015\b-¯QRyñ\u0097\u0094¾;ÝÞ×}ë#\u000eÆ.ex\bi¯\u008b\u0000w¢\u0080E«è×\u008bÛ.\u0003Ñ)tU\u0017W¹\u008d\\¯ÿÉ¢ùE\nè)\u008bJ.b\u0000u¢\u0092E§èü\u008bã.\nÑ)t@\u0017d¹\u008c\\\u0095ÿÆ¢íE\u0004è\"\u0000u¢\u0092E èü\u008bé.\u0004Ñ5tT\u0017W¹\u009a\\¾ÿÄ¢þE\fè)\u008bJ.OÐ\u0094s¼\u0016Ò¹ö\\\u0019ÿ3¢Sû\u008eYi¾Y\u00137p\rÕö*È\u008f´ì\u009dB}§o\u00040Y\u0018¾þ\u0013Ùp´Õ\u009e+b\u0088Gí'B1§ü\u0004ÏY¬¾\u008e\u001cfrÞÐ87\u000e\u009awùv\\§£\u0085\u0006ÕeÒË,.\u000e\u008djÐD7\u009f\u009a\u0093ùî\\È¢;\u0001\u0018d{Ë].\u0087\u008d\u0092Ðô\u0000n¢\u0084E¶èÔ\u008bë.\u0017Ñ-tx\u0017x¹\u009b\\¯ÿÍ¢éE\u001fè+\u008bA.sÐ\u0094\u0000h¢\u0095E¶èÓ\u008bÛ.\u0015Ñ4tH\u0017p¹\u0090\u0000d¢\u0084E´èÆ\u008bè.\nÑ6tJ\u0017m¹\u0087\\¾ÿô¢ÿE\bè:\u008b[.yÐ\u009fsµ\u0016À¹Ë\\\u0010ÿ8¢VEzç\u0095\u008a¿-ß\u0000a¢\u0094E¶èÌ\u008bÛ.\u0011Ñ/tJ\u0017m¹¶\\°ÿÄ¢âE\b\bÊª?M\u001dàg\u0083p&ºÙ\u0084|á\u001fÆ²\u001d\u0010ó÷×Z²9\u0099\u009cmcUÆ)¥+\u000bñîÃM¥\u0010\u0091÷eZ[9<\u009c\u0002bÒÁÝ¤¬\u000b\u0089îeMO\u009b\u00159ùÞÁs¶\u0010\u0089µbJmï5\u008c\u0015\"óÇ×d¬9\u0090ÞFs[\u00108µ\u0010KìèÐ\u008d®\"\u0094ÇhdG90\u0013p±\u0099V¡ûÂ\u0098ù=\u0015Â9gS\u0004Fª\u0095O´ìÞ±øV#û-\u0098_=eÃ\u0089`¬\u0005Ñ\u0000a¢\u0085E èü\u008bá.\u000bÑ'tE\u0017d¹\u008c\\®éQK°¬\u0094\u0001ÙbÄÇ.8\u0002\u009d`þAP©µ\u008b\u0016ÑKÙ¬$\u0001\u001ebmÇ\\9º\u009a\u0084\u0000t¢\u0095E±èü\u008bà.\u0000Ñ tF\u0017}¹\u0085\\¾ÿô¢ÿE\u0014è \u008b[.x×'uÆ\u0092â?¯\\³ùS\u0006s£\u0015À.nÖ\u008bí(§u\u00ad\u0092_?i\\\u0019\u0000t¢\u0095E±èü\u008bà.\u0000Ñ tF\u0017}¹\u0085\\¾ÿô¢üE\u0004è:\u008bL.x\u0000s¢\u0098E±è\u008d\u008b÷.\u0000Ñ2tS\u0017a¹\u0087\\\u00adÿØ¢ÓE\nè\"\u008b@.rÐ\u0090s¾\u0016ì¹â\\\u0010ÿ$¢DEqç\u0096\u008a´Ê\u000eh÷\u008fÖ\"®A¦ä~\u001bR¾(Ý\u0006sà\u0096è5£h\u0082\u008fu\"lA:ä\u0004\u001aâ¹ÛÜ½ÍÝo?\u0088\u0010%sFAã½\u001c\u0098¹øÚæt5\u0091\u00142~oX\u0000i¢\u008fE²èÖ\u008bð.:Ñ+tB\u0017|¹\u0081\\¥ÿÏ¢ÓE\u001eè+\u008bC.uÐ\u0092s¦\u0016Ü¹æ\\*ÿ ¢^Ekç\u0090\u008a¸-ÒÐðs\u0014\u0016*¹F\u0096\u00924xÓT~6\u001d\u001f¸÷GÕâ\u008f\u0081\u0096/pÊMi)4\u000fÓÅ~Ô\u001d½¸\u0093FnåJ\u0080 /\u0010Áô\u0000e¢\u008fE£èÁ\u008bè.\u0000Ñ\"tx\u0017i¹\u008a\\©ÿÎ¢ÿE\u001eè'\u008bM.yÐ\u009ds»\u0016Ç¹í\\*ÿ%¢REjç\u008f\u008a³-ØÐùs\u000e\u0000d¢\u0084E´èÊ\u008bç.\u0000Ñ\u0019tW\u0017z¹\u0086\\¼ÿÂ¢ÿE\u0004è!\u008bA.uÐ\u0095gåÅ\u0005\"%\u008fCìpI\u0088¶³\u0013ùpàÞ\u0006;;\u0098_Åy\"³\u008f¢ìËIå·\u0018\u0014<qV\u0012ü°\u0018W.úZ\u0099C<\u008fÃ±fÞ\u0005ý«\u0018N<íT\u0000a¢\u008fE¦èÑ\u008bë.\fÑ\"tx\u0017a¹\u008dÈãj\u000f\u008d, NCqæ\u0082\u0019 ¼úßíq\u000e\u0094'7Eja\u008d\u008c \u00adCÙæû\u0018\u001c»>Þnqy\u0094\u00857½jÒ\u008dó/\u0015B+\u0000s¢\u0091E§èÂ\u008bï.:Ñ6tF\u0017{¹\u009a\\½ÿÄ¢þE\t\u0000a¢\u0082E¡èÆ\u008b÷.\u0016Ñ/tE\u0017a¹\u0085\\£ÿß¢õE2è+\u008bA.qÐ\u0093s¾\u0016Ö¹ð\u0000a¢\u0082E¡èÆ\u008b÷.\u0016Ñ/tE\u0017a¹\u0085\\£ÿß¢õE2è*\u008bF.cÐ\u0081s¾\u0016Ò¹í\\*ÿ?¢YEnç\u009c\u008a¨-ÈÐõs\u0012\u00160¹`\\Eÿo¡\u0083D¡çÈ\u008aà-\u0002\u001ek¼\u0085[¬öÛ\u0095á0\u0006Ï(j\u0003\tj§\u0082B²áÅ¼ñ[\u0006ö6\u0095@04Î\u008cm±\bß§÷BQá.¼I[f¯\u0016\rüêÎG¬$\u0093\u0081o~UÛ ¸\u0004\u0016èóÂP¶\r\u008b\u0000p¢\u0080E±èÐ\u008bí.\u0013Ñ#\u0000%\u0000x\u0000_\u0000-\u0000A¢\u008fE¦èÑ\u008bë.\fÑ\"ìKN»©\u0081".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1252);
        values = cArr;
        get = -3735521141404949791L;
    }

    public setDarkTextColor(Context context, setScrollingCacheEnabled setscrollingcacheenabled, SimpleDateFormat simpleDateFormat, PackageManager packageManager, LocationManager locationManager, WifiManager wifiManager, TelephonyManager telephonyManager, TelecomManager telecomManager, WindowManager windowManager, BluetoothManager bluetoothManager, AudioManager audioManager, setSmoothScrollbarEnabled setsmoothscrollbarenabled, setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor, setBackgroundDrawable setbackgrounddrawable, setBackground setbackground, setBackgroundTintMode setbackgroundtintmode) {
        this.ThreeDS2ServiceInstance = context;
        this.ThreeDS2Service = setscrollingcacheenabled;
        this.valueOf = simpleDateFormat;
        this.initialize = packageManager;
        this.getSDKVersion = locationManager;
        this.getSDKInfo = wifiManager;
        this.getWarnings = telephonyManager;
        this.cleanup = telecomManager;
        this.ConfigParameters = windowManager;
        this.ThreeDS2Service$InitializationCallback = bluetoothManager;
        this.createTransaction = audioManager;
        this.onCompleted = setsmoothscrollbarenabled;
        this.onError = setdrawingcachebackgroundcolor;
        this.ConfigurationBuilder = setbackgrounddrawable;
        this.getParamValue = setbackground;
        this.removeParam = setbackgroundtintmode;
    }

    public static /* synthetic */ getHeadingTextColor AuthenticationRequestParameters(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 7;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setAutofillHints();
        }
        setdarktextcolor.setAutofillHints();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor CertificateInfo(setDarkTextColor setdarktextcolor) {
        int i = addParam + 87;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor clipToPadding = setdarktextcolor.setClipToPadding();
        if (i2 == 0) {
            int i3 = 29 / 0;
        }
        addParam = (apiKey + 41) % 128;
        return clipToPadding;
    }

    public static /* synthetic */ getHeadingTextColor CertificateInfo$CertificateType(setDarkTextColor setdarktextcolor) {
        int i = addParam + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setFitsSystemWindows();
        }
        setdarktextcolor.setFitsSystemWindows();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ChallengeParameters(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 33) % 128;
        getHeadingTextColor hapticFeedbackEnabled = setdarktextcolor.setHapticFeedbackEnabled();
        apiKey = (addParam + 19) % 128;
        return hapticFeedbackEnabled;
    }

    public static /* synthetic */ getHeadingTextColor ChallengeStatusReceiver(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 61;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor viewTranslationCallback = setdarktextcolor.setViewTranslationCallback();
        if (i2 != 0) {
            int i3 = 2 / 0;
        }
        apiKey = (addParam + 23) % 128;
        return viewTranslationCallback;
    }

    public static /* synthetic */ getHeadingTextColor ConfigParameters(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 5) % 128;
        getHeadingTextColor accessibilityLiveRegion = setdarktextcolor.setAccessibilityLiveRegion();
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
        return accessibilityLiveRegion;
    }

    public static /* synthetic */ getHeadingTextColor ConfigurationBuilder(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 33;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor transitionName = setdarktextcolor.setTransitionName();
        if (i2 != 0) {
            int i3 = 63 / 0;
        }
        int i4 = apiKey + 65;
        addParam = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return transitionName;
    }

    public static /* synthetic */ getHeadingTextColor InvalidInputException(setDarkTextColor setdarktextcolor) {
        int i = addParam + 51;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setIsCredential();
        }
        setdarktextcolor.setIsCredential();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor SDKAlreadyInitializedException(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 95) % 128;
        getHeadingTextColor keyboardNavigationCluster = setdarktextcolor.setKeyboardNavigationCluster();
        int i = apiKey + 49;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
        return keyboardNavigationCluster;
    }

    public static /* synthetic */ getHeadingTextColor SDKInfo(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 111) % 128;
        getHeadingTextColor translationZ = setdarktextcolor.setTranslationZ();
        int i = addParam + 89;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return translationZ;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor SDKNotInitializedException(setDarkTextColor setdarktextcolor) {
        int i = addParam + 65;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setBackgroundTintList();
            throw null;
        }
        getHeadingTextColor backgroundTintList = setdarktextcolor.setBackgroundTintList();
        int i2 = apiKey + 27;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
        return backgroundTintList;
    }

    public static /* synthetic */ getHeadingTextColor SDKRuntimeException(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 29) % 128;
        getHeadingTextColor minimumHeight = setdarktextcolor.setMinimumHeight();
        int i = addParam + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return minimumHeight;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor SchemeConfiguration(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 85) % 128;
        getHeadingTextColor left = setdarktextcolor.setLeft();
        int i = apiKey + 95;
        addParam = i % 128;
        if (i % 2 == 0) {
            return left;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor SchemeConfiguration$Builder(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 21;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor paddingRelative = setdarktextcolor.setPaddingRelative();
        if (i2 != 0) {
            int i3 = 25 / 0;
        }
        return paddingRelative;
    }

    public static /* synthetic */ getHeadingTextColor SchemeInfo(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 59;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setPivotX();
        }
        setdarktextcolor.setPivotX();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor Severity(setDarkTextColor setdarktextcolor) {
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setTextDirection();
        }
        setdarktextcolor.setTextDirection();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2Service(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 37;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setMotionEventSplittingEnabled();
        }
        setdarktextcolor.setMotionEventSplittingEnabled();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2Service$InitializationCallback(setDarkTextColor setdarktextcolor) {
        int i = addParam + 113;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setPressed();
            throw null;
        }
        getHeadingTextColor pressed = setdarktextcolor.setPressed();
        int i2 = addParam + 57;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return pressed;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2ServiceInstance(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 17;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor foregroundTintBlendMode = setdarktextcolor.setForegroundTintBlendMode();
        if (i2 != 0) {
            int i3 = 72 / 0;
        }
        int i4 = apiKey + 31;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return foregroundTintBlendMode;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor Transaction(setDarkTextColor setdarktextcolor) {
        int i = addParam + 13;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor alwaysDrawnWithCacheEnabled = setdarktextcolor.setAlwaysDrawnWithCacheEnabled();
        if (i2 == 0) {
            int i3 = 20 / 0;
        }
        int i4 = apiKey + 93;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return alwaysDrawnWithCacheEnabled;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor Transaction$BridgingMessageExtensionVersion(setDarkTextColor setdarktextcolor) {
        int i = addParam + 61;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setZ();
        }
        setdarktextcolor.setZ();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor Warning(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 67;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setDescendantFocusability();
            throw null;
        }
        getHeadingTextColor descendantFocusability = setdarktextcolor.setDescendantFocusability();
        int i2 = addParam + 121;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return descendantFocusability;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor addParam(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 19;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor id2 = setdarktextcolor.setId();
        if (i2 != 0) {
            int i3 = 31 / 0;
        }
        return id2;
    }

    public static /* synthetic */ getHeadingTextColor amexConfiguration(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 7) % 128;
        getHeadingTextColor backgroundDrawable = setdarktextcolor.setBackgroundDrawable();
        apiKey = (addParam + 55) % 128;
        return backgroundDrawable;
    }

    public static /* synthetic */ getHeadingTextColor apiKey(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 45) % 128;
        getHeadingTextColor defaultFocusHighlightEnabled = setdarktextcolor.setDefaultFocusHighlightEnabled();
        apiKey = (addParam + 111) % 128;
        return defaultFocusHighlightEnabled;
    }

    public static /* synthetic */ getHeadingTextColor build(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 53) % 128;
        getHeadingTextColor enabled = setdarktextcolor.setEnabled();
        int i = apiKey + 105;
        addParam = i % 128;
        if (i % 2 == 0) {
            return enabled;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor cancelled(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setAlpha();
        }
        setdarktextcolor.setAlpha();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor cbConfiguration(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 97) % 128;
        getHeadingTextColor focusedByDefault = setdarktextcolor.setFocusedByDefault();
        apiKey = (addParam + 37) % 128;
        return focusedByDefault;
    }

    public static /* synthetic */ getHeadingTextColor cleanup(setDarkTextColor setdarktextcolor) {
        int i = addParam + 121;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor transitionVisibility = setdarktextcolor.setTransitionVisibility();
        if (i2 == 0) {
            int i3 = 6 / 0;
        }
        addParam = (apiKey + 73) % 128;
        return transitionVisibility;
    }

    public static /* synthetic */ getHeadingTextColor close(setDarkTextColor setdarktextcolor) {
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setY();
            throw null;
        }
        getHeadingTextColor y = setdarktextcolor.setY();
        int i2 = apiKey + 29;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return y;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor completed(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 31) % 128;
        getHeadingTextColor hasTransientState = setdarktextcolor.setHasTransientState();
        addParam = (apiKey + 67) % 128;
        return hasTransientState;
    }

    public static /* synthetic */ getHeadingTextColor configureScheme(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 121) % 128;
        getHeadingTextColor rotation = setdarktextcolor.setRotation();
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
        return rotation;
    }

    public static /* synthetic */ getHeadingTextColor createTransaction(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setForegroundTintMode();
        }
        setdarktextcolor.setForegroundTintMode();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor dinersSchemeConfiguration(setDarkTextColor setdarktextcolor) {
        int i = addParam + 55;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setSelected();
            throw null;
        }
        getHeadingTextColor selected = setdarktextcolor.setSelected();
        int i2 = apiKey + 95;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return selected;
    }

    public static /* synthetic */ getHeadingTextColor doChallenge(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 9) % 128;
        getHeadingTextColor addStatesFromChildren = setdarktextcolor.setAddStatesFromChildren();
        apiKey = (addParam + 83) % 128;
        return addStatesFromChildren;
    }

    public static /* synthetic */ getHeadingTextColor eftposConfiguration(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 73) % 128;
        getHeadingTextColor soundEffectsEnabled = setdarktextcolor.setSoundEffectsEnabled();
        int i = apiKey + 95;
        addParam = i % 128;
        if (i % 2 == 0) {
            return soundEffectsEnabled;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor encryptionPublicKey(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 125) % 128;
        getHeadingTextColor textAlignment = setdarktextcolor.setTextAlignment();
        int i = apiKey + 97;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
        return textAlignment;
    }

    public static /* synthetic */ getHeadingTextColor encryptionPublicKeyFromAssetCertificate(setDarkTextColor setdarktextcolor) {
        int i = addParam + 3;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setVisibility();
            throw null;
        }
        getHeadingTextColor visibility = setdarktextcolor.setVisibility();
        int i2 = apiKey + 19;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return visibility;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor get(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 93) % 128;
        getHeadingTextColor systemUiVisibility = setdarktextcolor.setSystemUiVisibility();
        addParam = (apiKey + 49) % 128;
        return systemUiVisibility;
    }

    public static /* synthetic */ getHeadingTextColor get3DSServerTransactionID(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 43) % 128;
        getHeadingTextColor foregroundTintList = setdarktextcolor.setForegroundTintList();
        addParam = (apiKey + 67) % 128;
        return foregroundTintList;
    }

    public static /* synthetic */ getHeadingTextColor getAcsRefNumber(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 75) % 128;
        getHeadingTextColor saveFromParentEnabled = setdarktextcolor.setSaveFromParentEnabled();
        apiKey = (addParam + 5) % 128;
        return saveFromParentEnabled;
    }

    public static /* synthetic */ getHeadingTextColor getAcsSignedContent(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 67;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor focusable = setdarktextcolor.setFocusable();
        if (i2 != 0) {
            int i3 = 8 / 0;
        }
        return focusable;
    }

    public static /* synthetic */ getHeadingTextColor getAcsTransactionID(setDarkTextColor setdarktextcolor) {
        int i = addParam + 79;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor scrollBarDefaultDelayBeforeFade = setdarktextcolor.setScrollBarDefaultDelayBeforeFade();
        if (i2 == 0) {
            int i3 = 49 / 0;
        }
        addParam = (apiKey + 27) % 128;
        return scrollBarDefaultDelayBeforeFade;
    }

    public static /* synthetic */ getHeadingTextColor getAuthenticationRequestParameters(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 49;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setAnimation();
            throw null;
        }
        getHeadingTextColor animation = setdarktextcolor.setAnimation();
        int i2 = addParam + 45;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return animation;
    }

    public static /* synthetic */ getHeadingTextColor getCertPrefix(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 15) % 128;
        getHeadingTextColor scrollX = setdarktextcolor.setScrollX();
        int i = apiKey + 113;
        addParam = i % 128;
        if (i % 2 == 0) {
            return scrollX;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getDeviceData(setDarkTextColor setdarktextcolor) {
        int i = addParam + 105;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setWillNotDraw();
        }
        setdarktextcolor.setWillNotDraw();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getEncryptionCertificate(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 65) % 128;
        getHeadingTextColor activated = setdarktextcolor.setActivated();
        int i = addParam + 29;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
        return activated;
    }

    public static /* synthetic */ getHeadingTextColor getEncryptionCertificateKid(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 59;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor animationCacheEnabled = setdarktextcolor.setAnimationCacheEnabled();
        if (i2 != 0) {
            int i3 = 64 / 0;
        }
        return animationCacheEnabled;
    }

    public static /* synthetic */ getHeadingTextColor getErrorCode(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 49) % 128;
        getHeadingTextColor nestedScrollingEnabled = setdarktextcolor.setNestedScrollingEnabled();
        int i = apiKey + 49;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
        return nestedScrollingEnabled;
    }

    public static /* synthetic */ getHeadingTextColor getExpiryDate(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 103;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setSaveEnabled();
        }
        setdarktextcolor.setSaveEnabled();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getId(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 113;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor handwritingBoundsOffsets = setdarktextcolor.setHandwritingBoundsOffsets();
        if (i2 != 0) {
            int i3 = 26 / 0;
        }
        int i4 = apiKey + 87;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return handwritingBoundsOffsets;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getIds(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 95) % 128;
        getHeadingTextColor background = setdarktextcolor.setBackground();
        apiKey = (addParam + 109) % 128;
        return background;
    }

    public static /* synthetic */ getHeadingTextColor getLicenseExpiryDate(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 7) % 128;
        getHeadingTextColor initialScale = setdarktextcolor.setInitialScale();
        apiKey = (addParam + 49) % 128;
        return initialScale;
    }

    public static /* synthetic */ getHeadingTextColor getMessage(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 121) % 128;
        getHeadingTextColor translationX = setdarktextcolor.setTranslationX();
        apiKey = (addParam + 69) % 128;
        return translationX;
    }

    public static /* synthetic */ getHeadingTextColor getMessageVersion(setDarkTextColor setdarktextcolor) {
        int i = addParam + 17;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setScaleY();
            throw null;
        }
        getHeadingTextColor scaleY = setdarktextcolor.setScaleY();
        int i2 = apiKey + 39;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return scaleY;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getName(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 65;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setLayoutDirection();
        }
        setdarktextcolor.setLayoutDirection();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getParamValue(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setTranslationY();
            throw null;
        }
        getHeadingTextColor translationY = setdarktextcolor.setTranslationY();
        int i2 = addParam + 105;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return translationY;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getProgressView(setDarkTextColor setdarktextcolor) {
        int i = addParam + 7;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setForegroundGravity();
        }
        setdarktextcolor.setForegroundGravity();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getRootCertificates(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 47) % 128;
        getHeadingTextColor pivotY = setdarktextcolor.setPivotY();
        int i = addParam + 77;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return pivotY;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSDKAppID(setDarkTextColor setdarktextcolor) {
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setForceDarkAllowed();
            throw null;
        }
        getHeadingTextColor forceDarkAllowed = setdarktextcolor.setForceDarkAllowed();
        apiKey = (addParam + 63) % 128;
        return forceDarkAllowed;
    }

    public static /* synthetic */ getHeadingTextColor getSDKEphemeralPublicKey(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 99;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor rotationY = setdarktextcolor.setRotationY();
        if (i2 != 0) {
            int i3 = 34 / 0;
        }
        int i4 = addParam + 9;
        apiKey = i4 % 128;
        if (i4 % 2 != 0) {
            return rotationY;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSDKInfo(setDarkTextColor setdarktextcolor) {
        int i = addParam + 59;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setOnCapturedPointerListener();
            throw null;
        }
        getHeadingTextColor onCapturedPointerListener = setdarktextcolor.setOnCapturedPointerListener();
        addParam = (apiKey + 111) % 128;
        return onCapturedPointerListener;
    }

    public static /* synthetic */ getHeadingTextColor getSDKReferenceNumber(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setRight();
            throw null;
        }
        getHeadingTextColor right = setdarktextcolor.setRight();
        addParam = (apiKey + 59) % 128;
        return right;
    }

    public static /* synthetic */ getHeadingTextColor getSDKTransactionID(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 91) % 128;
        getHeadingTextColor backgroundTintMode = setdarktextcolor.setBackgroundTintMode();
        apiKey = (addParam + 67) % 128;
        return backgroundTintMode;
    }

    public static /* synthetic */ getHeadingTextColor getSDKVersion(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 77;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor bottom = setdarktextcolor.setBottom();
        if (i2 != 0) {
            int i3 = 3 / 0;
        }
        return bottom;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeConfigurations(setDarkTextColor setdarktextcolor) {
        int i = addParam + 3;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setClipChildren();
            throw null;
        }
        getHeadingTextColor clipChildren = setdarktextcolor.setClipChildren();
        apiKey = (addParam + 51) % 128;
        return clipChildren;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeEncryptionPublicKey(setDarkTextColor setdarktextcolor) {
        int i = addParam + 91;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.setForeground();
        }
        setdarktextcolor.setForeground();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeEncryptionPublicKeyId(setDarkTextColor setdarktextcolor) {
        int i = addParam + 39;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor allowClickWhenDisabled = setdarktextcolor.setAllowClickWhenDisabled();
        if (i2 == 0) {
            int i3 = 57 / 0;
        }
        return allowClickWhenDisabled;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeId(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 105) % 128;
        getHeadingTextColor touchDelegate = setdarktextcolor.setTouchDelegate();
        int i = addParam + 119;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return touchDelegate;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeLogo(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 113;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setDrawingCacheEnabled();
            throw null;
        }
        getHeadingTextColor drawingCacheEnabled = setdarktextcolor.setDrawingCacheEnabled();
        int i2 = addParam + 57;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return drawingCacheEnabled;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeLogoDark(setDarkTextColor setdarktextcolor) {
        int i = addParam + 83;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor onHierarchyChangeListener = setdarktextcolor.setOnHierarchyChangeListener();
        if (i2 == 0) {
            int i3 = 28 / 0;
        }
        int i4 = apiKey + 3;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return onHierarchyChangeListener;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeName(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 7;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor rotationX = setdarktextcolor.setRotationX();
        if (i2 != 0) {
            int i3 = 97 / 0;
        }
        return rotationX;
    }

    public static /* synthetic */ getHeadingTextColor getSchemePublicRootKeys(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 95) % 128;
        getHeadingTextColor transitionGroup = setdarktextcolor.setTransitionGroup();
        int i = apiKey + 101;
        addParam = i % 128;
        if (i % 2 == 0) {
            return transitionGroup;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getSeverity(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 95) % 128;
        getHeadingTextColor accessibilityHeading = setdarktextcolor.setAccessibilityHeading();
        int i = apiKey + 29;
        addParam = i % 128;
        if (i % 2 == 0) {
            return accessibilityHeading;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getThreeDSRequestorAppURL(setDarkTextColor setdarktextcolor) {
        int i = addParam + 27;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor overScrollMode = setdarktextcolor.setOverScrollMode();
        if (i2 == 0) {
            int i3 = 42 / 0;
        }
        apiKey = (addParam + 5) % 128;
        return overScrollMode;
    }

    public static /* synthetic */ getHeadingTextColor getType(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 53) % 128;
        getHeadingTextColor screenReaderFocusable = setdarktextcolor.setScreenReaderFocusable();
        int i = addParam + 89;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return screenReaderFocusable;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getValue(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 117) % 128;
        getHeadingTextColor autoHandwritingEnabled = setdarktextcolor.setAutoHandwritingEnabled();
        addParam = (apiKey + 73) % 128;
        return autoHandwritingEnabled;
    }

    public static /* synthetic */ getHeadingTextColor getWarnings(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 29) % 128;
        getHeadingTextColor scaleX = setdarktextcolor.setScaleX();
        int i = apiKey + 57;
        addParam = i % 128;
        if (i % 2 == 0) {
            return scaleX;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ids(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 41) % 128;
        getHeadingTextColor top = setdarktextcolor.setTop();
        addParam = (apiKey + 91) % 128;
        return top;
    }

    public static /* synthetic */ getHeadingTextColor initialize(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 21) % 128;
        getHeadingTextColor focusableInTouchMode = setdarktextcolor.setFocusableInTouchMode();
        int i = apiKey + 75;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
        return focusableInTouchMode;
    }

    public static /* synthetic */ getHeadingTextColor jcbConfiguration(setDarkTextColor setdarktextcolor) {
        int i = addParam + 73;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setOnSystemUiVisibilityChangeListener();
            throw null;
        }
        getHeadingTextColor onSystemUiVisibilityChangeListener = setdarktextcolor.setOnSystemUiVisibilityChangeListener();
        int i2 = addParam + 59;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return onSystemUiVisibilityChangeListener;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor logo(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 75;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor x = setdarktextcolor.setX();
        if (i2 != 0) {
            int i3 = 77 / 0;
        }
        int i4 = addParam + CameraActivity.REQUEST_CODE;
        apiKey = i4 % 128;
        if (i4 % 2 != 0) {
            return x;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor logoDark(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 43;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setScrollCaptureCallback();
            throw null;
        }
        getHeadingTextColor scrollCaptureCallback = setdarktextcolor.setScrollCaptureCallback();
        int i2 = apiKey + 77;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return scrollCaptureCallback;
    }

    public static /* synthetic */ getHeadingTextColor mastercardSchemeConfiguration(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 23) % 128;
        getHeadingTextColor willNotCacheDrawing = setdarktextcolor.setWillNotCacheDrawing();
        addParam = (apiKey + 79) % 128;
        return willNotCacheDrawing;
    }

    public static /* synthetic */ getHeadingTextColor newSchemeConfiguration(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 97;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setHovered();
            throw null;
        }
        getHeadingTextColor hovered = setdarktextcolor.setHovered();
        int i2 = apiKey + 13;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
        return hovered;
    }

    public static /* synthetic */ getHeadingTextColor onCompleted(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 49;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setLayoutAnimationListener();
            throw null;
        }
        getHeadingTextColor layoutAnimationListener = setdarktextcolor.setLayoutAnimationListener();
        int i2 = addParam + 115;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return layoutAnimationListener;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor onError(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 29;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor tooltipText = setdarktextcolor.setTooltipText();
        if (i2 != 0) {
            int i3 = 89 / 0;
        }
        return tooltipText;
    }

    public static /* synthetic */ getHeadingTextColor removeParam(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 69;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.setTag();
        }
        setdarktextcolor.setTag();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor restrictedParameters(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 29) % 128;
        getHeadingTextColor touchscreenBlocksFocus = setdarktextcolor.setTouchscreenBlocksFocus();
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 == 0) {
            return touchscreenBlocksFocus;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor rootPublicKey(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 69) % 128;
        getHeadingTextColor layoutMode = setdarktextcolor.setLayoutMode();
        int i = addParam + 81;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return layoutMode;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor rootPublicKeyFromAssetCertificate(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 57) % 128;
        getHeadingTextColor clickable = setdarktextcolor.setClickable();
        int i = addParam + 77;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 10 / 0;
        }
        return clickable;
    }

    public static /* synthetic */ getHeadingTextColor runtimeError(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 17;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor elevation = setdarktextcolor.setElevation();
        if (i2 != 0) {
            int i3 = 94 / 0;
        }
        int i4 = apiKey + 85;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return elevation;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor set3DSServerTransactionID(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 45) % 128;
        getHeadingTextColor scrollY = setdarktextcolor.setScrollY();
        int i = apiKey + 35;
        addParam = i % 128;
        if (i % 2 == 0) {
            return scrollY;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setAccessibilityDataSensitive() {
        getHeadingTextColor ThreeDS2Service2;
        int i = apiKey + 25;
        addParam = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Settings.System.DEFAULT_RINGTONE_URI.getPath());
            int i2 = 24 / 0;
        } else {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Settings.System.DEFAULT_RINGTONE_URI.getPath());
        }
        apiKey = (addParam + 53) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor setAccessibilityDelegate() {
        int i = apiKey + 53;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setClipBounds();
        }
        setClipBounds();
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setAccessibilityHeading() {
        List<ApplicationInfo> installedApplications;
        PackageManager.ApplicationInfoFlags of;
        int i = apiKey + 63;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 114) {
            installedApplications = this.initialize.getInstalledApplications(128);
        } else {
            PackageManager packageManager = this.initialize;
            of = PackageManager.ApplicationInfoFlags.of(128L);
            installedApplications = packageManager.getInstalledApplications(of);
        }
        ArrayList arrayList = new ArrayList();
        for (ApplicationInfo applicationInfo : installedApplications) {
            if ((applicationInfo.flags & 1) == 0) {
                int i2 = apiKey + 53;
                addParam = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(applicationInfo.packageName);
                } else {
                    arrayList.add(applicationInfo.packageName);
                    throw null;
                }
            }
        }
        return getHeadingTextColor.ThreeDS2Service(arrayList);
    }

    private /* synthetic */ getHeadingTextColor setAccessibilityLiveRegion() {
        addParam = (apiKey + 9) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (21659 - Process.getGidForName("")), 167 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10, objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = addParam + 79;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setAccessibilityPaneTitle() {
        addParam = (apiKey + CameraActivity.REQUEST_CODE) % 128;
        getHeadingTextColor backgroundResource = setBackgroundResource();
        int i = addParam + 55;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 66 / 0;
        }
        return backgroundResource;
    }

    public static /* synthetic */ getHeadingTextColor setAccessibilityTraversalAfter() {
        apiKey = (addParam + 81) % 128;
        getHeadingTextColor outlineProvider = setOutlineProvider();
        apiKey = (addParam + 5) % 128;
        return outlineProvider;
    }

    public static /* synthetic */ getHeadingTextColor setAccessibilityTraversalBefore() {
        addParam = (apiKey + 117) % 128;
        getHeadingTextColor verticalScrollbarOverlay = setVerticalScrollbarOverlay();
        int i = addParam + 9;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return verticalScrollbarOverlay;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setAcsRefNumber(setDarkTextColor setdarktextcolor) {
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setMinimumWidth();
            throw null;
        }
        getHeadingTextColor minimumWidth = setdarktextcolor.setMinimumWidth();
        addParam = (apiKey + 33) % 128;
        return minimumWidth;
    }

    public static /* synthetic */ getHeadingTextColor setAcsSignedContent(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 1;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor persistentDrawingCache = setdarktextcolor.setPersistentDrawingCache();
        if (i2 != 0) {
            int i3 = 58 / 0;
        }
        return persistentDrawingCache;
    }

    public static /* synthetic */ getHeadingTextColor setAcsTransactionID(setDarkTextColor setdarktextcolor) {
        int i = addParam + 105;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setImportantForAccessibility();
            throw null;
        }
        getHeadingTextColor importantForAccessibility = setdarktextcolor.setImportantForAccessibility();
        int i2 = addParam + 79;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return importantForAccessibility;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setActivated() {
        boolean isTtySupported;
        boolean isTtyModeSupported;
        boolean isTtyModeSupported2;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            int i2 = addParam + 11;
            apiKey = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 63 / 0;
                return getHeadingTextColor.valueOf();
            }
            return getHeadingTextColor.valueOf();
        } else if (i >= 28) {
            isTtySupported = this.cleanup.isTtySupported();
            return getHeadingTextColor.get(isTtySupported);
        } else {
            int i4 = apiKey + 1;
            addParam = i4 % 128;
            if (i4 % 2 == 0) {
                isTtyModeSupported2 = this.getWarnings.isTtyModeSupported();
                return getHeadingTextColor.get(isTtyModeSupported2);
            }
            isTtyModeSupported = this.getWarnings.isTtyModeSupported();
            getHeadingTextColor.get(isTtyModeSupported);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam + 29;
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        if ((r0 % 2) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if ((!r1.ThreeDS2Service(r4)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r6.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values, com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings) != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r6.ThreeDS2Service$InitializationCallback.getAdapter().getName());
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = (com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam + 93) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setAddStatesFromChildren() {
        /*
            r6 = this;
            r0 = 0
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 1
            if (r1 != 0) goto L22
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values
            r4[r0] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings
            r4[r0] = r5
            boolean r0 = r1.ThreeDS2Service(r4)
            r0 = r0 ^ r3
            if (r0 == 0) goto L4b
            goto L34
        L22:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values
            r4[r0] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r0 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings
            r4[r3] = r0
            boolean r0 = r1.ThreeDS2Service(r4)
            if (r0 == r3) goto L4b
        L34:
            android.bluetooth.BluetoothManager r0 = r6.ThreeDS2Service$InitializationCallback
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            java.lang.String r0 = r0.getName()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 93
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r1
            return r0
        L4b:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r0 = r0 + 29
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r1
            int r0 = r0 % r2
            if (r0 == 0) goto L5b
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            return r0
        L5b:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setAddStatesFromChildren():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private /* synthetic */ getHeadingTextColor setAllowClickWhenDisabled() {
        int i = apiKey + 15;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 73) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            return getHeadingTextColor.valueOf(displayMetrics.xdpi);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        int i2 = apiKey + 77;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setAllowedHandwritingDelegatePackage() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            addParam = (apiKey + 13) % 128;
            str = Build.SOC_MANUFACTURER;
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(str);
            int i = addParam + 111;
            apiKey = i % 128;
            if (i % 2 != 0) {
                return ThreeDS2Service2;
            }
            throw null;
        }
        return getHeadingTextColor.valueOf();
    }

    private List<InetAddress> setAllowedHandwritingDelegatorPackage() {
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 == 0) {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                LinkedList linkedList = new LinkedList();
                Iterator it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    addParam = (apiKey + 99) % 128;
                    Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
                    if (inetAddresses != null) {
                        linkedList.addAll(Collections.list(inetAddresses));
                    }
                }
                apiKey = (addParam + 81) % 128;
                return linkedList;
            }
            return Collections.emptyList();
        }
        NetworkInterface.getNetworkInterfaces();
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setAlpha() {
        addParam = (apiKey + 27) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (59686 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 819 - Color.alpha(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 19, objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 65 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setAlwaysDrawnWithCacheEnabled() {
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.valueOf.format(new Date()));
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setAnimation() {
        boolean isHearingAidCompatibilitySupported;
        int i = apiKey + 29;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 23 : Build.VERSION.SDK_INT >= 76) {
            isHearingAidCompatibilitySupported = this.getWarnings.isHearingAidCompatibilitySupported();
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(isHearingAidCompatibilitySupported);
            addParam = (apiKey + 107) % 128;
            return getheadingtextcolor;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setAnimationCacheEnabled() {
        addParam = (apiKey + 103) % 128;
        if (!this.onCompleted.ThreeDS2Service(setFastScrollStyle.get, setFastScrollStyle.ThreeDS2ServiceInstance)) {
            Object[] objArr = new Object[1];
            values((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1231 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") + 7, objArr);
            Location lastKnownLocation = this.getSDKVersion.getLastKnownLocation(((String) objArr[0]).intern());
            if (lastKnownLocation != null) {
                getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf(lastKnownLocation.getLongitude());
                addParam = (apiKey + 125) % 128;
                return valueOf2;
            }
            return getHeadingTextColor.ThreeDS2Service();
        }
        apiKey = (addParam + 91) % 128;
        return getHeadingTextColor.ThreeDS2ServiceInstance();
    }

    private static /* synthetic */ getHeadingTextColor setAnimationMatrix() {
        int i = apiKey + 57;
        addParam = i % 128;
        if (i % 2 == 0) {
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(Build.VERSION.SDK_INT);
            apiKey = (addParam + 121) % 128;
            return getheadingtextcolor;
        }
        getHeadingTextColor.get(Build.VERSION.SDK_INT);
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setAutoHandwritingEnabled() {
        apiKey = (addParam + 39) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getMmsUserAgent());
        int i = apiKey + 87;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setAutofillHints() {
        int simSpecificCarrierId;
        int i = addParam + 107;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 96) {
            simSpecificCarrierId = this.getWarnings.getSimSpecificCarrierId();
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(simSpecificCarrierId);
            int i2 = apiKey + 19;
            addParam = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
            return getheadingtextcolor;
        }
        return getHeadingTextColor.valueOf();
    }

    public static /* synthetic */ getHeadingTextColor setAutofillId() {
        apiKey = (addParam + 101) % 128;
        getHeadingTextColor handwritingDelegatorCallback = setHandwritingDelegatorCallback();
        addParam = (apiKey + 73) % 128;
        return handwritingDelegatorCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if ((r1 % 2) != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        r1 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r6.ThreeDS2Service$InitializationCallback.getAdapter().getAddress());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r1.ThreeDS2Service(r4) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r6.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values, com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
        r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam + 105;
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setBackground() {
        /*
            r6 = this;
            r0 = 1
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 0
            if (r1 == 0) goto L22
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            r4 = 3
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r4]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values
            r4[r3] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings
            r4[r3] = r5
            boolean r1 = r1.ThreeDS2Service(r4)
            if (r1 == r0) goto L34
            goto L47
        L22:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.values
            r4[r3] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getWarnings
            r4[r0] = r5
            boolean r0 = r1.ThreeDS2Service(r4)
            if (r0 == 0) goto L47
        L34:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 105
            int r4 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r4
            int r1 = r1 % r2
            if (r1 != 0) goto L46
            r1 = 95
            int r1 = r1 / r3
        L46:
            return r0
        L47:
            android.bluetooth.BluetoothManager r0 = r6.ThreeDS2Service$InitializationCallback
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            java.lang.String r0 = r0.getAddress()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setBackground():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private /* synthetic */ getHeadingTextColor setBackgroundDrawable() {
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.values, setFastScrollStyle.getWarnings)) {
            getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
            addParam = (apiKey + 25) % 128;
            return ThreeDS2ServiceInstance;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothDevice> it = this.ThreeDS2Service$InitializationCallback.getAdapter().getBondedDevices().iterator();
        while (it.hasNext()) {
            int i = addParam + 111;
            apiKey = i % 128;
            if (i % 2 != 0) {
                arrayList.add(it.next().getAddress());
            } else {
                arrayList.add(it.next().getAddress());
                throw null;
            }
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(arrayList);
        int i2 = addParam + 115;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setBackgroundResource() {
        addParam = (apiKey + 55) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.BOOTLOADER);
        int i = apiKey + 113;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setBackgroundTintBlendMode() {
        apiKey = (addParam + 61) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.valueOf)) {
            getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
            int i = addParam + 69;
            apiKey = i % 128;
            if (i % 2 != 0) {
                return ThreeDS2ServiceInstance;
            }
            throw null;
        } else if (Build.VERSION.SDK_INT >= 29) {
            apiKey = (addParam + 51) % 128;
            return getHeadingTextColor.valueOf();
        } else {
            return getHeadingTextColor.get(this.getSDKInfo.isScanAlwaysAvailable());
        }
    }

    private /* synthetic */ getHeadingTextColor setBackgroundTintList() {
        apiKey = (addParam + 71) % 128;
        if (!this.onCompleted.ThreeDS2Service(setFastScrollStyle.valueOf)) {
            return getHeadingTextColor.get(this.getSDKInfo.isTdlsSupported());
        }
        addParam = (apiKey + 41) % 128;
        getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
        addParam = (apiKey + 9) % 128;
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ getHeadingTextColor setBackgroundTintMode() {
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.valueOf)) {
            int i = apiKey + CameraActivity.REQUEST_CODE;
            addParam = i % 128;
            if (i % 2 == 0) {
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        }
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(this.getSDKInfo.isPreferredNetworkOffloadSupported());
        apiKey = (addParam + 35) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setBottom() {
        setBackground setbackground;
        Object obj;
        int i = addParam + 25;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setbackground = this.getParamValue;
            Object[] objArr = new Object[1];
            values((char) ((-1) << TextUtils.indexOf((CharSequence) "", '3', 1)), 24154 >>> ImageFormat.getBitsPerPixel(0), 96 << (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            setbackground = this.getParamValue;
            Object[] objArr2 = new Object[1];
            values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 870 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackground.ThreeDS2ServiceInstance(((String) obj).intern()));
        int i2 = apiKey + 73;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return getheadingtextcolor;
    }

    private static /* synthetic */ getHeadingTextColor setCameraDistance() {
        int i = apiKey + 107;
        addParam = i % 128;
        if (i % 2 == 0) {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Settings.System.DEFAULT_NOTIFICATION_URI.getPath());
            apiKey = (addParam + 77) % 128;
            return ThreeDS2Service2;
        }
        getHeadingTextColor.ThreeDS2Service(Settings.System.DEFAULT_NOTIFICATION_URI.getPath());
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setCertificate() {
        addParam = (apiKey + 7) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(C9622nk.ThreeDS2ServiceInstance(Build.MANUFACTURER, Build.MODEL));
        int i = apiKey + 55;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setClickable() {
        int i = apiKey + 77;
        addParam = i % 128;
        if (i % 2 == 0 && Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            return getHeadingTextColor.valueOf(displayMetrics.ydpi);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        int i2 = addParam + 29;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return valueOf2;
    }

    private static /* synthetic */ getHeadingTextColor setClipBounds() {
        int i = apiKey + 51;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
            return getHeadingTextColor.ThreeDS2Service(Build.DEVICE);
        }
        return getHeadingTextColor.ThreeDS2Service(Build.DEVICE);
    }

    private /* synthetic */ getHeadingTextColor setClipChildren() {
        addParam = (apiKey + 57) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            apiKey = (addParam + 93) % 128;
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        } else if (Build.VERSION.SDK_INT < 29) {
            return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSubscriberId());
        } else {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service();
            addParam = (apiKey + 95) % 128;
            return ThreeDS2Service2;
        }
    }

    private static /* synthetic */ getHeadingTextColor setClipToOutline() {
        String str;
        String str2;
        apiKey = (addParam + 37) % 128;
        if (Build.VERSION.SDK_INT >= 23) {
            int i = apiKey + 37;
            addParam = i % 128;
            if (i % 2 == 0) {
                str2 = Build.VERSION.SECURITY_PATCH;
                return getHeadingTextColor.ThreeDS2Service(str2);
            }
            str = Build.VERSION.SECURITY_PATCH;
            getHeadingTextColor.ThreeDS2Service(str);
            throw null;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setClipToPadding() {
        String imei;
        String meid;
        String imei2;
        String meid2;
        apiKey = (addParam + 121) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            int i = apiKey + 117;
            addParam = i % 128;
            if (i % 2 != 0) {
                int i2 = 0 / 0;
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 27) {
            addParam = (apiKey + 1) % 128;
            return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getDeviceId());
        } else if (i3 < 29) {
            int i4 = apiKey + 7;
            addParam = i4 % 128;
            if (i4 % 2 == 0) {
                imei2 = this.getWarnings.getImei();
                meid2 = this.getWarnings.getMeid();
                getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service((String) C9669om.ThreeDS2Service(imei2, meid2));
                addParam = (apiKey + 107) % 128;
                return ThreeDS2Service2;
            }
            imei = this.getWarnings.getImei();
            meid = this.getWarnings.getMeid();
            getHeadingTextColor.ThreeDS2Service((String) C9669om.ThreeDS2Service(imei, meid));
            throw null;
        } else {
            getHeadingTextColor ThreeDS2Service3 = getHeadingTextColor.ThreeDS2Service();
            int i5 = apiKey + 25;
            addParam = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return ThreeDS2Service3;
        }
    }

    public static /* synthetic */ getHeadingTextColor setContentCaptureSession() {
        addParam = (apiKey + 125) % 128;
        getHeadingTextColor horizontalScrollbarOverlay = setHorizontalScrollbarOverlay();
        apiKey = (addParam + 125) % 128;
        return horizontalScrollbarOverlay;
    }

    public static /* synthetic */ getHeadingTextColor setContentDescription() {
        getHeadingTextColor isHandwritingDelegate;
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 != 0) {
            isHandwritingDelegate = setIsHandwritingDelegate();
            int i2 = 94 / 0;
        } else {
            isHandwritingDelegate = setIsHandwritingDelegate();
        }
        addParam = (apiKey + 43) % 128;
        return isHandwritingDelegate;
    }

    private static /* synthetic */ getHeadingTextColor setContextClickable() {
        addParam = (apiKey + 59) % 128;
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(Environment.isExternalStorageRemovable());
        apiKey = (addParam + 113) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setDefaultFocusHighlightEnabled() {
        apiKey = (addParam + 81) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (9550 - KeyEvent.keyCodeFromString("")), AndroidCharacter.getMirror('0') + 'i', 13 - Color.green(0), objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = addParam + 95;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setDescendantFocusability() {
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
            return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkOperatorName());
        }
        return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkOperatorName());
    }

    private static /* synthetic */ getHeadingTextColor setDrawingCacheBackgroundColor() {
        apiKey = (addParam + 29) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.BRAND);
        apiKey = (addParam + 21) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setDrawingCacheEnabled() {
        apiKey = (addParam + 61) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.values, setFastScrollStyle.getWarnings)) {
            getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
            int i = apiKey + 39;
            addParam = i % 128;
            if (i % 2 != 0) {
                int i2 = 9 / 0;
            }
            return ThreeDS2ServiceInstance;
        }
        return getHeadingTextColor.get(this.ThreeDS2Service$InitializationCallback.getAdapter().isEnabled());
    }

    public static /* synthetic */ getHeadingTextColor setDrawingCacheQuality() {
        addParam = (apiKey + 93) % 128;
        getHeadingTextColor drawingCacheBackgroundColor = setDrawingCacheBackgroundColor();
        int i = apiKey + 79;
        addParam = i % 128;
        if (i % 2 == 0) {
            return drawingCacheBackgroundColor;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setDuplicateParentStateEnabled() {
        apiKey = (addParam + 109) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.HARDWARE);
        addParam = (apiKey + 105) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setElevation() {
        addParam = (apiKey + 31) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 947, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31, objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = addParam + 13;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setEnabled() {
        int subscriptionId;
        if (Build.VERSION.SDK_INT >= 30) {
            apiKey = (addParam + 25) % 128;
            subscriptionId = this.getWarnings.getSubscriptionId();
            return getHeadingTextColor.get(subscriptionId);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        apiKey = (addParam + 23) % 128;
        return valueOf2;
    }

    private static /* synthetic */ getHeadingTextColor setFilterTouchesWhenObscured() {
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
            return getHeadingTextColor.get(Locale.getAvailableLocales().length);
        }
        return getHeadingTextColor.get(Locale.getAvailableLocales().length);
    }

    private /* synthetic */ getHeadingTextColor setFitsSystemWindows() {
        int i = apiKey + 51;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 114) {
            return this.removeParam.ThreeDS2Service(setKeepScreenOn.valueOf, this.onCompleted);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        addParam = (apiKey + 11) % 128;
        return valueOf2;
    }

    private /* synthetic */ getHeadingTextColor setFocusable() {
        if (Build.VERSION.SDK_INT >= 29) {
            int i = addParam + 23;
            apiKey = i % 128;
            if (i % 2 != 0) {
                getHeadingTextColor ThreeDS2Service2 = this.removeParam.ThreeDS2Service(setNextFocusLeftId.ThreeDS2ServiceInstance, this.onCompleted);
                addParam = (apiKey + 107) % 128;
                return ThreeDS2Service2;
            }
            this.removeParam.ThreeDS2Service(setNextFocusLeftId.ThreeDS2ServiceInstance, this.onCompleted);
            throw null;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setFocusableInTouchMode() {
        int i = apiKey + 111;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 117) {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkCountryIso());
            apiKey = (addParam + 45) % 128;
            return ThreeDS2Service2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setFocusedByDefault() {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        InstallSourceInfo installSourceInfo2;
        String installingPackageName2;
        String packageName = this.ThreeDS2ServiceInstance.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            int i = apiKey + 87;
            addParam = i % 128;
            try {
                if (i % 2 != 0) {
                    installSourceInfo2 = this.initialize.getInstallSourceInfo(packageName);
                    installingPackageName2 = installSourceInfo2.getInstallingPackageName();
                    int i2 = 72 / 0;
                    return getHeadingTextColor.ThreeDS2Service(installingPackageName2);
                }
                installSourceInfo = this.initialize.getInstallSourceInfo(packageName);
                installingPackageName = installSourceInfo.getInstallingPackageName();
                return getHeadingTextColor.ThreeDS2Service(installingPackageName);
            } catch (PackageManager.NameNotFoundException unused) {
                return getHeadingTextColor.ThreeDS2Service();
            }
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.initialize.getInstallerPackageName(packageName));
        apiKey = (addParam + 65) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setForceDarkAllowed() {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (22335 >> ExpandableListView.getPackedPositionGroup(1L)), 32755 >> KeyEvent.getDeadChar(1, 1), (ViewConfiguration.getScrollDefaultDelay() * 118) + 50, objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (4881 - ExpandableListView.getPackedPositionGroup(0L)), KeyEvent.getDeadChar(0, 0) + 788, 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.ThreeDS2Service(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor setForeground() {
        apiKey = (addParam + 35) % 128;
        if (!this.onCompleted.ThreeDS2Service(setFastScrollStyle.valueOf)) {
            if (Build.VERSION.SDK_INT < 30) {
                apiKey = (addParam + 85) % 128;
                return getHeadingTextColor.get(this.getSDKInfo.isDeviceToApRttSupported());
            }
            PackageManager packageManager = this.ThreeDS2ServiceInstance.getPackageManager();
            Object[] objArr = new Object[1];
            values((char) (7690 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1194, 25 - View.resolveSizeAndState(0, 0, 0), objArr);
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(packageManager.hasSystemFeature(((String) objArr[0]).intern()));
            apiKey = (addParam + 63) % 128;
            return getheadingtextcolor;
        }
        return getHeadingTextColor.ThreeDS2ServiceInstance();
    }

    private /* synthetic */ getHeadingTextColor setForegroundGravity() {
        apiKey = (addParam + 115) % 128;
        getHeadingTextColor ThreeDS2Service2 = this.removeParam.ThreeDS2Service(setNextFocusDownId.ThreeDS2ServiceInstance, this.onCompleted);
        apiKey = (addParam + 77) % 128;
        return ThreeDS2Service2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.get(r5.getSDKInfo.isEnhancedPowerReportingSupported());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey + 19;
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        if ((r0 % 2) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((!r1.ThreeDS2Service(r0)) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if ((!r5.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setForegroundTintBlendMode() {
        /*
            r5 = this;
            r0 = 0
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r2
            int r1 = r1 % 2
            r2 = 1
            if (r1 == 0) goto L1e
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r5.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r0 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r0]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r3 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf
            r0[r2] = r3
            boolean r0 = r1.ThreeDS2Service(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L38
            goto L2d
        L1e:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r5.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf
            r3[r0] = r4
            boolean r0 = r1.ThreeDS2Service(r3)
            r0 = r0 ^ r2
            if (r0 == 0) goto L38
        L2d:
            android.net.wifi.WifiManager r0 = r5.getSDKInfo
            boolean r0 = r0.isEnhancedPowerReportingSupported()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.get(r0)
            return r0
        L38:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L49
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            return r0
        L49:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setForegroundTintBlendMode():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private /* synthetic */ getHeadingTextColor setForegroundTintList() {
        int i = addParam + 77;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return this.removeParam.ThreeDS2Service(setNextFocusRightId.get, this.onCompleted);
        }
        this.removeParam.ThreeDS2Service(setNextFocusRightId.get, this.onCompleted);
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setForegroundTintMode() {
        addParam = (apiKey + 99) % 128;
        if (!(!this.onCompleted.ThreeDS2Service(setFastScrollStyle.valueOf))) {
            getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
            apiKey = (addParam + 51) % 128;
            return ThreeDS2ServiceInstance;
        }
        return getHeadingTextColor.get(this.getSDKInfo.isP2pSupported());
    }

    private /* synthetic */ getHeadingTextColor setHandwritingBoundsOffsets() {
        String alias;
        addParam = (apiKey + 35) % 128;
        if (!this.onCompleted.ThreeDS2Service(setFastScrollStyle.values, setFastScrollStyle.getWarnings)) {
            if (Build.VERSION.SDK_INT >= 30) {
                ArrayList arrayList = new ArrayList();
                Iterator<BluetoothDevice> it = this.ThreeDS2Service$InitializationCallback.getAdapter().getBondedDevices().iterator();
                while (!(!it.hasNext())) {
                    alias = it.next().getAlias();
                    arrayList.add(alias);
                }
                return getHeadingTextColor.ThreeDS2Service(arrayList);
            }
            return getHeadingTextColor.valueOf();
        }
        addParam = (apiKey + 31) % 128;
        return getHeadingTextColor.ThreeDS2ServiceInstance();
    }

    private static /* synthetic */ getHeadingTextColor setHandwritingDelegatorCallback() {
        String str;
        int i = addParam + 97;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 105) {
            str = Build.SKU;
            return getHeadingTextColor.ThreeDS2Service(str);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        int i2 = apiKey + 111;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return valueOf2;
    }

    private /* synthetic */ getHeadingTextColor setHapticFeedbackEnabled() {
        int simCarrierId;
        int i = apiKey + 15;
        addParam = i % 128;
        if (i % 2 != 0 || Build.VERSION.SDK_INT >= 28) {
            addParam = (apiKey + 69) % 128;
            simCarrierId = this.getWarnings.getSimCarrierId();
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(simCarrierId);
            int i2 = addParam + 43;
            apiKey = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 0;
            }
            return getheadingtextcolor;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setHasTransientState() {
        CharSequence simCarrierIdName;
        addParam = (apiKey + 49) % 128;
        if (Build.VERSION.SDK_INT >= 28) {
            simCarrierIdName = this.getWarnings.getSimCarrierIdName();
            getHeadingTextColor values2 = getHeadingTextColor.values(simCarrierIdName);
            apiKey = (addParam + 57) % 128;
            return values2;
        }
        return getHeadingTextColor.valueOf();
    }

    private static /* synthetic */ getHeadingTextColor setHorizontalFadingEdgeEnabled() {
        apiKey = (addParam + 73) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.VERSION.CODENAME);
        addParam = (apiKey + 33) % 128;
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor setHorizontalScrollBarEnabled() {
        addParam = (apiKey + 49) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.TYPE);
        int i = addParam + 93;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setHorizontalScrollbarOverlay() {
        addParam = (apiKey + 23) % 128;
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(TimeZone.getDefault().getRawOffset() / 60000);
        apiKey = (addParam + 23) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setHovered() {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = apiKey + 35;
        addParam = i % 128;
        if (i % 2 != 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            SystemClock.currentThreadTimeMillis();
            Object[] objArr = new Object[1];
            values((char) 0, ViewConfiguration.getScrollBarFadeDuration() + 21787, 28 / (ViewConfiguration.getKeyRepeatDelay() >>> 119), objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 302, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21, objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.get(setbackgrounddrawable.get(((String) obj).intern()));
    }

    private static /* synthetic */ getHeadingTextColor setHttpAuthUsernamePassword() {
        addParam = (apiKey + 49) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.VERSION.RELEASE);
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setId() {
        apiKey = (addParam + 95) % 128;
        getHeadingTextColor ThreeDS2Service2 = this.removeParam.ThreeDS2Service(setNextFocusForwardId.get, this.onCompleted);
        int i = addParam + 109;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setImportantForAccessibility() {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = apiKey + 81;
        addParam = i % 128;
        if (i % 2 != 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) (64219 % (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1))), 17220 % (ViewConfiguration.getKeyRepeatDelay() - 103), ((Process.getThreadPriority(0) % 12) << 16) * 32, objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) (64219 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 245, ((Process.getThreadPriority(0) + 20) >> 6) + 18, objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.get(setbackgrounddrawable.get(((String) obj).intern()));
    }

    public static /* synthetic */ getHeadingTextColor setImportantForAutofill() {
        addParam = (apiKey + 119) % 128;
        getHeadingTextColor horizontalScrollBarEnabled = setHorizontalScrollBarEnabled();
        addParam = (apiKey + 55) % 128;
        return horizontalScrollBarEnabled;
    }

    public static /* synthetic */ getHeadingTextColor setImportantForContentCapture() {
        apiKey = (addParam + 53) % 128;
        getHeadingTextColor leftTopRightBottom = setLeftTopRightBottom();
        apiKey = (addParam + 107) % 128;
        return leftTopRightBottom;
    }

    private /* synthetic */ getHeadingTextColor setInitialScale() {
        addParam = (apiKey + 117) % 128;
        Object[] objArr = new Object[1];
        values((char) Color.alpha(0), 1243 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        String windowInsetsAnimationCallback = setWindowInsetsAnimationCallback();
        Object[] objArr2 = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0') + 60427), (ViewConfiguration.getTouchSlop() >> 8) + 1249, 2 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(C9622nk.values(intern, windowInsetsAnimationCallback, Build.VERSION.RELEASE, ((String) objArr2[0]).intern(), Integer.valueOf(Build.VERSION.SDK_INT)));
        int i = apiKey + 1;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setIsCredential() {
        getHeadingTextColor ThreeDS2Service2;
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkOperator());
            int i2 = 47 / 0;
        } else {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkOperator());
        }
        apiKey = (addParam + 17) % 128;
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor setIsHandwritingDelegate() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            addParam = (apiKey + 99) % 128;
            str = Build.SOC_MODEL;
            return getHeadingTextColor.ThreeDS2Service(str);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        apiKey = (addParam + 15) % 128;
        return valueOf2;
    }

    public static /* synthetic */ getHeadingTextColor setKeepScreenOn() {
        addParam = (apiKey + 55) % 128;
        getHeadingTextColor filterTouchesWhenObscured = setFilterTouchesWhenObscured();
        int i = apiKey + 75;
        addParam = i % 128;
        if (i % 2 == 0) {
            return filterTouchesWhenObscured;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setKeyboardNavigationCluster() {
        int i = addParam + 95;
        apiKey = i % 128;
        if (i % 2 != 0) {
            FeatureInfo[] systemAvailableFeatures = this.initialize.getSystemAvailableFeatures();
            if (systemAvailableFeatures != null) {
                getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(systemAvailableFeatures.length);
                addParam = (apiKey + 125) % 128;
                return getheadingtextcolor;
            }
            return getHeadingTextColor.ThreeDS2Service();
        }
        this.initialize.getSystemAvailableFeatures();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setLabelFor() {
        apiKey = (addParam + 35) % 128;
        getHeadingTextColor scrollBarSize = setScrollBarSize();
        addParam = (apiKey + 35) % 128;
        return scrollBarSize;
    }

    private static /* synthetic */ getHeadingTextColor setLayerPaint() {
        addParam = (apiKey + 81) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.FINGERPRINT);
        apiKey = (addParam + 87) % 128;
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor setLayerType() {
        int i = apiKey + 27;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getHeadingTextColor.ThreeDS2Service(Build.DISPLAY);
        }
        getHeadingTextColor.ThreeDS2Service(Build.DISPLAY);
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setLayoutAnimation() {
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.ThreeDS2Service.ThreeDS2Service());
            addParam = (apiKey + 83) % 128;
            return ThreeDS2Service2;
        }
        getHeadingTextColor.ThreeDS2Service(this.ThreeDS2Service.ThreeDS2Service());
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setLayoutAnimationListener() {
        int i = apiKey + 27;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 60) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            Object[] objArr = new Object[1];
            values((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 1239, Color.argb(0, 0, 0, 0) + 1, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(displayMetrics.heightPixels);
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(sb.toString());
            apiKey = (addParam + 81) % 128;
            return ThreeDS2Service2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setLayoutDirection() {
        String manufacturerCode;
        if (Build.VERSION.SDK_INT >= 29) {
            addParam = (apiKey + 49) % 128;
            manufacturerCode = this.getWarnings.getManufacturerCode();
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(manufacturerCode);
            addParam = (apiKey + 27) % 128;
            return ThreeDS2Service2;
        }
        return getHeadingTextColor.valueOf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        if ((r2 % 2) != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        r1 = 11 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r2 = new java.lang.Object[1];
        values((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1231 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 7 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r2);
        r0 = r10.getSDKVersion.getLastKnownLocation(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.valueOf(r0.getLatitude());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0.ThreeDS2Service(r4) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r10.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.get, com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.ThreeDS2ServiceInstance) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
        r2 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam + 95;
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setLayoutMode() {
        /*
            r10 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L21
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r0 = r10.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r1]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.get
            r4[r3] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.ThreeDS2ServiceInstance
            r4[r3] = r5
            boolean r0 = r0.ThreeDS2Service(r4)
            if (r0 == r2) goto L33
            goto L46
        L21:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r0 = r10.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r4 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r1]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.get
            r4[r3] = r5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r5 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.ThreeDS2ServiceInstance
            r4[r2] = r5
            boolean r0 = r0.ThreeDS2Service(r4)
            if (r0 == 0) goto L46
        L33:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            int r2 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r2 = r2 + 95
            int r4 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r4
            int r2 = r2 % r1
            if (r2 != 0) goto L45
            r1 = 11
            int r1 = r1 / r3
        L45:
            return r0
        L46:
            double r0 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r3)
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            char r0 = (char) r6
            long r6 = android.widget.ExpandableListView.getPackedPositionForGroup(r3)
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r1 = 1231 - r1
            double r6 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r3)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            int r4 = 7 - r8
            java.lang.Object[] r2 = new java.lang.Object[r2]
            values(r0, r1, r4, r2)
            r0 = r2[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            android.location.LocationManager r1 = r10.getSDKVersion
            android.location.Location r0 = r1.getLastKnownLocation(r0)
            if (r0 == 0) goto L7f
            double r0 = r0.getLatitude()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.valueOf(r0)
            return r0
        L7f:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setLayoutMode():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private static /* synthetic */ getHeadingTextColor setLayoutParams() {
        int i = apiKey + 51;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getHeadingTextColor.ThreeDS2Service(Build.USER);
        }
        getHeadingTextColor.ThreeDS2Service(Build.USER);
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setLayoutTransition() {
        int i = apiKey + 61;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getHeadingTextColor.ThreeDS2Service(this.ThreeDS2ServiceInstance.getPackageName());
        }
        getHeadingTextColor.ThreeDS2Service(this.ThreeDS2ServiceInstance.getPackageName());
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setLeft() {
        apiKey = (addParam + 71) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (55123 - KeyEvent.getDeadChar(0, 0)), View.getDefaultSize(0, 0) + 855, 16 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 19;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setLeftTopRightBottom() {
        apiKey = (addParam + 121) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.BOARD);
        addParam = (apiKey + 3) % 128;
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor setLongClickable() {
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes());
        int i = apiKey + 33;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setMinimumHeight() {
        getHeadingTextColor getheadingtextcolor;
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 != 0) {
            getheadingtextcolor = getHeadingTextColor.get(this.getWarnings.isSmsCapable());
            int i2 = 37 / 0;
        } else {
            getheadingtextcolor = getHeadingTextColor.get(this.getWarnings.isSmsCapable());
        }
        addParam = (apiKey + 69) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setMinimumWidth() {
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
            return getHeadingTextColor.get(this.getWarnings.isNetworkRoaming());
        }
        return getHeadingTextColor.get(this.getWarnings.isNetworkRoaming());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r6.getWarnings.getLine1Number());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r1.ThreeDS2Service(r3) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r6.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo, com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKVersion, com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.initialize) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = (com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey + 43) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setMotionEventSplittingEnabled() {
        /*
            r6 = this;
            r0 = 1
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r2
            r2 = 2
            int r1 = r1 % r2
            if (r1 != 0) goto L25
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            r2 = 5
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r3[r0] = r4
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKVersion
            r3[r0] = r4
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r0 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.initialize
            r3[r2] = r0
            boolean r0 = r1.ThreeDS2Service(r3)
            if (r0 == 0) goto L4a
            goto L3d
        L25:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            r3 = 3
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r3]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r5 = 0
            r3[r5] = r4
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKVersion
            r3[r0] = r4
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r0 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.initialize
            r3[r2] = r0
            boolean r0 = r1.ThreeDS2Service(r3)
            if (r0 == 0) goto L4a
        L3d:
            int r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r0 = r0 + 43
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r0
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            return r0
        L4a:
            android.telephony.TelephonyManager r0 = r6.getWarnings
            java.lang.String r0 = r0.getLine1Number()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setMotionEventSplittingEnabled():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private /* synthetic */ getHeadingTextColor setNestedScrollingEnabled() {
        apiKey = (addParam + 7) % 128;
        if (this.getWarnings.getSimState() == 5) {
            int i = addParam + 75;
            apiKey = i % 128;
            if (i % 2 == 0) {
                int i2 = 95 / 0;
                return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimOperatorName());
            }
            return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimOperatorName());
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service();
        int i3 = addParam + 115;
        apiKey = i3 % 128;
        if (i3 % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setNetworkAvailable() {
        Object obj;
        int i = apiKey + 105;
        addParam = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            values((char) (ViewConfiguration.getMinimumFlingVelocity() / 28), 4630 / (Process.myPid() % 118), 69 << (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1242 - (Process.myPid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6, objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(((String) obj).intern());
        int i2 = apiKey + CameraActivity.REQUEST_CODE;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor setNextClusterForwardId() {
        apiKey = (addParam + 87) % 128;
        getHeadingTextColor scrollBarFadeDuration = setScrollBarFadeDuration();
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return scrollBarFadeDuration;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setNextFocusDownId() {
        int i = addParam + 21;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setAllowedHandwritingDelegatePackage();
            throw null;
        }
        getHeadingTextColor allowedHandwritingDelegatePackage = setAllowedHandwritingDelegatePackage();
        apiKey = (addParam + 115) % 128;
        return allowedHandwritingDelegatePackage;
    }

    public static /* synthetic */ getHeadingTextColor setNextFocusForwardId() {
        int i = addParam + 57;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setCameraDistance();
            throw null;
        }
        getHeadingTextColor cameraDistance = setCameraDistance();
        int i2 = apiKey + 5;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return cameraDistance;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setNextFocusLeftId() {
        int i = apiKey + 95;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setHorizontalFadingEdgeEnabled();
        }
        setHorizontalFadingEdgeEnabled();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setNextFocusRightId() {
        addParam = (apiKey + 73) % 128;
        getHeadingTextColor layerPaint = setLayerPaint();
        addParam = (apiKey + 43) % 128;
        return layerPaint;
    }

    public static /* synthetic */ getHeadingTextColor setNextFocusUpId() {
        addParam = (apiKey + 119) % 128;
        getHeadingTextColor animationMatrix = setAnimationMatrix();
        addParam = (apiKey + 9) % 128;
        return animationMatrix;
    }

    public static /* synthetic */ getHeadingTextColor setOnApplyWindowInsetsListener() {
        apiKey = (addParam + 33) % 128;
        getHeadingTextColor certificate = setCertificate();
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 == 0) {
            return certificate;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setOnCapturedPointerListener() {
        int activeModemCount;
        int phoneCount;
        int phoneCount2;
        int i = apiKey + 5;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 97) {
            activeModemCount = this.getWarnings.getActiveModemCount();
            return getHeadingTextColor.get(activeModemCount);
        } else if (Build.VERSION.SDK_INT >= 23) {
            int i2 = apiKey + CameraActivity.REQUEST_CODE;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                phoneCount2 = this.getWarnings.getPhoneCount();
                getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(phoneCount2);
                apiKey = (addParam + 109) % 128;
                return getheadingtextcolor;
            }
            phoneCount = this.getWarnings.getPhoneCount();
            getHeadingTextColor.get(phoneCount);
            throw null;
        } else {
            return getHeadingTextColor.valueOf();
        }
    }

    public static /* synthetic */ getHeadingTextColor setOnContextClickListener() {
        int i = addParam + 11;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setDuplicateParentStateEnabled();
            throw null;
        }
        getHeadingTextColor duplicateParentStateEnabled = setDuplicateParentStateEnabled();
        apiKey = (addParam + 85) % 128;
        return duplicateParentStateEnabled;
    }

    public static /* synthetic */ getHeadingTextColor setOnCreateContextMenuListener() {
        addParam = (apiKey + 65) % 128;
        getHeadingTextColor verticalFadingEdgeEnabled = setVerticalFadingEdgeEnabled();
        addParam = (apiKey + 15) % 128;
        return verticalFadingEdgeEnabled;
    }

    public static /* synthetic */ getHeadingTextColor setOnDragListener() {
        apiKey = (addParam + 89) % 128;
        getHeadingTextColor layoutParams = setLayoutParams();
        int i = addParam + 121;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return layoutParams;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setOnGenericMotionListener() {
        getHeadingTextColor contextClickable;
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 != 0) {
            contextClickable = setContextClickable();
            int i2 = 87 / 0;
        } else {
            contextClickable = setContextClickable();
        }
        addParam = (apiKey + 57) % 128;
        return contextClickable;
    }

    private /* synthetic */ getHeadingTextColor setOnHierarchyChangeListener() {
        apiKey = (addParam + 91) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.ThreeDS2Service.values());
        addParam = (apiKey + 31) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor setOnHoverListener() {
        addParam = (apiKey + 61) % 128;
        getHeadingTextColor clipToOutline = setClipToOutline();
        int i = apiKey + 101;
        addParam = i % 128;
        if (i % 2 == 0) {
            return clipToOutline;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setOnKeyListener() {
        apiKey = (addParam + 125) % 128;
        getHeadingTextColor outlineAmbientShadowColor = setOutlineAmbientShadowColor();
        int i = apiKey + 19;
        addParam = i % 128;
        if (i % 2 == 0) {
            return outlineAmbientShadowColor;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setOnLongClickListener() {
        addParam = (apiKey + 33) % 128;
        getHeadingTextColor accessibilityDataSensitive = setAccessibilityDataSensitive();
        addParam = (apiKey + 25) % 128;
        return accessibilityDataSensitive;
    }

    public static /* synthetic */ getHeadingTextColor setOnReceiveContentListener() {
        int i = apiKey + 31;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setScrollBarStyle();
        }
        setScrollBarStyle();
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setOnSystemUiVisibilityChangeListener() {
        int i = apiKey + 47;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
            return getHeadingTextColor.get(this.getWarnings.getSimState());
        }
        return getHeadingTextColor.get(this.getWarnings.getSimState());
    }

    public static /* synthetic */ getHeadingTextColor setOnTouchListener() {
        int i = apiKey + 113;
        addParam = i % 128;
        if (i % 2 != 0) {
            setHttpAuthUsernamePassword();
            throw null;
        }
        getHeadingTextColor httpAuthUsernamePassword = setHttpAuthUsernamePassword();
        apiKey = (addParam + 65) % 128;
        return httpAuthUsernamePassword;
    }

    private static /* synthetic */ getHeadingTextColor setOutlineAmbientShadowColor() {
        int i = addParam + 13;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return getHeadingTextColor.ThreeDS2Service(Build.TAGS);
        }
        getHeadingTextColor.ThreeDS2Service(Build.TAGS);
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setOutlineProvider() {
        getHeadingTextColor ThreeDS2Service2;
        int i = addParam + 91;
        apiKey = i % 128;
        if (i % 2 == 0) {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.VERSION.INCREMENTAL);
            int i2 = 73 / 0;
        } else {
            ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.VERSION.INCREMENTAL);
        }
        apiKey = (addParam + 55) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setOutlineSpotShadowColor() {
        addParam = (apiKey + 47) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) ((Process.myPid() >> 22) + 51330), Color.rgb(0, 0, 0) + 16778308, 27 - KeyEvent.getDeadChar(0, 0), objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        apiKey = (addParam + 71) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setOverScrollMode() {
        int i = addParam + 75;
        apiKey = i % 128;
        if (i % 2 != 0 ? this.getWarnings.getSimState() == 5 : this.getWarnings.getSimState() == 3) {
            int i2 = apiKey + 1;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimOperator());
            }
            getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimOperator());
            throw null;
        }
        return getHeadingTextColor.ThreeDS2Service();
    }

    private /* synthetic */ getHeadingTextColor setPadding() {
        addParam = (apiKey + 93) % 128;
        getHeadingTextColor ThreeDS2Service2 = this.removeParam.ThreeDS2Service(setNextClusterForwardId.values, this.onCompleted);
        int i = addParam + 35;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setPaddingRelative() {
        boolean isWorldPhone;
        apiKey = (addParam + 63) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            apiKey = (addParam + 111) % 128;
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        } else if (Build.VERSION.SDK_INT >= 23) {
            addParam = (apiKey + 99) % 128;
            isWorldPhone = this.getWarnings.isWorldPhone();
            return getHeadingTextColor.get(isWorldPhone);
        } else {
            return getHeadingTextColor.valueOf();
        }
    }

    private /* synthetic */ getHeadingTextColor setPersistentDrawingCache() {
        int i = apiKey + 101;
        addParam = i % 128;
        if (i % 2 == 0) {
            InetAddress inetAddress = null;
            for (InetAddress inetAddress2 : setAllowedHandwritingDelegatorPackage()) {
                addParam = (apiKey + 5) % 128;
                if (!inetAddress2.isLoopbackAddress()) {
                    int length = inetAddress2.getAddress().length;
                    if (length == 16) {
                        inetAddress = inetAddress2;
                    } else if (length == 4) {
                        return getHeadingTextColor.ThreeDS2Service(inetAddress2.getHostAddress());
                    }
                }
            }
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                Object[] objArr = new Object[1];
                values((char) (ViewConfiguration.getEdgeSlop() >> 16), 1238 - View.resolveSize(0, 0), -TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                return getHeadingTextColor.ThreeDS2Service(hostAddress.substring(0, hostAddress.indexOf(((String) objArr[0]).intern())));
            }
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service();
            int i2 = apiKey + 5;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return ThreeDS2Service2;
            }
            throw null;
        }
        setAllowedHandwritingDelegatorPackage().iterator();
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setPivotX() {
        addParam = (apiKey + 83) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (21195 - (Process.myPid() >> 22)), 470 - Color.blue(0), TextUtils.indexOf("", "", 0, 0) + 25, objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        addParam = (apiKey + 23) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setPivotY() {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = addParam + 11;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), (-16776554) / Color.rgb(1, 0, 0), 91 << (ViewConfiguration.getEdgeSlop() - 76), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-16776554) - Color.rgb(0, 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 18, objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.ThreeDS2Service(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        r1 = new java.lang.StringBuilder();
        r2 = new java.lang.Object[1];
        values((char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 44888), (android.os.Process.myPid() >> 22) + 1218, 13 - android.view.KeyEvent.getDeadChar(0, 0), r2);
        r1.append(((java.lang.String) r2[0]).intern());
        r0 = r6.getWarnings.getDataNetworkType();
        r1.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        r1 = new java.lang.StringBuilder();
        r2 = new java.lang.Object[1];
        values((char) (44888 - android.view.View.resolveSize(0, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1218, android.graphics.Color.red(0) + 13, r2);
        r1.append(((java.lang.String) r2[0]).intern());
        r1.append(r6.getWarnings.getNetworkType());
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r1.toString());
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = (com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.ThreeDS2Service(r3) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r6.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setPointerIcon() {
        /*
            r6 = this;
            r0 = 0
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r2
            int r1 = r1 % 2
            r2 = 1
            if (r1 != 0) goto L1d
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r3[r2] = r4
            boolean r1 = r1.ThreeDS2Service(r3)
            if (r1 == r2) goto L2b
            goto L30
        L1d:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r6.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r3[r0] = r4
            boolean r1 = r1.ThreeDS2Service(r3)
            if (r1 == 0) goto L30
        L2b:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            return r0
        L30:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r4 = 44888(0xaf58, float:6.2901E-41)
            if (r1 < r3) goto L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = android.view.Gravity.getAbsoluteGravity(r0, r0)
            int r3 = r3 + r4
            char r3 = (char) r3
            int r4 = android.os.Process.myPid()
            int r4 = r4 >> 22
            int r4 = r4 + 1218
            int r5 = android.view.KeyEvent.getDeadChar(r0, r0)
            int r5 = 13 - r5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            values(r3, r4, r5, r2)
            r0 = r2[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r1.append(r0)
            android.telephony.TelephonyManager r0 = r6.getWarnings
            int r0 = p000.H72.m68124a(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            return r0
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = android.view.View.resolveSize(r0, r0)
            int r4 = r4 - r3
            char r3 = (char) r4
            int r4 = android.view.ViewConfiguration.getEdgeSlop()
            int r4 = r4 >> 16
            int r4 = r4 + 1218
            int r5 = android.graphics.Color.red(r0)
            int r5 = r5 + 13
            java.lang.Object[] r2 = new java.lang.Object[r2]
            values(r3, r4, r5, r2)
            r0 = r2[r0]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r1.append(r0)
            android.telephony.TelephonyManager r0 = r6.getWarnings
            int r0 = r0.getNetworkType()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r1 = r1 + 21
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setPointerIcon():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    public static /* synthetic */ getHeadingTextColor setPreferKeepClear() {
        int i = apiKey + 99;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setStateListAnimator();
        }
        setStateListAnimator();
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setPreferKeepClearRects() {
        apiKey = (addParam + 59) % 128;
        getHeadingTextColor verticalScrollBarEnabled = setVerticalScrollBarEnabled();
        int i = addParam + 97;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return verticalScrollBarEnabled;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setPressed() {
        int i = addParam + 63;
        apiKey = i % 128;
        if (i % 2 != 0) {
            String[] systemSharedLibraryNames = this.initialize.getSystemSharedLibraryNames();
            if (systemSharedLibraryNames != null) {
                return getHeadingTextColor.get(systemSharedLibraryNames.length);
            }
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service();
            int i2 = addParam + 57;
            apiKey = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 85 / 0;
            }
            return ThreeDS2Service2;
        }
        this.initialize.getSystemSharedLibraryNames();
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setRenderEffect() {
        apiKey = (addParam + 117) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.ID);
        apiKey = (addParam + 65) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor setRevealOnFocusHint() {
        apiKey = (addParam + 65) % 128;
        getHeadingTextColor scrollbarFadingEnabled = setScrollbarFadingEnabled();
        apiKey = (addParam + 55) % 128;
        return scrollbarFadingEnabled;
    }

    private /* synthetic */ getHeadingTextColor setRight() {
        boolean isLocationEnabled;
        addParam = (apiKey + 19) % 128;
        if (Build.VERSION.SDK_INT >= 28) {
            isLocationEnabled = this.getSDKVersion.isLocationEnabled();
            return getHeadingTextColor.get(isLocationEnabled);
        }
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (52657 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.green(0) + 935, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = addParam + 91;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setRotation() {
        addParam = (apiKey + 47) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 384 - (KeyEvent.getMaxKeyCode() >> 16), 19 - TextUtils.getTrimmedLength(""), objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        addParam = (apiKey + 57) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setRotationX() {
        addParam = (apiKey + 53) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (64506 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 612, (ViewConfiguration.getPressedStateDuration() >> 16) + 26, objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setRotationY() {
        apiKey = (addParam + 81) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (29357 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Color.alpha(0) + 638, 24 - TextUtils.getTrimmedLength(""), objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = apiKey + 1;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setSaveEnabled() {
        int i = apiKey + 87;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 83) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(displayMetrics.densityDpi);
            apiKey = (addParam + 7) % 128;
            return getheadingtextcolor;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setSaveFromParentEnabled() {
        apiKey = (addParam + 69) % 128;
        if (Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf(displayMetrics.density);
            int i = apiKey + 115;
            addParam = i % 128;
            if (i % 2 != 0) {
                int i2 = 46 / 0;
            }
            return valueOf2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setScaleX() {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10057, 33 << TextUtils.lastIndexOf("", (char) 14, 0), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 574 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 14 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.ThreeDS2Service(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor setScaleY() {
        addParam = (apiKey + 13) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (18313 - View.combineMeasuredStates(0, 0)), 437 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        apiKey = (addParam + 67) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setScreenReaderFocusable() {
        getHeadingTextColor getheadingtextcolor;
        int i = addParam + 57;
        apiKey = i % 128;
        if (i % 2 == 0) {
            getheadingtextcolor = getHeadingTextColor.get(this.initialize.isSafeMode());
            int i2 = 77 / 0;
        } else {
            getheadingtextcolor = getHeadingTextColor.get(this.initialize.isSafeMode());
        }
        addParam = (apiKey + 65) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setScrollBarDefaultDelayBeforeFade() {
        String serial;
        String serial2;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.SERIAL);
            int i2 = apiKey + 77;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return ThreeDS2Service2;
            }
            throw null;
        } else if (i < 29) {
            int i3 = apiKey + 77;
            addParam = i3 % 128;
            if (i3 % 2 == 0) {
                serial2 = Build.getSerial();
                return getHeadingTextColor.ThreeDS2Service(serial2);
            }
            serial = Build.getSerial();
            getHeadingTextColor.ThreeDS2Service(serial);
            throw null;
        } else {
            return getHeadingTextColor.ThreeDS2Service();
        }
    }

    private static /* synthetic */ getHeadingTextColor setScrollBarFadeDuration() {
        int i = apiKey + 7;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 61 / 0;
            return getHeadingTextColor.ThreeDS2Service(Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
        }
        return getHeadingTextColor.ThreeDS2Service(Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
    }

    private static /* synthetic */ getHeadingTextColor setScrollBarSize() {
        addParam = (apiKey + 9) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.getRadioVersion());
        int i = apiKey + 63;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setScrollBarStyle() {
        apiKey = (addParam + 9) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Build.MANUFACTURER);
        int i = apiKey + 35;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setScrollCaptureCallback() {
        int dataNetworkType;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            dataNetworkType = this.getWarnings.getDataNetworkType();
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(dataNetworkType);
            apiKey = (addParam + 91) % 128;
            return getheadingtextcolor;
        }
        getHeadingTextColor getheadingtextcolor2 = getHeadingTextColor.get(this.getWarnings.getNetworkType());
        int i = apiKey + CameraActivity.REQUEST_CODE;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
        return getheadingtextcolor2;
    }

    private /* synthetic */ getHeadingTextColor setScrollCaptureHint() {
        int i = addParam + 79;
        apiKey = i % 128;
        if (i % 2 != 0 ? this.getWarnings.getSimState() == 5 : this.getWarnings.getSimState() == 5) {
            return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimCountryIso());
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service();
        apiKey = (addParam + 105) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor setScrollContainer() {
        addParam = (apiKey + 39) % 128;
        getHeadingTextColor networkAvailable = setNetworkAvailable();
        int i = apiKey + 39;
        addParam = i % 128;
        if (i % 2 == 0) {
            return networkAvailable;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setScrollX() {
        addParam = (apiKey + 57) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 323, (-16777188) - Color.rgb(0, 0, 0), objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        apiKey = (addParam + 47) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setScrollY() {
        addParam = (apiKey + 35) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (12443 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 374 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 10, objArr);
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = apiKey + 9;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getheadingtextcolor;
        }
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setScrollbarFadingEnabled() {
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 0;
            return getHeadingTextColor.ThreeDS2Service(Build.PRODUCT);
        }
        return getHeadingTextColor.ThreeDS2Service(Build.PRODUCT);
    }

    private /* synthetic */ getHeadingTextColor setSelected() {
        boolean isVoiceCapable;
        apiKey = (addParam + 57) % 128;
        if (Build.VERSION.SDK_INT >= 22) {
            apiKey = (addParam + 105) % 128;
            isVoiceCapable = this.getWarnings.isVoiceCapable();
            return getHeadingTextColor.get(isVoiceCapable);
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setSoundEffectsEnabled() {
        CharSequence simSpecificCarrierIdName;
        addParam = (apiKey + 67) % 128;
        if (Build.VERSION.SDK_INT >= 29) {
            addParam = (apiKey + 77) % 128;
            simSpecificCarrierIdName = this.getWarnings.getSimSpecificCarrierIdName();
            return getHeadingTextColor.values(simSpecificCarrierIdName);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        apiKey = (addParam + 113) % 128;
        return valueOf2;
    }

    public static /* synthetic */ getHeadingTextColor setStateDescription() {
        int i = apiKey + 55;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setLongClickable();
        }
        setLongClickable();
        throw null;
    }

    private static /* synthetic */ getHeadingTextColor setStateListAnimator() {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            apiKey = (addParam + 3) % 128;
            i = Build.VERSION.PREVIEW_SDK_INT;
            return getHeadingTextColor.get(i);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        apiKey = (addParam + 83) % 128;
        return valueOf2;
    }

    public static /* synthetic */ getHeadingTextColor setSystemGestureExclusionRects() {
        addParam = (apiKey + 53) % 128;
        getHeadingTextColor layerType = setLayerType();
        int i = addParam + 47;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
        return layerType;
    }

    private /* synthetic */ getHeadingTextColor setSystemUiVisibility() {
        if (!(!this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo))) {
            addParam = (apiKey + 109) % 128;
            getHeadingTextColor ThreeDS2ServiceInstance = getHeadingTextColor.ThreeDS2ServiceInstance();
            apiKey = (addParam + 61) % 128;
            return ThreeDS2ServiceInstance;
        }
        return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getVoiceMailNumber());
    }

    private /* synthetic */ getHeadingTextColor setTag() {
        int i = apiKey + 19;
        addParam = i % 128;
        if (i % 2 == 0) {
            getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(this.getWarnings.hasIccCard());
            addParam = (apiKey + 55) % 128;
            return getheadingtextcolor;
        }
        getHeadingTextColor.get(this.getWarnings.hasIccCard());
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setTextAlignment() {
        apiKey = (addParam + 55) % 128;
        if (!(!this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo))) {
            int i = apiKey + 117;
            addParam = i % 128;
            if (i % 2 == 0) {
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        }
        return getHeadingTextColor.ThreeDS2Service(this.getWarnings.getVoiceMailAlphaTag());
    }

    private /* synthetic */ getHeadingTextColor setTextDirection() {
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            int i = addParam + 25;
            apiKey = i % 128;
            if (i % 2 != 0) {
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        } else if (Build.VERSION.SDK_INT < 29) {
            apiKey = (addParam + 75) % 128;
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getSimSerialNumber());
            apiKey = (addParam + 19) % 128;
            return ThreeDS2Service2;
        } else {
            return getHeadingTextColor.ThreeDS2Service();
        }
    }

    public static /* synthetic */ getHeadingTextColor setThreeDSRequestorAppURL(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 91) % 128;
        getHeadingTextColor backgroundTintBlendMode = setdarktextcolor.setBackgroundTintBlendMode();
        addParam = (apiKey + 87) % 128;
        return backgroundTintBlendMode;
    }

    private /* synthetic */ getHeadingTextColor setTooltipText() {
        apiKey = (addParam + 113) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getMmsUAProfUrl());
        int i = apiKey + 13;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setTop() {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = addParam + 21;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (45692 - (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1))), View.combineMeasuredStates(1, 0) + 25707, 12 / (ViewConfiguration.getKeyRepeatTimeout() >>> 22), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45692), View.combineMeasuredStates(0, 0) + 741, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.get(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor setTouchDelegate() {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = addParam + 71;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 85) {
            int i2 = apiKey + 89;
            addParam = i2 % 128;
            if (i2 % 2 != 0) {
                setbackgrounddrawable = this.ConfigurationBuilder;
                Object[] objArr = new Object[1];
                values((char) ((Process.getThreadPriority(0) + 42) << 63), 28716 << TextUtils.getOffsetAfter("", 0), 9 / ExpandableListView.getPackedPositionGroup(0L), objArr);
                obj = objArr[0];
            } else {
                setbackgrounddrawable = this.ConfigurationBuilder;
                Object[] objArr2 = new Object[1];
                values((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getOffsetAfter("", 0) + 426, 11 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                obj = objArr2[0];
            }
            return getHeadingTextColor.ThreeDS2Service(setbackgrounddrawable.get(((String) obj).intern()));
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor setTouchscreenBlocksFocus() {
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            addParam = (apiKey + 9) % 128;
            return getHeadingTextColor.ThreeDS2ServiceInstance();
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getDeviceSoftwareVersion());
        int i = apiKey + 9;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setTransitionAlpha() {
        apiKey = (addParam + 101) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (Process.getGidForName("") + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 679, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, objArr);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = apiKey + 13;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r4.getWarnings.getGroupIdLevel1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2.ThreeDS2Service(r1) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r4.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = (com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam + 3) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor setTransitionGroup() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            int r2 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r2 = r2 + 83
            int r3 = r2 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L1d
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r2 = r4.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r1 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r1]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r3 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r1[r0] = r3
            boolean r0 = r2.ThreeDS2Service(r1)
            if (r0 == 0) goto L38
            goto L2b
        L1d:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r2 = r4.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r0 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r0]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r3 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.getSDKInfo
            r0[r1] = r3
            boolean r0 = r2.ThreeDS2Service(r0)
            if (r0 == 0) goto L38
        L2b:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam
            int r1 = r1 + 3
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey = r1
            return r0
        L38:
            android.telephony.TelephonyManager r0 = r4.getWarnings
            java.lang.String r0 = r0.getGroupIdLevel1()
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r0 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2Service(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.setTransitionGroup():com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    private /* synthetic */ getHeadingTextColor setTransitionName() {
        addParam = (apiKey + 33) % 128;
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(this.getWarnings.getPhoneType());
        addParam = (apiKey + 79) % 128;
        return getheadingtextcolor;
    }

    private /* synthetic */ getHeadingTextColor setTransitionVisibility() {
        addParam = (apiKey + 69) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 284, 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        String str = setbackgrounddrawable.get(((String) objArr[0]).intern());
        if (C9670on.ThreeDS2ServiceInstance(str)) {
            C9663og ThreeDS2ServiceInstance = C9663og.ThreeDS2ServiceInstance(Double.valueOf(0.0d), Double.valueOf(255.0d));
            double parseDouble = Double.parseDouble(str);
            if (!(!ThreeDS2ServiceInstance.valueOf(Double.valueOf(parseDouble)))) {
                int i = addParam + 93;
                apiKey = i % 128;
                if (i % 2 != 0) {
                    getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf(parseDouble);
                    int i2 = apiKey + 89;
                    addParam = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 60 / 0;
                    }
                    return valueOf2;
                }
                getHeadingTextColor.valueOf(parseDouble);
                throw null;
            }
        }
        return getHeadingTextColor.ThreeDS2Service();
    }

    private /* synthetic */ getHeadingTextColor setTranslationX() {
        setBackground setbackground;
        Object obj;
        int i = addParam + 71;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setbackground = this.getParamValue;
            ExpandableListView.getPackedPositionForChild(0, 0);
            Object[] objArr = new Object[1];
            values((char) 0, (TypedValue.complexToFloat(0) > 2.0f ? 1 : (TypedValue.complexToFloat(0) == 2.0f ? 0 : -1)) * 19031, 119 << (ViewConfiguration.getKeyRepeatDelay() * 87), objArr);
            obj = objArr[0];
        } else {
            setbackground = this.getParamValue;
            Object[] objArr2 = new Object[1];
            values((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1082, 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(setbackground.ThreeDS2ServiceInstance(((String) obj).intern()));
        int i2 = addParam + 3;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setTranslationY() {
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1001, Color.green(0) + 30, objArr);
        String ThreeDS2ServiceInstance = setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern());
        if (C9669om.ThreeDS2Service(ThreeDS2ServiceInstance)) {
            int i = addParam + 93;
            apiKey = i % 128;
            if (i % 2 != 0) {
                return getHeadingTextColor.ThreeDS2Service(ThreeDS2ServiceInstance);
            }
            getHeadingTextColor.ThreeDS2Service(ThreeDS2ServiceInstance);
            throw null;
        }
        Object[] objArr2 = new Object[1];
        values((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49613), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1002, 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Arrays.asList(ThreeDS2ServiceInstance.split(((String) objArr2[0]).intern())));
        addParam = (apiKey + 27) % 128;
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setTranslationZ() {
        boolean canRequestPackageInstalls;
        int i = apiKey + 5;
        addParam = i % 128;
        if (i % 2 == 0 ? this.onCompleted.ThreeDS2Service(setFastScrollStyle.cleanup) : this.onCompleted.ThreeDS2Service(setFastScrollStyle.cleanup)) {
            int i2 = apiKey + 31;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        } else if (Build.VERSION.SDK_INT >= 26) {
            canRequestPackageInstalls = this.initialize.canRequestPackageInstalls();
            return getHeadingTextColor.get(canRequestPackageInstalls);
        } else {
            return getHeadingTextColor.valueOf();
        }
    }

    private static /* synthetic */ getHeadingTextColor setVerticalFadingEdgeEnabled() {
        apiKey = (addParam + 77) % 128;
        getHeadingTextColor getheadingtextcolor = getHeadingTextColor.get(Build.TIME);
        apiKey = (addParam + 41) % 128;
        return getheadingtextcolor;
    }

    private static /* synthetic */ getHeadingTextColor setVerticalScrollBarEnabled() {
        addParam = (apiKey + 117) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
        int i = apiKey + 71;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor setVerticalScrollbarOverlay() {
        String values2;
        int i = apiKey + 121;
        addParam = i % 128;
        if (i % 2 != 0) {
            String[] strArr = new String[5];
            strArr[1] = Build.MANUFACTURER;
            strArr[1] = Build.MODEL;
            values2 = C9622nk.values(strArr);
        } else {
            values2 = C9622nk.values(Build.MANUFACTURER, Build.MODEL);
        }
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(values2);
        int i2 = apiKey + 59;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor setVerticalScrollbarPosition() {
        apiKey = (addParam + 121) % 128;
        getHeadingTextColor renderEffect = setRenderEffect();
        int i = addParam + 27;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return renderEffect;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setViewTranslationCallback() {
        addParam = (apiKey + 23) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.getWarnings.getNetworkCountryIso());
        int i = apiKey + 67;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 33 / 0;
        }
        return ThreeDS2Service2;
    }

    private /* synthetic */ getHeadingTextColor setVisibility() {
        int isMultiSimSupported;
        int isMultiSimSupported2;
        addParam = (apiKey + 63) % 128;
        if (this.onCompleted.ThreeDS2Service(setFastScrollStyle.getSDKInfo)) {
            int i = apiKey + 37;
            addParam = i % 128;
            if (i % 2 == 0) {
                return getHeadingTextColor.ThreeDS2ServiceInstance();
            }
            getHeadingTextColor.ThreeDS2ServiceInstance();
            throw null;
        } else if (Build.VERSION.SDK_INT >= 29) {
            int i2 = apiKey + 103;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                isMultiSimSupported2 = this.getWarnings.isMultiSimSupported();
                return getHeadingTextColor.get(isMultiSimSupported2);
            }
            isMultiSimSupported = this.getWarnings.isMultiSimSupported();
            getHeadingTextColor.get(isMultiSimSupported);
            throw null;
        } else {
            getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
            int i3 = apiKey + 7;
            addParam = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 44 / 0;
            }
            return valueOf2;
        }
    }

    private /* synthetic */ getHeadingTextColor setWillNotCacheDrawing() {
        int i = addParam + 51;
        apiKey = i % 128;
        if (i % 2 != 0) {
            getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(WebSettings.getDefaultUserAgent(this.ThreeDS2ServiceInstance));
            apiKey = (addParam + 113) % 128;
            return ThreeDS2Service2;
        }
        getHeadingTextColor.ThreeDS2Service(WebSettings.getDefaultUserAgent(this.ThreeDS2ServiceInstance));
        throw null;
    }

    private /* synthetic */ getHeadingTextColor setWillNotDraw() {
        int i = addParam + 87;
        apiKey = i % 128;
        if (i % 2 != 0 && Build.VERSION.SDK_INT < 30) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.ConfigParameters.getDefaultDisplay().getMetrics(displayMetrics);
            return getHeadingTextColor.valueOf(displayMetrics.scaledDensity);
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        int i2 = addParam + 73;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return valueOf2;
        }
        throw null;
    }

    private String setWindowInsetsAnimationCallback() {
        Field[] fields;
        int i;
        for (Field field : Build.VERSION_CODES.class.getFields()) {
            String name = field.getName();
            try {
                i = field.getInt(new Object());
                addParam = (apiKey + 101) % 128;
            } catch (IllegalAccessException | IllegalArgumentException | NullPointerException unused) {
            }
            if (i == Build.VERSION.SDK_INT) {
                apiKey = (addParam + 19) % 128;
                return name;
            }
        }
        return "";
    }

    private /* synthetic */ getHeadingTextColor setX() {
        int i = addParam + 39;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT <= 23 : Build.VERSION.SDK_INT <= 103) {
            Object[] objArr = new Object[1];
            values((char) Color.alpha(0), 888 - View.MeasureSpec.makeMeasureSpec(0, 0), 28 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            return getHeadingTextColor.ThreeDS2Service(this.getParamValue.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        }
        getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
        addParam = (apiKey + 71) % 128;
        return valueOf2;
    }

    private /* synthetic */ getHeadingTextColor setY() {
        setBackground setbackground;
        Object obj;
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 != 0) {
            setbackground = this.getParamValue;
            Object[] objArr = new Object[1];
            values((char) View.MeasureSpec.getSize(1), View.combineMeasuredStates(0, 1) + 8388, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) * 103, objArr);
            obj = objArr[0];
        } else {
            setbackground = this.getParamValue;
            Object[] objArr2 = new Object[1];
            values((char) View.MeasureSpec.getSize(0), 838 - View.combineMeasuredStates(0, 0), 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return getHeadingTextColor.get(setbackground.ThreeDS2ServiceInstance(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor setZ() {
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (38647 - (ViewConfiguration.getScrollBarSize() >> 8)), 980 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        String ThreeDS2ServiceInstance = setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern());
        if (C9669om.ThreeDS2Service(ThreeDS2ServiceInstance)) {
            addParam = (apiKey + 15) % 128;
            return getHeadingTextColor.ThreeDS2Service(ThreeDS2ServiceInstance);
        }
        Object[] objArr2 = new Object[1];
        values((char) (KeyEvent.keyCodeFromString("") + 49614), Color.red(0) + 1001, 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(Arrays.asList(ThreeDS2ServiceInstance.split(((String) objArr2[0]).intern())));
        apiKey = (addParam + 23) % 128;
        return ThreeDS2Service2;
    }

    public static /* synthetic */ getHeadingTextColor timedout(setDarkTextColor setdarktextcolor) {
        int i = addParam + 25;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.setTransitionAlpha();
            throw null;
        }
        getHeadingTextColor transitionAlpha = setdarktextcolor.setTransitionAlpha();
        apiKey = (addParam + 71) % 128;
        return transitionAlpha;
    }

    public static /* synthetic */ getHeadingTextColor toString(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 93) % 128;
        getHeadingTextColor outlineSpotShadowColor = setdarktextcolor.setOutlineSpotShadowColor();
        addParam = (apiKey + 107) % 128;
        return outlineSpotShadowColor;
    }

    public static /* synthetic */ getHeadingTextColor unionSchemeConfiguration(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 49) % 128;
        getHeadingTextColor layoutTransition = setdarktextcolor.setLayoutTransition();
        int i = addParam + 43;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return layoutTransition;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor useBridgingExtension(setDarkTextColor setdarktextcolor) {
        int i = apiKey + 37;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.setScrollCaptureHint();
            throw null;
        }
        getHeadingTextColor scrollCaptureHint = setdarktextcolor.setScrollCaptureHint();
        apiKey = (addParam + 93) % 128;
        return scrollCaptureHint;
    }

    public static /* synthetic */ getHeadingTextColor valueOf(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 13) % 128;
        getHeadingTextColor padding = setdarktextcolor.setPadding();
        int i = apiKey + 57;
        addParam = i % 128;
        if (i % 2 == 0) {
            return padding;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor values(setDarkTextColor setdarktextcolor) {
        apiKey = (addParam + 89) % 128;
        getHeadingTextColor layoutAnimation = setdarktextcolor.setLayoutAnimation();
        apiKey = (addParam + 61) % 128;
        return layoutAnimation;
    }

    public static /* synthetic */ getHeadingTextColor visaSchemeConfiguration(setDarkTextColor setdarktextcolor) {
        addParam = (apiKey + 79) % 128;
        getHeadingTextColor pointerIcon = setdarktextcolor.setPointerIcon();
        int i = apiKey + 75;
        addParam = i % 128;
        if (i % 2 == 0) {
            return pointerIcon;
        }
        throw null;
    }

    public valueOf ButtonCustomization() {
        UiCustomization uiCustomization = new UiCustomization(this);
        int i = apiKey + 99;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 76 / 0;
        }
        return uiCustomization;
    }

    public valueOf CompletionEvent() {
        getHeaderText getheadertext = new getHeaderText(this);
        apiKey = (addParam + 85) % 128;
        return getheadertext;
    }

    public valueOf Customization() {
        addParam = (apiKey + 121) % 128;
        valueOf createTransaction = createTransaction(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 1;
        addParam = i % 128;
        if (i % 2 == 0) {
            return createTransaction;
        }
        throw null;
    }

    public valueOf DsRidValues() {
        setOnClickListener setonclicklistener = new setOnClickListener(this);
        addParam = (apiKey + 83) % 128;
        return setonclicklistener;
    }

    public valueOf ErrorMessage() {
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
            return getWarnings(setHorizontalScrollBarEnabled.get);
        }
        return getWarnings(setHorizontalScrollBarEnabled.get);
    }

    public valueOf LabelCustomization() {
        apiKey = (addParam + 73) % 128;
        valueOf paramValue = getParamValue(setHorizontalScrollBarEnabled.get);
        apiKey = (addParam + 101) % 128;
        return paramValue;
    }

    public valueOf NcaBouncyCastleProvider() {
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(this);
        addParam = (apiKey + 117) % 128;
        return setonfocuschangelistener;
    }

    public valueOf ProgressView() {
        apiKey = (addParam + 3) % 128;
        valueOf onError = onError(setHorizontalScrollBarEnabled.get);
        apiKey = (addParam + 5) % 128;
        return onError;
    }

    public valueOf ProtocolErrorEvent() {
        int i = apiKey + 95;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf sDKInfo = getSDKInfo(setHorizontalScrollBarEnabled.get);
            addParam = (apiKey + 63) % 128;
            return sDKInfo;
        }
        getSDKInfo(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf RuntimeErrorEvent() {
        int i = addParam + 27;
        apiKey = i % 128;
        if (i % 2 != 0) {
            valueOf ConfigParameters = ConfigParameters(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = addParam + 117;
            apiKey = i2 % 128;
            if (i2 % 2 != 0) {
                return ConfigParameters;
            }
            throw null;
        }
        ConfigParameters(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        throw null;
    }

    public valueOf TextBoxCustomization() {
        setProgressViewBackgroundColor setprogressviewbackgroundcolor = new setProgressViewBackgroundColor(this);
        addParam = (apiKey + 109) % 128;
        return setprogressviewbackgroundcolor;
    }

    public valueOf ToolbarCustomization() {
        addParam = (apiKey + 77) % 128;
        valueOf SchemeConfiguration = SchemeConfiguration(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 51;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
        return SchemeConfiguration;
    }

    public valueOf UiCustomization() {
        int i = addParam + 41;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 12 / 0;
            return mastercardSchemeConfiguration(setHorizontalScrollBarEnabled.get);
        }
        return mastercardSchemeConfiguration(setHorizontalScrollBarEnabled.get);
    }

    public valueOf UiCustomization$ButtonType() {
        addParam = (apiKey + 35) % 128;
        setHorizontalScrollbarTrackDrawable sethorizontalscrollbartrackdrawable = setHorizontalScrollbarTrackDrawable.values;
        apiKey = (addParam + 57) % 128;
        return sethorizontalscrollbartrackdrawable;
    }

    public valueOf UiCustomization$UiCustomizationType() {
        setFadingEdgeLength setfadingedgelength = new setFadingEdgeLength(this);
        int i = apiKey + 89;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setfadingedgelength;
        }
        throw null;
    }

    public valueOf ViewCustomization() {
        apiKey = (addParam + 117) % 128;
        setHorizontalScrollbarThumbDrawable sethorizontalscrollbarthumbdrawable = setHorizontalScrollbarThumbDrawable.ThreeDS2ServiceInstance;
        addParam = (apiKey + 81) % 128;
        return sethorizontalscrollbarthumbdrawable;
    }

    public valueOf addAlgorithm() {
        int i = addParam + 67;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setOnContextClickListener.valueOf;
        }
        setOnContextClickListener setoncontextclicklistener = setOnContextClickListener.valueOf;
        throw null;
    }

    public valueOf addAttributes() {
        setAccessibilityPaneTitle setaccessibilitypanetitle = new setAccessibilityPaneTitle(this);
        addParam = (apiKey + 85) % 128;
        return setaccessibilitypanetitle;
    }

    public valueOf addKeyInfoConverter() {
        setOnKeyListener setonkeylistener = new setOnKeyListener(this);
        int i = apiKey + 41;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setonkeylistener;
        }
        throw null;
    }

    public valueOf getBackgroundColor() {
        setButtonCustomization setbuttoncustomization = new setButtonCustomization(this);
        addParam = (apiKey + 89) % 128;
        return setbuttoncustomization;
    }

    public valueOf getBorderColor() {
        apiKey = (addParam + CameraActivity.REQUEST_CODE) % 128;
        NcaBouncyCastleProvider ncaBouncyCastleProvider = NcaBouncyCastleProvider.valueOf;
        int i = addParam + 59;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ncaBouncyCastleProvider;
        }
        throw null;
    }

    public valueOf getBorderWidth() {
        getProgressViewBackgroundColor getprogressviewbackgroundcolor = new getProgressViewBackgroundColor(this);
        apiKey = (addParam + 55) % 128;
        return getprogressviewbackgroundcolor;
    }

    public valueOf getButtonCustomization() {
        int i = addParam + 83;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
            return dinersSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        return dinersSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
    }

    public valueOf getButtonText() {
        apiKey = (addParam + 43) % 128;
        valueOf configureScheme = configureScheme(setHorizontalScrollBarEnabled.get);
        int i = addParam + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return configureScheme;
        }
        throw null;
    }

    public valueOf getChallengeViewBackgroundColor() {
        setScrollIndicators setscrollindicators = new setScrollIndicators(this);
        int i = addParam + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setscrollindicators;
        }
        throw null;
    }

    public valueOf getCornerRadius() {
        getButtonText getbuttontext = new getButtonText(this);
        int i = apiKey + 39;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
        return getbuttontext;
    }

    public valueOf getDarkBackgroundColor() {
        apiKey = (addParam + 31) % 128;
        valueOf ThreeDS2Service$InitializationCallback = ThreeDS2Service$InitializationCallback(setHorizontalScrollBarEnabled.get);
        addParam = (apiKey + 15) % 128;
        return ThreeDS2Service$InitializationCallback;
    }

    public valueOf getDarkBorderColor() {
        hasAlgorithm hasalgorithm = new hasAlgorithm(this);
        int i = apiKey + 27;
        addParam = i % 128;
        if (i % 2 == 0) {
            return hasalgorithm;
        }
        throw null;
    }

    public valueOf getDarkModeSupported() {
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = new setVerticalScrollbarThumbDrawable(this);
        addParam = (apiKey + 19) % 128;
        return setverticalscrollbarthumbdrawable;
    }

    public valueOf getDarkTextColor() {
        apiKey = (addParam + 13) % 128;
        valueOf paramValue = getParamValue(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = addParam + 29;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 39 / 0;
        }
        return paramValue;
    }

    public valueOf getErrorComponent() {
        getBorderColor getbordercolor = new getBorderColor(this);
        int i = apiKey + 17;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
        return getbordercolor;
    }

    public valueOf getErrorDescription() {
        setHeadingDarkTextColor setheadingdarktextcolor = new setHeadingDarkTextColor(this);
        addParam = (apiKey + 27) % 128;
        return setheadingdarktextcolor;
    }

    public valueOf getErrorDetails() {
        getBorderWidth getborderwidth = new getBorderWidth(this);
        apiKey = (addParam + 45) % 128;
        return getborderwidth;
    }

    public valueOf getErrorMessage() {
        addParam = (apiKey + 49) % 128;
        valueOf onError = onError(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        apiKey = (addParam + 83) % 128;
        return onError;
    }

    public valueOf getErrorMessageType() {
        apiKey = (addParam + 53) % 128;
        valueOf sDKInfo = getSDKInfo(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        addParam = (apiKey + 87) % 128;
        return sDKInfo;
    }

    public valueOf getHeaderText() {
        valueOf build;
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 != 0) {
            build = build(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 66 / 0;
        } else {
            build = build(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        int i3 = addParam + 43;
        apiKey = i3 % 128;
        if (i3 % 2 != 0) {
            return build;
        }
        throw null;
    }

    public valueOf getHeadingDarkTextColor() {
        setChallengeViewBackgroundColor setchallengeviewbackgroundcolor = new setChallengeViewBackgroundColor(this);
        addParam = (apiKey + 89) % 128;
        return setchallengeviewbackgroundcolor;
    }

    public valueOf getHeadingTextColor() {
        valueOf removeParam;
        int i = addParam + 49;
        apiKey = i % 128;
        if (i % 2 == 0) {
            removeParam = removeParam(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 99 / 0;
        } else {
            removeParam = removeParam(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        addParam = (apiKey + 7) % 128;
        return removeParam;
    }

    public valueOf getHeadingTextFontName() {
        addParam = (apiKey + 109) % 128;
        valueOf ConfigurationBuilder = ConfigurationBuilder(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        addParam = (apiKey + 53) % 128;
        return ConfigurationBuilder;
    }

    public valueOf getHeadingTextFontSize() {
        getChallengeViewBackgroundColor getchallengeviewbackgroundcolor = new getChallengeViewBackgroundColor(this);
        addParam = (apiKey + 11) % 128;
        return getchallengeviewbackgroundcolor;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getKeyInfoConverter() {
        setOnDragListener setondraglistener = new setOnDragListener(this);
        addParam = (apiKey + 57) % 128;
        return setondraglistener;
    }

    public valueOf getLabelCustomization() {
        int i = apiKey + 101;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf jcbConfiguration = jcbConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = apiKey + 105;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return jcbConfiguration;
            }
            throw null;
        }
        jcbConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        throw null;
    }

    public valueOf getMessageVersionNumber() {
        valueOf onCompleted;
        int i = addParam + 103;
        apiKey = i % 128;
        if (i % 2 == 0) {
            onCompleted = onCompleted(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 70 / 0;
        } else {
            onCompleted = onCompleted(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        addParam = (apiKey + 83) % 128;
        return onCompleted;
    }

    public valueOf getPrivateKey() {
        setContentCaptureSession setcontentcapturesession = new setContentCaptureSession(this);
        addParam = (apiKey + 119) % 128;
        return setcontentcapturesession;
    }

    public valueOf getProgressViewBackgroundColor() {
        setVerticalScrollbarPosition setverticalscrollbarposition = new setVerticalScrollbarPosition(this);
        apiKey = (addParam + 45) % 128;
        return setverticalscrollbarposition;
    }

    public valueOf getPublicKey() {
        setOnHoverListener setonhoverlistener = new setOnHoverListener(this);
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
        return setonhoverlistener;
    }

    public valueOf getService() {
        setOnTouchListener setontouchlistener = new setOnTouchListener(this);
        apiKey = (addParam + 113) % 128;
        return setontouchlistener;
    }

    public valueOf getTextBoxCustomization() {
        addParam = (apiKey + 9) % 128;
        valueOf amexConfiguration = amexConfiguration(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 == 0) {
            return amexConfiguration;
        }
        throw null;
    }

    public valueOf getTextColor() {
        setViewCustomization setviewcustomization = new setViewCustomization(this);
        int i = apiKey + CameraActivity.REQUEST_CODE;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setviewcustomization;
        }
        throw null;
    }

    public valueOf getTextFontName() {
        apiKey = (addParam + 63) % 128;
        valueOf addParam2 = addParam(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        apiKey = (addParam + 29) % 128;
        return addParam2;
    }

    public valueOf getTextFontSize() {
        setToolbarCustomization settoolbarcustomization = new setToolbarCustomization(this);
        int i = apiKey + 115;
        addParam = i % 128;
        if (i % 2 == 0) {
            return settoolbarcustomization;
        }
        throw null;
    }

    public valueOf getToolbarCustomization() {
        getPublicKey getpublickey = new getPublicKey(this);
        int i = apiKey + 65;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getpublickey;
        }
        throw null;
    }

    public valueOf getTransactionID() {
        int i = addParam + 59;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 35 / 0;
            return getWarnings(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        return getWarnings(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
    }

    public valueOf getTransactionStatus() {
        TextBoxCustomization textBoxCustomization = new TextBoxCustomization(this);
        int i = addParam + 7;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
        return textBoxCustomization;
    }

    public valueOf getViewCustomization() {
        valueOf dinersSchemeConfiguration;
        int i = addParam + 119;
        apiKey = i % 128;
        if (i % 2 == 0) {
            dinersSchemeConfiguration = dinersSchemeConfiguration(setHorizontalScrollBarEnabled.get);
            int i2 = 84 / 0;
        } else {
            dinersSchemeConfiguration = dinersSchemeConfiguration(setHorizontalScrollBarEnabled.get);
        }
        int i3 = apiKey + 3;
        addParam = i3 % 128;
        if (i3 % 2 == 0) {
            return dinersSchemeConfiguration;
        }
        throw null;
    }

    public valueOf hasAlgorithm() {
        setOnGenericMotionListener setongenericmotionlistener = new setOnGenericMotionListener(this);
        apiKey = (addParam + 15) % 128;
        return setongenericmotionlistener;
    }

    public valueOf hideProgress() {
        int i = addParam + 27;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return onCompleted(setHorizontalScrollBarEnabled.get);
        }
        onCompleted(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf isProgressShown() {
        apiKey = (addParam + 9) % 128;
        valueOf createTransaction = createTransaction(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        apiKey = (addParam + 69) % 128;
        return createTransaction;
    }

    public valueOf onContextItemSelected() {
        apiKey = (addParam + 39) % 128;
        valueOf unionSchemeConfiguration = unionSchemeConfiguration(setFocusedByDefault.ThreeDS2Service);
        int i = addParam + 17;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return unionSchemeConfiguration;
        }
        throw null;
    }

    public valueOf onOptionsItemSelected() {
        setImportantForAutofill setimportantforautofill = new setImportantForAutofill(this);
        int i = apiKey + 73;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setimportantforautofill;
        }
        throw null;
    }

    public valueOf openContextMenu() {
        setOnReceiveContentListener setonreceivecontentlistener = new setOnReceiveContentListener(this);
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
        return setonreceivecontentlistener;
    }

    public valueOf protocolError() {
        getHeadingDarkTextColor getheadingdarktextcolor = new getHeadingDarkTextColor(this);
        apiKey = (addParam + 47) % 128;
        return getheadingdarktextcolor;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf registerForContextMenu() {
        setAccessibilityTraversalBefore setaccessibilitytraversalbefore = new setAccessibilityTraversalBefore(this);
        int i = apiKey + 15;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setaccessibilitytraversalbefore;
        }
        throw null;
    }

    public valueOf setBackgroundColor() {
        apiKey = (addParam + 65) % 128;
        valueOf ThreeDS2Service$InitializationCallback = ThreeDS2Service$InitializationCallback(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
        return ThreeDS2Service$InitializationCallback;
    }

    public valueOf setBorderColor() {
        addParam = (apiKey + 15) % 128;
        valueOf restrictedParameters = restrictedParameters(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = addParam + 23;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return restrictedParameters;
        }
        throw null;
    }

    public valueOf setBorderWidth() {
        int i = apiKey + 75;
        addParam = i % 128;
        if (i % 2 == 0) {
            DsRidValues dsRidValues = DsRidValues.ThreeDS2ServiceInstance;
            int i2 = addParam + 85;
            apiKey = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
            return dsRidValues;
        }
        DsRidValues dsRidValues2 = DsRidValues.ThreeDS2ServiceInstance;
        throw null;
    }

    public valueOf setButtonCustomization() {
        int i = apiKey + 5;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 30 / 0;
            return build(setHorizontalScrollBarEnabled.get);
        }
        return build(setHorizontalScrollBarEnabled.get);
    }

    public valueOf setButtonText() {
        valueOf mastercardSchemeConfiguration;
        int i = addParam + 75;
        apiKey = i % 128;
        if (i % 2 == 0) {
            mastercardSchemeConfiguration = mastercardSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 21 / 0;
        } else {
            mastercardSchemeConfiguration = mastercardSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        addParam = (apiKey + 71) % 128;
        return mastercardSchemeConfiguration;
    }

    public valueOf setChallengeViewBackgroundColor() {
        unregisterForContextMenu unregisterforcontextmenu = new unregisterForContextMenu(this);
        int i = apiKey + 53;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
        return unregisterforcontextmenu;
    }

    public valueOf setContentView() {
        setRevealOnFocusHint setrevealonfocushint = new setRevealOnFocusHint(this);
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setrevealonfocushint;
        }
        throw null;
    }

    public valueOf setCornerRadius() {
        setHeaderText setheadertext = new setHeaderText(this);
        int i = addParam + 89;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setheadertext;
        }
        throw null;
    }

    public valueOf setDarkBackgroundColor() {
        valueOf apiKey2;
        int i = apiKey + 111;
        addParam = i % 128;
        if (i % 2 != 0) {
            apiKey2 = apiKey(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 73 / 0;
        } else {
            apiKey2 = apiKey(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        int i3 = apiKey + 77;
        addParam = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return apiKey2;
    }

    public valueOf setDarkBorderColor() {
        int i = addParam + 19;
        apiKey = i % 128;
        if (i % 2 != 0) {
            valueOf restrictedParameters = restrictedParameters(setHorizontalScrollBarEnabled.get);
            addParam = (apiKey + 39) % 128;
            return restrictedParameters;
        }
        restrictedParameters(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf setDarkTextColor() {
        supportDarkMode supportdarkmode = new supportDarkMode(this);
        apiKey = (addParam + 27) % 128;
        return supportdarkmode;
    }

    public valueOf setFadingEdgeLength() {
        int i = apiKey + 57;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf schemeName = getSchemeName(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            apiKey = (addParam + 11) % 128;
            return schemeName;
        }
        getSchemeName(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        throw null;
    }

    public valueOf setHeaderText() {
        addParam = (apiKey + 43) % 128;
        valueOf configureScheme = configureScheme(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        apiKey = (addParam + 47) % 128;
        return configureScheme;
    }

    public valueOf setHeadingDarkTextColor() {
        apiKey = (addParam + 115) % 128;
        valueOf SchemeConfiguration = SchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = apiKey + 5;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
        return SchemeConfiguration;
    }

    public valueOf setHeadingTextColor() {
        apiKey = (addParam + 109) % 128;
        valueOf removeParam = removeParam(setHorizontalScrollBarEnabled.get);
        apiKey = (addParam + 85) % 128;
        return removeParam;
    }

    public valueOf setHeadingTextFontName() {
        int i = apiKey + 103;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf ConfigurationBuilder = ConfigurationBuilder(setHorizontalScrollBarEnabled.get);
            int i2 = apiKey + 43;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return ConfigurationBuilder;
            }
            throw null;
        }
        ConfigurationBuilder(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf setHeadingTextFontSize() {
        ViewCustomization viewCustomization = new ViewCustomization(this);
        int i = addParam + 75;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return viewCustomization;
        }
        throw null;
    }

    public valueOf setHorizontalScrollbarThumbDrawable() {
        addParam = (apiKey + 55) % 128;
        valueOf cbConfiguration = cbConfiguration(setHorizontalScrollBarEnabled.get);
        int i = addParam + 83;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return cbConfiguration;
        }
        throw null;
    }

    public valueOf setHorizontalScrollbarTrackDrawable() {
        int i = apiKey + 19;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf visaSchemeConfiguration = visaSchemeConfiguration(setHorizontalScrollBarEnabled.get);
            addParam = (apiKey + 99) % 128;
            return visaSchemeConfiguration;
        }
        visaSchemeConfiguration(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public valueOf setLabelCustomization() {
        registerForContextMenu registerforcontextmenu = new registerForContextMenu(this);
        int i = addParam + 25;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return registerforcontextmenu;
        }
        throw null;
    }

    public valueOf setOnClickListener() {
        apiKey = (addParam + 13) % 128;
        valueOf schemeName = getSchemeName(setHorizontalScrollBarEnabled.get);
        apiKey = (addParam + 1) % 128;
        return schemeName;
    }

    public valueOf setOnFocusChangeListener() {
        int i = addParam + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setScrollContainer setscrollcontainer = setScrollContainer.ThreeDS2Service;
            int i2 = addParam + 73;
            apiKey = i2 % 128;
            if (i2 % 2 != 0) {
                return setscrollcontainer;
            }
            throw null;
        }
        setScrollContainer setscrollcontainer2 = setScrollContainer.ThreeDS2Service;
        throw null;
    }

    public valueOf setOnScrollChangeListener() {
        int i = addParam + 7;
        apiKey = i % 128;
        if (i % 2 != 0) {
            setDrawingCacheQuality setdrawingcachequality = setDrawingCacheQuality.valueOf;
            addParam = (apiKey + 85) % 128;
            return setdrawingcachequality;
        }
        setDrawingCacheQuality setdrawingcachequality2 = setDrawingCacheQuality.valueOf;
        throw null;
    }

    public valueOf setParameter() {
        setOnCreateContextMenuListener setoncreatecontextmenulistener = new setOnCreateContextMenuListener(this);
        apiKey = (addParam + 93) % 128;
        return setoncreatecontextmenulistener;
    }

    public valueOf setProgressViewBackgroundColor() {
        setOnScrollChangeListener setonscrollchangelistener = new setOnScrollChangeListener(this);
        int i = addParam + 77;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setonscrollchangelistener;
        }
        throw null;
    }

    public valueOf setScrollIndicators() {
        apiKey = (addParam + 105) % 128;
        setAccessibilityDelegate setaccessibilitydelegate = setAccessibilityDelegate.get;
        int i = apiKey + 71;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setaccessibilitydelegate;
        }
        throw null;
    }

    public valueOf setTextBoxCustomization() {
        getKeyInfoConverter getkeyinfoconverter = new getKeyInfoConverter(this);
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
        return getkeyinfoconverter;
    }

    public valueOf setTextColor() {
        getButtonCustomization getbuttoncustomization = new getButtonCustomization(this);
        apiKey = (addParam + 95) % 128;
        return getbuttoncustomization;
    }

    public valueOf setTextFontName() {
        apiKey = (addParam + 59) % 128;
        valueOf apiKey2 = apiKey(setHorizontalScrollBarEnabled.get);
        addParam = (apiKey + 45) % 128;
        return apiKey2;
    }

    public valueOf setTextFontSize() {
        int i = apiKey + 3;
        addParam = i % 128;
        if (i % 2 == 0) {
            return addParam(setHorizontalScrollBarEnabled.get);
        }
        addParam(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf setToolbarCustomization() {
        addParam = (apiKey + 107) % 128;
        valueOf amexConfiguration = amexConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        addParam = (apiKey + 47) % 128;
        return amexConfiguration;
    }

    public valueOf setVerticalScrollbarThumbDrawable() {
        valueOf visaSchemeConfiguration;
        int i = apiKey + 51;
        addParam = i % 128;
        if (i % 2 != 0) {
            visaSchemeConfiguration = visaSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            int i2 = 98 / 0;
        } else {
            visaSchemeConfiguration = visaSchemeConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        int i3 = addParam + 101;
        apiKey = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 86 / 0;
        }
        return visaSchemeConfiguration;
    }

    public valueOf setVerticalScrollbarTrackDrawable() {
        apiKey = (addParam + CameraActivity.REQUEST_CODE) % 128;
        valueOf cbConfiguration = cbConfiguration(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        addParam = (apiKey + 63) % 128;
        return cbConfiguration;
    }

    public valueOf setViewCustomization() {
        openContextMenu opencontextmenu = new openContextMenu(this);
        apiKey = (addParam + 37) % 128;
        return opencontextmenu;
    }

    public valueOf showProgress() {
        valueOf ConfigParameters;
        int i = addParam + 3;
        apiKey = i % 128;
        if (i % 2 == 0) {
            ConfigParameters = ConfigParameters(setHorizontalScrollBarEnabled.get);
            int i2 = 40 / 0;
        } else {
            ConfigParameters = ConfigParameters(setHorizontalScrollBarEnabled.get);
        }
        apiKey = (addParam + 101) % 128;
        return ConfigParameters;
    }

    public valueOf supportDarkMode() {
        int i = apiKey + 47;
        addParam = i % 128;
        if (i % 2 == 0) {
            valueOf jcbConfiguration = jcbConfiguration(setHorizontalScrollBarEnabled.get);
            int i2 = apiKey + 77;
            addParam = i2 % 128;
            if (i2 % 2 == 0) {
                return jcbConfiguration;
            }
            throw null;
        }
        jcbConfiguration(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf unregisterForContextMenu() {
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 != 0) {
            valueOf unionSchemeConfiguration = unionSchemeConfiguration(setHovered.ThreeDS2Service);
            apiKey = (addParam + CameraActivity.REQUEST_CODE) % 128;
            return unionSchemeConfiguration;
        }
        unionSchemeConfiguration(setHovered.ThreeDS2Service);
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ConfigParameters(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 105;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.getCertPrefix(threeDS2Service);
            throw null;
        }
        getHeadingTextColor certPrefix = setdarktextcolor.getCertPrefix(threeDS2Service);
        addParam = (apiKey + 15) % 128;
        return certPrefix;
    }

    public static /* synthetic */ getHeadingTextColor ConfigurationBuilder(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 7) % 128;
        getHeadingTextColor name = setdarktextcolor.getName(threeDS2Service);
        int i = addParam + CameraActivity.REQUEST_CODE;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return name;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor SchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 33) % 128;
        getHeadingTextColor expiryDate = setdarktextcolor.getExpiryDate(threeDS2Service);
        int i = apiKey + 81;
        addParam = i % 128;
        if (i % 2 == 0) {
            return expiryDate;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        return com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        r6 = r6.values(java.lang.Boolean.valueOf(r5.getSDKInfo.is5GHzBandSupported()));
        r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey + 101;
        com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        if ((r0 % 2) == 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((!r1.ThreeDS2Service(r3)) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r5.onCompleted.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor SchemeInfo(com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.ThreeDS2Service r6) {
        /*
            r5 = this;
            r0 = 1
            int r1 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L1e
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r5.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r3 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r2]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r4 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf
            r3[r0] = r4
            boolean r1 = r1.ThreeDS2Service(r3)
            r1 = r1 ^ r0
            if (r1 == r0) goto L31
            goto L2c
        L1e:
            com.netcetera.threeds.sdk.infrastructure.setSmoothScrollbarEnabled r1 = r5.onCompleted
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[] r0 = new com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle[r0]
            com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle r3 = com.netcetera.threeds.sdk.infrastructure.setFastScrollStyle.valueOf
            r0[r2] = r3
            boolean r0 = r1.ThreeDS2Service(r0)
            if (r0 == 0) goto L31
        L2c:
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r6 = com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor.ThreeDS2ServiceInstance()
            return r6
        L31:
            android.net.wifi.WifiManager r0 = r5.getSDKInfo
            boolean r0 = r0.is5GHzBandSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor r6 = r6.values(r0)
            int r0 = com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.apiKey
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.addParam = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L4e
            r0 = 46
            int r0 = r0 / r2
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setDarkTextColor.SchemeInfo(com.netcetera.threeds.sdk.infrastructure.setDarkTextColor$ThreeDS2Service):com.netcetera.threeds.sdk.infrastructure.getHeadingTextColor");
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2Service(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 115) % 128;
        getHeadingTextColor licenseExpiryDate = setdarktextcolor.getLicenseExpiryDate(threeDS2Service);
        int i = apiKey + 41;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
        return licenseExpiryDate;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2Service$InitializationCallback(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 125) % 128;
        getHeadingTextColor SchemeInfo = setdarktextcolor.SchemeInfo(threeDS2Service);
        int i = apiKey + 125;
        addParam = i % 128;
        if (i % 2 == 0) {
            return SchemeInfo;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2ServiceInstance(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 53;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.CertificateInfo$CertificateType(threeDS2Service);
            throw null;
        }
        getHeadingTextColor CertificateInfo$CertificateType = setdarktextcolor.CertificateInfo$CertificateType(threeDS2Service);
        int i2 = apiKey + 67;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return CertificateInfo$CertificateType;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor addParam(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 25;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor setdarktextcolor2 = setdarktextcolor.toString(threeDS2Service);
        if (i2 != 0) {
            int i3 = 72 / 0;
        }
        int i4 = apiKey + 115;
        addParam = i4 % 128;
        if (i4 % 2 == 0) {
            return setdarktextcolor2;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor amexConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 17;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.logoDark(threeDS2Service);
            throw null;
        }
        getHeadingTextColor logoDark = setdarktextcolor.logoDark(threeDS2Service);
        addParam = (apiKey + 59) % 128;
        return logoDark;
    }

    public static /* synthetic */ getHeadingTextColor apiKey(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 93;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdarktextcolor.getSchemePublicRootKeys(threeDS2Service);
            throw null;
        }
        getHeadingTextColor schemePublicRootKeys = setdarktextcolor.getSchemePublicRootKeys(threeDS2Service);
        apiKey = (addParam + 61) % 128;
        return schemePublicRootKeys;
    }

    public static /* synthetic */ getHeadingTextColor build(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.getRootCertificates(threeDS2Service);
        }
        setdarktextcolor.getRootCertificates(threeDS2Service);
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor cleanup(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 119) % 128;
        getHeadingTextColor rootPublicKey = setdarktextcolor.rootPublicKey(threeDS2Service);
        int i = addParam + 117;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return rootPublicKey;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor configureScheme(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 121;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.rootPublicKeyFromAssetCertificate(threeDS2Service);
        }
        setdarktextcolor.rootPublicKeyFromAssetCertificate(threeDS2Service);
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor createTransaction(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 17;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.InvalidInputException(threeDS2Service);
            throw null;
        }
        getHeadingTextColor InvalidInputException = setdarktextcolor.InvalidInputException(threeDS2Service);
        apiKey = (addParam + 63) % 128;
        return InvalidInputException;
    }

    public static /* synthetic */ getHeadingTextColor dinersSchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + CameraActivity.REQUEST_CODE) % 128;
        getHeadingTextColor SDKAlreadyInitializedException = setdarktextcolor.SDKAlreadyInitializedException(threeDS2Service);
        apiKey = (addParam + 19) % 128;
        return SDKAlreadyInitializedException;
    }

    public static /* synthetic */ getHeadingTextColor get(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + CameraActivity.REQUEST_CODE) % 128;
        getHeadingTextColor SDKNotInitializedException = setdarktextcolor.SDKNotInitializedException(threeDS2Service);
        int i = addParam + 57;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return SDKNotInitializedException;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor getParamValue(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 95) % 128;
        getHeadingTextColor eftposConfiguration = setdarktextcolor.eftposConfiguration(threeDS2Service);
        addParam = (apiKey + 39) % 128;
        return eftposConfiguration;
    }

    public static /* synthetic */ getHeadingTextColor getSDKInfo(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 57;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdarktextcolor.getErrorCode(threeDS2Service);
            throw null;
        }
        getHeadingTextColor errorCode = setdarktextcolor.getErrorCode(threeDS2Service);
        apiKey = (addParam + 9) % 128;
        return errorCode;
    }

    public static /* synthetic */ getHeadingTextColor getSDKVersion(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 73;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor type = setdarktextcolor.getType(threeDS2Service);
        if (i2 == 0) {
            int i3 = 58 / 0;
        }
        return type;
    }

    public static /* synthetic */ getHeadingTextColor getSchemeName(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 5) % 128;
        getHeadingTextColor schemeLogoDark = setdarktextcolor.getSchemeLogoDark(threeDS2Service);
        addParam = (apiKey + 71) % 128;
        return schemeLogoDark;
    }

    public static /* synthetic */ getHeadingTextColor getWarnings(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 85;
        apiKey = i % 128;
        int i2 = i % 2;
        getHeadingTextColor CertificateInfo = setdarktextcolor.CertificateInfo(threeDS2Service);
        if (i2 == 0) {
            int i3 = 48 / 0;
        }
        apiKey = (addParam + 37) % 128;
        return CertificateInfo;
    }

    public static /* synthetic */ getHeadingTextColor initialize(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 41;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.newSchemeConfiguration(threeDS2Service);
        }
        setdarktextcolor.newSchemeConfiguration(threeDS2Service);
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor jcbConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 55) % 128;
        getHeadingTextColor SDKInfo = setdarktextcolor.SDKInfo(threeDS2Service);
        addParam = (apiKey + 17) % 128;
        return SDKInfo;
    }

    public static /* synthetic */ getHeadingTextColor mastercardSchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 33) % 128;
        getHeadingTextColor encryptionPublicKey = setdarktextcolor.encryptionPublicKey(threeDS2Service);
        apiKey = (addParam + 49) % 128;
        return encryptionPublicKey;
    }

    public static /* synthetic */ getHeadingTextColor newSchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = addParam + 13;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor.getSchemeLogo(threeDS2Service);
        }
        setdarktextcolor.getSchemeLogo(threeDS2Service);
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor onCompleted(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 37) % 128;
        getHeadingTextColor schemeEncryptionPublicKeyId = setdarktextcolor.getSchemeEncryptionPublicKeyId(threeDS2Service);
        apiKey = (addParam + 79) % 128;
        return schemeEncryptionPublicKeyId;
    }

    public static /* synthetic */ getHeadingTextColor onError(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 29;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor schemeId = setdarktextcolor.getSchemeId(threeDS2Service);
        if (i2 != 0) {
            int i3 = 1 / 0;
        }
        return schemeId;
    }

    public static /* synthetic */ getHeadingTextColor removeParam(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 81;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor logo = setdarktextcolor.logo(threeDS2Service);
        if (i2 != 0) {
            int i3 = 55 / 0;
        }
        return logo;
    }

    public static /* synthetic */ getHeadingTextColor restrictedParameters(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        int i = apiKey + 17;
        addParam = i % 128;
        int i2 = i % 2;
        getHeadingTextColor ids = setdarktextcolor.ids(threeDS2Service);
        if (i2 != 0) {
            int i3 = 5 / 0;
        }
        int i4 = addParam + 59;
        apiKey = i4 % 128;
        if (i4 % 2 != 0) {
            return ids;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor toString(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 87) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (TextUtils.getTrimmedLength("") + 39796), 764 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - KeyEvent.getDeadChar(0, 0), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = addParam + 73;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor unionSchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 101) % 128;
        getHeadingTextColor schemeEncryptionPublicKey = setdarktextcolor.getSchemeEncryptionPublicKey(threeDS2Service);
        int i = addParam + 35;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return schemeEncryptionPublicKey;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor valueOf(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 43) % 128;
        getHeadingTextColor SchemeConfiguration$Builder = setdarktextcolor.SchemeConfiguration$Builder(threeDS2Service);
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 == 0) {
            return SchemeConfiguration$Builder;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor values(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 39) % 128;
        getHeadingTextColor encryptionPublicKeyFromAssetCertificate = setdarktextcolor.encryptionPublicKeyFromAssetCertificate(threeDS2Service);
        int i = apiKey + 7;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
        return encryptionPublicKeyFromAssetCertificate;
    }

    public static /* synthetic */ getHeadingTextColor visaSchemeConfiguration(setDarkTextColor setdarktextcolor, ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 99) % 128;
        getHeadingTextColor SDKRuntimeException = setdarktextcolor.SDKRuntimeException(threeDS2Service);
        int i = addParam + CameraActivity.REQUEST_CODE;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return SDKRuntimeException;
        }
        throw null;
    }

    public valueOf AuthenticationRequestParameters() {
        int i = apiKey + 75;
        addParam = i % 128;
        if (i % 2 != 0) {
            setElevation setelevation = setElevation.values;
            throw null;
        }
        setElevation setelevation2 = setElevation.values;
        apiKey = (addParam + 107) % 128;
        return setelevation2;
    }

    public valueOf CertificateInfo() {
        setTouchDelegate settouchdelegate = new setTouchDelegate(this);
        apiKey = (addParam + 45) % 128;
        return settouchdelegate;
    }

    @SuppressLint({"HardwareIds"})
    public valueOf CertificateInfo$CertificateType() {
        setScrollX setscrollx = new setScrollX(this);
        apiKey = (addParam + 107) % 128;
        return setscrollx;
    }

    public valueOf ChallengeParameters() {
        setScrollbarFadingEnabled setscrollbarfadingenabled = new setScrollbarFadingEnabled(this);
        int i = addParam + 95;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
        return setscrollbarfadingenabled;
    }

    public valueOf ChallengeStatusReceiver() {
        setScrollBarStyle setscrollbarstyle = new setScrollBarStyle(this);
        int i = apiKey + 39;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setscrollbarstyle;
        }
        throw null;
    }

    public valueOf InvalidInputException() {
        setDefaultFocusHighlightEnabled setdefaultfocushighlightenabled = new setDefaultFocusHighlightEnabled(this);
        apiKey = (addParam + 27) % 128;
        return setdefaultfocushighlightenabled;
    }

    public valueOf SDKAlreadyInitializedException() {
        setTransitionVisibility settransitionvisibility = new setTransitionVisibility(this);
        apiKey = (addParam + 19) % 128;
        return settransitionvisibility;
    }

    public valueOf SDKInfo() {
        apiKey = (addParam + 95) % 128;
        setForceDarkAllowed setforcedarkallowed = setForceDarkAllowed.ThreeDS2ServiceInstance;
        addParam = (apiKey + 77) % 128;
        return setforcedarkallowed;
    }

    public valueOf SDKNotInitializedException() {
        setImportantForAccessibility setimportantforaccessibility = new setImportantForAccessibility(this);
        addParam = (apiKey + 25) % 128;
        return setimportantforaccessibility;
    }

    public valueOf SDKRuntimeException() {
        setScrollY setscrolly = new setScrollY(this);
        addParam = (apiKey + 19) % 128;
        return setscrolly;
    }

    public valueOf SchemeConfiguration$Builder() {
        setSaveFromParentEnabled setsavefromparentenabled = new setSaveFromParentEnabled(this);
        int i = addParam + 87;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 41 / 0;
        }
        return setsavefromparentenabled;
    }

    public valueOf Severity() {
        int i = addParam + 79;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setRight setright = setRight.get;
            throw null;
        }
        setRight setright2 = setRight.get;
        apiKey = (addParam + 27) % 128;
        return setright2;
    }

    public valueOf Transaction() {
        apiKey = (addParam + 105) % 128;
        setOutlineAmbientShadowColor setoutlineambientshadowcolor = setOutlineAmbientShadowColor.get;
        int i = addParam + 69;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
        return setoutlineambientshadowcolor;
    }

    public valueOf Transaction$BridgingMessageExtensionVersion() {
        setScrollBarSize setscrollbarsize = new setScrollBarSize(this);
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
        return setscrollbarsize;
    }

    public valueOf Warning() {
        apiKey = (addParam + 61) % 128;
        setBottom setbottom = setBottom.ThreeDS2Service;
        int i = apiKey + 93;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setbottom;
        }
        throw null;
    }

    public valueOf cancelled() {
        setHeadingTextFontSize setheadingtextfontsize = new setHeadingTextFontSize(this);
        apiKey = (addParam + 109) % 128;
        return setheadingtextfontsize;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public valueOf cbConfiguration() {
        setAutofillHints setautofillhints = new setAutofillHints(this);
        addParam = (apiKey + 91) % 128;
        return setautofillhints;
    }

    public valueOf close() {
        int i = addParam + 117;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values(setHorizontalScrollBarEnabled.get);
        }
        values(setHorizontalScrollBarEnabled.get);
        throw null;
    }

    public valueOf completed() {
        apiKey = (addParam + 59) % 128;
        valueOf initialize = initialize(setHorizontalScrollBarEnabled.get);
        int i = addParam + 59;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return initialize;
        }
        throw null;
    }

    public valueOf doChallenge() {
        apiKey = (addParam + 51) % 128;
        valueOf valueOf2 = valueOf(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = apiKey + 29;
        addParam = i % 128;
        if (i % 2 == 0) {
            return valueOf2;
        }
        throw null;
    }

    public valueOf eftposConfiguration() {
        setLayoutDirection setlayoutdirection = new setLayoutDirection(this);
        apiKey = (addParam + 37) % 128;
        return setlayoutdirection;
    }

    public valueOf encryptionPublicKey() {
        setAccessibilityHeading setaccessibilityheading = new setAccessibilityHeading(this);
        addParam = (apiKey + 99) % 128;
        return setaccessibilityheading;
    }

    public valueOf encryptionPublicKeyFromAssetCertificate() {
        int i = apiKey + 37;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
            return get(setHovered.ThreeDS2Service);
        }
        return get(setHovered.ThreeDS2Service);
    }

    public valueOf get3DSServerTransactionID() {
        apiKey = (addParam + 93) % 128;
        valueOf ThreeDS2Service2 = ThreeDS2Service(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 65;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    public valueOf getAcsRefNumber() {
        setLeftTopRightBottom setlefttoprightbottom = new setLeftTopRightBottom(this);
        int i = apiKey + 41;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
        return setlefttoprightbottom;
    }

    public valueOf getAcsSignedContent() {
        setLayerType setlayertype = new setLayerType(this);
        apiKey = (addParam + 25) % 128;
        return setlayertype;
    }

    public valueOf getAcsTransactionID() {
        addParam = (apiKey + 125) % 128;
        valueOf cleanup = cleanup(setHorizontalScrollBarEnabled.get);
        int i = addParam + 7;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return cleanup;
        }
        throw null;
    }

    public valueOf getAuthenticationRequestParameters() {
        int i = apiKey + 109;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        ThreeDS2ServiceInstance(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        throw null;
    }

    public valueOf getCertPrefix() {
        setCameraDistance setcameradistance = new setCameraDistance(this);
        apiKey = (addParam + 85) % 128;
        return setcameradistance;
    }

    public valueOf getDeviceData() {
        setZ setz;
        int i = apiKey + 103;
        addParam = i % 128;
        if (i % 2 != 0) {
            setz = setZ.values;
            int i2 = 38 / 0;
        } else {
            setz = setZ.values;
        }
        apiKey = (addParam + 107) % 128;
        return setz;
    }

    public valueOf getEncryptionCertificate() {
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 != 0) {
            setX setx = setX.valueOf;
            throw null;
        }
        setX setx2 = setX.valueOf;
        int i2 = apiKey + 31;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 42 / 0;
        }
        return setx2;
    }

    public valueOf getEncryptionCertificateKid() {
        setAlpha setalpha;
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 != 0) {
            setalpha = setAlpha.get;
            int i2 = 70 / 0;
        } else {
            setalpha = setAlpha.get;
        }
        int i3 = apiKey + 75;
        addParam = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return setalpha;
    }

    public valueOf getErrorCode() {
        setAccessibilityDataSensitive setaccessibilitydatasensitive = new setAccessibilityDataSensitive(this);
        addParam = (apiKey + 107) % 128;
        return setaccessibilitydatasensitive;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getExpiryDate() {
        setRotationX setrotationx = new setRotationX(this);
        int i = apiKey + 109;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setrotationx;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public valueOf getId() {
        setLeft setleft = new setLeft(this);
        int i = addParam + 75;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setleft;
        }
        throw null;
    }

    public valueOf getIds() {
        setPivotY setpivoty;
        int i = addParam + 43;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setpivoty = setPivotY.get;
            int i2 = 24 / 0;
        } else {
            setpivoty = setPivotY.get;
        }
        int i3 = apiKey + 33;
        addParam = i3 % 128;
        if (i3 % 2 == 0) {
            return setpivoty;
        }
        throw null;
    }

    public valueOf getLicenseExpiryDate() {
        apiKey = (addParam + 121) % 128;
        setTransitionAlpha settransitionalpha = setTransitionAlpha.ThreeDS2Service;
        int i = addParam + 5;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return settransitionalpha;
        }
        throw null;
    }

    public valueOf getMessage() {
        int i = addParam + 89;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setTranslationX settranslationx = setTranslationX.ThreeDS2ServiceInstance;
            throw null;
        }
        setTranslationX settranslationx2 = setTranslationX.ThreeDS2ServiceInstance;
        int i2 = apiKey + 47;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return settranslationx2;
    }

    public valueOf getMessageVersion() {
        int i = apiKey + 71;
        addParam = i % 128;
        if (i % 2 != 0) {
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.valueOf;
            throw null;
        }
        setAnimationMatrix setanimationmatrix2 = setAnimationMatrix.valueOf;
        int i2 = addParam + 29;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return setanimationmatrix2;
        }
        throw null;
    }

    public valueOf getName() {
        int i = addParam + 95;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setPivotX.ThreeDS2ServiceInstance;
        }
        setPivotX setpivotx = setPivotX.ThreeDS2ServiceInstance;
        throw null;
    }

    public valueOf getProgressView() {
        apiKey = (addParam + 49) % 128;
        valueOf valueOf2 = valueOf(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 73 / 0;
        }
        return valueOf2;
    }

    public valueOf getRootCertificates() {
        apiKey = (addParam + 57) % 128;
        setScaleX setscalex = setScaleX.valueOf;
        apiKey = (addParam + 5) % 128;
        return setscalex;
    }

    public valueOf getSDKAppID() {
        apiKey = (addParam + 105) % 128;
        setOutlineProvider setoutlineprovider = setOutlineProvider.ThreeDS2ServiceInstance;
        int i = addParam + 107;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setoutlineprovider;
        }
        throw null;
    }

    public valueOf getSDKEphemeralPublicKey() {
        addParam = (apiKey + 13) % 128;
        setStateListAnimator setstatelistanimator = setStateListAnimator.values;
        apiKey = (addParam + 15) % 128;
        return setstatelistanimator;
    }

    public valueOf getSDKReferenceNumber() {
        int i = addParam + 49;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setClipToOutline setcliptooutline = setClipToOutline.valueOf;
            throw null;
        }
        setClipToOutline setcliptooutline2 = setClipToOutline.valueOf;
        int i2 = addParam + 121;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return setcliptooutline2;
        }
        throw null;
    }

    public valueOf getSDKTransactionID() {
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setTranslationZ.values;
        }
        setTranslationZ settranslationz = setTranslationZ.values;
        throw null;
    }

    public valueOf getSchemeConfigurations() {
        int i = addParam + 71;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setTop.valueOf;
        }
        setTop settop = setTop.valueOf;
        throw null;
    }

    public valueOf getSchemeEncryptionPublicKey() {
        setPressed setpressed = new setPressed(this);
        addParam = (apiKey + 25) % 128;
        return setpressed;
    }

    public valueOf getSchemeEncryptionPublicKeyId() {
        setWillNotCacheDrawing setwillnotcachedrawing = new setWillNotCacheDrawing(this);
        addParam = (apiKey + 57) % 128;
        return setwillnotcachedrawing;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getSchemeId() {
        setSoundEffectsEnabled setsoundeffectsenabled = new setSoundEffectsEnabled(this);
        int i = addParam + 9;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setsoundeffectsenabled;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getSchemeLogo() {
        setWillNotDraw setwillnotdraw = new setWillNotDraw(this);
        addParam = (apiKey + 89) % 128;
        return setwillnotdraw;
    }

    public valueOf getSchemeLogoDark() {
        setClickable setclickable = new setClickable(this);
        int i = addParam + 29;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setclickable;
        }
        throw null;
    }

    public valueOf getSchemePublicRootKeys() {
        setLongClickable setlongclickable = new setLongClickable(this);
        addParam = (apiKey + 41) % 128;
        return setlongclickable;
    }

    public valueOf getSeverity() {
        addParam = (apiKey + 105) % 128;
        setTranslationY settranslationy = setTranslationY.valueOf;
        addParam = (apiKey + 53) % 128;
        return settranslationy;
    }

    public valueOf getThreeDSRequestorAppURL() {
        setBackgroundResource setbackgroundresource = new setBackgroundResource(this);
        int i = addParam + 65;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setbackgroundresource;
        }
        throw null;
    }

    public valueOf getType() {
        setScaleY setscaley = new setScaleY(this);
        int i = addParam + 7;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 60 / 0;
        }
        return setscaley;
    }

    public valueOf getValue() {
        addParam = (apiKey + 67) % 128;
        valueOf values2 = values(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = apiKey + 69;
        addParam = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    public valueOf ids() {
        setContextClickable setcontextclickable = new setContextClickable(this);
        apiKey = (addParam + 13) % 128;
        return setcontextclickable;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf logo() {
        setFilterTouchesWhenObscured setfiltertoucheswhenobscured = new setFilterTouchesWhenObscured(this);
        int i = apiKey + 67;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
        return setfiltertoucheswhenobscured;
    }

    public valueOf logoDark() {
        setSaveEnabled setsaveenabled = new setSaveEnabled(this);
        addParam = (apiKey + 63) % 128;
        return setsaveenabled;
    }

    public valueOf rootPublicKey() {
        int i = apiKey + 45;
        addParam = i % 128;
        if (i % 2 == 0) {
            return get(setFocusedByDefault.ThreeDS2Service);
        }
        get(setFocusedByDefault.ThreeDS2Service);
        throw null;
    }

    public valueOf rootPublicKeyFromAssetCertificate() {
        setScreenReaderFocusable setscreenreaderfocusable = new setScreenReaderFocusable(this);
        addParam = (apiKey + 23) % 128;
        return setscreenreaderfocusable;
    }

    public valueOf runtimeError() {
        apiKey = (addParam + 23) % 128;
        valueOf initialize = initialize(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i = addParam + 109;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return initialize;
    }

    public valueOf set3DSServerTransactionID() {
        int i = apiKey + 19;
        addParam = i % 128;
        if (i % 2 != 0) {
            ThreeDS2ServiceInstance(setHorizontalScrollBarEnabled.get);
            throw null;
        }
        valueOf ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(setHorizontalScrollBarEnabled.get);
        int i2 = apiKey + 35;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public valueOf setAcsRefNumber() {
        apiKey = (addParam + 15) % 128;
        valueOf cleanup = cleanup(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        apiKey = (addParam + 95) % 128;
        return cleanup;
    }

    public valueOf setAcsSignedContent() {
        addParam = (apiKey + 107) % 128;
        valueOf sDKVersion = getSDKVersion(setHorizontalScrollBarEnabled.get);
        int i = apiKey + 43;
        addParam = i % 128;
        if (i % 2 == 0) {
            return sDKVersion;
        }
        throw null;
    }

    public valueOf setAcsTransactionID() {
        int i = addParam + 69;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 46 / 0;
            return ThreeDS2Service(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        }
        return ThreeDS2Service(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
    }

    public valueOf setThreeDSRequestorAppURL() {
        int i = apiKey + 81;
        addParam = i % 128;
        if (i % 2 != 0) {
            getSDKVersion(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
            throw null;
        }
        valueOf sDKVersion = getSDKVersion(setVerticalFadingEdgeEnabled.ThreeDS2ServiceInstance);
        int i2 = addParam + 113;
        apiKey = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
        return sDKVersion;
    }

    public valueOf timedout() {
        setClipBounds setclipbounds = new setClipBounds(this);
        int i = addParam + 61;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return setclipbounds;
    }

    public valueOf useBridgingExtension() {
        int i = addParam + 87;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setLayoutParams.valueOf;
        }
        setLayoutParams setlayoutparams = setLayoutParams.valueOf;
        throw null;
    }

    private /* synthetic */ getHeadingTextColor CertificateInfo(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 43) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 587, (ViewConfiguration.getScrollBarSize() >> 8) + 24, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor CertificateInfo$CertificateType(ThreeDS2Service threeDS2Service) {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) View.combineMeasuredStates(1, 0), 2188 / (ViewConfiguration.getMaximumDrawingCacheSize() >> 31), 2 / TextUtils.indexOf("", "", 0), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) View.combineMeasuredStates(0, 0), 1032 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 18 - TextUtils.indexOf("", "", 0), objArr2);
            obj = objArr2[0];
        }
        return threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor InvalidInputException(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 81) % 128;
        if (Build.VERSION.SDK_INT >= 23) {
            apiKey = (addParam + 35) % 128;
            setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) (KeyEvent.normalizeMetaState(0) + 28362), (-16776804) - Color.rgb(0, 0, 0), 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
            addParam = (apiKey + 89) % 128;
            return values2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor SDKAlreadyInitializedException(ThreeDS2Service threeDS2Service) {
        int i = apiKey + 117;
        addParam = i % 128;
        if (i % 2 == 0 ? Build.VERSION.SDK_INT < 26 : Build.VERSION.SDK_INT < 68) {
            int i2 = addParam + 71;
            apiKey = i2 % 128;
            if (i2 % 2 == 0) {
                setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
                Object[] objArr = new Object[1];
                values((char) (33411 >>> TextUtils.indexOf("", "", 0, 1)), 5050 - AndroidCharacter.getMirror('='), 104 / KeyEvent.normalizeMetaState(0), objArr);
                return threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
            }
            setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor2 = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (TextUtils.indexOf("", "", 0, 0) + 33411), AndroidCharacter.getMirror('0') + 469, KeyEvent.normalizeMetaState(0) + 39, objArr2);
            return threeDS2Service.values(setdrawingcachebackgroundcolor2.ThreeDS2Service(((String) objArr2[0]).intern()));
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor SDKInfo(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 107) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1133, 21 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        apiKey = (addParam + 91) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor SDKNotInitializedException(ThreeDS2Service threeDS2Service) {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = addParam + 25;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), 32352 / KeyEvent.getDeadChar(0, 0), 45 >>> (Process.myTid() * 22), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 718 - KeyEvent.getDeadChar(0, 0), (Process.myTid() >> 22) + 14, objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
        apiKey = (addParam + 87) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor SDKRuntimeException(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 117) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) KeyEvent.normalizeMetaState(0), 690 - View.resolveSizeAndState(0, 0, 0), KeyEvent.keyCodeFromString("") + 28, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        int i = addParam + 75;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor SchemeConfiguration$Builder(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 89) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 263 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.argb(0, 0, 0, 0) + 22, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = addParam + 53;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    public static /* synthetic */ getHeadingTextColor ThreeDS2Service(setDarkTextColor setdarktextcolor, setFastScrollEnabled.valueOf valueof) {
        int i = apiKey + 119;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setdarktextcolor.ThreeDS2Service(valueof);
        }
        setdarktextcolor.ThreeDS2Service(valueof);
        throw null;
    }

    public static /* synthetic */ String ThreeDS2ServiceInstance(WifiInfo wifiInfo) {
        apiKey = (addParam + 45) % 128;
        String ThreeDS2Service2 = ThreeDS2Service(wifiInfo);
        int i = addParam + 87;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private valueOf cbConfiguration(ThreeDS2Service<String> threeDS2Service) {
        setStateDescription setstatedescription = new setStateDescription(this, threeDS2Service);
        int i = addParam + 119;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
        return setstatedescription;
    }

    private /* synthetic */ getHeadingTextColor eftposConfiguration(ThreeDS2Service threeDS2Service) {
        int i = addParam + 11;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT >= 28 : Build.VERSION.SDK_INT >= 61) {
            setBackground setbackground = this.getParamValue;
            Object[] objArr = new Object[1];
            values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 107 - (ViewConfiguration.getTouchSlop() >> 8), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
            getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
            addParam = (apiKey + 25) % 128;
            return values2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor encryptionPublicKey(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 35) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (64580 - KeyEvent.getDeadChar(0, 0)), 215 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 9, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        apiKey = (addParam + 115) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor encryptionPublicKeyFromAssetCertificate(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 79) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) KeyEvent.normalizeMetaState(0), 556 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - MotionEvent.axisFromString(""), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        apiKey = (addParam + 97) % 128;
        return values2;
    }

    public static /* synthetic */ getHeadingTextColor get(String str) {
        apiKey = (addParam + 75) % 128;
        getHeadingTextColor ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(str);
        int i = apiKey + 1;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 86 / 0;
        }
        return ThreeDS2ServiceInstance;
    }

    private /* synthetic */ getHeadingTextColor getCertPrefix(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 25) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (Color.alpha(0) + 4760), ExpandableListView.getPackedPositionChild(0L) + 1071, KeyEvent.getDeadChar(0, 0) + 12, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        apiKey = (addParam + 97) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor getErrorCode(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 23) % 128;
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
        Object[] objArr = new Object[1];
        values((char) (2219 - (Process.myPid() >> 22)), 731 - MotionEvent.axisFromString(""), 9 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
        apiKey = (addParam + 99) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor getExpiryDate(ThreeDS2Service threeDS2Service) {
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor;
        Object obj;
        int i = apiKey + 61;
        addParam = i % 128;
        if (i % 2 != 0) {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr = new Object[1];
            values((char) (ViewConfiguration.getJumpTapTimeout() >>> 118), 14436 >> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 59 % ExpandableListView.getPackedPositionChild(0L), objArr);
            obj = objArr[0];
        } else {
            setdrawingcachebackgroundcolor = this.onError;
            Object[] objArr2 = new Object[1];
            values((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 809 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 12, objArr2);
            obj = objArr2[0];
        }
        return threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor getLicenseExpiryDate(ThreeDS2Service threeDS2Service) {
        int i = apiKey + 105;
        addParam = i % 128;
        if (i % 2 != 0) {
            setBackground setbackground = this.getParamValue;
            Object[] objArr = new Object[1];
            values((char) (ViewConfiguration.getDoubleTapTimeout() >> 125), 27897 >> ImageFormat.getBitsPerPixel(0), 74 >>> (Process.getThreadPriority(1) >>> 99), objArr);
            return threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        }
        setBackground setbackground2 = this.getParamValue;
        Object[] objArr2 = new Object[1];
        values((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1153 - ImageFormat.getBitsPerPixel(0), 39 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
        return threeDS2Service.values(setbackground2.ThreeDS2ServiceInstance(((String) objArr2[0]).intern()));
    }

    private /* synthetic */ getHeadingTextColor getName(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 85) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 51838), TextUtils.getCapsMode("", 0, 0) + 915, ExpandableListView.getPackedPositionChild(0L) + 21, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        apiKey = (addParam + 33) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor getRootCertificates(ThreeDS2Service threeDS2Service) {
        if (Build.VERSION.SDK_INT > 25) {
            getHeadingTextColor valueOf2 = getHeadingTextColor.valueOf();
            apiKey = (addParam + 39) % 128;
            return valueOf2;
        }
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), Color.green(0) + 1119, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        int i = apiKey + 85;
        addParam = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor getSchemeEncryptionPublicKey(ThreeDS2Service threeDS2Service) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 33) {
            return getHeadingTextColor.valueOf();
        }
        apiKey = (addParam + 91) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + CameraActivity.REQUEST_CODE, 20 - View.combineMeasuredStates(0, 0), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i2 = addParam + 117;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor getSchemeEncryptionPublicKeyId(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 91) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) Color.green(0), 176 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 13, objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = apiKey + 29;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
        return values2;
    }

    private /* synthetic */ getHeadingTextColor getSchemeId(ThreeDS2Service threeDS2Service) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = apiKey + 103;
            addParam = i2 % 128;
            if (i2 % 2 == 0 ? i <= 34 : i <= 118) {
                setBackground setbackground = this.getParamValue;
                Object[] objArr = new Object[1];
                values((char) (50460 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 92 - View.MeasureSpec.getMode(0), 14 - Process.getGidForName(""), objArr);
                getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
                int i3 = addParam + 69;
                apiKey = i3 % 128;
                if (i3 % 2 != 0) {
                    return values2;
                }
                throw null;
            }
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor getSchemeLogo(ThreeDS2Service threeDS2Service) {
        boolean is6GHzBandSupported;
        int i = addParam + 17;
        apiKey = i % 128;
        if (i % 2 != 0 ? Build.VERSION.SDK_INT >= 30 : Build.VERSION.SDK_INT >= 72) {
            is6GHzBandSupported = this.getSDKInfo.is6GHzBandSupported();
            getHeadingTextColor values2 = threeDS2Service.values(Boolean.valueOf(is6GHzBandSupported));
            addParam = (apiKey + 65) % 128;
            return values2;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor getSchemeLogoDark(ThreeDS2Service threeDS2Service) {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = addParam + 15;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) (TextUtils.indexOf((CharSequence) "", 'H') * (-1)), 13199 >>> Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 28, objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.red(0) + 143, 10 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            obj = objArr2[0];
        }
        return threeDS2Service.values(setbackgrounddrawable.get(((String) obj).intern()));
    }

    private /* synthetic */ getHeadingTextColor getSchemePublicRootKeys(ThreeDS2Service threeDS2Service) {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) (64287 << (CdmaCellLocation.convertQuartSecToDecDegrees(1) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(1) == 1.0d ? 0 : -1))), 1818 >> ImageFormat.getBitsPerPixel(0), 12 >>> TextUtils.getCapsMode("", 1, 1), objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) (64287 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 188 - ImageFormat.getBitsPerPixel(0), TextUtils.getCapsMode("", 0, 0) + 12, objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) obj).intern()));
        int i2 = apiKey + 53;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor getType(ThreeDS2Service threeDS2Service) {
        apiKey = (addParam + 39) % 128;
        setBackground setbackground = this.getParamValue;
        Object[] objArr = new Object[1];
        values((char) (TextUtils.indexOf("", "") + 26497), Color.argb(0, 0, 0, 0) + ClientProto.OAUTH_SCOPES_FIELD_NUMBER, 20 - Color.red(0), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackground.ThreeDS2ServiceInstance(((String) objArr[0]).intern()));
        apiKey = (addParam + 33) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor ids(ThreeDS2Service threeDS2Service) {
        if (Build.VERSION.SDK_INT < 33) {
            addParam = (apiKey + 73) % 128;
            setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) ((-16777216) - Color.rgb(0, 0, 0)), 350 - TextUtils.lastIndexOf("", '0', 0), 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
            int i = addParam + 81;
            apiKey = i % 128;
            if (i % 2 != 0) {
                return values2;
            }
            throw null;
        }
        return getHeadingTextColor.valueOf();
    }

    private /* synthetic */ getHeadingTextColor logo(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 57) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 201, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = addParam + 27;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor logoDark(ThreeDS2Service threeDS2Service) {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = apiKey + 31;
        addParam = i % 128;
        if (i % 2 != 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) Color.argb(0, 0, 1, 1), 8719 % View.getDefaultSize(0, 1), 120 - Gravity.getAbsoluteGravity(1, 1), objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) Color.argb(0, 0, 0, 0), View.getDefaultSize(0, 0) + 224, 21 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            obj = objArr2[0];
        }
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) obj).intern()));
        apiKey = (addParam + 15) % 128;
        return values2;
    }

    private /* synthetic */ getHeadingTextColor rootPublicKey(ThreeDS2Service threeDS2Service) {
        addParam = (apiKey + 95) % 128;
        setBackgroundDrawable setbackgrounddrawable = this.ConfigurationBuilder;
        Object[] objArr = new Object[1];
        values((char) TextUtils.getOffsetBefore("", 0), 403 - TextUtils.getTrimmedLength(""), 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        getHeadingTextColor values2 = threeDS2Service.values(setbackgrounddrawable.get(((String) objArr[0]).intern()));
        int i = apiKey + 73;
        addParam = i % 128;
        if (i % 2 == 0) {
            return values2;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor rootPublicKeyFromAssetCertificate(ThreeDS2Service threeDS2Service) {
        setBackgroundDrawable setbackgrounddrawable;
        Object obj;
        int i = apiKey + 63;
        addParam = i % 128;
        if (i % 2 != 0) {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr = new Object[1];
            values((char) Color.red(0), 8667 % TextUtils.indexOf((CharSequence) "", '4', 1), 2 - (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            setbackgrounddrawable = this.ConfigurationBuilder;
            Object[] objArr2 = new Object[1];
            values((char) Color.red(0), 494 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 21, objArr2);
            obj = objArr2[0];
        }
        return threeDS2Service.values(setbackgrounddrawable.get(((String) obj).intern()));
    }

    public static /* synthetic */ getHeadingTextColor values(Locale locale) {
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            get(locale);
            throw null;
        }
        getHeadingTextColor getheadingtextcolor = get(locale);
        apiKey = (addParam + 31) % 128;
        return getheadingtextcolor;
    }

    public valueOf ConfigParameters() {
        setTextBoxCustomization settextboxcustomization = new setTextBoxCustomization(this);
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
        return settextboxcustomization;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public valueOf ConfigurationBuilder() {
        setNextFocusUpId setnextfocusupid = new setNextFocusUpId(this);
        int i = addParam + 31;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setnextfocusupid;
        }
        throw null;
    }

    public valueOf SchemeConfiguration() {
        setAllowedHandwritingDelegatorPackage setallowedhandwritingdelegatorpackage = new setAllowedHandwritingDelegatorPackage(this);
        addParam = (apiKey + 107) % 128;
        return setallowedhandwritingdelegatorpackage;
    }

    public valueOf ThreeDS2Service$InitializationCallback() {
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener(this);
        int i = addParam + 69;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setonlongclicklistener;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public valueOf addParam() {
        setLabelFor setlabelfor = new setLabelFor(this);
        int i = addParam + 41;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setlabelfor;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf amexConfiguration() {
        setIsHandwritingDelegate setishandwritingdelegate = new setIsHandwritingDelegate(this);
        apiKey = (addParam + 111) % 128;
        return setishandwritingdelegate;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf apiKey() {
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = new setWindowInsetsAnimationCallback(this);
        int i = apiKey + 87;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setwindowinsetsanimationcallback;
        }
        throw null;
    }

    public valueOf build() {
        setPreferKeepClearRects setpreferkeepclearrects = new setPreferKeepClearRects(this);
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setpreferkeepclearrects;
        }
        throw null;
    }

    public valueOf cleanup() {
        setY sety = new setY(this);
        addParam = (apiKey + 43) % 128;
        return sety;
    }

    public valueOf configureScheme() {
        setHandwritingBoundsOffsets sethandwritingboundsoffsets = new setHandwritingBoundsOffsets(this);
        apiKey = (addParam + 63) % 128;
        return sethandwritingboundsoffsets;
    }

    public valueOf createTransaction() {
        UiCustomization.ButtonType buttonType = new UiCustomization.ButtonType(this);
        int i = apiKey + 71;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
        return buttonType;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf dinersSchemeConfiguration() {
        setFocusableInTouchMode setfocusableintouchmode = new setFocusableInTouchMode(this);
        apiKey = (addParam + 89) % 128;
        return setfocusableintouchmode;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public valueOf getParamValue() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = new setOnApplyWindowInsetsListener(this);
        int i = addParam + 73;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setonapplywindowinsetslistener;
        }
        throw null;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getSDKInfo() {
        getHeadingTextFontName getheadingtextfontname = new getHeadingTextFontName(this);
        addParam = (apiKey + 7) % 128;
        return getheadingtextfontname;
    }

    public valueOf getSDKVersion() {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new setScrollBarDefaultDelayBeforeFade(this);
        addParam = (apiKey + 67) % 128;
        return setscrollbardefaultdelaybeforefade;
    }

    public valueOf getSchemeName() {
        setHapticFeedbackEnabled sethapticfeedbackenabled = new setHapticFeedbackEnabled(this);
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
        return sethapticfeedbackenabled;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf getWarnings() {
        setOutlineSpotShadowColor setoutlinespotshadowcolor = new setOutlineSpotShadowColor(this);
        int i = apiKey + 107;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
        return setoutlinespotshadowcolor;
    }

    public valueOf initialize() {
        addParam = (apiKey + 87) % 128;
        setRotation setrotation = setRotation.valueOf;
        apiKey = (addParam + 101) % 128;
        return setrotation;
    }

    public valueOf jcbConfiguration() {
        setFitsSystemWindows setfitssystemwindows = new setFitsSystemWindows(this);
        apiKey = (addParam + 9) % 128;
        return setfitssystemwindows;
    }

    public valueOf mastercardSchemeConfiguration() {
        setHandwritingDelegatorCallback sethandwritingdelegatorcallback = new setHandwritingDelegatorCallback(this);
        apiKey = (addParam + 109) % 128;
        return sethandwritingdelegatorcallback;
    }

    public valueOf newSchemeConfiguration() {
        setHasTransientState sethastransientstate = new setHasTransientState(this);
        apiKey = (addParam + 79) % 128;
        return sethastransientstate;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf onCompleted() {
        ToolbarCustomization toolbarCustomization = new ToolbarCustomization(this);
        int i = apiKey + 105;
        addParam = i % 128;
        if (i % 2 == 0) {
            return toolbarCustomization;
        }
        throw null;
    }

    public valueOf onError() {
        addAttributes addattributes = new addAttributes(this);
        addParam = (apiKey + 35) % 128;
        return addattributes;
    }

    @SuppressLint({"MissingPermission"})
    public valueOf removeParam() {
        setSystemGestureExclusionRects setsystemgestureexclusionrects = new setSystemGestureExclusionRects(this);
        addParam = (apiKey + 1) % 128;
        return setsystemgestureexclusionrects;
    }

    public valueOf restrictedParameters() {
        setAllowedHandwritingDelegatePackage setallowedhandwritingdelegatepackage = new setAllowedHandwritingDelegatePackage(this);
        apiKey = (addParam + 95) % 128;
        return setallowedhandwritingdelegatepackage;
    }

    public valueOf unionSchemeConfiguration() {
        setEnabled setenabled = new setEnabled(this);
        addParam = (apiKey + 109) % 128;
        return setenabled;
    }

    public valueOf valueOf() {
        addParam = (apiKey + 79) % 128;
        getDarkTextColor getdarktextcolor = getDarkTextColor.ThreeDS2Service;
        apiKey = (addParam + 11) % 128;
        return getdarktextcolor;
    }

    public valueOf visaSchemeConfiguration() {
        setFocusable setfocusable = new setFocusable(this);
        apiKey = (addParam + 119) % 128;
        return setfocusable;
    }

    private valueOf ConfigParameters(ThreeDS2Service<String> threeDS2Service) {
        setButtonText setbuttontext = new setButtonText(this, threeDS2Service);
        int i = addParam + 59;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
        return setbuttontext;
    }

    private valueOf ConfigurationBuilder(ThreeDS2Service<String> threeDS2Service) {
        getDarkModeSupported getdarkmodesupported = new getDarkModeSupported(this, threeDS2Service);
        apiKey = (addParam + 81) % 128;
        return getdarkmodesupported;
    }

    private valueOf SchemeConfiguration(ThreeDS2Service<String> threeDS2Service) {
        addAlgorithm addalgorithm = new addAlgorithm(this, threeDS2Service);
        int i = addParam + 65;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
        return addalgorithm;
    }

    private valueOf ThreeDS2Service$InitializationCallback(ThreeDS2Service<String> threeDS2Service) {
        getToolbarCustomization gettoolbarcustomization = new getToolbarCustomization(this, threeDS2Service);
        int i = addParam + 51;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return gettoolbarcustomization;
        }
        throw null;
    }

    public static setDarkTextColor ThreeDS2ServiceInstance(Context context, setScrollingCacheEnabled setscrollingcacheenabled) {
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr = new Object[1];
        values((char) (Process.myPid() >> 22), ExpandableListView.getPackedPositionType(0L), 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        LocationManager locationManager = (LocationManager) context.getSystemService(((String) objArr[0]).intern());
        Context applicationContext = context.getApplicationContext();
        Object[] objArr2 = new Object[1];
        values((char) KeyEvent.normalizeMetaState(0), 8 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr2);
        WifiManager wifiManager = (WifiManager) applicationContext.getSystemService(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        values((char) (KeyEvent.getMaxKeyCode() >> 16), 12 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, objArr3);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        values((char) Color.red(0), Color.green(0) + 24, 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        Object[] objArr5 = new Object[1];
        values((char) (4130 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 29, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6, objArr5);
        Object[] objArr6 = new Object[1];
        values((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 7, objArr6);
        Object[] objArr7 = new Object[1];
        values((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 42, 8 - TextUtils.indexOf((CharSequence) "", '0'), objArr7);
        Object[] objArr8 = new Object[1];
        values((char) (52144 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 51, 5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr8);
        setSmoothScrollbarEnabled setsmoothscrollbarenabled = new setSmoothScrollbarEnabled(context);
        ContentResolver contentResolver = context.getContentResolver();
        setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = new setDrawingCacheBackgroundColor(contentResolver);
        setBackgroundDrawable setbackgrounddrawable = new setBackgroundDrawable(contentResolver);
        setBackground setbackground = new setBackground(contentResolver);
        setBackgroundTintMode setbackgroundtintmode = new setBackgroundTintMode(wifiManager, connectivityManager);
        Object[] objArr9 = new Object[1];
        values((char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 56, 14 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
        setDarkTextColor setdarktextcolor = new setDarkTextColor(context, setscrollingcacheenabled, new SimpleDateFormat(((String) objArr9[0]).intern(), Locale.US), packageManager, locationManager, wifiManager, (TelephonyManager) context.getSystemService(((String) objArr4[0]).intern()), (TelecomManager) context.getSystemService(((String) objArr5[0]).intern()), (WindowManager) context.getSystemService(((String) objArr6[0]).intern()), (BluetoothManager) context.getSystemService(((String) objArr7[0]).intern()), (AudioManager) context.getSystemService(((String) objArr8[0]).intern()), setsmoothscrollbarenabled, setdrawingcachebackgroundcolor, setbackgrounddrawable, setbackground, setbackgroundtintmode);
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setdarktextcolor;
        }
        throw null;
    }

    private valueOf addParam(ThreeDS2Service<String> threeDS2Service) {
        getViewCustomization getviewcustomization = new getViewCustomization(this, threeDS2Service);
        int i = apiKey + 15;
        addParam = i % 128;
        if (i % 2 == 0) {
            return getviewcustomization;
        }
        throw null;
    }

    private valueOf amexConfiguration(ThreeDS2Service<String> threeDS2Service) {
        getPrivateKey getprivatekey = new getPrivateKey(this, threeDS2Service);
        int i = addParam + 33;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
        return getprivatekey;
    }

    private valueOf apiKey(ThreeDS2Service<String> threeDS2Service) {
        getLabelCustomization getlabelcustomization = new getLabelCustomization(this, threeDS2Service);
        addParam = (apiKey + 57) % 128;
        return getlabelcustomization;
    }

    private valueOf build(ThreeDS2Service<String> threeDS2Service) {
        setParameter setparameter = new setParameter(this, threeDS2Service);
        addParam = (apiKey + 97) % 128;
        return setparameter;
    }

    private valueOf cleanup(ThreeDS2Service<String> threeDS2Service) {
        setRenderEffect setrendereffect = new setRenderEffect(this, threeDS2Service);
        apiKey = (addParam + 99) % 128;
        return setrendereffect;
    }

    private valueOf configureScheme(ThreeDS2Service<String> threeDS2Service) {
        setContentView setcontentview = new setContentView(this, threeDS2Service);
        apiKey = (addParam + 3) % 128;
        return setcontentview;
    }

    private valueOf createTransaction(ThreeDS2Service<String> threeDS2Service) {
        getTextBoxCustomization gettextboxcustomization = new getTextBoxCustomization(this, threeDS2Service);
        addParam = (apiKey + 35) % 128;
        return gettextboxcustomization;
    }

    private valueOf dinersSchemeConfiguration(ThreeDS2Service<String> threeDS2Service) {
        onContextItemSelected oncontextitemselected = new onContextItemSelected(this, threeDS2Service);
        int i = apiKey + 7;
        addParam = i % 128;
        if (i % 2 == 0) {
            return oncontextitemselected;
        }
        throw null;
    }

    private valueOf getParamValue(ThreeDS2Service<String> threeDS2Service) {
        setLabelCustomization setlabelcustomization = new setLabelCustomization(this, threeDS2Service);
        apiKey = (addParam + 101) % 128;
        return setlabelcustomization;
    }

    private valueOf getSDKInfo(ThreeDS2Service<String> threeDS2Service) {
        setBorderColor setbordercolor = new setBorderColor(this, threeDS2Service);
        int i = apiKey + 21;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setbordercolor;
        }
        throw null;
    }

    private valueOf getSDKVersion(ThreeDS2Service<String> threeDS2Service) {
        setDuplicateParentStateEnabled setduplicateparentstateenabled = new setDuplicateParentStateEnabled(this, threeDS2Service);
        apiKey = (addParam + 73) % 128;
        return setduplicateparentstateenabled;
    }

    private valueOf getSchemeName(ThreeDS2Service<String> threeDS2Service) {
        setContentDescription setcontentdescription = new setContentDescription(this, threeDS2Service);
        int i = addParam + 37;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setcontentdescription;
        }
        throw null;
    }

    private valueOf getWarnings(ThreeDS2Service<String> threeDS2Service) {
        setBorderWidth setborderwidth = new setBorderWidth(this, threeDS2Service);
        apiKey = (addParam + 53) % 128;
        return setborderwidth;
    }

    private valueOf initialize(ThreeDS2Service<String> threeDS2Service) {
        getHeadingTextFontSize getheadingtextfontsize = new getHeadingTextFontSize(this, threeDS2Service);
        int i = addParam + 73;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return getheadingtextfontsize;
        }
        throw null;
    }

    private valueOf jcbConfiguration(ThreeDS2Service<String> threeDS2Service) {
        onOptionsItemSelected onoptionsitemselected = new onOptionsItemSelected(this, threeDS2Service);
        int i = apiKey + 23;
        addParam = i % 128;
        if (i % 2 == 0) {
            return onoptionsitemselected;
        }
        throw null;
    }

    private valueOf mastercardSchemeConfiguration(ThreeDS2Service<String> threeDS2Service) {
        addKeyInfoConverter addkeyinfoconverter = new addKeyInfoConverter(this, threeDS2Service);
        int i = addParam + 101;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return addkeyinfoconverter;
        }
        throw null;
    }

    private /* synthetic */ getHeadingTextColor newSchemeConfiguration(ThreeDS2Service threeDS2Service) {
        boolean isRampingRingerEnabled;
        Object obj;
        addParam = (apiKey + 25) % 128;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 29) {
                addParam = (apiKey + 45) % 128;
                setDrawingCacheBackgroundColor setdrawingcachebackgroundcolor = this.onError;
                Object[] objArr = new Object[1];
                values((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 50303), 72 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, objArr);
                return threeDS2Service.values(setdrawingcachebackgroundcolor.ThreeDS2Service(((String) objArr[0]).intern()));
            }
            return getHeadingTextColor.valueOf();
        }
        apiKey = (addParam + 99) % 128;
        isRampingRingerEnabled = this.createTransaction.isRampingRingerEnabled();
        if (isRampingRingerEnabled) {
            Object[] objArr2 = new Object[1];
            values((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 70, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            values((char) (45380 - TextUtils.indexOf("", "", 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 71, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
            obj = objArr3[0];
        }
        getHeadingTextColor values2 = threeDS2Service.values(((String) obj).intern());
        int i2 = apiKey + 29;
        addParam = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return values2;
    }

    private valueOf onCompleted(ThreeDS2Service<String> threeDS2Service) {
        setDarkBorderColor setdarkbordercolor = new setDarkBorderColor(this, threeDS2Service);
        addParam = (apiKey + 5) % 128;
        return setdarkbordercolor;
    }

    private valueOf onError(ThreeDS2Service<String> threeDS2Service) {
        getDarkBorderColor getdarkbordercolor = new getDarkBorderColor(this, threeDS2Service);
        addParam = (apiKey + CameraActivity.REQUEST_CODE) % 128;
        return getdarkbordercolor;
    }

    private valueOf removeParam(ThreeDS2Service<String> threeDS2Service) {
        UiCustomization.UiCustomizationType uiCustomizationType = new UiCustomization.UiCustomizationType(this, threeDS2Service);
        addParam = (apiKey + 9) % 128;
        return uiCustomizationType;
    }

    private valueOf restrictedParameters(ThreeDS2Service<String> threeDS2Service) {
        getService getservice = new getService(this, threeDS2Service);
        int i = addParam + 45;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return getservice;
        }
        throw null;
    }

    private valueOf unionSchemeConfiguration(ThreeDS2Service<Boolean> threeDS2Service) {
        setImportantForContentCapture setimportantforcontentcapture = new setImportantForContentCapture(this, threeDS2Service);
        apiKey = (addParam + 49) % 128;
        return setimportantforcontentcapture;
    }

    private valueOf visaSchemeConfiguration(ThreeDS2Service<String> threeDS2Service) {
        setAccessibilityTraversalAfter setaccessibilitytraversalafter = new setAccessibilityTraversalAfter(this, threeDS2Service);
        apiKey = (addParam + 101) % 128;
        return setaccessibilitytraversalafter;
    }

    public valueOf ThreeDS2Service() {
        apiKey = (addParam + 61) % 128;
        setPreferKeepClear setpreferkeepclear = setPreferKeepClear.get;
        int i = addParam + 105;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setpreferkeepclear;
        }
        throw null;
    }

    public valueOf get() {
        int i = addParam + 87;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setHeadingTextFontName setheadingtextfontname = setHeadingTextFontName.ThreeDS2Service;
            throw null;
        }
        setHeadingTextFontName setheadingtextfontname2 = setHeadingTextFontName.ThreeDS2Service;
        int i2 = addParam + 13;
        apiKey = i2 % 128;
        if (i2 % 2 != 0) {
            return setheadingtextfontname2;
        }
        throw null;
    }

    public valueOf valueOf(String str) {
        setAutofillId setautofillid = new setAutofillId(str);
        apiKey = (addParam + 51) % 128;
        return setautofillid;
    }

    public valueOf values() {
        setVisibility setvisibility = new setVisibility(this);
        int i = apiKey + 5;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 20 / 0;
        }
        return setvisibility;
    }

    private /* synthetic */ getHeadingTextColor ThreeDS2Service(setFastScrollEnabled.valueOf valueof) {
        apiKey = (addParam + 57) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(this.ThreeDS2Service.valueOf(valueof));
        int i = apiKey + 21;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
        return ThreeDS2Service2;
    }

    private static /* synthetic */ getHeadingTextColor get(Locale locale) {
        addParam = (apiKey + 103) % 128;
        String locale2 = ((Locale) C9664oh.ThreeDS2Service(locale, Locale.getDefault())).toString();
        Object[] objArr = new Object[1];
        values((char) View.MeasureSpec.getMode(0), ((Process.getThreadPriority(0) + 20) >> 6) + 1240, 1 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        values((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 1241, -TextUtils.lastIndexOf("", '0', 0), objArr2);
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(C9669om.values(locale2, intern, ((String) objArr2[0]).intern()));
        apiKey = (addParam + 105) % 128;
        return ThreeDS2Service2;
    }

    private valueOf valueOf(ThreeDS2Service<String> threeDS2Service) {
        setHorizontalFadingEdgeEnabled sethorizontalfadingedgeenabled = new setHorizontalFadingEdgeEnabled(this, threeDS2Service);
        int i = apiKey + 15;
        addParam = i % 128;
        if (i % 2 == 0) {
            return sethorizontalfadingedgeenabled;
        }
        throw null;
    }

    private valueOf values(ThreeDS2Service<String> threeDS2Service) {
        setScrollBarFadeDuration setscrollbarfadeduration = new setScrollBarFadeDuration(this, threeDS2Service);
        int i = apiKey + 41;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setscrollbarfadeduration;
        }
        throw null;
    }

    private static /* synthetic */ String ThreeDS2Service(WifiInfo wifiInfo) {
        apiKey = (addParam + 79) % 128;
        String num = Integer.toString(wifiInfo.getNetworkId());
        addParam = (apiKey + 57) % 128;
        return num;
    }

    private static void values(char c, int i, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((values[i + i3] ^ (i3 * get)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }

    private valueOf ThreeDS2Service(ThreeDS2Service<String> threeDS2Service) {
        setLayerPaint setlayerpaint = new setLayerPaint(this, threeDS2Service);
        int i = addParam + 117;
        apiKey = i % 128;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
        return setlayerpaint;
    }

    public valueOf SchemeInfo() {
        int i = addParam + 9;
        apiKey = i % 128;
        if (i % 2 == 0) {
            setRotationY setrotationy = setRotationY.valueOf;
            throw null;
        }
        setRotationY setrotationy2 = setRotationY.valueOf;
        apiKey = (addParam + 25) % 128;
        return setrotationy2;
    }

    private valueOf get(ThreeDS2Service<Boolean> threeDS2Service) {
        setAccessibilityLiveRegion setaccessibilityliveregion = new setAccessibilityLiveRegion(this, threeDS2Service);
        apiKey = (addParam + 69) % 128;
        return setaccessibilityliveregion;
    }

    public valueOf ThreeDS2ServiceInstance() {
        apiKey = (addParam + 51) % 128;
        setAllowClickWhenDisabled setallowclickwhendisabled = setAllowClickWhenDisabled.values;
        int i = apiKey + 91;
        addParam = i % 128;
        if (i % 2 == 0) {
            return setallowclickwhendisabled;
        }
        throw null;
    }

    public valueOf ThreeDS2ServiceInstance(Locale locale) {
        setKeyboardNavigationCluster setkeyboardnavigationcluster = new setKeyboardNavigationCluster(locale);
        int i = apiKey + 99;
        addParam = i % 128;
        if (i % 2 != 0) {
            int i2 = 5 / 0;
        }
        return setkeyboardnavigationcluster;
    }

    public valueOf ThreeDS2ServiceInstance(setFastScrollEnabled.valueOf valueof) {
        setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = new setVerticalScrollbarTrackDrawable(this, valueof);
        addParam = (apiKey + 73) % 128;
        return setverticalscrollbartrackdrawable;
    }

    private static /* synthetic */ getHeadingTextColor ThreeDS2ServiceInstance(String str) {
        addParam = (apiKey + 25) % 128;
        getHeadingTextColor ThreeDS2Service2 = getHeadingTextColor.ThreeDS2Service(str);
        int i = apiKey + 23;
        addParam = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }

    private valueOf ThreeDS2ServiceInstance(ThreeDS2Service<String> threeDS2Service) {
        setVerticalScrollBarEnabled setverticalscrollbarenabled = new setVerticalScrollBarEnabled(this, threeDS2Service);
        int i = addParam + 111;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return setverticalscrollbarenabled;
        }
        throw null;
    }
}
