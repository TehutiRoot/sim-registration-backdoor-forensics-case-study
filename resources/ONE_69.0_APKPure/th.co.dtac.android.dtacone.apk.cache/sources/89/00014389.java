package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallAppointmentTimeRange;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInstallAppointmentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallAppointmentScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallAppointmentScreenKt$InstallDateList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,576:1\n1855#2:577\n1856#2:590\n171#3,12:578\n*S KotlinDebug\n*F\n+ 1 InstallAppointmentScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallAppointmentScreenKt$InstallDateList$1\n*L\n257#1:577\n257#1:590\n294#1:578,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallDateList$1 */
/* loaded from: classes10.dex */
public final class InstallAppointmentScreenKt$InstallDateList$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Map<String, List<AppointmentDateItem>> $dateList;
    final /* synthetic */ Ref.ObjectRef<SnapshotStateMap<String, Boolean>> $expandedState;
    final /* synthetic */ boolean $isSecondary;
    final /* synthetic */ Function3<String, InstallAppointmentTimeRange, Boolean, Unit> $onAppointmentSelected;
    final /* synthetic */ ColumnScope $this_InstallDateList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstallAppointmentScreenKt$InstallDateList$1(Map<String, ? extends List<AppointmentDateItem>> map, Ref.ObjectRef<SnapshotStateMap<String, Boolean>> objectRef, ColumnScope columnScope, int i, boolean z, Function3<? super String, ? super InstallAppointmentTimeRange, ? super Boolean, Unit> function3) {
        super(1);
        this.$dateList = map;
        this.$expandedState = objectRef;
        this.$this_InstallDateList = columnScope;
        this.$$dirty = i;
        this.$isSecondary = z;
        this.$onAppointmentSelected = function3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Map<String, List<AppointmentDateItem>> map = this.$dateList;
        Ref.ObjectRef<SnapshotStateMap<String, Boolean>> objectRef = this.$expandedState;
        ColumnScope columnScope = this.$this_InstallDateList;
        int i = this.$$dirty;
        boolean z = this.$isSecondary;
        Function3<String, InstallAppointmentTimeRange, Boolean, Unit> function3 = this.$onAppointmentSelected;
        for (String str : this.$dateList.keySet()) {
            List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{HelpFormatter.DEFAULT_OPT_PREFIX}, false, 0, 6, (Object) null);
            Calendar cal = Calendar.getInstance(new Locale(LanguageSupport.LANG_TH));
            cal.set(Integer.parseInt((String) split$default.get(0)), Integer.parseInt((String) split$default.get(1)) - 1, 1);
            Intrinsics.checkNotNullExpressionValue(cal, "cal");
            String str2 = DateFormatExtKt.toDateString$default(cal, "MMMM", (Locale) null, 2, (Object) null) + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + (Integer.parseInt((String) split$default.get(0)) + 543);
            List<AppointmentDateItem> list = map.get(str);
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            List<AppointmentDateItem> list2 = list;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = !Intrinsics.areEqual(objectRef.element.get(str), Boolean.FALSE);
            LazyListScope.CC.m61219m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2015273663, true, new InstallAppointmentScreenKt$InstallDateList$1$1$1(objectRef, str, booleanRef, str2)), 3, null);
            Function3<String, InstallAppointmentTimeRange, Boolean, Unit> function32 = function3;
            boolean z2 = z;
            LazyColumn.items(list2.size(), null, new C15496xea3ebada(list2), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15497xea3ebadb(list2, columnScope, booleanRef, i, z2, function32, list2)));
            function3 = function32;
            z = z2;
            columnScope = columnScope;
        }
    }
}