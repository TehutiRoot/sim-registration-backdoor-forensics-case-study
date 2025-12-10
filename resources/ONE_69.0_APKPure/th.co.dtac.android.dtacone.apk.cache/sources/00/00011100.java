package th.p047co.dtac.android.dtacone.app_one.presenter;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p046rx.Observable;
import p046rx.functions.Func1;
import p046rx.observables.GroupedObservable;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection;
import th.p047co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4;
import th.p047co.dtac.android.dtacone.presenter.stv.PackageKey;
import th.p047co.dtac.android.dtacone.util.Pair;

@Metadata(m29143d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a¿\u0002\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002 \u0006*\u009e\u0001\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012·\u0001\u0010\t\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*X\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "rowSpeed", "Lrx/observables/GroupedObservable;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4 */
/* loaded from: classes7.dex */
public final class OneStvPhoenixListPresenter$calculateStvMatrix$4 extends Lambda implements Function1<GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection>, Observable<? extends Pair<PackageKey<Integer, String>, List<? extends OneStvPackageCollection>>>> {
    final /* synthetic */ List<PackageKey<Integer, String>> $columnHeader;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a6\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0003*\u001a\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "kotlin.jvm.PlatformType", "", "pkg", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4$1 */
    /* loaded from: classes7.dex */
    public static final class C141411 extends Lambda implements Function1<OneStvPackageCollection, PackageKey<Integer, String>> {
        public static final C141411 INSTANCE = new C141411();

        public C141411() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PackageKey<Integer, String> invoke(OneStvPackageCollection oneStvPackageCollection) {
            String period = oneStvPackageCollection.getPeriod();
            return PackageKey.create(Integer.valueOf(period != null ? Integer.parseInt(period) : 0), oneStvPackageCollection.getPeriodUnit());
        }
    }

    @Metadata(m29143d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a¿\u0002\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002 \u0006*\u009e\u0001\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u009f\u0001\u0010\t\u001a\u009a\u0001\u00128\u00126\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u001a\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*L\u00128\u00126\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u001a\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\u000b0\nH\n¢\u0006\u0002\b\f"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "colPeriod", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4$2 */
    /* loaded from: classes7.dex */
    public static final class C141422 extends Lambda implements Function1<Map<PackageKey<Integer, String>, OneStvPackageCollection>, Observable<? extends Pair<PackageKey<Integer, String>, List<? extends OneStvPackageCollection>>>> {
        final /* synthetic */ List<PackageKey<Integer, String>> $columnHeader;
        final /* synthetic */ GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> $rowSpeed;

        @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "it", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4$2$1 */
        /* loaded from: classes7.dex */
        public static final class C141431 extends Lambda implements Function1<PackageKey<Integer, String>, OneStvPackageCollection> {
            final /* synthetic */ Map<PackageKey<Integer, String>, OneStvPackageCollection> $colPeriod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C141431(Map<PackageKey<Integer, String>, OneStvPackageCollection> map) {
                super(1);
                this.$colPeriod = map;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final OneStvPackageCollection invoke(PackageKey<Integer, String> packageKey) {
                return this.$colPeriod.get(packageKey);
            }
        }

        @Metadata(m29143d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006 \u0005*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00010\u00012\u001e\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\tH\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvPackageCollection;", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.app_one.presenter.OneStvPhoenixListPresenter$calculateStvMatrix$4$2$2 */
        /* loaded from: classes7.dex */
        public static final class C141442 extends Lambda implements Function1<List<OneStvPackageCollection>, Pair<PackageKey<Integer, String>, List<? extends OneStvPackageCollection>>> {
            final /* synthetic */ GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> $rowSpeed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C141442(GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> groupedObservable) {
                super(1);
                this.$rowSpeed = groupedObservable;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>> invoke(List<OneStvPackageCollection> list) {
                PackageKey<Integer, String> key = this.$rowSpeed.getKey();
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<th.co.dtac.android.dtacone.app_one.model.stv.OneStvPackageCollection?>");
                return Pair.create(key, list);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141422(List<PackageKey<Integer, String>> list, GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> groupedObservable) {
            super(1);
            this.$columnHeader = list;
            this.$rowSpeed = groupedObservable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OneStvPackageCollection invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (OneStvPackageCollection) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Observable<? extends Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>> invoke(Map<PackageKey<Integer, String>, OneStvPackageCollection> map) {
            Observable from = Observable.from(this.$columnHeader);
            final C141431 c141431 = new C141431(map);
            Observable list = from.map(new Func1() { // from class: th.co.dtac.android.dtacone.app_one.presenter.c
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    OneStvPackageCollection invoke$lambda$0;
                    invoke$lambda$0 = OneStvPhoenixListPresenter$calculateStvMatrix$4.C141422.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).toList();
            final C141442 c141442 = new C141442(this.$rowSpeed);
            return list.map(new Func1() { // from class: th.co.dtac.android.dtacone.app_one.presenter.d
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    Pair invoke$lambda$1;
                    invoke$lambda$1 = OneStvPhoenixListPresenter$calculateStvMatrix$4.C141422.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvPhoenixListPresenter$calculateStvMatrix$4(List<PackageKey<Integer, String>> list) {
        super(1);
        this.$columnHeader = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageKey invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (PackageKey) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Observable) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends Pair<PackageKey<Integer, String>, List<OneStvPackageCollection>>> invoke(GroupedObservable<PackageKey<Integer, String>, OneStvPackageCollection> groupedObservable) {
        final C141411 c141411 = C141411.INSTANCE;
        Observable<Map<PackageKey<Integer, String>, OneStvPackageCollection>> map = groupedObservable.toMap(new Func1() { // from class: th.co.dtac.android.dtacone.app_one.presenter.a
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                PackageKey invoke$lambda$0;
                invoke$lambda$0 = OneStvPhoenixListPresenter$calculateStvMatrix$4.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
        final C141422 c141422 = new C141422(this.$columnHeader, groupedObservable);
        return map.flatMap(new Func1() { // from class: th.co.dtac.android.dtacone.app_one.presenter.b
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable invoke$lambda$1;
                invoke$lambda$1 = OneStvPhoenixListPresenter$calculateStvMatrix$4.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}