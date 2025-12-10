package th.p047co.dtac.android.dtacone.presenter.stv;

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
import th.p047co.dtac.android.dtacone.model.stv.StvPackageCollection;
import th.p047co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4;
import th.p047co.dtac.android.dtacone.util.Pair;

@Metadata(m29143d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a¿\u0002\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002 \u0006*\u009e\u0001\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012·\u0001\u0010\t\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*X\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "rowSpeed", "Lrx/observables/GroupedObservable;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4 */
/* loaded from: classes8.dex */
public final class StvPhoenixListPresenter$calculateStvMatrix$4 extends Lambda implements Function1<GroupedObservable<PackageKey<Integer, String>, StvPackageCollection>, Observable<? extends Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>>>> {
    final /* synthetic */ List<PackageKey<Integer, String>> $columnHeader;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "kotlin.jvm.PlatformType", "", "pkg", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4$1 */
    /* loaded from: classes8.dex */
    public static final class C143911 extends Lambda implements Function1<StvPackageCollection, PackageKey<Integer, String>> {
        public static final C143911 INSTANCE = new C143911();

        public C143911() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PackageKey<Integer, String> invoke(StvPackageCollection stvPackageCollection) {
            return PackageKey.create(Integer.valueOf(Integer.parseInt(stvPackageCollection.getPeriod())), stvPackageCollection.getPeriodUnit());
        }
    }

    @Metadata(m29143d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a¿\u0002\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002 \u0006*\u009e\u0001\u0012\u0097\u0001\b\u0001\u0012\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007 \u0006*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \u0006*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012·\u0001\u0010\t\u001a²\u0001\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b \u0006*X\u0012D\u0012B\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b\u0018\u00010\u000b0\nH\n¢\u0006\u0002\b\f"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "colPeriod", "", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4$2 */
    /* loaded from: classes8.dex */
    public static final class C143922 extends Lambda implements Function1<Map<PackageKey<Integer, String>, StvPackageCollection>, Observable<? extends Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>>>> {
        final /* synthetic */ List<PackageKey<Integer, String>> $columnHeader;
        final /* synthetic */ GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> $rowSpeed;

        @Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "it", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "kotlin.jvm.PlatformType", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4$2$1 */
        /* loaded from: classes8.dex */
        public static final class C143931 extends Lambda implements Function1<PackageKey<Integer, String>, StvPackageCollection> {
            final /* synthetic */ Map<PackageKey<Integer, String>, StvPackageCollection> $colPeriod;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C143931(Map<PackageKey<Integer, String>, StvPackageCollection> map) {
                super(1);
                this.$colPeriod = map;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final StvPackageCollection invoke(PackageKey<Integer, String> packageKey) {
                return this.$colPeriod.get(packageKey);
            }
        }

        @Metadata(m29143d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0092\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006 \u0005*H\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00010\u00012\u001e\u0010\b\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\tH\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/util/Pair;", "Lth/co/dtac/android/dtacone/presenter/stv/PackageKey;", "", "", "kotlin.jvm.PlatformType", "", "Lth/co/dtac/android/dtacone/model/stv/StvPackageCollection;", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.presenter.stv.StvPhoenixListPresenter$calculateStvMatrix$4$2$2 */
        /* loaded from: classes8.dex */
        public static final class C143942 extends Lambda implements Function1<List<StvPackageCollection>, Pair<PackageKey<Integer, String>, List<? extends StvPackageCollection>>> {
            final /* synthetic */ GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> $rowSpeed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C143942(GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> groupedObservable) {
                super(1);
                this.$rowSpeed = groupedObservable;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<PackageKey<Integer, String>, List<StvPackageCollection>> invoke(List<StvPackageCollection> list) {
                PackageKey<Integer, String> key = this.$rowSpeed.getKey();
                Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<th.co.dtac.android.dtacone.model.stv.StvPackageCollection?>");
                return Pair.create(key, list);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143922(List<PackageKey<Integer, String>> list, GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> groupedObservable) {
            super(1);
            this.$columnHeader = list;
            this.$rowSpeed = groupedObservable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StvPackageCollection invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (StvPackageCollection) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Observable<? extends Pair<PackageKey<Integer, String>, List<StvPackageCollection>>> invoke(Map<PackageKey<Integer, String>, StvPackageCollection> map) {
            Observable from = Observable.from(this.$columnHeader);
            final C143931 c143931 = new C143931(map);
            Observable list = from.map(new Func1() { // from class: th.co.dtac.android.dtacone.presenter.stv.c
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    StvPackageCollection invoke$lambda$0;
                    invoke$lambda$0 = StvPhoenixListPresenter$calculateStvMatrix$4.C143922.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            }).toList();
            final C143942 c143942 = new C143942(this.$rowSpeed);
            return list.map(new Func1() { // from class: th.co.dtac.android.dtacone.presenter.stv.d
                @Override // p046rx.functions.Func1
                public final Object call(Object obj) {
                    Pair invoke$lambda$1;
                    invoke$lambda$1 = StvPhoenixListPresenter$calculateStvMatrix$4.C143922.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StvPhoenixListPresenter$calculateStvMatrix$4(List<PackageKey<Integer, String>> list) {
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
    public final Observable<? extends Pair<PackageKey<Integer, String>, List<StvPackageCollection>>> invoke(GroupedObservable<PackageKey<Integer, String>, StvPackageCollection> groupedObservable) {
        final C143911 c143911 = C143911.INSTANCE;
        Observable<Map<PackageKey<Integer, String>, StvPackageCollection>> map = groupedObservable.toMap(new Func1() { // from class: th.co.dtac.android.dtacone.presenter.stv.a
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                PackageKey invoke$lambda$0;
                invoke$lambda$0 = StvPhoenixListPresenter$calculateStvMatrix$4.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
        final C143922 c143922 = new C143922(this.$columnHeader, groupedObservable);
        return map.flatMap(new Func1() { // from class: th.co.dtac.android.dtacone.presenter.stv.b
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                Observable invoke$lambda$1;
                invoke$lambda$1 = StvPhoenixListPresenter$calculateStvMatrix$4.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}