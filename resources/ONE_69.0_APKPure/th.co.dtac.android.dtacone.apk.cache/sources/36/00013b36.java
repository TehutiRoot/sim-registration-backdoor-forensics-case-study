package th.p047co.dtac.android.dtacone.view.appOne.pre2post.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bX\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010\"J\u0010\u00106\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b6\u00100J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010\"J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010\"J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010\"J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010\"J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010\"J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010\"J\u009e\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010\"J\u001a\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010LR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010I\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010LR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010\"\"\u0004\bR\u0010LR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010I\u001a\u0004\bT\u0010\"\"\u0004\bU\u0010LR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010I\u001a\u0004\bW\u0010\"\"\u0004\bX\u0010LR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010\"\"\u0004\b[\u0010LR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010I\u001a\u0004\b]\u0010\"\"\u0004\b^\u0010LR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010I\u001a\u0004\b`\u0010\"\"\u0004\ba\u0010LR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010I\u001a\u0004\bc\u0010\"\"\u0004\bd\u0010LR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010I\u001a\u0004\bf\u0010\"\"\u0004\bg\u0010LR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010I\u001a\u0004\bi\u0010\"\"\u0004\bj\u0010LR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010I\u001a\u0004\bl\u0010\"\"\u0004\bm\u0010LR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010I\u001a\u0004\bo\u0010\"\"\u0004\bp\u0010LR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u00100\"\u0004\bt\u0010uR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010I\u001a\u0004\bw\u0010\"\"\u0004\bx\u0010LR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010I\u001a\u0004\bz\u0010\"\"\u0004\b{\u0010LR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010I\u001a\u0004\b}\u0010\"\"\u0004\b~\u0010LR$\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010I\u001a\u0005\b\u0080\u0001\u0010\"\"\u0005\b\u0081\u0001\u0010LR%\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010I\u001a\u0005\b\u0083\u0001\u0010\"\"\u0005\b\u0084\u0001\u0010LR%\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010r\u001a\u0005\b\u0086\u0001\u00100\"\u0005\b\u0087\u0001\u0010uR%\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010I\u001a\u0005\b\u0089\u0001\u0010\"\"\u0005\b\u008a\u0001\u0010LR%\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010I\u001a\u0005\b\u008c\u0001\u0010\"\"\u0005\b\u008d\u0001\u0010LR%\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010I\u001a\u0005\b\u008f\u0001\u0010\"\"\u0005\b\u0090\u0001\u0010LR%\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010I\u001a\u0005\b\u0092\u0001\u0010\"\"\u0005\b\u0093\u0001\u0010LR%\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010I\u001a\u0005\b\u0095\u0001\u0010\"\"\u0005\b\u0096\u0001\u0010LR%\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010I\u001a\u0005\b\u0098\u0001\u0010\"\"\u0005\b\u0099\u0001\u0010LR%\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010I\u001a\u0005\b\u009b\u0001\u0010\"\"\u0005\b\u009c\u0001\u0010L¨\u0006\u009d\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/pre2post/model/OnePre2PostThemeModel;", "", "", "mainTheme", "topBarBackground", "editTextColor", "editTextBackground", "editTextCursor", "fontColor", "buttonBackground", "otpEditTextBackground", "switchModeBackground", "switchModeFontColor", "formTabColor", "fontColorDialog", "buttonBackgroundRounded", "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "tabBackgroundColors", "backgroundTitleForm", "dotColor", "successIconColor", "tabBarFontColor", "tabColor", "tabConsentBackgroundColors", "toggleGender", "icConsentTelco", "icConsentNonTelco", "icLogo", "buttonBackgroundNotallow", "checkBoxBackgroundColor", "backgroundTitleSummary", "<init>", "(IIIIIIIIIIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;IIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;IIIIIII)V", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "()Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(IIIIIIIIIIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;IIIIILth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;IIIIIII)Lth/co/dtac/android/dtacone/view/appOne/pre2post/model/OnePre2PostThemeModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMainTheme", "setMainTheme", "(I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTopBarBackground", "setTopBarBackground", OperatorName.CURVE_TO, "getEditTextColor", "setEditTextColor", "d", "getEditTextBackground", "setEditTextBackground", "e", "getEditTextCursor", "setEditTextCursor", OperatorName.FILL_NON_ZERO, "getFontColor", "setFontColor", OperatorName.NON_STROKING_GRAY, "getButtonBackground", "setButtonBackground", OperatorName.CLOSE_PATH, "getOtpEditTextBackground", "setOtpEditTextBackground", "i", "getSwitchModeBackground", "setSwitchModeBackground", OperatorName.SET_LINE_JOINSTYLE, "getSwitchModeFontColor", "setSwitchModeFontColor", OperatorName.NON_STROKING_CMYK, "getFormTabColor", "setFormTabColor", OperatorName.LINE_TO, "getFontColorDialog", "setFontColorDialog", OperatorName.MOVE_TO, "getButtonBackgroundRounded", "setButtonBackgroundRounded", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;", "getTabBackgroundColors", "setTabBackgroundColors", "(Lth/co/dtac/android/dtacone/view/appOne/prepaid_registration/model/TabBackgroundColors;)V", "o", "getBackgroundTitleForm", "setBackgroundTitleForm", "p", "getDotColor", "setDotColor", OperatorName.SAVE, "getSuccessIconColor", "setSuccessIconColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getTabBarFontColor", "setTabBarFontColor", OperatorName.CLOSE_AND_STROKE, "getTabColor", "setTabColor", "t", "getTabConsentBackgroundColors", "setTabConsentBackgroundColors", "u", "getToggleGender", "setToggleGender", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getIcConsentTelco", "setIcConsentTelco", OperatorName.SET_LINE_WIDTH, "getIcConsentNonTelco", "setIcConsentNonTelco", "x", "getIcLogo", "setIcLogo", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getButtonBackgroundNotallow", "setButtonBackgroundNotallow", "z", "getCheckBoxBackgroundColor", "setCheckBoxBackgroundColor", "A", "getBackgroundTitleSummary", "setBackgroundTitleSummary", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.model.OnePre2PostThemeModel */
/* loaded from: classes10.dex */
public final class OnePre2PostThemeModel {
    public static final int $stable = 8;

    /* renamed from: A */
    public int f95367A;

    /* renamed from: a */
    public int f95368a;

    /* renamed from: b */
    public int f95369b;

    /* renamed from: c */
    public int f95370c;

    /* renamed from: d */
    public int f95371d;

    /* renamed from: e */
    public int f95372e;

    /* renamed from: f */
    public int f95373f;

    /* renamed from: g */
    public int f95374g;

    /* renamed from: h */
    public int f95375h;

    /* renamed from: i */
    public int f95376i;

    /* renamed from: j */
    public int f95377j;

    /* renamed from: k */
    public int f95378k;

    /* renamed from: l */
    public int f95379l;

    /* renamed from: m */
    public int f95380m;

    /* renamed from: n */
    public TabBackgroundColors f95381n;

    /* renamed from: o */
    public int f95382o;

    /* renamed from: p */
    public int f95383p;

    /* renamed from: q */
    public int f95384q;

    /* renamed from: r */
    public int f95385r;

    /* renamed from: s */
    public int f95386s;

    /* renamed from: t */
    public TabBackgroundColors f95387t;

    /* renamed from: u */
    public int f95388u;

    /* renamed from: v */
    public int f95389v;

    /* renamed from: w */
    public int f95390w;

    /* renamed from: x */
    public int f95391x;

    /* renamed from: y */
    public int f95392y;

    /* renamed from: z */
    public int f95393z;

    public OnePre2PostThemeModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 134217727, null);
    }

    public final int component1() {
        return this.f95368a;
    }

    public final int component10() {
        return this.f95377j;
    }

    public final int component11() {
        return this.f95378k;
    }

    public final int component12() {
        return this.f95379l;
    }

    public final int component13() {
        return this.f95380m;
    }

    @NotNull
    public final TabBackgroundColors component14() {
        return this.f95381n;
    }

    public final int component15() {
        return this.f95382o;
    }

    public final int component16() {
        return this.f95383p;
    }

    public final int component17() {
        return this.f95384q;
    }

    public final int component18() {
        return this.f95385r;
    }

    public final int component19() {
        return this.f95386s;
    }

    public final int component2() {
        return this.f95369b;
    }

    @NotNull
    public final TabBackgroundColors component20() {
        return this.f95387t;
    }

    public final int component21() {
        return this.f95388u;
    }

    public final int component22() {
        return this.f95389v;
    }

    public final int component23() {
        return this.f95390w;
    }

    public final int component24() {
        return this.f95391x;
    }

    public final int component25() {
        return this.f95392y;
    }

    public final int component26() {
        return this.f95393z;
    }

    public final int component27() {
        return this.f95367A;
    }

    public final int component3() {
        return this.f95370c;
    }

    public final int component4() {
        return this.f95371d;
    }

    public final int component5() {
        return this.f95372e;
    }

    public final int component6() {
        return this.f95373f;
    }

    public final int component7() {
        return this.f95374g;
    }

    public final int component8() {
        return this.f95375h;
    }

    public final int component9() {
        return this.f95376i;
    }

    @NotNull
    public final OnePre2PostThemeModel copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, @NotNull TabBackgroundColors tabBackgroundColors, int i14, int i15, int i16, int i17, int i18, @NotNull TabBackgroundColors tabConsentBackgroundColors, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "tabBackgroundColors");
        Intrinsics.checkNotNullParameter(tabConsentBackgroundColors, "tabConsentBackgroundColors");
        return new OnePre2PostThemeModel(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, tabBackgroundColors, i14, i15, i16, i17, i18, tabConsentBackgroundColors, i19, i20, i21, i22, i23, i24, i25);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostThemeModel) {
            OnePre2PostThemeModel onePre2PostThemeModel = (OnePre2PostThemeModel) obj;
            return this.f95368a == onePre2PostThemeModel.f95368a && this.f95369b == onePre2PostThemeModel.f95369b && this.f95370c == onePre2PostThemeModel.f95370c && this.f95371d == onePre2PostThemeModel.f95371d && this.f95372e == onePre2PostThemeModel.f95372e && this.f95373f == onePre2PostThemeModel.f95373f && this.f95374g == onePre2PostThemeModel.f95374g && this.f95375h == onePre2PostThemeModel.f95375h && this.f95376i == onePre2PostThemeModel.f95376i && this.f95377j == onePre2PostThemeModel.f95377j && this.f95378k == onePre2PostThemeModel.f95378k && this.f95379l == onePre2PostThemeModel.f95379l && this.f95380m == onePre2PostThemeModel.f95380m && Intrinsics.areEqual(this.f95381n, onePre2PostThemeModel.f95381n) && this.f95382o == onePre2PostThemeModel.f95382o && this.f95383p == onePre2PostThemeModel.f95383p && this.f95384q == onePre2PostThemeModel.f95384q && this.f95385r == onePre2PostThemeModel.f95385r && this.f95386s == onePre2PostThemeModel.f95386s && Intrinsics.areEqual(this.f95387t, onePre2PostThemeModel.f95387t) && this.f95388u == onePre2PostThemeModel.f95388u && this.f95389v == onePre2PostThemeModel.f95389v && this.f95390w == onePre2PostThemeModel.f95390w && this.f95391x == onePre2PostThemeModel.f95391x && this.f95392y == onePre2PostThemeModel.f95392y && this.f95393z == onePre2PostThemeModel.f95393z && this.f95367A == onePre2PostThemeModel.f95367A;
        }
        return false;
    }

    public final int getBackgroundTitleForm() {
        return this.f95382o;
    }

    public final int getBackgroundTitleSummary() {
        return this.f95367A;
    }

    public final int getButtonBackground() {
        return this.f95374g;
    }

    public final int getButtonBackgroundNotallow() {
        return this.f95392y;
    }

    public final int getButtonBackgroundRounded() {
        return this.f95380m;
    }

    public final int getCheckBoxBackgroundColor() {
        return this.f95393z;
    }

    public final int getDotColor() {
        return this.f95383p;
    }

    public final int getEditTextBackground() {
        return this.f95371d;
    }

    public final int getEditTextColor() {
        return this.f95370c;
    }

    public final int getEditTextCursor() {
        return this.f95372e;
    }

    public final int getFontColor() {
        return this.f95373f;
    }

    public final int getFontColorDialog() {
        return this.f95379l;
    }

    public final int getFormTabColor() {
        return this.f95378k;
    }

    public final int getIcConsentNonTelco() {
        return this.f95390w;
    }

    public final int getIcConsentTelco() {
        return this.f95389v;
    }

    public final int getIcLogo() {
        return this.f95391x;
    }

    public final int getMainTheme() {
        return this.f95368a;
    }

    public final int getOtpEditTextBackground() {
        return this.f95375h;
    }

    public final int getSuccessIconColor() {
        return this.f95384q;
    }

    public final int getSwitchModeBackground() {
        return this.f95376i;
    }

    public final int getSwitchModeFontColor() {
        return this.f95377j;
    }

    @NotNull
    public final TabBackgroundColors getTabBackgroundColors() {
        return this.f95381n;
    }

    public final int getTabBarFontColor() {
        return this.f95385r;
    }

    public final int getTabColor() {
        return this.f95386s;
    }

    @NotNull
    public final TabBackgroundColors getTabConsentBackgroundColors() {
        return this.f95387t;
    }

    public final int getToggleGender() {
        return this.f95388u;
    }

    public final int getTopBarBackground() {
        return this.f95369b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.f95368a * 31) + this.f95369b) * 31) + this.f95370c) * 31) + this.f95371d) * 31) + this.f95372e) * 31) + this.f95373f) * 31) + this.f95374g) * 31) + this.f95375h) * 31) + this.f95376i) * 31) + this.f95377j) * 31) + this.f95378k) * 31) + this.f95379l) * 31) + this.f95380m) * 31) + this.f95381n.hashCode()) * 31) + this.f95382o) * 31) + this.f95383p) * 31) + this.f95384q) * 31) + this.f95385r) * 31) + this.f95386s) * 31) + this.f95387t.hashCode()) * 31) + this.f95388u) * 31) + this.f95389v) * 31) + this.f95390w) * 31) + this.f95391x) * 31) + this.f95392y) * 31) + this.f95393z) * 31) + this.f95367A;
    }

    public final void setBackgroundTitleForm(int i) {
        this.f95382o = i;
    }

    public final void setBackgroundTitleSummary(int i) {
        this.f95367A = i;
    }

    public final void setButtonBackground(int i) {
        this.f95374g = i;
    }

    public final void setButtonBackgroundNotallow(int i) {
        this.f95392y = i;
    }

    public final void setButtonBackgroundRounded(int i) {
        this.f95380m = i;
    }

    public final void setCheckBoxBackgroundColor(int i) {
        this.f95393z = i;
    }

    public final void setDotColor(int i) {
        this.f95383p = i;
    }

    public final void setEditTextBackground(int i) {
        this.f95371d = i;
    }

    public final void setEditTextColor(int i) {
        this.f95370c = i;
    }

    public final void setEditTextCursor(int i) {
        this.f95372e = i;
    }

    public final void setFontColor(int i) {
        this.f95373f = i;
    }

    public final void setFontColorDialog(int i) {
        this.f95379l = i;
    }

    public final void setFormTabColor(int i) {
        this.f95378k = i;
    }

    public final void setIcConsentNonTelco(int i) {
        this.f95390w = i;
    }

    public final void setIcConsentTelco(int i) {
        this.f95389v = i;
    }

    public final void setIcLogo(int i) {
        this.f95391x = i;
    }

    public final void setMainTheme(int i) {
        this.f95368a = i;
    }

    public final void setOtpEditTextBackground(int i) {
        this.f95375h = i;
    }

    public final void setSuccessIconColor(int i) {
        this.f95384q = i;
    }

    public final void setSwitchModeBackground(int i) {
        this.f95376i = i;
    }

    public final void setSwitchModeFontColor(int i) {
        this.f95377j = i;
    }

    public final void setTabBackgroundColors(@NotNull TabBackgroundColors tabBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "<set-?>");
        this.f95381n = tabBackgroundColors;
    }

    public final void setTabBarFontColor(int i) {
        this.f95385r = i;
    }

    public final void setTabColor(int i) {
        this.f95386s = i;
    }

    public final void setTabConsentBackgroundColors(@NotNull TabBackgroundColors tabBackgroundColors) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "<set-?>");
        this.f95387t = tabBackgroundColors;
    }

    public final void setToggleGender(int i) {
        this.f95388u = i;
    }

    public final void setTopBarBackground(int i) {
        this.f95369b = i;
    }

    @NotNull
    public String toString() {
        int i = this.f95368a;
        int i2 = this.f95369b;
        int i3 = this.f95370c;
        int i4 = this.f95371d;
        int i5 = this.f95372e;
        int i6 = this.f95373f;
        int i7 = this.f95374g;
        int i8 = this.f95375h;
        int i9 = this.f95376i;
        int i10 = this.f95377j;
        int i11 = this.f95378k;
        int i12 = this.f95379l;
        int i13 = this.f95380m;
        TabBackgroundColors tabBackgroundColors = this.f95381n;
        int i14 = this.f95382o;
        int i15 = this.f95383p;
        int i16 = this.f95384q;
        int i17 = this.f95385r;
        int i18 = this.f95386s;
        TabBackgroundColors tabBackgroundColors2 = this.f95387t;
        int i19 = this.f95388u;
        int i20 = this.f95389v;
        int i21 = this.f95390w;
        int i22 = this.f95391x;
        int i23 = this.f95392y;
        int i24 = this.f95393z;
        int i25 = this.f95367A;
        return "OnePre2PostThemeModel(mainTheme=" + i + ", topBarBackground=" + i2 + ", editTextColor=" + i3 + ", editTextBackground=" + i4 + ", editTextCursor=" + i5 + ", fontColor=" + i6 + ", buttonBackground=" + i7 + ", otpEditTextBackground=" + i8 + ", switchModeBackground=" + i9 + ", switchModeFontColor=" + i10 + ", formTabColor=" + i11 + ", fontColorDialog=" + i12 + ", buttonBackgroundRounded=" + i13 + ", tabBackgroundColors=" + tabBackgroundColors + ", backgroundTitleForm=" + i14 + ", dotColor=" + i15 + ", successIconColor=" + i16 + ", tabBarFontColor=" + i17 + ", tabColor=" + i18 + ", tabConsentBackgroundColors=" + tabBackgroundColors2 + ", toggleGender=" + i19 + ", icConsentTelco=" + i20 + ", icConsentNonTelco=" + i21 + ", icLogo=" + i22 + ", buttonBackgroundNotallow=" + i23 + ", checkBoxBackgroundColor=" + i24 + ", backgroundTitleSummary=" + i25 + ")";
    }

    public OnePre2PostThemeModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, @NotNull TabBackgroundColors tabBackgroundColors, int i14, int i15, int i16, int i17, int i18, @NotNull TabBackgroundColors tabConsentBackgroundColors, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        Intrinsics.checkNotNullParameter(tabBackgroundColors, "tabBackgroundColors");
        Intrinsics.checkNotNullParameter(tabConsentBackgroundColors, "tabConsentBackgroundColors");
        this.f95368a = i;
        this.f95369b = i2;
        this.f95370c = i3;
        this.f95371d = i4;
        this.f95372e = i5;
        this.f95373f = i6;
        this.f95374g = i7;
        this.f95375h = i8;
        this.f95376i = i9;
        this.f95377j = i10;
        this.f95378k = i11;
        this.f95379l = i12;
        this.f95380m = i13;
        this.f95381n = tabBackgroundColors;
        this.f95382o = i14;
        this.f95383p = i15;
        this.f95384q = i16;
        this.f95385r = i17;
        this.f95386s = i18;
        this.f95387t = tabConsentBackgroundColors;
        this.f95388u = i19;
        this.f95389v = i20;
        this.f95390w = i21;
        this.f95391x = i22;
        this.f95392y = i23;
        this.f95393z = i24;
        this.f95367A = i25;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ OnePre2PostThemeModel(int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors r41, int r42, int r43, int r44, int r45, int r46, th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.view.appOne.pre2post.model.OnePre2PostThemeModel.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors, int, int, int, int, int, th.co.dtac.android.dtacone.view.appOne.prepaid_registration.model.TabBackgroundColors, int, int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}