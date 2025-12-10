package th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import p046rx.functions.Func1;
import p046rx.observables.GroupedObservable;
import th.p047co.dtac.android.dtacone.model.postpaid.Group;
import th.p047co.dtac.android.dtacone.model.postpaid.PackageSet;
import th.p047co.dtac.android.dtacone.model.postpaid.Tabs;
import th.p047co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$packageObs$1;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "tab", "Lth/co/dtac/android/dtacone/model/postpaid/Tabs;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$packageObs$1 */
/* loaded from: classes9.dex */
public final class PostpaidPackageSetViewModel$getPackageSet$packageObs$1 extends Lambda implements Function1<Tabs, Observable<? extends ArrayList<Object>>> {
    public static final PostpaidPackageSetViewModel$getPackageSet$packageObs$1 INSTANCE = new PostpaidPackageSetViewModel$getPackageSet$packageObs$1();

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "group", "Lth/co/dtac/android/dtacone/model/postpaid/Group;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$packageObs$1$1 */
    /* loaded from: classes9.dex */
    public static final class C166831 extends Lambda implements Function1<Group, String> {
        public static final C166831 INSTANCE = new C166831();

        public C166831() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Group group) {
            return group.getGroupName();
        }
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u009b\u0001\u0010\u0004\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b\u0018\u00010\u00060\u0006 \u0003*J\u0012D\u0012B\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\b0\b\u0018\u00010\u00060\u0006\u0018\u00010\t0\u0005H\n¢\u0006\u0002\b\n"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "groups", "", "Lrx/observables/GroupedObservable;", "", "Lth/co/dtac/android/dtacone/model/postpaid/Group;", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$packageObs$1$2 */
    /* loaded from: classes9.dex */
    public static final class C166842 extends Lambda implements Function1<List<GroupedObservable<String, Group>>, ArrayList<Object>> {
        public static final C166842 INSTANCE = new C166842();

        @Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/postpaid/PackageSet;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/postpaid/Group;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.PostpaidPackageSetViewModel$getPackageSet$packageObs$1$2$1 */
        /* loaded from: classes9.dex */
        public static final class C166851 extends Lambda implements Function1<Group, List<? extends PackageSet>> {
            public static final C166851 INSTANCE = new C166851();

            public C166851() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<PackageSet> invoke(Group group) {
                return group.getPackages();
            }
        }

        public C166842() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ArrayList<Object> invoke(List<GroupedObservable<String, Group>> list) {
            ArrayList<Object> arrayList = new ArrayList<>();
            for (GroupedObservable<String, Group> groupedObservable : list) {
                arrayList.add(groupedObservable.getKey());
                final C166851 c166851 = C166851.INSTANCE;
                arrayList.addAll((Collection) groupedObservable.map(new Func1() { // from class: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.c
                    @Override // p046rx.functions.Func1
                    public final Object call(Object obj) {
                        List invoke$lambda$0;
                        invoke$lambda$0 = PostpaidPackageSetViewModel$getPackageSet$packageObs$1.C166842.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                }).toBlocking().single());
            }
            return arrayList;
        }
    }

    public PostpaidPackageSetViewModel$getPackageSet$packageObs$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList invoke$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ArrayList) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends ArrayList<Object>> invoke(Tabs tabs) {
        Observable from = Observable.from(tabs.getGroup());
        final C166831 c166831 = C166831.INSTANCE;
        Observable list = from.groupBy(new Func1() { // from class: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.a
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                String invoke$lambda$0;
                invoke$lambda$0 = PostpaidPackageSetViewModel$getPackageSet$packageObs$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        }).toList();
        final C166842 c166842 = C166842.INSTANCE;
        return list.map(new Func1() { // from class: th.co.dtac.android.dtacone.viewmodel.postpaid_registration.b
            @Override // p046rx.functions.Func1
            public final Object call(Object obj) {
                ArrayList invoke$lambda$1;
                invoke$lambda$1 = PostpaidPackageSetViewModel$getPackageSet$packageObs$1.invoke$lambda$1(Function1.this, obj);
                return invoke$lambda$1;
            }
        });
    }
}