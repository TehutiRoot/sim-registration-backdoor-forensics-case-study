package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 32\u00020\u0001:\u0004x\u0010UWB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J7\u0010\u001f\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b#\u0010$J5\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b&\u0010'JE\u0010,\u001a\u00020\u00132\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b,\u0010-J1\u00101\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00022\b\u00100\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b3\u00102J\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*06H\u0002¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000fH\u0002¢\u0006\u0004\b<\u00105J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0012H\u0000¢\u0006\u0004\b=\u0010\u0015J\u0017\u0010>\u001a\u00020\u00132\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\b=\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\bC\u0010DJ/\u0010E\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020\u00122\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0007¢\u0006\u0004\bE\u0010FJ/\u0010H\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0000¢\u0006\u0004\bG\u0010FJ\u0019\u0010L\u001a\u00020B2\b\u0010I\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u00020\u00132\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020BH\u0016¢\u0006\u0004\bP\u0010QR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010RR\u001d\u0010b\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010_\u001a\u0004\b`\u0010aR\u001b\u0010e\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010_\u001a\u0004\bc\u0010dR'\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010_\u001a\u0004\bf\u00108R\u0016\u0010j\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR/\u0010k\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010_\u001a\u0004\bW\u0010;R!\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010_\u001a\u0004\bU\u0010lR\u001d\u0010n\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\b\\\u0010TR\u001d\u0010o\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010_\u001a\u0004\bY\u0010aR\u0018\u0010p\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010RR\u001d\u0010q\u001a\u0004\u0018\u00010^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010_\u001a\u0004\bh\u0010aR*\u0010s\u001a\u00020\u00132\u0006\u0010r\u001a\u00020\u00138G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010i\u001a\u0004\bs\u0010d\"\u0004\bt\u0010uR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bv\u0010l¨\u0006y"}, m28850d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "(Ljava/lang/String;)V", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "Landroid/net/Uri;", "", "o", "(Landroid/net/Uri;)Z", OperatorName.MOVE_TO, "(Ljava/lang/String;)Z", OperatorName.ENDPATH, "fragment", "Landroid/os/Bundle;", "bundle", "", "Landroidx/navigation/NavArgument;", "arguments", OperatorName.CLOSE_PATH, "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", OperatorName.FILL_NON_ZERO, "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "deepLink", OperatorName.NON_STROKING_GRAY, "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Landroidx/navigation/NavDeepLink$c;", "storedParam", OperatorName.CLOSE_AND_STROKE, "(Ljava/util/List;Landroidx/navigation/NavDeepLink$c;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "p", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)Z", OperatorName.SAVE, "u", "()V", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Ljava/util/Map;", "Lkotlin/Pair;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lkotlin/Pair;", "t", "matches$navigation_common_release", "matches", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "getMimeTypeMatchRating", "(Ljava/lang/String;)I", "getMatchingArguments", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingPathAndQueryArgs", "requestedLink", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "calculateMatchingPathSegments", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getAction", OperatorName.CURVE_TO, "getMimeType", "d", "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Ljava/util/regex/Pattern;", "Lkotlin/Lazy;", OperatorName.SET_LINE_JOINSTYLE, "()Ljava/util/regex/Pattern;", "pathPattern", OperatorName.LINE_TO, "()Z", "isParameterizedQuery", OperatorName.NON_STROKING_CMYK, "queryArgsMap", "i", "Z", "isSingleQueryParamValueOnly", "fragArgsAndRegex", "()Ljava/util/List;", "fragArgs", "fragRegex", "fragPattern", "mimeTypeRegex", "mimeTypePattern", "<set-?>", "isExactDeepLink", "setExactDeepLink$navigation_common_release", "(Z)V", "getArgumentsNames$navigation_common_release", "argumentsNames", "Builder", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavDeepLink {

    /* renamed from: q */
    public static final C4808a f36270q = new C4808a(null);

    /* renamed from: r */
    public static final Pattern f36271r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s */
    public static final Pattern f36272s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a */
    public final String f36273a;

    /* renamed from: b */
    public final String f36274b;

    /* renamed from: c */
    public final String f36275c;

    /* renamed from: d */
    public final List f36276d;

    /* renamed from: e */
    public String f36277e;

    /* renamed from: f */
    public final Lazy f36278f;

    /* renamed from: g */
    public final Lazy f36279g;

    /* renamed from: h */
    public final Lazy f36280h;

    /* renamed from: i */
    public boolean f36281i;

    /* renamed from: j */
    public final Lazy f36282j;

    /* renamed from: k */
    public final Lazy f36283k;

    /* renamed from: l */
    public final Lazy f36284l;

    /* renamed from: m */
    public final Lazy f36285m;

    /* renamed from: n */
    public String f36286n;

    /* renamed from: o */
    public final Lazy f36287o;

    /* renamed from: p */
    public boolean f36288p;

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m28850d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "uriPattern", "setUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", "action", "setAction", "mimeType", "setMimeType", "Landroidx/navigation/NavDeepLink;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "()Landroidx/navigation/NavDeepLink;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Companion", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Builder {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        public String f36289a;

        /* renamed from: b */
        public String f36290b;

        /* renamed from: c */
        public String f36291c;

        @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m28850d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "()V", "fromAction", "Landroidx/navigation/NavDeepLink$Builder;", "action", "", "fromMimeType", "mimeType", "fromUriPattern", "uriPattern", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        @SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Builder fromAction(@NotNull String action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.length() > 0) {
                    Builder builder = new Builder();
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @JvmStatic
            @NotNull
            public final Builder fromMimeType(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            @JvmStatic
            @NotNull
            public final Builder fromUriPattern(@NotNull String uriPattern) {
                Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            public Companion() {
            }
        }

        @JvmStatic
        @NotNull
        public static final Builder fromAction(@NotNull String str) {
            return Companion.fromAction(str);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromMimeType(@NotNull String str) {
            return Companion.fromMimeType(str);
        }

        @JvmStatic
        @NotNull
        public static final Builder fromUriPattern(@NotNull String str) {
            return Companion.fromUriPattern(str);
        }

        @NotNull
        public final NavDeepLink build() {
            return new NavDeepLink(this.f36289a, this.f36290b, this.f36291c);
        }

        @NotNull
        public final Builder setAction(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() > 0) {
                this.f36290b = action;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        @NotNull
        public final Builder setMimeType(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.f36291c = mimeType;
            return this;
        }

        @NotNull
        public final Builder setUriPattern(@NotNull String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.f36289a = uriPattern;
            return this;
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$a */
    /* loaded from: classes2.dex */
    public static final class C4808a {
        public /* synthetic */ C4808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C4808a() {
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$b */
    /* loaded from: classes2.dex */
    public static final class C4809b implements Comparable {

        /* renamed from: a */
        public String f36292a;

        /* renamed from: b */
        public String f36293b;

        public C4809b(String mimeType) {
            List emptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> split = new Regex(RemoteSettings.FORWARD_SLASH_STRING).split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt___CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            this.f36292a = (String) emptyList.get(0);
            this.f36293b = (String) emptyList.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C4809b other) {
            int i;
            Intrinsics.checkNotNullParameter(other, "other");
            if (Intrinsics.areEqual(this.f36292a, other.f36292a)) {
                i = 2;
            } else {
                i = 0;
            }
            if (Intrinsics.areEqual(this.f36293b, other.f36293b)) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: b */
        public final String m53854b() {
            return this.f36293b;
        }

        /* renamed from: c */
        public final String m53853c() {
            return this.f36292a;
        }
    }

    /* renamed from: androidx.navigation.NavDeepLink$c */
    /* loaded from: classes2.dex */
    public static final class C4810c {

        /* renamed from: a */
        public String f36294a;

        /* renamed from: b */
        public final List f36295b = new ArrayList();

        /* renamed from: a */
        public final void m53852a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f36295b.add(name);
        }

        /* renamed from: b */
        public final List m53851b() {
            return this.f36295b;
        }

        /* renamed from: c */
        public final String m53850c() {
            return this.f36294a;
        }

        /* renamed from: d */
        public final void m53849d(String str) {
            this.f36294a = str;
        }
    }

    public NavDeepLink(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f36273a = str;
        this.f36274b = str2;
        this.f36275c = str3;
        this.f36276d = new ArrayList();
        this.f36278f = LazyKt__LazyJVMKt.lazy(new NavDeepLink$pathPattern$2(this));
        this.f36279g = LazyKt__LazyJVMKt.lazy(new NavDeepLink$isParameterizedQuery$2(this));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f36280h = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new NavDeepLink$queryArgsMap$2(this));
        this.f36282j = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new NavDeepLink$fragArgsAndRegex$2(this));
        this.f36283k = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new NavDeepLink$fragArgs$2(this));
        this.f36284l = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new NavDeepLink$fragRegex$2(this));
        this.f36285m = LazyKt__LazyJVMKt.lazy(new NavDeepLink$fragPattern$2(this));
        this.f36287o = LazyKt__LazyJVMKt.lazy(new NavDeepLink$mimeTypePattern$2(this));
        m53857u();
        m53858t();
    }

    /* renamed from: a */
    public final void m53877a(String str, List list, StringBuilder sb) {
        Matcher matcher = f36272s.matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i) {
                String substring = str.substring(i, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
            }
            sb.append("([^/]+?)");
            i = matcher.end();
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
    }

    /* renamed from: b */
    public final List m53876b() {
        return (List) this.f36283k.getValue();
    }

    /* renamed from: c */
    public final Pair m53875c() {
        return (Pair) this.f36282j.getValue();
    }

    public final int calculateMatchingPathSegments$navigation_common_release(@Nullable Uri uri) {
        if (uri != null && this.f36273a != null) {
            List<String> requestedPathSegments = uri.getPathSegments();
            List<String> uriPathSegments = Uri.parse(this.f36273a).getPathSegments();
            Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
            Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
            return CollectionsKt___CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
        }
        return 0;
    }

    /* renamed from: d */
    public final Pattern m53874d() {
        return (Pattern) this.f36285m.getValue();
    }

    /* renamed from: e */
    public final String m53873e() {
        return (String) this.f36284l.getValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        if (!Intrinsics.areEqual(this.f36273a, navDeepLink.f36273a) || !Intrinsics.areEqual(this.f36274b, navDeepLink.f36274b) || !Intrinsics.areEqual(this.f36275c, navDeepLink.f36275c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m53872f(Matcher matcher, Bundle bundle, Map map) {
        List list = this.f36276d;
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i2));
            NavArgument navArgument = (NavArgument) map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (m53862p(bundle, str, value, navArgument)) {
                    return false;
                }
                arrayList.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m53871g(Uri uri, Bundle bundle, Map map) {
        String query;
        for (Map.Entry entry : m53867k().entrySet()) {
            C4810c c4810c = (C4810c) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters((String) entry.getKey());
            if (this.f36281i && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = AbstractC10108ds.listOf(query);
            }
            if (!m53859s(queryParameters, c4810c, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final String getAction() {
        return this.f36274b;
    }

    @NotNull
    public final List<String> getArgumentsNames$navigation_common_release() {
        List list = this.f36276d;
        ArrayList arrayList = new ArrayList();
        for (C4810c c4810c : m53867k().values()) {
            AbstractC10410hs.addAll(arrayList, c4810c.m53851b());
        }
        return CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) m53876b());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle getMatchingArguments(@NotNull Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern m53868j = m53868j();
        if (m53868j != null) {
            matcher = m53868j.matcher(deepLink.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!m53872f(matcher, bundle, arguments)) {
            return null;
        }
        if (m53866l() && !m53871g(deepLink, bundle, arguments)) {
            return null;
        }
        m53870h(deepLink.getFragment(), bundle, arguments);
        if (!NavArgumentKt.missingRequiredArguments(arguments, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    @NotNull
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(@Nullable Uri uri, @NotNull Map<String, NavArgument> arguments) {
        Matcher matcher;
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern m53868j = m53868j();
        if (m53868j != null) {
            matcher = m53868j.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return bundle;
        }
        if (!matcher.matches()) {
            return bundle;
        }
        m53872f(matcher, bundle, arguments);
        if (m53866l()) {
            m53871g(uri, bundle, arguments);
        }
        return bundle;
    }

    @Nullable
    public final String getMimeType() {
        return this.f36275c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.f36275c != null) {
            Pattern m53869i = m53869i();
            Intrinsics.checkNotNull(m53869i);
            if (m53869i.matcher(mimeType).matches()) {
                return new C4809b(this.f36275c).compareTo(new C4809b(mimeType));
            }
        }
        return -1;
    }

    @Nullable
    public final String getUriPattern() {
        return this.f36273a;
    }

    /* renamed from: h */
    public final void m53870h(String str, Bundle bundle, Map map) {
        Matcher matcher;
        Pattern m53874d = m53874d();
        if (m53874d != null) {
            matcher = m53874d.matcher(String.valueOf(str));
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return;
        }
        List m53876b = m53876b();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(m53876b, 10));
        int i = 0;
        for (Object obj : m53876b) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            String value = Uri.decode(matcher.group(i2));
            NavArgument navArgument = (NavArgument) map.get(str2);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (m53862p(bundle, str2, value, navArgument)) {
                    return;
                }
                arrayList.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f36273a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.f36274b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f36275c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final Pattern m53869i() {
        return (Pattern) this.f36287o.getValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.f36288p;
    }

    /* renamed from: j */
    public final Pattern m53868j() {
        return (Pattern) this.f36278f.getValue();
    }

    /* renamed from: k */
    public final Map m53867k() {
        return (Map) this.f36280h.getValue();
    }

    /* renamed from: l */
    public final boolean m53866l() {
        return ((Boolean) this.f36279g.getValue()).booleanValue();
    }

    /* renamed from: m */
    public final boolean m53865m(String str) {
        boolean z;
        boolean z2;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f36274b;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2 && (str == null || Intrinsics.areEqual(str2, str))) {
            return true;
        }
        return false;
    }

    public final boolean matches$navigation_common_release(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    /* renamed from: n */
    public final boolean m53864n(String str) {
        boolean z;
        boolean z2;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f36275c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (str == null) {
                return true;
            }
            Pattern m53869i = m53869i();
            Intrinsics.checkNotNull(m53869i);
            if (m53869i.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m53863o(Uri uri) {
        boolean z;
        boolean z2;
        if (uri == null) {
            z = true;
        } else {
            z = false;
        }
        if (m53868j() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            if (uri == null) {
                return true;
            }
            Pattern m53868j = m53868j();
            Intrinsics.checkNotNull(m53868j);
            if (m53868j.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m53862p(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    /* renamed from: q */
    public final boolean m53861q(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument != null) {
            NavType<Object> type = navArgument.getType();
            type.parseAndPut(bundle, str, str2, type.get(bundle, str));
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public final Pair m53860r() {
        String str = this.f36273a;
        if (str != null && Uri.parse(str).getFragment() != null) {
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(this.f36273a).getFragment();
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNull(fragment);
            m53877a(fragment, arrayList, sb);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "fragRegex.toString()");
            return TuplesKt.m28844to(arrayList, sb2);
        }
        return null;
    }

    /* renamed from: s */
    public final boolean m53859s(List list, C4810c c4810c, Bundle bundle, Map map) {
        Matcher matcher;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String m53850c = c4810c.m53850c();
                if (m53850c != null) {
                    matcher = Pattern.compile(m53850c, 32).matcher(str);
                } else {
                    matcher = null;
                }
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                Bundle bundle2 = new Bundle();
                try {
                    List m53851b = c4810c.m53851b();
                    ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(m53851b, 10));
                    int i = 0;
                    for (Object obj : m53851b) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        String str2 = (String) obj;
                        String group = matcher.group(i2);
                        if (group == null) {
                            group = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                        }
                        NavArgument navArgument = (NavArgument) map.get(str2);
                        if (m53861q(bundle, str2, group, navArgument)) {
                            if (!Intrinsics.areEqual(group, '{' + str2 + '}') && m53862p(bundle2, str2, group, navArgument)) {
                                return false;
                            }
                        }
                        arrayList.add(Unit.INSTANCE);
                        i = i2;
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return true;
        }
        return true;
    }

    public final void setExactDeepLink$navigation_common_release(boolean z) {
        this.f36288p = z;
    }

    /* renamed from: t */
    public final void m53858t() {
        if (this.f36275c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f36275c).matches()) {
            C4809b c4809b = new C4809b(this.f36275c);
            this.f36286n = AbstractC20204hN1.replace$default("^(" + c4809b.m53853c() + "|[*]+)/(" + c4809b.m53854b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.f36275c + " does not match to required \"type/subtype\" format").toString());
    }

    /* renamed from: u */
    public final void m53857u() {
        if (this.f36273a == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f36271r.matcher(this.f36273a).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f36273a);
        matcher.find();
        boolean z = false;
        String substring = this.f36273a.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        m53877a(substring, this.f36276d, sb);
        if (!StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) ".*", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) sb, (CharSequence) "([^/]+?)", false, 2, (Object) null)) {
            z = true;
        }
        this.f36288p = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "uriRegex.toString()");
        this.f36277e = AbstractC20204hN1.replace$default(sb2, ".*", "\\E.*\\Q", false, 4, (Object) null);
    }

    /* renamed from: v */
    public final Map m53856v() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!m53866l()) {
            return linkedHashMap;
        }
        Uri parse = Uri.parse(this.f36273a);
        for (String paramName : parse.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParams = parse.getQueryParameters(paramName);
            if (queryParams.size() <= 1) {
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String queryParam = (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) queryParams);
                if (queryParam == null) {
                    this.f36281i = true;
                    queryParam = paramName;
                }
                Matcher matcher = f36272s.matcher(queryParam);
                C4810c c4810c = new C4810c();
                int i = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
                    c4810c.m53852a(group);
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring = queryParam.substring(i, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(Pattern.quote(substring));
                    sb.append("(.+?)?");
                    i = matcher.end();
                }
                if (i < queryParam.length()) {
                    Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    sb.append(Pattern.quote(substring2));
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "argRegex.toString()");
                c4810c.m53849d(AbstractC20204hN1.replace$default(sb2, ".*", "\\E.*\\Q", false, 4, (Object) null));
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                linkedHashMap.put(paramName, c4810c);
            } else {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.f36273a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return linkedHashMap;
    }

    public final boolean matches$navigation_common_release(@NotNull NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        if (m53863o(deepLinkRequest.getUri()) && m53865m(deepLinkRequest.getAction())) {
            return m53864n(deepLinkRequest.getMimeType());
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@NotNull String uri) {
        this(uri, null, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }
}
