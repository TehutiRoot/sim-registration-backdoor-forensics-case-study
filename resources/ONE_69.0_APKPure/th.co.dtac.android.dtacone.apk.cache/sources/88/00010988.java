package p046rx.functions;

import p046rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.functions.Actions */
/* loaded from: classes5.dex */
public final class Actions {

    /* renamed from: a */
    public static final C13416m f77915a = new C13416m();

    /* renamed from: rx.functions.Actions$NotImplemented */
    /* loaded from: classes5.dex */
    public enum NotImplemented implements Action1<Throwable> {
        INSTANCE;

        @Override // p046rx.functions.Action1
        public void call(Throwable th2) {
            throw new OnErrorNotImplementedException(th2);
        }
    }

    /* renamed from: rx.functions.Actions$a */
    /* loaded from: classes5.dex */
    public static class C13404a implements Func9 {

        /* renamed from: a */
        public final /* synthetic */ Action9 f77916a;

        /* renamed from: b */
        public final /* synthetic */ Object f77917b;

        public C13404a(Action9 action9, Object obj) {
            this.f77916a = action9;
            this.f77917b = obj;
        }

        @Override // p046rx.functions.Func9
        public Object call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
            this.f77916a.call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
            return this.f77917b;
        }
    }

    /* renamed from: rx.functions.Actions$b */
    /* loaded from: classes5.dex */
    public static class C13405b implements FuncN {

        /* renamed from: a */
        public final /* synthetic */ ActionN f77918a;

        /* renamed from: b */
        public final /* synthetic */ Object f77919b;

        public C13405b(ActionN actionN, Object obj) {
            this.f77918a = actionN;
            this.f77919b = obj;
        }

        @Override // p046rx.functions.FuncN
        public Object call(Object... objArr) {
            this.f77918a.call(objArr);
            return this.f77919b;
        }
    }

    /* renamed from: rx.functions.Actions$c */
    /* loaded from: classes5.dex */
    public static class C13406c implements Func0 {

        /* renamed from: a */
        public final /* synthetic */ Action0 f77920a;

        /* renamed from: b */
        public final /* synthetic */ Object f77921b;

        public C13406c(Action0 action0, Object obj) {
            this.f77920a = action0;
            this.f77921b = obj;
        }

        @Override // p046rx.functions.Func0, java.util.concurrent.Callable
        public Object call() {
            this.f77920a.call();
            return this.f77921b;
        }
    }

    /* renamed from: rx.functions.Actions$d */
    /* loaded from: classes5.dex */
    public static class C13407d implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Action1 f77922a;

        /* renamed from: b */
        public final /* synthetic */ Object f77923b;

        public C13407d(Action1 action1, Object obj) {
            this.f77922a = action1;
            this.f77923b = obj;
        }

        @Override // p046rx.functions.Func1
        public Object call(Object obj) {
            this.f77922a.call(obj);
            return this.f77923b;
        }
    }

    /* renamed from: rx.functions.Actions$e */
    /* loaded from: classes5.dex */
    public static class C13408e implements Func2 {

        /* renamed from: a */
        public final /* synthetic */ Action2 f77924a;

        /* renamed from: b */
        public final /* synthetic */ Object f77925b;

        public C13408e(Action2 action2, Object obj) {
            this.f77924a = action2;
            this.f77925b = obj;
        }

        @Override // p046rx.functions.Func2
        public Object call(Object obj, Object obj2) {
            this.f77924a.call(obj, obj2);
            return this.f77925b;
        }
    }

    /* renamed from: rx.functions.Actions$f */
    /* loaded from: classes5.dex */
    public static class C13409f implements Func3 {

        /* renamed from: a */
        public final /* synthetic */ Action3 f77926a;

        /* renamed from: b */
        public final /* synthetic */ Object f77927b;

        public C13409f(Action3 action3, Object obj) {
            this.f77926a = action3;
            this.f77927b = obj;
        }

        @Override // p046rx.functions.Func3
        public Object call(Object obj, Object obj2, Object obj3) {
            this.f77926a.call(obj, obj2, obj3);
            return this.f77927b;
        }
    }

    /* renamed from: rx.functions.Actions$g */
    /* loaded from: classes5.dex */
    public static class C13410g implements Func4 {

        /* renamed from: a */
        public final /* synthetic */ Action4 f77928a;

        /* renamed from: b */
        public final /* synthetic */ Object f77929b;

        public C13410g(Action4 action4, Object obj) {
            this.f77928a = action4;
            this.f77929b = obj;
        }

        @Override // p046rx.functions.Func4
        public Object call(Object obj, Object obj2, Object obj3, Object obj4) {
            this.f77928a.call(obj, obj2, obj3, obj4);
            return this.f77929b;
        }
    }

    /* renamed from: rx.functions.Actions$h */
    /* loaded from: classes5.dex */
    public static class C13411h implements Func5 {

        /* renamed from: a */
        public final /* synthetic */ Action5 f77930a;

        /* renamed from: b */
        public final /* synthetic */ Object f77931b;

        public C13411h(Action5 action5, Object obj) {
            this.f77930a = action5;
            this.f77931b = obj;
        }

        @Override // p046rx.functions.Func5
        public Object call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            this.f77930a.call(obj, obj2, obj3, obj4, obj5);
            return this.f77931b;
        }
    }

    /* renamed from: rx.functions.Actions$i */
    /* loaded from: classes5.dex */
    public static class C13412i implements Func6 {

        /* renamed from: a */
        public final /* synthetic */ Action6 f77932a;

        /* renamed from: b */
        public final /* synthetic */ Object f77933b;

        public C13412i(Action6 action6, Object obj) {
            this.f77932a = action6;
            this.f77933b = obj;
        }

        @Override // p046rx.functions.Func6
        public Object call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            this.f77932a.call(obj, obj2, obj3, obj4, obj5, obj6);
            return this.f77933b;
        }
    }

    /* renamed from: rx.functions.Actions$j */
    /* loaded from: classes5.dex */
    public static class C13413j implements Func7 {

        /* renamed from: a */
        public final /* synthetic */ Action7 f77934a;

        /* renamed from: b */
        public final /* synthetic */ Object f77935b;

        public C13413j(Action7 action7, Object obj) {
            this.f77934a = action7;
            this.f77935b = obj;
        }

        @Override // p046rx.functions.Func7
        public Object call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            this.f77934a.call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
            return this.f77935b;
        }
    }

    /* renamed from: rx.functions.Actions$k */
    /* loaded from: classes5.dex */
    public static class C13414k implements Func8 {

        /* renamed from: a */
        public final /* synthetic */ Action8 f77936a;

        /* renamed from: b */
        public final /* synthetic */ Object f77937b;

        public C13414k(Action8 action8, Object obj) {
            this.f77936a = action8;
            this.f77937b = obj;
        }

        @Override // p046rx.functions.Func8
        public Object call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            this.f77936a.call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
            return this.f77937b;
        }
    }

    /* renamed from: rx.functions.Actions$l */
    /* loaded from: classes5.dex */
    public static final class C13415l implements Action1 {

        /* renamed from: a */
        public final Action0 f77938a;

        public C13415l(Action0 action0) {
            this.f77938a = action0;
        }

        @Override // p046rx.functions.Action1
        public void call(Object obj) {
            this.f77938a.call();
        }
    }

    /* renamed from: rx.functions.Actions$m */
    /* loaded from: classes5.dex */
    public static final class C13416m implements Action0, Action1, Action2, Action3, Action4, Action5, Action6, Action7, Action8, Action9, ActionN {
        @Override // p046rx.functions.Action0
        public void call() {
        }

        @Override // p046rx.functions.Action1
        public void call(Object obj) {
        }

        @Override // p046rx.functions.Action2
        public void call(Object obj, Object obj2) {
        }

        @Override // p046rx.functions.Action3
        public void call(Object obj, Object obj2, Object obj3) {
        }

        @Override // p046rx.functions.Action4
        public void call(Object obj, Object obj2, Object obj3, Object obj4) {
        }

        @Override // p046rx.functions.Action5
        public void call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        }

        @Override // p046rx.functions.Action6
        public void call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        }

        @Override // p046rx.functions.Action7
        public void call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        }

        @Override // p046rx.functions.Action8
        public void call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        }

        @Override // p046rx.functions.Action9
        public void call(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        }

        @Override // p046rx.functions.ActionN
        public void call(Object... objArr) {
        }
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> C13416m empty() {
        return f77915a;
    }

    public static Action1<Throwable> errorNotImplemented() {
        return NotImplemented.INSTANCE;
    }

    public static <T> Action1<T> toAction1(Action0 action0) {
        return new C13415l(action0);
    }

    public static Func0<Void> toFunc(Action0 action0) {
        return toFunc(action0, (Object) null);
    }

    public static <T1> Func1<T1, Void> toFunc(Action1<T1> action1) {
        return toFunc(action1, (Object) null);
    }

    public static <T1, T2> Func2<T1, T2, Void> toFunc(Action2<T1, T2> action2) {
        return toFunc(action2, (Object) null);
    }

    public static <T1, T2, T3> Func3<T1, T2, T3, Void> toFunc(Action3<T1, T2, T3> action3) {
        return toFunc(action3, (Object) null);
    }

    public static <T1, T2, T3, T4> Func4<T1, T2, T3, T4, Void> toFunc(Action4<T1, T2, T3, T4> action4) {
        return toFunc(action4, (Object) null);
    }

    public static <T1, T2, T3, T4, T5> Func5<T1, T2, T3, T4, T5, Void> toFunc(Action5<T1, T2, T3, T4, T5> action5) {
        return toFunc(action5, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6> Func6<T1, T2, T3, T4, T5, T6, Void> toFunc(Action6<T1, T2, T3, T4, T5, T6> action6) {
        return toFunc(action6, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Func7<T1, T2, T3, T4, T5, T6, T7, Void> toFunc(Action7<T1, T2, T3, T4, T5, T6, T7> action7) {
        return toFunc(action7, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Func8<T1, T2, T3, T4, T5, T6, T7, T8, Void> toFunc(Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8) {
        return toFunc(action8, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Void> toFunc(Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9) {
        return toFunc(action9, (Object) null);
    }

    public static FuncN<Void> toFunc(ActionN actionN) {
        return toFunc(actionN, (Object) null);
    }

    public static <R> Func0<R> toFunc(Action0 action0, R r) {
        return new C13406c(action0, r);
    }

    public static <T1, R> Func1<T1, R> toFunc(Action1<T1> action1, R r) {
        return new C13407d(action1, r);
    }

    public static <T1, T2, R> Func2<T1, T2, R> toFunc(Action2<T1, T2> action2, R r) {
        return new C13408e(action2, r);
    }

    public static <T1, T2, T3, R> Func3<T1, T2, T3, R> toFunc(Action3<T1, T2, T3> action3, R r) {
        return new C13409f(action3, r);
    }

    public static <T1, T2, T3, T4, R> Func4<T1, T2, T3, T4, R> toFunc(Action4<T1, T2, T3, T4> action4, R r) {
        return new C13410g(action4, r);
    }

    public static <T1, T2, T3, T4, T5, R> Func5<T1, T2, T3, T4, T5, R> toFunc(Action5<T1, T2, T3, T4, T5> action5, R r) {
        return new C13411h(action5, r);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Func6<T1, T2, T3, T4, T5, T6, R> toFunc(Action6<T1, T2, T3, T4, T5, T6> action6, R r) {
        return new C13412i(action6, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Func7<T1, T2, T3, T4, T5, T6, T7, R> toFunc(Action7<T1, T2, T3, T4, T5, T6, T7> action7, R r) {
        return new C13413j(action7, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Func8<T1, T2, T3, T4, T5, T6, T7, T8, R> toFunc(Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8, R r) {
        return new C13414k(action8, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> toFunc(Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9, R r) {
        return new C13404a(action9, r);
    }

    public static <R> FuncN<R> toFunc(ActionN actionN, R r) {
        return new C13405b(actionN, r);
    }
}