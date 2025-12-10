package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001TB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u000b2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001c\"\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010 \u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$J#\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b \u0010'J!\u0010 \u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b \u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)H\u0086\u0002¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0000¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b/\u0010\u0017J\r\u00100\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001eH\u0007¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u001e¢\u0006\u0004\b5\u00106J\u0015\u00105\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\"¢\u0006\u0004\b5\u00108J\u000f\u00109\u001a\u00020\"H\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010;H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001eH\u0016¢\u0006\u0004\b>\u00103R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010?8G¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR.\u0010L\u001a\u0004\u0018\u00010\"2\b\u00107\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010:\"\u0004\bK\u00108R\u0014\u0010N\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010:R$\u0010Q\u001a\u00020\u001e2\u0006\u00104\u001a\u00020\u001e8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u00103\"\u0004\bP\u00106R\u0011\u0010S\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\bR\u0010:¨\u0006U"}, m28850d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "request", "matchDeepLinkExcludingChildren", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "", "route", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "", "searchParents", "(IZ)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "other", "addAll", "(Landroidx/navigation/NavGraph;)V", ProductAction.ACTION_REMOVE, "clear", "()V", "getStartDestination", "()I", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/collection/SparseArrayCompat;", OperatorName.NON_STROKING_CMYK, "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", OperatorName.LINE_TO, "I", OperatorName.MOVE_TO, "Ljava/lang/String;", "startDestIdName", OperatorName.ENDPATH, "getStartDestinationRoute", OperatorName.CURVE_TO, "startDestinationRoute", "getDisplayName", "displayName", "getStartDestinationId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "startDestinationId", "getStartDestDisplayName", "startDestDisplayName", "Companion", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 7 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,479:1\n232#2,3:480\n1603#3,9:483\n1855#3:492\n1856#3:494\n1612#3:495\n1#4:493\n1#4:496\n179#5,2:497\n32#6,2:499\n22#7:501\n56#7,4:502\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n59#1:480,3\n71#1:483,9\n71#1:492\n71#1:494\n71#1:495\n71#1:493\n196#1:497,2\n387#1:499,2\n389#1:501\n396#1:502,4\n*E\n"})
/* loaded from: classes2.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    public final SparseArrayCompat f36337k;

    /* renamed from: l */
    public int f36338l;

    /* renamed from: m */
    public String f36339m;

    /* renamed from: n */
    public String f36340n;

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007¨\u0006\u0006"}, m28850d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "()V", "findStartDestination", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.last(SequencesKt__SequencesKt.generateSequence(navGraph.findNode(navGraph.getStartDestinationId()), NavGraph$Companion$findStartDestination$1.INSTANCE));
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@NotNull Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f36337k = new SparseArrayCompat();
    }

    @JvmStatic
    @NotNull
    public static final NavDestination findStartDestination(@NotNull NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    public final void addAll(@NotNull NavGraph other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            it.remove();
            addDestination(it.next());
        }
    }

    public final void addDestination(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int id2 = node.getId();
        String route = node.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (getRoute() != null && !(!Intrinsics.areEqual(route, getRoute()))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        } else if (id2 != getId()) {
            NavDestination navDestination = (NavDestination) this.f36337k.get(id2);
            if (navDestination == node) {
                return;
            }
            if (node.getParent() == null) {
                if (navDestination != null) {
                    navDestination.setParent(null);
                }
                node.setParent(this);
                this.f36337k.put(node.getId(), node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        } else {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
    }

    public final void addDestinations(@NotNull Collection<? extends NavDestination> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    /* renamed from: b */
    public final void m53842b(int i) {
        if (i != getId()) {
            if (this.f36340n != null) {
                m53841c(null);
            }
            this.f36338l = i;
            this.f36339m = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: c */
    public final void m53841c(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!Intrinsics.areEqual(str, getRoute())) {
            if (!AbstractC20204hN1.isBlank(str)) {
                hashCode = NavDestination.Companion.createRoute(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.f36338l = hashCode;
        this.f36340n = str;
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        List mutableList = SequencesKt___SequencesKt.toMutableList(SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(this.f36337k)));
        NavGraph navGraph = (NavGraph) obj;
        Iterator valueIterator = SparseArrayKt.valueIterator(navGraph.f36337k);
        while (valueIterator.hasNext()) {
            mutableList.remove((NavDestination) valueIterator.next());
        }
        if (!super.equals(obj) || this.f36337k.size() != navGraph.f36337k.size() || getStartDestinationId() != navGraph.getStartDestinationId() || !mutableList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Nullable
    public final NavDestination findNode(@IdRes int i) {
        return findNode(i, true);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        if (getId() != 0) {
            return super.getDisplayName();
        }
        return "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.f36337k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStartDestDisplayName() {
        if (this.f36339m == null) {
            String str = this.f36340n;
            if (str == null) {
                str = String.valueOf(this.f36338l);
            }
            this.f36339m = str;
        }
        String str2 = this.f36339m;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    @IdRes
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.f36338l;
    }

    @Nullable
    public final String getStartDestinationRoute() {
        return this.f36340n;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat sparseArrayCompat = this.f36337k;
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i)) * 31) + ((NavDestination) sparseArrayCompat.valueAt(i)).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public NavDestination.DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.DeepLinkMatch matchDeepLink2 = it.next().matchDeepLink(navDeepLinkRequest);
            if (matchDeepLink2 != null) {
                arrayList.add(matchDeepLink2);
            }
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new NavDestination.DeepLinkMatch[]{matchDeepLink, (NavDestination.DeepLinkMatch) CollectionsKt___CollectionsKt.maxOrNull((Iterable) arrayList)}));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.DeepLinkMatch matchDeepLinkExcludingChildren(@NotNull NavDeepLinkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return super.matchDeepLink(request);
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        m53842b(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.f36339m = NavDestination.Companion.getDisplayName(context, this.f36338l);
        Unit unit = Unit.INSTANCE;
        obtainAttributes.recycle();
    }

    public final void remove(@NotNull NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int indexOfKey = this.f36337k.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            ((NavDestination) this.f36337k.valueAt(indexOfKey)).setParent(null);
            this.f36337k.removeAt(indexOfKey);
        }
    }

    public final void setStartDestination(int i) {
        m53842b(i);
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination findNode = findNode(this.f36340n);
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (findNode == null) {
            String str = this.f36340n;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f36339m;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f36338l));
                }
            }
        } else {
            sb.append("{");
            sb.append(findNode.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @Nullable
    public final NavDestination findNode(@Nullable String str) {
        if (str == null || AbstractC20204hN1.isBlank(str)) {
            return null;
        }
        return findNode(str, true);
    }

    public final void setStartDestination(@NotNull String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        m53841c(startDestRoute);
    }

    public final void addDestinations(@NotNull NavDestination... nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@IdRes int i, boolean z) {
        NavDestination navDestination = (NavDestination) this.f36337k.get(i);
        if (navDestination == null) {
            if (!z || getParent() == null) {
                return null;
            }
            NavGraph parent = getParent();
            Intrinsics.checkNotNull(parent);
            return parent.findNode(i);
        }
        return navDestination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@NotNull String route, boolean z) {
        ?? r2;
        Intrinsics.checkNotNullParameter(route, "route");
        NavDestination navDestination = (NavDestination) this.f36337k.get(NavDestination.Companion.createRoute(route).hashCode());
        if (navDestination == null) {
            Iterator it = SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(this.f36337k)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    r2 = 0;
                    break;
                }
                r2 = it.next();
                if (((NavDestination) r2).matchDeepLink(route) != null) {
                    break;
                }
            }
            navDestination = r2;
        }
        if (navDestination == null) {
            if (!z || getParent() == null) {
                return null;
            }
            NavGraph parent = getParent();
            Intrinsics.checkNotNull(parent);
            return parent.findNode(route);
        }
        return navDestination;
    }
}
