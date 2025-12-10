package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDeepLinkRequest;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0012\b\u0016\u0018\u0000 }2\u00020\u0001:\u0003~}\u007fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001a\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0005J\u0015\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\t¢\u0006\u0004\b \u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u0002H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020\u001cH\u0017¢\u0006\u0004\b%\u0010(J\u001b\u0010+\u001a\u00020*2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0017¢\u0006\u0004\b0\u00101J\u0019\u00105\u001a\u0004\u0018\u0001042\b\b\u0001\u00103\u001a\u000202¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\u00172\b\b\u0001\u00107\u001a\u0002022\b\b\u0001\u00108\u001a\u000202¢\u0006\u0004\b9\u0010:J\u001f\u00109\u001a\u00020\u00172\b\b\u0001\u00107\u001a\u0002022\u0006\u0010;\u001a\u000204¢\u0006\u0004\b9\u0010<J\u0017\u0010=\u001a\u00020\u00172\b\b\u0001\u00107\u001a\u000202¢\u0006\u0004\b=\u0010>J\u001d\u0010A\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u000e¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0002¢\u0006\u0004\bC\u0010\u0005J\u001b\u0010E\u001a\u0004\u0018\u00010-2\b\u0010D\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\bE\u0010FJ!\u0010H\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010-¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0002H\u0016¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00102\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u000202H\u0016¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010KR.\u0010[\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010S8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010QR$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\t0f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u0002040j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR,\u00103\u001a\u0002022\b\b\u0001\u00103\u001a\u0002028G@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010P\"\u0004\bu\u0010>R.\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010Q\u001a\u0004\bw\u0010K\"\u0004\bx\u0010\u0005R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010|\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010K¨\u0006\u0080\u0001"}, m28850d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavDeepLink;", "deepLink", "Landroid/net/Uri;", "uri", "", "Landroidx/navigation/NavArgument;", "arguments", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/navigation/NavDeepLink;Landroid/net/Uri;Ljava/util/Map;)Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "hasDeepLink", "(Landroid/net/Uri;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "uriPattern", "addDeepLink", "navDeepLink", "(Landroidx/navigation/NavDeepLink;)V", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "id", "Landroidx/navigation/NavAction;", "getAction", "(I)Landroidx/navigation/NavAction;", "actionId", "destId", "putAction", "(II)V", "action", "(ILandroidx/navigation/NavAction;)V", "removeAction", "(I)V", "argumentName", "argument", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "removeArgument", "args", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "bundle", "fillInLabel", "(Landroid/content/Context;Landroid/os/Bundle;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/NavGraph;", "<set-?>", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "parent", OperatorName.CURVE_TO, "idName", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "", "e", "Ljava/util/List;", "deepLinks", "Landroidx/collection/SparseArrayCompat;", OperatorName.FILL_NON_ZERO, "Landroidx/collection/SparseArrayCompat;", "actions", "", OperatorName.NON_STROKING_GRAY, "Ljava/util/Map;", "_arguments", OperatorName.CLOSE_PATH, "I", "getId", "setId", "i", "getRoute", "setRoute", "getArguments", "()Ljava/util/Map;", "getDisplayName", "displayName", "Companion", "ClassType", "DeepLinkMatch", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,822:1\n232#2,3:823\n1#3:826\n288#4,2:827\n1549#4:830\n1620#4,3:831\n1855#4,2:842\n1855#4,2:845\n1855#4,2:848\n29#5:829\n1206#6,2:834\n1206#6,2:836\n1206#6,2:838\n1206#6,2:840\n32#7:844\n33#7:847\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n191#1:823,3\n231#1:827,2\n464#1:830\n464#1:831,3\n707#1:842,2\n715#1:845,2\n719#1:848,2\n370#1:829\n683#1:834,2\n684#1:836,2\n687#1:838,2\n691#1:840,2\n712#1:844\n712#1:847\n*E\n"})
/* loaded from: classes2.dex */
public class NavDestination {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    public static final Map f36314j = new LinkedHashMap();

    /* renamed from: a */
    public final String f36315a;

    /* renamed from: b */
    public NavGraph f36316b;

    /* renamed from: c */
    public String f36317c;

    /* renamed from: d */
    public CharSequence f36318d;

    /* renamed from: e */
    public final List f36319e;

    /* renamed from: f */
    public final SparseArrayCompat f36320f;

    /* renamed from: g */
    public Map f36321g;

    /* renamed from: h */
    public int f36322h;

    /* renamed from: i */
    public String f36323i;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, m28850d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "value", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    /* loaded from: classes2.dex */
    public @interface ClassType {
        Class<?> value();
    }

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J:\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0005J:\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m28850d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "()V", "classes", "", "", "Ljava/lang/Class;", "hierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "createRoute", "route", "getDisplayName", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "id", "", "parseClassFromName", "C", "name", "expectedClassType", "parseClassFromNameInternal", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String createRoute(@Nullable String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final String getDisplayName(@NotNull Context context, int i) {
            String valueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        @NotNull
        public final Sequence<NavDestination> getHierarchy(@NotNull NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "<this>");
            return SequencesKt__SequencesKt.generateSequence(navDestination, NavDestination$Companion$hierarchy$1.INSTANCE);
        }

        @JvmStatic
        @NotNull
        public final <C> Class<? extends C> parseClassFromName(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.f36314j.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.f36314j.put(name, cls);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            Intrinsics.checkNotNull(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final <C> Class<? extends C> parseClassFromNameInternal(@NotNull Context context, @NotNull String name, @NotNull Class<? extends C> expectedClassType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006\""}, m28850d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "Landroidx/navigation/NavDestination;", FirebaseAnalytics.Param.DESTINATION, "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "other", "compareTo", "(Landroidx/navigation/NavDestination$DeepLinkMatch;)I", "arguments", "hasMatchingArgs", "(Landroid/os/Bundle;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/os/Bundle;", "getMatchingArgs", "()Landroid/os/Bundle;", OperatorName.CURVE_TO, "Z", "d", "I", "e", OperatorName.FILL_NON_ZERO, "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,822:1\n1855#2,2:823\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n127#1:823,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        /* renamed from: a */
        public final NavDestination f36324a;

        /* renamed from: b */
        public final Bundle f36325b;

        /* renamed from: c */
        public final boolean f36326c;

        /* renamed from: d */
        public final int f36327d;

        /* renamed from: e */
        public final boolean f36328e;

        /* renamed from: f */
        public final int f36329f;

        public DeepLinkMatch(@NotNull NavDestination destination, @Nullable Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f36324a = destination;
            this.f36325b = bundle;
            this.f36326c = z;
            this.f36327d = i;
            this.f36328e = z2;
            this.f36329f = i2;
        }

        @NotNull
        public final NavDestination getDestination() {
            return this.f36324a;
        }

        @Nullable
        public final Bundle getMatchingArgs() {
            return this.f36325b;
        }

        public final boolean hasMatchingArgs(@Nullable Bundle bundle) {
            Bundle bundle2;
            NavType<Object> navType;
            Object obj;
            if (bundle == null || (bundle2 = this.f36325b) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "matchingArgs.keySet()");
            for (String key : keySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = this.f36324a.getArguments().get(key);
                Object obj2 = null;
                if (navArgument != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (navType != null) {
                    Bundle bundle3 = this.f36325b;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj = navType.get(bundle3, key);
                } else {
                    obj = null;
                }
                if (navType != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    obj2 = navType.get(bundle, key);
                }
                if (!Intrinsics.areEqual(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f36326c;
            if (!z || other.f36326c) {
                if (z || !other.f36326c) {
                    int i = this.f36327d - other.f36327d;
                    if (i > 0) {
                        return 1;
                    }
                    if (i < 0) {
                        return -1;
                    }
                    Bundle bundle = this.f36325b;
                    if (bundle == null || other.f36325b != null) {
                        if (bundle != null || other.f36325b == null) {
                            if (bundle != null) {
                                int size = bundle.size();
                                Bundle bundle2 = other.f36325b;
                                Intrinsics.checkNotNull(bundle2);
                                int size2 = size - bundle2.size();
                                if (size2 > 0) {
                                    return 1;
                                }
                                if (size2 < 0) {
                                    return -1;
                                }
                            }
                            boolean z2 = this.f36328e;
                            if (!z2 || other.f36328e) {
                                if (z2 || !other.f36328e) {
                                    return this.f36329f - other.f36329f;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    public NavDestination(@NotNull String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.f36315a = navigatorName;
        this.f36319e = new ArrayList();
        this.f36320f = new SparseArrayCompat();
        this.f36321g = new LinkedHashMap();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.buildDeepLinkIds(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String getDisplayName(@NotNull Context context, int i) {
        return Companion.getDisplayName(context, i);
    }

    @NotNull
    public static final Sequence<NavDestination> getHierarchy(@NotNull NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    @JvmStatic
    @NotNull
    public static final <C> Class<? extends C> parseClassFromName(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final <C> Class<? extends C> parseClassFromNameInternal(@NotNull Context context, @NotNull String str, @NotNull Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    /* renamed from: a */
    public final boolean m53843a(NavDeepLink navDeepLink, Uri uri, Map map) {
        return NavArgumentKt.missingRequiredArguments(map, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(navDeepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, map))).isEmpty();
    }

    public final void addArgument(@NotNull String argumentName, @NotNull NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.f36321g.put(argumentName, argument);
    }

    public final void addDeepLink(@NotNull String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle addInDefaultArgs(@Nullable Bundle bundle) {
        Map map;
        if (bundle == null && ((map = this.f36321g) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f36321g.entrySet()) {
            ((NavArgument) entry.getValue()).putDefaultValue((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f36321g.entrySet()) {
                String str = (String) entry2.getKey();
                NavArgument navArgument = (NavArgument) entry2.getValue();
                if (!navArgument.verify(str, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + str + "' in argument bundle. " + navArgument.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        NavDestination navDestination = (NavDestination) obj;
        if (CollectionsKt___CollectionsKt.intersect(this.f36319e, navDestination.f36319e).size() == this.f36319e.size()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f36320f.size() == navDestination.f36320f.size()) {
            Iterator it = SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(this.f36320f)).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!navDestination.f36320f.containsValue((NavAction) it.next())) {
                        break;
                    }
                } else {
                    for (NavAction navAction : SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(navDestination.f36320f))) {
                        if (!this.f36320f.containsValue(navAction)) {
                        }
                    }
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (getArguments().size() == navDestination.getArguments().size()) {
            Iterator it2 = AbstractC18643Vn0.asSequence(getArguments()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (navDestination.getArguments().containsKey(entry.getKey())) {
                        if (!Intrinsics.areEqual(navDestination.getArguments().get(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    for (Map.Entry entry2 : AbstractC18643Vn0.asSequence(navDestination.getArguments())) {
                        if (getArguments().containsKey(entry2.getKey())) {
                            if (!Intrinsics.areEqual(getArguments().get(entry2.getKey()), entry2.getValue())) {
                            }
                        }
                    }
                    z3 = true;
                }
            }
        }
        z3 = false;
        if (this.f36322h != navDestination.f36322h || !Intrinsics.areEqual(this.f36323i, navDestination.f36323i) || !z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    @Nullable
    public final String fillInLabel(@NotNull Context context, @Nullable Bundle bundle) {
        NavType<Object> navType;
        NavArgument navArgument;
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence charSequence = this.f36318d;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (bundle != null && bundle.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, "");
                if (group != null && (navArgument = getArguments().get(group)) != null) {
                    navType = navArgument.getType();
                } else {
                    navType = null;
                }
                if (Intrinsics.areEqual(navType, NavType.ReferenceType)) {
                    String string = context.getString(bundle.getInt(group));
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(bundle.getInt(argName))");
                    stringBuffer.append(string);
                } else {
                    stringBuffer.append(bundle.getString(group));
                }
            } else {
                throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Nullable
    public final NavAction getAction(@IdRes int i) {
        NavAction navAction;
        if (this.f36320f.isEmpty()) {
            navAction = null;
        } else {
            navAction = (NavAction) this.f36320f.get(i);
        }
        if (navAction == null) {
            NavGraph navGraph = this.f36316b;
            if (navGraph == null) {
                return null;
            }
            return navGraph.getAction(i);
        }
        return navAction;
    }

    @NotNull
    public final Map<String, NavArgument> getArguments() {
        return AbstractC11687a.toMap(this.f36321g);
    }

    @IdRes
    public final int getId() {
        return this.f36322h;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.f36318d;
    }

    @NotNull
    public final String getNavigatorName() {
        return this.f36315a;
    }

    @Nullable
    public final NavGraph getParent() {
        return this.f36316b;
    }

    @Nullable
    public final String getRoute() {
        return this.f36323i;
    }

    public boolean hasDeepLink(@NotNull Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(@NotNull String route, @Nullable Bundle bundle) {
        NavDestination navDestination;
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.f36323i, route)) {
            return true;
        }
        DeepLinkMatch matchDeepLink = matchDeepLink(route);
        if (matchDeepLink != null) {
            navDestination = matchDeepLink.getDestination();
        } else {
            navDestination = null;
        }
        if (!Intrinsics.areEqual(this, navDestination)) {
            return false;
        }
        return matchDeepLink.hasMatchingArgs(bundle);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Set<String> keySet;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f36322h * 31;
        String str = this.f36323i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i8 + i;
        for (NavDeepLink navDeepLink : this.f36319e) {
            int i10 = i9 * 31;
            String uriPattern = navDeepLink.getUriPattern();
            if (uriPattern != null) {
                i5 = uriPattern.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            String action = navDeepLink.getAction();
            if (action != null) {
                i6 = action.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String mimeType = navDeepLink.getMimeType();
            if (mimeType != null) {
                i7 = mimeType.hashCode();
            } else {
                i7 = 0;
            }
            i9 = i12 + i7;
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.f36320f);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = ((i9 * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            if (navOptions != null) {
                i3 = navOptions.hashCode();
            } else {
                i3 = 0;
            }
            i9 = destinationId + i3;
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i13 = i9 * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    Intrinsics.checkNotNull(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    if (obj != null) {
                        i4 = obj.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i9 = i13 + i4;
                }
            }
        }
        for (String str3 : getArguments().keySet()) {
            int hashCode = ((i9 * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = getArguments().get(str3);
            if (navArgument != null) {
                i2 = navArgument.hashCode();
            } else {
                i2 = 0;
            }
            i9 = hashCode + i2;
        }
        return i9;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final DeepLinkMatch matchDeepLink(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        NavDeepLinkRequest.Builder.Companion companion = NavDeepLinkRequest.Builder.Companion;
        Uri parse = Uri.parse(Companion.createRoute(route));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        NavDeepLinkRequest build = companion.fromUri(parse).build();
        if (this instanceof NavGraph) {
            return ((NavGraph) this).matchDeepLinkExcludingChildren(build);
        }
        return matchDeepLink(build);
    }

    @CallSuper
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        setRoute(obtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        if (obtainAttributes.hasValue(androidx.navigation.common.R.styleable.Navigator_android_id)) {
            setId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.Navigator_android_id, 0));
            this.f36317c = Companion.getDisplayName(context, this.f36322h);
        }
        this.f36318d = obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i, @IdRes int i2) {
        putAction(i, new NavAction(i2, null, null, 6, null));
    }

    public final void removeAction(@IdRes int i) {
        this.f36320f.remove(i);
    }

    public final void removeArgument(@NotNull String argumentName) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        this.f36321g.remove(argumentName);
    }

    public final void setId(@IdRes int i) {
        this.f36322h = i;
        this.f36317c = null;
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        this.f36318d = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(@Nullable NavGraph navGraph) {
        this.f36316b = navGraph;
    }

    public final void setRoute(@Nullable String str) {
        Object obj;
        if (str == null) {
            setId(0);
        } else if (!AbstractC20204hN1.isBlank(str)) {
            String createRoute = Companion.createRoute(str);
            setId(createRoute.hashCode());
            addDeepLink(createRoute);
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        List list = this.f36319e;
        List list2 = list;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((NavDeepLink) obj).getUriPattern(), Companion.createRoute(this.f36323i))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(list2).remove(obj);
        this.f36323i = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f36317c;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f36322h));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f36323i;
        if (str2 != null && !AbstractC20204hN1.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.f36323i);
        }
        if (this.f36318d != null) {
            sb.append(" label=");
            sb.append(this.f36318d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final void addDeepLink(@NotNull NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(getArguments(), new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
        if (missingRequiredArguments.isEmpty()) {
            this.f36319e.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + missingRequiredArguments).toString());
    }

    @JvmOverloads
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final int[] buildDeepLinkIds(@Nullable NavDestination navDestination) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this;
        while (true) {
            Intrinsics.checkNotNull(navGraph);
            NavGraph navGraph2 = navGraph.f36316b;
            if ((navDestination != null ? navDestination.f36316b : null) != null) {
                NavGraph navGraph3 = navDestination.f36316b;
                Intrinsics.checkNotNull(navGraph3);
                if (navGraph3.findNode(navGraph.f36322h) == navGraph) {
                    arrayDeque.addFirst(navGraph);
                    break;
                }
            }
            if (navGraph2 == null || navGraph2.getStartDestinationId() != navGraph.f36322h) {
                arrayDeque.addFirst(navGraph);
            }
            if (Intrinsics.areEqual(navGraph2, navDestination) || navGraph2 == null) {
                break;
            }
            navGraph = navGraph2;
        }
        List<NavDestination> list = CollectionsKt___CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(list, 10));
        for (NavDestination navDestination2 : list) {
            arrayList.add(Integer.valueOf(navDestination2.f36322h));
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        String str = this.f36317c;
        return str == null ? String.valueOf(this.f36322h) : str;
    }

    public boolean hasDeepLink(@NotNull NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    public final void putAction(@IdRes int i, @NotNull NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (supportsActions()) {
            if (i != 0) {
                this.f36320f.put(i, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@NotNull Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f36319e.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.f36319e) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, getArguments()) : null;
            int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z = action != null && Intrinsics.areEqual(action, navDeepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments == null) {
                if (z || mimeTypeMatchRating > -1) {
                    if (m53843a(navDeepLink, uri, getArguments())) {
                    }
                }
            }
            DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), calculateMatchingPathSegments$navigation_common_release, z, mimeTypeMatchRating);
            if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                deepLinkMatch = deepLinkMatch2;
            }
        }
        return deepLinkMatch;
    }
}
