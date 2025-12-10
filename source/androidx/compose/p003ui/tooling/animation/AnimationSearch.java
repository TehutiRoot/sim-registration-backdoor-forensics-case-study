package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.tooling.PreviewUtilsKt;
import androidx.compose.p003ui.tooling.data.CallGroup;
import androidx.compose.p003ui.tooling.data.Group;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\f0123456789:;B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00170\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u001d\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00170\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006<"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "", "onSeek", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "slotTrees", "findAll", "(Ljava/util/Collection;)V", "trackAll", "()V", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/util/Collection;", "", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/util/Set;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", OperatorName.CURVE_TO, "d", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "transitionSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "animatedContentSearch", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "e", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "animatedVisibilitySearch", OperatorName.FILL_NON_ZERO, "Ljava/util/Set;", "supportedSearch", OperatorName.NON_STROKING_GRAY, "setToTrack", OperatorName.CLOSE_PATH, "setToSearch", "", "getHasAnimations", "()Z", "hasAnimations", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1747#2,3:341\n1855#2:344\n1855#2,2:345\n1856#2:347\n1855#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n*L\n128#1:341,3\n138#1:344\n140#1:345,2\n138#1:347\n154#1:348,2\n*E\n"})
/* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch */
/* loaded from: classes2.dex */
public final class AnimationSearch {

    /* renamed from: a */
    public final Function0 f31646a;

    /* renamed from: b */
    public final Function0 f31647b;

    /* renamed from: c */
    public final TransitionSearch f31648c;

    /* renamed from: d */
    public final AnimatedContentSearch f31649d;

    /* renamed from: e */
    public final AnimatedVisibilitySearch f31650e;

    /* renamed from: f */
    public final Set f31651f;

    /* renamed from: g */
    public final Set f31652g;

