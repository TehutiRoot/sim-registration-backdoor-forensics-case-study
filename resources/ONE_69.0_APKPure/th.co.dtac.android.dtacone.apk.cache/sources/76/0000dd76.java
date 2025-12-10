package kotlin.reflect.jvm.internal.impl.descriptors;

import androidx.core.p005os.EnvironmentCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Visibilities {
    @NotNull
    public static final Visibilities INSTANCE = new Visibilities();

    /* renamed from: a */
    public static final Map f68679a;

    /* renamed from: b */
    public static final Public f68680b;

    /* loaded from: classes6.dex */
    public static final class Inherited extends Visibility {
        @NotNull
        public static final Inherited INSTANCE = new Inherited();

        public Inherited() {
            super("inherited", false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Internal extends Visibility {
        @NotNull
        public static final Internal INSTANCE = new Internal();

        public Internal() {
            super("internal", false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class InvisibleFake extends Visibility {
        @NotNull
        public static final InvisibleFake INSTANCE = new InvisibleFake();

        public InvisibleFake() {
            super("invisible_fake", false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Local extends Visibility {
        @NotNull
        public static final Local INSTANCE = new Local();

        public Local() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Private extends Visibility {
        @NotNull
        public static final Private INSTANCE = new Private();

        public Private() {
            super("private", false);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PrivateToThis extends Visibility {
        @NotNull
        public static final PrivateToThis INSTANCE = new PrivateToThis();

        public PrivateToThis() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes6.dex */
    public static final class Protected extends Visibility {
        @NotNull
        public static final Protected INSTANCE = new Protected();

        public Protected() {
            super("protected", true);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Public extends Visibility {
        @NotNull
        public static final Public INSTANCE = new Public();

        public Public() {
            super("public", true);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Unknown extends Visibility {
        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        public Unknown() {
            super(EnvironmentCompat.MEDIA_UNKNOWN, false);
        }
    }

    static {
        Map createMapBuilder = AbstractC18946Zn0.createMapBuilder();
        createMapBuilder.put(PrivateToThis.INSTANCE, 0);
        createMapBuilder.put(Private.INSTANCE, 0);
        createMapBuilder.put(Internal.INSTANCE, 1);
        createMapBuilder.put(Protected.INSTANCE, 1);
        Public r1 = Public.INSTANCE;
        createMapBuilder.put(r1, 2);
        f68679a = AbstractC18946Zn0.build(createMapBuilder);
        f68680b = r1;
    }

    @Nullable
    public final Integer compareLocal$compiler_common(@NotNull Visibility first, @NotNull Visibility second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f68679a;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num != null && num2 != null && !Intrinsics.areEqual(num, num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public final boolean isPrivate(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (visibility != Private.INSTANCE && visibility != PrivateToThis.INSTANCE) {
            return false;
        }
        return true;
    }
}