    /* renamed from: h */
    public final Set f31653h;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groupsWithLocation", "", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n1603#2,9:344\n1855#2:353\n288#2,2:354\n1856#2:357\n1612#2:358\n1#3:356\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n*L\n292#1:341\n292#1:342,2\n293#1:344,9\n293#1:353\n295#1:354,2\n293#1:357\n293#1:358\n293#1:356\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateContentSizeSearch */
    /* loaded from: classes2.dex */
    public static final class AnimateContentSizeSearch extends Search<Object> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimateContentSizeSearch(@NotNull Function1<Object, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            String str;
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            Set<Object> animations = getAnimations();
            ArrayList<Group> arrayList = new ArrayList();
            for (Object obj : groupsWithLocation) {
                if (Intrinsics.areEqual(((Group) obj).getName(), "remember")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Group group : arrayList) {
                Iterator<T> it = group.getData().iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != 0) {
                        str = next.getClass().getName();
                    }
                    if (Intrinsics.areEqual(str, "androidx.compose.animation.SizeAnimationModifier")) {
                        str = next;
                        break;
                    }
                }
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            animations.addAll(CollectionsKt___CollectionsKt.toSet(arrayList2));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u00020\u000e\"\u0004\b\u0000\u0010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0014\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groupsWithLocation", "addAnimations", "(Ljava/util/Collection;)V", "T", "", "Landroidx/compose/animation/core/AnimationVector;", OperatorName.CURVE_TO, "(Ljava/util/Collection;)Ljava/util/List;", "Landroidx/compose/ui/tooling/data/CallGroup;", "group", "Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/Animatable;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/tooling/data/CallGroup;)Landroidx/compose/animation/core/Animatable;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n800#2,11:344\n1603#2,9:355\n1855#2:364\n1603#2,9:366\n1855#2:375\n288#2:377\n289#2:379\n1856#2:381\n1612#2:382\n1855#2,2:384\n1612#2:386\n1855#2:388\n288#2:390\n289#2:392\n1856#2:393\n1612#2:394\n1856#2:396\n1612#2:397\n766#2:398\n857#2,2:399\n1360#2:401\n1446#2,5:402\n1360#2:407\n1446#2,5:408\n800#2,11:413\n1549#2:424\n1620#2,3:425\n800#2,11:428\n1603#2,9:440\n1855#2:449\n288#2:451\n289#2:453\n1856#2:455\n1612#2:456\n1855#2,2:458\n1612#2:460\n1855#2:462\n288#2:464\n289#2:466\n1856#2:467\n1612#2:468\n48#3:365\n49#3:376\n50#3:378\n53#3:383\n54#3:387\n55#3:389\n56#3:391\n48#3:439\n49#3:450\n50#3:452\n53#3:457\n54#3:461\n55#3:463\n56#3:465\n1#4:380\n1#4:395\n1#4:454\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n*L\n253#1:341\n253#1:342,2\n254#1:344,11\n255#1:355,9\n255#1:364\n259#1:366,9\n259#1:375\n259#1:377\n259#1:379\n259#1:381\n259#1:382\n259#1:384,2\n259#1:386\n259#1:388\n259#1:390\n259#1:392\n259#1:393\n259#1:394\n255#1:396\n255#1:397\n275#1:398\n275#1:399,2\n276#1:401\n276#1:402,5\n277#1:407\n277#1:408,5\n278#1:413,11\n278#1:424\n278#1:425,3\n279#1:428,11\n283#1:440,9\n283#1:449\n283#1:451\n283#1:453\n283#1:455\n283#1:456\n283#1:458,2\n283#1:460\n283#1:462\n283#1:464\n283#1:466\n283#1:467\n283#1:468\n259#1:365\n259#1:376\n259#1:378\n259#1:383\n259#1:387\n259#1:389\n259#1:391\n283#1:439\n283#1:450\n283#1:452\n283#1:457\n283#1:461\n283#1:463\n283#1:465\n259#1:380\n255#1:395\n283#1:454\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearch */
    /* loaded from: classes2.dex */
    public static final class AnimateXAsStateSearch extends Search<AnimateXAsStateSearchInfo<?, ?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimateXAsStateSearch(@NotNull Function1<? super AnimateXAsStateSearchInfo<?, ?>, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        /* renamed from: a */
        public final Animatable m58927a(CallGroup callGroup) {
            Object obj;
            Object obj2;
            Collection<Group> children = callGroup.getChildren();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = children.iterator();
            while (true) {
                Animatable animatable = null;
                if (!it.hasNext()) {
                    break;
                }
                Iterator<T> it2 = ((Group) it.next()).getData().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (obj2 instanceof Animatable) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 instanceof Animatable) {
                    animatable = obj2;
                }
                Animatable animatable2 = animatable;
                if (animatable2 != null) {
                    arrayList.add(animatable2);
                }
            }
            ArrayList<Group> arrayList2 = new ArrayList();
            for (Group group : children) {
                Group firstOrNull = PreviewUtilsKt.firstOrNull(group, AnimationSearchKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList2.add(firstOrNull);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : arrayList2) {
                Iterator<T> it3 = group2.getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (obj instanceof Animatable) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof Animatable)) {
                    obj = null;
                }
                Animatable animatable3 = (Animatable) obj;
                if (animatable3 != null) {
                    arrayList3.add(animatable3);
                }
            }
            return (Animatable) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList3));
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            getAnimations().addAll(m58925c(groupsWithLocation));
        }

        /* renamed from: b */
        public final AnimationSpec m58926b(CallGroup callGroup) {
            ArrayList<Group> arrayList = new ArrayList();
            for (Object obj : callGroup.getChildren()) {
                if (Intrinsics.areEqual(((Group) obj).getName(), "rememberUpdatedState")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Group group : arrayList) {
                AbstractC10410hs.addAll(arrayList2, group.getChildren());
            }
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2)) {
                AbstractC10410hs.addAll(arrayList3, group2.getData());
            }
            ArrayList<State> arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (obj2 instanceof State) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arrayList4, 10));
            for (State state : arrayList4) {
                arrayList5.add(state.getValue());
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (obj3 instanceof AnimationSpec) {
                    arrayList6.add(obj3);
                }
            }
            return (AnimationSpec) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* renamed from: c */
        public final List m58925c(Collection collection) {
            AnimateXAsStateSearchInfo animateXAsStateSearchInfo;
            Object obj;
            ?? r8;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                if (Intrinsics.areEqual(((Group) obj2).getName(), "animateValueAsState")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList<CallGroup> arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof CallGroup) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (CallGroup callGroup : arrayList2) {
                Animatable m58927a = m58927a(callGroup);
                AnimationSpec m58926b = m58926b(callGroup);
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = children.iterator();
                while (true) {
                    animateXAsStateSearchInfo = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Iterator it2 = ((Group) it.next()).getData().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            r8 = it2.next();
                            if (r8 instanceof MutableState) {
                                break;
                            }
                        } else {
                            r8 = 0;
                            break;
                        }
                    }
                    if (r8 instanceof MutableState) {
                        animateXAsStateSearchInfo = r8;
                    }
                    MutableState mutableState = (MutableState) animateXAsStateSearchInfo;
                    if (mutableState != null) {
                        arrayList4.add(mutableState);
                    }
                }
                ArrayList<Group> arrayList5 = new ArrayList();
                for (Group group : children) {
                    Group firstOrNull = PreviewUtilsKt.firstOrNull(group, AnimationSearchKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                    if (firstOrNull != null) {
                        arrayList5.add(firstOrNull);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (Group group2 : arrayList5) {
                    Iterator it3 = group2.getData().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (obj instanceof MutableState) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (!(obj instanceof MutableState)) {
                        obj = null;
                    }
                    MutableState mutableState2 = (MutableState) obj;
                    if (mutableState2 != null) {
                        arrayList6.add(mutableState2);
                    }
                }
                MutableState mutableState3 = (MutableState) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) CollectionsKt___CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList6));
                if (m58927a != null && m58926b != null && mutableState3 != null) {
                    if (mutableState3.getValue() == null) {
                        mutableState3.setValue(new ToolingState(m58927a.getValue()));
                    }
                    Object value = mutableState3.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.ToolingState<T of androidx.compose.ui.tooling.animation.AnimationSearch.AnimateXAsStateSearch.findAnimations$lambda$1>");
                    animateXAsStateSearchInfo = new AnimateXAsStateSearchInfo(m58927a, m58926b, (ToolingState) value);
                }
                if (animateXAsStateSearchInfo != null) {
                    arrayList3.add(animateXAsStateSearchInfo);
                }
            }
            return arrayList3;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B7\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012¨\u0006("}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2", "()Landroidx/compose/animation/core/AnimationSpec;", "component3", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Animatable;", "getAnimatable", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", OperatorName.CURVE_TO, "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$AnimateXAsStateSearchInfo */
    /* loaded from: classes2.dex */
    public static final class AnimateXAsStateSearchInfo<T, V extends AnimationVector> {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Animatable f31654a;

        /* renamed from: b */
        public final AnimationSpec f31655b;

        /* renamed from: c */
        public final ToolingState f31656c;

        public AnimateXAsStateSearchInfo(@NotNull Animatable<T, V> animatable, @NotNull AnimationSpec<T> animationSpec, @NotNull ToolingState<T> toolingState) {
            Intrinsics.checkNotNullParameter(animatable, "animatable");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(toolingState, "toolingState");
            this.f31654a = animatable;
            this.f31655b = animationSpec;
            this.f31656c = toolingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animateXAsStateSearchInfo, Animatable animatable, AnimationSpec animationSpec, ToolingState toolingState, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animateXAsStateSearchInfo.f31654a;
            }
            if ((i & 2) != 0) {
                animationSpec = animateXAsStateSearchInfo.f31655b;
            }
            if ((i & 4) != 0) {
                toolingState = animateXAsStateSearchInfo.f31656c;
            }
            return animateXAsStateSearchInfo.copy(animatable, animationSpec, toolingState);
        }

        @NotNull
        public final Animatable<T, V> component1() {
            return this.f31654a;
        }

        @NotNull
        public final AnimationSpec<T> component2() {
            return this.f31655b;
        }

        @NotNull
        public final ToolingState<T> component3() {
            return this.f31656c;
        }

        @NotNull
        public final AnimateXAsStateSearchInfo<T, V> copy(@NotNull Animatable<T, V> animatable, @NotNull AnimationSpec<T> animationSpec, @NotNull ToolingState<T> toolingState) {
            Intrinsics.checkNotNullParameter(animatable, "animatable");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(toolingState, "toolingState");
            return new AnimateXAsStateSearchInfo<>(animatable, animationSpec, toolingState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimateXAsStateSearchInfo) {
                AnimateXAsStateSearchInfo animateXAsStateSearchInfo = (AnimateXAsStateSearchInfo) obj;
                return Intrinsics.areEqual(this.f31654a, animateXAsStateSearchInfo.f31654a) && Intrinsics.areEqual(this.f31655b, animateXAsStateSearchInfo.f31655b) && Intrinsics.areEqual(this.f31656c, animateXAsStateSearchInfo.f31656c);
            }
            return false;
        }

        @NotNull
        public final Animatable<T, V> getAnimatable() {
            return this.f31654a;
        }

        @NotNull
        public final AnimationSpec<T> getAnimationSpec() {
            return this.f31655b;
        }

        @NotNull
        public final ToolingState<T> getToolingState() {
            return this.f31656c;
        }

        public int hashCode() {
            return (((this.f31654a.hashCode() * 31) + this.f31655b.hashCode()) * 31) + this.f31656c.hashCode();
        }

        @NotNull
        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.f31654a + ", animationSpec=" + this.f31655b + ", toolingState=" + this.f31656c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groupsWithLocation", "", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n1603#2,9:344\n1855#2:353\n288#2,2:354\n1856#2:357\n1612#2:358\n1603#2,9:360\n1855#2:369\n288#2:371\n289#2:373\n1856#2:375\n1612#2:376\n1603#2,9:378\n1855#2,2:387\n1612#2:389\n1603#2,9:391\n1855#2:400\n288#2:402\n289#2:404\n1856#2:405\n1612#2:406\n1#3:356\n1#3:374\n48#4:359\n49#4:370\n50#4:372\n53#4:377\n54#4:390\n55#4:401\n56#4:403\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n*L\n332#1:341\n332#1:342,2\n333#1:344,9\n333#1:353\n334#1:354,2\n333#1:357\n333#1:358\n337#1:360,9\n337#1:369\n337#1:371\n337#1:373\n337#1:375\n337#1:376\n337#1:378,9\n337#1:387,2\n337#1:389\n337#1:391,9\n337#1:400\n337#1:402\n337#1:404\n337#1:405\n337#1:406\n333#1:356\n337#1:374\n337#1:359\n337#1:370\n337#1:372\n337#1:377\n337#1:390\n337#1:401\n337#1:403\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$AnimatedContentSearch */
    /* loaded from: classes2.dex */
    public static final class AnimatedContentSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimatedContentSearch(@NotNull Function1<? super Transition<?>, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : groupsWithLocation) {
                if (Intrinsics.areEqual(((Group) obj3).getName(), "AnimatedContent")) {
                    arrayList.add(obj3);
                }
            }
            ArrayList<Group> arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                Object obj4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Iterator<T> it2 = ((Group) it.next()).getChildren().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.areEqual(((Group) next).getName(), "updateTransition")) {
                        obj4 = next;
                        break;
                    }
                }
                Group group = (Group) obj4;
                if (group != null) {
                    arrayList2.add(group);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : arrayList2) {
                Iterator<T> it3 = group2.getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (!(obj2 instanceof Transition)) {
                    obj2 = null;
                }
                Transition transition = (Transition) obj2;
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList<Group> arrayList4 = new ArrayList();
            for (Group group3 : arrayList2) {
                Group firstOrNull = PreviewUtilsKt.firstOrNull(group3, AnimationSearchKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList4.add(firstOrNull);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Group group4 : arrayList4) {
                Iterator<T> it4 = group4.getData().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList5.add(transition2);
                }
            }
            animations.addAll(CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList5));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groupsWithLocation", "", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n1603#2,9:344\n1855#2:353\n288#2,2:354\n1856#2:357\n1612#2:358\n1603#2,9:360\n1855#2:369\n288#2:371\n289#2:373\n1856#2:375\n1612#2:376\n1603#2,9:378\n1855#2,2:387\n1612#2:389\n1603#2,9:391\n1855#2:400\n288#2:402\n289#2:404\n1856#2:405\n1612#2:406\n1#3:356\n1#3:374\n48#4:359\n49#4:370\n50#4:372\n53#4:377\n54#4:390\n55#4:401\n56#4:403\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n*L\n319#1:341\n319#1:342,2\n320#1:344,9\n320#1:353\n321#1:354,2\n320#1:357\n320#1:358\n324#1:360,9\n324#1:369\n324#1:371\n324#1:373\n324#1:375\n324#1:376\n324#1:378,9\n324#1:387,2\n324#1:389\n324#1:391,9\n324#1:400\n324#1:402\n324#1:404\n324#1:405\n324#1:406\n320#1:356\n324#1:374\n324#1:359\n324#1:370\n324#1:372\n324#1:377\n324#1:390\n324#1:401\n324#1:403\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$AnimatedVisibilitySearch */
    /* loaded from: classes2.dex */
    public static final class AnimatedVisibilitySearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimatedVisibilitySearch(@NotNull Function1<? super Transition<?>, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            Set<Transition<?>> animations = getAnimations();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : groupsWithLocation) {
                if (Intrinsics.areEqual(((Group) obj3).getName(), "AnimatedVisibility")) {
                    arrayList.add(obj3);
                }
            }
            ArrayList<Group> arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                Object obj4 = null;
                if (!it.hasNext()) {
                    break;
                }
                Iterator<T> it2 = ((Group) it.next()).getChildren().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.areEqual(((Group) next).getName(), "updateTransition")) {
                        obj4 = next;
                        break;
                    }
                }
                Group group = (Group) obj4;
                if (group != null) {
                    arrayList2.add(group);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Group group2 : arrayList2) {
                Iterator<T> it3 = group2.getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (!(obj2 instanceof Transition)) {
                    obj2 = null;
                }
                Transition transition = (Transition) obj2;
                if (transition != null) {
                    arrayList3.add(transition);
                }
            }
            ArrayList<Group> arrayList4 = new ArrayList();
            for (Group group3 : arrayList2) {
                Group firstOrNull = PreviewUtilsKt.firstOrNull(group3, AnimationSearchKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList4.add(firstOrNull);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Group group4 : arrayList4) {
                Iterator<T> it4 = group4.getData().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition2 = (Transition) obj;
                if (transition2 != null) {
                    arrayList5.add(transition2);
                }
            }
            animations.addAll(CollectionsKt___CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList5));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$DecaySearch */
    /* loaded from: classes2.dex */
    public static final class DecaySearch extends RememberSearch<DecayAnimation<?, ?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecaySearch(@NotNull Function1<? super DecayAnimation<?, ?>, Unit> trackAnimation) {
            super(Reflection.getOrCreateKotlinClass(DecayAnimation.class), trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groupsWithLocation", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Collection;)Ljava/util/List;", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n800#2,11:344\n1603#2,9:355\n1855#2:364\n1360#2:369\n1446#2,5:370\n288#2:377\n289#2:379\n1360#2:382\n1446#2,5:383\n1360#2:389\n1446#2,5:390\n288#2:396\n289#2:398\n1856#2:400\n1612#2:401\n62#3,4:365\n66#3,2:375\n68#3:378\n64#3,2:380\n66#3:388\n67#3:395\n68#3:397\n1#4:399\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n*L\n209#1:341\n209#1:342,2\n210#1:344,11\n212#1:355,9\n212#1:364\n213#1:369\n213#1:370,5\n213#1:377\n213#1:379\n214#1:382\n214#1:383,5\n214#1:389\n214#1:390,5\n214#1:396\n214#1:398\n212#1:400\n212#1:401\n213#1:365,4\n213#1:375,2\n213#1:378\n214#1:380,2\n214#1:388\n214#1:395\n214#1:397\n212#1:399\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearch */
    /* loaded from: classes2.dex */
    public static final class InfiniteTransitionSearch extends Search<InfiniteTransitionSearchInfo> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfiniteTransitionSearch(@NotNull Function1<? super InfiniteTransitionSearchInfo, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        /* renamed from: a */
        private final List m58924a(Collection collection) {
            InfiniteTransitionSearchInfo infiniteTransitionSearchInfo;
            Object obj;
            Object obj2;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : collection) {
                if (Intrinsics.areEqual(((Group) obj3).getName(), "rememberInfiniteTransition")) {
                    arrayList.add(obj3);
                }
            }
            ArrayList<CallGroup> arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (obj4 instanceof CallGroup) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (CallGroup callGroup : arrayList2) {
                Collection<Object> data = callGroup.getData();
                ArrayList arrayList4 = new ArrayList();
                for (Group group : callGroup.getChildren()) {
                    AbstractC10410hs.addAll(arrayList4, group.getData());
                }
                Iterator it = CollectionsKt___CollectionsKt.plus((Collection) data, (Iterable) arrayList4).iterator();
                while (true) {
                    infiniteTransitionSearchInfo = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (obj instanceof InfiniteTransition) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof InfiniteTransition)) {
                    obj = null;
                }
                InfiniteTransition infiniteTransition = (InfiniteTransition) obj;
                Collection<Object> data2 = callGroup.getData();
                Collection<Group> children = callGroup.getChildren();
                ArrayList arrayList5 = new ArrayList();
                for (Group group2 : children) {
                    AbstractC10410hs.addAll(arrayList5, group2.getChildren());
                }
                ArrayList arrayList6 = new ArrayList();
                for (Group group3 : CollectionsKt___CollectionsKt.plus((Collection) children, (Iterable) arrayList5)) {
                    AbstractC10410hs.addAll(arrayList6, group3.getData());
                }
                Iterator it2 = CollectionsKt___CollectionsKt.plus((Collection) data2, (Iterable) arrayList6).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (obj2 instanceof MutableState) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (!(obj2 instanceof MutableState)) {
                    obj2 = null;
                }
                MutableState mutableState = (MutableState) obj2;
                if (infiniteTransition != null && mutableState != null) {
                    if (mutableState.getValue() == null) {
                        mutableState.setValue(new ToolingState(0L));
                    }
                    Object value = mutableState.getValue();
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.ToolingState<kotlin.Long>");
                    infiniteTransitionSearchInfo = new InfiniteTransitionSearchInfo(infiniteTransition, (ToolingState) value);
                }
                if (infiniteTransitionSearchInfo != null) {
                    arrayList3.add(infiniteTransitionSearchInfo);
                }
            }
            return arrayList3;
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            getAnimations().addAll(m58924a(groupsWithLocation));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "Landroidx/compose/animation/core/InfiniteTransition;", "infiniteTransition", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/InfiniteTransition;", "component2", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/InfiniteTransition;", "getInfiniteTransition", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$InfiniteTransitionSearchInfo */
    /* loaded from: classes2.dex */
    public static final class InfiniteTransitionSearchInfo {
        public static final int $stable = InfiniteTransition.$stable;

        /* renamed from: a */
        public final InfiniteTransition f31657a;

        /* renamed from: b */
        public final ToolingState f31658b;

        public InfiniteTransitionSearchInfo(@NotNull InfiniteTransition infiniteTransition, @NotNull ToolingState<Long> toolingState) {
            Intrinsics.checkNotNullParameter(infiniteTransition, "infiniteTransition");
            Intrinsics.checkNotNullParameter(toolingState, "toolingState");
            this.f31657a = infiniteTransition;
            this.f31658b = toolingState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, InfiniteTransition infiniteTransition, ToolingState toolingState, int i, Object obj) {
            if ((i & 1) != 0) {
                infiniteTransition = infiniteTransitionSearchInfo.f31657a;
            }
            if ((i & 2) != 0) {
                toolingState = infiniteTransitionSearchInfo.f31658b;
            }
            return infiniteTransitionSearchInfo.copy(infiniteTransition, toolingState);
        }

        @NotNull
        public final InfiniteTransition component1() {
            return this.f31657a;
        }

        @NotNull
        public final ToolingState<Long> component2() {
            return this.f31658b;
        }

        @NotNull
        public final InfiniteTransitionSearchInfo copy(@NotNull InfiniteTransition infiniteTransition, @NotNull ToolingState<Long> toolingState) {
            Intrinsics.checkNotNullParameter(infiniteTransition, "infiniteTransition");
            Intrinsics.checkNotNullParameter(toolingState, "toolingState");
            return new InfiniteTransitionSearchInfo(infiniteTransition, toolingState);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InfiniteTransitionSearchInfo) {
                InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
                return Intrinsics.areEqual(this.f31657a, infiniteTransitionSearchInfo.f31657a) && Intrinsics.areEqual(this.f31658b, infiniteTransitionSearchInfo.f31658b);
            }
            return false;
        }

        @NotNull
        public final InfiniteTransition getInfiniteTransition() {
            return this.f31657a;
        }

        @NotNull
        public final ToolingState<Long> getToolingState() {
            return this.f31658b;
        }

        public int hashCode() {
            return (this.f31657a.hashCode() * 31) + this.f31658b.hashCode();
        }

        @NotNull
        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.f31657a + ", toolingState=" + this.f31658b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "", "T", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groupsWithLocation", "addAnimations", "(Ljava/util/Collection;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Collection;Lkotlin/reflect/KClass;)Ljava/util/List;", OperatorName.CURVE_TO, "Lkotlin/reflect/KClass;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1603#2,9:341\n1855#2:350\n288#2,2:351\n1856#2:354\n1612#2:355\n1#3:353\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n*L\n181#1:341,9\n181#1:350\n183#1:351,2\n181#1:354\n181#1:355\n181#1:353\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$RememberSearch */
    /* loaded from: classes2.dex */
    public static class RememberSearch<T> extends Search<T> {
        public static final int $stable = 8;

        /* renamed from: c */
        public final KClass f31659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RememberSearch(@NotNull KClass<T> clazz, @NotNull Function1<? super T, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
            this.f31659c = clazz;
        }

        /* renamed from: a */
        public final List m58923a(Collection collection, KClass kClass) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((Group) it.next()).getData().iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    if (next != null) {
                        obj = JvmClassMappingKt.getKotlinClass(next.getClass());
                    }
                    if (Intrinsics.areEqual(obj, kClass)) {
                        obj = next;
                        break;
                    }
                }
                Object safeCast = KClasses.safeCast(kClass, obj);
                if (safeCast != null) {
                    arrayList.add(safeCast);
                }
            }
            return arrayList;
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            getAnimations().addAll(CollectionsKt___CollectionsKt.toSet(m58923a(groupsWithLocation, this.f31659c)));
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0006\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "T", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groupsWithLocation", "addAnimations", "(Ljava/util/Collection;)V", "", "hasAnimations", "()Z", "track", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function1;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Set;", "getAnimations", "()Ljava/util/Set;", "animations", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n*L\n166#1:341,2\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$Search */
    /* loaded from: classes2.dex */
    public static class Search<T> {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Function1 f31660a;

        /* renamed from: b */
        public final Set f31661b;

        public Search(@NotNull Function1<? super T, Unit> trackAnimation) {
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
            this.f31660a = trackAnimation;
            this.f31661b = new LinkedHashSet();
        }

        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
        }

        @NotNull
        public final Set<T> getAnimations() {
            return this.f31661b;
        }

        public final boolean hasAnimations() {
            return !this.f31661b.isEmpty();
        }

        public final void track() {
            Function1 function1 = this.f31660a;
            for (T t : CollectionsKt___CollectionsKt.reversed(this.f31661b)) {
                function1.invoke(t);
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001a\u0010\u0003\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$TargetBasedSearch */
    /* loaded from: classes2.dex */
    public static final class TargetBasedSearch extends RememberSearch<TargetBasedAnimation<?, ?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TargetBasedSearch(@NotNull Function1<? super TargetBasedAnimation<?, ?>, Unit> trackAnimation) {
            super(Reflection.getOrCreateKotlinClass(TargetBasedAnimation.class), trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groupsWithLocation", "", "Landroidx/compose/ui/tooling/data/Group;", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nAnimationSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearchKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n766#2:341\n857#2,2:342\n1603#2,9:345\n1855#2:354\n288#2:356\n289#2:358\n1856#2:360\n1612#2:361\n1603#2,9:363\n1855#2,2:372\n1612#2:374\n1603#2,9:376\n1855#2:385\n288#2:387\n289#2:389\n1856#2:390\n1612#2:391\n48#3:344\n49#3:355\n50#3:357\n53#3:362\n54#3:375\n55#3:386\n56#3:388\n1#4:359\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n*L\n307#1:341\n307#1:342,2\n309#1:345,9\n309#1:354\n309#1:356\n309#1:358\n309#1:360\n309#1:361\n309#1:363,9\n309#1:372,2\n309#1:374\n309#1:376,9\n309#1:385\n309#1:387\n309#1:389\n309#1:390\n309#1:391\n309#1:344\n309#1:355\n309#1:357\n309#1:362\n309#1:375\n309#1:386\n309#1:388\n309#1:359\n*E\n"})
    /* renamed from: androidx.compose.ui.tooling.animation.AnimationSearch$TransitionSearch */
    /* loaded from: classes2.dex */
    public static final class TransitionSearch extends Search<Transition<?>> {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionSearch(@NotNull Function1<? super Transition<?>, Unit> trackAnimation) {
            super(trackAnimation);
            Intrinsics.checkNotNullParameter(trackAnimation, "trackAnimation");
        }

        @Override // androidx.compose.p003ui.tooling.animation.AnimationSearch.Search
        public void addAnimations(@NotNull Collection<? extends Group> groupsWithLocation) {
            Object obj;
            Object obj2;
            Intrinsics.checkNotNullParameter(groupsWithLocation, "groupsWithLocation");
            Set<Transition<?>> animations = getAnimations();
            ArrayList<Group> arrayList = new ArrayList();
            for (Object obj3 : groupsWithLocation) {
                if (Intrinsics.areEqual(((Group) obj3).getName(), "updateTransition")) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                Transition transition = null;
                if (!it.hasNext()) {
                    break;
                }
                Iterator<T> it2 = ((Group) it.next()).getData().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (obj2 instanceof Transition) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 instanceof Transition) {
                    transition = obj2;
                }
                Transition transition2 = transition;
                if (transition2 != null) {
                    arrayList2.add(transition2);
                }
            }
            ArrayList<Group> arrayList3 = new ArrayList();
            for (Group group : arrayList) {
                Group firstOrNull = PreviewUtilsKt.firstOrNull(group, AnimationSearchKt$findRememberedData$rememberCalls$1$1.INSTANCE);
                if (firstOrNull != null) {
                    arrayList3.add(firstOrNull);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Group group2 : arrayList3) {
                Iterator<T> it3 = group2.getData().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        if (obj instanceof Transition) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (!(obj instanceof Transition)) {
                    obj = null;
                }
                Transition transition3 = (Transition) obj;
                if (transition3 != null) {
                    arrayList4.add(transition3);
                }
            }
            animations.addAll(CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4));
        }
    }

    public AnimationSearch(@NotNull Function0<? extends PreviewAnimationClock> clock, @NotNull Function0<Unit> onSeek) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(onSeek, "onSeek");
        this.f31646a = clock;
        this.f31647b = onSeek;
        this.f31648c = new TransitionSearch(new AnimationSearch$transitionSearch$1(this));
        AnimatedContentSearch animatedContentSearch = new AnimatedContentSearch(new AnimationSearch$animatedContentSearch$1(this));
        this.f31649d = animatedContentSearch;
        this.f31650e = new AnimatedVisibilitySearch(new AnimationSearch$animatedVisibilitySearch$1(this));
        Set m58929c = m58929c();
        this.f31651f = m58929c;
        Set plus = EG1.plus(m58929c, (Iterable) m58928d());
        this.f31652g = plus;
        this.f31653h = EG1.plus(plus, (Iterable) CG1.setOf(animatedContentSearch));
    }

    /* renamed from: a */
    public final Collection m58931a() {
        if (AnimateXAsStateComposeAnimation.Companion.getApiAvailable()) {
            return CG1.setOf(new AnimateXAsStateSearch(new AnimationSearch$animateXAsStateSearch$1(this)));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* renamed from: b */
    public final Set m58930b() {
        if (InfiniteTransitionComposeAnimation.Companion.getApiAvailable()) {
            return CG1.setOf(new InfiniteTransitionSearch(new AnimationSearch$infiniteTransitionSearch$1(this)));
        }
        return DG1.emptySet();
    }

    /* renamed from: c */
    public final Set m58929c() {
        Set emptySet;
        Set plus = EG1.plus(EG1.plus(DG1.setOf((Object[]) new Search[]{this.f31648c, this.f31650e}), (Iterable) m58931a()), (Iterable) m58930b());
        if (AnimatedContentComposeAnimation.Companion.getApiAvailable()) {
            emptySet = CG1.setOf(this.f31649d);
        } else {
            emptySet = DG1.emptySet();
        }
        return EG1.plus(plus, (Iterable) emptySet);
    }

    /* renamed from: d */
    public final Collection m58928d() {
        if (UnsupportedComposeAnimation.Companion.getApiAvailable()) {
            return DG1.setOf((Object[]) new Search[]{new AnimateContentSizeSearch(new AnimationSearch$unsupportedSearch$1(this)), new TargetBasedSearch(new AnimationSearch$unsupportedSearch$2(this)), new DecaySearch(new AnimationSearch$unsupportedSearch$3(this))});
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final void findAll(@NotNull Collection<? extends Group> slotTrees) {
        Intrinsics.checkNotNullParameter(slotTrees, "slotTrees");
        for (Group group : slotTrees) {
            List<Group> findAll = PreviewUtilsKt.findAll(group, AnimationSearch$findAll$1$groupsWithLocation$1.INSTANCE);
            for (Search search : this.f31653h) {
                search.addAnimations(findAll);
            }
            this.f31648c.getAnimations().removeAll(this.f31650e.getAnimations());
            this.f31648c.getAnimations().removeAll(this.f31649d.getAnimations());
        }
    }

    public final boolean getHasAnimations() {
        Set<Search> set = this.f31651f;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (Search search : set) {
            if (search.hasAnimations()) {
                return true;
            }
        }
        return false;
    }

    public final void trackAll() {
        if (getHasAnimations()) {
            for (Search search : this.f31652g) {
                search.track();
            }
        }
    }
}
